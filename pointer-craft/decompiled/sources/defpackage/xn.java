package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xn implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ j73 t;

    public /* synthetic */ xn(j73 j73Var, int i, byte b) {
        this.j = b;
        this.t = j73Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        j73 j73Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                m50.o(j73Var, h02Var, aq2.J(1));
                break;
            case 1:
                ot.o(j73Var, h02Var, aq2.J(1));
                break;
            case 2:
                ot.m(j73Var, h02Var, aq2.J(1));
                break;
            default:
                ot.q(j73Var, h02Var, aq2.J(1));
                break;
        }
        return og5Var;
    }
}
