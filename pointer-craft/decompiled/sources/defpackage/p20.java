package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p20 implements gr1 {
    public static final p20 j = new p20();

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            yf2.p((String) it.next(), "donation");
        }
        return og5.g;
    }
}
