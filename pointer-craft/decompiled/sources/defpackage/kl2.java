package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kl2 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ tl2 t;

    public /* synthetic */ kl2(tl2 tl2Var, byte b) {
        this.j = b;
        this.t = tl2Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        tl2 tl2Var = this.t;
        switch (b) {
            case 0:
                xl2 xl2Var = tl2Var.o0;
                if (xl2Var != null) {
                    r04 r04VarX = rp2.x();
                    xl2Var.v(r04VarX);
                    tl2Var.A0.a(Integer.valueOf(r04VarX.m));
                }
                return og5Var;
            case 1:
                tl2Var.z0.l(new int[]{-1}, Boolean.TRUE);
                return og5Var;
            default:
                return new ql2(tl2Var);
        }
    }
}
