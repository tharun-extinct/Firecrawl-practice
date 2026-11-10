package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e46 implements ji3 {
    public static final e46 g = new e46();
    public static final un1 y = new un1("supportedFormats", fj.l(ei3.n(ax5.class, new nw5(1))));
    public static final un1 r = new un1("durationMs", fj.l(ei3.n(ax5.class, new nw5(2))));
    public static final un1 n = new un1("errorCode", fj.l(ei3.n(ax5.class, new nw5(3))));
    public static final un1 v = new un1("allowManualInput", fj.l(ei3.n(ax5.class, new nw5(4))));

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        ob6 ob6Var = (ob6) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.g(y, ob6Var.g);
        ki3Var.g(r, ob6Var.y);
        ki3Var.g(n, ob6Var.r);
        ki3Var.g(v, ob6Var.n);
    }
}
