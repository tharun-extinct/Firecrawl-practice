package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj1 {
    public final String g;

    public dj1(String str) {
        if (str != null) {
            this.g = str;
        } else {
            l0.q("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj1)) {
            return false;
        }
        return this.g.equals(((dj1) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ 1000003;
    }

    public final String toString() {
        return du4.b(new StringBuilder("Encoding{name=\""), this.g, "\"}");
    }
}
