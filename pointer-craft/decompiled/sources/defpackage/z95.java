package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z95 implements cz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hb2 j;
    public final /* synthetic */ o94 m;
    public final /* synthetic */ my1 q;
    public final /* synthetic */ ca5 t;

    public z95(hb2 hb2Var, ca5 ca5Var, boolean z, o94 o94Var, my1 my1Var) {
        this.j = hb2Var;
        this.t = ca5Var;
        this.a = z;
        this.m = o94Var;
        this.q = my1Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        h02 h02Var = (h02) obj2;
        ((Number) obj3).intValue();
        h02Var.X(-1525724089);
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = du4.n(h02Var);
        }
        ja3 ja3Var = (ja3) objK;
        j73 j73VarN = db2.g(g73.g, ja3Var, this.j).n(new kd5(this.t, ja3Var, null, this.a, this.m, this.q));
        h02Var.b(false);
        return j73VarN;
    }
}
