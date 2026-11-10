package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pf3 extends de3 {
    @Override // defpackage.de3
    public final Object g(String str, Bundle bundle) {
        bundle.getClass();
        return (int[]) bundle.get(str);
    }

    @Override // defpackage.de3
    public final Object n(String str) {
        List listH0 = tx4.h0(str, new String[]{","});
        ArrayList arrayList = new ArrayList(dj0.Y(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return cj0.E0(arrayList);
    }
}
