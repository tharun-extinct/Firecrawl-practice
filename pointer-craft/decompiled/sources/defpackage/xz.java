package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xz extends zz4 implements xy1 {
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q = 1;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(zz zzVar, yz yzVar, mu0 mu0Var) {
        super(1, mu0Var);
        this.c = zzVar;
        this.i = yzVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.i;
        mu0 mu0Var = (mu0) obj;
        switch (b) {
            case 0:
                return new xz((zz) this.c, (yz) obj2, mu0Var).u(og5Var);
            default:
                return new xz((p01) obj2, mu0Var).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Throwable th;
        zv4 b34Var;
        byte b = this.q;
        px0 px0Var = px0.j;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                yz yzVar = (yz) obj2;
                tp3 tp3Var = ((zz) this.c).y;
                byte b2 = this.w;
                try {
                    if (b2 == 0) {
                        js2.o(obj);
                        this.w = (byte) 1;
                        if (yzVar.a(this) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (b2 != 1 && b2 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    tp3Var.setValue(Boolean.FALSE);
                    return og5.g;
                } catch (Throwable th2) {
                    tp3Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            default:
                p01 p01Var = (p01) obj2;
                byte b3 = this.w;
                try {
                    if (b3 == 0) {
                        js2.o(obj);
                        this.w = (byte) 1;
                        obj = p01Var.t(true, this);
                        if (obj == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                l0.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.c;
                            js2.o(obj);
                            b34Var = new b34(((Number) obj).intValue(), th);
                            return new fp3(b34Var, Boolean.TRUE);
                        }
                        js2.o(obj);
                    }
                    b34Var = (zv4) obj;
                    break;
                } catch (Throwable th3) {
                    xp4 xp4VarN = p01Var.n();
                    this.c = th3;
                    this.w = (byte) 2;
                    Integer numG = xp4VarN.g();
                    if (numG != px0Var) {
                        obj = numG;
                        th = th3;
                    }
                    return px0Var;
                }
                return new fp3(b34Var, Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(p01 p01Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.i = p01Var;
    }
}
