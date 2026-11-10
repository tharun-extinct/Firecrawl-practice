package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kf1 implements vv3 {
    public final int a;
    public final e7 b;
    public final ho5 c;
    public final ho5 i;
    public final long j;
    public final f m;
    public final e7 p;
    public final d7 q;
    public final e7 s;
    public final j51 t;
    public final io5 u;
    public final d7 w;
    public final io5 z;

    public kf1(long j, j51 j51Var, f fVar) {
        int iV = j51Var.V(48.0f);
        this.j = j;
        this.t = j51Var;
        this.a = iV;
        this.m = fVar;
        int iV2 = j51Var.V(Float.intBitsToFloat((int) (j >> 32)));
        i00 i00Var = hi0.h;
        this.q = new d7(i00Var, i00Var, iV2);
        i00 i00Var2 = hi0.f;
        this.w = new d7(i00Var2, i00Var2, iV2);
        this.c = new ho5(x52.r);
        this.i = new ho5(x52.n);
        int iV3 = j51Var.V(Float.intBitsToFloat((int) (j & 4294967295L)));
        j00 j00Var = hi0.p;
        j00 j00Var2 = hi0.z;
        this.b = new e7(j00Var, j00Var2, iV3);
        this.s = new e7(j00Var2, j00Var, iV3);
        this.p = new e7(hi0.u, j00Var, iV3);
        this.u = new io5(j00Var, iV);
        this.z = new io5(j00Var2, iV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kf1) {
            kf1 kf1Var = (kf1) obj;
            return this.j == kf1Var.j && yf2.p(this.t, kf1Var.t) && this.a == kf1Var.a && this.m == kf1Var.m;
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + du4.r(this.a, (this.t.hashCode() + (Long.hashCode(this.j) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) xb1.g(this.j)) + ", density=" + this.t + ", verticalMargin=" + this.a + ", onPositionCalculated=" + this.m + ')';
    }

    @Override // defpackage.vv3
    public final long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        ne2 ne2Var2;
        long j3;
        char c;
        int iG;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listD = pw5.d(this.q, this.w, ((int) (ne2Var.g() >> 32)) < i3 / 2 ? this.c : this.i);
        int size = listD.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                ne2Var2 = ne2Var;
                j3 = j;
                c = c2;
                iG = 0;
                break;
            }
            c53 c53Var = (c53) listD.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            ne2Var2 = ne2Var;
            iG = c53Var.g(ne2Var2, j3, i5, fl2Var);
            if (i7 == listD.size() - 1 || (iG >= 0 && i5 + iG <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listD2 = pw5.d(this.b, this.s, this.p, ((int) (ne2Var2.g() & 4294967295L)) < i8 / 2 ? this.u : this.z);
        int size2 = listD2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iG2 = ((d53) listD2.get(i9)).g(ne2Var2, j3, i10);
            if (i9 == listD2.size() - 1 || (iG2 >= (i2 = this.a) && i10 + iG2 <= i8 - i2)) {
                i = iG2;
                long j4 = (((long) iG) << c) | (((long) i) & 4294967295L);
                this.m.l(ne2Var2, c93.q(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iG) << c) | (((long) i) & 4294967295L);
        this.m.l(ne2Var2, c93.q(j5, j2));
        return j5;
    }
}
