package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hj4 {
    public final aj4 g;
    public final ia3 y;

    public hj4(gj4 gj4Var, he2 he2Var) {
        this.g = gj4Var.n;
        List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        this.y = new ia3(listT.size());
        int size = listT.size();
        for (int i = 0; i < size; i++) {
            gj4 gj4Var2 = (gj4) listT.get(i);
            if (he2Var.g(gj4Var2.x)) {
                this.y.g(gj4Var2.x);
            }
        }
    }
}
