package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ld0 {
    public static final kd0 y = new kd0();
    public final Object g;

    public /* synthetic */ ld0(Object obj) {
        this.g = obj;
    }

    public static final Object g(Object obj) {
        if (obj instanceof kd0) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ld0) {
            return yf2.p(this.g, ((ld0) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.g;
        if (obj instanceof jd0) {
            return ((jd0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
