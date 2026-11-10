package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ur0 {
    public final uj0 g;
    public final float[] n;
    public final uj0 r;
    public final uj0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ur0(uj0 uj0Var, uj0 uj0Var2, int i) {
        uj0 uj0VarJ = m50.I(uj0Var.y, 12884901888L) ? v70.j(uj0Var) : uj0Var;
        uj0 uj0VarJ2 = m50.I(uj0Var2.y, 12884901888L) ? v70.j(uj0Var2) : uj0Var2;
        float[] fArrG = c93.z;
        float[] fArr = null;
        if (i == 3) {
            boolean zI = m50.I(uj0Var.y, 12884901888L);
            boolean zI2 = m50.I(uj0Var2.y, 12884901888L);
            if ((!zI || !zI2) && (zI || zI2)) {
                fn5 fn5Var = ((c94) (zI ? uj0Var : uj0Var2)).n;
                float[] fArrG2 = zI ? fn5Var.g() : fArrG;
                fArrG = zI2 ? fn5Var.g() : fArrG;
                fArr = new float[]{fArrG2[0] / fArrG[0], fArrG2[1] / fArrG[1], fArrG2[2] / fArrG[2]};
            }
        }
        this(uj0Var2, uj0VarJ, uj0VarJ2, fArr);
    }

    public long g(long j) {
        float fL = jj0.l(j);
        float fX = jj0.x(j);
        float fN = jj0.n(j);
        float fR = jj0.r(j);
        uj0 uj0Var = this.y;
        long jN = uj0Var.n(fL, fX, fN);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN & 4294967295L));
        float fV = uj0Var.v(fL, fX, fN);
        float[] fArr = this.n;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fV *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.r.x(f, f2, fV, fR, this.g);
    }

    public ur0(uj0 uj0Var, uj0 uj0Var2, uj0 uj0Var3, float[] fArr) {
        this.g = uj0Var;
        this.y = uj0Var2;
        this.r = uj0Var3;
        this.n = fArr;
    }
}
