package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qg4 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ qg4(boolean z, String str, wr4 wr4Var) {
        this.j = (byte) 2;
        this.t = z;
        this.a = str;
        this.m = wr4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.m;
        Object obj3 = this.a;
        boolean z = this.t;
        switch (b) {
            case 0:
                String str = (String) obj2;
                nj4 nj4Var = (nj4) obj;
                lj4.n(nj4Var, (String) obj3);
                if (z) {
                    mj4 mj4Var = kj4.y;
                    ci2 ci2Var = lj4.g[0];
                    mj4Var.getClass();
                    nj4Var.g(mj4Var, str);
                }
                break;
            case 1:
                ((ts3) obj).j((us3) obj2, 0, 0, ((Number) ((bw4) obj3).getValue()).floatValue() + (z ? 5.0f : 0.0f));
                break;
            default:
                String str2 = (String) obj3;
                wr4 wr4Var = (wr4) obj2;
                nj4 nj4Var2 = (nj4) obj;
                if (z) {
                    ci2[] ci2VarArr = lj4.g;
                    mj4 mj4Var2 = kj4.m;
                    ci2 ci2Var2 = lj4.g[3];
                    fx2 fx2VarG = fx2.g(0);
                    mj4Var2.getClass();
                    nj4Var2.g(mj4Var2, fx2VarG);
                }
                zr4 zr4Var = new zr4(wr4Var, (byte) 0);
                ci2[] ci2VarArr2 = lj4.g;
                nj4Var2.g(yi4.o, new p1(null, zr4Var));
                lj4.l(nj4Var2, str2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ qg4(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = z;
        this.m = obj2;
    }
}
