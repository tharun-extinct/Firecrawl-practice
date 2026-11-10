package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dm5 {
    public em5 n;
    public Interpolator r;
    public boolean v;
    public long y = -1;
    public final cm5 x = new cm5(this);
    public final ArrayList g = new ArrayList();

    public final void g() {
        if (this.v) {
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bm5) obj).y();
            }
            this.v = false;
        }
    }

    public final void y() {
        View view;
        if (this.v) {
            return;
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bm5 bm5Var = (bm5) obj;
            long j = this.y;
            if (j >= 0) {
                bm5Var.r(j);
            }
            Interpolator interpolator = this.r;
            if (interpolator != null && (view = (View) bm5Var.g.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.n != null) {
                bm5Var.n(this.x);
            }
            View view2 = (View) bm5Var.g.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.v = true;
    }
}
