package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends p41 implements tu3, oi2, ej4, zo0, ti3, wb2, h12 {
    public String A;
    public o94 B;
    public boolean C;
    public my1 D;
    public final hu1 E;
    public hb2 F;
    public i12 G;
    public String H = "idle";
    public o41 I;
    public mx3 J;
    public p72 K;
    public final ma3 L;
    public long M;
    public mx3 N;
    public ja3 O;
    public boolean P;
    public iv4 Q;
    public hb2 d;
    public boolean e;
    public ja3 k;

    public z(ja3 ja3Var, hb2 hb2Var, boolean z, boolean z2, String str, o94 o94Var, my1 my1Var) {
        this.k = ja3Var;
        this.d = hb2Var;
        this.e = z;
        this.A = str;
        this.B = o94Var;
        this.C = z2;
        this.D = my1Var;
        this.E = new hu1(ja3Var, 0, new w(1, this, z.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = my2.g;
        this.L = new ma3(6);
        this.M = 0L;
        ja3 ja3Var2 = this.k;
        this.O = ja3Var2;
        this.P = ja3Var2 == null;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        N();
        if (!this.P) {
            a1();
        }
        if (this.C) {
            Q0(this.E);
        }
    }

    @Override // defpackage.i73
    public final void J0() {
        U0();
        if (this.O == null) {
            this.k = null;
        }
        o41 o41Var = this.I;
        if (o41Var != null) {
            R0(o41Var);
        }
        this.I = null;
        i12 i12Var = this.G;
        if (i12Var != null) {
            R0(i12Var);
        }
        this.G = null;
    }

    public void L(ju3 ju3Var, ku3 ku3Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.M = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        a1();
        if (this.C) {
            if (this.G == null) {
                i12 i12VarY = dg6.y(this);
                Q0(i12VarY);
                this.G = i12VarY;
            }
            if (ku3Var == ku3.t) {
                int i = ju3Var.x;
                mu0 mu0Var = null;
                if (i == 4) {
                    m50.T(E0(), null, new u(this, mu0Var, (byte) 0), 3);
                } else if (i == 5) {
                    m50.T(E0(), null, new u(this, mu0Var, (byte) 1), 3);
                }
            }
        }
    }

    @Override // defpackage.ti3
    public final void N() {
        if (this.e) {
            mq2.b(this, new a(this, (byte) 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void U0() {
        ja3 ja3Var = this.k;
        ma3 ma3Var = this.L;
        if (ja3Var != null) {
            mx3 mx3Var = this.J;
            if (mx3Var != null) {
                ja3Var.r(new lx3(mx3Var));
            }
            mx3 mx3Var2 = this.N;
            if (mx3Var2 != null) {
                ja3Var.r(new lx3(mx3Var2));
            }
            p72 p72Var = this.K;
            if (p72Var != null) {
                ja3Var.r(new q72(p72Var));
            }
            Object[] objArr = ma3Var.r;
            long[] jArr = ma3Var.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ja3Var.r(new lx3((mx3) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.J = null;
        this.N = null;
        this.K = null;
        ma3Var.g();
    }

    public final long V0(long j) {
        long jH0 = k33.V(this).F.h0(((bl5) v70.b(this, hp0.z)).l());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jH0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void W0(boolean z) {
        ja3 ja3Var = this.k;
        if (ja3Var != null) {
            iv4 iv4Var = this.Q;
            mu0 mu0Var = null;
            if (iv4Var == null || !iv4Var.y()) {
                mx3 mx3Var = z ? this.N : this.J;
                if (mx3Var != null) {
                    lx3 lx3Var = new lx3(mx3Var);
                    dh2 dh2Var = (dh2) ((ku0) E0()).j.h(d52.m);
                    m50.T(E0(), null, new c(ja3Var, lx3Var, dh2Var != null ? dh2Var.A(new m(ja3Var, lx3Var, (byte) 0)) : null, mu0Var, (byte) 0), 3);
                }
            } else {
                iv4 iv4Var2 = this.Q;
                if (iv4Var2 != null) {
                    iv4Var2.x(null);
                }
            }
            if (z) {
                this.N = null;
            } else {
                this.J = null;
            }
        }
    }

    public final void X0(long j, boolean z) {
        ja3 ja3Var = this.k;
        if (ja3Var != null) {
            iv4 iv4Var = this.Q;
            if (iv4Var == null || !iv4Var.y()) {
                mx3 mx3Var = z ? this.N : this.J;
                if (mx3Var != null) {
                    m50.T(E0(), null, new b(mx3Var, ja3Var, null), 3);
                }
            } else {
                iv4Var.x(null);
                m50.T(E0(), null, new i((Object) iv4Var, j, ja3Var, (mu0) null, (byte) 0), 3);
            }
            if (z) {
                this.N = null;
            } else {
                this.J = null;
            }
        }
    }

    public final void Y0(ob2 ob2Var) {
        ja3 ja3Var = this.k;
        if (ja3Var != null) {
            mx3 mx3Var = new mx3(ob2Var.y());
            u54 u54Var = new u54();
            byte b = 1;
            dg6.n(this, new j9(u54Var, b));
            mu0 mu0Var = null;
            if (u54Var.j != null || wh0.g(this)) {
                this.Q = m50.T(E0(), null, new s(ja3Var, mx3Var, this, mu0Var, (byte) 0), 3);
            } else {
                this.N = mx3Var;
                m50.T(E0(), null, new b(ja3Var, mx3Var, mu0Var, b), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f A[RETURN] */
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
    @Override // defpackage.oi2
    public final boolean Z(KeyEvent keyEvent) {
        boolean z;
        a1();
        long jR = mx5.r(keyEvent);
        boolean z2 = this.C;
        byte b = 3;
        mu0 mu0Var = null;
        ma3 ma3Var = this.L;
        if (z2) {
            byte b2 = 2;
            if (lx5.y(mx5.n(keyEvent), 2) && ue5.V(keyEvent)) {
                if (ma3Var.y(jR)) {
                    z = false;
                } else {
                    mx3 mx3Var = new mx3(this.M);
                    ma3Var.l(jR, mx3Var);
                    if (this.k != null) {
                        m50.T(E0(), null, new p(this, mx3Var, mu0Var, b2), 3);
                    }
                    z = true;
                }
                if (c1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.C && lx5.y(mx5.n(keyEvent), 1) && ue5.V(keyEvent)) {
            mx3 mx3Var2 = (mx3) ma3Var.x(jR);
            if (mx3Var2 != null) {
                if (this.k != null) {
                    m50.T(E0(), null, new p(this, mx3Var2, mu0Var, b), 3);
                }
                d1(keyEvent);
            }
            if (mx3Var2 != null) {
                return true;
            }
        }
        return false;
    }

    public final void Z0(qu3 qu3Var) {
        ja3 ja3Var = this.k;
        if (ja3Var != null) {
            mx3 mx3Var = new mx3(qu3Var.v());
            u54 u54Var = new u54();
            dg6.n(this, new j9(u54Var, (byte) 1));
            mu0 mu0Var = null;
            if (u54Var.j != null || wh0.g(this)) {
                this.Q = m50.T(E0(), null, new s(ja3Var, mx3Var, this, mu0Var, (byte) 1), 3);
            } else {
                this.J = mx3Var;
                m50.T(E0(), null, new b(ja3Var, mx3Var, mu0Var, (byte) 2), 3);
            }
        }
    }

    public final void a1() {
        if (this.I != null) {
            return;
        }
        hb2 hb2Var = this.e ? this.F : this.d;
        if (hb2Var != null) {
            ja3 ja3Var = this.k;
            if (ja3Var == null) {
                ja3Var = new ja3();
                this.k = ja3Var;
            }
            this.E.V0(ja3Var);
            ja3 ja3Var2 = this.k;
            ja3Var2.getClass();
            o41 o41VarG = hb2Var.g(ja3Var2);
            Q0(o41VarG);
            this.I = o41VarG;
        }
    }

    public boolean c1(KeyEvent keyEvent) {
        return false;
    }

    public void d1(KeyEvent keyEvent) {
        e1();
    }

    public final void e1() {
        gu4 gu4Var = (gu4) v70.b(this, hp0.o);
        if (gu4Var != null) {
            gu4Var.g();
        }
        this.D.g();
    }

    public final void f1(ja3 ja3Var, hb2 hb2Var, boolean z, boolean z2, String str, o94 o94Var, my1 my1Var) {
        boolean z3;
        boolean z4;
        o41 o41Var;
        boolean z5 = true;
        if (yf2.p(this.O, ja3Var)) {
            z3 = false;
        } else {
            U0();
            this.O = ja3Var;
            this.k = ja3Var;
            z3 = true;
        }
        if (!yf2.p(this.d, hb2Var)) {
            this.d = hb2Var;
            z3 = true;
        }
        if (this.e != z) {
            this.e = z;
            if (z) {
                N();
            }
            z3 = true;
        }
        boolean z6 = this.C;
        hu1 hu1Var = this.E;
        if (z6 != z2) {
            if (z2) {
                Q0(hu1Var);
            } else {
                R0(hu1Var);
                U0();
            }
            br2.d(this);
            if (!z2) {
                o41 o41Var2 = this.G;
                if (o41Var2 != null) {
                    R0(o41Var2);
                }
                this.G = null;
                this.H = "idle";
            }
            this.C = z2;
        }
        if (!yf2.p(this.A, str)) {
            this.A = str;
            br2.d(this);
        }
        if (!yf2.p(this.B, o94Var)) {
            this.B = o94Var;
            br2.d(this);
        }
        this.D = my1Var;
        boolean z7 = this.P;
        ja3 ja3Var2 = this.O;
        if (z7 == (ja3Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = ja3Var2 == null;
            this.P = z4;
            if (z4 || this.I != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((o41Var = this.I) != null || !z4)) {
            if (o41Var != null) {
                R0(o41Var);
            }
            this.I = null;
            a1();
        }
        hu1Var.V0(this.k);
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        o94 o94Var = this.B;
        if (o94Var != null) {
            lj4.t(nj4Var, o94Var.g);
        }
        String str = this.A;
        a aVar = new a(this, (byte) 1);
        ci2[] ci2VarArr = lj4.g;
        nj4Var.g(yi4.y, new p1(str, aVar));
        if (this.C) {
            this.E.l0(nj4Var);
        } else {
            nj4Var.g(kj4.a, og5.g);
        }
        T0(nj4Var);
    }

    @Override // defpackage.ej4
    public final boolean p0() {
        return true;
    }

    @Override // defpackage.oi2
    public final boolean q(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.h12
    public final String x0() {
        return this.H;
    }

    public void b1() {
    }

    public void T0(nj4 nj4Var) {
    }
}
