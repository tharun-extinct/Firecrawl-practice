package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mk2 {
    public final String g;
    public final String y;

    public mk2(String str, String str2) {
        str.getClass();
        this.g = str;
        this.y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk2)) {
            return false;
        }
        mk2 mk2Var = (mk2) obj;
        return yf2.p(this.g, mk2Var.g) && this.y.equals(mk2Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return xi3.a("Language(id=", this.g, ", name=", this.y, ")");
    }
}
