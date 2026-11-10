package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf4 implements gg4 {
    public static final ji m = new ji((Object) new od4(3), (Object) new nd4(21), (byte) 29);
    public final z51 a;
    public final qp3 g;
    public float l;
    public final z51 t;
    public final qp3 y = new qp3(0);
    public final qp3 r = new qp3(0);
    public final tp3 n = kq2.M(Boolean.FALSE);
    public final ja3 v = new ja3();
    public final qp3 x = new qp3(Integer.MAX_VALUE);
    public final b31 j = new b31(new s94(this, 2));

    public rf4(int i) {
        this.g = new qp3(i);
        final byte b = 0;
        this.t = pt4.y(new my1(this) { // from class: qf4
            public final /* synthetic */ rf4 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                rf4 rf4Var = this.t;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(rf4Var.g.d() < rf4Var.x.d());
                    default:
                        return Boolean.valueOf(rf4Var.g.d() > 0);
                }
            }
        });
        final byte b2 = 1;
        this.a = pt4.y(new my1(this) { // from class: qf4
            public final /* synthetic */ rf4 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                rf4 rf4Var = this.t;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(rf4Var.g.d() < rf4Var.x.d());
                    default:
                        return Boolean.valueOf(rf4Var.g.d() > 0);
                }
            }
        });
    }

    @Override // defpackage.gg4
    public final boolean g() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    @Override // defpackage.gg4
    public final Object n(ub3 ub3Var, bz1 bz1Var, ou0 ou0Var) {
        Object objN = this.j.n(ub3Var, bz1Var, ou0Var);
        return objN == px0.j ? objN : og5.g;
    }

    @Override // defpackage.gg4
    public final boolean r() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.gg4
    public final float v(float f) {
        return this.j.v(f);
    }

    @Override // defpackage.gg4
    public final boolean y() {
        return this.j.y();
    }
}
