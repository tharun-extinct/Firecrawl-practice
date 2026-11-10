package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mf implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ nf j;

    public mf(nf nfVar) {
        this.j = nfVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.j.m.removeCallbacks(this);
        this.j.S();
        nf nfVar = this.j;
        synchronized (nfVar.q) {
            if (nfVar.s) {
                nfVar.s = false;
                ArrayList arrayList = nfVar.c;
                nfVar.c = nfVar.i;
                nfVar.i = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.S();
        nf nfVar = this.j;
        synchronized (nfVar.q) {
            if (nfVar.c.isEmpty()) {
                nfVar.a.removeFrameCallback(this);
                nfVar.s = false;
            }
        }
    }
}
