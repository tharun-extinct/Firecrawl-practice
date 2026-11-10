package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr1 implements er1 {
    public final /* synthetic */ cz1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ er1 t;

    public /* synthetic */ tr1(er1 er1Var, cz1 cz1Var, byte b) {
        this.j = b;
        this.t = er1Var;
        this.a = cz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        sr1 sr1Var;
        dc4 dc4Var;
        dc4 dc4Var2;
        wr1 wr1Var;
        gr1 gr1Var2 = gr1Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        cz1 cz1Var = this.a;
        er1 er1Var = this.t;
        int i = 0;
        Object obj = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof sr1) {
                    sr1Var = (sr1) mu0Var;
                    int i2 = sr1Var.q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        sr1Var.q = i2 - Integer.MIN_VALUE;
                    } else {
                        sr1Var = new sr1(this, mu0Var);
                    }
                } else {
                    sr1Var = new sr1(this, mu0Var);
                }
                Object obj2 = sr1Var.m;
                int i3 = sr1Var.q;
                try {
                    try {
                        if (i3 == 0) {
                            js2.o(obj2);
                            sr1Var.c = gr1Var2;
                            sr1Var.b = 0;
                            sr1Var.q = 1;
                            if (er1Var.r(gr1Var2, sr1Var) != obj) {
                            }
                            return obj;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                Throwable th = (Throwable) sr1Var.i;
                                js2.o(obj2);
                                throw th;
                            }
                            if (i3 != 3) {
                                l0.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dc4Var2 = (dc4) sr1Var.i;
                            try {
                                js2.o(obj2);
                                dc4Var2.z();
                                return og5Var;
                            } catch (Throwable th2) {
                                th = th2;
                                dc4Var2.z();
                                throw th;
                            }
                        }
                        i = sr1Var.b;
                        gr1Var2 = sr1Var.c;
                        js2.o(obj2);
                        sr1Var.c = null;
                        sr1Var.i = dc4Var;
                        sr1Var.b = i;
                        sr1Var.q = 3;
                        if (cz1Var.x(dc4Var, null, sr1Var) != obj) {
                            dc4Var2 = dc4Var;
                            dc4Var2.z();
                            return og5Var;
                        }
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        dc4Var2 = dc4Var;
                        dc4Var2.z();
                        throw th;
                    }
                    fx0 fx0Var = sr1Var.t;
                    fx0Var.getClass();
                    dc4Var = new dc4(gr1Var2, fx0Var);
                } catch (Throwable th4) {
                    f95 f95Var = new f95(th4);
                    sr1Var.c = null;
                    sr1Var.i = th4;
                    sr1Var.b = i;
                    sr1Var.q = 2;
                    if (y94.G(f95Var, cz1Var, th4, sr1Var) != obj) {
                        throw th4;
                    }
                }
                break;
            default:
                if (mu0Var instanceof wr1) {
                    wr1Var = (wr1) mu0Var;
                    int i4 = wr1Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        wr1Var.q = i4 - Integer.MIN_VALUE;
                    } else {
                        wr1Var = new wr1(this, mu0Var);
                    }
                } else {
                    wr1Var = new wr1(this, mu0Var);
                }
                Object objB = wr1Var.m;
                int i5 = wr1Var.q;
                if (i5 == 0) {
                    js2.o(objB);
                    wr1Var.c = gr1Var2;
                    wr1Var.i = 0;
                    wr1Var.q = 1;
                    objB = gp4.B(er1Var, gr1Var2, wr1Var);
                    if (objB != obj) {
                    }
                    return obj;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        js2.o(objB);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = wr1Var.i;
                gr1Var2 = wr1Var.c;
                js2.o(objB);
                Throwable th5 = (Throwable) objB;
                if (th5 == null) {
                    return og5Var;
                }
                wr1Var.c = null;
                wr1Var.i = i;
                wr1Var.q = 2;
                if (cz1Var.x(gr1Var2, th5, wr1Var) != obj) {
                    return og5Var;
                }
                return obj;
        }
    }
}
