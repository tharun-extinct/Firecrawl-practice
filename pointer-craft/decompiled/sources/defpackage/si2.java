package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class si2 {
    public static final si2 y = new si2(null, 63);
    public final xy1 g;

    public si2(xy1 xy1Var, int i) {
        this.g = (i & 16) != 0 ? null : xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si2) && this.g == ((si2) obj).g;
    }

    public final int hashCode() {
        xy1 xy1Var = this.g;
        return (xy1Var != null ? xy1Var.hashCode() : 0) * 31;
    }
}
