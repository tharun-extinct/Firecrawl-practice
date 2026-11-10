package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends kk2 implements cz1 {
    public final /* synthetic */ st4 a;
    public final /* synthetic */ oh m;
    public final /* synthetic */ nm0 q;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(Object obj, st4 st4Var, oh ohVar, nm0 nm0Var) {
        super(3);
        this.t = obj;
        this.a = st4Var;
        this.m = ohVar;
        this.q = nm0Var;
    }

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
    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        di diVar = (di) obj;
        h02 h02Var = (h02) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? h02Var.x(diVar) : h02Var.j(diVar) ? 4 : 2;
        }
        if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            st4 st4Var = this.a;
            boolean zX = h02Var.x(st4Var);
            Object obj4 = this.t;
            boolean zJ = zX | h02Var.j(obj4);
            oh ohVar = this.m;
            boolean zJ2 = zJ | h02Var.j(ohVar);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zJ2 || objK == l76Var) {
                objK = new rj1(st4Var, obj4, ohVar, (byte) 2);
                h02Var.i0(objK);
            }
            k33.t(diVar, obj4, (xy1) objK, h02Var);
            hb3 hb3Var = ohVar.n;
            diVar.getClass();
            hb3Var.c(obj4, ((ei) diVar).g);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new hh();
                h02Var.i0(objK2);
            }
            this.q.i((hh) objK2, obj4, h02Var, 0);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
