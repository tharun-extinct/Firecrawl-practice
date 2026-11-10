package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sk0 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ b65 t;

    public /* synthetic */ sk0(b65 b65Var, nm0 nm0Var, int i, byte b) {
        this.j = b;
        this.t = b65Var;
        this.a = nm0Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        nm0 nm0Var = this.a;
        b65 b65Var = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qc6.g(b65Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
            default:
                rd6.g(b65Var, nm0Var, h02Var, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }
}
