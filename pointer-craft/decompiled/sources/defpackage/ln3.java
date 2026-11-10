package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ln3 {
    public static final ip0 g = new ip0(new pc3((byte) 24));

    public static final j73 g(j73 j73Var) {
        return j73Var.n(new mn3());
    }

    public static final tb y(h02 h02Var) {
        h02Var.X(282942128);
        ub ubVar = (ub) h02Var.a(g);
        if (ubVar == null) {
            h02Var.b(false);
            return null;
        }
        boolean zX = h02Var.x(ubVar);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            Object tbVar = new tb(ubVar.g, ubVar.y, ubVar.r, ubVar.n);
            h02Var.i0(tbVar);
            objK = tbVar;
        }
        tb tbVar2 = (tb) objK;
        h02Var.b(false);
        return tbVar2;
    }
}
