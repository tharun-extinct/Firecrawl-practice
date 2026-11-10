package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class np1 implements qj0 {
    public final long g;

    public np1(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        long j = ((np1) obj).g;
        int i = jj0.t;
        return tf5.g(this.g, j);
    }

    @Override // defpackage.qj0
    public final long g(Context context) {
        return this.g;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) jj0.j(this.g)) + ')';
    }
}
