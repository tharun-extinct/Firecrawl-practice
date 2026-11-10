package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h94 {
    public final long g = jj0.j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h94)) {
            return false;
        }
        long j = ((h94) obj).g;
        int i = jj0.t;
        return tf5.g(this.g, j);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.g) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) jj0.j(this.g)) + ", rippleAlpha=null)";
    }
}
