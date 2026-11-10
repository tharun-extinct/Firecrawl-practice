package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wz2 implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ j73 m;
    public final /* synthetic */ long t;

    public /* synthetic */ wz2(long j, my1 my1Var, j73 j73Var, int i, byte b) {
        this.j = b;
        this.t = j;
        this.a = my1Var;
        this.m = j73Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                rz5.j(this.t, this.a, this.m, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rz5.q(this.t, this.a, this.m, (h02) obj, aq2.J(385));
                break;
        }
        return og5Var;
    }
}
