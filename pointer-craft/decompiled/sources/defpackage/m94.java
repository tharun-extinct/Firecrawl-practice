package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m94 implements hb2 {
    public final boolean g;
    public final long r;
    public final float y;

    public m94(boolean z, float f, long j) {
        this.g = z;
        this.y = f;
        this.r = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m94)) {
            return false;
        }
        m94 m94Var = (m94) obj;
        if (this.g != m94Var.g || !vb1.y(this.y, m94Var.y)) {
            return false;
        }
        long j = m94Var.r;
        int i = jj0.t;
        return tf5.g(this.r, j);
    }

    @Override // defpackage.hb2
    public final o41 g(ve2 ve2Var) {
        return new c51(ve2Var, this.g, this.y, new b51(this, (byte) 1));
    }

    @Override // defpackage.hb2
    public final int hashCode() {
        int iY = fj.y(this.y, Boolean.hashCode(this.g) * 31, 961);
        int i = jj0.t;
        return Long.hashCode(this.r) + iY;
    }
}
