package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ds5 extends zz4 implements bz1 {
    public final /* synthetic */ es5 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds5(es5 es5Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = es5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        es5 es5Var = this.c;
        switch (b) {
            case 0:
                return new ds5(es5Var, mu0Var, (byte) 0);
            default:
                return new ds5(es5Var, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ds5) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        es5 es5Var = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    ba baVar = es5Var.j;
                    this.w = true;
                    Object objQ = baVar.D.q(this);
                    if (objQ != px0Var) {
                        objQ = og5Var;
                    }
                    if (objQ == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    ba baVar2 = es5Var.j;
                    this.w = true;
                    Object objG = baVar2.E.g(this);
                    if (objG != px0Var) {
                        objG = og5Var;
                    }
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
