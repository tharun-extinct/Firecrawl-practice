package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oh6 implements nh6 {
    public final ArrayList g;

    public oh6(Context context, mh6 mh6Var) {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(new yh6(context, mh6Var));
    }

    @Override // defpackage.nh6
    public final void g(ia6 ia6Var) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nh6) obj).g(ia6Var);
        }
    }
}
