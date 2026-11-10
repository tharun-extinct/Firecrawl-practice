package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 {
    public final String g;
    public final t32 y;

    public qq0(String str, t32 t32Var) {
        this.g = str;
        this.y = t32Var;
    }

    public static qq0 g(qq0 qq0Var, String str, t32 t32Var, int i) {
        if ((i & 1) != 0) {
            str = qq0Var.g;
        }
        if ((i & 2) != 0) {
            t32Var = qq0Var.y;
        }
        qq0Var.getClass();
        return new qq0(str, t32Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        return yf2.p(this.g, qq0Var.g) && yf2.p(this.y, qq0Var.y);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        t32 t32Var = this.y;
        return iHashCode + (t32Var != null ? t32Var.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectionUiState(infoMessage=" + this.g + ", action=" + this.y + ")";
    }
}
