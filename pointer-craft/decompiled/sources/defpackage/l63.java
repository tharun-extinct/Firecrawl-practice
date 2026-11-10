package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class l63 extends d {
    public boolean p;
    public final tp3 s;

    public l63(Context context) {
        super(context, null);
        this.s = kq2.M(fn0.g);
    }

    @Override // defpackage.d
    public final void g(int i, h02 h02Var) {
        h02Var.Z(576708319);
        int i2 = (h02Var.j(this) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((bz1) this.s.getValue()).l(h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(this, i, (byte) 18);
        }
    }

    @Override // defpackage.d
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }
}
