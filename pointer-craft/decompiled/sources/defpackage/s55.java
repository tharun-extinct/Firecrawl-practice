package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s55 {
    public static final ji l = js2.i(new vq0((byte) 26), new vy3(25));
    public final pp3 g;
    public final tp3 x;
    public final pp3 y = new pp3(0.0f);
    public final qp3 r = new qp3(0);
    public k44 n = k44.v;
    public long v = u75.y;

    public s55(um3 um3Var, float f) {
        this.g = new pp3(f);
        this.x = new tp3(um3Var, f73.w);
    }

    public final void g(um3 um3Var, k44 k44Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.y.e(f2);
        float f3 = k44Var.g;
        float f4 = k44Var.y;
        k44 k44Var2 = this.n;
        float f5 = k44Var2.g;
        pp3 pp3Var = this.g;
        if (f3 != f5 || f4 != k44Var2.y) {
            boolean z = um3Var == um3.j;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? k44Var.n : k44Var.r;
            float fD = pp3Var.d();
            float f7 = i;
            float f8 = fD + f7;
            if (f6 <= f8 && (f3 >= fD || f6 - f3 <= f7)) {
                f = (f3 >= fD || f6 - f3 > f7) ? 0.0f : f3 - fD;
            } else {
                f = f6 - f8;
            }
            pp3Var.e(pp3Var.d() + f);
            this.n = k44Var;
        }
        pp3Var.e(xs2.q(pp3Var.d(), 0.0f, f2));
        this.r.e(i);
    }
}
