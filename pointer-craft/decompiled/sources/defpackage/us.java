package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class us implements bz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ us(j73 j73Var, nm0 nm0Var, int i, int i2) {
        this.t = j73Var;
        this.q = nm0Var;
        this.a = i;
        this.m = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.a;
        Object obj3 = this.t;
        Object obj4 = this.q;
        boolean z = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ot.b((String) obj4, z, (j73) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ot.p((j73) obj3, (nm0) obj4, (h02) obj, aq2.J(i | 1), z ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                be2.g(z, (n74) obj4, (b65) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ us(String str, boolean z, j73 j73Var, int i) {
        this.q = str;
        this.m = z;
        this.t = j73Var;
        this.a = i;
    }

    public /* synthetic */ us(boolean z, n74 n74Var, b65 b65Var, int i) {
        this.m = z;
        this.q = n74Var;
        this.t = b65Var;
        this.a = i;
    }
}
