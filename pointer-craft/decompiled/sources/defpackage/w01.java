package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class w01 implements qj0 {
    public final long g;
    public final long y;

    public w01(long j, long j2) {
        this.g = j;
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        long j = w01Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, w01Var.y);
    }

    @Override // defpackage.qj0
    public final long g(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.y : this.g;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayNightColorProvider(day=");
        fj.t(this.g, sb, ", night=");
        sb.append((Object) jj0.j(this.y));
        sb.append(')');
        return sb.toString();
    }
}
