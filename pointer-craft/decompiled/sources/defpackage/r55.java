package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r55 implements gg4 {
    public final /* synthetic */ gg4 g;
    public final z51 r;
    public final z51 y;

    public r55(gg4 gg4Var, final s55 s55Var) {
        this.g = gg4Var;
        final byte b = 0;
        this.y = pt4.y(new my1() { // from class: q55
            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                s55 s55Var2 = s55Var;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(s55Var2.g.d() < s55Var2.y.d());
                    default:
                        return Boolean.valueOf(s55Var2.g.d() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.r = pt4.y(new my1() { // from class: q55
            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                s55 s55Var2 = s55Var;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(s55Var2.g.d() < s55Var2.y.d());
                    default:
                        return Boolean.valueOf(s55Var2.g.d() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.gg4
    public final boolean g() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    @Override // defpackage.gg4
    public final Object n(ub3 ub3Var, bz1 bz1Var, ou0 ou0Var) {
        return this.g.n(ub3Var, bz1Var, ou0Var);
    }

    @Override // defpackage.gg4
    public final boolean r() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    @Override // defpackage.gg4
    public final float v(float f) {
        return this.g.v(f);
    }

    @Override // defpackage.gg4
    public final boolean y() {
        return this.g.y();
    }
}
