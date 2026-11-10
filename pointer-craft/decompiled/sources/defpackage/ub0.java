package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ub0 implements bz1 {
    public final /* synthetic */ cn4 a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ sb0 m;
    public final /* synthetic */ tb0 q;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ z40 w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ub0(j73 j73Var, cn4 cn4Var, sb0 sb0Var, tb0 tb0Var, z40 z40Var, nm0 nm0Var, int i, int i2, byte b) {
        this.j = b;
        this.t = j73Var;
        this.a = cn4Var;
        this.m = sb0Var;
        this.q = tb0Var;
        this.w = z40Var;
        this.c = nm0Var;
        this.i = i;
        this.b = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                fb6.g(this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                fb6.r(this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ2, this.b);
                break;
        }
        return og5Var;
    }
}
