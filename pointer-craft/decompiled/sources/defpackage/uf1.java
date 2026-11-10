package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.appground.blek.MainActivity;
import io.appground.blek.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uf1 {
    public static final int[] g = {R.attr.dynamicColorThemeOverlay};
    public static final Map r;
    public static final Map y;

    static {
        rf1 rf1Var = new rf1();
        sf1 sf1Var = new sf1();
        HashMap map = new HashMap();
        map.put("fcnt", rf1Var);
        map.put("google", rf1Var);
        map.put("hmd global", rf1Var);
        map.put("infinix", rf1Var);
        map.put("infinix mobility limited", rf1Var);
        map.put("itel", rf1Var);
        map.put("kyocera", rf1Var);
        map.put("lenovo", rf1Var);
        map.put("lge", rf1Var);
        map.put("meizu", rf1Var);
        map.put("motorola", rf1Var);
        map.put("nothing", rf1Var);
        map.put("oneplus", rf1Var);
        map.put("oppo", rf1Var);
        map.put("realme", rf1Var);
        map.put("robolectric", rf1Var);
        map.put("samsung", sf1Var);
        map.put("sharp", rf1Var);
        map.put("shift", rf1Var);
        map.put("sony", rf1Var);
        map.put("tcl", rf1Var);
        map.put("tecno", rf1Var);
        map.put("tecno mobile limited", rf1Var);
        map.put("vivo", rf1Var);
        map.put("wingtech", rf1Var);
        map.put("xiaomi", rf1Var);
        y = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", rf1Var);
        map2.put("jio", rf1Var);
        r = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static void g(MainActivity mainActivity) {
        View viewPeekDecorView;
        Context context;
        Locale locale;
        tf1 tf1Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return;
        }
        int i2 = u70.g;
        if (i < 33) {
            if (i < 32) {
                String str = Build.MANUFACTURER;
                locale = Locale.ROOT;
                tf1Var = (tf1) y.get(str.toLowerCase(locale));
                if (tf1Var == null) {
                    tf1Var = (tf1) r.get(Build.BRAND.toLowerCase(locale));
                }
                if (tf1Var != null) {
                    return;
                } else {
                    return;
                }
            }
            Build.VERSION.CODENAME.getClass();
            if (!u70.g("Tiramisu")) {
                String str2 = Build.MANUFACTURER;
                locale = Locale.ROOT;
                tf1Var = (tf1) y.get(str2.toLowerCase(locale));
                if (tf1Var == null) {
                    tf1Var = (tf1) r.get(Build.BRAND.toLowerCase(locale));
                }
                if (tf1Var != null || !tf1Var.y()) {
                    return;
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes = mainActivity.obtainStyledAttributes(g);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        mainActivity.getTheme().applyStyle(resourceId, true);
        Window window = mainActivity.getWindow();
        Resources.Theme theme = (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) ? null : context.getTheme();
        if (theme != null) {
            theme.applyStyle(resourceId, true);
        }
    }
}
