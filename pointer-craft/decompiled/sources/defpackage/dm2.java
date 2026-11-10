package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm2 {
    public final int g;

    public dm2(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm2) && this.g == ((dm2) obj).g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return fj.x(new StringBuilder("LayoutInfo(layoutId="), this.g, ')');
    }
}
