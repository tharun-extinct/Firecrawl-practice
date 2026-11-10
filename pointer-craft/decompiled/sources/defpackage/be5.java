package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class be5 {
    public final String g;
    public final String y;

    public be5(String str, String str2) {
        str2.getClass();
        this.g = str;
        this.y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be5)) {
            return false;
        }
        be5 be5Var = (be5) obj;
        return this.g.equals(be5Var.g) && yf2.p(this.y, be5Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return xi3.a("TroubleshootingResult(formattedAnswers=", this.g, ", proposedStep=", this.y, ")");
    }
}
