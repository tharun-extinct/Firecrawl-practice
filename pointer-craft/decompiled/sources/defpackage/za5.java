package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class za5 extends zz4 implements xy1 {
    public final /* synthetic */ yz c;
    public final /* synthetic */ ub3 i;
    public byte q;
    public final /* synthetic */ ab5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za5(ab5 ab5Var, yz yzVar, ub3 ub3Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.w = ab5Var;
        this.c = yzVar;
        this.i = ub3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        yz yzVar = this.c;
        ub3 ub3Var = this.i;
        return new za5(this.w, yzVar, ub3Var, (mu0) obj).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        yz yzVar = this.c;
        byte b = this.q;
        mu0 mu0Var = null;
        ub3 ub3Var = ub3.a;
        ub3 ub3Var2 = this.i;
        ab5 ab5Var = this.w;
        try {
            if (b == 0) {
                js2.o(obj);
                x55 x55Var = new x55(yzVar, mu0Var, (byte) 4);
                this.q = (byte) 2;
                Object objD = br2.D(1500L, x55Var, this);
                px0 px0Var = px0.j;
                if (objD == px0Var) {
                    return px0Var;
                }
            } else {
                if (b != 1 && b != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
            }
            if (ub3Var2 != ub3Var) {
                ab5Var.dismiss();
            }
            return og5.g;
        } catch (Throwable th) {
            if (ub3Var2 != ub3Var) {
                ab5Var.dismiss();
            }
            throw th;
        }
    }
}
