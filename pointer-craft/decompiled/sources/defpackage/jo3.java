package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo3 implements yq2 {
    public final u21 g;
    public final bm r;
    public final mq2 y;

    public jo3(u21 u21Var, io3 io3Var, bm bmVar) {
        this.g = u21Var;
        this.y = io3Var;
        this.r = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo3)) {
            return false;
        }
        return yf2.p(this.y, ((jo3) obj).y);
    }

    @Override // defpackage.yq2
    public final int g() {
        return this.y.j().g;
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // defpackage.yq2
    public final void n(int i, Object obj, h02 h02Var, int i2) {
        h02Var.Z(-1201380429);
        int i3 = (h02Var.n(i) ? 4 : 2) | i2 | (h02Var.j(obj) ? 32 : 16) | (h02Var.x(this) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            lr2.y(obj, i, this.g.d, ue5.m0(1142237095, new pn(this, i, (byte) 3), h02Var), h02Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk(this, i, obj, i2, (byte) 9);
        }
    }

    @Override // defpackage.yq2
    public final int v(Object obj) {
        return this.r.v(obj);
    }

    @Override // defpackage.yq2
    public final Object y(int i) {
        bm bmVar = this.r;
        Object[] objArr = (Object[]) bmVar.r;
        int i2 = i - bmVar.g;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.y.t(i) : obj;
    }
}
