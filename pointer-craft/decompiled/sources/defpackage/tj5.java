package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tj5 extends kk2 implements xy1 {
    public final /* synthetic */ uj5 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj5(uj5 uj5Var, byte b) {
        super(1);
        this.t = b;
        this.a = uj5Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        long j;
        byte b = this.t;
        uj5 uj5Var = this.a;
        switch (b) {
            case 0:
                fc5 fc5Var = (fc5) obj;
                mj1 mj1Var = mj1.j;
                mj1 mj1Var2 = mj1.t;
                if (fc5Var.y(mj1Var, mj1Var2)) {
                    mc5 mc5Var = uj5Var.f.g;
                    return yj1.r;
                }
                if (!fc5Var.y(mj1Var2, mj1.a)) {
                    return yj1.r;
                }
                mc5 mc5Var2 = uj5Var.k.g;
                return yj1.r;
            default:
                int iOrdinal = ((mj1) obj).ordinal();
                if (iOrdinal == 0) {
                    mc5 mc5Var3 = uj5Var.f.g;
                    j = jj0.l;
                } else if (iOrdinal == 1) {
                    mc5 mc5Var4 = uj5Var.f.g;
                    mc5 mc5Var5 = uj5Var.k.g;
                    j = jj0.l;
                } else {
                    if (iOrdinal != 2) {
                        up.y();
                        return null;
                    }
                    mc5 mc5Var6 = uj5Var.k.g;
                    j = uj5Var.d.v;
                }
                return new jj0(j);
        }
    }
}
