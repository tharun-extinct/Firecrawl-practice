package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r03 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r03(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = this.t;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                aq2.j((qr0) obj4, (wm4) obj3, (h02) obj, aq2.J(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                g75.g((k85) obj4, (bz1) obj3, (h02) obj, aq2.J(b2 | 1));
                break;
        }
        return og5Var;
    }
}
