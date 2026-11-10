package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ql2 {
    public final /* synthetic */ tl2 g;

    public ql2(tl2 tl2Var) {
        this.g = tl2Var;
    }

    public final gm2 g(MotionEvent motionEvent) {
        motionEvent.getClass();
        tl2 tl2Var = this.g;
        RecyclerView recyclerView = tl2Var.p0;
        if (recyclerView == null) {
            yf2.Y("recyclerView");
            throw null;
        }
        View viewE = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (viewE != null) {
            RecyclerView recyclerView2 = tl2Var.p0;
            if (recyclerView2 == null) {
                yf2.Y("recyclerView");
                throw null;
            }
            n54 n54VarN = recyclerView2.N(viewE);
            n54VarN.getClass();
            if (n54VarN instanceof vk2) {
                return ((vk2) n54VarN).h;
            }
        }
        return null;
    }

    public final boolean r(MotionEvent motionEvent) {
        gm2 gm2VarG;
        if (!y(motionEvent) || (gm2VarG = g(motionEvent)) == null) {
            return false;
        }
        gm2VarG.g();
        return true;
    }

    public final boolean y(MotionEvent motionEvent) {
        gm2 gm2VarG = g(motionEvent);
        return (gm2VarG != null ? gm2VarG.g.r() : -1) != -1;
    }
}
