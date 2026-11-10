package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class df implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ j73 t;

    public /* synthetic */ df(j73 j73Var, nm0 nm0Var, int i, byte b) {
        this.j = b;
        this.t = j73Var;
        this.a = nm0Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        nm0 nm0Var = this.a;
        j73 j73Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hh6.g(j73Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
            case 1:
                hh6.y(j73Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
            case 2:
                x31.n(j73Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
            case 3:
                xc6.y(j73Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
            default:
                xc6.g(j73Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }
}
