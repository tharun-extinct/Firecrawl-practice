package defpackage;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wm {
    public final Typeface g;
    public final int r;
    public final String y;

    public wm(Typeface typeface, String str, int i) {
        this.g = typeface;
        this.y = str;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return this.r == wmVar.r && Objects.equals(this.g, wmVar.g) && Objects.equals(this.y, wmVar.y);
    }

    public final int hashCode() {
        return Objects.hash(this.g, this.y, Integer.valueOf(this.r));
    }
}
