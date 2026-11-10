package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n81 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q = 2;
    public Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n81(qg qgVar, boolean z, zu4 zu4Var, my1 my1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = qgVar;
        this.c = z;
        this.b = zu4Var;
        this.s = my1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                ob3 ob3Var = (ob3) this.s;
                return new n81(this.c, (q81) obj3, (v71) obj2, ob3Var, mu0Var);
            case 1:
                my1 my1Var = (my1) this.s;
                return new n81((qg) obj3, this.c, (zu4) obj2, my1Var, mu0Var);
            default:
                return new n81((ob3) obj3, this.c, (ja3) obj2, mu0Var);
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
        return ((n81) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        boolean z = this.c;
        px0 px0Var = px0.j;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    if (z) {
                        ((my1) ((ob3) this.s).getValue()).g();
                        return og5Var;
                    }
                    this.w = true;
                    if (yf2.e(10000L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                q81 q81Var = (q81) obj3;
                g61 g61Var = ((q71) ((v71) obj2)).g;
                q81Var.getClass();
                q81Var.x(new p81(new t71(g61Var, cq0.j)));
                return og5Var;
            case 1:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    qg qgVar = (qg) obj3;
                    float f = z ? 1.0f : 0.0f;
                    this.w = true;
                    if (qg.g(qgVar, new Float(f), (zu4) obj2, null, this, 12) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ((my1) this.s).g();
                return og5Var;
            default:
                ob3 ob3Var = (ob3) obj3;
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    mx3 mx3Var = (mx3) ob3Var.getValue();
                    if (mx3Var == null) {
                        return og5Var;
                    }
                    ja3 ja3Var = (ja3) obj2;
                    ue2 nx3Var = z ? new nx3(mx3Var) : new lx3(mx3Var);
                    if (ja3Var != null) {
                        this.s = ob3Var;
                        this.w = true;
                        if (ja3Var.y(nx3Var, this) == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ob3Var = (ob3) this.s;
                    js2.o(obj);
                }
                ob3Var.setValue(null);
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n81(ob3 ob3Var, boolean z, ja3 ja3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = ob3Var;
        this.c = z;
        this.b = ja3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n81(boolean z, q81 q81Var, v71 v71Var, ob3 ob3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = z;
        this.i = q81Var;
        this.b = v71Var;
        this.s = ob3Var;
    }
}
