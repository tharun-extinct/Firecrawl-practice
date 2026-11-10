package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w43 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ l43 t;

    public w43(bz1 bz1Var, l43 l43Var, boolean z, bz1 bz1Var2, bz1 bz1Var3) {
        this.j = bz1Var;
        this.t = l43Var;
        this.a = z;
        this.m = bz1Var2;
        this.q = bz1Var3;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        byte b2 = 2;
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            l43 l43Var = this.t;
            bz1 bz1Var = this.j;
            if (bz1Var != null) {
                h02Var.X(-864613220);
                og0.y(du4.t(z ? l43Var.y : l43Var.v, mt0.g), ue5.m0(1241781204, new j6(bz1Var, b2), h02Var), h02Var, 56);
                h02Var.b(false);
            } else {
                h02Var.X(-864293207);
                h02Var.b(false);
            }
            vf1 vf1Var = mt0.g;
            m14 m14VarT = du4.t(z ? l43Var.g : l43Var.n, vf1Var);
            bz1 bz1Var2 = this.q;
            bz1 bz1Var3 = this.m;
            og0.y(m14VarT, ue5.m0(-893579015, new u43(bz1Var, bz1Var3, bz1Var2, b), h02Var), h02Var, 56);
            if (bz1Var3 != null) {
                h02Var.X(-863394951);
                og0.y(du4.t(z ? l43Var.r : l43Var.x, vf1Var), ue5.m0(-782441013, new j6(bz1Var3, (byte) 3), h02Var), h02Var, 56);
                h02Var.b(false);
            } else {
                h02Var.X(-863072055);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
