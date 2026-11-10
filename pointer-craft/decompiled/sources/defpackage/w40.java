package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w40 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 2;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ long t;

    public /* synthetic */ w40(long j, float[] fArr, s54 s54Var, r54 r54Var) {
        this.t = j;
        this.a = fArr;
        this.m = s54Var;
        this.q = r54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        long j;
        og5 og5Var;
        int i;
        boolean z;
        float fG;
        float fG2;
        byte b = this.j;
        og5 og5Var2 = og5.g;
        Object obj2 = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                k44 k44Var = (k44) obj4;
                u54 u54Var = (u54) obj3;
                long j2 = this.t;
                m30 m30Var = (m30) obj2;
                wm2 wm2Var = (wm2) obj;
                wm2Var.g();
                float f = k44Var.g;
                float f2 = k44Var.y;
                pb0 pb0Var = wm2Var.j;
                ((y22) pb0Var.t.t).D(f, f2);
                try {
                    xd1.X(wm2Var, (nc) u54Var.j, j2, 0L, 0.0f, m30Var, 0, 890);
                    return og5Var2;
                } finally {
                    ((y22) pb0Var.t.t).D(-f, -f2);
                }
            case 1:
                rf4 rf4Var = (rf4) obj4;
                bw4 bw4Var = (bw4) obj2;
                wm2 wm2Var2 = (wm2) obj;
                wm2Var2.getClass();
                pb0 pb0Var2 = wm2Var2.j;
                wm2Var2.g();
                if (((Boolean) ((bw4) obj3).getValue()).booleanValue()) {
                    qp3 qp3Var = rf4Var.x;
                    qp3 qp3Var2 = rf4Var.g;
                    if (qp3Var.d() > 0) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (pb0Var2.n() & 4294967295L));
                        float fD = fIntBitsToFloat - qp3Var.d();
                        float f3 = (fD / fIntBitsToFloat) * fD;
                        float fE = wm2Var2.e(5.0f);
                        if (f3 < fE) {
                            f3 = fE;
                        }
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pb0Var2.n() >> 32)) - wm2Var2.e(4.0f))) << 32) | (((long) Float.floatToRawIntBits(((qp3Var2.d() / qp3Var.d()) * (fD - f3)) + qp3Var2.d())) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(wm2Var2.e(4.0f))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                        float fFloatValue = ((Number) bw4Var.getValue()).floatValue();
                        float fE2 = wm2Var2.e(2.0f);
                        xd1.G(wm2Var2, this.t, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fE2)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), null, fFloatValue, 208);
                    }
                }
                return og5Var2;
            default:
                float[] fArr = (float[]) obj4;
                s54 s54Var = (s54) obj3;
                r54 r54Var = (r54) obj2;
                hp3 hp3Var = (hp3) obj;
                int i2 = hp3Var.y;
                gd gdVar = hp3Var.g;
                int iV = hp3Var.r;
                long j3 = this.t;
                int iX = i2 > u75.x(j3) ? hp3Var.y : u75.x(j3);
                if (iV >= u75.v(j3)) {
                    iV = u75.v(j3);
                }
                long jY = sp2.y(hp3Var.n(iX), hp3Var.n(iV));
                int i3 = s54Var.j;
                h75 h75Var = gdVar.n;
                int iX2 = u75.x(jY);
                int iV2 = u75.v(jY);
                Layout layout = h75Var.x;
                int length = layout.getText().length();
                if (iX2 < 0) {
                    nc2.g("startOffset must be > 0");
                }
                if (iX2 >= length) {
                    nc2.g("startOffset must be less than text length");
                }
                if (iV2 <= iX2) {
                    nc2.g("endOffset must be greater than startOffset");
                }
                if (iV2 > length) {
                    nc2.g("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (iV2 - iX2) * 4) {
                    nc2.g("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iX3 = h75Var.x(iX2);
                int iX4 = h75Var.x(iV2 - 1);
                g72 g72Var = new g72(h75Var);
                if (iX3 <= iX4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iX3);
                        j = jY;
                        int iV3 = h75Var.v(iX3);
                        int iMax = Math.max(iX2, lineStart);
                        int iMin = Math.min(iV2, iV3);
                        float fJ = h75Var.j(iX3);
                        float fN = h75Var.n(iX3);
                        og5Var = og5Var2;
                        boolean z2 = layout.getParagraphDirection(iX3) == 1;
                        int i4 = i3;
                        int i5 = iMax;
                        while (i5 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i5);
                            if (!z2 || zIsRtlCharAt) {
                                i = iMin;
                                if (z2 && zIsRtlCharAt) {
                                    float fG3 = g72Var.g(i5, false, false, false);
                                    z = z2;
                                    fG = g72Var.g(i5 + 1, true, true, false);
                                    fG2 = fG3;
                                } else {
                                    z = z2;
                                    if (z || !zIsRtlCharAt) {
                                        fG = g72Var.g(i5, false, false, false);
                                        fG2 = g72Var.g(i5 + 1, true, true, false);
                                    } else {
                                        fG2 = g72Var.g(i5, false, false, true);
                                        fG = g72Var.g(i5 + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fG;
                                fArr[i4 + 1] = fJ;
                                fArr[i4 + 2] = fG2;
                                fArr[i4 + 3] = fN;
                                i4 += 4;
                                i5++;
                                iMin = i;
                                z2 = z;
                            } else {
                                i = iMin;
                                fG = g72Var.g(i5, false, false, true);
                                z = z2;
                                fG2 = g72Var.g(i5 + 1, true, true, true);
                            }
                            fArr[i4] = fG;
                            fArr[i4 + 1] = fJ;
                            fArr[i4 + 2] = fG2;
                            fArr[i4 + 3] = fN;
                            i4 += 4;
                            i5++;
                            iMin = i;
                            z2 = z;
                        }
                        if (iX3 != iX4) {
                            iX3++;
                            jY = j;
                            i3 = i4;
                            og5Var2 = og5Var;
                        }
                    }
                } else {
                    j = jY;
                    og5Var = og5Var2;
                }
                int iN = (u75.n(j) * 4) + s54Var.j;
                for (int i6 = s54Var.j; i6 < iN; i6 += 4) {
                    int i7 = i6 + 1;
                    float f4 = fArr[i7];
                    float f5 = r54Var.j;
                    fArr[i7] = f4 + f5;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f5;
                }
                s54Var.j = iN;
                r54Var.j += gdVar.x;
                return og5Var;
        }
    }

    public /* synthetic */ w40(k44 k44Var, u54 u54Var, long j, m30 m30Var) {
        this.a = k44Var;
        this.m = u54Var;
        this.t = j;
        this.q = m30Var;
    }

    public /* synthetic */ w40(rf4 rf4Var, long j, bw4 bw4Var, bw4 bw4Var2) {
        this.a = rf4Var;
        this.t = j;
        this.m = bw4Var;
        this.q = bw4Var2;
    }
}
