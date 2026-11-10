package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends zz4 implements bz1 {
    public final /* synthetic */ w10 c;
    public boolean q;
    public /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(w10 w10Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = w10Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        x00 x00Var = new x00(this.c, mu0Var);
        x00Var.w = ((Boolean) obj).booleanValue();
        return x00Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((x00) b((mu0) obj2, bool)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        boolean z = this.w;
        boolean z2 = this.q;
        if (!z2) {
            js2.o(obj);
            if (z) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                w10 w10Var = this.c;
                if (jElapsedRealtime - w10Var.u > 14400000) {
                    w10Var.u = SystemClock.elapsedRealtime();
                    this.w = z;
                    this.q = true;
                    Object objF = w10Var.f(this);
                    px0 px0Var = px0.j;
                    if (objF == px0Var) {
                        return px0Var;
                    }
                }
            }
        } else {
            if (!z2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }
}
