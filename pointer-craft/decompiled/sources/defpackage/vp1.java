package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements Comparable {
    public int j;
    public int t;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vp1 vp1Var = (vp1) obj;
        int i = this.t;
        int i2 = vp1Var.t;
        return i != i2 ? i - i2 : this.j - vp1Var.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.t);
        sb.append(", index=");
        return fj.x(sb, this.j, '}');
    }
}
