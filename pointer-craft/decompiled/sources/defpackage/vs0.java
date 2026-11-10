package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class vs0 {
    public static final vs0 t;
    public boolean n;
    public boolean r;
    public boolean v;
    public boolean y;
    public int g = 1;
    public long x = -1;
    public long l = -1;
    public du0 j = new du0();

    static {
        du0 du0Var = new du0();
        vs0 vs0Var = new vs0();
        vs0Var.g = 1;
        vs0Var.x = -1L;
        vs0Var.l = -1L;
        new HashSet();
        vs0Var.y = false;
        vs0Var.r = false;
        vs0Var.g = 1;
        vs0Var.n = false;
        vs0Var.v = false;
        vs0Var.j = du0Var;
        vs0Var.x = -1L;
        vs0Var.l = -1L;
        t = vs0Var;
    }

    public final void a(du0 du0Var) {
        this.j = du0Var;
    }

    public final void b(long j) {
        this.x = j;
    }

    public final void c(boolean z) {
        this.r = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vs0.class != obj.getClass()) {
            return false;
        }
        vs0 vs0Var = (vs0) obj;
        if (this.y == vs0Var.y && this.r == vs0Var.r && this.n == vs0Var.n && this.v == vs0Var.v && this.x == vs0Var.x && this.l == vs0Var.l && this.g == vs0Var.g) {
            return this.j.equals(vs0Var.j);
        }
        return false;
    }

    public final du0 g() {
        return this.j;
    }

    public final int hashCode() {
        int iD = ((((((((du4.D(this.g) * 31) + (this.y ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;
        long j = this.x;
        int i = (iD + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.l;
        return this.j.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final void i(boolean z) {
        this.v = z;
    }

    public final boolean j() {
        return this.r;
    }

    public final boolean l() {
        return this.y;
    }

    public final void m(int i) {
        this.g = i;
    }

    public final long n() {
        return this.l;
    }

    public final void q(boolean z) {
        this.n = z;
    }

    public final long r() {
        return this.x;
    }

    public final void s(long j) {
        this.l = j;
    }

    public final boolean t() {
        return this.v;
    }

    public final boolean v() {
        return this.j.g.size() > 0;
    }

    public final void w(boolean z) {
        this.y = z;
    }

    public final boolean x() {
        return this.n;
    }

    public final int y() {
        return this.g;
    }
}
