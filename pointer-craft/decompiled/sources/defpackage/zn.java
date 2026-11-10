package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zn implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zn(nm3 nm3Var, my1 my1Var, int i, byte b) {
        this.j = b;
        this.m = nm3Var;
        this.a = my1Var;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = this.t;
        Object obj3 = this.a;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                m50.m((my1) obj3, (nm0) obj4, (h02) obj, aq2.J(b2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                by5.g((wi2) obj3, (bz1) obj4, (h02) obj, aq2.J(b2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                yf6.n((nm3) obj4, (my1) obj3, (h02) obj, aq2.J(b2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                yf6.m((mm3) obj4, (my1) obj3, (h02) obj, aq2.J(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yf6.g((fm3) obj4, (my1) obj3, (h02) obj, aq2.J(b2 | 1));
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zn(Object obj, bz1 bz1Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = bz1Var;
        this.t = i;
    }
}
