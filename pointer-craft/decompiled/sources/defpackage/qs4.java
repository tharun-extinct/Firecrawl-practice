package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qs4 extends zz4 implements bz1 {
    public final /* synthetic */ xy1 b;
    public final /* synthetic */ ts4 c;
    public final /* synthetic */ float i;
    public r54 q;
    public final /* synthetic */ pf4 s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs4(ts4 ts4Var, float f, xy1 xy1Var, pf4 pf4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = ts4Var;
        this.i = f;
        this.b = xy1Var;
        this.s = pf4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new qs4(this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((qs4) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ps4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        final r54 r54Var;
        Object objN;
        ts4 ts4Var = this.c;
        ys4 ys4Var = ts4Var.g;
        byte b = this.w;
        final byte b2 = 1;
        final xy1 xy1Var = this.b;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            c11 c11Var = ts4Var.y;
            float f = this.i;
            float fN = ys4Var.n(f, og0.w(c11Var, 0.0f, f));
            if (Float.isNaN(fN)) {
                pc2.r("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            r54Var = new r54();
            float fSignum = Math.signum(f) * Math.abs(fN);
            r54Var.j = fSignum;
            xy1Var.a(new Float(fSignum));
            float f2 = r54Var.j;
            final byte b3 = 0;
            ?? r4 = new xy1() { // from class: ps4
                @Override // defpackage.xy1
                public final Object a(Object obj2) {
                    byte b4 = b3;
                    og5 og5Var = og5.g;
                    xy1 xy1Var2 = xy1Var;
                    r54 r54Var2 = r54Var;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (b4) {
                        case 0:
                            float f3 = r54Var2.j - fFloatValue;
                            r54Var2.j = f3;
                            xy1Var2.a(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = r54Var2.j - fFloatValue;
                            r54Var2.j = f4;
                            xy1Var2.a(Float.valueOf(f4));
                            break;
                    }
                    return og5Var;
                }
            };
            this.q = r54Var;
            this.w = (byte) 1;
            objN = ts4Var.n(this.s, f2, this.i, r4, this);
            if (objN != px0Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                js2.o(obj);
                return obj;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r54 r54Var2 = this.q;
        js2.o(obj);
        r54Var = r54Var2;
        objN = obj;
        pi piVar = (pi) objN;
        float fL = ys4Var.l(((Number) piVar.g()).floatValue());
        if (Float.isNaN(fL)) {
            pc2.r("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        r54Var.j = fL;
        pi piVarC = v70.c(piVar, 0.0f, 0.0f, 30);
        oi oiVar = ts4Var.r;
        xy1 xy1Var2 = new xy1() { // from class: ps4
            @Override // defpackage.xy1
            public final Object a(Object obj2) {
                byte b4 = b2;
                og5 og5Var = og5.g;
                xy1 xy1Var3 = xy1Var;
                r54 r54Var3 = r54Var;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b4) {
                    case 0:
                        float f3 = r54Var3.j - fFloatValue;
                        r54Var3.j = f3;
                        xy1Var3.a(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = r54Var3.j - fFloatValue;
                        r54Var3.j = f4;
                        xy1Var3.a(Float.valueOf(f4));
                        break;
                }
                return og5Var;
            }
        };
        this.q = null;
        this.w = (byte) 2;
        Object objQ = lr2.q(this.s, fL, fL, piVarC, oiVar, xy1Var2, this);
        return objQ == px0Var ? px0Var : objQ;
    }
}
