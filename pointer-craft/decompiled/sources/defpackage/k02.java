package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k02 {
    public final ArrayList g;
    public final ArrayList n;
    public int r;
    public final ha3 v;
    public final o05 x;
    public final int y;

    public k02(int i, ArrayList arrayList) {
        this.g = arrayList;
        this.y = i;
        if (i < 0) {
            aw3.g("Invalid start index");
        }
        this.n = new ArrayList();
        ha3 ha3Var = new ha3();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            mi2 mi2Var = (mi2) this.g.get(i3);
            int i4 = mi2Var.r;
            int i5 = mi2Var.n;
            ha3Var.t(i4, new k42(i3, i2, i5));
            i2 += i5;
        }
        this.v = ha3Var;
        this.x = new o05(new g31(this, (byte) 1));
    }

    public final boolean g(int i, int i2) {
        k42 k42Var;
        int i3;
        int i4;
        ha3 ha3Var = this.v;
        k42 k42Var2 = (k42) ha3Var.y(i);
        if (k42Var2 == null) {
            return false;
        }
        int i5 = k42Var2.y;
        int i6 = i2 - k42Var2.r;
        k42Var2.r = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = ha3Var.r;
        long[] jArr = ha3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (k42Var = (k42) objArr[(i7 << 3) + i9]).y) >= i5 && k42Var != k42Var2 && (i4 = i3 + i6) >= 0) {
                        k42Var.y = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
