package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 extends kk2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj1(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.t = b;
        this.a = obj;
        this.m = obj2;
        this.q = obj3;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        float f = 1.0f;
        Object obj2 = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                int iOrdinal = ((mj1) obj).ordinal();
                if (iOrdinal == 0) {
                    hn1 hn1Var = ((ek1) obj4).g.g;
                    if (hn1Var != null) {
                        f = hn1Var.g;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uo1.g();
                        return null;
                    }
                    hn1 hn1Var2 = ((dm1) obj3).g.g;
                    f = hn1Var2 != null ? hn1Var2.g : ((ho4) obj2).x;
                }
                return Float.valueOf(f);
            case 1:
                int iOrdinal2 = ((mj1) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ae4 ae4Var = ((ek1) obj4).g.n;
                    if (ae4Var != null) {
                        f = ae4Var.g;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        uo1.g();
                        return null;
                    }
                    ae4 ae4Var2 = ((dm1) obj3).g.n;
                    f = ae4Var2 != null ? ae4Var2.g : ((ho4) obj2).l;
                }
                return Float.valueOf(f);
            default:
                return new bh((st4) obj4, obj3, (oh) obj2, (byte) 0);
        }
    }
}
