package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jl2 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ tl2 t;

    public /* synthetic */ jl2(tl2 tl2Var, byte b) {
        this.j = b;
        this.t = tl2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        tl2 tl2Var = this.t;
        byte b2 = 1;
        Object[] objArr = 0;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    xq2.g(ue5.m0(-88244878, new jl2(tl2Var, b2), h02Var), h02Var, 6);
                }
                break;
            default:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    boolean zJ = h02Var.j(tl2Var);
                    Object objK = h02Var.K();
                    l76 l76Var = oo0.g;
                    if (zJ || objK == l76Var) {
                        objK = new kl2(tl2Var, (byte) 0);
                        h02Var.i0(objK);
                    }
                    my1 my1Var = (my1) objK;
                    boolean zJ2 = h02Var.j(tl2Var);
                    Object objK2 = h02Var.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new kl2(tl2Var, (byte) 1);
                        h02Var.i0(objK2);
                    }
                    my1 my1Var2 = (my1) objK2;
                    boolean zJ3 = h02Var.j(tl2Var);
                    Object objK3 = h02Var.K();
                    if (zJ3 || objK3 == l76Var) {
                        objK3 = new ll2(tl2Var, objArr == true ? 1 : 0);
                        h02Var.i0(objK3);
                    }
                    uc6.g(my1Var, my1Var2, (xy1) objK3, h02Var, 0);
                }
                break;
        }
        return og5Var;
    }
}
