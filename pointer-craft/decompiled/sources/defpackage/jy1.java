package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy1 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jy1(j73 j73Var, int i, int i2) {
        this.m = j73Var;
        this.t = i;
        this.a = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        boolean z = this.a;
        byte b2 = this.t;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ra.a(aq2.J(b2 | 1), (nm0) obj3, (h02) obj, z);
                break;
            default:
                ((Integer) obj2).getClass();
                xs2.y((j73) obj3, (h02) obj, aq2.J(b2 | 1), z ? 1 : 0);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jy1(boolean z, nm0 nm0Var, int i) {
        this.a = z;
        this.m = nm0Var;
        this.t = i;
    }
}
