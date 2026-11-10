package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends zz4 implements bz1 {
    public final /* synthetic */ ja3 c;
    public final /* synthetic */ mx3 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mx3 mx3Var, ja3 ja3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 0;
        this.i = mx3Var;
        this.c = ja3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        mx3 mx3Var = this.i;
        ja3 ja3Var = this.c;
        switch (b) {
            case 0:
                return new b(mx3Var, ja3Var, mu0Var);
            case 1:
                return new b(ja3Var, mx3Var, mu0Var, (byte) 1);
            default:
                return new b(ja3Var, mx3Var, mu0Var, (byte) 2);
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
        return ((b) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        mx3 mx3Var = this.i;
        ja3 ja3Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    nx3 nx3Var = new nx3(mx3Var);
                    this.w = true;
                    return ja3Var.y(nx3Var, this) == px0Var ? px0Var : og5Var;
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
                    return ja3Var.y(mx3Var, this) == px0Var ? px0Var : og5Var;
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
                    this.w = true;
                    return ja3Var.y(mx3Var, this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ja3 ja3Var, mx3 mx3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ja3Var;
        this.i = mx3Var;
    }
}
