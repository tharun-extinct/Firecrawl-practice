package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends zz4 implements dz1 {
    public /* synthetic */ g61 b;
    public /* synthetic */ s30 c;
    public /* synthetic */ ex4 i;
    public f61 q;
    public final /* synthetic */ qr0 s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(qr0 qr0Var, mu0 mu0Var) {
        super(4, mu0Var);
        this.s = qr0Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        gr0 gr0Var = new gr0(this.s, (mu0) obj4);
        gr0Var.c = (s30) obj;
        gr0Var.i = (ex4) obj2;
        gr0Var.b = (g61) obj3;
        return gr0Var.u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        f61 f61Var;
        f61 f61Var2;
        String str;
        boolean z;
        s30 s30Var = this.c;
        ex4 ex4Var = this.i;
        g61 g61Var = this.b;
        boolean z2 = this.w;
        byte b = 0;
        ?? num = 0;
        if (!z2) {
            js2.o(obj);
            if (s30Var != s30.t) {
                if (!yf2.p(ex4Var, dx4.y)) {
                    boolean zP = yf2.p(ex4Var, dx4.g);
                    qr0 qr0Var = this.s;
                    if (zP) {
                        if (g61Var == null) {
                            return rk1.y;
                        }
                        if (g61Var.m == 10) {
                            return qk1.y;
                        }
                        if (dd6.g(g61Var)) {
                            f61 f61VarN = g61Var.n();
                            if (f61VarN == f61.q) {
                                this.c = null;
                                this.i = null;
                                this.b = g61Var;
                                this.q = f61VarN;
                                this.w = true;
                                x21 x21Var = na1.g;
                                Object objF0 = m50.f0(c21.a, new hr0(qr0Var, num, b), this);
                                px0 px0Var = px0.j;
                                if (objF0 == px0Var) {
                                    return px0Var;
                                }
                                obj = objF0;
                                f61Var2 = f61VarN;
                            } else {
                                f61Var = f61VarN;
                            }
                            ?? r10 = num;
                            str = g61Var.j;
                            if (str == null) {
                                str = "???";
                            }
                            String str2 = str;
                            if (g61Var.q == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return new ok1(f61Var, str2, r10, z, g61Var.k);
                        }
                        if (g61Var.l() && !g61Var.i) {
                            return sk1.y;
                        }
                    } else {
                        if (!(ex4Var instanceof cx4)) {
                            uo1.g();
                            return null;
                        }
                        ok4 ok4Var = ((cx4) ex4Var).g;
                        int iOrdinal = ok4Var.ordinal();
                        if (iOrdinal == 4) {
                            l62 l62Var = qr0Var.r;
                            return (((Boolean) l62Var.v.getValue()).booleanValue() || !l62Var.r.y()) ? new tk1(ok4Var.ordinal()) : nk1.y;
                        }
                        if (iOrdinal != 5) {
                            return iOrdinal != 6 ? new tk1(ok4Var.ordinal()) : pk1.y;
                        }
                    }
                }
                return null;
            }
            return mk1.y;
        }
        if (!z2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f61Var2 = this.q;
        js2.o(obj);
        er0 er0Var = (er0) obj;
        f61Var = f61Var2;
        num = er0Var != null ? new Integer(er0Var.g()) : null;
        ?? r11 = num;
        str = g61Var.j;
        if (str == null) {
            str = "???";
        }
        String str3 = str;
        if (g61Var.q == 2) {
            z = true;
        } else {
            z = false;
        }
        return new ok1(f61Var, str3, r11, z, g61Var.k);
    }
}
