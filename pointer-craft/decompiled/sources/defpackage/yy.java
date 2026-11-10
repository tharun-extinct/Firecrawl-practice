package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yy implements e45 {
    public final nm0 g;
    public final ac3 y = new ac3();
    public final tp3 r = kq2.M(null);

    public yy(nm0 nm0Var) {
        this.g = nm0Var;
    }

    @Override // defpackage.e45
    public final Object g(w35 w35Var, zz4 zz4Var) {
        mu0 mu0Var = null;
        Object objB = k33.B(new jf2(ub3.j, this.y, new h8(this, new xy(w35Var), mu0Var, (byte) 3), mu0Var, (byte) 1), zz4Var);
        return objB == px0.j ? objB : og5.g;
    }

    public final void y(final my1 my1Var, h02 h02Var, final int i) {
        final my1 my1Var2;
        h02 h02Var2;
        h02Var.Z(723898654);
        int i2 = (h02Var.x(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            xy xyVar = (xy) this.r.getValue();
            if (xyVar == null) {
                u34 u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1(this, my1Var, i, b) { // from class: wy
                        public final /* synthetic */ my1 a;
                        public final /* synthetic */ byte j;
                        public final /* synthetic */ yy t;

                        {
                            this.j = b;
                            this.t = this;
                        }

                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            byte b3 = this.j;
                            og5 og5Var = og5.g;
                            my1 my1Var3 = this.a;
                            yy yyVar = this.t;
                            h02 h02Var3 = (h02) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    yyVar.y(my1Var3, h02Var3, aq2.J(7));
                                    break;
                                default:
                                    yyVar.y(my1Var3, h02Var3, aq2.J(7));
                                    break;
                            }
                            return og5Var;
                        }
                    };
                    return;
                }
                return;
            }
            my1Var2 = my1Var;
            h02Var2 = h02Var;
            this.g.w(xyVar, xyVar.g, my1Var2, h02Var2, 384);
        } else {
            my1Var2 = my1Var;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP2 = h02Var2.p();
        if (u34VarP2 != null) {
            u34VarP2.n = new bz1(this, my1Var2, i, b2) { // from class: wy
                public final /* synthetic */ my1 a;
                public final /* synthetic */ byte j;
                public final /* synthetic */ yy t;

                {
                    this.j = b2;
                    this.t = this;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    byte b3 = this.j;
                    og5 og5Var = og5.g;
                    my1 my1Var3 = this.a;
                    yy yyVar = this.t;
                    h02 h02Var3 = (h02) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            yyVar.y(my1Var3, h02Var3, aq2.J(7));
                            break;
                        default:
                            yyVar.y(my1Var3, h02Var3, aq2.J(7));
                            break;
                    }
                    return og5Var;
                }
            };
        }
    }
}
