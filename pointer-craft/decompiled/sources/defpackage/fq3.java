package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fq3 extends zz4 implements xy1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq3(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new fq3((gq3) obj3, (sb5) this.i, (bz1) obj2, (mu0) obj, (byte) 0).u(og5Var);
            default:
                nc5 nc5Var = (nc5) obj2;
                return new fq3((lh4) obj3, this.i, nc5Var, (mu0) obj, (byte) 1).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        Object obj4 = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    Object objV = ((gq3) obj4).v((sb5) obj3, (bz1) obj2, this);
                    return objV == px0Var ? px0Var : objV;
                }
                if (z) {
                    js2.o(obj);
                    return obj;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    fh4 fh4Var = new fh4((lh4) obj4, obj3, (nc5) obj2, null);
                    this.w = true;
                    if (k33.B(fh4Var, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
        }
    }
}
