package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class bz0 extends e33 {
    public final RectF s;

    public bz0(bz0 bz0Var) {
        super(bz0Var);
        this.s = bz0Var.s;
    }

    @Override // defpackage.e33, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        cz0 cz0Var = new cz0(this);
        cz0Var.N = this;
        cz0Var.invalidateSelf();
        return cz0Var;
    }

    public bz0(fn4 fn4Var, RectF rectF) {
        super(fn4Var);
        this.s = rectF;
    }
}
