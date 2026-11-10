package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w75 {
    public final int g;
    public final String y;

    public w75(String str, int i) {
        this.g = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w75)) {
            return false;
        }
        w75 w75Var = (w75) obj;
        return this.g == w75Var.g && yf2.p(this.y, w75Var.y);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.g) * 31;
        String str = this.y;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TextResource(id=" + this.g + ", text=" + this.y + ")";
    }
}
