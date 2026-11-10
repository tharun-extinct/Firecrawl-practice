package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh4 {
    public final Object g;
    public int j = -1;
    public Object l;
    public final Object n;
    public final cz1 r;
    public final /* synthetic */ zh4 t;
    public final zz4 v;
    public final cz1 x;
    public final cz1 y;

    public xh4(zh4 zh4Var, Object obj, cz1 cz1Var, cz1 cz1Var2, Object obj2, zz4 zz4Var, cz1 cz1Var3) {
        this.t = zh4Var;
        this.g = obj;
        this.y = cz1Var;
        this.r = cz1Var2;
        this.n = obj2;
        this.v = zz4Var;
        this.x = cz1Var3;
    }

    public final void g() {
        Object obj = this.l;
        if (obj instanceof nh4) {
            ((nh4) obj).j(this.j, this.t.j);
            return;
        }
        ya1 ya1Var = obj instanceof ya1 ? (ya1) obj : null;
        if (ya1Var != null) {
            ya1Var.g();
        }
    }
}
