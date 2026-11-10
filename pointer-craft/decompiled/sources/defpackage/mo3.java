package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mo3 implements u33 {
    public final w33 a;
    public final boolean b;
    public final d52 c;
    public final List g;
    public final long h;
    public final u33 i;
    public final int j;
    public final int l;
    public final float m;
    public final int n;
    public final List p;
    public final int q;
    public final int r;
    public final List s;
    public final w33 t;
    public final ox0 u;
    public final um3 v;
    public final boolean w;
    public final int x;
    public final int y;
    public final j51 z;

    public mo3(List list, int i, int i2, int i3, um3 um3Var, int i4, int i5, int i6, w33 w33Var, w33 w33Var2, float f, int i7, boolean z, d52 d52Var, u33 u33Var, boolean z2, List list2, List list3, ox0 ox0Var, j51 j51Var, long j) {
        this.g = list;
        this.y = i;
        this.r = i2;
        this.n = i3;
        this.v = um3Var;
        this.x = i4;
        this.l = i5;
        this.j = i6;
        this.t = w33Var;
        this.a = w33Var2;
        this.m = f;
        this.q = i7;
        this.w = z;
        this.c = d52Var;
        this.i = u33Var;
        this.b = z2;
        this.s = list2;
        this.p = list3;
        this.u = ox0Var;
        this.z = j51Var;
        this.h = j;
    }

    @Override // defpackage.u33
    public final int g() {
        return this.i.g();
    }

    public final mo3 j(int i) {
        int i2;
        int i3 = this.y + this.r;
        if (this.b) {
            return null;
        }
        List list = this.g;
        if (list.isEmpty() || this.t == null || (i2 = this.q - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.m - (i3 != 0 ? i / i3 : 0.0f);
        if (this.a == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        w33 w33Var = (w33) cj0.j0(list);
        w33 w33Var2 = (w33) cj0.r0(list);
        int i4 = this.l;
        int i5 = this.x;
        if (i < 0) {
            if (Math.min((w33Var.a + i3) - i5, (w33Var2.a + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - w33Var.a, i4 - w33Var2.a) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w33) list.get(i6)).g(i);
        }
        List list2 = this.s;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((w33) list2.get(i7)).g(i);
        }
        List list3 = this.p;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((w33) list3.get(i8)).g(i);
        }
        return new mo3(this.g, this.y, this.r, this.n, this.v, this.x, this.l, this.j, this.t, this.a, f, i2, this.w || i > 0, this.c, this.i, this.b, this.s, this.p, this.u, this.z, this.h);
    }

    @Override // defpackage.u33
    public final xy1 l() {
        return this.i.l();
    }

    @Override // defpackage.u33
    public final void n() {
        this.i.n();
    }

    @Override // defpackage.u33
    public final Map r() {
        return this.i.r();
    }

    public final long t() {
        u33 u33Var = this.i;
        return (((long) u33Var.y()) << 32) | (((long) u33Var.g()) & 4294967295L);
    }

    @Override // defpackage.u33
    public final bz1 v() {
        return this.i.v();
    }

    @Override // defpackage.u33
    public final xy1 x() {
        return this.i.x();
    }

    @Override // defpackage.u33
    public final int y() {
        return this.i.y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mo3(int i, int i2, int i3, int i4, int i5, int i6, d52 d52Var, u33 u33Var, ox0 ox0Var, j51 j51Var, long j) {
        pi1 pi1Var = pi1.j;
        this(pi1Var, i, i2, i3, um3.t, i4, i5, i6, null, null, 0.0f, 0, false, d52Var, u33Var, false, pi1Var, pi1Var, ox0Var, j51Var, j);
    }
}
