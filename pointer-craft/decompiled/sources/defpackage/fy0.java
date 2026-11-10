package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy0 extends kk2 implements bz1 {
    public final /* synthetic */ no1 a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ nm0 q;
    public final /* synthetic */ nc5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy0(nc5 nc5Var, no1 no1Var, Object obj, nm0 nm0Var) {
        super(2);
        this.t = nc5Var;
        this.a = no1Var;
        this.m = obj;
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
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Object objN;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            te5 te5Var = m50.w;
            nc5 nc5Var = this.t;
            boolean zL = nc5Var.l();
            g90 g90Var = nc5Var.g;
            l76 l76Var = oo0.g;
            if (zL) {
                h02Var.X(1666827533);
                h02Var.b(false);
                objN = g90Var.n();
            } else {
                h02Var.X(1666573488);
                boolean zX = h02Var.x(nc5Var);
                objN = h02Var.K();
                if (zX || objN == l76Var) {
                    at4 at4VarM = js2.m();
                    xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
                    at4 at4VarB = js2.b(at4VarM);
                    try {
                        Object objN2 = g90Var.n();
                        js2.z(at4VarM, at4VarB, xy1VarV);
                        h02Var.i0(objN2);
                        objN = objN2;
                    } catch (Throwable th) {
                        js2.z(at4VarM, at4VarB, xy1VarV);
                        throw th;
                    }
                }
                h02Var.b(false);
            }
            h02Var.X(1378811975);
            Object obj3 = this.m;
            float f = yf2.p(objN, obj3) ? 1.0f : 0.0f;
            h02Var.b(false);
            Float fValueOf = Float.valueOf(f);
            boolean zX2 = h02Var.x(nc5Var);
            Object objK = h02Var.K();
            if (zX2 || objK == l76Var) {
                objK = pt4.y(new ey0(nc5Var, (byte) 0));
                h02Var.i0(objK);
            }
            Object value = ((bw4) objK).getValue();
            h02Var.X(1378811975);
            float f2 = yf2.p(value, obj3) ? 1.0f : 0.0f;
            h02Var.b(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zX3 = h02Var.x(nc5Var);
            Object objK2 = h02Var.K();
            if (zX3 || objK2 == l76Var) {
                objK2 = pt4.y(new ey0(nc5Var, (byte) 1));
                h02Var.i0(objK2);
            }
            h02Var.X(955869654);
            h02Var.b(false);
            hc5 hc5VarP = ra.p(nc5Var, fValueOf, fValueOf2, this.a, te5Var, h02Var, 0);
            boolean zX4 = h02Var.x(hc5VarP);
            Object objK3 = h02Var.K();
            if (zX4 || objK3 == l76Var) {
                objK3 = new zg(hc5VarP, (byte) 5);
                h02Var.i0(objK3);
            }
            j73 j73VarL = yf2.L(g73.g, (xy1) objK3);
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarL);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.A(h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            this.q.x(obj3, h02Var, 0);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
