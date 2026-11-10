package defpackage;

import android.graphics.ColorSpace;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pc6 {
    public static final Object g = new Object();
    public static ha2 y;

    public static final ha2 g() {
        ha2 ha2Var = y;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Payment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(20.0f, 4.0f);
        kq3Var.x(4.0f, 4.0f);
        kq3Var.r(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        kq3Var.x(2.0f, 18.0f);
        kq3Var.r(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(16.0f);
        kq3Var.r(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        kq3Var.x(22.0f, 6.0f);
        kq3Var.r(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        kq3Var.g();
        kq3Var.j(20.0f, 18.0f);
        kq3Var.x(4.0f, 18.0f);
        kq3Var.w(-6.0f);
        kq3Var.v(16.0f);
        kq3Var.w(6.0f);
        kq3Var.g();
        kq3Var.j(20.0f, 8.0f);
        kq3Var.x(4.0f, 8.0f);
        kq3Var.x(4.0f, 6.0f);
        kq3Var.v(16.0f);
        kq3Var.w(2.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        y = ha2VarY;
        return ha2VarY;
    }

    public static int r(n06 n06Var) {
        Iterator it = n06Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static final ColorSpace y(uj0 uj0Var) {
        if (yf2.p(uj0Var, wj0.k)) {
            return ColorSpace.get(ColorSpace.Named.OK_LAB);
        }
        return null;
    }
}
