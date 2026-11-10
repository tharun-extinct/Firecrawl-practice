package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e15 implements he4 {
    public static final String q = iy2.v("SystemJobScheduler");
    public final kr5 a;
    public final Context j;
    public final d15 m;
    public final JobScheduler t;

    public e15(Context context, kr5 kr5Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        d15 d15Var = new d15(context);
        this.j = context;
        this.a = kr5Var;
        this.t = jobScheduler;
        this.m = d15Var;
    }

    public static void g(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            iy2.r().y(q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList r(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            iy2.r().y(q, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // defpackage.he4
    public final void n(sr5... sr5VarArr) {
        int iK;
        kr5 kr5Var = this.a;
        WorkDatabase workDatabase = kr5Var.r;
        v92 v92Var = new v92((Object) workDatabase, (byte) 0);
        for (sr5 sr5Var : sr5VarArr) {
            workDatabase.r();
            try {
                sr5 sr5VarA = workDatabase.k().a(sr5Var.g);
                String str = q;
                if (sr5VarA == null) {
                    iy2.r().x(str, "Skipping scheduling " + sr5Var.g + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.s();
                } else if (sr5VarA.y != hr5.j) {
                    iy2.r().x(str, "Skipping scheduling " + sr5Var.g + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.s();
                } else {
                    z05 z05VarH = workDatabase.h().H(sr5Var.g);
                    if (z05VarH != null) {
                        iK = z05VarH.y;
                    } else {
                        kr5Var.y.getClass();
                        iK = v92Var.K(kr5Var.y.l);
                    }
                    if (z05VarH == null) {
                        kr5Var.r.h().M(new z05(sr5Var.g, iK));
                    }
                    v(sr5Var, iK);
                    workDatabase.s();
                }
                workDatabase.c();
            } catch (Throwable th) {
                workDatabase.c();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(sr5 sr5Var, int i) {
        int i2;
        long j;
        JobScheduler jobScheduler = this.t;
        vs0 vs0Var = sr5Var.a;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", sr5Var.g);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", sr5Var.r());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.m.g).setRequiresCharging(vs0Var.l()).setRequiresDeviceIdle(vs0Var.j()).setExtras(persistableBundle);
        int iY = vs0Var.y();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || iY != 6) {
            int iD = du4.D(iY);
            if (iD == 0) {
                i2 = 0;
            } else if (iD == 1) {
                i2 = 1;
            } else if (iD != 2) {
                i2 = 3;
                if (iD != 3) {
                    i2 = 4;
                    if (iD != 4 || i3 < 26) {
                        iy2.r().g(d15.y, "API version too low. Cannot convert network type value ".concat(fj.o(iY)), new Throwable[0]);
                        i2 = 1;
                    }
                }
            } else {
                i2 = 2;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!vs0Var.j()) {
            extras.setBackoffCriteria(sr5Var.w, sr5Var.q == 2 ? 0 : 1);
        }
        long j2 = 0;
        long jMax = Math.max(sr5Var.g() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!sr5Var.s) {
            extras.setImportantWhileForeground(true);
        }
        if (vs0Var.v()) {
            for (cu0 cu0Var : vs0Var.g().g()) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cu0Var.g(), cu0Var.y() ? 1 : 0));
                j2 = j2;
            }
            j = j2;
            extras.setTriggerContentUpdateDelay(vs0Var.r());
            extras.setTriggerContentMaxDelay(vs0Var.n());
        } else {
            j = 0;
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(vs0Var.x());
            extras.setRequiresStorageNotLow(vs0Var.t());
        }
        Object[] objArr = sr5Var.m > 0;
        Object[] objArr2 = jMax > j;
        if (u70.y() && sr5Var.s && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        iy2 iy2VarR = iy2.r();
        String str = sr5Var.g;
        String str2 = q;
        iy2VarR.g(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                iy2.r().x(str2, "Unable to schedule work ID " + sr5Var.g, new Throwable[0]);
                if (sr5Var.s && sr5Var.p == 1) {
                    sr5Var.s = false;
                    iy2.r().g(str2, "Scheduling a non-expedited job (work ID " + sr5Var.g + ")", new Throwable[0]);
                    v(sr5Var, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListR = r(this.j, jobScheduler);
            int size = arrayListR != null ? arrayListR.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            kr5 kr5Var = this.a;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(kr5Var.r.k().l().size()), Integer.valueOf(kr5Var.y.j));
            iy2.r().y(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e);
        } catch (Throwable th) {
            iy2.r().y(str2, "Unable to schedule " + sr5Var, th);
        }
    }

    @Override // defpackage.he4
    public final boolean x() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // defpackage.he4
    public final void y(String str) {
        String string;
        Context context = this.j;
        JobScheduler jobScheduler = this.t;
        ArrayList arrayListR = r(context, jobScheduler);
        ArrayList arrayList = null;
        int i = 0;
        if (arrayListR != null) {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListR.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListR.get(i2);
                i2++;
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
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            g(jobScheduler, ((Integer) obj2).intValue());
        }
        this.a.r.h().T(str);
    }
}
