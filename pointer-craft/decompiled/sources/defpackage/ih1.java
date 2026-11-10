package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ih1 implements ah1 {
    public j85 y;
    public String g = "";
    public int r = Integer.MAX_VALUE;
    public o22 n = m22.g;

    @Override // defpackage.ah1
    public final ah1 g() {
        ih1 ih1Var = new ih1();
        ih1Var.n = this.n;
        ih1Var.g = this.g;
        ih1Var.y = this.y;
        ih1Var.r = this.r;
        return ih1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.n = o22Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.g);
        sb.append(", style=");
        sb.append(this.y);
        sb.append(", modifier=");
        sb.append(this.n);
        sb.append(", maxLines=");
        return fj.x(sb, this.r, ')');
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.n;
    }
}
