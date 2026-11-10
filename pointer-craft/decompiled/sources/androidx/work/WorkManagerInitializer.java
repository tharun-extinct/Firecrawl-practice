package androidx.work;

import android.content.Context;
import defpackage.ic2;
import defpackage.iy2;
import defpackage.kr5;
import defpackage.pp0;
import defpackage.tg1;
import defpackage.zl5;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements ic2 {
    public static final String g = iy2.v("WrkMgrInitializer");

    @Override // defpackage.ic2
    public final List g() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        iy2.r().g(g, "Initializing WorkManager with default configuration.", new Throwable[0]);
        pp0 pp0Var = new pp0(new tg1((byte) 10));
        synchronized (kr5.q) {
            try {
                kr5 kr5Var = kr5.a;
                if (kr5Var != null && kr5.m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kr5Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    kr5 kr5Var2 = kr5.m;
                    if (kr5Var2 == null) {
                        kr5Var2 = new kr5(applicationContext, pp0Var, new zl5(pp0Var.y));
                        kr5.m = kr5Var2;
                    }
                    kr5.a = kr5Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kr5.g(context);
    }
}
