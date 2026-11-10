package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw extends i73 implements wd1, ti3, ej4 {
    public cn4 A;
    public br2 B;
    public fl2 d;
    public br2 e;
    public cn4 f;
    public long k;
    public long o;

    @Override // defpackage.ti3
    public final void N() {
        this.k = 9205357640488583168L;
        this.d = null;
        this.e = null;
        this.A = null;
        c93.A(this);
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        wm2 wm2Var2;
        br2 br2Var;
        pb0 pb0Var = wm2Var.j;
        if (this.f != yf2.b) {
            wm2Var2 = wm2Var;
            if (cq4.g(pb0Var.n(), this.k) && wm2Var2.getLayoutDirection() == this.d && yf2.p(this.A, this.f)) {
                br2Var = this.e;
                br2Var.getClass();
            } else {
                mq2.b(this, new rg((Object) this, (Object) wm2Var2, (byte) 3));
                br2Var = this.B;
                this.B = null;
            }
            this.e = br2Var;
            this.k = pb0Var.n();
            this.d = wm2Var2.getLayoutDirection();
            this.A = this.f;
            br2Var.getClass();
            if (!tf5.g(this.o, jj0.j)) {
                jr2.b(wm2Var2, br2Var, this.o);
            }
        } else if (tf5.g(this.o, jj0.j)) {
            wm2Var2 = wm2Var;
        } else {
            wm2Var2 = wm2Var;
            xd1.B(wm2Var2, this.o, 0L, 0L, 0.0f, 126);
        }
        wm2Var2.g();
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        lj4.a(nj4Var, this.f);
    }

    @Override // defpackage.ej4
    public final boolean t() {
        return false;
    }
}
