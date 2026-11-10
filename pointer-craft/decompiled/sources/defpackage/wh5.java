package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wh5 implements yi {
    public final String g;

    public wh5(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wh5) {
            return this.g.equals(((wh5) obj).g);
        }
        return false;
    }

    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return du4.i("UrlAnnotation(url=", this.g, ")");
    }
}
