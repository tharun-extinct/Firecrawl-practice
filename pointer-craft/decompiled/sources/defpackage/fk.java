package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fk extends ik {
    public final int g;

    public fk(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && this.g == ((fk) obj).g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "LayoutEdit(id=", ")");
    }
}
