package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ii implements Choreographer.FrameCallback {
    public final /* synthetic */ k j;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.j.run();
    }
}
