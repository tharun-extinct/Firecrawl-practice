package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class vh extends Drawable.ConstantState {
    public final Drawable.ConstantState g;

    public vh(Drawable.ConstantState constantState) {
        this.g = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.g.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        wh whVar = new wh(null);
        Drawable drawableNewDrawable = this.g.newDrawable();
        whVar.j = drawableNewDrawable;
        drawableNewDrawable.setCallback(whVar.w);
        return whVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        wh whVar = new wh(null);
        Drawable drawableNewDrawable = this.g.newDrawable(resources);
        whVar.j = drawableNewDrawable;
        drawableNewDrawable.setCallback(whVar.w);
        return whVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        wh whVar = new wh(null);
        Drawable drawableNewDrawable = this.g.newDrawable(resources, theme);
        whVar.j = drawableNewDrawable;
        drawableNewDrawable.setCallback(whVar.w);
        return whVar;
    }
}
