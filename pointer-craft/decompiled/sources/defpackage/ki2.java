package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class ki2 {
    public final KeyEvent g;

    public final boolean equals(Object obj) {
        if (obj instanceof ki2) {
            return yf2.p(this.g, ((ki2) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.g + ")";
    }
}
