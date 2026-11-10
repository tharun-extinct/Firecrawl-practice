package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements yq2 {
    public final ss2 g;
    public final bm n;
    public final bq2 r;
    public final es2 y;

    public fs2(ss2 ss2Var, es2 es2Var, bq2 bq2Var, bm bmVar) {
        this.g = ss2Var;
        this.y = es2Var;
        this.r = bq2Var;
        this.n = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs2)) {
            return false;
        }
        return yf2.p(this.y, ((fs2) obj).y);
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
        h02Var.Z(-462424778);
        byte b = 2;
        int i3 = (h02Var.n(i) ? 4 : 2) | i2 | (h02Var.j(obj) ? 32 : 16) | (h02Var.x(this) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            lr2.y(obj, i, this.g.u, ue5.m0(-824725566, new pn(this, i, b), h02Var), h02Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk(this, i, obj, i2, (byte) 7);
        }
    }

    @Override // defpackage.yq2
    public final Object r(int i) {
        of2 of2VarN = this.y.g.n(i);
        return of2VarN.r.g().a(Integer.valueOf(i - of2VarN.g));
    }

    @Override // defpackage.yq2
    public final int v(Object obj) {
        return this.n.v(obj);
    }

    @Override // defpackage.yq2
    public final Object y(int i) {
        bm bmVar = this.n;
        Object[] objArr = (Object[]) bmVar.r;
        int i2 = i - bmVar.g;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.y.t(i) : obj;
    }
}
