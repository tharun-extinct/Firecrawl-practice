package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class km1 {
    public static final km1 g = new km1();
    public static final bo3 y = new bo3(16.0f, 0.0f, 16.0f, 0.0f);

    public final void g(boolean z, j73 j73Var, h02 h02Var, int i) {
        j73 j73Var2;
        h02Var.Z(-1732824199);
        int i2 = i | (h02Var.l(z) ? 4 : 2) | 48;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            ha2 ha2VarY = hh6.y;
            if (ha2VarY == null) {
                ga2 ga2Var = new ga2("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i3 = fj5.g;
                cu4 cu4Var = new cu4(jj0.y);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new rq3(7.0f, 10.0f));
                arrayList.add(new yq3(5.0f, 5.0f));
                arrayList.add(new yq3(5.0f, -5.0f));
                arrayList.add(nq3.r);
                ga2.g(ga2Var, arrayList, 0, cu4Var);
                ha2VarY = ga2Var.y();
                hh6.y = ha2VarY;
            }
            ha2 ha2Var = ha2VarY;
            float f = z ? 180.0f : 0.0f;
            g73 g73Var = g73.g;
            t92.g(ha2Var, null, ze6.g(g73Var, f), 0L, h02Var, 48, 8);
            j73Var2 = g73Var;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r80(this, z, j73Var2, i, (byte) 1);
        }
    }
}
