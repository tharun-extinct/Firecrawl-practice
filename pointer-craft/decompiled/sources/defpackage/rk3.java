package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk3 {
    public final String g;

    public rk3(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk3) && this.g.equals(((rk3) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return du4.i("OpaqueKey(key=", this.g, ")");
    }
}
