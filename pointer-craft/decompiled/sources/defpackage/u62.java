package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u62 implements tl5 {
    public static final cm1 n = new cm1((byte) 12);
    public final yp2 g;
    public final g5 r;
    public final tl5 y;

    public u62(yp2 yp2Var, tl5 tl5Var, q64 q64Var) {
        this.g = yp2Var;
        this.y = tl5Var;
        this.r = new g5(q64Var, (byte) 1);
    }

    @Override // defpackage.tl5
    public final pl5 g(Class cls) {
        if (!this.g.containsKey(cls)) {
            return this.y.g(cls);
        }
        uo1.u("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // defpackage.tl5
    public final pl5 y(Class cls, ea3 ea3Var) {
        return this.g.containsKey(cls) ? this.r.y(cls, ea3Var) : this.y.y(cls, ea3Var);
    }
}
