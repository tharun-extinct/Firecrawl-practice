package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class cv4 {
    public int g;
    public final /* synthetic */ StaggeredGridLayoutManager l;
    public boolean n;
    public boolean r;
    public boolean v;
    public int[] x;
    public int y;

    public cv4(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.l = staggeredGridLayoutManager;
        g();
    }

    public final void g() {
        this.g = -1;
        this.y = Integer.MIN_VALUE;
        this.r = false;
        this.n = false;
        this.v = false;
        int[] iArr = this.x;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
