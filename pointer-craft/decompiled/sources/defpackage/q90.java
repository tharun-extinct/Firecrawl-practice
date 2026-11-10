package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q90 extends uz5 {
    public final String y;

    public q90(String str) {
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q90) && this.y.equals(((q90) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return du4.i("TextType(text=", this.y, ")");
    }
}
