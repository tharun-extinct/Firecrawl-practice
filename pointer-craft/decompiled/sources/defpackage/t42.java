package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class t42 extends hx0 implements k41 {
    public final Handler a;
    public final String m;
    public final boolean q;
    public final t42 w;

    public t42(Handler handler, String str, boolean z) {
        this.a = handler;
        this.m = str;
        this.q = z;
        this.w = z ? this : new t42(handler, str, true);
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        S(fx0Var, runnable);
    }

    @Override // defpackage.hx0
    public final boolean Q(fx0 fx0Var) {
        return (this.q && yf2.p(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    public final void S(fx0 fx0Var, Runnable runnable) {
        v70.a(fx0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        x21 x21Var = na1.g;
        c21.a.L(fx0Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t42)) {
            return false;
        }
        t42 t42Var = (t42) obj;
        return t42Var.a == this.a && t42Var.q == this.q;
    }

    public final int hashCode() {
        return (this.q ? 1231 : 1237) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.hx0
    public final String toString() {
        t42 t42Var;
        String str;
        x21 x21Var = na1.g;
        t42 t42Var2 = p03.g;
        if (this == t42Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                t42Var = t42Var2.w;
            } catch (UnsupportedOperationException unused) {
                t42Var = null;
            }
            str = this == t42Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.m;
        if (string == null) {
            string = this.a.toString();
        }
        if (!this.q) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // defpackage.k41
    public final ya1 u(long j, final Runnable runnable, fx0 fx0Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new ya1() { // from class: s42
                @Override // defpackage.ya1
                public final void g() {
                    this.j.a.removeCallbacks(runnable);
                }
            };
        }
        S(fx0Var, runnable);
        return nh3.j;
    }

    @Override // defpackage.k41
    public final void w(long j, ib0 ib0Var) {
        nl0 nl0Var = new nl0(ib0Var, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(nl0Var, j)) {
            ib0Var.k(new xf(this, nl0Var, (byte) 6));
        } else {
            S(ib0Var.q, nl0Var);
        }
    }

    public t42(Handler handler) {
        this(handler, null, false);
    }
}
