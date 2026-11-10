package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sw4 {
    public final Class g;
    public final ArrayList y = pw5.A(new ll2(this, 20));

    public sw4(Class cls) {
        this.g = cls;
    }

    public final boolean g(Object obj) {
        ArrayList arrayList = this.y;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!((Boolean) ((xy1) obj2).a(obj)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
