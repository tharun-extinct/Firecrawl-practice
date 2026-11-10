package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class we implements my1 {
    public final /* synthetic */ w35 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ cf t;

    public /* synthetic */ we(cf cfVar, w35 w35Var, byte b) {
        this.j = b;
        this.t = cfVar;
        this.a = w35Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        byte b2 = 4;
        byte b3 = 2;
        w35 w35Var = this.a;
        cf cfVar = this.t;
        switch (b) {
            case 0:
                ve veVar = cfVar.x;
                qd qdVar = new qd(w35Var, b3);
                u54 u54Var = new u54();
                cfVar.v.n("dataBuilder", veVar, new p2(u54Var, qdVar, b2));
                Object obj = u54Var.j;
                if (obj != null) {
                    return (v35) obj;
                }
                yf2.Y("result");
                throw null;
            case 1:
                ve veVar2 = cfVar.l;
                we weVar = new we(cfVar, w35Var, b3);
                u54 u54Var2 = new u54();
                cfVar.v.n("positioner", veVar2, new p2(u54Var2, weVar, b2));
                Object obj2 = u54Var2.j;
                if (obj2 != null) {
                    return (k44) obj2;
                }
                yf2.Y("result");
                throw null;
            default:
                Object objG = cfVar.r.g();
                bl2 bl2Var = (bl2) (((bl2) objG).W() ? objG : null);
                return bl2Var == null ? k44.v : w35Var.c(bl2Var).t(bl2Var.N(0L));
        }
    }
}
