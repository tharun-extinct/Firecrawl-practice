package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rv0 extends zz4 implements bz1 {
    public final /* synthetic */ sv0 c;
    public final /* synthetic */ byte i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv0(sv0 sv0Var, byte b, mu0 mu0Var, byte b2) {
        super(2, mu0Var);
        this.q = b2;
        this.c = sv0Var;
        this.i = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new rv0(this.c, this.i, mu0Var, (byte) 0);
            default:
                return new rv0(this.c, this.i, mu0Var, (byte) 1);
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
        return ((rv0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        byte b2 = this.i;
        sv0 sv0Var = this.c;
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
                k40 k40VarT = sv0Var.y.t();
                if (k40VarT == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarT.v(b2, true, this) == px0Var ? px0Var : og5Var;
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
                k40 k40VarT2 = sv0Var.y.t();
                if (k40VarT2 == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarT2.v(b2, false, this) == px0Var ? px0Var : og5Var;
        }
    }
}
