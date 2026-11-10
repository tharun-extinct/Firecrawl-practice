package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rm1 implements vv3 {
    public final hb a;
    public final e7 b;
    public final ho5 c;
    public final e7 i;
    public final int j;
    public final d7 m;
    public final io5 p;
    public final d7 q;
    public final io5 s;
    public final ob3 t;
    public final ho5 w;

    public rm1(j51 j51Var, int i, ob3 ob3Var, hb hbVar) {
        int iV = j51Var.V(48.0f);
        this.j = i;
        this.t = ob3Var;
        this.a = hbVar;
        i00 i00Var = hi0.h;
        this.m = new d7(i00Var, i00Var, 0);
        i00 i00Var2 = hi0.f;
        this.q = new d7(i00Var2, i00Var2, 0);
        this.w = new ho5(x52.r);
        this.c = new ho5(x52.n);
        j00 j00Var = hi0.p;
        j00 j00Var2 = hi0.z;
        this.i = new e7(j00Var, j00Var2, 0);
        this.b = new e7(j00Var2, j00Var, 0);
        this.s = new io5(j00Var, iV);
        this.p = new io5(j00Var2, iV);
    }

    @Override // defpackage.vv3
    public final long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        ne2 ne2Var2;
        char c;
        long j3;
        int iG;
        ob3 ob3Var = this.t;
        if (ob3Var != null) {
            ob3Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.j)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listD = pw5.d(this.m, this.q, ((int) (ne2Var.g() >> 32)) < i / 2 ? this.w : this.c);
        int size = listD.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                ne2Var2 = ne2Var;
                c = c2;
                j3 = j4;
                iG = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            ne2Var2 = ne2Var;
            List list = listD;
            iG = ((c53) listD.get(i3)).g(ne2Var2, j5, i4, fl2Var);
            if (i6 == list.size() - 1 || (iG >= 0 && i4 + iG <= i)) {
                break;
            }
            i3 = i6 + 1;
            listD = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listD2 = pw5.d(this.i, this.b, ((int) (ne2Var2.g() & j3)) < i7 / 2 ? this.s : this.p);
        int size2 = listD2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iG2 = ((d53) listD2.get(i8)).g(ne2Var2, j5, i9);
            if (i8 == listD2.size() - 1 || (iG2 >= 0 && i9 + iG2 <= i7)) {
                i2 = iG2;
                break;
            }
        }
        long j6 = (((long) iG) << c) | (((long) i2) & j3);
        this.a.l(ne2Var2, c93.q(j6, j2));
        return j6;
    }
}
