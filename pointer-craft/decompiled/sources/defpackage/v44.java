package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v44 {
    public k12 g;
    public byte n;
    public byte r;
    public short v;
    public short x;
    public ArrayList y;

    public static void y(n54 n54Var) {
        int i = n54Var.a;
        if (!n54Var.j() && (i & 4) == 0) {
            n54Var.y();
        }
    }

    public abstract boolean g(n54 n54Var, n54 n54Var2, u44 u44Var, u44 u44Var2);

    public abstract void n(n54 n54Var);

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0076, please report this as an issue */
    public final void r(n54 n54Var) {
        k12 k12Var = this.g;
        if (k12Var != null) {
            RecyclerView recyclerView = k12Var.g;
            boolean z = true;
            n54Var.b(true);
            View view = n54Var.g;
            if (n54Var.j != null && n54Var.t == null) {
                n54Var.j = null;
            }
            n54Var.t = null;
            if ((n54Var.a & 16) != 0) {
                return;
            }
            e54 e54Var = recyclerView.a;
            recyclerView.o0();
            ee0 ee0Var = recyclerView.w;
            de0 de0Var = ee0Var.y;
            k12 k12Var2 = ee0Var.g;
            byte b = ee0Var.n;
            if (b != 1) {
                if (b == 2) {
                    l0.z("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    ee0Var.n = (byte) 2;
                    int iIndexOfChild = k12Var2.g.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        ee0Var.m(view);
                    } else if (de0Var.n(iIndexOfChild)) {
                        de0Var.t(iIndexOfChild);
                        ee0Var.m(view);
                        k12Var2.n(iIndexOfChild);
                    } else {
                        ee0Var.n = (byte) 0;
                    }
                    ee0Var.n = (byte) 0;
                    if (z) {
                        n54 n54VarO = RecyclerView.O(view);
                        e54Var.w(n54VarO);
                        e54Var.a(n54VarO);
                        if (RecyclerView.K0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.q0(!z);
                    if (z && n54Var.q()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    ee0Var.n = (byte) 0;
                    throw th;
                }
            }
            if (ee0Var.v != view) {
                l0.z("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                n54 n54VarO2 = RecyclerView.O(view);
                e54Var.w(n54VarO2);
                e54Var.a(n54VarO2);
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.q0(!z);
            if (z) {
            }
        }
    }

    public abstract void v();

    public abstract boolean x();
}
