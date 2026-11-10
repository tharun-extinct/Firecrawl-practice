package defpackage;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lz5 {
    public static final nm0 g = new nm0(-402156641, false, new at(17));
    public static final nm0 y = new nm0(-487327487, false, new an0(4));

    static {
        new nm0(1485678017, false, new an0((byte) 5));
    }

    public static final k44 g(gh3 gh3Var, bl2 bl2Var, k44 k44Var) {
        return k44Var.t(gh3Var.H(bl2Var, false).n());
    }

    public static int r(int i) {
        return i & 15;
    }

    public static ux2 y(ux2 ux2Var, ux2 ux2Var2) {
        if (ux2Var == null || ux2Var.g.g.isEmpty()) {
            return ux2.y;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < ux2Var2.r() + ux2Var.r()) {
            Locale localeY = i < ux2Var.r() ? ux2Var.y(i) : ux2Var2.y(i - ux2Var.r());
            if (localeY != null) {
                linkedHashSet.add(localeY);
            }
            i++;
        }
        return ux2.n(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
    }
}
