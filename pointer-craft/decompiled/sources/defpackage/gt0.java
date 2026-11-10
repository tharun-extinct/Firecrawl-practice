package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 {
    public final int g;

    public gt0(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt0) && this.g == ((gt0) obj).g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return fj.x(new StringBuilder("ContainerInfo(layoutId="), this.g, ')');
    }
}
