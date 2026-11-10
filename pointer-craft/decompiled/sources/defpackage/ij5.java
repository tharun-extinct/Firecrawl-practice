package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ij5 extends gj5 {
    public final int a;
    public final int b;
    public final float c;
    public final float h;
    public final float i;
    public final String j;
    public final z60 m;
    public final float p;
    public final float q;
    public final int s;
    public final List t;
    public final float u;
    public final z60 w;
    public final float z;

    public ij5(String str, List list, int i, z60 z60Var, float f, z60 z60Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.j = str;
        this.t = list;
        this.a = i;
        this.m = z60Var;
        this.q = f;
        this.w = z60Var2;
        this.c = f2;
        this.i = f3;
        this.b = i2;
        this.s = i3;
        this.p = f4;
        this.u = f5;
        this.z = f6;
        this.h = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij5.class != obj.getClass()) {
            return false;
        }
        ij5 ij5Var = (ij5) obj;
        return this.j.equals(ij5Var.j) && yf2.p(this.m, ij5Var.m) && this.q == ij5Var.q && yf2.p(this.w, ij5Var.w) && this.c == ij5Var.c && this.i == ij5Var.i && this.b == ij5Var.b && this.s == ij5Var.s && this.p == ij5Var.p && this.u == ij5Var.u && this.z == ij5Var.z && this.h == ij5Var.h && this.a == ij5Var.a && yf2.p(this.t, ij5Var.t);
    }

    public final int hashCode() {
        int iHashCode = (this.t.hashCode() + (this.j.hashCode() * 31)) * 31;
        z60 z60Var = this.m;
        int iY = fj.y(this.q, (iHashCode + (z60Var != null ? z60Var.hashCode() : 0)) * 31, 31);
        z60 z60Var2 = this.w;
        return Integer.hashCode(this.a) + fj.y(this.h, fj.y(this.z, fj.y(this.u, fj.y(this.p, du4.r(this.s, du4.r(this.b, fj.y(this.i, fj.y(this.c, (iY + (z60Var2 != null ? z60Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
