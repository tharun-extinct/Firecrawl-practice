package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw3 {
    public final String g;

    public rw3(String str) {
        str.getClass();
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw3)) {
            return false;
        }
        return yf2.p(this.g, ((rw3) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g;
    }
}
