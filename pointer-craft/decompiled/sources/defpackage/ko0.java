package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko0 implements bz1 {
    public final /* synthetic */ ba a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ nm0 m;
    public final /* synthetic */ mo0 t;

    public /* synthetic */ ko0(ba baVar, mo0 mo0Var, nm0 nm0Var) {
        this.a = baVar;
        this.t = mo0Var;
        this.m = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        nm0 nm0Var = this.m;
        ba baVar = this.a;
        mo0 mo0Var = this.t;
        h02 h02Var = (h02) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    h02Var.X(866651995);
                    hp0.g(baVar, mo0Var.q, nm0Var, h02Var, 0);
                    h02Var.b(false);
                }
                break;
            default:
                num.getClass();
                mo0Var.g(baVar, nm0Var, h02Var, aq2.J(1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ko0(mo0 mo0Var, ba baVar, nm0 nm0Var, int i) {
        this.t = mo0Var;
        this.a = baVar;
        this.m = nm0Var;
    }
}
