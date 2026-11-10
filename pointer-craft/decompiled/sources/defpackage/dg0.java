package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dg0 implements er1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ er1 t;

    public /* synthetic */ dg0(er1 er1Var, byte b) {
        this.j = b;
        this.t = er1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        bg0 bg0Var;
        ii5 ii5Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        er1 er1Var = this.t;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (mu0Var instanceof bg0) {
                    bg0Var = (bg0) mu0Var;
                    int i = bg0Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bg0Var.q = i - Integer.MIN_VALUE;
                    } else {
                        bg0Var = new bg0(this, mu0Var);
                    }
                } else {
                    bg0Var = new bg0(this, mu0Var);
                }
                Object obj = bg0Var.m;
                int i2 = bg0Var.q;
                if (i2 == 0) {
                    js2.o(obj);
                    e10 e10Var = new e10(gr1Var, b2);
                    bg0Var.q = 1;
                    return er1Var.r(e10Var, bg0Var) == px0Var ? px0Var : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (mu0Var instanceof ii5) {
                    ii5Var = (ii5) mu0Var;
                    int i3 = ii5Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ii5Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        ii5Var = new ii5(this, mu0Var);
                    }
                } else {
                    ii5Var = new ii5(this, mu0Var);
                }
                Object obj2 = ii5Var.m;
                int i4 = ii5Var.q;
                if (i4 == 0) {
                    js2.o(obj2);
                    e10 e10Var2 = new e10(gr1Var, (byte) 3);
                    ii5Var.q = 1;
                    return er1Var.r(e10Var2, ii5Var) == px0Var ? px0Var : og5Var;
                }
                if (i4 == 1) {
                    js2.o(obj2);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
