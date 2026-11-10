package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xv1 implements Runnable {
    public static final String m = iy2.v("ForceStopRunnable");
    public static final long q = 315360000000L;
    public int a = 0;
    public final Context j;
    public final kr5 t;

    public xv1(Context context, kr5 kr5Var) {
        this.j = context.getApplicationContext();
        this.t = kr5Var;
    }

    public static void r(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = u70.y() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + q;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:99:0x0200  */
    public final void g() throws IOException {
        boolean z;
        String string;
        String str = e15.q;
        Context context = this.j;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListR = e15.r(context, jobScheduler);
        kr5 kr5Var = this.t;
        ro roVarH = kr5Var.r.h();
        roVarH.getClass();
        ba4 ba4VarX = ba4.x("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) roVarH.t;
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ba4VarX.a();
            HashSet hashSet = new HashSet(arrayListR != null ? arrayListR.size() : 0);
            if (arrayListR != null && !arrayListR.isEmpty()) {
                int size = arrayListR.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListR.get(i);
                    i++;
                    JobInfo jobInfo = (JobInfo) obj;
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = extras.getString("EXTRA_WORK_SPEC_ID");
                            } else {
                                string = null;
                            }
                        } catch (NullPointerException unused) {
                        }
                    } else {
                        string = null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        e15.g(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                if (!hashSet.contains((String) obj2)) {
                    iy2.r().g(e15.q, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = kr5Var.r;
                workDatabase.r();
                try {
                    uh5 uh5VarK = workDatabase.k();
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        uh5VarK.w((String) obj3, -1L);
                    }
                    workDatabase.s();
                    workDatabase.c();
                } catch (Throwable th) {
                    workDatabase.c();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = kr5Var.r;
            uh5 uh5VarK2 = workDatabase2.k();
            zl5 zl5VarF = workDatabase2.f();
            workDatabase2.r();
            try {
                ArrayList arrayListX = uh5VarK2.x();
                boolean zIsEmpty = arrayListX.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListX.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj4 = arrayListX.get(i4);
                        i4++;
                        sr5 sr5Var = (sr5) obj4;
                        uh5VarK2.b(hr5.j, sr5Var.g);
                        uh5VarK2.w(sr5Var.g, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) zl5VarF.g;
                workDatabase_Impl2.y();
                a15 a15Var = (a15) zl5VarF.r;
                gy1 gy1VarG = a15Var.g();
                workDatabase_Impl2.r();
                try {
                    gy1VarG.y();
                    workDatabase_Impl2.s();
                    workDatabase_Impl2.c();
                    a15Var.w(gy1VarG);
                    workDatabase2.s();
                    workDatabase2.c();
                    boolean z2 = !zIsEmpty || z;
                    Long lE = ((WorkDatabase) kr5Var.l.t).z().E("reschedule_needed");
                    String str2 = m;
                    if (lE != null && lE.longValue() == 1) {
                        iy2.r().g(str2, "Rescheduling Workers.", new Throwable[0]);
                        kr5Var.r();
                        y22 y22Var = kr5Var.l;
                        y22Var.getClass();
                        ((WorkDatabase) y22Var.t).z().J(new lw3());
                        return;
                    }
                    try {
                        int i5 = u70.y() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i5);
                        if (Build.VERSION.SDK_INT < 30) {
                            if (broadcast == null) {
                                r(context);
                                iy2.r().g(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                kr5Var.r();
                                return;
                            }
                            if (z2) {
                                iy2.r().g(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                                je4.g(kr5Var.y, kr5Var.r, kr5Var.v);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            for (int i6 = 0; i6 < historicalProcessExitReasons.size(); i6++) {
                                if (l61.n(historicalProcessExitReasons.get(i6)).getReason() == 10) {
                                    iy2.r().g(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    kr5Var.r();
                                    return;
                                }
                            }
                        }
                        if (z2) {
                            iy2.r().g(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            je4.g(kr5Var.y, kr5Var.r, kr5Var.v);
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        iy2.r().x(str2, "Ignoring exception", e);
                    } catch (SecurityException e2) {
                        e = e2;
                        iy2.r().x(str2, "Ignoring exception", e);
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.c();
                    a15Var.w(gy1VarG);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.c();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorG.close();
            ba4VarX.a();
            throw th4;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = m;
        kr5 kr5Var = this.t;
        try {
            if (!y()) {
                kr5Var.y();
                return;
            }
            while (true) {
                cr5.g(this.j);
                iy2.r().g(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    g();
                    kr5Var.y();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.a + 1;
                    this.a = i;
                    if (i >= 3) {
                        iy2.r().y(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        kr5Var.y.getClass();
                        throw illegalStateException;
                    }
                    long j = ((long) i) * 300;
                    iy2.r().g(str, "Retrying after " + j, e);
                    try {
                        Thread.sleep(((long) this.a) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            kr5Var.y();
            throw th;
        }
    }

    public final boolean y() {
        pp0 pp0Var = this.t.y;
        pp0Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = m;
        if (zIsEmpty) {
            iy2.r().g(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zG = zy3.g(this.j, pp0Var);
        iy2.r().g(str, "Is default app process = " + zG, new Throwable[0]);
        return zG;
    }
}
