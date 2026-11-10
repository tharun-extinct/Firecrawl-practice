package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g65 {
    public fl2 g;
    public k85 n;
    public ku1 r;
    public Object v;
    public j51 y;
    public final tp3 x = kq2.M(Boolean.TRUE);
    public long l = 0;

    public g65(fl2 fl2Var, j51 j51Var, ku1 ku1Var, k85 k85Var, Object obj) {
        this.g = fl2Var;
        this.y = j51Var;
        this.r = ku1Var;
        this.n = k85Var;
        this.v = obj;
    }

    public static void g(g65 g65Var, fl2 fl2Var, j51 j51Var, k85 k85Var, int i) {
        if ((i & 1) != 0) {
            fl2Var = g65Var.g;
        }
        if ((i & 2) != 0) {
            j51Var = g65Var.y;
        }
        ku1 ku1Var = g65Var.r;
        if ((i & 8) != 0) {
            k85Var = g65Var.n;
        }
        Object obj = g65Var.v;
        fl2 fl2Var2 = g65Var.g;
        tp3 tp3Var = g65Var.x;
        if (fl2Var == fl2Var2 && yf2.p(j51Var, g65Var.y) && yf2.p(ku1Var, g65Var.r) && yf2.p(k85Var, g65Var.n)) {
            if (yf2.p(obj, g65Var.v)) {
                return;
            }
            g65Var.v = obj;
            tp3Var.setValue(Boolean.TRUE);
            return;
        }
        g65Var.g = fl2Var;
        g65Var.y = j51Var;
        g65Var.r = ku1Var;
        g65Var.n = k85Var;
        tp3Var.setValue(Boolean.TRUE);
    }
}
