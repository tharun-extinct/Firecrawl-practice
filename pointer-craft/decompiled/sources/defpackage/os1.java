package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class os1 implements er1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ er1 t;

    public /* synthetic */ os1(er1 er1Var, byte b) {
        this.j = b;
        this.t = er1Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        qm4 qm4Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        er1 er1Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                Object objR = er1Var.r(new v00(gr1Var, (byte) 5), mu0Var);
                return objR == px0Var ? objR : og5Var;
            default:
                if (mu0Var instanceof qm4) {
                    qm4Var = (qm4) mu0Var;
                    int i = qm4Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qm4Var.q = i - Integer.MIN_VALUE;
                    } else {
                        qm4Var = new qm4(this, mu0Var);
                    }
                } else {
                    qm4Var = new qm4(this, mu0Var);
                }
                Object obj = qm4Var.m;
                int i2 = qm4Var.q;
                if (i2 == 0) {
                    js2.o(obj);
                    v00 v00Var = new v00(gr1Var, (byte) 6);
                    qm4Var.q = 1;
                    return er1Var.r(v00Var, qm4Var) == px0Var ? px0Var : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
