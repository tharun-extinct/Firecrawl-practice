package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wr2 implements tr2 {
    public final z51 g;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ ss2 y;

    public wr2(ss2 ss2Var, boolean z) {
        this.y = ss2Var;
        this.r = z;
        this.g = pt4.y(new ur2(ss2Var, (byte) 0));
    }

    @Override // defpackage.tr2
    public final int g() {
        ss2 ss2Var = this.y;
        return (int) (ss2Var.a().b == um3.j ? ss2Var.a().t() & 4294967295L : ss2Var.a().t() >> 32);
    }

    @Override // defpackage.tr2
    public final int n() {
        ss2 ss2Var = this.y;
        return (-ss2Var.a().w) + ss2Var.a().s;
    }

    @Override // defpackage.tr2
    public final bj0 r() {
        boolean z = this.r;
        z51 z51Var = this.g;
        return z ? new bj0(((Number) z51Var.getValue()).intValue(), 1) : new bj0(1, ((Number) z51Var.getValue()).intValue());
    }

    @Override // defpackage.tr2
    public final float v() {
        ss2 ss2Var = this.y;
        int iJ = ss2Var.j();
        int iT = ss2Var.t();
        return ss2Var.r() ? (iJ * 500) + iT + 100.0f : (iJ * 500) + iT;
    }

    @Override // defpackage.tr2
    public final Object x(int i, d40 d40Var) {
        Object objQ = ss2.q(this.y, i, d40Var);
        return objQ == px0.j ? objQ : og5.g;
    }

    @Override // defpackage.tr2
    public final float y() {
        ss2 ss2Var = this.y;
        return (ss2Var.j() * 500) + ss2Var.t();
    }
}
