package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j10 implements er1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ew4 t;

    public /* synthetic */ j10(ew4 ew4Var, byte b) {
        this.j = b;
        this.t = ew4Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        h10 h10Var;
        k10 k10Var;
        byte b = this.j;
        ew4 ew4Var = this.t;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (mu0Var instanceof h10) {
                    h10Var = (h10) mu0Var;
                    int i = h10Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h10Var.q = i - Integer.MIN_VALUE;
                    } else {
                        h10Var = new h10(this, mu0Var);
                    }
                } else {
                    h10Var = new h10(this, mu0Var);
                }
                Object obj = h10Var.m;
                int i2 = h10Var.q;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                v00 v00Var = new v00(gr1Var, b2);
                h10Var.q = 1;
                ew4Var.r(v00Var, h10Var);
                return px0Var;
            default:
                if (mu0Var instanceof k10) {
                    k10Var = (k10) mu0Var;
                    int i3 = k10Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k10Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        k10Var = new k10(this, mu0Var);
                    }
                } else {
                    k10Var = new k10(this, mu0Var);
                }
                Object obj2 = k10Var.m;
                int i4 = k10Var.q;
                if (i4 != 0) {
                    if (i4 == 1) {
                        js2.o(obj2);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj2);
                v00 v00Var2 = new v00(gr1Var, (byte) 2);
                k10Var.q = 1;
                ew4Var.r(v00Var2, k10Var);
                return px0Var;
        }
    }
}
