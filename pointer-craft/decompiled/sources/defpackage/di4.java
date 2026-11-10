package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class di4 implements cz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ o94 q;
    public final /* synthetic */ hb2 t;
    public final /* synthetic */ jz1 w;

    public /* synthetic */ di4(hb2 hb2Var, boolean z, boolean z2, o94 o94Var, jz1 jz1Var, byte b) {
        this.j = b;
        this.t = hb2Var;
        this.a = z;
        this.m = z2;
        this.q = o94Var;
        this.w = jz1Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        jz1 jz1Var = this.w;
        hb2 hb2Var = this.t;
        g73 g73Var = g73.g;
        l76 l76Var = oo0.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                ((Number) obj3).intValue();
                h02Var.X(-1525724089);
                Object objK = h02Var.K();
                if (objK == l76Var) {
                    objK = du4.n(h02Var);
                }
                ja3 ja3Var = (ja3) objK;
                j73 j73VarN = db2.g(g73Var, ja3Var, hb2Var).n(new ci4(this.a, ja3Var, null, this.m, this.q, (my1) jz1Var));
                h02Var.b(false);
                return j73VarN;
            default:
                h02 h02Var2 = (h02) obj2;
                ((Number) obj3).intValue();
                h02Var2.X(-1525724089);
                Object objK2 = h02Var2.K();
                if (objK2 == l76Var) {
                    objK2 = du4.n(h02Var2);
                }
                ja3 ja3Var2 = (ja3) objK2;
                j73 j73VarN2 = db2.g(g73Var, ja3Var2, hb2Var).n(new y95(this.a, ja3Var2, null, this.m, this.q, (xy1) jz1Var));
                h02Var2.b(false);
                return j73VarN2;
        }
    }
}
