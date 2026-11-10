package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w00 implements er1 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ w00(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        t00 t00Var;
        z20 z20Var;
        b0 b0Var;
        dc4 dc4Var;
        Throwable th;
        byte b = this.j;
        mu0 mu0Var2 = null;
        Object obj = this.t;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                if (mu0Var instanceof t00) {
                    t00Var = (t00) mu0Var;
                    int i = t00Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t00Var.q = i - Integer.MIN_VALUE;
                    } else {
                        t00Var = new t00(this, mu0Var);
                    }
                } else {
                    t00Var = new t00(this, mu0Var);
                }
                Object obj2 = t00Var.m;
                int i2 = t00Var.q;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj2);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj2);
                v00 v00Var = new v00(gr1Var, (byte) 0);
                t00Var.q = 1;
                ((uy4) obj).r(v00Var, t00Var);
                return px0Var;
            case 1:
                if (mu0Var instanceof z20) {
                    z20Var = (z20) mu0Var;
                    int i3 = z20Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z20Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        z20Var = new z20(this, mu0Var);
                    }
                } else {
                    z20Var = new z20(this, mu0Var);
                }
                Object obj3 = z20Var.m;
                int i4 = z20Var.q;
                if (i4 == 0) {
                    js2.o(obj3);
                    v00 v00Var2 = new v00(gr1Var, (byte) 3);
                    z20Var.q = 1;
                    if (((j10) obj).r(v00Var2, z20Var) == px0Var) {
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
                Object objR = ((vr1) obj).r(new v00(gr1Var, (byte) 4), mu0Var);
                return objR == px0Var ? objR : og5Var;
            case 3:
                zh zhVar = new zh((qr1) obj, gr1Var, mu0Var2, (byte) 11);
                ir1 ir1Var = new ir1(mu0Var, mu0Var.v());
                Object objG = lr2.G(ir1Var, true, ir1Var, zhVar);
                return objG == px0Var ? objG : og5Var;
            default:
                if (mu0Var instanceof b0) {
                    b0Var = (b0) mu0Var;
                    int i5 = b0Var.c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        b0Var.c = i5 - Integer.MIN_VALUE;
                    } else {
                        b0Var = new b0(this, mu0Var);
                    }
                } else {
                    b0Var = new b0(this, mu0Var);
                }
                Object obj4 = b0Var.q;
                int i6 = b0Var.c;
                if (i6 != 0) {
                    if (i6 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dc4Var = b0Var.m;
                    try {
                        js2.o(obj4);
                        dc4Var.z();
                        return og5Var;
                    } catch (Throwable th2) {
                        th = th2;
                        dc4Var.z();
                        throw th;
                    }
                }
                js2.o(obj4);
                fx0 fx0Var = b0Var.t;
                fx0Var.getClass();
                dc4 dc4Var2 = new dc4(gr1Var, fx0Var);
                try {
                    b0Var.m = dc4Var2;
                    b0Var.c = 1;
                    Object objL = ((bz1) obj).l(dc4Var2, b0Var);
                    if (objL != px0Var) {
                        objL = og5Var;
                    }
                    if (objL == px0Var) {
                        return px0Var;
                    }
                    dc4Var = dc4Var2;
                    dc4Var.z();
                    return og5Var;
                } catch (Throwable th3) {
                    dc4Var = dc4Var2;
                    th = th3;
                    dc4Var.z();
                    throw th;
                }
        }
    }
}
