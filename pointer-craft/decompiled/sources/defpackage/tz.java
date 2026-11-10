package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tz extends zz4 implements bz1 {
    public final /* synthetic */ ya5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vu3 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz(vu3 vu3Var, ya5 ya5Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = vu3Var;
        this.b = ya5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                tz tzVar = new tz(this.i, this.b, mu0Var, (byte) 0);
                tzVar.c = obj;
                return tzVar;
            default:
                tz tzVar2 = new tz(this.i, this.b, mu0Var, (byte) 1);
                tzVar2.c = obj;
                return tzVar2;
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
        }
        return ((tz) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ya5 ya5Var = this.b;
        vu3 vu3Var = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    sz szVar = new sz((ox0) this.c, ya5Var, null);
                    this.w = true;
                    return bg6.r(vu3Var, szVar, this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    vz vzVar = new vz((ox0) this.c, ya5Var, null);
                    this.w = true;
                    return ((g05) vu3Var).Q0(vzVar, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
