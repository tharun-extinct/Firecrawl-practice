package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y15 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ cz1 c;
    public final /* synthetic */ rf4 j;
    public final /* synthetic */ float m;
    public final /* synthetic */ float q;
    public final /* synthetic */ nm0 t;
    public final /* synthetic */ int w;

    public y15(rf4 rf4Var, nm0 nm0Var, nm0 nm0Var2, float f, float f2, int i, cz1 cz1Var) {
        this.j = rf4Var;
        this.t = nm0Var;
        this.a = nm0Var2;
        this.m = f;
        this.q = f2;
        this.w = i;
        this.c = cz1Var;
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
        on0 on0Var;
        Object w15Var;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = k33.E(h02Var);
                h02Var.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            f83 f83Var = f83.j;
            zu4 zu4VarF = jr2.F(f83Var, h02Var);
            zu4 zu4VarF2 = jr2.F(f83Var, h02Var);
            rf4 rf4Var = this.j;
            boolean zX = h02Var.x(rf4Var) | h02Var.x(ox0Var);
            Object objK2 = h02Var.K();
            if (zX || objK2 == l76Var) {
                objK2 = new hg4(rf4Var, ox0Var, zu4VarF);
                h02Var.i0(objK2);
            }
            hg4 hg4Var = (hg4) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new x15(zu4VarF2);
                h02Var.i0(objK3);
            }
            x15 x15Var = (x15) objK3;
            t33 t33VarR = z50.r(hi0.i, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            g73 g73Var = g73.g;
            j73 j73VarW = m50.W(h02Var, g73Var);
            jo0.n.getClass();
            h02Var.b0();
            boolean z = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var2 = tg1.w;
            xs2.E(on0Var2, h02Var, t33VarR);
            on0 on0Var3 = tg1.q;
            xs2.E(on0Var3, h02Var, tr3VarQ);
            on0 on0Var4 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var4);
            }
            on0 on0Var5 = tg1.m;
            xs2.E(on0Var5, h02Var, j73VarW);
            this.t.l(h02Var, 0);
            List listD = pw5.d(this.a, ue5.m0(509386037, new k6(this.c, x15Var, (byte) 8), h02Var));
            j73 j73VarO = y94.o(dj4.g(gp4.P(mq4.i(mq4.r(g73Var, 1.0f), hi0.q, 2), rf4Var, false), false, new vy3((byte) 8)));
            float f = this.m;
            boolean zR = h02Var.r(f);
            float f2 = this.q;
            boolean zR2 = zR | h02Var.r(f2);
            int i = this.w;
            boolean zN = zR2 | h02Var.n(i) | h02Var.j(hg4Var);
            Object objK4 = h02Var.K();
            if (zN || objK4 == l76Var) {
                on0Var = on0Var2;
                w15Var = new w15(f, f2, x15Var, i, hg4Var);
                h02Var.i0(w15Var);
            } else {
                w15Var = objK4;
                on0Var = on0Var2;
            }
            a93 a93Var = (a93) w15Var;
            nm0 nm0VarO = yf2.o(listD);
            boolean zX2 = h02Var.x(a93Var);
            Object objK5 = h02Var.K();
            if (zX2 || objK5 == l76Var) {
                objK5 = new b93(a93Var);
                h02Var.i0(objK5);
            }
            t33 t33Var = (t33) objK5;
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarO);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33Var);
            xs2.E(on0Var3, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var4);
            }
            xs2.E(on0Var5, h02Var, j73VarW2);
            nm0VarO.l(h02Var, 0);
            h02Var.b(true);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
