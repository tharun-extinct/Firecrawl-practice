package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l implements bx0 {
    public final float g;

    public l(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.g == ((l) obj).g;
    }

    @Override // defpackage.bx0
    public final float g(RectF rectF) {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.g)});
    }

    public final String toString() {
        return this.g + "px";
    }
}
