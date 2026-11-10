package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class il4 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il4(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        int i = 2;
        switch (this.q) {
            case 0:
                il4 il4Var = new il4(i, mu0Var, (byte) 0);
                il4Var.w = ((Boolean) obj).booleanValue();
                return il4Var;
            default:
                return new il4(i, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((il4) b((mu0) obj2, bool)).u(og5Var);
            default:
                return ((il4) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        switch (this.q) {
            case 0:
                js2.o(obj);
                return Boolean.valueOf(this.w);
            default:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    Object objG = gg6.g(this);
                    px0 px0Var = px0.j;
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
        }
    }
}
