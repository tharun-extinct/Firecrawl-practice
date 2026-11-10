package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ fl5 t;

    public /* synthetic */ yf(fl5 fl5Var, byte b) {
        this.j = b;
        this.t = fl5Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        fl5 fl5Var = this.t;
        switch (b) {
            case 0:
                dg.c(fl5Var);
                return og5Var;
            case 1:
                fl5Var.G.E();
                return og5Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                fl5Var.I.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                fl5.i(fl5Var);
                return og5Var;
            default:
                fl5Var.L.a(fl5Var.I);
                return og5Var;
        }
    }
}
