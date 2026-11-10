package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo implements bz1 {
    public final /* synthetic */ jz1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ xo(boolean z, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.t = z;
        this.a = jz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        jz1 jz1Var = this.a;
        boolean z = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                c93.r(z, (my1) jz1Var, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                y94.c(aq2.J(1), (bz1) jz1Var, (h02) obj, z);
                break;
        }
        return og5Var;
    }
}
