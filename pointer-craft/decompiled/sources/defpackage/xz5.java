package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xz5 {
    public static final nm0 g = new nm0(-189562046, false, new gn0(6));

    public static e43 g(String str) {
        str.getClass();
        c23 c23VarY = e43.r.y(str, 0);
        if (c23VarY == null) {
            up.m("No subtype found for: \"", str, 34);
            return null;
        }
        a23 a23Var = c23VarY.n;
        if (a23Var == null) {
            a23Var = new a23(c23VarY);
            c23VarY.n = a23Var;
        }
        String str2 = (String) a23Var.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        a23 a23Var2 = c23VarY.n;
        if (a23Var2 == null) {
            a23Var2 = new a23(c23VarY);
            c23VarY.n = a23Var2;
        }
        String lowerCase2 = ((String) a23Var2.get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = c23VarY.g().t;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new e43(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            c23 c23VarY2 = e43.n.y(str, i2);
            if (c23VarY2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            b23 b23Var = c23VarY2.r;
            z13 z13VarY = b23Var.y(1);
            String str3 = z13VarY != null ? z13VarY.g : null;
            if (str3 == null) {
                i = c23VarY2.g().t;
            } else {
                z13 z13VarY2 = b23Var.y(2);
                String strSubstring = z13VarY2 != null ? z13VarY2.g : null;
                if (strSubstring == null) {
                    z13 z13VarY3 = b23Var.y(3);
                    z13VarY3.getClass();
                    strSubstring = z13VarY3.g;
                } else if (strSubstring.length() > 0 && a11.b(strSubstring.charAt(0), '\'', false) && strSubstring.length() > 0 && a11.b(strSubstring.charAt(strSubstring.length() - 1), '\'', false) && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = c23VarY2.g().t;
            }
        }
    }

    public static final int y(int i, int i2) {
        return (i >> i2) & 31;
    }
}
