package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h55 implements cz1 {
    public final /* synthetic */ zm5 a;
    public final /* synthetic */ cn4 c;
    public final /* synthetic */ t45 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ ja3 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ bz1 w;

    public h55(String str, boolean z, zm5 zm5Var, ja3 ja3Var, bz1 bz1Var, bz1 bz1Var2, cn4 cn4Var, t45 t45Var) {
        this.j = str;
        this.t = z;
        this.a = zm5Var;
        this.m = ja3Var;
        this.q = bz1Var;
        this.w = bz1Var2;
        this.c = cn4Var;
        this.i = t45Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        bz1 bz1Var = (bz1) obj;
        h02 h02Var = (h02) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= h02Var.j(bz1Var) ? 4 : 2;
        }
        if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            bi6.u.w(this.j, bz1Var, this.t, false, this.a, this.m, this.q, null, null, this.w, this.c, this.i, null, null, h02Var, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
