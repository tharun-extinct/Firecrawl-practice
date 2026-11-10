package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends kk2 implements xy1 {
    public final /* synthetic */ ho4 a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj1(ho4 ho4Var, bc5 bc5Var, bc5 bc5Var2, bc5 bc5Var3) {
        super(1);
        this.a = ho4Var;
        this.m = bc5Var;
        this.q = bc5Var2;
        this.w = bc5Var3;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        Object obj2 = this.q;
        Object obj3 = this.m;
        ho4 ho4Var = this.a;
        Object obj4 = this.w;
        switch (b) {
            case 0:
                o84 o84Var = (o84) obj;
                bw4 bw4Var = (bw4) obj3;
                float fFloatValue = bw4Var != null ? ((Number) bw4Var.getValue()).floatValue() : 1.0f;
                t52 t52Var = ho4Var.r;
                pp3 pp3Var = (pp3) t52Var.n;
                float fD = fFloatValue * ((ho4Var.y() && ((Boolean) ((tp3) t52Var.g).getValue()).booleanValue()) ? ((pp3) t52Var.y).d() : 1.0f);
                if (ho4Var.y()) {
                    ho4Var.x = fD;
                }
                o84Var.r(fD);
                bw4 bw4Var2 = (bw4) obj2;
                float fFloatValue2 = bw4Var2 != null ? ((Number) bw4Var2.getValue()).floatValue() : 1.0f;
                boolean z = ho4Var.y() && ((Boolean) ((tp3) t52Var.r).getValue()).booleanValue();
                float fD2 = fFloatValue2 * (z ? pp3Var.d() : 1.0f);
                if (ho4Var.y()) {
                    ho4Var.l = fD2;
                    if (z) {
                        pp3Var.d();
                    }
                    if (z) {
                        xj5 xj5Var = ho4Var.a;
                        if (xj5Var == null) {
                            xj5Var = new xj5(false);
                            ho4Var.a = xj5Var;
                        }
                        xj5Var.g(fD2, mf1.n(pz5.l(t73.g(), ho4Var.n)));
                    }
                }
                o84Var.j(fD2);
                o84Var.t(fD2);
                bw4 bw4Var3 = (bw4) obj4;
                long j = bw4Var3 != null ? ((vb5) bw4Var3.getValue()).g : vb5.y;
                if (ho4Var.y() && ((Boolean) ((tp3) t52Var.v).getValue()).booleanValue()) {
                    j = ((vb5) ((tp3) t52Var.x).getValue()).g;
                }
                if (ho4Var.y()) {
                    ho4Var.j = j;
                }
                o84Var.c(j);
                return og5.g;
            default:
                dm1 dm1Var = (dm1) obj4;
                int iOrdinal = ((mj1) obj).ordinal();
                vb5 vb5Var = null;
                if (iOrdinal == 0) {
                    ae4 ae4Var = ((ek1) obj2).g.n;
                    if (ae4Var != null) {
                        vb5Var = new vb5(ae4Var.y);
                    } else {
                        ae4 ae4Var2 = dm1Var.g.n;
                        if (ae4Var2 != null) {
                            vb5Var = new vb5(ae4Var2.y);
                        }
                    }
                } else if (iOrdinal == 1) {
                    vb5Var = (vb5) obj3;
                } else {
                    if (iOrdinal != 2) {
                        uo1.g();
                        return null;
                    }
                    ae4 ae4Var3 = dm1Var.g.n;
                    vb5Var = new vb5(ae4Var3 != null ? ae4Var3.y : ho4Var.j);
                }
                return new vb5(vb5Var != null ? vb5Var.g : vb5.y);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj1(vb5 vb5Var, ek1 ek1Var, dm1 dm1Var, ho4 ho4Var) {
        super(1);
        this.m = vb5Var;
        this.q = ek1Var;
        this.w = dm1Var;
        this.a = ho4Var;
    }
}
