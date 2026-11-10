package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw implements bz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ jz1 m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ dw(xy1 xy1Var, boolean z, int i) {
        this.m = xy1Var;
        this.t = z;
        this.a = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.a;
        boolean z = this.t;
        jz1 jz1Var = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y94.n(z, (my1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                gp4.p((xy1) jz1Var, z, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ dw(boolean z, my1 my1Var, int i) {
        this.t = z;
        this.m = my1Var;
        this.a = i;
    }
}
