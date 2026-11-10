package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class u44 implements aj3 {
    public int j;
    public int t;

    public u44(int i, int i2) {
        this.j = i;
        this.t = i2;
    }

    public void g(n54 n54Var) {
        View view = n54Var.g;
        this.j = view.getLeft();
        this.t = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // defpackage.aj3
    public int j(int i) {
        if (i >= 0 && i <= this.j) {
            if6.y(i, this.t, i);
        }
        return i;
    }

    @Override // defpackage.aj3
    public int n(int i) {
        if (i >= 0 && i <= this.t) {
            if6.r(i, this.j, i);
        }
        return i;
    }
}
