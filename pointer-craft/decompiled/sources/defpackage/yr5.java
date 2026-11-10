package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class yr5 implements Runnable {
    public static final String e = iy2.v("WorkerWrapper");
    public List a;
    public az3 b;
    public zw2 c;
    public volatile boolean d;
    public ol4 f;
    public ArrayList h;
    public pp0 i;
    public Context j;
    public vw2 k;
    public sr5 m;
    public String o;
    public uh5 p;
    public ListenableWorker q;
    public WorkDatabase s;
    public String t;
    public rk4 u;
    public zl5 w;
    public rk4 z;

    public final void a() {
        String str = this.t;
        WorkDatabase workDatabase = this.s;
        workDatabase.r();
        try {
            n(str);
            this.p.c(str, ((ww2) this.c).g);
            workDatabase.s();
        } finally {
            workDatabase.c();
            j(false);
        }
    }

    public final ol4 g() {
        return this.f;
    }

    public final void j(boolean z) {
        ListenableWorker listenableWorker;
        this.s.r();
        try {
            uh5 uh5VarK = this.s.k();
            uh5VarK.getClass();
            ba4 ba4VarX = ba4.x("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uh5VarK.g;
            workDatabase_Impl.y();
            Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
            try {
                boolean z2 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                ba4VarX.a();
                if (!z2) {
                    tn3.g(this.j, RescheduleReceiver.class, false);
                }
                if (z) {
                    this.p.b(hr5.j, this.t);
                    this.p.w(this.t, -1L);
                }
                if (this.m != null && (listenableWorker = this.q) != null && listenableWorker.y()) {
                    az3 az3Var = this.b;
                    String str = this.t;
                    synchronized (az3Var.p) {
                        az3Var.w.remove(str);
                        az3Var.j();
                    }
                }
                this.s.s();
                this.s.c();
                this.f.a(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorG.close();
                ba4VarX.a();
                throw th;
            }
        } catch (Throwable th2) {
            this.s.c();
            throw th2;
        }
    }

    public final void l() {
        String str = this.t;
        uh5 uh5Var = this.p;
        WorkDatabase workDatabase = this.s;
        workDatabase.r();
        try {
            uh5Var.i(str, System.currentTimeMillis());
            uh5Var.b(hr5.j, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uh5Var.g;
            workDatabase_Impl.y();
            a15 a15Var = (a15) uh5Var.l;
            gy1 gy1VarG = a15Var.g();
            if (str == null) {
                gy1VarG.g(1);
            } else {
                gy1VarG.G(str, 1);
            }
            workDatabase_Impl.r();
            try {
                gy1VarG.y();
                workDatabase_Impl.s();
                workDatabase_Impl.c();
                a15Var.w(gy1VarG);
                uh5Var.w(str, -1L);
                workDatabase.s();
                workDatabase.c();
                j(false);
            } catch (Throwable th) {
                workDatabase_Impl.c();
                a15Var.w(gy1VarG);
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.c();
            j(false);
            throw th2;
        }
    }

    public final boolean m() throws IOException {
        if (!this.d) {
            return false;
        }
        iy2.r().g(e, xi3.t("Work interrupted for ", this.o), new Throwable[0]);
        hr5 hr5VarJ = this.p.j(this.t);
        if (hr5VarJ == null) {
            j(false);
            return true;
        }
        j(!hr5VarJ.g());
        return true;
    }

    public final void n(String str) {
        uh5 uh5Var = this.p;
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (uh5Var.j(str2) != hr5.w) {
                uh5Var.b(hr5.m, str2);
            }
            linkedList.addAll(this.u.o(str2));
        }
    }

    public final void r() {
        boolean zIsDone;
        this.d = true;
        m();
        vw2 vw2Var = this.k;
        if (vw2Var != null) {
            zIsDone = vw2Var.isDone();
            this.k.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.q;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.j();
            return;
        }
        iy2.r().g(e, "WorkSpec " + this.m + " is already done. Not interrupting.", new Throwable[0]);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        sr5 sr5Var;
        zl5 zl5Var;
        bd2 bd2Var;
        qz0 qz0VarG;
        boolean z;
        rk4 rk4Var = this.z;
        String str = this.t;
        ArrayList arrayListD = rk4Var.d(str);
        this.h = arrayListD;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(str);
        sb.append(", tags={ ");
        int size = arrayListD.size();
        int i = 0;
        boolean z2 = true;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            String str2 = (String) obj;
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.o = sb.toString();
        pp0 pp0Var = this.i;
        uh5 uh5Var = this.p;
        zl5 zl5Var2 = this.w;
        WorkDatabase workDatabase = this.s;
        if (m()) {
            return;
        }
        workDatabase.r();
        try {
            sr5 sr5VarA = uh5Var.a(str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uh5Var.g;
            this.m = sr5VarA;
            String str3 = e;
            if (sr5VarA == null) {
                iy2.r().y(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                j(false);
                workDatabase.s();
                workDatabase.c();
                return;
            }
            hr5 hr5Var = sr5VarA.y;
            hr5 hr5Var2 = hr5.j;
            if (hr5Var != hr5Var2) {
                t();
                workDatabase.s();
                iy2.r().g(str3, this.m.r + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                workDatabase.c();
                return;
            }
            if (sr5VarA.r()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                sr5Var = this.m;
                zl5Var = zl5Var2;
                if (sr5Var.c != 0) {
                    iy2.r().g(str3, "Delaying execution for " + this.m.r + " because it is being executed before schedule.", new Throwable[0]);
                    j(true);
                    workDatabase.s();
                    workDatabase.c();
                    return;
                }
            } else {
                sr5 sr5Var2 = this.m;
                if (sr5Var2.y == hr5Var2 && sr5Var2.m > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    sr5Var = this.m;
                    zl5Var = zl5Var2;
                    if (sr5Var.c != 0 && jCurrentTimeMillis2 < sr5Var.g()) {
                        iy2.r().g(str3, "Delaying execution for " + this.m.r + " because it is being executed before schedule.", new Throwable[0]);
                        j(true);
                        workDatabase.s();
                        workDatabase.c();
                        return;
                    }
                } else {
                    zl5Var = zl5Var2;
                }
            }
            workDatabase.s();
            workDatabase.c();
            if (this.m.r()) {
                qz0VarG = this.m.v;
            } else {
                f73 f73Var = pp0Var.n;
                String str4 = this.m.n;
                f73Var.getClass();
                String str5 = bd2.g;
                try {
                    bd2Var = (bd2) Class.forName(str4).newInstance();
                } catch (Exception e2) {
                    iy2.r().y(bd2.g, xi3.t("Trouble instantiating + ", str4), e2);
                    bd2Var = null;
                }
                if (bd2Var == null) {
                    iy2.r().y(str3, xi3.t("Could not create Input Merger ", this.m.n), new Throwable[0]);
                    a();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.m.v);
                ba4 ba4VarX = ba4.x("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                if (str == null) {
                    ba4VarX.g(1);
                } else {
                    ba4VarX.G(str, 1);
                }
                workDatabase_Impl.y();
                Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        arrayList2.add(qz0.g(cursorG.getBlob(0)));
                    }
                    cursorG.close();
                    ba4VarX.a();
                    arrayList.addAll(arrayList2);
                    qz0VarG = bd2Var.g(arrayList);
                } catch (Throwable th) {
                    cursorG.close();
                    ba4VarX.a();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ArrayList arrayList3 = this.h;
            int i2 = this.m.m;
            ExecutorService executorService = pp0Var.g;
            xr5 xr5Var = pp0Var.r;
            zl5 zl5Var3 = zl5Var;
            gr5 gr5Var = new gr5(workDatabase, this.b, zl5Var3);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.g = uuidFromString;
            workerParameters.y = qz0VarG;
            new HashSet(arrayList3);
            workerParameters.r = i2;
            workerParameters.n = executorService;
            workerParameters.v = zl5Var3;
            workerParameters.x = xr5Var;
            ListenableWorker listenableWorkerG = this.q;
            if (listenableWorkerG == null) {
                Context context = this.j;
                String str6 = this.m.r;
                xr5Var.getClass();
                listenableWorkerG = xr5.g(context, str6, workerParameters);
                this.q = listenableWorkerG;
            }
            if (listenableWorkerG == null) {
                iy2.r().y(str3, xi3.t("Could not create Worker ", this.m.r), new Throwable[0]);
                a();
                return;
            }
            if (listenableWorkerG.m) {
                iy2.r().y(str3, du4.i("Received an already-used Worker ", this.m.r, "; WorkerFactory should return new instances"), new Throwable[0]);
                a();
                return;
            }
            listenableWorkerG.m = true;
            workDatabase.r();
            try {
                if (uh5Var.j(str) == hr5Var2) {
                    uh5Var.b(hr5.t, str);
                    workDatabase_Impl.y();
                    a15 a15Var = (a15) uh5Var.x;
                    gy1 gy1VarG = a15Var.g();
                    if (str == null) {
                        z = true;
                        gy1VarG.g(1);
                    } else {
                        z = true;
                        gy1VarG.G(str, 1);
                    }
                    workDatabase_Impl.r();
                    try {
                        gy1VarG.y();
                        workDatabase_Impl.s();
                        workDatabase_Impl.c();
                        a15Var.w(gy1VarG);
                    } catch (Throwable th2) {
                        workDatabase_Impl.c();
                        a15Var.w(gy1VarG);
                        throw th2;
                    }
                } else {
                    z = false;
                }
                workDatabase.s();
                workDatabase.c();
                if (!z) {
                    t();
                    return;
                }
                if (m()) {
                    return;
                }
                ol4 ol4Var = new ol4();
                er5 er5Var = new er5(this.j, this.m, this.q, gr5Var, this.w);
                ((mc4) zl5Var3.r).execute(er5Var);
                boolean z3 = false;
                ol4 ol4Var2 = er5Var.j;
                ol4Var2.g(new ks0(this, ol4Var2, ol4Var, (byte) 8, z3), (mc4) zl5Var3.r);
                ol4Var.g(new ks0(this, ol4Var, this.o, (byte) 9, z3), (lk4) zl5Var3.g);
            } catch (Throwable th3) {
                workDatabase.c();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.c();
            throw th4;
        }
    }

    public final void t() throws IOException {
        uh5 uh5Var = this.p;
        String str = this.t;
        hr5 hr5VarJ = uh5Var.j(str);
        hr5 hr5Var = hr5.t;
        String str2 = e;
        if (hr5VarJ == hr5Var) {
            iy2.r().g(str2, du4.i("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            j(true);
            return;
        }
        iy2.r().g(str2, "Status for " + str + " is " + hr5VarJ + "; not doing any work", new Throwable[0]);
        j(false);
    }

    public final void v() {
        List list = this.a;
        String str = this.t;
        WorkDatabase workDatabase = this.s;
        if (!m()) {
            workDatabase.r();
            try {
                hr5 hr5VarJ = this.p.j(str);
                zl5 zl5VarF = workDatabase.f();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) zl5VarF.g;
                workDatabase_Impl.y();
                a15 a15Var = (a15) zl5VarF.y;
                gy1 gy1VarG = a15Var.g();
                if (str == null) {
                    gy1VarG.g(1);
                } else {
                    gy1VarG.G(str, 1);
                }
                workDatabase_Impl.r();
                try {
                    gy1VarG.y();
                    workDatabase_Impl.s();
                    workDatabase_Impl.c();
                    a15Var.w(gy1VarG);
                    if (hr5VarJ == null) {
                        j(false);
                    } else if (hr5VarJ == hr5.t) {
                        y(this.c);
                    } else if (!hr5VarJ.g()) {
                        x();
                    }
                    workDatabase.s();
                    workDatabase.c();
                } catch (Throwable th) {
                    workDatabase_Impl.c();
                    a15Var.w(gy1VarG);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.c();
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((he4) it.next()).y(str);
            }
            je4.g(this.i, workDatabase, list);
        }
    }

    public final void x() {
        String str = this.t;
        uh5 uh5Var = this.p;
        WorkDatabase workDatabase = this.s;
        workDatabase.r();
        try {
            uh5Var.b(hr5.j, str);
            uh5Var.i(str, System.currentTimeMillis());
            uh5Var.w(str, -1L);
            workDatabase.s();
        } finally {
            workDatabase.c();
            j(true);
        }
    }

    public final void y(zw2 zw2Var) {
        boolean z = zw2Var instanceof yw2;
        String str = e;
        if (!z) {
            if (zw2Var instanceof xw2) {
                iy2.r().n(str, xi3.t("Worker result RETRY for ", this.o), new Throwable[0]);
                x();
                return;
            }
            iy2.r().n(str, xi3.t("Worker result FAILURE for ", this.o), new Throwable[0]);
            if (this.m.r()) {
                l();
                return;
            } else {
                a();
                return;
            }
        }
        iy2.r().n(str, xi3.t("Worker result SUCCESS for ", this.o), new Throwable[0]);
        if (this.m.r()) {
            l();
            return;
        }
        rk4 rk4Var = this.u;
        String str2 = this.t;
        uh5 uh5Var = this.p;
        WorkDatabase workDatabase = this.s;
        workDatabase.r();
        try {
            uh5Var.b(hr5.a, str2);
            uh5Var.c(str2, ((yw2) this.c).g);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListO = rk4Var.o(str2);
            int size = arrayListO.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListO.get(i);
                i++;
                String str3 = (String) obj;
                if (uh5Var.j(str3) == hr5.q) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rk4Var.t;
                    ba4 ba4VarX = ba4.x("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        ba4VarX.g(1);
                    } else {
                        ba4VarX.G(str3, 1);
                    }
                    workDatabase_Impl.y();
                    Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
                    try {
                        boolean z2 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                        cursorG.close();
                        ba4VarX.a();
                        if (z2) {
                            iy2.r().n(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            uh5Var.b(hr5.j, str3);
                            uh5Var.i(str3, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorG.close();
                        ba4VarX.a();
                        throw th;
                    }
                }
            }
            workDatabase.s();
            workDatabase.c();
            j(false);
        } catch (Throwable th2) {
            workDatabase.c();
            j(false);
            throw th2;
        }
    }
}
