package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ar1 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ float t;

    public /* synthetic */ ar1(float f, my1 my1Var, j73 j73Var, int i) {
        this.j = (byte) 1;
        this.t = f;
        this.a = my1Var;
        this.m = j73Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        float f = this.t;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                v70.l((my1) obj4, f, (nm0) obj3, (h02) obj, aq2.J(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rz5.w(f, (my1) obj4, (j73) obj3, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                mf6.g((j73) obj4, f, (nm0) obj3, (h02) obj, aq2.J(385));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ar1(Object obj, float f, nm0 nm0Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = f;
        this.m = nm0Var;
    }
}
