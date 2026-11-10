package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ic6 {
    public static ha2 g;

    public static final ha2 g() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(19.0f, 6.41f);
        kq3Var.x(17.59f, 5.0f);
        kq3Var.x(12.0f, 10.59f);
        kq3Var.x(6.41f, 5.0f);
        kq3Var.x(5.0f, 6.41f);
        kq3Var.x(10.59f, 12.0f);
        kq3Var.x(5.0f, 17.59f);
        kq3Var.x(6.41f, 19.0f);
        kq3Var.x(12.0f, 13.41f);
        kq3Var.x(17.59f, 19.0f);
        kq3Var.x(19.0f, 17.59f);
        kq3Var.x(13.41f, 12.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final j73 n(j73 j73Var, xy1 xy1Var) {
        return j73Var.n(new ni2(null, xy1Var));
    }

    public static final j73 r(j73 j73Var, xy1 xy1Var) {
        return j73Var.n(new ni2(xy1Var, null));
    }

    public static void v(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static boolean y(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }
}
