package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iz5 {
    public static ha2 r;
    public static final nm0 g = new nm0(567820395, false, new at(13));
    public static final nm0 y = new nm0(-504794808, false, new at(14));

    public static final void g(j73 j73Var, u6 u6Var, nm0 nm0Var, h02 h02Var, int i) {
        j73 j73Var2;
        Object obj;
        h02Var.Z(380139498);
        int i2 = i | 438;
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            boolean zX = h02Var.x(t33VarR);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new ta(t33VarR, nm0Var, (byte) 2);
                h02Var.i0(objK);
            }
            g73 g73Var = g73.g;
            gp4.o(g73Var, (bz1) objK, h02Var, 6, 0);
            j73Var2 = g73Var;
            obj = k00Var;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            obj = u6Var;
        }
        Object obj2 = obj;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) j73Var2, obj2, (Object) nm0Var, i, (byte) 4);
        }
    }

    public static void r(hf hfVar, tx2 tx2Var) {
        ArrayList arrayList = new ArrayList(dj0.Y(tx2Var, 10));
        Iterator it = tx2Var.j.iterator();
        while (it.hasNext()) {
            arrayList.add(((sx2) it.next()).g);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        hfVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static LocaleSpan y(tx2 tx2Var) {
        ArrayList arrayList = new ArrayList(dj0.Y(tx2Var, 10));
        Iterator it = tx2Var.j.iterator();
        while (it.hasNext()) {
            arrayList.add(((sx2) it.next()).g);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
