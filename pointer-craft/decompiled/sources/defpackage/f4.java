package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 {
    public final String g;

    public f4(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4) {
            return yf2.p(this.g, ((f4) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g;
    }
}
