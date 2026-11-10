package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j01 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ p01 i;
    public final /* synthetic */ byte q;
    public Object s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j01(p01 p01Var, int i, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = p01Var;
        this.b = i;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        int i = this.b;
        p01 p01Var = this.i;
        switch (b) {
            case 0:
                j01 j01Var = new j01(p01Var, i, mu0Var, (byte) 0);
                j01Var.c = ((Boolean) obj).booleanValue();
                return j01Var;
            default:
                j01 j01Var2 = new j01(p01Var, i, mu0Var, (byte) 1);
                j01Var2.c = ((Boolean) obj).booleanValue();
                return j01Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((j01) b(mu0Var, bool)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        Throwable th;
        zv4 b34Var;
        boolean z;
        boolean z2;
        Object obj2;
        int iHashCode;
        byte b = this.q;
        int iIntValue = this.b;
        px0 px0Var = px0.j;
        p01 p01Var = this.i;
        switch (b) {
            case 0:
                boolean z3 = this.w;
                try {
                    if (z3 == 0) {
                        js2.o(obj);
                        boolean z4 = this.c;
                        this.c = z4;
                        this.w = (byte) 1;
                        obj = p01Var.t(z4, this);
                        z3 = z4;
                        if (obj == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                l0.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.c;
                            th = (Throwable) this.s;
                            js2.o(obj);
                            z3 = z5;
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            b34Var = new b34(iIntValue, th);
                            z = z3;
                            return new fp3(b34Var, Boolean.valueOf(z));
                        }
                        boolean z6 = this.c;
                        js2.o(obj);
                        z3 = z6;
                    }
                    b34Var = (zv4) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        xp4 xp4VarN = p01Var.n();
                        this.s = th;
                        this.c = z3;
                        this.w = (byte) 2;
                        Integer numG = xp4VarN.g();
                        if (numG == px0Var) {
                            return px0Var;
                        }
                        obj = numG;
                        th = th;
                        z3 = z3;
                    }
                    b34Var = new b34(iIntValue, th);
                    z = z3;
                    return new fp3(b34Var, Boolean.valueOf(z));
                }
                return new fp3(b34Var, Boolean.valueOf(z));
            default:
                byte b2 = this.w;
                if (b2 != 0) {
                    if (b2 == 1) {
                        z2 = this.c;
                        js2.o(obj);
                    } else {
                        if (b2 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.s;
                        js2.o(obj);
                    }
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    if (obj != null) {
                        iHashCode = obj.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new rz0(iHashCode, iIntValue, obj);
                }
                js2.o(obj);
                z2 = this.c;
                this.c = z2;
                this.w = (byte) 1;
                obj = ((do1) p01Var.a.getValue()).g(new tu0(3, null, (byte) 2), this);
                if (obj == px0Var) {
                    return px0Var;
                }
                if (z2) {
                    xp4 xp4VarN2 = p01Var.n();
                    this.s = obj;
                    this.w = (byte) 2;
                    Integer numG2 = xp4VarN2.g();
                    if (numG2 == px0Var) {
                        return px0Var;
                    }
                    Object obj3 = obj;
                    obj = numG2;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new rz0(iHashCode, iIntValue, obj);
        }
    }
}
