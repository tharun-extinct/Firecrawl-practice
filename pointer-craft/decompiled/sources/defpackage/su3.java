package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class su3 {
    public final long a;
    public final long g;
    public final boolean j;
    public final int l;
    public final float m;
    public final long n;
    public final long q;
    public final long r;
    public final ArrayList t;
    public final boolean v;
    public final long w;
    public final float x;
    public final long y;

    public su3(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = j4;
        this.v = z;
        this.x = f;
        this.l = i;
        this.j = z2;
        this.t = arrayList;
        this.a = j5;
        this.m = f2;
        this.q = j6;
        this.w = j7;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su3)) {
            return false;
        }
        su3 su3Var = (su3) obj;
        return zq2.a(this.g, su3Var.g) && this.y == su3Var.y && wi3.y(this.r, su3Var.r) && wi3.y(this.n, su3Var.n) && this.v == su3Var.v && Float.compare(this.x, su3Var.x) == 0 && this.l == su3Var.l && this.j == su3Var.j && this.t.equals(su3Var.t) && wi3.y(this.a, su3Var.a) && Float.compare(this.m, su3Var.m) == 0 && wi3.y(this.q, su3Var.q) && wi3.y(this.w, su3Var.w);
    }

    public final boolean g() {
        return this.v;
    }

    public final int hashCode() {
        return Long.hashCode(this.w) + xi3.v(fj.y(this.m, xi3.v((this.t.hashCode() + xi3.l(du4.r(this.l, fj.y(this.x, xi3.l(xi3.v(xi3.v(xi3.v(Long.hashCode(this.g) * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31), 31), 31, this.j)) * 31, 31, this.a), 31), 31, this.q);
    }

    public final float j() {
        return this.x;
    }

    public final long l() {
        return this.r;
    }

    public final int m() {
        return this.l;
    }

    public final long n() {
        return this.w;
    }

    public final long q() {
        return this.y;
    }

    public final long r() {
        return this.g;
    }

    public final float t() {
        return this.m;
    }

    public final String toString() {
        String strD = zq2.D(this.g);
        String strL = wi3.l(this.r);
        String strL2 = wi3.l(this.n);
        String strR = bv3.r(this.l);
        String strL3 = wi3.l(this.a);
        String strL4 = wi3.l(this.q);
        String strL5 = wi3.l(this.w);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strD);
        sb.append(", uptime=");
        sb.append(this.y);
        du4.B(sb, ", positionOnScreen=", strL, ", position=", strL2);
        sb.append(", down=");
        sb.append(this.v);
        sb.append(", pressure=");
        sb.append(this.x);
        sb.append(", type=");
        sb.append(strR);
        sb.append(", activeHover=");
        sb.append(this.j);
        sb.append(", historical=");
        sb.append(this.t);
        sb.append(", scrollDelta=");
        sb.append(strL3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.m);
        sb.append(", panGestureOffset=");
        sb.append(strL4);
        sb.append(", originalEventPosition=");
        sb.append(strL5);
        sb.append(")");
        return sb.toString();
    }

    public final long v() {
        return this.q;
    }

    public final long x() {
        return this.n;
    }

    public final List y() {
        return this.t;
    }
}
