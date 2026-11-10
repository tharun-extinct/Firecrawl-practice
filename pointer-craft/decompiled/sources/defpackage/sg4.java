package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sg4 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t45 j;
    public final /* synthetic */ boolean t;

    public sg4(t45 t45Var, boolean z, boolean z2) {
        this.j = t45Var;
        this.t = z;
        this.a = z2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            zg4 zg4Var = new zg4(new xx2(aq4.g(this.j.g(this.t, false, this.a), jr2.F(f83.m, h02Var), null, h02Var, 0, 12), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 2), (byte) 0);
            ug4 ug4Var = ug4.g;
            z50.g(a11.c(g73.g, new kn2(vn4.y(be6.r, h02Var), zg4Var, (byte) 19)), h02Var, 0);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
