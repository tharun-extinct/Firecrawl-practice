package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends zz4 implements cz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(p01 p01Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.q = (byte) 1;
        this.c = p01Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                ql4 ql4Var = (ql4) this.c;
                boolean z = this.w;
                js2.o(obj);
                return new fp3(ql4Var, Boolean.valueOf(z));
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    p01 p01Var = (p01) this.c;
                    this.w = true;
                    if (p01Var.r(this) == px0Var) {
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
            default:
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                zn1 zn1Var = (zn1) this.c;
                this.w = true;
                zn1Var.getClass();
                Object objG = zn1.g(zn1Var, this);
                return objG == px0Var ? px0Var : objG;
        }
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.q;
        int i = 3;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                tu0 tu0Var = new tu0(i, (mu0) obj3, (byte) 0);
                tu0Var.c = (ql4) obj;
                tu0Var.w = zBooleanValue;
                return tu0Var.u(og5Var);
            case 1:
                return new tu0((p01) this.c, (mu0) obj3).u(og5Var);
            default:
                ((Boolean) obj2).getClass();
                tu0 tu0Var2 = new tu0(i, (mu0) obj3, (byte) 2);
                tu0Var2.c = (zn1) obj;
                return tu0Var2.u(og5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu0(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }
}
