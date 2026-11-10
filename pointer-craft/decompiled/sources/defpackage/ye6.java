package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ye6 {
    public static final sj0 g = sj0.b;
    public static final float y = 0.38f;

    public static final long g(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : xs2.c(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[PHI: r4
  0x005c: PHI (r4v4 long) = (r4v3 long), (r4v5 long), (r4v5 long), (r4v5 long), (r4v5 long), (r4v3 long) binds: [B:31:0x006c, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a, B:24:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long l(long j, pf1 pf1Var) {
        long j2;
        TimeUnit timeUnit = pf1Var.j;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            aj6 aj6Var = mf1.j;
            long j3 = jConvert2 << 1;
            int i = of1.g;
            return j3;
        }
        if (pf1Var.compareTo(pf1.MILLISECONDS) < 0) {
            return r(xs2.c(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = pf1Var.ordinal();
        long j4 = 0;
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else {
            if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    j2 = 86400000;
                } else {
                    l0.b(pf1Var, "Wrong unit for millisMultiplier: ");
                }
                jAbs = j4;
                return r(jAbs * jSignum);
            }
            j2 = 3600000;
        }
        if (jAbs == 0) {
            jAbs = j4;
        } else {
            j4 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j2 > 4611686018427387903L) {
                    jAbs = j4;
                } else {
                    jAbs = j2;
                }
            } else if (j2 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j2;
                } else if (iNumberOfLeadingZeros > 63) {
                    jAbs = j4;
                } else {
                    jAbs *= j2;
                    if (jAbs > 4611686018427387903L) {
                        jAbs = j4;
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
                jAbs = j4;
            }
        }
        return r(jAbs * jSignum);
    }

    public static sj0 n() {
        return g;
    }

    public static final long r(long j) {
        long j2 = (j << 1) + 1;
        mf1.j.getClass();
        int i = of1.g;
        return j2;
    }

    public static float v() {
        return y;
    }

    public static final long x(int i) {
        pf1 pf1Var = pf1.SECONDS;
        if (pf1Var.compareTo(pf1Var) > 0) {
            return l(i, pf1Var);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.SECONDS);
        aj6 aj6Var = mf1.j;
        long j = jConvert << 1;
        int i2 = of1.g;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object y(defpackage.f05 r6, defpackage.ix r7) {
        /*
            boolean r0 = r7 instanceof defpackage.d94
            if (r0 == 0) goto L13
            r0 = r7
            d94 r0 = (defpackage.d94) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            d94 r0 = new d94
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.q
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            f05 r6 = r0.m
            defpackage.js2.o(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.js2.o(r7)
        L31:
            r0.m = r6
            r0.w = r2
            ku3 r7 = defpackage.ku3.t
            java.lang.Object r7 = r6.g(r7, r0)
            px0 r1 = defpackage.px0.j
            if (r7 != r1) goto L40
            return r1
        L40:
            ju3 r7 = (defpackage.ju3) r7
            int r1 = r7.n
            java.util.List r7 = r7.g
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            qu3 r5 = (defpackage.qu3) r5
            boolean r5 = defpackage.fd6.g(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye6.y(f05, ix):java.lang.Object");
    }
}
