package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class x53 {
    public final SparseArray g;
    public ff5 y;

    public x53(int i) {
        this.g = new SparseArray(i);
    }

    public final void g(ff5 ff5Var, int i, int i2) {
        int iG = ff5Var.g(i);
        SparseArray sparseArray = this.g;
        x53 x53Var = (x53) sparseArray.get(iG);
        if (x53Var == null) {
            x53Var = new x53(1);
            sparseArray.put(ff5Var.g(i), x53Var);
        }
        if (i2 > i) {
            x53Var.g(ff5Var, i + 1, i2);
        } else {
            x53Var.y = ff5Var;
        }
    }
}
