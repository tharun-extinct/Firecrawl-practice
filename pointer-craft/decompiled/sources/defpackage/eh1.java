package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 implements ah1 {
    public Float n;
    public u95 r;
    public he y;
    public o22 g = m22.g;
    public byte v = 1;

    @Override // defpackage.ah1
    public final ah1 g() {
        eh1 eh1Var = new eh1();
        eh1Var.g = this.g;
        eh1Var.y = this.y;
        eh1Var.r = this.r;
        eh1Var.n = this.n;
        eh1Var.v = this.v;
        return eh1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.g = o22Var;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.g + ", provider=" + this.y + ", colorFilterParams=" + this.r + ", alpha=" + this.n + ", contentScale=" + ((Object) xt0.g(this.v)) + ')';
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.g;
    }
}
