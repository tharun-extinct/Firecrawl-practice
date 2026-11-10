package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f10 implements er1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ b02 t;

    public /* synthetic */ f10(b02 b02Var, byte b) {
        this.j = b;
        this.t = b02Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        c10 c10Var;
        gg0 gg0Var;
        pv4 pv4Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        b02 b02Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof c10) {
                    c10Var = (c10) mu0Var;
                    int i = c10Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c10Var.q = i - Integer.MIN_VALUE;
                    } else {
                        c10Var = new c10(this, mu0Var);
                    }
                } else {
                    c10Var = new c10(this, mu0Var);
                }
                Object obj = c10Var.m;
                int i2 = c10Var.q;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                e10 e10Var = new e10(gr1Var, (byte) 0);
                c10Var.q = 1;
                ((ew4) b02Var).r(e10Var, c10Var);
                return px0Var;
            case 1:
                if (mu0Var instanceof gg0) {
                    gg0Var = (gg0) mu0Var;
                    int i3 = gg0Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gg0Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        gg0Var = new gg0(this, mu0Var);
                    }
                } else {
                    gg0Var = new gg0(this, mu0Var);
                }
                Object obj2 = gg0Var.m;
                int i4 = gg0Var.q;
                if (i4 == 0) {
                    js2.o(obj2);
                    e10 e10Var2 = new e10(gr1Var, (byte) 2);
                    gg0Var.q = 1;
                    return ((wa0) b02Var).r(e10Var2, gg0Var) == px0Var ? px0Var : og5Var;
                }
                if (i4 == 1) {
                    js2.o(obj2);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (mu0Var instanceof pv4) {
                    pv4Var = (pv4) mu0Var;
                    int i5 = pv4Var.q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pv4Var.q = i5 - Integer.MIN_VALUE;
                    } else {
                        pv4Var = new pv4(this, mu0Var);
                    }
                } else {
                    pv4Var = new pv4(this, mu0Var);
                }
                Object obj3 = pv4Var.m;
                int i6 = pv4Var.q;
                if (i6 != 0) {
                    if (i6 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj3);
                        up.q();
                    }
                    return null;
                }
                js2.o(obj3);
                kr0 kr0Var = new kr0(new q54(), gr1Var, (byte) 11);
                pv4Var.q = 1;
                ((uy4) b02Var).r(kr0Var, pv4Var);
                return px0Var;
        }
    }
}
