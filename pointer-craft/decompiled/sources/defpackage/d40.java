package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d40 extends zz4 implements bz1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(vi2 vi2Var, int i, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 3;
        this.i = vi2Var;
        this.c = i;
        this.w = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        int i = this.c;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new d40(this.w, (e40) obj2, i, mu0Var);
            case 1:
                return new d40(obj2, i, mu0Var, (byte) 1);
            case 2:
                return new d40(obj2, i, mu0Var, (byte) 2);
            case 3:
                return new d40((vi2) obj2, i, this.w, mu0Var);
            case 4:
                return new d40(obj2, i, mu0Var, (byte) 4);
            case 5:
                return new d40(obj2, i, mu0Var, (byte) 5);
            default:
                return new d40(obj2, i, mu0Var, (byte) 6);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                return ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 4:
                return ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((d40) b((mu0) obj2, (pf4) obj)).u(og5Var);
            default:
                return ((d40) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        int i = this.c;
        Object obj2 = this.i;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                js2.o(obj);
                boolean z = this.w;
                v30 v30Var = ((e40) obj2).y;
                if (z) {
                    v30Var.l((byte) 3, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)});
                } else {
                    v30Var.l((byte) 3, new byte[]{0, 0});
                }
                return og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    e40 e40VarJ = ((qr0) obj2).j();
                    if (e40VarJ != null) {
                        this.w = true;
                        Object objF0 = m50.f0(e40VarJ.g, new a40(i, e40VarJ, null), this);
                        if (objF0 != px0Var) {
                            objF0 = og5Var;
                        }
                        if (objF0 == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    if (zb6.x((ss2) obj2, i, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 3:
                js2.o(obj);
                ((vi2) obj2).T().q(0, i, this.w);
                return og5Var;
            case 4:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    tr2 tr2Var = ((as2) obj2).f;
                    this.w = true;
                    if (tr2Var.x(i, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 5:
                u21 u21Var = (u21) obj2;
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    this.w = true;
                    if (u21Var.t(this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                u21Var.u(u21Var.a(i), 0.0f, true);
                return og5Var;
            default:
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    hg4 hg4Var = (hg4) obj2;
                    rf4 rf4Var = hg4Var.g;
                    zu4 zu4Var = hg4Var.r;
                    this.w = true;
                    Object objG = jf6.g(rf4Var, i - rf4Var.g.d(), zu4Var, this);
                    if (objG != px0Var) {
                        objG = og5Var;
                    }
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z6) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d40(Object obj, int i, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(boolean z, e40 e40Var, int i, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 0;
        this.w = z;
        this.i = e40Var;
        this.c = i;
    }
}
