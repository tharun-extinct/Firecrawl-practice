package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd1 extends p41 implements tu3, wb2, zo0, kd1 {
    public ja3 A;
    public m70 B;
    public ed1 C;
    public boolean D;
    public boolean E;
    public gc1 F;
    public long G = 0;
    public i12 H;
    public i12 I;
    public jc1 J;
    public ic1 K;
    public hc1 L;
    public we6 M;
    public s25 N;
    public de0 O;
    public vb2 P;
    public xy1 d;
    public boolean e;
    public um3 k;

    public cd1(xy1 xy1Var, boolean z, ja3 ja3Var, um3 um3Var) {
        this.k = um3Var;
        this.d = xy1Var;
        this.e = z;
        this.A = ja3Var;
    }

    public static void X0(cd1 cd1Var, qu3 qu3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ic1 ic1Var = cd1Var.K;
        if (ic1Var == null) {
            ic1Var = new ic1();
            cd1Var.K = ic1Var;
        }
        ic1Var.v(qu3Var);
        ic1Var.x(j);
        de0 de0Var = cd1Var.O;
        um3 um3Var = cd1Var.k;
        if (de0Var == null) {
            cd1Var.O = new de0(um3Var);
        } else {
            de0Var.i(um3Var);
            de0 de0Var2 = cd1Var.O;
            if (de0Var2 != null) {
                de0Var2.q(j2);
            }
        }
        ic1Var.l(false);
        cd1Var.M = ic1Var;
    }

    @Override // defpackage.wb2
    public final void C() {
        vb2 vb2Var = this.P;
        if (vb2Var != null) {
            vb2Var.x();
        }
    }

    @Override // defpackage.i73
    public final void J0() {
        this.D = false;
        T0();
        i12 i12Var = this.I;
        if (i12Var != null) {
            R0(i12Var);
        }
        i12 i12Var2 = this.H;
        if (i12Var2 != null) {
            R0(i12Var2);
        }
        this.I = null;
        this.H = null;
    }

    @Override // defpackage.tu3
    public void L(ju3 ju3Var, ku3 ku3Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        gc1 gc1Var;
        boolean z = true;
        this.E = true;
        if (this.e) {
            if (this.H == null) {
                i12 i12VarY = dg6.y(this);
                Q0(i12VarY);
                this.H = i12VarY;
            }
            we6 we6Var = this.M;
            Object obj4 = we6Var;
            if (we6Var == null) {
                gc1 gc1Var2 = this.F;
                if (gc1Var2 == null) {
                    gc1Var = gc1Var2;
                    gc1 gc1Var3 = new gc1();
                    this.F = gc1Var3;
                    gc1Var = gc1Var3;
                }
                gc1Var = gc1Var2;
                this.M = gc1Var;
                obj4 = gc1Var;
            }
            boolean z2 = obj4 instanceof gc1;
            boolean z3 = false;
            ku3 ku3Var2 = ku3.j;
            ku3 ku3Var3 = ku3.t;
            if (z2) {
                gc1 gc1Var4 = (gc1) obj4;
                if (!ju3Var.g.isEmpty() && r25.v(ju3Var, false)) {
                    qu3 qu3Var = (qu3) cj0.j0(ju3Var.g);
                    int i = yc1.g[gc1Var4.y().ordinal()];
                    fc1 fc1Var = fc1.t;
                    fc1 fc1Var2 = fc1.j;
                    fc1 fc1VarY = i == 1 ? !i1() ? fc1Var2 : fc1Var : gc1Var4.y();
                    gc1Var4.v(fc1VarY);
                    if (ku3Var == ku3Var2) {
                        if (fc1VarY == fc1Var) {
                            qu3Var.g();
                            gc1Var4.x(true);
                        }
                        gc1Var4.l(true);
                    }
                    if (ku3Var == ku3Var3) {
                        if (fc1VarY == fc1Var2) {
                            X0(this, qu3Var, qu3Var.n(), 0L, 12);
                            return;
                        }
                        if (gc1Var4.r()) {
                            h1(qu3Var, qu3Var, 0L);
                            g1(0L, qu3Var);
                            long jN = qu3Var.n();
                            jc1 jc1Var = this.J;
                            if (jc1Var == null) {
                                jc1Var = new jc1();
                                this.J = jc1Var;
                            }
                            jc1Var.r(jN);
                            this.M = jc1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = obj4 instanceof ic1;
            ku3 ku3Var4 = ku3.a;
            Object obj5 = null;
            if (!z4) {
                if (obj4 instanceof hc1) {
                    hc1 hc1Var = (hc1) obj4;
                    if (ku3Var != ku3Var4) {
                        return;
                    }
                    List list = ju3Var.g;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((qu3) list.get(i2)).q()) {
                            z = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((qu3) list.get(i3)).x()) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jV = ((qu3) cj0.j0(list)).v();
                                qu3 qu3VarY = hc1Var.y();
                                qu3VarY.getClass();
                                long jN2 = wi3.n(jV, qu3VarY.v());
                                qu3 qu3VarY2 = hc1Var.y();
                                if (qu3VarY2 != null) {
                                    X0(this, qu3VarY2, hc1Var.r(), jN2, 8);
                                    return;
                                } else {
                                    l0.u("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    V0();
                    return;
                }
                if (!(obj4 instanceof jc1)) {
                    uo1.g();
                    return;
                }
                jc1 jc1Var2 = (jc1) obj4;
                if (ku3Var != ku3Var3) {
                    return;
                }
                long jY = jc1Var2.y();
                List list2 = ju3Var.g;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (zq2.a(((qu3) obj).n(), jY)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                qu3 qu3Var2 = (qu3) obj;
                if (qu3Var2 == null) {
                    return;
                }
                boolean zN = fd6.n(qu3Var2);
                Object obj6 = kc1.g;
                if (!zN) {
                    if (qu3Var2.q()) {
                        e1().z(obj6);
                        return;
                    } else {
                        if (wi3.r(fd6.j(qu3Var2)) == 0.0f) {
                            return;
                        }
                        g1(fd6.l(qu3Var2), qu3Var2);
                        qu3Var2.g();
                        return;
                    }
                }
                List list3 = ju3Var.g;
                int size4 = list3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj7 = list3.get(i5);
                    if (((qu3) obj7).x()) {
                        obj5 = obj7;
                        break;
                    }
                }
                qu3 qu3Var3 = (qu3) obj5;
                if (qu3Var3 != null) {
                    jc1Var2.r(qu3Var3.n());
                    return;
                }
                if (qu3Var2.q() || !fd6.n(qu3Var2)) {
                    e1().z(obj6);
                } else {
                    float fG = ((bl5) v70.b(this, hp0.z)).g();
                    ua6.r(f1(), qu3Var2);
                    long jY2 = f1().y(d06.g(fG, fG));
                    f1().x();
                    e1().z(new nc1(nd1.r(jY2)));
                    this.E = false;
                }
                V0();
                return;
            }
            ic1 ic1Var = (ic1) obj4;
            if (ku3Var == ku3Var2) {
                return;
            }
            List list4 = ju3Var.g;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj2 = null;
                    break;
                }
                obj2 = list4.get(i6);
                if (zq2.a(((qu3) obj2).n(), ic1Var.r())) {
                    break;
                } else {
                    i6++;
                }
            }
            qu3 qu3Var4 = (qu3) obj2;
            if (qu3Var4 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list4.get(i7);
                    if (((qu3) obj3).x()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                qu3Var4 = (qu3) obj3;
                if (qu3Var4 == null) {
                    V0();
                    return;
                }
                ic1Var.x(qu3Var4.n());
            }
            if (ku3Var == ku3Var3) {
                if (qu3Var4.q()) {
                    qu3 qu3VarY3 = ic1Var.y();
                    if (qu3VarY3 == null) {
                        l0.u("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long jR = ic1Var.r();
                    de0 de0Var = this.O;
                    if (de0Var == null) {
                        l0.u("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    W0(qu3VarY3, jR, de0Var);
                } else if (fd6.n(qu3Var4)) {
                    int size7 = list4.size();
                    for (int i8 = 0; i8 < size7; i8++) {
                        Object obj8 = list4.get(i8);
                        if (((qu3) obj8).x()) {
                            obj5 = obj8;
                            break;
                        }
                    }
                    qu3 qu3Var5 = (qu3) obj5;
                    if (qu3Var5 == null) {
                        V0();
                    } else {
                        ic1Var.x(qu3Var5.n());
                    }
                } else {
                    float fX = wc1.x((bl5) v70.b(this, hp0.z), qu3Var4.a());
                    de0 de0Var2 = this.O;
                    if (de0Var2 == null) {
                        l0.u("Touch slop detector not initialized.");
                        return;
                    }
                    long jV2 = de0.v(de0Var2, fd6.j(qu3Var4), fX);
                    if ((9223372034707292159L & jV2) != 9205357640488583168L) {
                        long jV3 = wi3.v(this.G, fd6.l(qu3Var4));
                        this.G = jV3;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.G & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jV3 >> 32))))) * 57.29578f;
                        um3 um3Var = this.k;
                        boolean zG = um3Var == null ? true : nd1.g(um3Var, fAtan2);
                        q54 q54Var = new q54();
                        nd1.n(this, new xc1(fAtan2, q54Var, z3 ? 1 : 0));
                        if (zG || !q54Var.j) {
                            ic1Var = ic1Var;
                            qu3Var4.g();
                            qu3 qu3VarY4 = ic1Var.y();
                            qu3VarY4.getClass();
                            h1(qu3VarY4, qu3Var4, jV2);
                            g1(jV2, qu3Var4);
                            long jN3 = qu3Var4.n();
                            jc1 jc1Var3 = this.J;
                            if (jc1Var3 == null) {
                                jc1Var3 = new jc1();
                                this.J = jc1Var3;
                            }
                            jc1Var3.r(jN3);
                            this.M = jc1Var3;
                        } else {
                            ic1Var.l(true);
                        }
                    } else {
                        ic1Var.l(true);
                        this.G = wi3.v(this.G, fd6.j(qu3Var4));
                    }
                }
            }
            if (ku3Var != ku3Var4 || !ic1Var.n()) {
                ic1Var = ic1Var;
                return;
            }
            if (!qu3Var4.q()) {
                ic1Var = ic1Var;
                ic1Var.l(false);
                return;
            }
            qu3 qu3VarY5 = ic1Var.y();
            if (qu3VarY5 == null) {
                ic1Var = ic1Var;
                l0.u("AwaitTouchSlop.initialDown was not initialized");
                return;
            }
            long jR2 = ic1Var.r();
            de0 de0Var3 = this.O;
            if (de0Var3 != null) {
                ic1Var = ic1Var;
                W0(qu3VarY5, jR2, de0Var3);
            } else {
                ic1Var = ic1Var;
                l0.u("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
        }
    }

    public final void T0() {
        ed1 ed1Var = this.C;
        if (ed1Var != null) {
            ja3 ja3Var = this.A;
            if (ja3Var != null) {
                ja3Var.r(new dd1(ed1Var));
            }
            this.C = null;
        }
    }

    public abstract Object U0(s3 s3Var, n10 n10Var);

    public final void V0() {
        this.G = 0L;
        gc1 gc1Var = this.F;
        if (gc1Var == null) {
            gc1Var = new gc1();
            this.F = gc1Var;
        }
        gc1Var.v(fc1.a);
        gc1Var.x(false);
        gc1Var.l(false);
        this.M = gc1Var;
    }

    public final void W0(qu3 qu3Var, long j, de0 de0Var) {
        hc1 hc1Var = this.L;
        if (hc1Var == null) {
            hc1Var = new hc1();
            this.L = hc1Var;
        }
        hc1Var.n(qu3Var);
        hc1Var.v(j);
        de0.w(de0Var);
        this.M = hc1Var;
    }

    public final void Y0(oc1 oc1Var) {
        if ((oc1Var instanceof mc1) && !this.D) {
            this.D = true;
            j1();
        }
        e1().z(oc1Var);
    }

    public void a1(nc1 nc1Var) {
        if (this.h) {
            m50.T(E0(), null, new b8(this, nc1Var, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b1(ou0 ou0Var) throws Throwable {
        zc1 zc1Var;
        if (ou0Var instanceof zc1) {
            zc1Var = (zc1) ou0Var;
            int i = zc1Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc1Var.w = i - Integer.MIN_VALUE;
            } else {
                zc1Var = new zc1(this, ou0Var);
            }
        } else {
            zc1Var = new zc1(this, ou0Var);
        }
        Object obj = zc1Var.m;
        int i2 = zc1Var.w;
        if (i2 == 0) {
            js2.o(obj);
            ed1 ed1Var = this.C;
            if (ed1Var != null) {
                ja3 ja3Var = this.A;
                if (ja3Var != null) {
                    dd1 dd1Var = new dd1(ed1Var);
                    zc1Var.w = 1;
                    Object objY = ja3Var.y(dd1Var, zc1Var);
                    px0 px0Var = px0.j;
                    if (objY == px0Var) {
                        return px0Var;
                    }
                }
            }
            a1(new nc1(0L));
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        this.C = null;
        a1(new nc1(0L));
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(mc1 mc1Var, ou0 ou0Var) {
        ad1 ad1Var;
        ja3 ja3Var;
        ed1 ed1Var;
        mc1 mc1Var2;
        ed1 ed1Var2;
        if (ou0Var instanceof ad1) {
            ad1Var = (ad1) ou0Var;
            int i = ad1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad1Var.i = i - Integer.MIN_VALUE;
            } else {
                ad1Var = new ad1(this, ou0Var);
            }
        } else {
            ad1Var = new ad1(this, ou0Var);
        }
        Object obj = ad1Var.w;
        int i2 = ad1Var.i;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(obj);
            ed1 ed1Var3 = this.C;
            if (ed1Var3 != null && (ja3Var = this.A) != null) {
                dd1 dd1Var = new dd1(ed1Var3);
                ad1Var.m = mc1Var;
                ad1Var.i = 1;
                if (ja3Var.y(dd1Var, ad1Var) != px0Var) {
                }
                return px0Var;
            }
            this.C = ed1Var;
            Z0(mc1Var.g());
            return og5.g;
        }
        if (i2 == 1) {
            mc1Var = ad1Var.m;
            js2.o(obj);
        } else {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ed1Var2 = ad1Var.q;
            mc1Var2 = ad1Var.m;
            js2.o(obj);
        }
        ed1Var = ed1Var2;
        mc1Var = mc1Var2;
        this.C = ed1Var;
        Z0(mc1Var.g());
        return og5.g;
        ed1Var = new ed1();
        ja3 ja3Var2 = this.A;
        if (ja3Var2 != null) {
            ad1Var.m = mc1Var;
            ad1Var.q = ed1Var;
            ad1Var.i = 2;
            if (ja3Var2.y(ed1Var, ad1Var) != px0Var) {
                mc1Var2 = mc1Var;
                ed1Var2 = ed1Var;
                ed1Var = ed1Var2;
                mc1Var = mc1Var2;
            }
            return px0Var;
        }
        this.C = ed1Var;
        Z0(mc1Var.g());
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(nc1 nc1Var, ou0 ou0Var) throws Throwable {
        bd1 bd1Var;
        if (ou0Var instanceof bd1) {
            bd1Var = (bd1) ou0Var;
            int i = bd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bd1Var.c = i - Integer.MIN_VALUE;
            } else {
                bd1Var = new bd1(this, ou0Var);
            }
        } else {
            bd1Var = new bd1(this, ou0Var);
        }
        Object obj = bd1Var.q;
        int i2 = bd1Var.c;
        if (i2 == 0) {
            js2.o(obj);
            ed1 ed1Var = this.C;
            if (ed1Var != null) {
                ja3 ja3Var = this.A;
                if (ja3Var != null) {
                    fd1 fd1Var = new fd1(ed1Var);
                    bd1Var.m = nc1Var;
                    bd1Var.c = 1;
                    Object objY = ja3Var.y(fd1Var, bd1Var);
                    px0 px0Var = px0.j;
                    if (objY == px0Var) {
                        return px0Var;
                    }
                }
            }
            a1(nc1Var);
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        nc1Var = bd1Var.m;
        js2.o(obj);
        this.C = null;
        a1(nc1Var);
        return og5.g;
    }

    public final yc0 e1() {
        m70 m70Var = this.B;
        if (m70Var != null) {
            return m70Var;
        }
        l0.u("Events channel not initialized.");
        return null;
    }

    public final s25 f1() {
        s25 s25Var = this.N;
        if (s25Var != null) {
            return s25Var;
        }
        l0.u("Velocity Tracker not initialized.");
        return null;
    }

    public final void g1(long j, qu3 qu3Var) {
        this.G = wi3.v(this.G, j);
        ua6.r(f1(), qu3Var);
        e1().z(new lc1(j));
    }

    @Override // defpackage.wb2
    public final void h(ld1 ld1Var, ku3 ku3Var) {
        if (this.e) {
            vb2 vb2Var = this.P;
            if (vb2Var == null) {
                vb2Var = new vb2(this);
                this.P = vb2Var;
            }
            if (this.I == null) {
                i12 i12VarY = dg6.y(vb2Var);
                Q0(i12VarY);
                this.I = i12VarY;
            }
            vb2 vb2Var2 = this.P;
            if (vb2Var2 != null) {
                vb2Var2.n(ld1Var, ku3Var);
            }
        }
    }

    public final void h1(qu3 qu3Var, qu3 qu3Var2, long j) {
        if (this.N == null) {
            this.N = new s25((byte) 4);
        }
        ua6.r(f1(), qu3Var);
        long jN = wi3.n(qu3Var2.v(), j);
        if (((Boolean) this.d.a(bv3.g(qu3Var.a()))).booleanValue()) {
            if (!this.D) {
                if (this.B == null) {
                    this.B = v70.y(Integer.MAX_VALUE, 6, null);
                }
                j1();
            }
            e1().z(new mc1(0, jN));
        }
    }

    public boolean i1() {
        ng4 ng4Var = ((fg4) this).Y;
        if (ng4Var.g.y()) {
            return true;
        }
        tb tbVar = ng4Var.y;
        return tbVar != null ? tbVar.v() : false;
    }

    public final void j1() {
        this.D = true;
        mu0 mu0Var = null;
        if (this.B == null) {
            this.B = v70.y(Integer.MAX_VALUE, 6, null);
        }
        m50.T(E0(), null, new n10((Object) this, mu0Var, (byte) 2), 3);
    }

    public final void k1(xy1 xy1Var, boolean z, ja3 ja3Var, um3 um3Var, boolean z2) {
        this.d = xy1Var;
        boolean z3 = true;
        if (this.e != z) {
            this.e = z;
            if (!z) {
                i12 i12Var = this.I;
                if (i12Var != null) {
                    R0(i12Var);
                }
                i12 i12Var2 = this.H;
                if (i12Var2 != null) {
                    R0(i12Var2);
                }
                this.I = null;
                this.H = null;
                T0();
                this.P = null;
            }
            z2 = true;
        }
        if (!yf2.p(this.A, ja3Var)) {
            T0();
            this.A = ja3Var;
        }
        if (this.k != um3Var) {
            this.k = um3Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.E) {
                V0();
                if (this.D) {
                    e1().z(kc1.g);
                }
                this.N = null;
            }
            vb2 vb2Var = this.P;
            if (vb2Var != null) {
                vb2Var.x();
            }
        }
    }

    @Override // defpackage.kd1
    public final um3 m() {
        return this.k;
    }

    @Override // defpackage.tu3
    public final void m0() {
        if (this.E) {
            V0();
            if (this.D) {
                e1().z(kc1.g);
            }
            this.N = null;
        }
        this.E = false;
    }

    @Override // defpackage.h12
    public final String x0() {
        if (!this.e) {
            return "idle";
        }
        we6 we6Var = this.M;
        if (we6Var instanceof gc1) {
            return ((gc1) we6Var).n() ? "waiting" : "idle";
        }
        if ((we6Var instanceof ic1) || (we6Var instanceof hc1)) {
            return "waiting";
        }
        return we6Var instanceof jc1 ? "recognized" : "idle";
    }

    public void Z0(long j) {
    }
}
