package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class pm5 extends fb6 {
    public static boolean H = true;
    public static boolean I = true;
    public static boolean J = true;
    public static boolean K = true;

    public void a(ViewGroup viewGroup, Matrix matrix) {
        if (I) {
            try {
                mm5.r(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                I = false;
            }
        }
    }

    public void j(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (K) {
                try {
                    om5.g(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    K = false;
                    return;
                }
            }
            return;
        }
        if (!fb6.G) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                fb6.F = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            fb6.G = true;
        }
        Field field = fb6.F;
        if (field != null) {
            try {
                fb6.F.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void l(View view, int i, int i2, int i3, int i4) {
        if (J) {
            try {
                nm5.g(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                J = false;
            }
        }
    }

    public void t(View view, Matrix matrix) {
        if (H) {
            try {
                mm5.y(view, matrix);
            } catch (NoSuchMethodError unused) {
                H = false;
            }
        }
    }
}
