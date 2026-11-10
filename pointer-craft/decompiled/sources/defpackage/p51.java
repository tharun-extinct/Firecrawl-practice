package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p51 {
    public final e24 g;
    public final byte r;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public p51(e24 e24Var, int i, int i2) {
        this.g = e24Var;
        this.y = i;
        this.r = i2;
    }

    public static p51 g(Class cls) {
        return new p51(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p51)) {
            return false;
        }
        p51 p51Var = (p51) obj;
        return this.g.equals(p51Var.g) && this.y == p51Var.y && this.r == p51Var.r;
    }

    public final int hashCode() {
        return this.r ^ ((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.y) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.g);
        sb.append(", type=");
        byte b = this.y;
        if (b == 1) {
            str = "required";
        } else {
            str = b == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        byte b2 = this.r;
        if (b2 == 0) {
            str2 = "direct";
        } else if (b2 == 1) {
            str2 = "provider";
        } else {
            if (b2 != 2) {
                throw new AssertionError(xi3.j("Unsupported injection: ", b2));
            }
            str2 = "deferred";
        }
        return du4.b(sb, str2, "}");
    }

    public p51(int i, int i2, Class cls) {
        this(e24.g(cls), i, i2);
    }
}
