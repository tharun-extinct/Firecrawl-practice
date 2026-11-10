package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ms implements bz1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ms(my1 my1Var, int i, byte b) {
        this.j = b;
        this.t = my1Var;
        this.a = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = this.a;
        my1 my1Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ot.v(my1Var, h02Var, aq2.J(b2 | 1));
                break;
            case 1:
                k33.r(my1Var, h02Var, aq2.J(b2 | 1));
                break;
            default:
                mf6.y(my1Var, h02Var, aq2.J(b2 | 1));
                break;
        }
        return og5Var;
    }
}
