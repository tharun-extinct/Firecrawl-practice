package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uq2 {
    public ta1 a;
    public final hb3 g;
    public final ArrayList j;
    public final ArrayList l;
    public final ib3 n;
    public int r;
    public final ArrayList t;
    public final ArrayList v;
    public final ArrayList x;
    public bm y;

    public uq2() {
        long[] jArr = ee4.g;
        this.g = new hb3();
        ib3 ib3Var = fe4.g;
        this.n = new ib3();
        this.v = new ArrayList();
        this.x = new ArrayList();
        this.l = new ArrayList();
        this.j = new ArrayList();
        this.t = new ArrayList();
    }

    public static int l(int[] iArr, ms2 ms2Var, boolean z) {
        ms2Var.getClass();
        int iO = a11.o(ms2Var, z) + iArr[0];
        iArr[0] = iO;
        return Math.max(0, iO);
    }

    public static void y(ms2 ms2Var, int i, sq2 sq2Var, boolean z) {
        int i2 = 0;
        long jR = ms2Var.r(0);
        long jG = z ? je2.g(jR, 0, i, 1) : je2.g(jR, i, 0, 2);
        qq2[] qq2VarArr = sq2Var.g;
        int length = qq2VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            qq2 qq2Var = qq2VarArr[i2];
            int i4 = i3 + 1;
            if (qq2Var != null) {
                qq2Var.q = je2.n(jG, je2.r(ms2Var.r(i3), jR));
            }
            i2++;
            i3 = i4;
        }
    }

    public final long g() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            qq2 qq2Var = (qq2) arrayList.get(i);
            x32 x32Var = qq2Var.i;
            if (x32Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (qq2Var.q >> 32)) + ((int) (x32Var.h >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (qq2Var.q & 4294967295L)) + ((int) (x32Var.h & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void n() {
        hb3 hb3Var = this.g;
        if (hb3Var.a()) {
            Object[] objArr = hb3Var.r;
            long[] jArr = hb3Var.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (qq2 qq2Var : ((sq2) objArr[(i << 3) + i3]).g) {
                                    if (qq2Var != null) {
                                        qq2Var.r();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            hb3Var.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:254:0x00d3 A[EDGE_INSN: B:254:0x00d3->B:48:0x00d3 BREAK  A[LOOP:2: B:35:0x0091->B:46:0x00c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6 A[LOOP:2: B:35:0x0091->B:46:0x00c6, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [mu0] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [fx0] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r4v22, types: [qq2[]] */
    /* JADX WARN: Type inference failed for: r5v26, types: [qq2[]] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void r(int r49, int r50, int r51, java.util.ArrayList r52, defpackage.bm r53, defpackage.hs2 r54, boolean r55, boolean r56, boolean r57, int r58, int r59, defpackage.ox0 r60, defpackage.w32 r61) {
        /*
            Method dump skipped, instruction units count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq2.r(int, int, int, java.util.ArrayList, bm, hs2, boolean, boolean, boolean, int, int, ox0, w32):void");
    }

    public final void v(Object obj) {
        sq2 sq2Var = (sq2) this.g.q(obj);
        if (sq2Var != null) {
            for (qq2 qq2Var : sq2Var.g) {
                if (qq2Var != null) {
                    qq2Var.r();
                }
            }
        }
    }

    public final void x(ms2 ms2Var, boolean z) {
        Object objL = this.g.l(ms2Var.m);
        objL.getClass();
        qq2[] qq2VarArr = ((sq2) objL).g;
        int length = qq2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            qq2 qq2Var = qq2VarArr[i];
            int i3 = i2 + 1;
            if (qq2Var != null) {
                long jR = ms2Var.r(i2);
                long j = qq2Var.q;
                if (!je2.y(j, 9223372034707292159L) && !je2.y(j, jR)) {
                    long jR2 = je2.r(jR, j);
                    no1 no1Var = qq2Var.v;
                    if (no1Var != null) {
                        long jR3 = je2.r(((je2) qq2Var.p.getValue()).g, jR2);
                        qq2Var.n(jR3);
                        qq2Var.j.setValue(Boolean.TRUE);
                        qq2Var.l = z;
                        m50.T(qq2Var.g, null, new i(qq2Var, no1Var, jR3, null), 3);
                    }
                }
                qq2Var.q = jR;
            }
            i++;
            i2 = i3;
        }
    }
}
