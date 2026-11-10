package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v60 implements xy1 {
    public final /* synthetic */ long j;

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ib0 ib0Var;
        Object g84Var;
        long j = this.j;
        w60 w60Var = (w60) obj;
        xy1 xy1Var = w60Var.y;
        if (xy1Var != null && (ib0Var = w60Var.g) != null) {
            try {
                g84Var = xy1Var.a(Long.valueOf(j));
            } catch (Throwable th) {
                g84Var = new g84(th);
            }
            ib0Var.j(g84Var);
        }
        return og5.g;
    }
}
