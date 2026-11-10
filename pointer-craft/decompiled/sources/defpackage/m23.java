package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class m23 {
    public int a;
    public ColorStateList c;
    public final MaterialButton g;
    public RippleDrawable h;
    public g33 i;
    public int j;
    public int l;
    public PorterDuff.Mode m;
    public d5 n;
    public int o;
    public ColorStateList q;
    public xu4 r;
    public int t;
    public boolean u;
    public int v;
    public ColorStateList w;
    public int x;
    public dn4 y;
    public boolean b = false;
    public boolean s = false;
    public boolean p = false;
    public boolean z = true;

    public m23(MaterialButton materialButton, dn4 dn4Var) {
        this.g = materialButton;
        this.y = dn4Var;
    }

    public final g33 g(boolean z) {
        RippleDrawable rippleDrawable = this.h;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g33) ((LayerDrawable) ((InsetDrawable) this.h.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void n() {
        sn4 sn4Var;
        g33 g33VarG = g(false);
        if (g33VarG != null) {
            g33VarG.h(this.y);
            xu4 xu4Var = this.r;
            if (xu4Var != null) {
                g33VarG.b(xu4Var);
            }
        }
        g33 g33VarG2 = g(true);
        if (g33VarG2 != null) {
            g33VarG2.h(this.y);
            xu4 xu4Var2 = this.r;
            if (xu4Var2 != null) {
                g33VarG2.b(xu4Var2);
            }
        }
        RippleDrawable rippleDrawable = this.h;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof sn4) {
                sn4Var = (sn4) objFindDrawableByLayerId;
            } else {
                sn4Var = null;
            }
        } else {
            sn4Var = null;
        }
        if (sn4Var != null) {
            boolean z = sn4Var instanceof g33;
            dn4 dn4Var = this.y;
            if (!z) {
                sn4Var.setShapeAppearanceModel(dn4Var.n());
                return;
            }
            g33 g33Var = (g33) sn4Var;
            g33Var.h(dn4Var);
            xu4 xu4Var3 = this.r;
            if (xu4Var3 != null) {
                g33Var.b(xu4Var3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a A[LOOP:0: B:41:0x0108->B:46:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116 A[SYNTHETIC] */
    public final void r() {
        LayerDrawable layerDrawable;
        Drawable drawable;
        g33 g33Var = new g33(this.y);
        xu4 xu4Var = this.r;
        if (xu4Var != null) {
            g33Var.b(xu4Var);
        }
        d5 d5Var = this.n;
        if (d5Var != null) {
            g33Var.K = d5Var;
        }
        MaterialButton materialButton = this.g;
        Context context = materialButton.getContext();
        g33Var.c(context);
        g33Var.setTintList(this.q);
        PorterDuff.Mode mode = this.m;
        if (mode != null) {
            g33Var.setTintMode(mode);
        }
        float f = this.a;
        ColorStateList colorStateList = this.w;
        g33Var.t.a = f;
        g33Var.invalidateSelf();
        e33 e33Var = g33Var.t;
        if (e33Var.n != colorStateList) {
            e33Var.n = colorStateList;
            g33Var.onStateChange(g33Var.getState());
        }
        g33 g33Var2 = new g33(this.y);
        xu4 xu4Var2 = this.r;
        if (xu4Var2 != null) {
            g33Var2.b(xu4Var2);
        }
        g33Var2.setTint(0);
        float f2 = this.a;
        int iB = this.b ? xq2.B(materialButton.getContext(), mq2.f(materialButton, io.appground.blek.R.attr.colorSurface)) : 0;
        g33Var2.t.a = f2;
        g33Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        e33 e33Var2 = g33Var2.t;
        if (e33Var2.n != colorStateListValueOf) {
            e33Var2.n = colorStateListValueOf;
            g33Var2.onStateChange(g33Var2.getState());
        }
        g33 g33Var3 = new g33(this.y);
        this.i = g33Var3;
        xu4 xu4Var3 = this.r;
        if (xu4Var3 != null) {
            g33Var3.b(xu4Var3);
        }
        this.i.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(n94.g(this.c), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{g33Var2, g33Var}), this.v, this.l, this.x, this.j), this.i);
        this.h = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.v(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.h);
        g33 g33VarG = g(false);
        if (g33VarG != null) {
            g33VarG.s(this.o);
            g33VarG.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) background).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable2;
            } else if (background instanceof LayerDrawable) {
                layerDrawable = (LayerDrawable) background;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    drawable = layerDrawable.getDrawable(i);
                    if (drawable instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable;
                        break;
                    }
                }
            }
        } else if (background instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) background;
            while (i < layerDrawable.getNumberOfLayers()) {
                drawable = layerDrawable.getDrawable(i);
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                    break;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.i = new WeakReference(g33VarG);
        }
    }

    public final void v() {
        int iB = 0;
        g33 g33VarG = g(false);
        g33 g33VarG2 = g(true);
        if (g33VarG != null) {
            float f = this.a;
            ColorStateList colorStateList = this.w;
            g33VarG.t.a = f;
            g33VarG.invalidateSelf();
            e33 e33Var = g33VarG.t;
            if (e33Var.n != colorStateList) {
                e33Var.n = colorStateList;
                g33VarG.onStateChange(g33VarG.getState());
            }
            if (g33VarG2 != null) {
                float f2 = this.a;
                if (this.b) {
                    MaterialButton materialButton = this.g;
                    iB = xq2.B(materialButton.getContext(), mq2.f(materialButton, io.appground.blek.R.attr.colorSurface));
                }
                g33VarG2.t.a = f2;
                g33VarG2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
                e33 e33Var2 = g33VarG2.t;
                if (e33Var2.n != colorStateListValueOf) {
                    e33Var2.n = colorStateListValueOf;
                    g33VarG2.onStateChange(g33VarG2.getState());
                }
            }
        }
    }

    public final void y(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.g;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.v;
        int i6 = this.l;
        int i7 = this.x;
        int i8 = this.j;
        this.v = i;
        this.l = i2;
        this.x = i3;
        this.j = i4;
        if (!this.s) {
            r();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }
}
