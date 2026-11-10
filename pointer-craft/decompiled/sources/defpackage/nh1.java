package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 implements Runnable {
    public final ArrayList j;
    public final byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public nh1(List list, int i, Throwable th) {
        xs2.t(list, "initCallbacks cannot be null");
        this.j = new ArrayList(list);
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        if (this.t != 1) {
            while (i < size) {
                ((mh1) arrayList.get(i)).g();
                i++;
            }
        } else {
            while (i < size) {
                ((mh1) arrayList.get(i)).y();
                i++;
            }
        }
    }
}
