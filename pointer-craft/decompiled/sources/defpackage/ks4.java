package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ks4 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ long m;
    public final /* synthetic */ long q;
    public final /* synthetic */ nm0 t;

    public ks4(bz1 bz1Var, nm0 nm0Var, bz1 bz1Var2, long j, long j2) {
        this.j = bz1Var;
        this.t = nm0Var;
        this.a = bz1Var2;
        this.m = j;
        this.q = j2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            og0.y(g75.g.g(of5.g(pe6.j, h02Var)), ue5.m0(969655473, new js4(this.j, this.t, this.a, of5.g(pe6.y, h02Var), this.m, this.q), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
