package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b94 extends kk2 implements xy1 {
    public final /* synthetic */ c94 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b94(c94 c94Var, byte b) {
        super(1);
        this.t = b;
        this.a = c94Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        c94 c94Var = this.a;
        switch (b) {
            case 0:
                return Double.valueOf(c94Var.c.n(xs2.m(((Number) obj).doubleValue(), c94Var.v, c94Var.x)));
            default:
                return Double.valueOf(xs2.m(c94Var.m.n(((Number) obj).doubleValue()), c94Var.v, c94Var.x));
        }
    }
}
