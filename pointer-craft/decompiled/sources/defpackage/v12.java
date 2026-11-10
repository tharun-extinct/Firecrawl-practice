package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v12 extends zz4 implements dz1 {
    public /* synthetic */ eq c;
    public /* synthetic */ boolean i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v12() {
        super(4, null);
        this.q = (byte) 0;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.q;
        og5 og5Var = og5.g;
        int i = 4;
        eq eqVar = (eq) obj2;
        Boolean bool = (Boolean) obj3;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                v12 v12Var = new v12(i, (mu0) obj4, (byte) 0);
                v12Var.c = eqVar;
                v12Var.i = zBooleanValue;
                return v12Var.u(og5Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                v12 v12Var2 = new v12(i, (mu0) obj4, (byte) 1);
                v12Var2.c = eqVar;
                v12Var2.i = zBooleanValue2;
                return v12Var2.u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                og5 og5Var = og5.g;
                if (!z) {
                    js2.o(obj);
                    eq eqVar = this.c;
                    if (this.i) {
                        this.w = true;
                        Object objX = eqVar.x(yp.g, this);
                        if (objX != px0Var) {
                            objX = og5Var;
                        }
                        if (objX == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    eq eqVar2 = this.c;
                    if (!this.i) {
                        this.w = true;
                        Object objL = eqVar2.l(this);
                        return objL == px0Var ? px0Var : objL;
                    }
                } else {
                    if (z2) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v12(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }
}
