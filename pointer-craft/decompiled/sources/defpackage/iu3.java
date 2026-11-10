package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class iu3 implements a54 {
    public final ql2 g;
    public final a54 y;

    public iu3(ql2 ql2Var, t32 t32Var, tw twVar) {
        xs2.l(ql2Var != null);
        xs2.l(t32Var != null);
        this.g = ql2Var;
        this.y = new dy4();
    }

    @Override // defpackage.a54
    public final boolean g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (db6.v(motionEvent, 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (motionEvent.getActionMasked() == 0) {
                ql2 ql2Var = this.g;
                if (ql2Var.y(motionEvent)) {
                    ql2Var.g(motionEvent).getClass();
                }
            }
        }
        return this.y.g(recyclerView, motionEvent);
    }

    @Override // defpackage.a54
    public final void n(boolean z) {
        this.y.n(z);
    }

    @Override // defpackage.a54
    public final void y(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.y.y(recyclerView, motionEvent);
    }
}
