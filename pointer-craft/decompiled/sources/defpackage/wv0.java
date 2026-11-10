package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wv0 implements er1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ er1 t;

    public /* synthetic */ wv0(er1 er1Var, Object obj, byte b) {
        this.j = b;
        this.t = er1Var;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        uv0 uv0Var;
        qj2 qj2Var;
        sn5 sn5Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.a;
        er1 er1Var = this.t;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (mu0Var instanceof uv0) {
                    uv0Var = (uv0) mu0Var;
                    int i = uv0Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        uv0Var.q = i - Integer.MIN_VALUE;
                    } else {
                        uv0Var = new uv0(this, mu0Var);
                    }
                } else {
                    uv0Var = new uv0(this, mu0Var);
                }
                Object obj2 = uv0Var.m;
                int i2 = uv0Var.q;
                if (i2 == 0) {
                    js2.o(obj2);
                    kr0 kr0Var = new kr0(gr1Var, (yv0) obj, b2);
                    uv0Var.q = 1;
                    if (((qs1) er1Var).r(kr0Var, uv0Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj2);
                }
                return og5Var;
            case 1:
                if (mu0Var instanceof qj2) {
                    qj2Var = (qj2) mu0Var;
                    int i3 = qj2Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qj2Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        qj2Var = new qj2(this, mu0Var);
                    }
                } else {
                    qj2Var = new qj2(this, mu0Var);
                }
                Object obj3 = qj2Var.m;
                int i4 = qj2Var.q;
                if (i4 == 0) {
                    js2.o(obj3);
                    mj2 mj2Var = new mj2(gr1Var, (sj2) obj, (byte) 2);
                    qj2Var.q = 1;
                    if (((f34) er1Var).j.r(mj2Var, qj2Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i4 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj3);
                }
                return og5Var;
            case 2:
                Object objR = er1Var.r(new kr0(gr1Var, (u13) obj, (byte) 9), mu0Var);
                return objR == px0Var ? objR : og5Var;
            default:
                if (mu0Var instanceof sn5) {
                    sn5Var = (sn5) mu0Var;
                    int i5 = sn5Var.q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sn5Var.q = i5 - Integer.MIN_VALUE;
                    } else {
                        sn5Var = new sn5(this, mu0Var);
                    }
                } else {
                    sn5Var = new sn5(this, mu0Var);
                }
                Object obj4 = sn5Var.m;
                int i6 = sn5Var.q;
                if (i6 == 0) {
                    js2.o(obj4);
                    kr0 kr0Var2 = new kr0(gr1Var, (un5) obj, (byte) 13);
                    sn5Var.q = 1;
                    if (((qs1) er1Var).r(kr0Var2, sn5Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i6 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj4);
                }
                return og5Var;
        }
    }
}
