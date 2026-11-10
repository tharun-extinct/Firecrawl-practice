package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es1 extends zz4 implements cz1 {
    public /* synthetic */ Object b;
    public byte c;
    public /* synthetic */ gr1 i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ jz1 s;
    public gr1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es1(mu0 mu0Var, gr0 gr0Var) {
        super(3, mu0Var);
        this.q = (byte) 1;
        this.s = gr0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        jz1 jz1Var = this.s;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                gr1 gr1Var = this.i;
                Object obj2 = this.b;
                byte b2 = this.c;
                if (b2 == 0) {
                    js2.o(obj);
                    this.i = null;
                    this.b = null;
                    this.w = gr1Var;
                    this.c = (byte) 1;
                    obj = ((bz1) jz1Var).l(obj2, this);
                    if (obj != px0Var) {
                    }
                    return px0Var;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gr1Var = this.w;
                js2.o(obj);
                this.i = null;
                this.b = null;
                this.w = null;
                this.c = (byte) 2;
                if (gr1Var.c(obj, this) != px0Var) {
                    return og5Var;
                }
                return px0Var;
            case 1:
                gr1 gr1Var2 = this.i;
                Object[] objArr = (Object[]) this.b;
                byte b3 = this.c;
                if (b3 == 0) {
                    js2.o(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.i = null;
                    this.b = null;
                    this.w = gr1Var2;
                    this.c = (byte) 1;
                    obj = ((gr0) jz1Var).i(obj3, obj4, obj5, this);
                    if (obj != px0Var) {
                    }
                    return px0Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gr1Var2 = this.w;
                js2.o(obj);
                this.i = null;
                this.b = null;
                this.w = null;
                this.c = (byte) 2;
                if (gr1Var2.c(obj, this) != px0Var) {
                    return og5Var;
                }
                return px0Var;
            default:
                gr1 gr1Var3 = this.i;
                Object[] objArr2 = (Object[]) this.b;
                byte b4 = this.c;
                if (b4 == 0) {
                    js2.o(obj);
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    this.i = null;
                    this.b = null;
                    this.w = gr1Var3;
                    this.c = (byte) 1;
                    obj = ((cz1) jz1Var).x(obj6, obj7, this);
                    if (obj != px0Var) {
                    }
                    return px0Var;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gr1Var3 = this.w;
                js2.o(obj);
                this.i = null;
                this.b = null;
                this.w = null;
                this.c = (byte) 2;
                if (gr1Var3.c(obj, this) != px0Var) {
                    return og5Var;
                }
                return px0Var;
        }
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.q;
        og5 og5Var = og5.g;
        jz1 jz1Var = this.s;
        gr1 gr1Var = (gr1) obj;
        switch (b) {
            case 0:
                es1 es1Var = new es1((bz1) jz1Var, (mu0) obj3, (byte) 0);
                es1Var.i = gr1Var;
                es1Var.b = obj2;
                return es1Var.u(og5Var);
            case 1:
                es1 es1Var2 = new es1((mu0) obj3, (gr0) jz1Var);
                es1Var2.i = gr1Var;
                es1Var2.b = (Object[]) obj2;
                return es1Var2.u(og5Var);
            default:
                es1 es1Var3 = new es1((cz1) jz1Var, (mu0) obj3, (byte) 2);
                es1Var3.i = gr1Var;
                es1Var3.b = (Object[]) obj2;
                return es1Var3.u(og5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es1(jz1 jz1Var, mu0 mu0Var, byte b) {
        super(3, mu0Var);
        this.q = b;
        this.s = jz1Var;
    }
}
