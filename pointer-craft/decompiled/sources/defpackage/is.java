package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class is {
    public final int g;

    public /* synthetic */ is(int i) {
        this.g = i;
    }

    public static final /* synthetic */ is g(int i) {
        return new is(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof is) {
            return this.g == ((is) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return du4.w(this.g, "AutoClearFocusBehavior(value=", ")");
    }

    public final /* synthetic */ int y() {
        return this.g;
    }
}
