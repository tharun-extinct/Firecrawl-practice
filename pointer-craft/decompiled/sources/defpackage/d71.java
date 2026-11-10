package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d71 implements g71 {
    public final String g;

    public d71(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d71) && this.g.equals(((d71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return du4.i("Failed(message=", this.g, ")");
    }
}
