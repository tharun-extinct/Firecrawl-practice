package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nr0 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qr0 c;
    public final /* synthetic */ int i;
    public qr0 q;
    public final /* synthetic */ boolean s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(qr0 qr0Var, int i, int i2, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = qr0Var;
        this.i = i;
        this.b = i2;
        this.s = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new nr0(this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((nr0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        qr0 qr0Var;
        qr0 qr0Var2;
        boolean z = this.w;
        if (!z) {
            js2.o(obj);
            qr0Var = this.c;
            Integer numN = qr0Var.n.n(this.i);
            if (numN != null) {
                int iIntValue = numN.intValue();
                e40 e40VarJ = qr0Var.j();
                if (e40VarJ != null) {
                    this.q = qr0Var;
                    this.w = true;
                    Object objN = e40VarJ.n(this.b, iIntValue, this.s, this);
                    px0 px0Var = px0.j;
                    if (objN == px0Var) {
                        return px0Var;
                    }
                    qr0Var2 = qr0Var;
                } else if (!qr0Var.k) {
                    qr0Var.d.setValue(Boolean.TRUE);
                }
            }
            return og5.g;
        }
        if (!z) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qr0Var2 = this.q;
        js2.o(obj);
        qr0Var = qr0Var2;
        if (!qr0Var.k) {
            qr0Var.d.setValue(Boolean.TRUE);
        }
        return og5.g;
    }
}
