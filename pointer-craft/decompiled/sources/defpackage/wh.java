package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class wh extends ui5 implements Animatable {
    public final Context a;
    public m3 m = null;
    public ArrayList q = null;
    public final th w = new th(this);
    public final uh t = new uh();

    public wh(Context context) {
        this.a = context;
    }

    @Override // defpackage.ui5, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.j;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        uh uhVar = this.t;
        uhVar.g.draw(canvas);
        if (uhVar.y.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.getAlpha() : this.t.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.j;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.t.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.getColorFilter() : this.t.g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.j != null) {
            return new vh(this.j.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.getIntrinsicHeight() : this.t.g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.getIntrinsicWidth() : this.t.g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.getOpacity() : this.t.g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        uh uhVar;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            uhVar = this.t;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayO = xq2.o(resources, theme, attributeSet, mu5.x);
                    int resourceId = typedArrayO.getResourceId(0, 0);
                    if (resourceId != 0) {
                        dj5 dj5Var = new dj5();
                        ThreadLocal threadLocal = x74.g;
                        dj5Var.j = resources.getDrawable(resourceId, theme);
                        new cj5(dj5Var.j.getConstantState());
                        dj5Var.w = false;
                        dj5Var.setCallback(this.w);
                        dj5 dj5Var2 = uhVar.g;
                        if (dj5Var2 != null) {
                            dj5Var2.setCallback(null);
                        }
                        uhVar.g = dj5Var;
                    }
                    typedArrayO.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, mu5.l);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.a;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            l0.z("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorN = oy0.n(context, resourceId2);
                        animatorN.setTarget(uhVar.g.t.y.i.get(string));
                        if (uhVar.r == null) {
                            uhVar.r = new ArrayList();
                            uhVar.n = new mr(0);
                        }
                        uhVar.r.add(animatorN);
                        uhVar.n.put(animatorN, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        AnimatorSet animatorSet = uhVar.y;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            uhVar.y = animatorSet;
        }
        animatorSet.playTogether(uhVar.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.isAutoMirrored() : this.t.g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.j;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.t.y.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.j;
        return drawable != null ? drawable.isStateful() : this.t.g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.t.g.setBounds(rect);
        }
    }

    @Override // defpackage.ui5, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.j;
        return drawable != null ? drawable.setLevel(i) : this.t.g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.j;
        return drawable != null ? drawable.setState(iArr) : this.t.g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.t.g.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.t.g.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.t.g.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.t.g.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.t.g.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.t.g.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.j;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.t.g.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        uh uhVar = this.t;
        if (uhVar.y.isStarted()) {
            return;
        }
        uhVar.y.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.t.y.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
