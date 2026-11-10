package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qe0 extends zz4 implements bz1 {
    public final /* synthetic */ ve2 c;
    public final /* synthetic */ st4 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe0(ve2 ve2Var, st4 st4Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ve2Var;
        this.i = st4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new qe0(this.c, this.i, mu0Var, (byte) 0);
            default:
                return new qe0(this.c, this.i, mu0Var, (byte) 1);
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
        return ((qe0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        st4 st4Var = this.i;
        ve2 ve2Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                er1 er1VarG = ve2Var.g();
                pe0 pe0Var = new pe0(st4Var, (byte) 0);
                this.w = true;
                return er1VarG.r(pe0Var, this) == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                er1 er1VarG2 = ve2Var.g();
                pe0 pe0Var2 = new pe0(st4Var, (byte) 1);
                this.w = true;
                return er1VarG2.r(pe0Var2, this) == px0Var ? px0Var : og5Var;
        }
    }
}
