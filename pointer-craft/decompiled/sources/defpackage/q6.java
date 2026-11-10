package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q6 {
    public final int g;

    public /* synthetic */ q6(int i) {
        this.g = i;
    }

    public static final /* synthetic */ q6 g(int i) {
        return new q6(i);
    }

    public static String y(int i) {
        return "Horizontal(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q6) {
            return this.g == ((q6) obj).g;
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
