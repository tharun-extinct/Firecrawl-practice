package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class lf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            nf nfVar = new nf(choreographer, k33.D(looperMyLooper));
            return a11.k(nfVar, nfVar.u);
        }
        l0.z("no Looper on this thread");
        return null;
    }
}
