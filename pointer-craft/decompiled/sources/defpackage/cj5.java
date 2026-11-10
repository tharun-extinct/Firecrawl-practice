package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class cj5 extends Drawable.ConstantState {
    public final Drawable.ConstantState g;

    public cj5(Drawable.ConstantState constantState) {
        this.g = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.g.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dj5 dj5Var = new dj5();
        dj5Var.j = (VectorDrawable) this.g.newDrawable();
        return dj5Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dj5 dj5Var = new dj5();
        dj5Var.j = (VectorDrawable) this.g.newDrawable(resources);
        return dj5Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dj5 dj5Var = new dj5();
        dj5Var.j = (VectorDrawable) this.g.newDrawable(resources, theme);
        return dj5Var;
    }
}
