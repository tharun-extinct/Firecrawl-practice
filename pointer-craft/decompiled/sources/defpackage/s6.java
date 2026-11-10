package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s6 {
    public final int g;

    public /* synthetic */ s6(int i) {
        this.g = i;
    }

    public static final /* synthetic */ s6 g(int i) {
        return new s6(i);
    }

    public static String y(int i) {
        return "Vertical(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6) {
            return this.g == ((s6) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return y(this.g);
    }
}
