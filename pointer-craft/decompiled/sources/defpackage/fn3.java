package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fn3 implements cz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cn4 b;
    public final /* synthetic */ bz1 c;
    public final /* synthetic */ t45 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ zm5 m;
    public final /* synthetic */ ja3 q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean w;

    public fn3(String str, boolean z, boolean z2, zm5 zm5Var, ja3 ja3Var, boolean z3, bz1 bz1Var, t45 t45Var, cn4 cn4Var) {
        this.j = str;
        this.t = z;
        this.a = z2;
        this.m = zm5Var;
        this.q = ja3Var;
        this.w = z3;
        this.c = bz1Var;
        this.i = t45Var;
        this.b = cn4Var;
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
            int i = iIntValue;
            t32 t32Var = t32.c;
            cn4 cn4Var = this.b;
            boolean z = this.t;
            boolean z2 = this.w;
            ja3 ja3Var = this.q;
            t45 t45Var = this.i;
            t32Var.q(this.j, bz1Var, z, this.a, this.m, ja3Var, z2, this.c, t45Var, null, ue5.m0(-656940872, new me3(z, z2, ja3Var, t45Var, cn4Var, (byte) 1), h02Var), h02Var, (i << 3) & 112);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
