package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xr {
    public final Object g;

    public /* synthetic */ xr(Object obj) {
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xr) {
            return yf2.p(this.g, ((xr) obj).g);
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
        return "AsyncTypefaceResult(result=" + this.g + ")";
    }
}
