package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ia4 extends Drawable {
    public ColorStateList a;
    public float g;
    public ColorStateList j;
    public final Rect n;
    public final RectF r;
    public PorterDuffColorFilter t;
    public float v;
    public final Paint y;
    public boolean x = false;
    public boolean l = true;
    public PorterDuff.Mode m = PorterDuff.Mode.SRC_IN;

    public ia4(ColorStateList colorStateList, float f) {
        this.g = f;
        Paint paint = new Paint(5);
        this.y = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.j = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.j.getDefaultColor()));
        this.r = new RectF();
        this.n = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint = this.y;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.t);
            z = true;
        }
        RectF rectF = this.r;
        float f = this.g;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public final PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.n, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.a;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        y(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.j;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.y;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 == null || (mode = this.m) == null) {
            return z;
        }
        this.t = g(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.y.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.y.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a = colorStateList;
        this.t = g(colorStateList, this.m);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.t = g(this.a, mode);
        invalidateSelf();
    }

    public final void y(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.r;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.n;
        rect2.set(rect);
        if (this.x) {
            rect2.inset((int) Math.ceil(ja4.g(this.v, this.g, this.l)), (int) Math.ceil(ja4.y(this.v, this.g, this.l)));
            rectF.set(rect2);
        }
    }
}
