package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cs implements ji3 {
    public static final cs g = new cs();
    public static final un1 y = un1.g("sdkVersion");
    public static final un1 r = un1.g("model");
    public static final un1 n = un1.g("hardware");
    public static final un1 v = un1.g("device");
    public static final un1 x = un1.g("product");
    public static final un1 l = un1.g("osBuild");
    public static final un1 j = un1.g("manufacturer");
    public static final un1 t = un1.g("fingerprint");
    public static final un1 a = un1.g("locale");
    public static final un1 m = un1.g("country");
    public static final un1 q = un1.g("mccMnc");
    public static final un1 w = un1.g("applicationBuild");

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        f9 f9Var = (f9) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.g(y, ((cu) f9Var).g);
        cu cuVar = (cu) f9Var;
        ki3Var.g(r, cuVar.y);
        ki3Var.g(n, cuVar.r);
        ki3Var.g(v, cuVar.n);
        ki3Var.g(x, cuVar.v);
        ki3Var.g(l, cuVar.x);
        ki3Var.g(j, cuVar.l);
        ki3Var.g(t, cuVar.j);
        ki3Var.g(a, cuVar.t);
        ki3Var.g(m, cuVar.a);
        ki3Var.g(q, cuVar.m);
        ki3Var.g(w, cuVar.q);
    }
}
