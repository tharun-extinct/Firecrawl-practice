package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs implements ji3 {
    public static final fs g = new fs();
    public static final un1 y = un1.g("eventTimeMs");
    public static final un1 r = un1.g("eventCode");
    public static final un1 n = un1.g("eventUptimeMs");
    public static final un1 v = un1.g("sourceExtension");
    public static final un1 x = un1.g("sourceExtensionJsonProto3");
    public static final un1 l = un1.g("timezoneOffsetSeconds");
    public static final un1 j = un1.g("networkConnectionInfo");

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        cy2 cy2Var = (cy2) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.n(y, ((qu) cy2Var).g);
        qu quVar = (qu) cy2Var;
        ki3Var.g(r, quVar.y);
        ki3Var.n(n, quVar.r);
        ki3Var.g(v, quVar.n);
        ki3Var.g(x, quVar.v);
        ki3Var.n(l, quVar.x);
        ki3Var.g(j, quVar.l);
    }
}
