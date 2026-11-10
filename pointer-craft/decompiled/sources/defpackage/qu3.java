package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qu3 {
    public final long a;
    public boolean b;
    public final long c;
    public final long g;
    public boolean i;
    public final boolean j;
    public final long l;
    public final float m;
    public final boolean n;
    public final long q;
    public final long r;
    public qu3 s;
    public final int t;
    public final float v;
    public final List w;
    public final long x;
    public final long y;

    public qu3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = z;
        this.v = f;
        this.x = j4;
        this.l = j5;
        this.j = z2;
        this.t = i;
        this.a = j6;
        this.m = f2;
        this.q = j7;
        this.c = 0L;
        this.i = z3;
        this.b = z3;
    }

    public static qu3 y(qu3 qu3Var, long j, long j2, ArrayList arrayList) {
        qu3 qu3Var2 = qu3Var;
        qu3 qu3Var3 = new qu3(qu3Var2.g, qu3Var2.y, j, qu3Var2.n, qu3Var2.v, qu3Var2.x, j2, qu3Var2.j, qu3Var2.t, arrayList, qu3Var2.a, qu3Var2.m, qu3Var2.q, qu3Var2.c);
        qu3 qu3Var4 = qu3Var2.s;
        if (qu3Var4 == null) {
            qu3Var4 = qu3Var2;
        }
        qu3Var3.s = qu3Var4;
        qu3 qu3Var5 = qu3Var2.s;
        if (qu3Var5 != null) {
            qu3Var2 = qu3Var5;
        }
        qu3Var3.s = qu3Var2;
        return qu3Var3;
    }

    public final int a() {
        return this.t;
    }

    public final void g() {
        qu3 qu3Var = this.s;
        if (qu3Var == null) {
            this.i = true;
            this.b = true;
        } else if (qu3Var != null) {
            qu3Var.g();
        }
    }

    public final long j() {
        return this.l;
    }

    public final float l() {
        return this.v;
    }

    public final long m() {
        return this.y;
    }

    public final long n() {
        return this.g;
    }

    public final boolean q() {
        qu3 qu3Var = this.s;
        if (qu3Var != null) {
            return qu3Var.q();
        }
        return this.i || this.b;
    }

    public final List r() {
        List list = this.w;
        return list == null ? pi1.j : list;
    }

    public final boolean t() {
        return this.j;
    }

    public final String toString() {
        return "PointerInputChange(id=" + zq2.D(this.g) + ", uptimeMillis=" + this.y + ", position=" + wi3.l(this.r) + ", pressed=" + this.n + ", pressure=" + this.v + ", previousUptimeMillis=" + this.x + ", previousPosition=" + wi3.l(this.l) + ", previousPressed=" + this.j + ", isConsumed=" + q() + ", type=" + bv3.r(this.t) + ", historical=" + r() + ", scrollDelta=" + wi3.l(this.a) + ", scaleFactor=" + this.m + ", panOffset=" + wi3.l(this.q) + ")";
    }

    public final long v() {
        return this.r;
    }

    public final boolean x() {
        return this.n;
    }

    public qu3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.w = list;
        this.c = j8;
    }

    public /* synthetic */ qu3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8, int i2) {
        this(j, j2, j3, z, f, j4, j5, z2, i, list, j6, f2, j7, j8);
    }

    public qu3(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }
}
