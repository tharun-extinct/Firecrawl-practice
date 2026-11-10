package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ic2;
import defpackage.iy3;
import defpackage.ky3;
import defpackage.l0;
import defpackage.pi1;
import defpackage.ro;
import defpackage.vt2;
import defpackage.yt2;
import defpackage.zt2;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ic2 {
    @Override // defpackage.ic2
    public final List g() {
        return pi1.j;
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        context.getClass();
        ro roVarA = ro.A(context);
        roVarA.getClass();
        if (!((HashSet) roVarA.a).contains(ProcessLifecycleInitializer.class)) {
            l0.z("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!zt2.g.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new yt2());
        }
        ky3 ky3Var = ky3.b;
        ky3Var.getClass();
        ky3Var.q = new Handler();
        ky3Var.w.n(vt2.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new iy3(ky3Var));
        return ky3Var;
    }
}
