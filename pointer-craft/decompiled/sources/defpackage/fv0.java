package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fv0 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ q04 t;

    public /* synthetic */ fv0(q04 q04Var, int i, byte b) {
        this.j = b;
        this.t = q04Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        q04 q04Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wa6.y(q04Var, h02Var, aq2.J(1));
                break;
            default:
                wa6.r(q04Var, h02Var, aq2.J(1));
                break;
        }
        return og5Var;
    }
}
