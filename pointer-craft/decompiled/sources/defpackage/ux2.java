package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ux2 {
    public static final ux2 y = n(new LocaleList(new Locale[0]));
    public final vx2 g;

    public ux2(vx2 vx2Var) {
        this.g = vx2Var;
    }

    public static ux2 g(String str) {
        if (str == null || str.isEmpty()) {
            return y;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return n(new LocaleList(localeArr));
    }

    public static ux2 n(LocaleList localeList) {
        return new ux2(new vx2(localeList));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ux2) {
            return this.g.equals(((ux2) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.g.hashCode();
    }

    public final int r() {
        return this.g.g.size();
    }

    public final String toString() {
        return this.g.g.toString();
    }

    public final Locale y(int i) {
        return this.g.g.get(i);
    }
}
