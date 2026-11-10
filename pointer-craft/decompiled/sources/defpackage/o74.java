package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o74 implements qj0 {
    public final int g;

    public o74(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o74) && this.g == ((o74) obj).g;
    }

    @Override // defpackage.qj0
    public final long g(Context context) {
        return ra.n(nc6.w(context, this.g));
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        return fj.x(new StringBuilder("ResourceColorProvider(resId="), this.g, ')');
    }
}
