package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj1 extends kk2 implements my1 {
    public final /* synthetic */ ho4 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj1(ho4 ho4Var, byte b) {
        super(0);
        this.t = b;
        this.a = ho4Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.t;
        ho4 ho4Var = this.a;
        switch (b) {
            case 0:
                return ho4Var;
            default:
                tp3 tp3Var = ho4Var.y;
                Boolean bool = Boolean.FALSE;
                tp3Var.setValue(bool);
                ho4Var.r(false);
                t52 t52Var = ho4Var.r;
                ((tp3) t52Var.g).setValue(bool);
                ((tp3) t52Var.r).setValue(bool);
                ((tp3) t52Var.v).setValue(bool);
                ((tp3) t52Var.l).setValue(bool);
                ho4Var.v = jj0.l;
                ho4Var.x = 1.0f;
                ho4Var.l = 1.0f;
                xj5 xj5Var = ho4Var.a;
                if (xj5Var != null) {
                    xj5Var.n();
                }
                ho4Var.j = vb5.y;
                ho4Var.t = 0L;
                return og5.g;
        }
    }
}
