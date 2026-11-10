package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q20 extends zz4 implements bz1 {
    public final /* synthetic */ v20 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q20(v20 v20Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = v20Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        v20 v20Var = this.c;
        switch (b) {
            case 0:
                return new q20(v20Var, mu0Var, (byte) 0);
            case 1:
                return new q20(v20Var, mu0Var, (byte) 1);
            default:
                return new q20(v20Var, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((q20) b(mu0Var, ox0Var)).u(og5Var);
                return px0Var;
            case 1:
                ((q20) b(mu0Var, ox0Var)).u(og5Var);
                return px0Var;
            default:
                return ((q20) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        v20 v20Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                        l0.x();
                    }
                    return null;
                }
                js2.o(obj);
                co4 co4Var = v20Var.g.B;
                this.w = true;
                co4Var.r(p20.j, this);
                return px0Var;
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                        l0.x();
                    }
                    return null;
                }
                js2.o(obj);
                co4 co4Var2 = v20Var.g.C;
                r20 r20Var = new r20(v20Var, (byte) 0);
                this.w = true;
                co4Var2.r(r20Var, this);
                return px0Var;
            default:
                boolean z3 = this.w;
                try {
                    if (z3) {
                        if (!z3) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                        throw new il0(false);
                    }
                    js2.o(obj);
                    co4 co4Var3 = v20Var.g.A;
                    r20 r20Var2 = new r20(v20Var, (byte) 1);
                    this.w = true;
                    co4Var3.r(r20Var2, this);
                    return px0Var;
                } catch (Throwable unused) {
                    return og5.g;
                }
        }
    }
}
