package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn0 extends bd3 {
    public xy1 a;
    public xy1 j;
    public final nm0 l;
    public xy1 m;
    public xy1 t;
    public final un0 x;

    public vn0(un0 un0Var, String str, nm0 nm0Var) {
        super(un0Var, str);
        this.x = un0Var;
        this.l = nm0Var;
    }

    @Override // defpackage.bd3
    public final ad3 g() {
        tn0 tn0Var = (tn0) super.g();
        tn0Var.c = this.j;
        tn0Var.i = this.t;
        tn0Var.b = this.a;
        tn0Var.s = this.m;
        return tn0Var;
    }

    @Override // defpackage.bd3
    public final ad3 y() {
        return new tn0(this.x, this.l);
    }
}
