package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dc1 implements xy1 {
    public final /* synthetic */ v92 a;
    public final /* synthetic */ u54 j;
    public final /* synthetic */ ec1 t;

    public dc1(u54 u54Var, ec1 ec1Var, v92 v92Var) {
        this.j = u54Var;
        this.t = ec1Var;
        this.a = v92Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        hd5 hd5Var = (hd5) obj;
        ec1 ec1Var = (ec1) hd5Var;
        if (!((pb) ((ba) k33.W(this.t)).getDragAndDropManager()).y.contains(ec1Var) || !re6.n(ec1Var, se6.y(this.a))) {
            return gd5.j;
        }
        this.j.j = hd5Var;
        return gd5.a;
    }
}
