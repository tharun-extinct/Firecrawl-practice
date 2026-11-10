package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eg4 extends zz4 implements bz1 {
    public final /* synthetic */ fg4 c;
    public final /* synthetic */ long i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg4(fg4 fg4Var, long j, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = fg4Var;
        this.i = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new eg4(this.c, this.i, mu0Var, (byte) 0);
            case 1:
                return new eg4(this.c, this.i, mu0Var, (byte) 1);
            default:
                return new eg4(this.c, this.i, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((eg4) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        long j = this.i;
        fg4 fg4Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ng4 ng4Var = fg4Var.Y;
                dg4 dg4Var = new dg4(j, null);
                this.w = true;
                return ng4Var.l(ub3.t, dg4Var, this) == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    ng4 ng4Var2 = fg4Var.Y;
                    this.w = true;
                    return ng4Var2.r(j, true, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    ng4 ng4Var3 = fg4Var.Y;
                    this.w = true;
                    return ng4Var3.r(j, false, this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
