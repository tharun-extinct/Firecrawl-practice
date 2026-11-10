package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.google.android.material.button.MaterialButton;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class rp2 {
    public static int g = 1;
    public static final o05 y = new o05(new sx1(10));
    public static final o05 r = new o05(new sx1(11));
    public static final o05 n = new o05(new sx1(12));
    public static final o05 v = new o05(new sx1(13));
    public static final short x = 179;
    public static final short l = 180;
    public static final short j = 181;
    public static final short t = 182;
    public static final short a = 205;
    public static final short m = 226;
    public static final short q = 233;
    public static final short w = 234;
    public static final short c = 547;
    public static final byte i = 64;
    public static final byte b = 48;

    public static final yp1 a(s04 s04Var, Context context) {
        s04Var.getClass();
        int i2 = s04Var.w;
        int iT = i2 > 0 ? t(context, i2) : -2;
        int i3 = s04Var.m;
        yp1 yp1Var = new yp1(iT);
        yp1Var.t(s04Var.t);
        yp1Var.l(s04Var.a);
        yp1Var.r(i3);
        float f = s04Var.c;
        if (f <= 0.0f) {
            f = -1.0f;
        }
        yp1Var.n(f);
        int iT2 = t(context, 2);
        yp1Var.setMargins(iT2, iT2, iT2, iT2);
        return yp1Var;
    }

    public static final void g(MaterialButton materialButton, r04 r04Var) {
        materialButton.setTag(r04Var);
        o04 o04VarZ = r04Var.z();
        String str = null;
        if (o04VarZ.w != 0) {
            Drawable drawable = materialButton.getContext().getDrawable(c33.values()[o04VarZ.w].j);
            if (drawable != null) {
                Context context = materialButton.getContext();
                context.getClass();
                materialButton.setIconSize(t(context, 24));
                materialButton.setIconPadding(0);
                materialButton.setIcon(drawable);
                materialButton.setIconGravity(2);
            }
        } else {
            materialButton.setIcon(null);
        }
        if (materialButton.getIcon() == null) {
            String str2 = o04VarZ.m;
            str = tx4.Y(str2) ? o04VarZ.t[0].m : str2;
        }
        materialButton.setText(str);
    }

    public static final p04 j(p04 p04Var) {
        r04[] r04VarArr = p04Var.a;
        r04VarArr.getClass();
        for (r04 r04Var : r04VarArr) {
            if (r04Var.t == 3 && !r04Var.q.t) {
                return p04Var;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r04[] r04VarArr2 = p04Var.a;
        r04VarArr2.getClass();
        for (r04 r04Var2 : r04VarArr2) {
            byte b2 = r04Var2.t;
            if (b2 == 2) {
                r04Var2.q.m = 2;
                arrayList2.add(r04Var2);
            } else if (b2 == 3) {
                arrayList.add(n(0.0f, 0, false, 0, (r04[]) arrayList2.toArray(new r04[0]), 0, 191));
                arrayList2.clear();
                s04 s04Var = new s04();
                s04Var.a = 1.0f;
                s04Var.m = -1;
                r04Var2.q = s04Var;
                arrayList.add(r04Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(n(0.0f, 0, false, 0, (r04[]) arrayList2.toArray(new r04[0]), 0, 191));
        }
        p04 p04Var2 = new p04();
        p04Var2.m = 2;
        p04Var2.i = 0;
        p04Var2.q = 2;
        p04Var2.w = 4;
        p04Var2.c = 2;
        p04Var2.a = (r04[]) arrayList.toArray(new r04[0]);
        return p04Var2;
    }

    public static MaterialButton l(Context context, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if (i3 == Color.parseColor("#f44336")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Red;
            } else if (i3 == Color.parseColor("#e91e63")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Pink;
            } else if (i3 == Color.parseColor("#9c27b0")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Purple;
            } else if (i3 == Color.parseColor("#673ab7")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_DeepPurple;
            } else if (i3 == Color.parseColor("#3f51b5")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Indigo;
            } else if (i3 == Color.parseColor("#2196f3")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Blue;
            } else if (i3 == Color.parseColor("#03a9f4")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_LightBlue;
            } else if (i3 == Color.parseColor("#00bcd4")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Cyan;
            } else if (i3 == Color.parseColor("#009688")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Teal;
            } else if (i3 == Color.parseColor("#4caf50")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Green;
            } else if (i3 == Color.parseColor("#8bc34a")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_LightGreen;
            } else if (i3 == Color.parseColor("#cddc39")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Lime;
            } else if (i3 == Color.parseColor("#ffeb3b")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Yellow;
            } else if (i3 == Color.parseColor("#ffc107")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Amber;
            } else if (i3 == Color.parseColor("#ff9800")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Orange;
            } else if (i3 == Color.parseColor("#ff5722")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_DeepOrange;
            } else if (i3 == Color.parseColor("#795548")) {
                i4 = R.style.ThemeOverlay_PrimaryPalette_Brown;
            } else {
                i4 = (i3 != Color.parseColor("#9e9e9e") && i3 == Color.parseColor("#607d8b")) ? R.style.ThemeOverlay_PrimaryPalette_BlueGrey : 2132018223;
            }
            context = new ContextThemeWrapper(context, i4);
        }
        int i5 = R.attr.buttonStyleDefaultButton;
        if (i2 != 0) {
            if (i2 == 1) {
                i5 = R.attr.buttonStyleContainedButton;
            } else if (i2 == 2) {
                i5 = R.attr.buttonStyleOutlinedButton;
            } else if (i2 == 3) {
                i5 = R.attr.buttonStyleTextButton;
            }
        }
        MaterialButton materialButton = new MaterialButton(context, null, i5);
        materialButton.setTextSize(2, 18.0f);
        return materialButton;
    }

    public static final wp1 m(s04 s04Var, Context context) {
        int i2 = s04Var.w;
        int iT = i2 > 0 ? t(context, i2) : -2;
        int i3 = s04Var.m;
        wp1 wp1Var = new wp1(iT);
        wp1Var.s = s04Var.t;
        wp1Var.t = s04Var.a;
        wp1Var.m = i3;
        float f = s04Var.c;
        if (f <= 0.0f) {
            f = -1.0f;
        }
        wp1Var.q = f;
        return wp1Var;
    }

    public static r04 n(float f, int i2, boolean z, int i3, r04[] r04VarArr, int i4, int i5) {
        if ((i5 & 1) != 0) {
            f = 0.0f;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        int i6 = (i5 & 4) != 0 ? 1 : 0;
        if ((i5 & 8) != 0) {
            z = false;
        }
        if ((i5 & 16) != 0) {
            i3 = 0;
        }
        boolean z2 = (i5 & 32) == 0;
        if ((i5 & 128) != 0) {
            i4 = g;
            g = i4 + 1;
        }
        r04VarArr.getClass();
        r04 r04Var = new r04();
        r04Var.m = i4;
        s04 s04Var = new s04();
        s04Var.a = f;
        s04Var.m = 4;
        s04Var.t = z;
        r04Var.q = s04Var;
        p04 p04Var = new p04();
        p04Var.m = i2;
        p04Var.i = i6;
        p04Var.q = 2;
        p04Var.w = 4;
        p04Var.c = 5;
        p04Var.s = z2;
        p04Var.a = r04VarArr;
        if (i3 != 0) {
            u04 u04Var = new u04();
            u04Var.t = (byte) 1;
            u04Var.a = Integer.valueOf(i3);
            p04Var.b = u04Var;
        }
        r04Var.t = (byte) 1;
        r04Var.a = p04Var;
        return r04Var;
    }

    public static r04 r(qi2 qi2Var, String str, int[] iArr, int i2, c33 c33Var, float f, int i3) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        if ((i3 & 32) != 0) {
            c33Var = c33.t;
        }
        if ((i3 & 64) != 0) {
            f = 0.0f;
        }
        boolean z = (i3 & 128) == 0;
        boolean z2 = (i3 & 256) == 0;
        c33Var.getClass();
        r04 r04Var = new r04();
        int i4 = g;
        g = i4 + 1;
        r04Var.m = i4;
        r04Var.c = z2;
        s04 s04Var = new s04();
        s04Var.a = f;
        s04Var.t = z;
        s04Var.m = 4;
        r04Var.q = s04Var;
        o04 o04Var = new o04();
        o04Var.m = str;
        o04Var.q = i2;
        o04Var.w = c33Var.ordinal();
        n04 n04Var = new n04();
        int iOrdinal = qi2Var.ordinal();
        if (iOrdinal == 0) {
            l04 l04Var = new l04();
            l04Var.t = iArr;
            n04Var.t = (byte) 2;
            n04Var.a = l04Var;
        } else if (iOrdinal == 1) {
            k04 k04Var = new k04();
            k04Var.t = iArr[0];
            n04Var.t = (byte) 1;
            n04Var.a = k04Var;
        } else {
            if (iOrdinal != 2) {
                uo1.g();
                return null;
            }
            int i5 = iArr[0];
            n04Var.t = (byte) 5;
            n04Var.a = Integer.valueOf(i5);
        }
        o04Var.t = new n04[]{n04Var};
        r04Var.t = (byte) 2;
        r04Var.a = o04Var;
        return r04Var;
    }

    public static final int t(Context context, int i2) {
        return (int) (context.getResources().getDisplayMetrics().density * i2);
    }

    public static final w75 v(q04 q04Var) {
        return new w75(q04Var != null ? q04Var.q : null, R.string.control_custom);
    }

    public static final r04 x() {
        r04 r04Var = new r04();
        v04 v04Var = new v04();
        v04Var.a = true;
        v04Var.q = true;
        v04Var.c = true;
        r04Var.t = (byte) 3;
        r04Var.a = v04Var;
        s04 s04Var = new s04();
        s04Var.t = true;
        s04Var.m = -1;
        s04Var.w = 240;
        s04Var.c = 1.0f;
        r04Var.q = s04Var;
        return r04Var;
    }

    public static final q04 y() {
        p04 p04Var = new p04();
        p04Var.m = 0;
        p04Var.i = 1;
        p04Var.q = 2;
        p04Var.w = 2;
        p04Var.c = 2;
        p04Var.a = new r04[0];
        q04 q04Var = new q04();
        q04Var.m = 3;
        q04Var.t = (byte) 6;
        q04Var.a = p04Var;
        return q04Var;
    }
}
