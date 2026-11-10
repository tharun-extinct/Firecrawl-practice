package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class lh4 extends g90 {
    public static final ri u = new ri(0.0f);
    public static final ri z = new ri(1.0f);
    public ib0 a;
    public final dh4 b;
    public final xa3 c;
    public eh4 i;
    public ut4 j;
    public final gd4 l;
    public final ec3 m;
    public Object n;
    public final dh4 p;
    public final bc3 q;
    public final tp3 r;
    public float s;
    public final pp3 t;
    public nc5 v;
    public long w;
    public long x;
    public final tp3 y;

    /* JADX WARN: Type inference failed for: r3v6, types: [dh4] */
    /* JADX WARN: Type inference failed for: r3v7, types: [dh4] */
    public lh4(mc3 mc3Var) {
        super((byte) 4);
        this.y = kq2.M(mc3Var);
        this.r = kq2.M(mc3Var);
        this.n = mc3Var;
        this.l = new gd4(this, (byte) 2);
        this.t = new pp3(0.0f);
        this.m = new ec3();
        this.q = new bc3();
        this.w = Long.MIN_VALUE;
        this.c = new xa3();
        final byte b = 0;
        this.b = new xy1(this) { // from class: dh4
            public final /* synthetic */ lh4 t;

            {
                this.t = this;
            }

            @Override // defpackage.xy1
            public final Object a(Object obj) {
                byte b2 = b;
                og5 og5Var = og5.g;
                lh4 lh4Var = this.t;
                long jLongValue = ((Long) obj).longValue();
                switch (b2) {
                    case 0:
                        lh4Var.w = jLongValue;
                        break;
                    default:
                        long j = jLongValue - lh4Var.w;
                        lh4Var.w = jLongValue;
                        long jA0 = k33.a0(j / ((double) lh4Var.s));
                        xa3 xa3Var = lh4Var.c;
                        if (xa3Var.a()) {
                            Object[] objArr = xa3Var.g;
                            int i = xa3Var.y;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                eh4 eh4Var = (eh4) objArr[i3];
                                lh4.o(eh4Var, jA0);
                                eh4Var.r = true;
                            }
                            nc5 nc5Var = lh4Var.v;
                            if (nc5Var != null) {
                                nc5Var.b();
                            }
                            int i4 = xa3Var.y;
                            Object[] objArr2 = xa3Var.g;
                            me2 me2VarK = xs2.K(0, i4);
                            int i5 = me2VarK.j;
                            int i6 = me2VarK.t;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((eh4) objArr2[i5]).r) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            pr.T(i4 - i2, i4, null, objArr2);
                            xa3Var.y -= i2;
                        }
                        eh4 eh4Var2 = lh4Var.i;
                        if (eh4Var2 != null) {
                            eh4Var2.l = lh4Var.x;
                            lh4.o(eh4Var2, jA0);
                            lh4Var.e(eh4Var2.n);
                            if (eh4Var2.n == 1.0f) {
                                lh4Var.i = null;
                            }
                            lh4Var.d();
                        }
                        break;
                }
                return og5Var;
            }
        };
        final byte b2 = 1;
        this.p = new xy1(this) { // from class: dh4
            public final /* synthetic */ lh4 t;

            {
                this.t = this;
            }

            @Override // defpackage.xy1
            public final Object a(Object obj) {
                byte b3 = b2;
                og5 og5Var = og5.g;
                lh4 lh4Var = this.t;
                long jLongValue = ((Long) obj).longValue();
                switch (b3) {
                    case 0:
                        lh4Var.w = jLongValue;
                        break;
                    default:
                        long j = jLongValue - lh4Var.w;
                        lh4Var.w = jLongValue;
                        long jA0 = k33.a0(j / ((double) lh4Var.s));
                        xa3 xa3Var = lh4Var.c;
                        if (xa3Var.a()) {
                            Object[] objArr = xa3Var.g;
                            int i = xa3Var.y;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                eh4 eh4Var = (eh4) objArr[i3];
                                lh4.o(eh4Var, jA0);
                                eh4Var.r = true;
                            }
                            nc5 nc5Var = lh4Var.v;
                            if (nc5Var != null) {
                                nc5Var.b();
                            }
                            int i4 = xa3Var.y;
                            Object[] objArr2 = xa3Var.g;
                            me2 me2VarK = xs2.K(0, i4);
                            int i5 = me2VarK.j;
                            int i6 = me2VarK.t;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((eh4) objArr2[i5]).r) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            pr.T(i4 - i2, i4, null, objArr2);
                            xa3Var.y -= i2;
                        }
                        eh4 eh4Var2 = lh4Var.i;
                        if (eh4Var2 != null) {
                            eh4Var2.l = lh4Var.x;
                            lh4.o(eh4Var2, jA0);
                            lh4Var.e(eh4Var2.n);
                            if (eh4Var2.n == 1.0f) {
                                lh4Var.i = null;
                            }
                            lh4Var.d();
                        }
                        break;
                }
                return og5Var;
            }
        };
    }

    public static void o(eh4 eh4Var, long j) {
        long j2 = eh4Var.g + j;
        eh4Var.g = j2;
        long j3 = eh4Var.j;
        if (j2 >= j3) {
            eh4Var.n = 1.0f;
            return;
        }
        mj5 mj5Var = eh4Var.y;
        ri riVar = eh4Var.v;
        if (mj5Var == null) {
            float f = j2 / j3;
            eh4Var.n = (f * 1.0f) + ((1.0f - f) * riVar.g(0));
            return;
        }
        ri riVar2 = eh4Var.x;
        if (riVar2 == null) {
            riVar2 = u;
        }
        eh4Var.n = xs2.q(((ri) mj5Var.l(j2, riVar, z, riVar2)).g(0), 0.0f, 1.0f);
    }

    public final void A(ut4 ut4Var) {
        d5 d5Var;
        if (yf2.p(this.j, ut4Var)) {
            return;
        }
        ut4 ut4Var2 = this.j;
        if (ut4Var2 != null) {
            ut4Var2.y(this);
        }
        ut4 ut4Var3 = this.j;
        if (ut4Var3 != null && (d5Var = ut4Var3.j) != null) {
            d5Var.y();
        }
        this.j = ut4Var;
        if (ut4Var != null) {
            ut4Var.v();
        }
        ut4 ut4Var4 = this.j;
        if (ut4Var4 != null) {
            ut4Var4.n(this, ra.F, this.l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(ou0 ou0Var) {
        jh4 jh4Var;
        Object value;
        Object obj;
        if (ou0Var instanceof jh4) {
            jh4Var = (jh4) ou0Var;
            int i = jh4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jh4Var.c = i - Integer.MIN_VALUE;
            } else {
                jh4Var = new jh4(this, ou0Var);
            }
        } else {
            jh4Var = new jh4(this, ou0Var);
        }
        Object obj2 = jh4Var.q;
        int i2 = jh4Var.c;
        ec3 ec3Var = this.m;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(obj2);
            value = this.y.getValue();
            jh4Var.m = value;
            jh4Var.c = 1;
            if (ec3Var.y(jh4Var) != px0Var) {
            }
            return px0Var;
        }
        if (i2 == 1) {
            Object obj3 = jh4Var.m;
            js2.o(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = jh4Var.m;
            js2.o(obj2);
        }
        if (yf2.p(obj2, obj)) {
            return og5.g;
        }
        this.w = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        jh4Var.m = value;
        jh4Var.c = 2;
        ib0 ib0Var = new ib0(1, pw5.o(jh4Var));
        ib0Var.o();
        this.a = ib0Var;
        ec3Var.x(null);
        Object objZ = ib0Var.z();
        if (objZ != px0Var) {
            obj = value;
            obj2 = objZ;
            if (yf2.p(obj2, obj)) {
                return og5.g;
            }
            this.w = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return px0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public final Object C(ou0 ou0Var) {
        kh4 kh4Var;
        Object value;
        Object obj;
        if (ou0Var instanceof kh4) {
            kh4Var = (kh4) ou0Var;
            int i = kh4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kh4Var.c = i - Integer.MIN_VALUE;
            } else {
                kh4Var = new kh4(this, ou0Var);
            }
        } else {
            kh4Var = new kh4(this, ou0Var);
        }
        Object obj2 = kh4Var.q;
        int i2 = kh4Var.c;
        ec3 ec3Var = this.m;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(obj2);
            value = this.y.getValue();
            kh4Var.m = value;
            kh4Var.c = 1;
            if (ec3Var.y(kh4Var) != px0Var) {
            }
            return px0Var;
        }
        if (i2 == 1) {
            Object obj3 = kh4Var.m;
            js2.o(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = kh4Var.m;
            js2.o(obj2);
        }
        if (!yf2.p(obj2, obj)) {
            this.w = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return og5.g;
        if (!yf2.p(value, this.n)) {
            kh4Var.m = value;
            kh4Var.c = 2;
            ib0 ib0Var = new ib0(1, pw5.o(kh4Var));
            ib0Var.o();
            this.a = ib0Var;
            ec3Var.x(null);
            Object objZ = ib0Var.z();
            if (objZ != px0Var) {
                obj = value;
                obj2 = objZ;
                if (!yf2.p(obj2, obj)) {
                    this.w = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return px0Var;
        }
        ec3Var.x(null);
        return og5.g;
    }

    public final void d() {
        nc5 nc5Var = this.v;
        if (nc5Var == null) {
            return;
        }
        nc5Var.q(k33.a0(((double) this.t.d()) * ((Number) nc5Var.w.getValue()).longValue()));
    }

    public final void e(float f) {
        this.t.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ou0 ou0Var) {
        gh4 gh4Var;
        if (ou0Var instanceof gh4) {
            gh4Var = (gh4) ou0Var;
            int i = gh4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                gh4Var.w = i - Integer.MIN_VALUE;
            } else {
                gh4Var = new gh4(this, ou0Var);
            }
        } else {
            gh4Var = new gh4(this, ou0Var);
        }
        fx0 fx0Var = gh4Var.t;
        Object obj = gh4Var.m;
        int i2 = gh4Var.w;
        xa3 xa3Var = this.c;
        og5 og5Var = og5.g;
        Object obj2 = px0.j;
        if (i2 == 0) {
            js2.o(obj);
            if (xa3Var.t() && this.i == null) {
                return og5Var;
            }
            fx0Var.getClass();
            if (kq2.C(fx0Var) == 0.0f) {
                z();
                this.w = Long.MIN_VALUE;
                return og5Var;
            }
            if (this.w == Long.MIN_VALUE) {
                gh4Var.w = 1;
                fx0Var.getClass();
                if (br2.u(fx0Var).I(gh4Var, this.b) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        do {
            if (!xa3Var.a() && this.i == null) {
                this.w = Long.MIN_VALUE;
                return og5Var;
            }
            gh4Var.w = 2;
        } while (u(gh4Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public final void h() {
        nc5 nc5Var = this.v;
        if (nc5Var == null) {
            return;
        }
        eh4 eh4Var = this.i;
        if (eh4Var == null) {
            if (this.x > 0) {
                pp3 pp3Var = this.t;
                if (pp3Var.d() == 1.0f || yf2.p(this.r.getValue(), this.y.getValue())) {
                    eh4Var = null;
                } else {
                    eh4 eh4Var2 = new eh4();
                    eh4Var2.n = pp3Var.d();
                    long j = this.x;
                    eh4Var2.l = j;
                    eh4Var2.j = k33.a0((1.0d - ((double) pp3Var.d())) * j);
                    eh4Var2.v.v(0, pp3Var.d());
                    eh4Var = eh4Var2;
                }
            } else {
                eh4Var = null;
            }
        }
        if (eh4Var != null) {
            eh4Var.l = this.x;
            this.c.g(eh4Var);
            nc5Var.w(eh4Var);
        }
        this.i = null;
    }

    @Override // defpackage.g90
    public final void i(Object obj) {
        this.r.setValue(obj);
    }

    public final Object k(float f, Object obj, zz4 zz4Var) {
        if (0.0f > f || f > 1.0f) {
            cw3.g("Expecting fraction between 0 and 1. Got " + f);
        }
        nc5 nc5Var = this.v;
        if (nc5Var != null) {
            Object objG = bc3.g(this.q, new ih4(obj, this.y.getValue(), this, nc5Var, f, null), zz4Var);
            if (objG == px0.j) {
                return objG;
            }
        }
        return og5.g;
    }

    @Override // defpackage.g90
    public final Object n() {
        return this.r.getValue();
    }

    @Override // defpackage.g90
    public final void p() {
        this.v = null;
        ut4 ut4Var = this.j;
        if (ut4Var != null) {
            ut4Var.y(this);
        }
    }

    @Override // defpackage.g90
    public final void s(nc5 nc5Var) {
        nc5 nc5Var2 = this.v;
        if (nc5Var2 != null && !nc5Var.equals(nc5Var2)) {
            cw3.y("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.v + ", new instance: " + nc5Var);
        }
        this.v = nc5Var;
    }

    public final Object u(ou0 ou0Var) {
        float fC = kq2.C(ou0Var.v());
        og5 og5Var = og5.g;
        if (fC <= 0.0f) {
            z();
            return og5Var;
        }
        this.s = fC;
        Object objI = br2.u(ou0Var.v()).I(ou0Var, this.p);
        return objI == px0.j ? objI : og5Var;
    }

    @Override // defpackage.g90
    public final Object v() {
        return this.y.getValue();
    }

    public final void z() {
        nc5 nc5Var = this.v;
        if (nc5Var != null) {
            nc5Var.r();
        }
        this.c.n();
        if (this.i != null) {
            this.i = null;
            e(1.0f);
            d();
        }
    }
}
