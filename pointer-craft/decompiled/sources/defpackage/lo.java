package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lo extends zz4 implements bz1 {
    public final /* synthetic */ we1 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo(we1 we1Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = we1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        we1 we1Var = this.c;
        switch (b) {
            case 0:
                return new lo(we1Var, mu0Var, (byte) 0);
            case 1:
                return new lo(we1Var, mu0Var, (byte) 1);
            case 2:
                return new lo(we1Var, mu0Var, (byte) 2);
            default:
                return new lo(we1Var, mu0Var, (byte) 3);
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
            case 2:
                break;
        }
        return ((lo) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        we1 we1Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    return we1Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return we1Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    return we1Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    this.w = true;
                    return we1Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z4) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
