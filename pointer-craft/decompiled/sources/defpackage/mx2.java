package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx2 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ int t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mx2(j73 j73Var, bz1 bz1Var, int i, int i2) {
        this.m = j73Var;
        this.q = bz1Var;
        this.t = i;
        this.a = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        boolean z = this.a;
        int i = this.t;
        bz1 bz1Var = this.q;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nx2.g((jd3) obj3, z, (nm0) bz1Var, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gp4.o((j73) obj3, bz1Var, (h02) obj, aq2.J(i | 1), z ? 1 : 0);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ mx2(jd3 jd3Var, boolean z, nm0 nm0Var, int i) {
        this.m = jd3Var;
        this.a = z;
        this.q = nm0Var;
        this.t = i;
    }
}
