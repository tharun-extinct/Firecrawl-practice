package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class uc implements xt3 {
    public gt2 g;
    public co4 n;
    public nt2 r;
    public iv4 y;

    public final void a(qc qcVar) {
        gt2 gt2Var = this.g;
        if (gt2Var == null) {
            return;
        }
        iv4 iv4Var = null;
        this.y = gt2Var.h ? m50.T(gt2Var.E0(), null, new s12(gt2Var, new s3((Object) qcVar, (Object) this, (Object) gt2Var, (mu0) iv4Var, (byte) 1), iv4Var, (byte) 7), 1) : null;
    }

    @Override // defpackage.xt3
    public final void g(k65 k65Var, ma2 ma2Var, q2 q2Var, kw0 kw0Var) {
        a(new qc(k65Var, this, ma2Var, q2Var, kw0Var, (byte) 0));
    }

    @Override // defpackage.xt3
    public final void j(k44 k44Var) {
        Rect rect;
        nt2 nt2Var = this.r;
        if (nt2Var != null) {
            nt2Var.q = new Rect(k33.Z(k44Var.g), k33.Z(k44Var.y), k33.Z(k44Var.r), k33.Z(k44Var.n));
            if (!nt2Var.a.isEmpty() || (rect = nt2Var.q) == null) {
                return;
            }
            nt2Var.g.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.xt3
    public final void l() {
        iv4 iv4Var = this.y;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.y = null;
        mb3 mb3VarT = t();
        if (mb3VarT != null) {
            co4 co4Var = (co4) mb3VarT;
            synchronized (co4Var) {
                co4Var.o(co4Var.b() + ((long) co4Var.p), co4Var.s, co4Var.b() + ((long) co4Var.p), co4Var.b() + ((long) co4Var.p) + ((long) co4Var.u));
            }
        }
    }

    public final void m(gt2 gt2Var) {
        gt2 gt2Var2 = this.g;
        if (gt2Var2 != gt2Var) {
            pc2.r("Expected textInputModifierNode to be " + gt2Var + " but was " + gt2Var2);
        }
        this.g = null;
    }

    @Override // defpackage.xt3
    public final void n() {
        yt4 yt4Var;
        gt2 gt2Var = this.g;
        if (gt2Var == null || (yt4Var = (yt4) v70.b(gt2Var, hp0.s)) == null) {
            return;
        }
        ((z41) yt4Var).y();
    }

    @Override // defpackage.xt3
    public final void r(k65 k65Var, k65 k65Var2) {
        nt2 nt2Var = this.r;
        if (nt2Var != null) {
            boolean z = (u75.y(nt2Var.j.y, k65Var2.y) && yf2.p(nt2Var.j.r, k65Var2.r)) ? false : true;
            nt2Var.j = k65Var2;
            int size = nt2Var.a.size();
            for (int i = 0; i < size; i++) {
                h44 h44Var = (h44) ((WeakReference) nt2Var.a.get(i)).get();
                if (h44Var != null) {
                    h44Var.l = k65Var2;
                }
            }
            ht2 ht2Var = nt2Var.w;
            synchronized (ht2Var.r) {
                ht2Var.a = null;
                ht2Var.q = null;
                ht2Var.m = null;
                ht2Var.w = null;
                ht2Var.c = null;
            }
            if (yf2.p(k65Var, k65Var2)) {
                if (z) {
                    cd2 cd2Var = nt2Var.y;
                    int iX = u75.x(k65Var2.y);
                    int iV = u75.v(k65Var2.y);
                    u75 u75Var = nt2Var.j.r;
                    int iX2 = u75Var != null ? u75.x(u75Var.g) : -1;
                    u75 u75Var2 = nt2Var.j.r;
                    cd2Var.i().updateSelection((View) cd2Var.t, iX, iV, iX2, u75Var2 != null ? u75.v(u75Var2.g) : -1);
                    return;
                }
                return;
            }
            if (k65Var != null && (!yf2.p(k65Var.g.t, k65Var2.g.t) || (u75.y(k65Var.y, k65Var2.y) && !yf2.p(k65Var.r, k65Var2.r)))) {
                cd2 cd2Var2 = nt2Var.y;
                cd2Var2.i().restartInput((View) cd2Var2.t);
                return;
            }
            int size2 = nt2Var.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                h44 h44Var2 = (h44) ((WeakReference) nt2Var.a.get(i2)).get();
                if (h44Var2 != null) {
                    k65 k65Var3 = nt2Var.j;
                    cd2 cd2Var3 = nt2Var.y;
                    if (h44Var2.m) {
                        h44Var2.l = k65Var3;
                        if (h44Var2.t) {
                            cd2Var3.i().updateExtractedText((View) cd2Var3.t, h44Var2.j, ne6.g(k65Var3));
                        }
                        u75 u75Var3 = k65Var3.r;
                        long j = k65Var3.y;
                        int iX3 = u75Var3 != null ? u75.x(u75Var3.g) : -1;
                        u75 u75Var4 = k65Var3.r;
                        cd2Var3.i().updateSelection((View) cd2Var3.t, u75.x(j), u75.v(j), iX3, u75Var4 != null ? u75.v(u75Var4.g) : -1);
                    }
                }
            }
        }
    }

    public final mb3 t() {
        co4 co4Var = this.n;
        if (co4Var != null) {
            return co4Var;
        }
        if (!gy4.g) {
            return null;
        }
        co4 co4VarX = v70.x(0, 2, f70.a);
        this.n = co4VarX;
        return co4VarX;
    }

    @Override // defpackage.xt3
    public final void v(k65 k65Var, aj3 aj3Var, j75 j75Var, ce ceVar, k44 k44Var, k44 k44Var2) {
        nt2 nt2Var = this.r;
        if (nt2Var != null) {
            ht2 ht2Var = nt2Var.w;
            synchronized (ht2Var.r) {
                try {
                    ht2Var.a = k65Var;
                    ht2Var.q = aj3Var;
                    ht2Var.m = j75Var;
                    ht2Var.w = k44Var;
                    ht2Var.c = k44Var2;
                    if (ht2Var.v || ht2Var.n) {
                        ht2Var.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.xt3
    public final void x() {
        yt4 yt4Var;
        gt2 gt2Var = this.g;
        if (gt2Var == null || (yt4Var = (yt4) v70.b(gt2Var, hp0.s)) == null) {
            return;
        }
        ((z41) yt4Var).g();
    }

    @Override // defpackage.xt3
    public final void y() {
        a(null);
    }
}
