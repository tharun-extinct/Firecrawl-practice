package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public Object i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg(Object obj, Object obj2, Object obj3, Object obj4, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
        this.s = obj4;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new sg(this.c, (qg) this.i, (ob3) obj3, (ob3) obj2, mu0Var, (byte) 0);
            case 1:
                sg sgVar = new sg((ng0) this.i, (el0) obj3, (m70) obj2, mu0Var, (byte) 1);
                sgVar.c = obj;
                return sgVar;
            case 2:
                sg sgVar2 = new sg((ox0) this.i, (ob3) obj3, (we1) obj2, mu0Var, (byte) 2);
                sgVar2.c = obj;
                return sgVar2;
            case 3:
                sg sgVar3 = new sg(mu0Var, (gr1) obj2, (u54) obj3);
                sgVar3.c = ((ld0) obj).g;
                return sgVar3;
            case 4:
                sg sgVar4 = new sg((er1) this.i, (ew4) obj3, this.s, mu0Var, (byte) 4);
                sgVar4.c = obj;
                return sgVar4;
            case 5:
                sg sgVar5 = new sg((ju2) this.i, (wt2) obj3, (bz1) obj2, mu0Var, (byte) 5);
                sgVar5.c = obj;
                return sgVar5;
            default:
                return new sg((u54) this.c, (a44) this.i, (gu2) obj3, (mq5) obj2, mu0Var, (byte) 6);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((sg) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((sg) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((sg) b((mu0) obj2, (er1) obj)).u(og5Var);
            case 3:
                Object obj3 = ((ld0) obj).g;
                sg sgVar = new sg((mu0) obj2, (gr1) this.s, (u54) this.b);
                sgVar.c = obj3;
                return sgVar.u(og5Var);
            case 4:
                return ((sg) b((mu0) obj2, (qo4) obj)).u(og5Var);
            case 5:
                return ((sg) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((sg) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        u54 u54Var;
        u54 u54Var2;
        byte b = this.q;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        Object obj2 = this.b;
        Object obj3 = this.s;
        byte b2 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                qg qgVar = (qg) this.i;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    if (yf2.p(this.c, qgVar.v.getValue())) {
                        return og5Var;
                    }
                    qg qgVar2 = (qg) this.i;
                    Object obj4 = this.c;
                    zu4 zu4Var = ug.g;
                    oi oiVar = (oi) ((ob3) obj2).getValue();
                    this.w = true;
                    if (qg.g(qgVar2, obj4, oiVar, null, this, 12) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                zu4 zu4Var2 = ug.g;
                xy1 xy1Var = (xy1) ((ob3) obj3).getValue();
                if (xy1Var == null) {
                    return og5Var;
                }
                xy1Var.a(qgVar.n());
                return og5Var;
            case 1:
                ng0 ng0Var = (ng0) this.i;
                ox0 ox0Var = (ox0) this.c;
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                u54 u54Var3 = new u54();
                s54 s54Var = new s54();
                er1 er1Var = (er1) ng0Var.c.l(ng0Var.g, ng0Var.y);
                jg0 jg0Var = new jg0(s54Var, ng0Var, u54Var3, (el0) obj2, ox0Var, (m70) obj3);
                this.c = null;
                this.w = true;
                return er1Var.r(jg0Var, this) == px0Var ? px0Var : og5Var;
            case 2:
                ob3 ob3Var = (ob3) obj2;
                er1 er1Var2 = (er1) this.c;
                boolean z3 = this.w;
                try {
                    if (!z3) {
                        js2.o(obj);
                        ob3Var.setValue(Boolean.TRUE);
                        je1 je1Var = je1.j;
                        this.c = null;
                        this.w = true;
                        if (er1Var2.r(je1Var, this) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z3) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    m50.T((ox0) this.i, null, new lo((we1) obj3, mu0Var, b2), 3);
                    ob3Var.setValue(Boolean.FALSE);
                    return og5Var;
                } catch (Throwable th) {
                    ob3Var.setValue(Boolean.FALSE);
                    throw th;
                }
            case 3:
                Object obj5 = this.c;
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    u54Var = (u54) obj2;
                    boolean z5 = obj5 instanceof kd0;
                    if (!z5) {
                        u54Var.j = obj5;
                    }
                    gr1 gr1Var = (gr1) obj3;
                    if (!z5) {
                        return og5Var;
                    }
                    jd0 jd0Var = obj5 instanceof jd0 ? (jd0) obj5 : null;
                    Throwable th2 = jd0Var != null ? jd0Var.g : null;
                    if (th2 != null) {
                        throw th2;
                    }
                    Object obj6 = u54Var.j;
                    if (obj6 != null) {
                        if (obj6 == a11.o) {
                            obj6 = null;
                        }
                        this.c = null;
                        this.i = u54Var;
                        this.w = true;
                        if (gr1Var.c(obj6, this) == px0Var) {
                            return px0Var;
                        }
                        u54Var2 = u54Var;
                    }
                    u54Var.j = a11.k;
                    return og5Var;
                }
                if (!z4) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u54Var2 = (u54) this.i;
                js2.o(obj);
                u54Var = u54Var2;
                u54Var.j = a11.k;
                return og5Var;
            case 4:
                ew4 ew4Var = (ew4) obj2;
                qo4 qo4Var = (qo4) this.c;
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    int iOrdinal = qo4Var.ordinal();
                    if (iOrdinal == 0) {
                        er1 er1Var3 = (er1) this.i;
                        this.c = null;
                        this.w = true;
                        return er1Var3.r(ew4Var, this) == px0Var ? px0Var : og5Var;
                    }
                    if (iOrdinal == 1) {
                        return og5Var;
                    }
                    if (iOrdinal == 2) {
                        if (obj3 == v70.f) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        ew4Var.a(obj3);
                        return og5Var;
                    }
                    uo1.g();
                } else {
                    if (z6) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                boolean z7 = this.w;
                if (z7) {
                    if (z7) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ox0 ox0Var2 = (ox0) this.c;
                x21 x21Var = na1.g;
                t42 t42Var = p03.g.w;
                tg tgVar = new tg((ju2) this.i, (wt2) obj2, ox0Var2, (bz1) obj3, null, (byte) 1);
                this.w = true;
                return m50.f0(t42Var, tgVar, this) == px0Var ? px0Var : og5Var;
            default:
                mq5 mq5Var = (mq5) obj3;
                gu2 gu2Var = (gu2) obj2;
                a44 a44Var = (a44) this.i;
                boolean z8 = this.w;
                try {
                    if (!z8) {
                        js2.o(obj);
                        x73 x73Var = (x73) ((u54) this.c).j;
                        if (x73Var != null) {
                            x73Var.t = k33.x(a44Var.e);
                        }
                        this.w = true;
                        if (a44Var.M(this) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z8) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    gu2Var.a().x(mq5Var);
                    return og5Var;
                } catch (Throwable th3) {
                    gu2Var.a().x(mq5Var);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(mu0 mu0Var, gr1 gr1Var, u54 u54Var) {
        super(2, mu0Var);
        this.q = (byte) 3;
        this.b = u54Var;
        this.s = gr1Var;
    }
}
