package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c31 {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ c31(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.y;
        if (!recyclerView.A || !recyclerView.e) {
            recyclerView.H = true;
            recyclerView.requestLayout();
        } else {
            n44 n44Var = recyclerView.b;
            WeakHashMap weakHashMap = xk5.g;
            recyclerView.postOnAnimation(n44Var);
        }
    }
}
