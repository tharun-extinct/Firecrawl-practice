package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh extends kk2 implements bz1 {
    public final /* synthetic */ nc5 a;
    public final /* synthetic */ st4 c;
    public final /* synthetic */ nm0 i;
    public final /* synthetic */ lr3 m;
    public final /* synthetic */ xy1 q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ oh w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(Object obj, nc5 nc5Var, lr3 lr3Var, xy1 xy1Var, oh ohVar, st4 st4Var, nm0 nm0Var) {
        super(2);
        this.t = obj;
        this.a = nc5Var;
        this.m = lr3Var;
        this.q = xy1Var;
        this.w = ohVar;
        this.c = st4Var;
        this.i = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        zt0 zt0Var;
        dm1 dm1Var;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            nc5 nc5Var = this.a;
            tp3 tp3Var = nc5Var.v;
            tp3 tp3Var2 = nc5Var.n;
            Object value = tp3Var.getValue();
            Object obj3 = this.t;
            boolean zL = h02Var.l(yf2.p(obj3, value));
            Object objK = h02Var.K();
            xy1 xy1Var = this.q;
            lr3 lr3Var = this.m;
            l76 l76Var = oo0.g;
            oh ohVar = this.w;
            if (zL || objK == l76Var) {
                if (!yf2.p(obj3, tp3Var.getValue()) || lr3Var == null) {
                    zt0Var = (yf2.p(obj3, nc5Var.x().g()) || yf2.p(obj3, nc5Var.x().r())) ? (zt0) xy1Var.a(ohVar) : (zt0) xy1Var.a(new lr3(ohVar, nc5Var.x().g(), obj3));
                } else {
                    zt0Var = (zt0) xy1Var.a(lr3Var);
                }
                objK = zt0Var;
                h02Var.i0(objK);
            }
            zt0 zt0Var2 = (zt0) objK;
            boolean zL2 = h02Var.l(yf2.p(nc5Var.x().r(), obj3)) | h02Var.l(yf2.p(obj3, tp3Var.getValue()));
            Object objK2 = h02Var.K();
            if (zL2 || objK2 == l76Var) {
                if (yf2.p(nc5Var.x().r(), obj3) || (yf2.p(obj3, tp3Var.getValue()) && lr3Var != null)) {
                    dm1Var = dm1.y;
                } else {
                    dm1Var = (yf2.p(obj3, nc5Var.x().g()) || yf2.p(obj3, nc5Var.x().r())) ? ((zt0) xy1Var.a(ohVar)).y : ((zt0) xy1Var.a(new lr3(ohVar, obj3, nc5Var.x().g()))).y;
                }
                objK2 = dm1Var;
                h02Var.i0(objK2);
            }
            dm1 dm1Var2 = (dm1) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new jh(yf2.p(obj3, tp3Var2.getValue()));
                h02Var.i0(objK3);
            }
            jh jhVar = (jh) objK3;
            ek1 ek1Var = zt0Var2.g;
            os5 os5Var = new os5(obj3, zt0Var2.r.d());
            jhVar.g.setValue(Boolean.valueOf(yf2.p(obj3, tp3Var2.getValue())));
            jhVar.y.setValue(Boolean.valueOf((!yf2.p(obj3, tp3Var.getValue()) || yf2.p(obj3, tp3Var2.getValue()) || yf2.p(obj3, nc5Var.g.n())) ? false : true));
            j73 j73VarN = os5Var.n(jhVar);
            boolean zJ = h02Var.j(obj3);
            Object objK4 = h02Var.K();
            if (zJ || objK4 == l76Var) {
                objK4 = new zg(obj3, (byte) 0);
                h02Var.i0(objK4);
            }
            xy1 xy1Var2 = (xy1) objK4;
            boolean zX = h02Var.x(dm1Var2);
            Object objK5 = h02Var.K();
            if (zX || objK5 == l76Var) {
                objK5 = new ah(dm1Var2);
                h02Var.i0(objK5);
            }
            gp4.g(this.a, xy1Var2, j73VarN, ek1Var, dm1Var2, (bz1) objK5, ue5.m0(1831990167, new ch(obj3, this.c, ohVar, this.i), h02Var), h02Var, 100663296);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
