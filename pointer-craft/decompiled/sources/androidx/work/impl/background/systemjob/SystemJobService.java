package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.az3;
import defpackage.iy2;
import defpackage.jx4;
import defpackage.kr5;
import defpackage.ks0;
import defpackage.l0;
import defpackage.ob5;
import defpackage.xi3;
import defpackage.zl1;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements zl1 {
    public static final String a = iy2.v("SystemJobService");
    public kr5 j;
    public final HashMap t = new HashMap();

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        JobParameters jobParameters;
        iy2.r().g(a, str + " executed on JobScheduler", new Throwable[0]);
        synchronized (this.t) {
            jobParameters = (JobParameters) this.t.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            kr5 kr5VarG = kr5.g(getApplicationContext());
            this.j = kr5VarG;
            kr5VarG.x.y(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                l0.z("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            } else {
                iy2.r().x(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        kr5 kr5Var = this.j;
        if (kr5Var != null) {
            kr5Var.x.v(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.j == null) {
            iy2.r().g(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            iy2.r().y(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.t) {
            try {
                if (this.t.containsKey(string)) {
                    iy2.r().g(a, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                iy2.r().g(a, "onStartJob for " + string, new Throwable[0]);
                this.t.put(string, jobParameters);
                ob5 ob5Var = new ob5();
                if (jobParameters.getTriggeredContentUris() != null) {
                    Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    jobParameters.getNetwork();
                }
                kr5 kr5Var = this.j;
                kr5Var.n.g(new ks0(kr5Var, string, ob5Var, (byte) 5));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.j == null) {
            iy2.r().g(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            iy2.r().y(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        iy2.r().g(a, xi3.t("onStopJob for ", string), new Throwable[0]);
        synchronized (this.t) {
            this.t.remove(string);
        }
        kr5 kr5Var = this.j;
        kr5Var.n.g(new jx4(kr5Var, string, false));
        az3 az3Var = this.j.x;
        synchronized (az3Var.p) {
            zContains = az3Var.b.contains(string);
        }
        return !zContains;
    }
}
