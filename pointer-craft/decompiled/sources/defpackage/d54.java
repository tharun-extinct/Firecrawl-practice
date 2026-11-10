package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d54 {
    public SparseArray g;
    public Set r;
    public int y;

    public final c54 g(int i) {
        SparseArray sparseArray = this.g;
        c54 c54Var = (c54) sparseArray.get(i);
        if (c54Var != null) {
            return c54Var;
        }
        c54 c54Var2 = new c54();
        sparseArray.put(i, c54Var2);
        return c54Var2;
    }
}
