package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ xy1 p;
    public sb5 q;
    public final /* synthetic */ x94 s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(mu0 mu0Var, xy1 xy1Var, x94 x94Var, boolean z, boolean z2) {
        super(2, mu0Var);
        this.i = z;
        this.b = z2;
        this.s = x94Var;
        this.p = xy1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        iz0 iz0Var = new iz0(mu0Var, this.p, this.s, this.i, this.b);
        iz0Var.c = obj;
        return iz0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((iz0) b((mu0) obj2, (tb5) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[DONT_INVERT, PHI: r0 r12
  0x00a8: PHI (r0v11 tb5) = (r0v8 tb5), (r0v21 tb5) binds: [B:37:0x00a5, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r12v18 java.lang.Object) = (r12v16 java.lang.Object), (r12v0 java.lang.Object) binds: [B:37:0x00a5, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[RETURN] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        sb5 sb5Var;
        tb5 tb5Var;
        sb5 sb5Var2;
        tb5 tb5Var2;
        tb5 tb5Var3;
        Boolean boolY;
        Object obj2;
        og2 og2VarJ;
        byte b = this.w;
        xy1 xy1Var = this.p;
        x94 x94Var = this.s;
        boolean z = this.b;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            tb5 tb5Var4 = (tb5) this.c;
            if (!this.i) {
                tb5Var4.getClass();
                return xy1Var.a(((y24) tb5Var4).r());
            }
            sb5Var = z ? sb5.j : sb5.t;
            if (z) {
                sb5 sb5Var3 = sb5Var;
                tb5Var = tb5Var4;
                sb5Var2 = sb5Var3;
                hz0 hz0Var = new hz0((mu0) null, xy1Var);
                this.c = tb5Var;
                this.q = null;
                this.w = (byte) 3;
                obj = tb5Var.g(sb5Var2, hz0Var, this);
                if (obj != px0Var) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.w = (byte) 4;
                    boolY = tb5Var.y(this);
                    if (boolY != px0Var) {
                        Object obj3 = obj;
                        obj = boolY;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            og2VarJ = x94Var.j();
                            if (!((AtomicBoolean) og2VarJ.g.l.m).get()) {
                                og2VarJ.y.r(og2VarJ.x, og2VarJ.l);
                            }
                        }
                        return obj2;
                    }
                }
            } else {
                this.c = tb5Var4;
                this.q = sb5Var;
                this.w = (byte) 1;
                Boolean boolY2 = tb5Var4.y(this);
                if (boolY2 != px0Var) {
                    tb5Var2 = tb5Var4;
                    obj = boolY2;
                }
            }
            return px0Var;
        }
        if (b == 1) {
            sb5Var = this.q;
            tb5Var2 = (tb5) this.c;
            js2.o(obj);
        } else {
            if (b == 2) {
                sb5Var = this.q;
                tb5Var3 = (tb5) this.c;
                js2.o(obj);
                sb5Var2 = sb5Var;
                tb5Var = tb5Var3;
                hz0 hz0Var2 = new hz0((mu0) null, xy1Var);
                this.c = tb5Var;
                this.q = null;
                this.w = (byte) 3;
                obj = tb5Var.g(sb5Var2, hz0Var2, this);
                if (obj != px0Var) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.w = (byte) 4;
                    boolY = tb5Var.y(this);
                    if (boolY != px0Var) {
                        Object obj4 = obj;
                        obj = boolY;
                        obj2 = obj4;
                    }
                }
                return px0Var;
            }
            if (b == 3) {
                tb5Var = (tb5) this.c;
                js2.o(obj);
                if (z) {
                    return obj;
                }
                this.c = obj;
                this.w = (byte) 4;
                boolY = tb5Var.y(this);
                if (boolY != px0Var) {
                    Object obj5 = obj;
                    obj = boolY;
                    obj2 = obj5;
                }
                return px0Var;
            }
            if (b != 4) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.c;
            js2.o(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            og2VarJ = x94Var.j();
            if (!((AtomicBoolean) og2VarJ.g.l.m).get()) {
                og2VarJ.y.r(og2VarJ.x, og2VarJ.l);
            }
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            sb5Var2 = sb5Var;
            tb5Var = tb5Var2;
            hz0 hz0Var3 = new hz0((mu0) null, xy1Var);
            this.c = tb5Var;
            this.q = null;
            this.w = (byte) 3;
            obj = tb5Var.g(sb5Var2, hz0Var3, this);
            if (obj != px0Var) {
                if (z) {
                    return obj;
                }
                this.c = obj;
                this.w = (byte) 4;
                boolY = tb5Var.y(this);
                if (boolY != px0Var) {
                    Object obj6 = obj;
                    obj = boolY;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        og2VarJ = x94Var.j();
                        if (!((AtomicBoolean) og2VarJ.g.l.m).get()) {
                            og2VarJ.y.r(og2VarJ.x, og2VarJ.l);
                        }
                    }
                    return obj2;
                }
            }
        } else {
            og2 og2VarJ2 = x94Var.j();
            this.c = tb5Var2;
            this.q = sb5Var;
            this.w = (byte) 2;
            aq2.I(og2VarJ2.g);
            Object objX = og2VarJ2.y.x(this);
            if (objX != px0Var) {
                objX = og5.g;
            }
            if (objX != px0Var) {
                tb5Var3 = tb5Var2;
                sb5Var2 = sb5Var;
                tb5Var = tb5Var3;
                hz0 hz0Var4 = new hz0((mu0) null, xy1Var);
                this.c = tb5Var;
                this.q = null;
                this.w = (byte) 3;
                obj = tb5Var.g(sb5Var2, hz0Var4, this);
                if (obj != px0Var) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.w = (byte) 4;
                    boolY = tb5Var.y(this);
                    if (boolY != px0Var) {
                        Object obj7 = obj;
                        obj = boolY;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            og2VarJ = x94Var.j();
                            if (!((AtomicBoolean) og2VarJ.g.l.m).get()) {
                                og2VarJ.y.r(og2VarJ.x, og2VarJ.l);
                            }
                        }
                        return obj2;
                    }
                }
            }
        }
        return px0Var;
    }
}
