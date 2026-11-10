package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o6 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ bz1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long i;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ cn4 m;
    public final /* synthetic */ long q;
    public final /* synthetic */ nm0 s;
    public final /* synthetic */ bz1 t;
    public final /* synthetic */ long w;

    public o6(bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3, cn4 cn4Var, long j, long j2, long j3, long j4, bz1 bz1Var4, nm0 nm0Var) {
        this.j = bz1Var;
        this.t = bz1Var2;
        this.a = bz1Var3;
        this.m = cn4Var;
        this.q = j;
        this.w = j2;
        this.c = j3;
        this.i = j4;
        this.b = bz1Var4;
        this.s = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            p6.g(ue5.m0(1367541877, new n6(this.b, this.s, b), h02Var), null, this.j, this.t, this.a, this.m, this.q, tj0.v(xa6.g, h02Var), this.w, this.c, this.i, h02Var, 6);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
