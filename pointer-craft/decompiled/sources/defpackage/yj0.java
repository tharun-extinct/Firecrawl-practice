package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 implements m65 {
    public final long g;

    public yj0(long j) {
        this.g = j;
        if (j != 16) {
            return;
        }
        nc2.g("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        long j = ((yj0) obj).g;
        int i = jj0.t;
        return tf5.g(this.g, j);
    }

    @Override // defpackage.m65
    public final float g() {
        return jj0.r(this.g);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.g);
    }

    @Override // defpackage.m65
    public final z60 r() {
        return null;
    }

    public final String toString() {
        return du4.i("ColorStyle(value=", jj0.j(this.g), ")");
    }

    @Override // defpackage.m65
    public final long y() {
        return this.g;
    }
}
