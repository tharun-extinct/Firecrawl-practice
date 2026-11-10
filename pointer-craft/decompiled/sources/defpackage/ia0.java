package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends i73 implements ti3, w70, wd1 {
    public boolean f;
    public xy1 k;
    public final ja0 o;

    public ia0(ja0 ja0Var, xy1 xy1Var) {
        this.o = ja0Var;
        this.k = xy1Var;
        ja0Var.j = this;
    }

    @Override // defpackage.o41
    public final void A0() {
        Q0();
    }

    @Override // defpackage.i73
    public final void K0() {
        Q0();
    }

    @Override // defpackage.ti3
    public final void N() {
        Q0();
    }

    public final void Q0() {
        this.f = false;
        this.o.t = null;
        c93.A(this);
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        boolean z = this.f;
        ja0 ja0Var = this.o;
        if (!z) {
            ja0Var.t = null;
            mq2.b(this, new rg((Object) this, (Object) ja0Var, (byte) 6));
            if (ja0Var.t == null) {
                mc2.r("DrawResult not defined, did you forget to call onDraw?");
                l0.x();
                return;
            }
            this.f = true;
        }
        q64 q64Var = ja0Var.t;
        q64Var.getClass();
        ((xy1) q64Var.t).a(wm2Var);
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        Q0();
    }

    @Override // defpackage.w70
    public final fl2 getLayoutDirection() {
        return k33.V(this).G;
    }

    @Override // defpackage.w70
    public final long n() {
        return y94.N(k33.T(this, 4).a);
    }

    @Override // defpackage.wd1
    public final void u0() {
        Q0();
    }

    @Override // defpackage.w70
    public final j51 y() {
        return k33.V(this).F;
    }

    @Override // defpackage.i73
    public final void J0() {
    }
}
