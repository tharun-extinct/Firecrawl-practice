package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uh0 implements cz1 {
    public final /* synthetic */ o94 a;
    public final /* synthetic */ hb2 j;
    public final /* synthetic */ my1 m;
    public final /* synthetic */ boolean t;

    public uh0(hb2 hb2Var, boolean z, o94 o94Var, my1 my1Var) {
        this.j = hb2Var;
        this.t = z;
        this.a = o94Var;
        this.m = my1Var;
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
        j73 j73VarN = db2.g(g73.g, ja3Var, this.j).n(new sh0(ja3Var, null, false, this.t, null, this.a, this.m));
        h02Var.b(false);
        return j73VarN;
    }
}
