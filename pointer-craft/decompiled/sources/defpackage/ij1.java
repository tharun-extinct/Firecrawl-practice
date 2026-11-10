package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 {
    public final SparseArray g = new SparseArray();
    public final int n;
    public final int r;
    public final jj1 y;

    public ij1(jj1 jj1Var, ro roVar) {
        this.y = jj1Var;
        TypedArray typedArray = (TypedArray) roVar.t;
        this.r = typedArray.getResourceId(28, 0);
        this.n = typedArray.getResourceId(53, 0);
    }
}
