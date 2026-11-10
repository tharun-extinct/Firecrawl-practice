package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class py3 extends uy3 {
    public final String g;

    public py3(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py3) && yf2.p(this.g, ((py3) obj).g);
    }

    public final int hashCode() {
        String str = this.g;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return du4.i("LayoutLoadFailed(message=", this.g, ")");
    }
}
