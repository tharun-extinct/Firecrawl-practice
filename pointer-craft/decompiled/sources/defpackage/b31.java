package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b31 implements gg4 {
    public final xy1 g;
    public final tp3 n;
    public final tp3 v;
    public final tp3 x;
    public final a31 y = new a31(this);
    public final ac3 r = new ac3();

    public b31(xy1 xy1Var) {
        this.g = xy1Var;
        Boolean bool = Boolean.FALSE;
        this.n = kq2.M(bool);
        this.v = kq2.M(bool);
        this.x = kq2.M(bool);
    }

    @Override // defpackage.gg4
    public final Object n(ub3 ub3Var, bz1 bz1Var, ou0 ou0Var) {
        Object objB = k33.B(new c(this, ub3Var, bz1Var, null, (byte) 23), ou0Var);
        return objB == px0.j ? objB : og5.g;
    }

    @Override // defpackage.gg4
    public final float v(float f) {
        return ((Number) this.g.a(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.gg4
    public final boolean y() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }
}
