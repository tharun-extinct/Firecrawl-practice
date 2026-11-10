package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class za3 extends f84 implements bz1 {
    public bb3 a;
    public final /* synthetic */ ab3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bb3 i;
    public long[] m;
    public int q;
    public ab3 t;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za3(bb3 bb3Var, ab3 ab3Var, mu0 mu0Var) {
        super(mu0Var);
        this.i = bb3Var;
        this.b = ab3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        za3 za3Var = new za3(this.i, this.b, mu0Var);
        za3Var.c = obj;
        return za3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((za3) b((mu0) obj2, (ck4) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        ck4 ck4Var;
        bb3 bb3Var;
        long[] jArr;
        int i;
        ab3 ab3Var;
        boolean z = this.w;
        if (!z) {
            js2.o(obj);
            ck4Var = (ck4) this.c;
            bb3Var = this.i;
            ya3 ya3Var = bb3Var.t;
            jArr = ya3Var.r;
            i = ya3Var.v;
            ab3Var = this.b;
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.q;
            jArr = this.m;
            bb3Var = this.a;
            ab3Var = this.t;
            ck4Var = (ck4) this.c;
            js2.o(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return og5.g;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        ab3Var.t = i;
        Object obj2 = bb3Var.t.y[i];
        this.c = ck4Var;
        this.t = ab3Var;
        this.a = bb3Var;
        this.m = jArr;
        this.q = i2;
        this.w = true;
        ck4Var.r(this, obj2);
        return px0.j;
    }
}
