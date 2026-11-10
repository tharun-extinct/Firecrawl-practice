package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rs implements bz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ short m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ my1 t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rs(my1 my1Var, my1 my1Var2, xy1 xy1Var, int i) {
        this.t = my1Var;
        this.q = my1Var2;
        this.a = xy1Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        short s = this.m;
        xy1 xy1Var = this.a;
        Object obj3 = this.q;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ot.l((String) obj3, xy1Var, my1Var, (h02) obj, aq2.J(s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                uc6.g(my1Var, (my1) obj3, xy1Var, (h02) obj, aq2.J(s | 1));
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rs(String str, xy1 xy1Var, my1 my1Var, int i) {
        this.q = str;
        this.a = xy1Var;
        this.t = my1Var;
        this.m = i;
    }
}
