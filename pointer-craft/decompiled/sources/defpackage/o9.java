package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ba t;

    public /* synthetic */ o9(ba baVar, byte b) {
        this.j = b;
        this.t = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        ba baVar = this.t;
        switch (b) {
            case 0:
                dr drVar = baVar.b;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!drVar.isEmpty()) {
                    try {
                        ((my1) drVar.removeLast()).g();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            default:
                baVar.E0 = false;
                MotionEvent motionEvent = baVar.u0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    baVar.O(motionEvent);
                    return;
                } else {
                    l0.z("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
