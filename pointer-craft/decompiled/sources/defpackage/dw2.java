package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw2 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ bz1 t;

    public dw2(nm0 nm0Var, nm0 nm0Var2, nm0 nm0Var3, nm0 nm0Var4, nm0 nm0Var5) {
        this.j = nm0Var;
        this.t = nm0Var2;
        this.a = nm0Var3;
        this.m = nm0Var4;
        this.q = nm0Var5;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            lr2.n(this.j, this.t, this.a, this.m, this.q, h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
