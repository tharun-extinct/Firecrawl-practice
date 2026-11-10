package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.dn4;
import defpackage.fn4;
import defpackage.g33;
import defpackage.i64;
import defpackage.l;
import defpackage.m3;
import defpackage.mq2;
import defpackage.oa4;
import defpackage.p24;
import defpackage.tg1;
import defpackage.vt1;
import defpackage.wt1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public final Rect a;
    public float b;
    public final i64 c;
    public boolean h;
    public WeakReference i;
    public final Paint j;
    public final Path m;
    public wt1 o;
    public float p;
    public final Path q;
    public ObjectAnimator s;
    public final RectF t;
    public boolean u;
    public final Matrix w;
    public boolean z;
    public static final ColorDrawable f = new ColorDrawable(0);
    public static final int[] k = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator d = new OvershootInterpolator(4.0f);
    public static final vt1 e = new vt1("interpolation");

    private FocusRingDrawable(wt1 wt1Var, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.j = paint;
        this.t = new RectF();
        this.a = new Rect();
        this.m = new Path();
        this.q = new Path();
        this.w = new Matrix();
        this.c = i64.j();
        this.b = -1.0f;
        this.p = 1.0f;
        this.z = false;
        this.h = false;
        wt1 wt1Var2 = new wt1(wt1Var);
        this.o = wt1Var2;
        Drawable.ConstantState constantState = wt1Var2.g;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.o.a)) {
            return;
        }
        paint.setStrokeWidth(this.o.a);
    }

    public static int r(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable v(Context context, LayerDrawable layerDrawable, g33 g33Var) {
        if (!mq2.z(context.getTheme(), io.appground.blek.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f);
        if (g33Var != null) {
            focusRingDrawable.i = new WeakReference(g33Var);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float x(float f2, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f2)) {
            return f2;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        n(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        if (this.o.r && this.z) {
            float f2 = ((this.o.a / 2.0f) * this.p) + this.o.b;
            float f3 = ((this.o.q / 2.0f) * this.p) + this.o.p + this.o.b;
            Path path = this.q;
            if (path.isEmpty()) {
                WeakReference weakReference = this.i;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((g33) this.i.get()).b;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            wt1 wt1Var = this.o;
            if (path2 != null) {
                y(canvas, path2, f3, wt1Var.q, this.o.j);
                y(canvas, path2, f2, this.o.a, this.o.x);
                return;
            }
            if (Float.isNaN(wt1Var.c)) {
                fMax = this.b;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.i;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        g33 g33Var = (g33) this.i.get();
                        float fY = g33Var.y(g33Var.l(), g33Var.t.g.n(), g33Var.I);
                        if (fY >= 0.0f) {
                            fY *= g33Var.t.t;
                        }
                        if (fY >= 0.0f) {
                            fMax = Math.max(0.0f, fY - (this.o.a / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.o.c;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.o.a / 2.0f));
            float f4 = this.o.q;
            int i = this.o.j;
            RectF rectF = this.t;
            g(rectF);
            rectF.inset(f3, f3);
            float f5 = f4 * this.p;
            Paint paint = this.j;
            paint.setStrokeWidth(f5);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            float f6 = this.o.a;
            int i2 = this.o.x;
            g(rectF);
            rectF.inset(f2, f2);
            paint.setStrokeWidth(f6 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    public final void g(RectF rectF) {
        if (this.o.f != null) {
            rectF.set(this.o.f);
            return;
        }
        WeakReference weakReference = this.i;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((g33) this.i.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect = this.a;
        rippleDrawable.getHotspotBounds(rect);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect.inset(Math.max(0, (rect.width() / 2) - radius), Math.max(0, (rect.height() / 2) - radius));
        }
        rectF.set(rect);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.o.Q()) {
            return null;
        }
        this.o.y = getChangingConfigurations();
        return this.o;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.o.r;
        } catch (NoSuchMethodError unused) {
            return this.o.r;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = p24.a;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.o.n = r(typedArrayObtainStyledAttributes, 0);
        if (this.o.n == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            wt1 wt1Var = this.o;
            wt1Var.r = typedArrayObtainStyledAttributes.getBoolean(0, wt1Var.r);
            this.o.v = true;
        }
        this.o.l = r(typedArrayObtainStyledAttributes, 5);
        if (this.o.l == Integer.MIN_VALUE) {
            this.o.x = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.o.t = r(typedArrayObtainStyledAttributes, 1);
        if (this.o.t == Integer.MIN_VALUE) {
            this.o.j = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.o.m = r(typedArrayObtainStyledAttributes, 6);
        if (this.o.m == Integer.MIN_VALUE) {
            this.o.a = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.o.w = r(typedArrayObtainStyledAttributes, 3);
        if (this.o.w == Integer.MIN_VALUE) {
            this.o.q = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.o.w = r(typedArrayObtainStyledAttributes, 3);
        if (this.o.w == Integer.MIN_VALUE) {
            this.o.q = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.o.i = r(typedArrayObtainStyledAttributes, 7);
        if (this.o.i == Integer.MIN_VALUE) {
            this.o.c = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.o.s = r(typedArrayObtainStyledAttributes, 4);
        if (this.o.s == Integer.MIN_VALUE) {
            this.o.b = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.o.u = r(typedArrayObtainStyledAttributes, 2);
        if (this.o.u == Integer.MIN_VALUE) {
            this.o.p = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.o.o = r(typedArrayObtainStyledAttributes, 8);
        this.o.h = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.o.g = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f;
            setDrawable(colorDrawable);
            this.o.g = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.o.r;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.s = null;
        }
    }

    public final void l(dn4 dn4Var) {
        RectF rectF = this.t;
        g(rectF);
        fn4 fn4VarY = dn4Var.y(k);
        boolean zA = fn4VarY.a(rectF);
        Path path = this.q;
        if (!zA) {
            this.c.g(fn4VarY, null, 1.0f, rectF, null, path);
            this.b = -1.0f;
            return;
        }
        float f2 = ((this.o.a / 2.0f) * this.p) + this.o.b;
        rectF.inset(f2, f2);
        this.b = fn4VarY.v.g(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            this.o = new wt1(this.o);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.o.g = drawable.getConstantState();
            }
            this.h = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    public final void n(Resources.Theme theme) {
        TypedValue typedValueU;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(p24.a);
        if (this.o.n != Integer.MIN_VALUE && (typedValueU = mq2.u(theme, this.o.n)) != null) {
            this.o.r = typedValueU.data != 0;
            this.o.v = true;
        }
        if (!this.o.v) {
            wt1 wt1Var = this.o;
            wt1Var.r = mq2.z(theme, io.appground.blek.R.attr.focusRingsEnabled, wt1Var.r);
        }
        if (this.o.r) {
            wt1 wt1Var2 = this.o;
            int color = wt1Var2.x;
            int i = this.o.l;
            if (color == Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            wt1Var2.x = color;
            wt1 wt1Var3 = this.o;
            int color2 = wt1Var3.j;
            int i2 = this.o.t;
            if (color2 == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i2, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            wt1Var3.j = color2;
            wt1 wt1Var4 = this.o;
            wt1Var4.a = x(wt1Var4.a, theme, this.o.m, typedArrayObtainStyledAttributes, 6, io.appground.blek.R.dimen.mtrl_focus_ring_outer_stroke_width);
            wt1 wt1Var5 = this.o;
            wt1Var5.q = x(wt1Var5.q, theme, this.o.w, typedArrayObtainStyledAttributes, 3, io.appground.blek.R.dimen.mtrl_focus_ring_inner_stroke_width);
            wt1 wt1Var6 = this.o;
            wt1Var6.c = x(wt1Var6.c, theme, this.o.i, typedArrayObtainStyledAttributes, 7, 0);
            wt1 wt1Var7 = this.o;
            wt1Var7.b = x(wt1Var7.b, theme, this.o.s, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.o.b)) {
                this.o.b = 0.0f;
            }
            wt1 wt1Var8 = this.o;
            wt1Var8.p = x(wt1Var8.p, theme, this.o.u, typedArrayObtainStyledAttributes, 2, io.appground.blek.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            int i3 = this.o.h;
            wt1 wt1Var9 = this.o;
            int[] iArr = p24.E;
            if (i3 != Integer.MIN_VALUE) {
                wt1Var9.z = fn4.j(theme.obtainStyledAttributes(wt1Var9.h, iArr), new l(0.0f)).g();
            } else {
                TypedValue typedValueU2 = mq2.u(theme, wt1Var9.o != Integer.MIN_VALUE ? this.o.o : io.appground.blek.R.attr.focusRingsShapeAppearance);
                if (typedValueU2 != null) {
                    this.o.z = fn4.j(theme.obtainStyledAttributes(typedValueU2.resourceId, iArr), new l(0.0f)).g();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.j;
        paint.setStyle(style);
        if (Float.isNaN(this.o.a)) {
            return;
        }
        paint.setStrokeWidth(this.o.a);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        fn4 fn4Var;
        super.onBoundsChange(rect);
        if (this.o.r) {
            if (this.o.z != null) {
                l(this.o.z);
                return;
            }
            Drawable drawable = getDrawable();
            byte b = 0;
            dn4 dn4Var = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    oa4 oa4Var = new oa4();
                    oa4 oa4Var2 = new oa4();
                    oa4 oa4Var3 = new oa4();
                    oa4 oa4Var4 = new oa4();
                    tg1 tg1Var = new tg1(b);
                    tg1 tg1Var2 = new tg1(b);
                    tg1 tg1Var3 = new tg1(b);
                    tg1 tg1Var4 = new tg1(b);
                    float radius = outline.getRadius();
                    l lVar = new l(radius);
                    l lVar2 = new l(radius);
                    l lVar3 = new l(radius);
                    l lVar4 = new l(radius);
                    fn4Var = new fn4();
                    fn4Var.g = oa4Var;
                    fn4Var.y = oa4Var2;
                    fn4Var.r = oa4Var3;
                    fn4Var.n = oa4Var4;
                    fn4Var.v = lVar;
                    fn4Var.x = lVar2;
                    fn4Var.l = lVar3;
                    fn4Var.j = lVar4;
                    fn4Var.t = tg1Var;
                    fn4Var.a = tg1Var2;
                    fn4Var.m = tg1Var3;
                    fn4Var.q = tg1Var4;
                    dn4Var = fn4Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    oa4 oa4Var5 = new oa4();
                    oa4 oa4Var6 = new oa4();
                    oa4 oa4Var7 = new oa4();
                    oa4 oa4Var8 = new oa4();
                    tg1 tg1Var5 = new tg1(b);
                    tg1 tg1Var6 = new tg1(b);
                    tg1 tg1Var7 = new tg1(b);
                    tg1 tg1Var8 = new tg1(b);
                    l lVar5 = new l(Math.min(cornerRadii[0], cornerRadii[1]));
                    l lVar6 = new l(Math.min(cornerRadii[2], cornerRadii[3]));
                    l lVar7 = new l(Math.min(cornerRadii[4], cornerRadii[5]));
                    l lVar8 = new l(Math.min(cornerRadii[6], cornerRadii[7]));
                    fn4Var = new fn4();
                    fn4Var.g = oa4Var5;
                    fn4Var.y = oa4Var6;
                    fn4Var.r = oa4Var7;
                    fn4Var.n = oa4Var8;
                    fn4Var.v = lVar5;
                    fn4Var.x = lVar6;
                    fn4Var.l = lVar7;
                    fn4Var.j = lVar8;
                    fn4Var.t = tg1Var5;
                    fn4Var.a = tg1Var6;
                    fn4Var.m = tg1Var7;
                    fn4Var.q = tg1Var8;
                    dn4Var = fn4Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        oa4 oa4Var9 = new oa4();
                        oa4 oa4Var10 = new oa4();
                        oa4 oa4Var11 = new oa4();
                        oa4 oa4Var12 = new oa4();
                        tg1 tg1Var9 = new tg1(b);
                        tg1 tg1Var10 = new tg1(b);
                        tg1 tg1Var11 = new tg1(b);
                        tg1 tg1Var12 = new tg1(b);
                        l lVar9 = new l(cornerRadius);
                        l lVar10 = new l(cornerRadius);
                        l lVar11 = new l(cornerRadius);
                        l lVar12 = new l(cornerRadius);
                        fn4 fn4Var2 = new fn4();
                        fn4Var2.g = oa4Var9;
                        fn4Var2.y = oa4Var10;
                        fn4Var2.r = oa4Var11;
                        fn4Var2.n = oa4Var12;
                        fn4Var2.v = lVar9;
                        fn4Var2.x = lVar10;
                        fn4Var2.l = lVar11;
                        fn4Var2.j = lVar12;
                        fn4Var2.t = tg1Var9;
                        fn4Var2.a = tg1Var10;
                        fn4Var2.m = tg1Var11;
                        fn4Var2.q = tg1Var12;
                        dn4Var = fn4Var2;
                    }
                }
            }
            if (dn4Var != null) {
                l(dn4Var);
            } else {
                this.b = -1.0f;
                this.q.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (!this.o.r) {
            this.z = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(this.o.k, iArr);
        boolean z = this.z != zStateSetMatches;
        this.z = zStateSetMatches;
        if (z && iArr.length > 0 && !this.u) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, e, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(d);
                objectAnimatorOfFloat.addListener(new m3(this, (byte) 3));
                this.s = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.p = 1.0f;
            }
        }
        this.u = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public final void y(Canvas canvas, Path path, float f2, float f3, int i) {
        RectF rectF = this.t;
        g(rectF);
        float f4 = f2 * 2.0f;
        float fWidth = 1.0f - (f4 / rectF.width());
        float fHeight = 1.0f - (f4 / rectF.height());
        Matrix matrix = this.w;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.m;
        path.transform(matrix, path2);
        float f5 = f3 * this.p;
        Paint paint = this.j;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    public FocusRingDrawable() {
        super(null);
        this.j = new Paint(1);
        this.t = new RectF();
        this.a = new Rect();
        this.m = new Path();
        this.q = new Path();
        this.w = new Matrix();
        this.c = i64.j();
        this.b = -1.0f;
        this.p = 1.0f;
        this.z = false;
        this.h = false;
        this.o = new wt1(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.j = new Paint(1);
        this.t = new RectF();
        this.a = new Rect();
        this.m = new Path();
        this.q = new Path();
        this.w = new Matrix();
        this.c = i64.j();
        this.b = -1.0f;
        this.p = 1.0f;
        this.z = false;
        this.h = false;
        wt1 wt1Var = new wt1(null);
        this.o = wt1Var;
        if (drawable != null) {
            wt1Var.g = drawable.getConstantState();
        }
        n(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(wt1 wt1Var, Resources resources, vt1 vt1Var) {
        this(wt1Var, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
