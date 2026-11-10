package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o65 {
    public static final o65 r = new o65(kq2.G(0), kq2.G(0));
    public final long g;
    public final long y;

    public o65(long j, long j2) {
        this.g = j;
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o65)) {
            return false;
        }
        o65 o65Var = (o65) obj;
        return n85.g(this.g, o65Var.g) && n85.g(this.y, o65Var.y);
    }

    public final int hashCode() {
        o85[] o85VarArr = n85.y;
        return Long.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }

    public final String toString() {
        return xi3.a("TextIndent(firstLine=", n85.n(this.g), ", restLine=", n85.n(this.y), ")");
    }
}
