package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tp1 {
    public float a;
    public int b;
    public int i;
    public int j;
    public int l;
    public float m;
    public boolean p;
    public int q;
    public boolean s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int g = Integer.MAX_VALUE;
    public int y = Integer.MAX_VALUE;
    public int r = Integer.MIN_VALUE;
    public int n = Integer.MIN_VALUE;
    public final ArrayList c = new ArrayList();

    public final int g() {
        return this.j - this.t;
    }

    public final void y(View view, int i, int i2, int i3, int i4) {
        sp1 sp1Var = (sp1) view.getLayoutParams();
        this.g = Math.min(this.g, (view.getLeft() - sp1Var.h()) - i);
        this.y = Math.min(this.y, (view.getTop() - sp1Var.f()) - i2);
        this.r = Math.max(this.r, sp1Var.q() + view.getRight() + i3);
        this.n = Math.max(this.n, sp1Var.u() + view.getBottom() + i4);
    }
}
