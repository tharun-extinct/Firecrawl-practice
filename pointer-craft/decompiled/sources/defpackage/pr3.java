package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pr3 implements rr3 {
    public final boolean g;

    public pr3(boolean z) {
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr3) && this.g == ((pr3) obj).g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g);
    }

    public final String toString() {
        return "Denied(shouldShowRationale=" + this.g + ')';
    }
}
