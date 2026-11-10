package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tr0 extends ur0 {
    public final float[] l;
    public final c94 v;
    public final c94 x;

    public tr0(c94 c94Var, c94 c94Var2) {
        float[] fArrD;
        super(c94Var2, c94Var, c94Var2, null);
        this.v = c94Var;
        this.x = c94Var2;
        float[] fArr = (float[]) y22.m.t;
        fn5 fn5Var = c94Var.n;
        float[] fArr2 = c94Var.t;
        fn5 fn5Var2 = c94Var2.n;
        float[] fArr3 = c94Var2.a;
        if (v70.w(fn5Var, fn5Var2)) {
            fArrD = v70.D(fArr3, fArr2);
        } else {
            float[] fArrG = fn5Var.g();
            float[] fArrG2 = fn5Var2.g();
            fn5 fn5Var3 = c93.s;
            fArrD = v70.D(v70.w(fn5Var2, fn5Var3) ? fArr3 : v70.e(v70.D(v70.q(fArr, fArrG2, new float[]{0.964212f, 1.0f, 0.825188f}), c94Var2.t)), v70.w(fn5Var, fn5Var3) ? fArr2 : v70.D(v70.q(fArr, fArrG, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.l = fArrD;
    }

    @Override // defpackage.ur0
    public final long g(long j) {
        float fL = jj0.l(j);
        float fX = jj0.x(j);
        float fN = jj0.n(j);
        float fR = jj0.r(j);
        y84 y84Var = this.v.b;
        float fN2 = (float) y84Var.n(fL);
        float fN3 = (float) y84Var.n(fX);
        float fN4 = (float) y84Var.n(fN);
        float[] fArr = this.l;
        float f = (fArr[6] * fN4) + (fArr[3] * fN3) + (fArr[0] * fN2);
        float f2 = (fArr[7] * fN4) + (fArr[4] * fN3) + (fArr[1] * fN2);
        float f3 = (fArr[8] * fN4) + (fArr[5] * fN3) + (fArr[2] * fN2);
        c94 c94Var = this.x;
        y84 y84Var2 = c94Var.w;
        return ra.r((float) y84Var2.n(f), (float) y84Var2.n(f2), (float) y84Var2.n(f3), fR, c94Var);
    }
}
