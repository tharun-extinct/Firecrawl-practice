package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e64 implements bx0 {
    public final float g;

    public e64(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e64) && this.g == ((e64) obj).g;
    }

    @Override // defpackage.bx0
    public final float g(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.g)});
    }

    public final String toString() {
        return xi3.m(new StringBuilder(), (int) (this.g * 100.0f), "%");
    }
}
