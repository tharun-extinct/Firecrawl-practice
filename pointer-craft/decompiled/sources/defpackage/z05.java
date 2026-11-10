package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z05 {
    public final String g;
    public final int y;

    public z05(String str, int i) {
        this.g = str;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z05)) {
            return false;
        }
        z05 z05Var = (z05) obj;
        if (this.y != z05Var.y) {
            return false;
        }
        return this.g.equals(z05Var.g);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.y;
    }
}
