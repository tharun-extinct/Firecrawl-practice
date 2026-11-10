package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xs implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ float t;

    public /* synthetic */ xs(float f, Object obj, int i, byte b) {
        this.j = b;
        this.t = f;
        this.a = obj;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        Object obj3 = this.a;
        float f = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ot.i(f, (j73) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ot.h(f, (j73) obj3, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ot.c(f, (String) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }
}
