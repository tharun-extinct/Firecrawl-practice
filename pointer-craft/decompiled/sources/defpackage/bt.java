package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bt implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ my1 t;

    public /* synthetic */ bt(my1 my1Var, j73 j73Var, int i, byte b) {
        this.j = b;
        this.t = my1Var;
        this.a = j73Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        j73 j73Var = this.a;
        my1 my1Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ot.u(aq2.J(i | 1), my1Var, h02Var, j73Var);
                break;
            default:
                ot.j(aq2.J(i | 1), my1Var, h02Var, j73Var);
                break;
        }
        return og5Var;
    }
}
