package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class al {
    public int g;
    public Object n;
    public Object r;
    public Object v;
    public Object x;
    public Object y;

    public al() {
        this.y = new i72[32];
        this.r = new float[32];
        this.n = new byte[32];
        ib3 ib3Var = fe4.g;
        this.v = new ib3();
        this.x = new ib3();
    }

    public void a(ColorStateList colorStateList) {
        ic3 ic3Var = (ic3) this.v;
        if (ic3Var == null) {
            ic3Var = new ic3();
            this.v = ic3Var;
        }
        ic3Var.r = colorStateList;
        ic3Var.y = true;
        g();
    }

    public void g() {
        View view = (View) this.y;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((ic3) this.n) != null) {
                ic3 ic3Var = (ic3) this.x;
                if (ic3Var == null) {
                    ic3Var = new ic3();
                    this.x = ic3Var;
                }
                ic3Var.r = null;
                ic3Var.y = false;
                ic3Var.n = null;
                ic3Var.g = false;
                WeakHashMap weakHashMap = xk5.g;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    ic3Var.y = true;
                    ic3Var.r = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    ic3Var.g = true;
                    ic3Var.n = backgroundTintMode;
                }
                if (ic3Var.y || ic3Var.g) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = wl.y;
                    s74.j(background, ic3Var, drawableState);
                    return;
                }
            }
            ic3 ic3Var2 = (ic3) this.v;
            if (ic3Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = wl.y;
                s74.j(background, ic3Var2, drawableState2);
            } else {
                ic3 ic3Var3 = (ic3) this.n;
                if (ic3Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = wl.y;
                    s74.j(background, ic3Var3, drawableState3);
                }
            }
        }
    }

    public void j(i72 i72Var) {
        int iB0 = pr.b0((i72[]) this.y, i72Var);
        if (iB0 >= 0) {
            i72[] i72VarArr = (i72[]) this.y;
            int i = iB0 + 1;
            pr.O(i72VarArr, i72VarArr, iB0, i, this.g);
            i72[] i72VarArr2 = (i72[]) this.y;
            int i2 = this.g;
            i72VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.r;
            System.arraycopy(fArr, i, fArr, iB0, i2 - i);
            byte[] bArr = (byte[]) this.n;
            pr.L(iB0, i, this.g, bArr, bArr);
            this.g--;
        }
    }

    public void l(int i) {
        ColorStateList colorStateListX;
        this.g = i;
        wl wlVar = (wl) this.r;
        if (wlVar != null) {
            Context context = ((View) this.y).getContext();
            synchronized (wlVar) {
                colorStateListX = wlVar.g.x(context, i);
            }
        } else {
            colorStateListX = null;
        }
        t(colorStateListX);
        g();
    }

    public void m(PorterDuff.Mode mode) {
        ic3 ic3Var = (ic3) this.v;
        if (ic3Var == null) {
            ic3Var = new ic3();
            this.v = ic3Var;
        }
        ic3Var.n = mode;
        ic3Var.g = true;
        g();
    }

    public void n(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListX;
        View view = (View) this.y;
        Context context = view.getContext();
        int[] iArr = r24.d;
        ro roVarP = ro.P(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) roVarP.t;
        View view2 = (View) this.y;
        xk5.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) roVarP.t, i);
        try {
            if (typedArray.hasValue(0)) {
                this.g = typedArray.getResourceId(0, -1);
                wl wlVar = (wl) this.r;
                Context context2 = view.getContext();
                int i2 = this.g;
                synchronized (wlVar) {
                    colorStateListX = wlVar.g.x(context2, i2);
                }
                if (colorStateListX != null) {
                    t(colorStateListX);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(roVarP.s(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(fe1.y(typedArray.getInt(2, -1), null));
            }
            roVarP.S();
        } catch (Throwable th) {
            roVarP.S();
            throw th;
        }
    }

    public PorterDuff.Mode r() {
        ic3 ic3Var = (ic3) this.v;
        if (ic3Var != null) {
            return (PorterDuff.Mode) ic3Var.n;
        }
        return null;
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ic3 ic3Var = (ic3) this.n;
            if (ic3Var == null) {
                ic3Var = new ic3();
                this.n = ic3Var;
            }
            ic3Var.r = colorStateList;
            ic3Var.y = true;
        } else {
            this.n = null;
        }
        g();
    }

    public zc3 v(String str) {
        yc3 yc3Var;
        str.getClass();
        o05 o05Var = (o05) this.x;
        if (o05Var == null || (yc3Var = (yc3) o05Var.getValue()) == null) {
            return null;
        }
        int i = ad3.q;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleN = yc3Var.n(uri, (LinkedHashMap) this.n);
        if (bundleN == null) {
            return null;
        }
        return new zc3((ad3) this.y, bundleN, yc3Var.q, yc3Var.y(uri), false, -1);
    }

    public void x() {
        this.g = -1;
        t(null);
        g();
    }

    public ColorStateList y() {
        ic3 ic3Var = (ic3) this.v;
        if (ic3Var != null) {
            return (ColorStateList) ic3Var.r;
        }
        return null;
    }

    public al(View view) {
        this.g = -1;
        this.y = view;
        this.r = wl.g();
    }
}
