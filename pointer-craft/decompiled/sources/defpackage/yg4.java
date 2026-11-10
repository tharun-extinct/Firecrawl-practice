package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yg4 implements bz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ bz1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bz1 i;
    public final /* synthetic */ pg4 j;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ bz1 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ xy1 w;

    public yg4(pg4 pg4Var, String str, xy1 xy1Var, xy1 xy1Var2, boolean z, xy1 xy1Var3, boolean z2, bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3) {
        this.j = pg4Var;
        this.t = str;
        this.a = xy1Var;
        this.m = xy1Var2;
        this.q = z;
        this.w = xy1Var3;
        this.c = z2;
        this.i = bz1Var;
        this.b = bz1Var2;
        this.s = bz1Var3;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ug4.g.g(this.t, this.a, this.m, this.q, this.w, mq4.r(g73.g, 1.0f), this.c, this.i, this.b, this.s, this.j.r, h02Var, 196608);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
