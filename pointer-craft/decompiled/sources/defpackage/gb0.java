package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends lr2 {
    public boolean l;
    public final Typeface v;
    public final y22 x;

    public gb0(y22 y22Var, Typeface typeface) {
        this.v = typeface;
        this.x = y22Var;
    }

    @Override // defpackage.lr2
    public final void B(int i) {
        if (this.l) {
            return;
        }
        aj0 aj0Var = (aj0) this.x.t;
        if (aj0Var.q(this.v)) {
            aj0Var.a(false);
        }
    }

    @Override // defpackage.lr2
    public final void C(Typeface typeface, boolean z) {
        if (this.l) {
            return;
        }
        aj0 aj0Var = (aj0) this.x.t;
        if (aj0Var.q(typeface)) {
            aj0Var.a(false);
        }
    }
}
