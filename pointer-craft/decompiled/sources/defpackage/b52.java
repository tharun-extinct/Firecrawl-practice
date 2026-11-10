package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b52 {
    public static final fa0 j;
    public static final fa0 l;
    public static final fa0 n;
    public static final fa0 t;
    public static final fa0 v;
    public static final fa0 x;
    public final fa0 g;
    public final int r;
    public final fa0 y;

    static {
        fa0 fa0Var = fa0.m;
        n = aj6.p(":");
        v = aj6.p(":status");
        x = aj6.p(":method");
        l = aj6.p(":path");
        j = aj6.p(":scheme");
        t = aj6.p(":authority");
    }

    public b52(fa0 fa0Var, fa0 fa0Var2) {
        fa0Var.getClass();
        fa0Var2.getClass();
        this.g = fa0Var;
        this.y = fa0Var2;
        this.r = fa0Var2.y() + fa0Var.y() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b52)) {
            return false;
        }
        b52 b52Var = (b52) obj;
        return yf2.p(this.g, b52Var.g) && yf2.p(this.y, b52Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return this.g.q() + ": " + this.y.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b52(String str, String str2) {
        this(aj6.p(str), aj6.p(str2));
        fa0 fa0Var = fa0.m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b52(fa0 fa0Var, String str) {
        this(fa0Var, aj6.p(str));
        fa0Var.getClass();
        str.getClass();
        fa0 fa0Var2 = fa0.m;
    }
}
