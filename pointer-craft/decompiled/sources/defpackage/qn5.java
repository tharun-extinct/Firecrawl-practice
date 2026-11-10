package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qn5 implements bz1 {
    public final /* synthetic */ st4 j;
    public final /* synthetic */ int t;

    public qn5(st4 st4Var, int i) {
        this.j = st4Var;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            st4 st4Var = this.j;
            int i = this.t;
            boolean zBooleanValue = ((Boolean) st4Var.get(i)).booleanValue();
            boolean zX = h02Var.x(st4Var) | h02Var.n(i);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new pn5(st4Var, i);
                h02Var.i0(objK);
            }
            cc6.g(zBooleanValue, (xy1) objK, null, false, null, h02Var, 0);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
