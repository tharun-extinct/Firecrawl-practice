package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jm1 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cn4 c;
    public final /* synthetic */ long i;
    public final /* synthetic */ pm1 j;
    public final /* synthetic */ pb3 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ nm0 s;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ rf4 w;

    public jm1(pm1 pm1Var, j73 j73Var, boolean z, pb3 pb3Var, ob3 ob3Var, rf4 rf4Var, cn4 cn4Var, long j, float f, nm0 nm0Var) {
        this.j = pm1Var;
        this.t = j73Var;
        this.a = z;
        this.m = pb3Var;
        this.q = ob3Var;
        this.w = rf4Var;
        this.c = cn4Var;
        this.i = j;
        this.b = f;
        this.s = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            pm1 pm1Var = this.j;
            v13.g(ra.G(this.t, new om1(this.a, pm1Var.a, pm1Var.m)), this.m, this.q, this.w, this.c, this.i, this.b, this.s, h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
