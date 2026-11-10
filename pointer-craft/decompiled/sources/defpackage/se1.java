package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class se1 extends zz4 implements bz1 {
    public final /* synthetic */ ob3 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se1(ob3 ob3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ob3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        ob3 ob3Var = this.c;
        switch (b) {
            case 0:
                return new se1(ob3Var, mu0Var, (byte) 0);
            default:
                return new se1(ob3Var, mu0Var, (byte) 1);
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
        return ((se1) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.c;
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
                we1 we1Var = (we1) ob3Var.getValue();
                this.w = true;
                we1Var.getClass();
                Object objG = we1.g(we1Var, xe1.t, we1Var.n, this);
                if (objG != px0Var) {
                    objG = og5Var;
                }
                return objG == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(300L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
        }
    }
}
