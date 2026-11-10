package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class zk1 implements a54, j74 {
    public boolean g;

    @Override // defpackage.a54
    public final boolean g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.g) {
            this.g = false;
            return true;
        }
        if (motionEvent.getActionMasked() == 0 && this.g) {
            this.g = false;
        }
        return false;
    }

    @Override // defpackage.a54
    public final void n(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    @Override // defpackage.j74
    public final boolean r() {
        return this.g;
    }

    @Override // defpackage.j74
    public final void reset() {
        this.g = false;
    }

    @Override // defpackage.a54
    public final void y(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
