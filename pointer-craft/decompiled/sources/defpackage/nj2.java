package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nj2 implements er1 {
    public final /* synthetic */ sj2 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ er1 t;

    public /* synthetic */ nj2(er1 er1Var, sj2 sj2Var, byte b) {
        this.j = b;
        this.t = er1Var;
        this.a = sj2Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        kj2 kj2Var;
        oj2 oj2Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        sj2 sj2Var = this.a;
        er1 er1Var = this.t;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (mu0Var instanceof kj2) {
                    kj2Var = (kj2) mu0Var;
                    int i = kj2Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kj2Var.q = i - Integer.MIN_VALUE;
                    } else {
                        kj2Var = new kj2(this, mu0Var);
                    }
                } else {
                    kj2Var = new kj2(this, mu0Var);
                }
                Object obj = kj2Var.m;
                int i2 = kj2Var.q;
                if (i2 == 0) {
                    js2.o(obj);
                    mj2 mj2Var = new mj2(gr1Var, sj2Var, (byte) 0);
                    kj2Var.q = 1;
                    return er1Var.r(mj2Var, kj2Var) == px0Var ? px0Var : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (mu0Var instanceof oj2) {
                    oj2Var = (oj2) mu0Var;
                    int i3 = oj2Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oj2Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        oj2Var = new oj2(this, mu0Var);
                    }
                } else {
                    oj2Var = new oj2(this, mu0Var);
                }
                Object obj2 = oj2Var.m;
                int i4 = oj2Var.q;
                if (i4 == 0) {
                    js2.o(obj2);
                    mj2 mj2Var2 = new mj2(gr1Var, sj2Var, b2);
                    oj2Var.q = 1;
                    return er1Var.r(mj2Var2, oj2Var) == px0Var ? px0Var : og5Var;
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
