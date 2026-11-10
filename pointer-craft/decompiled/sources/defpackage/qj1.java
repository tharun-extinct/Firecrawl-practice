package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends kk2 implements xy1 {
    public final /* synthetic */ ek1 a;
    public final /* synthetic */ dm1 m;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj1(ek1 ek1Var, dm1 dm1Var, byte b) {
        super(1);
        this.t = b;
        this.a = ek1Var;
        this.m = dm1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        no1 no1Var;
        no1 no1Var2;
        no1 no1Var3;
        no1 no1Var4;
        byte b = this.t;
        dm1 dm1Var = this.m;
        mj1 mj1Var = mj1.a;
        ek1 ek1Var = this.a;
        mj1 mj1Var2 = mj1.t;
        mj1 mj1Var3 = mj1.j;
        switch (b) {
            case 0:
                fc5 fc5Var = (fc5) obj;
                if (fc5Var.y(mj1Var3, mj1Var2)) {
                    hn1 hn1Var = ek1Var.g.g;
                    return (hn1Var == null || (no1Var2 = hn1Var.y) == null) ? yj1.y : no1Var2;
                }
                if (!fc5Var.y(mj1Var2, mj1Var)) {
                    return yj1.y;
                }
                hn1 hn1Var2 = dm1Var.g.g;
                return (hn1Var2 == null || (no1Var = hn1Var2.y) == null) ? yj1.y : no1Var;
            default:
                fc5 fc5Var2 = (fc5) obj;
                if (fc5Var2.y(mj1Var3, mj1Var2)) {
                    ae4 ae4Var = ek1Var.g.n;
                    return (ae4Var == null || (no1Var4 = ae4Var.r) == null) ? yj1.y : no1Var4;
                }
                if (!fc5Var2.y(mj1Var2, mj1Var)) {
                    return yj1.y;
                }
                ae4 ae4Var2 = dm1Var.g.n;
                return (ae4Var2 == null || (no1Var3 = ae4Var2.r) == null) ? yj1.y : no1Var3;
        }
    }
}
