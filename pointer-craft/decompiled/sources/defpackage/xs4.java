package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class xs4 extends b54 {
    public boolean g = false;
    public final /* synthetic */ ro3 y;

    public xs4(ro3 ro3Var) {
        this.y = ro3Var;
    }

    @Override // defpackage.b54
    public final void g(RecyclerView recyclerView, int i) {
        if (i == 0 && this.g) {
            this.g = false;
            this.y.x();
        }
    }

    @Override // defpackage.b54
    public final void y(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.g = true;
    }
}
