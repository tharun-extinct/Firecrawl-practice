package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class co3 extends i73 implements lm2 {
    public zn3 o;

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        float fG = this.o.g(v33Var.getLayoutDirection());
        float fN = this.o.n();
        float fY = this.o.y(v33Var.getLayoutDirection());
        float fR = this.o.r();
        if (!((vb1.g(fG, 0.0f) >= 0) & (vb1.g(fN, 0.0f) >= 0) & (vb1.g(fY, 0.0f) >= 0) & (vb1.g(fR, 0.0f) >= 0))) {
            kc2.g("Padding must be non-negative");
        }
        int iV = v33Var.V(fG);
        int iV2 = v33Var.V(fY) + iV;
        int iV3 = v33Var.V(fN);
        int iV4 = v33Var.V(fR) + iV3;
        us3 us3VarV = p33Var.v(zs0.t(-iV2, -iV4, j));
        return v33Var.k0(zs0.l(us3VarV.j + iV2, j), zs0.x(us3VarV.t + iV4, j), qi1.j, new ud2(us3VarV, iV, iV3, (byte) 2));
    }
}
