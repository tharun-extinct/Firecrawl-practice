package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lm4 extends zz4 implements bz1 {
    public final /* synthetic */ rw3 c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm4(rw3 rw3Var, Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = rw3Var;
        this.i = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        rw3 rw3Var = this.c;
        switch (b) {
            case 0:
                lm4 lm4Var = new lm4(rw3Var, obj2, mu0Var, (byte) 0);
                lm4Var.w = obj;
                return lm4Var;
            default:
                lm4 lm4Var2 = new lm4(rw3Var, obj2, mu0Var, (byte) 1);
                lm4Var2.w = obj;
                return lm4Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        db3 db3Var = (db3) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((lm4) b(mu0Var, db3Var)).u(og5Var);
                break;
            default:
                ((lm4) b(mu0Var, db3Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.i;
        rw3 rw3Var = this.c;
        db3 db3Var = (db3) this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                db3Var.getClass();
                db3Var.x(rw3Var, obj2);
                break;
            default:
                js2.o(obj);
                db3Var.getClass();
                db3Var.x(rw3Var, obj2);
                break;
        }
        return og5Var;
    }
}
