package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i55 implements bz1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ si2 b;
    public final /* synthetic */ k85 c;
    public final /* synthetic */ cn4 f;
    public final /* synthetic */ bz1 h;
    public final /* synthetic */ vj2 i;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ bz1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int s;
    public final /* synthetic */ t45 t;
    public final /* synthetic */ zm5 u;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ja3 z;

    /* JADX WARN: Multi-variable type inference failed */
    public i55(j73 j73Var, t45 t45Var, String str, xy1 xy1Var, boolean z, boolean z2, k85 k85Var, vj2 vj2Var, si2 si2Var, int i, int i2, zm5 zm5Var, ja3 ja3Var, bz1 bz1Var, bz1 bz1Var2, cn4 cn4Var) {
        this.j = j73Var;
        this.t = t45Var;
        this.a = str;
        this.m = xy1Var;
        this.q = z;
        this.w = z2;
        this.c = k85Var;
        this.i = vj2Var;
        this.b = si2Var;
        this.s = i;
        this.p = i2;
        this.u = zm5Var;
        this.z = ja3Var;
        this.h = bz1Var;
        this.o = bz1Var2;
        this.f = cn4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            aq2.b(R.string.default_error_message, h02Var);
            j73 j73VarG = mq4.g(this.j, 280.0f, 56.0f);
            t45 t45Var = this.t;
            cu4 cu4Var = new cu4(t45Var.t);
            bz1 bz1Var = this.o;
            cn4 cn4Var = this.f;
            String str = this.a;
            boolean z = this.q;
            zm5 zm5Var = this.u;
            ja3 ja3Var = this.z;
            bz.g(str, this.m, j73VarG, z, this.w, this.c, this.i, this.b, false, this.s, this.p ? 1 : 0, zm5Var, null, ja3Var, cu4Var, ue5.m0(1451491557, new h55(str, z, zm5Var, ja3Var, this.h, bz1Var, cn4Var, t45Var), h02Var), h02Var, 0, 196608, 4096);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
