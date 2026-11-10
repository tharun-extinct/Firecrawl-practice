package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zc implements bz1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ float c;
    public final /* synthetic */ nm0 i;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ rf4 m;
    public final /* synthetic */ cn4 q;
    public final /* synthetic */ pb3 t;
    public final /* synthetic */ long w;

    public zc(j73 j73Var, pb3 pb3Var, ob3 ob3Var, rf4 rf4Var, cn4 cn4Var, long j, float f, nm0 nm0Var) {
        this.j = j73Var;
        this.t = pb3Var;
        this.a = ob3Var;
        this.m = rf4Var;
        this.q = cn4Var;
        this.w = j;
        this.c = f;
        this.i = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            v13.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
