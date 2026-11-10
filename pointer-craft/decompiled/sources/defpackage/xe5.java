package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe5 {
    public static final zq2 g;
    public static Paint r;
    public static final kz2 y;

    static {
        lr2.w("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            g = new ef5();
        } else if (i >= 29) {
            g = new df5();
        } else if (i >= 28) {
            g = new cf5();
        } else if (i >= 26) {
            g = new bf5();
        } else if (ze5.M()) {
            g = new ze5();
        } else {
            g = new ye5();
        }
        y = new kz2(16);
        r = null;
        Trace.endSection();
    }

    public static Typeface g(Context context, ev1 ev1Var, Resources resources, int i, String str, int i2, int i3, jr2 jr2Var, boolean z) {
        Typeface typefaceY;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        boolean z2 = ev1Var instanceof hv1;
        byte b = 6;
        kz2 kz2Var = y;
        if (z2) {
            hv1 hv1Var = (hv1) ev1Var;
            ArrayList arrayList = hv1Var.g;
            String str2 = hv1Var.n;
            byte b2 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = r(str2)) == null) {
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderV = null;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList.size()) {
                                        xu1 xu1Var = (xu1) arrayList.get(i5);
                                        if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(xu1Var.x)) {
                                            customFallbackBuilderV.setSystemFallback(xu1Var.v);
                                        } else {
                                            String str3 = xu1Var.v;
                                            String str4 = xu1Var.x;
                                            Font fontN = n(r(str3));
                                            if (fontN == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + xu1Var.v + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = d42.h(fontN).build();
                                                } else {
                                                    try {
                                                        d42.l();
                                                        we5.j();
                                                        fontFamilyBuild = d42.x(ka4.n(fontN).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderV == null) {
                                                    customFallbackBuilderV = d42.v(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderV.addCustomFallback(fontFamilyBuild);
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderV.build();
                                    break;
                                }
                            }
                            if (r(((xu1) arrayList.get(i4)).v) != null) {
                                i4++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = r(((xu1) arrayList.get(0)).v);
            }
            if (typefaceBuild != null) {
                if (jr2Var != null) {
                    new Handler(Looper.getMainLooper()).post(new va(jr2Var, typefaceBuild, b));
                }
                kz2Var.n(y(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z3 = !z ? jr2Var != null : hv1Var.r != 0;
            int i6 = z ? hv1Var.y : -1;
            rk4 rk4Var = new rk4((Object) new ha5(jr2Var, b2), (Object) qe6.y(new Handler(Looper.getMainLooper())), (byte) 7);
            if (!z3) {
                typefaceY = dv1.r(context, arrayList, i3, rk4Var);
            } else {
                if (arrayList.size() > 1) {
                    l0.u("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                typefaceY = dv1.n(context, (xu1) arrayList.get(0), rk4Var, i3, i6);
            }
        } else {
            typefaceY = g.y(context, (fv1) ev1Var, resources, i3);
            if (jr2Var != null) {
                if (typefaceY != null) {
                    new Handler(Looper.getMainLooper()).post(new va(jr2Var, typefaceY, b));
                } else {
                    jr2Var.x(-3);
                }
            }
        }
        if (typefaceY != null) {
            kz2Var.n(y(resources, i, str, i2, i3), typefaceY);
        }
        return typefaceY;
    }

    public static Font n(Typeface typeface) {
        Paint paint = r;
        if (paint == null) {
            paint = new Paint();
            r = paint;
        }
        paint.setTextSize(10.0f);
        r.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, r);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static Typeface r(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static String y(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
