package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class m30 {
    public final ColorFilter g;
    public final int r;
    public final long y;

    public m30(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            ic.v();
            porterDuffColorFilter = ic.r(ra.U(j), og0.I(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ra.U(j), og0.J(i));
        }
        this.g = porterDuffColorFilter;
        this.y = j;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m30)) {
            return false;
        }
        m30 m30Var = (m30) obj;
        long j = m30Var.y;
        int i = jj0.t;
        return tf5.g(this.y, j) && this.r == m30Var.r;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Integer.hashCode(this.r) + (Long.hashCode(this.y) * 31);
    }

    public final String toString() {
        return xi3.a("BlendModeColorFilter(color=", jj0.j(this.y), ", blendMode=", a11.G(this.r), ")");
    }
}
