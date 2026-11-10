package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class u70 {
    public static final /* synthetic */ int g = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            t70.g(30);
        }
        if (i >= 30) {
            t70.g(31);
        }
        if (i >= 30) {
            t70.g(33);
        }
        if (i >= 30) {
            t70.g(1000000);
        }
    }

    public static final boolean g(String str) {
        String str2 = Build.VERSION.CODENAME;
        Integer num = 0;
        str2.getClass();
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            upperCase.getClass();
            Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            upperCase2.getClass();
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num2 == null || num == null) {
                if (num2 == null && num == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    upperCase3.getClass();
                    String upperCase4 = str.toUpperCase(locale);
                    upperCase4.getClass();
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num2 != null) {
                    return true;
                }
            } else if (num2.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        Build.VERSION.CODENAME.getClass();
        return g("S");
    }
}
