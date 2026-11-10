package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import io.appground.blek.R;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vl implements cm0 {
    public Object g;
    public Object n;
    public Object r;
    public Object v;
    public Object x;
    public Object y;

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void i(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = wl.y;
        }
        drawableMutate.setColorFilter(wl.r(i, mode));
    }

    public static ColorStateList q(Context context, int i) {
        int iR = t85.r(context, R.attr.colorControlHighlight);
        int iY = t85.y(context, R.attr.colorButtonNormal);
        int[] iArr = t85.y;
        int[] iArr2 = t85.n;
        int iY2 = zj0.y(iR, i);
        return new ColorStateList(new int[][]{iArr, iArr2, t85.r, t85.x}, new int[]{iY, iY2, zj0.y(iR, i), i});
    }

    public static LayerDrawable w(s74 s74Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableR = s74Var.r(context, R.drawable.abc_star_black_48dp);
        Drawable drawableR2 = s74Var.r(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableR instanceof BitmapDrawable) && drawableR.getIntrinsicWidth() == dimensionPixelSize && drawableR.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableR;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableR.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableR.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableR2 instanceof BitmapDrawable) && drawableR2.getIntrinsicWidth() == dimensionPixelSize && drawableR2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableR2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableR2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableR2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public ColorStateList c(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ue5.R(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230828) {
            return ue5.R(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return q(context, t85.r(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return q(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return q(context, t85.r(context, R.attr.colorAccent));
            }
            if (i == 2131230823 || i == R.drawable.abc_spinner_textfield_background_material) {
                return ue5.R(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.y, i)) {
                return t85.n(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.v, i)) {
                return ue5.R(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.x, i)) {
                return ue5.R(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return ue5.R(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListN = t85.n(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListN == null || !colorStateListN.isStateful()) {
            iArr[0] = t85.y;
            iArr2[0] = t85.y(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = t85.v;
            iArr2[1] = t85.r(context, R.attr.colorControlActivated);
            iArr[2] = t85.x;
            iArr2[2] = t85.r(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = t85.y;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListN.getColorForState(iArr3, 0);
            iArr[1] = t85.v;
            iArr2[1] = t85.r(context, R.attr.colorControlActivated);
            iArr[2] = t85.x;
            iArr2[2] = colorStateListN.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.cm0
    public Object g(Class cls) {
        if (!((Set) this.g).contains(e24.g(cls))) {
            uo1.k(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objG = ((cm0) this.x).g(cls);
        if (!cls.equals(s14.class)) {
            return objG;
        }
        return new d84();
    }

    @Override // defpackage.cm0
    public Object j(e24 e24Var) {
        if (((Set) this.g).contains(e24Var)) {
            return ((cm0) this.x).j(e24Var);
        }
        uo1.k(e24Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.cm0
    public n14 l(e24 e24Var) {
        if (((Set) this.y).contains(e24Var)) {
            return ((cm0) this.x).l(e24Var);
        }
        uo1.k(e24Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    public ju m() {
        String strConcat = ((String) this.g) == null ? " transportName" : "";
        if (((aj1) this.r) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.n) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.v) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.x) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new ju((String) this.g, (Integer) this.y, (aj1) this.r, ((Long) this.n).longValue(), ((Long) this.v).longValue(), (HashMap) this.x);
        }
        l0.z("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.cm0
    public Set n(e24 e24Var) {
        if (((Set) this.n).contains(e24Var)) {
            return ((cm0) this.x).n(e24Var);
        }
        uo1.k(e24Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.cm0
    public n14 r(e24 e24Var) {
        if (((Set) this.v).contains(e24Var)) {
            return ((cm0) this.x).r(e24Var);
        }
        uo1.k(e24Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public void t(String str, String str2) {
        HashMap map = (HashMap) this.x;
        if (map != null) {
            map.put(str, str2);
        } else {
            l0.z("Property \"autoMetadata\" has not been set");
        }
    }

    @Override // defpackage.cm0
    public n14 v(Class cls) {
        return l(e24.g(cls));
    }

    @Override // defpackage.cm0
    public rm3 x(e24 e24Var) {
        if (((Set) this.r).contains(e24Var)) {
            return ((cm0) this.x).x(e24Var);
        }
        uo1.k(e24Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // defpackage.cm0
    public rm3 y() {
        return x(e24.g(nf2.class));
    }
}
