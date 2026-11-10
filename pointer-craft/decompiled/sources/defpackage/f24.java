package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f24 {
    public final int g;
    public final String y;

    public f24(String str, int i) {
        this.g = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f24)) {
            return false;
        }
        f24 f24Var = (f24) obj;
        return this.g == f24Var.g && yf2.p(this.y, f24Var.y);
    }

    public final boolean g() {
        return this.g == 0;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.g) * 31;
        String str = this.y;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "QueryOutcome(responseCode=" + this.g + ", debugMessage=" + this.y + ")";
    }
}
