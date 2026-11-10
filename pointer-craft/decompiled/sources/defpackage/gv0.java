package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gv0 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ my1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv0(my1 my1Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = my1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new gv0(this.w, mu0Var, (byte) 0);
            default:
                return new gv0(this.w, mu0Var, (byte) 1);
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
                ((gv0) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((gv0) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        my1 my1Var = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                my1Var.g();
                break;
            default:
                js2.o(obj);
                my1Var.g();
                break;
        }
        return og5Var;
    }
}
