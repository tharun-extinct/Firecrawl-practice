package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qs implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ byte m;
    public final /* synthetic */ String t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qs(String str, my1 my1Var, int i, byte b) {
        this.j = b;
        this.t = str;
        this.a = my1Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = this.m;
        my1 my1Var = this.a;
        String str = this.t;
        h02 h02Var = (h02) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ot.g(str, my1Var, h02Var, aq2.J(b2 | 1));
                break;
            case 1:
                gp4.c(str, my1Var, h02Var, aq2.J(b2 | 1));
                break;
            default:
                gp4.q(str, my1Var, h02Var, aq2.J(b2 | 1));
                break;
        }
        return og5Var;
    }
}
