package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w33 {
    public int a;
    public final int g;
    public final int j;
    public final boolean l = false;
    public int m;
    public final Object n;
    public final long r;
    public final int[] t;
    public final j00 v;
    public final fl2 x;
    public final List y;

    public w33(int i, int i2, List list, long j, Object obj, j00 j00Var, fl2 fl2Var) {
        this.g = i;
        this.y = list;
        this.r = j;
        this.n = obj;
        this.v = j00Var;
        this.x = fl2Var;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            us3 us3Var = (us3) list.get(i3);
            iMax = Math.max(iMax, !this.l ? us3Var.t : us3Var.j);
        }
        this.j = iMax;
        this.t = new int[this.y.size() * 2];
        this.m = Integer.MIN_VALUE;
    }

    public final void g(int i) {
        this.a += i;
        int[] iArr = this.t;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.l;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void y(int i, int i2, int i3) {
        int i4;
        this.a = i;
        boolean z = this.l;
        this.m = z ? i3 : i2;
        List list = this.y;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            us3 us3Var = (us3) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.t;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.x != fl2.j ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - us3Var.j) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = us3Var.t;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                j00 j00Var = this.v;
                if (j00Var == null) {
                    pc2.y("null verticalAlignment");
                    l0.x();
                    return;
                } else {
                    iArr[i7] = j00Var.g(us3Var.t, i3);
                    i4 = us3Var.j;
                }
            }
            i += i4;
        }
    }
}
