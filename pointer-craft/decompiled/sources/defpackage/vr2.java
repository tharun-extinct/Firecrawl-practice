package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr2 implements tr2 {
    public final /* synthetic */ u21 g;
    public final /* synthetic */ boolean y;

    public vr2(u21 u21Var, boolean z) {
        this.g = u21Var;
        this.y = z;
    }

    @Override // defpackage.tr2
    public final int g() {
        u21 u21Var = this.g;
        return (int) (u21Var.q().v == um3.j ? u21Var.q().t() & 4294967295L : u21Var.q().t() >> 32);
    }

    @Override // defpackage.tr2
    public final int n() {
        u21 u21Var = this.g;
        return (-u21Var.q().x) + u21Var.q().n;
    }

    @Override // defpackage.tr2
    public final bj0 r() {
        boolean z = this.y;
        u21 u21Var = this.g;
        return z ? new bj0(u21Var.w(), 1) : new bj0(1, u21Var.w());
    }

    @Override // defpackage.tr2
    public final float v() {
        u21 u21Var = this.g;
        return zo3.g(u21Var.q(), u21Var.w());
    }

    @Override // defpackage.tr2
    public final Object x(int i, d40 d40Var) {
        u21 u21Var = this.g;
        Object objN = u21Var.n(ub3.j, new d40(u21Var, i, (mu0) null, (byte) 5), d40Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objN != px0Var) {
            objN = og5Var;
        }
        return objN == px0Var ? objN : og5Var;
    }

    @Override // defpackage.tr2
    public final float y() {
        return hc6.x(this.g);
    }
}
