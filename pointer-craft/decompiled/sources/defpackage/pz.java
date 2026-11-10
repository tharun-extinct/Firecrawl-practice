package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pz extends zz4 implements bz1 {
    public final /* synthetic */ ya5 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz(ya5 ya5Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ya5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        ya5 ya5Var = this.c;
        switch (b) {
            case 0:
                return new pz(ya5Var, mu0Var, (byte) 0);
            case 1:
                pz pzVar = new pz(ya5Var, mu0Var, (byte) 1);
                pzVar.w = ((Boolean) obj).booleanValue();
                return pzVar;
            default:
                return new pz(ya5Var, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((pz) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((pz) b((mu0) obj2, bool)).u(og5Var);
                return og5Var;
            default:
                return ((pz) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ya5 ya5Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    if (ya5Var.y(ub3.j, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 1:
                js2.o(obj);
                if (!this.w) {
                    ya5Var.dismiss();
                }
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    if (ya5Var.y(ub3.t, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
