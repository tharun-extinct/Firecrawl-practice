package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qd2 t;

    public /* synthetic */ pd2(qd2 qd2Var, byte b) {
        this.j = b;
        this.t = qd2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        qd2 qd2Var = this.t;
        hd5 hd5Var = (hd5) obj;
        switch (b) {
            case 0:
                hd5Var.getClass();
                qd2 qd2Var2 = (qd2) hd5Var;
                qo5 qo5Var = qd2Var.f;
                if (!yf2.p(qd2Var2.o, qo5Var)) {
                    qd2Var2.o = qo5Var;
                    qd2Var2.R0();
                }
                return gd5.t;
            default:
                hd5Var.getClass();
                qd2Var.o = ((qd2) hd5Var).f;
                return Boolean.FALSE;
        }
    }
}
