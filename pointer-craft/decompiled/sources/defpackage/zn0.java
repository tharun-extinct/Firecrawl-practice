package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn0 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new zn0(2, mu0Var, (byte) 0);
            default:
                return new zn0(2, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((zn0) b((mu0) obj2, (er1) obj)).u(og5Var);
                break;
            default:
                ((zn0) b((mu0) obj2, (gr1) obj)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                js2.o(obj);
                break;
            default:
                js2.o(obj);
                break;
        }
        return og5Var;
    }
}
