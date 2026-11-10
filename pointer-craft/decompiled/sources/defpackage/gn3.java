package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gn3 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vj2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cn4 f;
    public final /* synthetic */ zm5 h;
    public final /* synthetic */ k85 i;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ t45 m;
    public final /* synthetic */ ja3 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;
    public final /* synthetic */ si2 s;
    public final /* synthetic */ bz1 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ xy1 w;
    public final /* synthetic */ boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public gn3(j73 j73Var, bz1 bz1Var, boolean z, t45 t45Var, String str, xy1 xy1Var, boolean z2, k85 k85Var, vj2 vj2Var, si2 si2Var, boolean z3, int i, int i2, zm5 zm5Var, ja3 ja3Var, cn4 cn4Var) {
        this.j = j73Var;
        this.t = bz1Var;
        this.a = z;
        this.m = t45Var;
        this.q = str;
        this.w = xy1Var;
        this.c = z2;
        this.i = k85Var;
        this.b = vj2Var;
        this.s = si2Var;
        this.p = z3;
        this.u = i;
        this.z = i2;
        this.h = zm5Var;
        this.o = ja3Var;
        this.f = cn4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            bz1 bz1Var = this.t;
            j73 j73VarI0 = g73.g;
            if (bz1Var != null) {
                h02Var.X(-903490605);
                Object objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new m92((byte) 27);
                    h02Var.i0(objK);
                }
                j73VarI0 = ue5.i0(dj4.g(j73VarI0, true, (xy1) objK), 0.0f, zi6.j(h02Var), 0.0f, 0.0f, 13);
                h02Var.b(false);
            } else {
                h02Var.X(-903106918);
                h02Var.b(false);
            }
            j73 j73VarN = this.j.n(j73VarI0);
            String strB = aq2.b(R.string.default_error_message, h02Var);
            boolean z = this.a;
            if (z) {
                j73VarN = dj4.g(j73VarN, false, new oz(strB, (byte) 10));
            }
            j73 j73VarG = mq4.g(j73VarN, 280.0f, 56.0f);
            t45 t45Var = this.m;
            cu4 cu4Var = new cu4(z ? t45Var.a : t45Var.t);
            bz1 bz1Var2 = this.t;
            cn4 cn4Var = this.f;
            String str = this.q;
            boolean z2 = this.c;
            boolean z3 = this.p;
            zm5 zm5Var = this.h;
            ja3 ja3Var = this.o;
            bz.g(str, this.w, j73VarG, z2, false, this.i, this.b, this.s, z3, this.u, this.z ? 1 : 0, zm5Var, null, ja3Var, cu4Var, ue5.m0(-1189274459, new fn3(str, z2, z3, zm5Var, ja3Var, this.a, bz1Var2, t45Var, cn4Var), h02Var), h02Var, 0, 196608, 4096);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
