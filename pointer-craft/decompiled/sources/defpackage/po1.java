package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class po1 implements jw {
    public static final AtomicReference g = new AtomicReference();

    @Override // defpackage.jw
    public final void g(boolean z) {
        synchronized (ro1.a) {
            try {
                ArrayList arrayList = new ArrayList(ro1.m.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ro1 ro1Var = (ro1) obj;
                    if (ro1Var.v.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = ro1Var.t.iterator();
                        while (it.hasNext()) {
                            ro1 ro1Var2 = ((oo1) it.next()).g;
                            if (!z) {
                                ((z11) ro1Var2.j.get()).g();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
