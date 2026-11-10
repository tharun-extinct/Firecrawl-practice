package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends kk2 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nm0 i;
    public final /* synthetic */ j73 m;
    public final /* synthetic */ Object p;
    public final /* synthetic */ ek1 q;
    public final /* synthetic */ byte s;
    public final /* synthetic */ byte t;
    public final /* synthetic */ dm1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bi(Object obj, boolean z, j73 j73Var, ek1 ek1Var, dm1 dm1Var, String str, nm0 nm0Var, int i, int i2, byte b) {
        super(2);
        this.t = b;
        this.p = obj;
        this.a = z;
        this.m = j73Var;
        this.q = ek1Var;
        this.w = dm1Var;
        this.c = str;
        this.i = nm0Var;
        this.b = i;
        this.s = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.t;
        og5 og5Var = og5.g;
        int i = this.b;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iJ = aq2.J(i | 1);
                byte b2 = this.s;
                gp4.r((lb4) obj3, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, iJ, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iJ2 = aq2.J(i | 1);
                byte b3 = this.s;
                gp4.y((gk0) obj3, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, iJ2, b3);
                break;
        }
        return og5Var;
    }
}
