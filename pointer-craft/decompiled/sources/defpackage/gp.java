package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gp extends pl5 {
    public static final /* synthetic */ int l = 0;
    public final tp3 n;
    public final f34 r;
    public final tp3 v;
    public final tp3 x;
    public final ta2 y;

    static {
        v54.g(gp.class).r();
    }

    public gp(v20 v20Var, ta2 ta2Var) {
        v20Var.getClass();
        ta2Var.getClass();
        this.y = ta2Var;
        this.r = pw5.N(v20Var.r(), v70.d(this), ro4.g, Boolean.valueOf(v20Var.g()));
        this.n = kq2.M(null);
        this.v = kq2.M(null);
        this.x = kq2.M(new ip(null, false, false));
    }

    public final void l(Integer num, String str) {
        x(ip.g(v(), new by3(num, str), false, false, 6));
    }

    public final ip v() {
        return (ip) this.x.getValue();
    }

    public final void x(ip ipVar) {
        this.x.setValue(ipVar);
    }
}
