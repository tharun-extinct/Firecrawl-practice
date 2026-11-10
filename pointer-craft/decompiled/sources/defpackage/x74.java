package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x74 {
    public static final ThreadLocal g = new ThreadLocal();
    public static final WeakHashMap y = new WeakHashMap(0);
    public static final Object r = new Object();

    public static Typeface g(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return y(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    public static Typeface y(Context context, int i, TypedValue typedValue, int i2, jr2 jr2Var, boolean z, boolean z2) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceG = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            kz2 kz2Var = xe5.y;
            Typeface typeface = (Typeface) kz2Var.r(xe5.y(resources, i, string, i3, i2));
            byte b = 6;
            if (typeface != null) {
                if (jr2Var != null) {
                    new Handler(Looper.getMainLooper()).post(new va(jr2Var, typeface, b));
                }
                typefaceG = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ev1 ev1VarO = k33.O(resources.getXml(i), resources);
                        if (ev1VarO == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (jr2Var != null) {
                                jr2Var.x(-3);
                            }
                        } else {
                            typefaceG = xe5.g(context, ev1VarO, resources, i, string, typedValue.assetCookie, i2, jr2Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceV = xe5.g.v(context, resources, i, string, i2);
                        if (typefaceV != null) {
                            kz2Var.n(xe5.y(resources, i, string, i4, i2), typefaceV);
                        }
                        if (jr2Var != null) {
                            if (typefaceV != null) {
                                new Handler(Looper.getMainLooper()).post(new va(jr2Var, typefaceV, b));
                            } else {
                                jr2Var.x(-3);
                            }
                        }
                        typefaceG = typefaceV;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (jr2Var != null) {
                        jr2Var.x(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (jr2Var != null) {
                        jr2Var.x(-3);
                    }
                }
            }
        } else if (jr2Var != null) {
            jr2Var.x(-3);
        }
        if (typefaceG != null || jr2Var != null || z2) {
            return typefaceG;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
