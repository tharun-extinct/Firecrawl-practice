package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gs implements ji3 {
    public static final gs g = new gs();
    public static final un1 y = un1.g("requestTimeMs");
    public static final un1 r = un1.g("requestUptimeMs");
    public static final un1 n = un1.g("clientInfo");
    public static final un1 v = un1.g("logSource");
    public static final un1 x = un1.g("logSourceName");
    public static final un1 l = un1.g("logEvent");
    public static final un1 j = un1.g("qosTier");

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        fy2 fy2Var = (fy2) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.n(y, ((ru) fy2Var).g);
        ru ruVar = (ru) fy2Var;
        ki3Var.n(r, ruVar.y);
        ki3Var.g(n, ruVar.r);
        ki3Var.g(v, ruVar.n);
        ki3Var.g(x, ruVar.v);
        ki3Var.g(l, ruVar.x);
        ki3Var.g(j, ruVar.l);
    }
}
