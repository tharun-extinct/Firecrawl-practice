package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 extends kk2 implements xy1 {
    public final /* synthetic */ dk1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck1(dk1 dk1Var, byte b) {
        super(1);
        this.t = b;
        this.a = dk1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        no1 no1Var;
        no1 no1Var2;
        byte b = this.t;
        mj1 mj1Var = mj1.a;
        mj1 mj1Var2 = mj1.t;
        mj1 mj1Var3 = mj1.j;
        dk1 dk1Var = this.a;
        switch (b) {
            case 0:
                fc5 fc5Var = (fc5) obj;
                boolean zY = fc5Var.y(mj1Var3, mj1Var2);
                Object obj2 = null;
                if (zY) {
                    wc0 wc0Var = dk1Var.e.g.r;
                    if (wc0Var != null) {
                        obj2 = wc0Var.r;
                    }
                } else if (fc5Var.y(mj1Var2, mj1Var)) {
                    wc0 wc0Var2 = dk1Var.A.g.r;
                    if (wc0Var2 != null) {
                        obj2 = wc0Var2.r;
                    }
                } else {
                    obj2 = yj1.v;
                }
                return obj2 == null ? yj1.v : obj2;
            default:
                fc5 fc5Var2 = (fc5) obj;
                if (fc5Var2.y(mj1Var3, mj1Var2)) {
                    vq4 vq4Var = dk1Var.e.g.y;
                    return (vq4Var == null || (no1Var2 = vq4Var.y) == null) ? yj1.n : no1Var2;
                }
                if (!fc5Var2.y(mj1Var2, mj1Var)) {
                    return yj1.n;
                }
                vq4 vq4Var2 = dk1Var.A.g.y;
                return (vq4Var2 == null || (no1Var = vq4Var2.y) == null) ? yj1.n : no1Var;
        }
    }
}
