package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yv implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ yv(pn0 pn0Var, boolean z) {
        this.j = (byte) 0;
        this.a = pn0Var;
        this.t = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        boolean z = this.t;
        switch (b) {
            case 0:
                pn0 pn0Var = (pn0) obj2;
                ((uv) pn0Var.g).x(z);
                ((tv) pn0Var.y).x(z);
                return new aw((ou2) obj, pn0Var);
            case 1:
                ((o84) obj).r(z ? 1.0f : ((Number) ((my1) obj2).g()).floatValue());
                return og5Var;
            default:
                kr4 kr4Var = (kr4) obj2;
                nj4 nj4Var = (nj4) obj;
                if (!z) {
                    ci2[] ci2VarArr = lj4.g;
                    nj4Var.g(kj4.a, og5Var);
                }
                String strValueOf = String.valueOf(k33.Z(kr4Var.a.d() * 100.0f) / 100.0f);
                ci2[] ci2VarArr2 = lj4.g;
                mj4 mj4Var = kj4.y;
                ci2 ci2Var = lj4.g[0];
                mj4Var.getClass();
                nj4Var.g(mj4Var, strValueOf);
                nj4Var.g(yi4.t, new p1(null, new er4(kr4Var, (byte) 1)));
                return og5Var;
        }
    }

    public /* synthetic */ yv(byte b, Object obj, boolean z) {
        this.j = b;
        this.t = z;
        this.a = obj;
    }
}
