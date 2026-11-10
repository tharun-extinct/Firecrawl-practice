package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class x23 {
    public static final ColorDrawable A;
    public static final double e = Math.cos(Math.toRadians(45.0d));
    public Drawable a;
    public RippleDrawable b;
    public dn4 c;
    public final int f;
    public final MaterialCardView g;
    public ValueAnimator h;
    public ColorStateList i;
    public int j;
    public final int k;
    public int l;
    public Drawable m;
    public final g33 n;
    public final TimeInterpolator o;
    public g33 p;
    public ColorStateList q;
    public final g33 r;
    public LayerDrawable s;
    public int t;
    public float v;
    public ColorStateList w;
    public int x;
    public boolean z;
    public final Rect y = new Rect();
    public boolean u = false;
    public float d = 0.0f;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public x23(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.v = -1.0f;
        this.g = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, i24.g, R.attr.materialCardViewStyle, R.style.CardView);
        g33 g33Var = new g33(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.r = g33Var;
        g33Var.c(materialCardView.getContext());
        g33Var.z();
        en4 en4VarM = g33Var.t().m();
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.v = dimension;
            en4VarM.y(dimension);
        }
        this.n = new g33();
        j(en4VarM.g());
        this.o = lr2.E(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, qi.g);
        this.f = mq2.h(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.k = mq2.h(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float y(og0 og0Var, float f) {
        if (og0Var instanceof oa4) {
            return (float) ((1.0d - e) * ((double) f));
        }
        if (og0Var instanceof az0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final boolean a() {
        View view = this.g;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float g() {
        float fMax = 0.0f;
        for (fn4 fn4Var : this.c.r()) {
            if (fn4Var != null) {
                og0 og0Var = fn4Var.g;
                g33 g33Var = this.r;
                float fY = y(og0Var, g33Var.m());
                og0 og0Var2 = fn4Var.y;
                float[] fArr = g33Var.I;
                float fMax2 = Math.max(fY, y(og0Var2, fArr != null ? fArr[0] : g33Var.t.g.n().x.g(g33Var.l())));
                og0 og0Var3 = fn4Var.r;
                float[] fArr2 = g33Var.I;
                float fY2 = y(og0Var3, fArr2 != null ? fArr2[1] : g33Var.t.g.n().l.g(g33Var.l()));
                og0 og0Var4 = fn4Var.n;
                float[] fArr3 = g33Var.I;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fY2, y(og0Var4, fArr3 != null ? fArr3[2] : g33Var.t.g.n().j.g(g33Var.l())))));
            }
        }
        return fMax;
    }

    public final void j(dn4 dn4Var) {
        this.c = dn4Var;
        g33 g33Var = this.r;
        g33Var.h(dn4Var);
        this.n.h(dn4Var);
        g33 g33Var2 = this.p;
        if (g33Var2 != null) {
            g33Var2.h(dn4Var);
        }
        g33Var.D = !g33Var.i();
    }

    public final void l(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.m = drawableMutate;
            drawableMutate.setTintList(this.w);
            x(this.g.b, false);
        } else {
            this.m = A;
        }
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.m);
        }
    }

    public final void m() {
        Drawable drawable = this.a;
        Drawable drawableR = a() ? r() : this.n;
        this.a = drawableR;
        if (drawable != drawableR) {
            MaterialCardView materialCardView = this.g;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableR);
            } else {
                materialCardView.setForeground(n(drawableR));
            }
        }
    }

    public final w23 n(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.g;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (t() ? g() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (t() ? g() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new w23(drawable, iCeil, i, iCeil, i);
    }

    public final void q() {
        MaterialCardView materialCardView = this.g;
        float cardViewRadius = 0.0f;
        float fG = ((!materialCardView.getPreventCornerOverlap() || this.r.i()) && !t()) ? 0.0f : g();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - e) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fG - cardViewRadius);
        Rect rect = this.y;
        materialCardView.a.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        ji jiVar = materialCardView.q;
        xb0 xb0Var = (xb0) jiVar.a;
        if (!xb0Var.getUseCompatPadding()) {
            jiVar.W(0, 0, 0, 0);
            return;
        }
        ia4 ia4Var = (ia4) jiVar.t;
        float f = ia4Var.v;
        float f2 = ia4Var.g;
        int iCeil = (int) Math.ceil(ja4.g(f, f2, xb0Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(ja4.y(f, f2, xb0Var.getPreventCornerOverlap()));
        jiVar.W(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final LayerDrawable r() {
        if (this.b == null) {
            this.p = new g33(this.c);
            this.b = new RippleDrawable(this.q, null, this.p);
        }
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.b, this.n, this.m});
        FocusRingDrawable.v(this.g.getContext(), layerDrawable2, this.p);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.s = layerDrawable2;
        return layerDrawable2;
    }

    public final boolean t() {
        MaterialCardView materialCardView = this.g;
        return materialCardView.getPreventCornerOverlap() && this.r.i() && materialCardView.getUseCompatPadding();
    }

    public final void v(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.s != null) {
            MaterialCardView materialCardView = this.g;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (t() ? g() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (t() ? g() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.j;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.x;
            int i7 = z ? ((i - i6) - this.l) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.l) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.l) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.l) - iCeil;
            }
            int i10 = i6;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.s.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void w() {
        boolean z = this.u;
        MaterialCardView materialCardView = this.g;
        if (!z) {
            materialCardView.setBackgroundInternal(n(this.r));
        }
        materialCardView.setForeground(n(this.a));
    }

    public final void x(boolean z, boolean z2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.d = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.d;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, f);
            this.h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new c61((Object) this, (byte) 2));
            this.h.setInterpolator(this.o);
            this.h.setDuration((long) ((z ? this.f : this.k) * f2));
            this.h.start();
        }
    }
}
