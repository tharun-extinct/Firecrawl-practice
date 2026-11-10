package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qf6 {
    public static ha2 g;

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int g(vh4 vh4Var, int i) {
        int i2;
        int[] iArr = vh4Var.w;
        int i3 = i + 1;
        int length = vh4Var.q.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final k44 y(bl2 bl2Var) {
        k44 k44VarE = m50.E(bl2Var, true);
        long j = bl2Var.j(k44VarE.n());
        float f = k44VarE.r;
        float f2 = k44VarE.n;
        long j2 = bl2Var.j((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new k44(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }
}
