package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class js4 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ k85 m;
    public final /* synthetic */ long q;
    public final /* synthetic */ nm0 t;
    public final /* synthetic */ long w;

    public js4(bz1 bz1Var, nm0 nm0Var, bz1 bz1Var2, k85 k85Var, long j, long j2) {
        this.j = bz1Var;
        this.t = nm0Var;
        this.a = bz1Var2;
        this.m = k85Var;
        this.q = j;
        this.w = j2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            h02Var.X(-168976609);
            fg6.g(this.t, this.j, this.a, this.m, this.q, this.w, h02Var, 0);
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
