package defpackage;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class h54 {
    public int g;
    public int l;
    public int n;
    public int r;
    public BaseInterpolator v;
    public boolean x;
    public int y;

    public final void g(RecyclerView recyclerView) {
        int i = this.n;
        if (i >= 0) {
            this.n = -1;
            recyclerView.S(i);
            this.x = false;
            return;
        }
        if (!this.x) {
            this.l = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.v;
        if (baseInterpolator != null && this.r < 1) {
            l0.z("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.r;
        if (i2 < 1) {
            l0.z("Scroll duration must be a positive number");
            return;
        }
        recyclerView.l0.r(this.g, this.y, i2, baseInterpolator);
        int i3 = this.l + 1;
        this.l = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.x = false;
    }
}
