package defpackage;

import android.graphics.Shader;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mz5 {
    public static final nm0 g = new nm0(-1898378281, false, new an0(7));
    public static final nm0 y = new nm0(1528664474, false, new an0(8));
    public static final nm0 r = new nm0(827239616, false, new an0(20));
    public static final nm0 n = new nm0(-24588861, false, new an0(26));
    public static final nm0 v = new nm0(420444048, false, new at(18));
    public static final nm0 x = new nm0(-1000518063, false, new at(19));
    public static final nm0 l = new nm0(-19767281, false, new at(20));
    public static final nm0 j = new nm0(-108525813, false, new an0(28));
    public static final nm0 t = new nm0(-1765634070, false, new an0(29));
    public static final nm0 a = new nm0(-961188930, false, new bn0(0));
    public static final nm0 m = new nm0(2040406439, false, new an0(18));
    public static final nm0 q = new nm0(1112665362, false, new an0(27));
    public static final nm0 w = new nm0(453001054, false, new at(21));
    public static final nm0 c = new nm0(1433955868, false, new at(22));
    public static final nm0 i = new nm0(-2083150217, false, new bn0(1));
    public static final nm0 b = new nm0(501713232, false, new at(23));
    public static final nm0 s = new nm0(1482668046, false, new at(24));
    public static final nm0 p = new nm0(-377431798, false, new bn0(2));
    public static final nm0 u = new nm0(-1553229988, false, new bn0(3));
    public static final nm0 z = new nm0(1822051719, false, new an0(9));
    public static final nm0 h = new nm0(-1986918335, false, new an0(10));
    public static final nm0 o = new nm0(-1366815126, false, new an0(11));
    public static final nm0 f = new nm0(602865517, false, new an0(12));
    public static final nm0 k = new nm0(1231387169, false, new an0(13));
    public static final nm0 d = new nm0(13907556, false, new an0(14));
    public static final nm0 e = new nm0(1769387520, false, new an0(15));
    public static final nm0 A = new nm0(-1380711355, false, new an0(16));
    public static final nm0 B = new nm0(646958472, false, new an0(17));
    public static final nm0 C = new nm0(435613988, false, new an0(19));
    public static final nm0 D = new nm0(511932220, false, new an0(21));
    public static final nm0 E = new nm0(-812516417, false, new an0(22));
    public static final nm0 F = new nm0(-38229022, false, new an0(23));
    public static final nm0 G = new nm0(-1255708635, false, new an0(24));
    public static final nm0 H = new nm0(499771329, false, new an0(25));

    public static final a70 g(Shader shader) {
        return new a70(shader);
    }

    public static boolean n(Object obj) {
        return ((tv1) obj).n;
    }

    public static int r(Object obj) {
        return ((tv1) obj).r;
    }

    public static final Locale y(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (yf2.p(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
