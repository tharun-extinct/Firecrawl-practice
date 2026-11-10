package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class do3 implements jq2 {
    public final u21 g;

    public do3(u21 u21Var) {
        this.g = u21Var;
    }

    @Override // defpackage.jq2
    public final int g() {
        return this.g.w();
    }

    @Override // defpackage.jq2
    public final int n() {
        int i;
        u21 u21Var = this.g;
        if (u21Var.q().g.size() == 0) {
            return 0;
        }
        int iG = gc6.g(u21Var.q());
        int i2 = u21Var.q().y + u21Var.q().r;
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.jq2
    public final boolean r() {
        return !this.g.q().g.isEmpty();
    }

    @Override // defpackage.jq2
    public final int v() {
        return Math.max(0, this.g.v);
    }

    @Override // defpackage.jq2
    public final int y() {
        u21 u21Var = this.g;
        return Math.min(u21Var.w() - 1, ((w33) cj0.r0(u21Var.q().g)).g);
    }
}
