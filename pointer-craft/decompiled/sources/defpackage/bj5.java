package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class bj5 extends Drawable.ConstantState {
    public boolean a;
    public int g;
    public PorterDuff.Mode j;
    public ColorStateList l;
    public boolean m;
    public PorterDuff.Mode n;
    public Paint q;
    public ColorStateList r;
    public int t;
    public boolean v;
    public Bitmap x;
    public aj5 y;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new dj5(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new dj5(this);
    }
}
