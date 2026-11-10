package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rf0 implements bx0 {
    public final float g;

    public rf0(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf0) && this.g == ((rf0) obj).g;
    }

    @Override // defpackage.bx0
    public final float g(RectF rectF) {
        return js2.x(this.g, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.g)});
    }
}
