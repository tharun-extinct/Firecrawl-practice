package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xg extends kk2 implements bz1 {
    public final /* synthetic */ nc5 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ j73 q;
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ nm0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(nc5 nc5Var, xy1 xy1Var, j73 j73Var, ek1 ek1Var, dm1 dm1Var, nm0 nm0Var, int i) {
        super(2);
        this.a = nc5Var;
        this.m = xy1Var;
        this.q = j73Var;
        this.i = ek1Var;
        this.b = dm1Var;
        this.w = nm0Var;
        this.c = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.t;
        og5 og5Var = og5.g;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iJ = aq2.J(i | 1);
                nc5 nc5Var = this.a;
                j73 j73Var = this.q;
                xy1 xy1Var = this.m;
                y94.g(nc5Var, j73Var, xy1Var, (u6) obj3, (xy1) obj4, this.w, (h02) obj, iJ);
                break;
            default:
                ((Number) obj2).intValue();
                int iJ2 = aq2.J(i | 1);
                nc5 nc5Var2 = this.a;
                xy1 xy1Var2 = this.m;
                j73 j73Var2 = this.q;
                gp4.v(nc5Var2, xy1Var2, j73Var2, (ek1) obj4, (dm1) obj3, this.w, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(nc5 nc5Var, j73 j73Var, xy1 xy1Var, u6 u6Var, xy1 xy1Var2, nm0 nm0Var, int i) {
        super(2);
        this.a = nc5Var;
        this.q = j73Var;
        this.m = xy1Var;
        this.b = u6Var;
        this.i = xy1Var2;
        this.w = nm0Var;
        this.c = i;
    }
}
