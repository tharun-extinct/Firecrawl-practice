package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt4 extends zz4 implements bz1 {
    public final /* synthetic */ ob3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bz1 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt4(bz1 bz1Var, ob3 ob3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = bz1Var;
        this.b = ob3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                qt4 qt4Var = new qt4(this.i, this.b, mu0Var, (byte) 0);
                qt4Var.c = obj;
                return qt4Var;
            case 1:
                qt4 qt4Var2 = new qt4(this.i, this.b, mu0Var, (byte) 1);
                qt4Var2.c = obj;
                return qt4Var2;
            default:
                qt4 qt4Var3 = new qt4(this.i, this.b, mu0Var, (byte) 2);
                qt4Var3.c = obj;
                return qt4Var3;
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
        return ((qt4) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.b;
        bz1 bz1Var = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    dz3 dz3Var = new dz3(ob3Var, ((ox0) this.c).w());
                    this.w = true;
                    return bz1Var.l(dz3Var, this) == px0Var ? px0Var : og5Var;
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
                    dz3 dz3Var2 = new dz3(ob3Var, ((ox0) this.c).w());
                    this.w = true;
                    return bz1Var.l(dz3Var2, this) == px0Var ? px0Var : og5Var;
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
                    dz3 dz3Var3 = new dz3(ob3Var, ((ox0) this.c).w());
                    this.w = true;
                    return bz1Var.l(dz3Var3, this) == px0Var ? px0Var : og5Var;
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
