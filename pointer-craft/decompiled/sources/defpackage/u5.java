package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements bx0 {
    public final bx0 g;
    public final float y;

    public u5(float f, bx0 bx0Var) {
        while (bx0Var instanceof u5) {
            bx0Var = ((u5) bx0Var).g;
            f += ((u5) bx0Var).y;
        }
        this.g = bx0Var;
        this.y = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.g.equals(u5Var.g) && this.y == u5Var.y;
    }

    @Override // defpackage.bx0
    public final float g(RectF rectF) {
        return Math.max(0.0f, this.g.g(rectF) + this.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Float.valueOf(this.y)});
    }
}
