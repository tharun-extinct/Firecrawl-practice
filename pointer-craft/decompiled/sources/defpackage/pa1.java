package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class pa1 {
    public final DisplayCutout g;

    public pa1(DisplayCutout displayCutout) {
        this.g = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pa1.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((pa1) obj).g);
    }

    public final nd2 g() {
        return Build.VERSION.SDK_INT >= 30 ? nd2.n(t70.y(this.g)) : nd2.v;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.g + "}";
    }
}
