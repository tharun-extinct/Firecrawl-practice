package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s74 {
    public static s74 l;
    public WeakHashMap g;
    public boolean n;
    public TypedValue r;
    public vl v;
    public final WeakHashMap y = new WeakHashMap(0);
    public static final PorterDuff.Mode x = PorterDuff.Mode.SRC_IN;
    public static final r74 j = new r74(6);

    public static void j(Drawable drawable, ic3 ic3Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = ic3Var.y;
        if (!z && !ic3Var.g) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterV = null;
        ColorStateList colorStateList = z ? (ColorStateList) ic3Var.r : null;
        PorterDuff.Mode mode = ic3Var.g ? (PorterDuff.Mode) ic3Var.n : x;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterV = v(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterV);
    }

    public static synchronized PorterDuffColorFilter v(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        r74 r74Var = j;
        r74Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) r74Var.r(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized s74 y() {
        s74 s74Var;
        s74Var = l;
        if (s74Var == null) {
            s74Var = new s74();
            l = s74Var;
        }
        return s74Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable g(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableW;
        TypedValue typedValue = this.r;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.r = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            uy2 uy2Var = (uy2) this.y.get(context);
            obj = null;
            if (uy2Var != null && (weakReference = (WeakReference) uy2Var.y(j2)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    uy2Var.x(j2);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.v == null) {
            layerDrawableW = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableW = new LayerDrawable(new Drawable[]{r(context, R.drawable.abc_cab_background_internal_bg), r(context, 2131230779)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableW = vl.w(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableW = vl.w(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableW = vl.w(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableW = null;
        }
        if (layerDrawableW == null) {
            return layerDrawableW;
        }
        layerDrawableW.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableW.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableW;
                }
                uy2 uy2Var2 = (uy2) this.y.get(context);
                if (uy2Var2 == null) {
                    uy2Var2 = new uy2(obj);
                    this.y.put(context, uy2Var2);
                }
                uy2Var2.v(j2, new WeakReference(constantState2));
                return layerDrawableW;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    public final Drawable l(Context context, int i, boolean z, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListX = x(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListX != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListX);
            if (this.v != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        vl vlVar = this.v;
        int i2 = R.attr.colorControlNormal;
        if (vlVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iR = t85.r(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = wl.y;
                vl.i(drawableFindDrawableByLayerId, iR, mode2);
                vl.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), t85.r(context, R.attr.colorControlNormal), mode2);
                vl.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), t85.r(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iY = t85.y(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = wl.y;
                vl.i(drawableFindDrawableByLayerId2, iY, mode3);
                vl.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), t85.r(context, R.attr.colorControlActivated), mode3);
                vl.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), t85.r(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (vlVar != null) {
            PorterDuff.Mode mode4 = wl.y;
            boolean z2 = true;
            if (vl.a((int[]) vlVar.g, i)) {
                iRound = -1;
            } else {
                if (vl.a((int[]) vlVar.r, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = vl.a((int[]) vlVar.n, i);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230799) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z2 = false;
                    }
                }
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(wl.r(t85.r(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }

    public final synchronized Drawable n(Context context, int i, boolean z) {
        Drawable drawableG;
        try {
            if (!this.n) {
                this.n = true;
                Drawable drawableR = r(context, R.drawable.abc_vector_test);
                if (drawableR == null || (!(drawableR instanceof dj5) && !"android.graphics.drawable.VectorDrawable".equals(drawableR.getClass().getName()))) {
                    this.n = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableG = g(context, i);
            if (drawableG == null) {
                drawableG = context.getDrawable(i);
            }
            if (drawableG != null) {
                drawableG = l(context, i, z, drawableG);
            }
            if (drawableG != null) {
                fe1.g(drawableG);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableG;
    }

    public final synchronized Drawable r(Context context, int i) {
        return n(context, i, false);
    }

    public final synchronized ColorStateList x(Context context, int i) {
        ColorStateList colorStateList;
        nu4 nu4Var;
        WeakHashMap weakHashMap = this.g;
        ColorStateList colorStateListC = null;
        colorStateList = (weakHashMap == null || (nu4Var = (nu4) weakHashMap.get(context)) == null) ? null : (ColorStateList) c93.o(nu4Var, i);
        if (colorStateList == null) {
            vl vlVar = this.v;
            if (vlVar != null) {
                colorStateListC = vlVar.c(context, i);
            }
            if (colorStateListC != null) {
                WeakHashMap weakHashMap2 = this.g;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.g = weakHashMap2;
                }
                nu4 nu4Var2 = (nu4) weakHashMap2.get(context);
                if (nu4Var2 == null) {
                    nu4Var2 = new nu4(0);
                    this.g.put(context, nu4Var2);
                }
                nu4Var2.g(i, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }
}
