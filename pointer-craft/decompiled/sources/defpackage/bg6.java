package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bg6 {
    public static final void g(gu2 gu2Var, xy1 xy1Var, my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(-1868327245);
        int i2 = (h02Var.j(gu2Var) ? 4 : 2) | i | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = ((i2 & 112) == 32) | h02Var.j(gu2Var) | ((i2 & 896) == 256);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new q2(gu2Var, xy1Var, my1Var, b);
                h02Var.i0(objK);
            }
            k33.j(gu2Var, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) gu2Var, (Object) xy1Var, (Object) my1Var, i, (byte) 0);
        }
    }

    public static boolean n(br2 br2Var, float f, float f2) {
        if (br2Var instanceof ym3) {
            k44 k44Var = ((ym3) br2Var).n;
            if (k44Var.g <= f && f < k44Var.r && k44Var.y <= f2 && f2 < k44Var.n) {
                return true;
            }
        } else {
            if (!(br2Var instanceof zm3)) {
                if (br2Var instanceof xm3) {
                    return v(f, f2, ((xm3) br2Var).n);
                }
                up.y();
                return false;
            }
            ha4 ha4Var = ((zm3) br2Var).n;
            float f3 = ha4Var.r;
            float f4 = ha4Var.y;
            float f5 = ha4Var.n;
            float f6 = ha4Var.g;
            long j = ha4Var.x;
            long j2 = ha4Var.j;
            long j3 = ha4Var.l;
            long j4 = ha4Var.v;
            if (f >= f6 && f < f3 && f2 >= f4 && f2 < f5) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= f3 - f6) {
                    int i3 = (int) (j2 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + fIntBitsToFloat <= f3 - f6) {
                        int i5 = (int) (j4 & 4294967295L);
                        int i6 = (int) (j2 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f5 - f4) {
                            int i7 = (int) (j & 4294967295L);
                            int i8 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f5 - f4) {
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i) + f6;
                                float fIntBitsToFloat3 = Float.intBitsToFloat(i5) + f4;
                                float fIntBitsToFloat4 = f3 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat5 = Float.intBitsToFloat(i7) + f4;
                                float fIntBitsToFloat6 = f3 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat7 = f5 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat8 = f5 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat9 = Float.intBitsToFloat(i3) + f6;
                                if (f < fIntBitsToFloat2 && f2 < fIntBitsToFloat3) {
                                    return x(f, f2, fIntBitsToFloat2, fIntBitsToFloat3, ha4Var.v);
                                }
                                if (f < fIntBitsToFloat9 && f2 > fIntBitsToFloat8) {
                                    return x(f, f2, fIntBitsToFloat9, fIntBitsToFloat8, ha4Var.j);
                                }
                                if (f > fIntBitsToFloat4 && f2 < fIntBitsToFloat5) {
                                    return x(f, f2, fIntBitsToFloat4, fIntBitsToFloat5, ha4Var.x);
                                }
                                if (f <= fIntBitsToFloat6 || f2 <= fIntBitsToFloat7) {
                                    return true;
                                }
                                return x(f, f2, fIntBitsToFloat6, fIntBitsToFloat7, ha4Var.l);
                            }
                        }
                    }
                }
                ld ldVarG = nd.g();
                ld.r(ldVarG, ha4Var);
                return v(f, f2, ldVarG);
            }
        }
        return false;
    }

    public static final Object r(vu3 vu3Var, bz1 bz1Var, mu0 mu0Var) {
        Object objQ0 = ((g05) vu3Var).Q0(new vv1(mu0Var.v(), bz1Var, null, (byte) 0), mu0Var);
        return objQ0 == px0.j ? objQ0 : og5.g;
    }

    public static final boolean v(float f, float f2, ld ldVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        ld ldVarG = nd.g();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            nd.y("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = ldVarG.y;
        if (rectF == null) {
            rectF = new RectF();
            ldVarG.y = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = ldVarG.g;
        RectF rectF2 = ldVarG.y;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        ld ldVarG2 = nd.g();
        ldVarG2.x(ldVar, ldVarG, 1);
        boolean zIsEmpty = ldVarG2.g.isEmpty();
        ldVarG2.l();
        ldVarG.l();
        return !zIsEmpty;
    }

    public static final boolean x(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object y(defpackage.f05 r7, defpackage.ku3 r8, defpackage.ix r9) {
        /*
            boolean r0 = r9 instanceof defpackage.uv1
            if (r0 == 0) goto L13
            r0 = r9
            uv1 r0 = (defpackage.uv1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uv1 r0 = new uv1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.w
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            ku3 r7 = r0.q
            f05 r8 = r0.m
            defpackage.js2.o(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            r7 = 0
            return r7
        L34:
            defpackage.js2.o(r9)
            g05 r9 = r7.q
            ju3 r9 = r9.e
            java.util.List r9 = r9.g
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            qu3 r5 = (defpackage.qu3) r5
            boolean r5 = r5.n
            if (r5 == 0) goto L76
        L4e:
            r0.m = r7
            r0.q = r8
            r0.c = r3
            java.lang.Object r9 = r7.g(r8, r0)
            px0 r1 = defpackage.px0.j
            if (r9 != r1) goto L5d
            return r1
        L5d:
            ju3 r9 = (defpackage.ju3) r9
            java.util.List r9 = r9.g
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            qu3 r5 = (defpackage.qu3) r5
            boolean r5 = r5.n
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            og5 r7 = defpackage.og5.g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg6.y(f05, ku3, ix):java.lang.Object");
    }
}
