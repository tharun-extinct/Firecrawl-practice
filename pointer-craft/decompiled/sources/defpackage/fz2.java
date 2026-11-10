package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fz2 extends us3 implements p33, b7, d83 {
    public boolean C;
    public final dz2 D;
    public Object F;
    public final dz2 H;
    public final dz2 I;
    public boolean J;
    public boolean c;
    public xy1 f;
    public ws0 h;
    public x32 k;
    public boolean p;
    public boolean u;
    public final ym2 w;
    public boolean z;
    public int i = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public sm2 s = sm2.a;
    public long o = 0;
    public ez2 d = ez2.a;
    public final vy2 e = new vy2(this);
    public final rb3 A = new rb3(new fz2[16]);
    public boolean B = true;
    public boolean E = true;
    public long G = zs0.y(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r1v2, types: [dz2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dz2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [dz2] */
    public fz2(ym2 ym2Var) {
        this.w = ym2Var;
        final byte b = 1;
        final byte b2 = 0;
        this.D = new my1(this) { // from class: dz2
            public final /* synthetic */ fz2 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                bz2 bz2VarW0;
                byte b3 = b2;
                og5 og5Var = og5.g;
                xa3 xa3Var = null;
                placementScope = null;
                placementScope = null;
                ts3 placementScope = null;
                fz2 fz2Var = this.t;
                switch (b3) {
                    case 0:
                        ym2 ym2Var2 = fz2Var.w;
                        ym2Var2.j = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            fz2 fz2Var2 = ((um2) objArr[i2]).N.s;
                            fz2Var2.getClass();
                            fz2Var2.i = fz2Var2.b;
                            fz2Var2.b = Integer.MAX_VALUE;
                            if (fz2Var2.s == sm2.t) {
                                fz2Var2.s = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            fz2 fz2Var3 = ((um2) objArr2[i4]).N.s;
                            fz2Var3.getClass();
                            fz2Var3.e.n = false;
                        }
                        rc2 rc2Var = fz2Var.i().k0;
                        if (rc2Var == null) {
                            l0.z("Expected lookahead delegate");
                            return null;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            bz2 bz2VarW1 = um2Var2.M.n.W0();
                            if (bz2VarW1 != null) {
                                if (bz2VarW1.o) {
                                    if (xa3Var == null) {
                                        xa3Var = new xa3();
                                    }
                                    xa3Var.g(um2Var2);
                                }
                                bz2VarW1.o = rc2Var.o;
                            }
                        }
                        rc2Var.F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                rb3 rb3VarB3 = um2Var.B();
                                Object[] objArr3 = rb3VarB3.j;
                                int i9 = rb3VarB3.a;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    fz2 fz2Var4 = ((um2) objArr3[i10]).N.s;
                                    fz2Var4.getClass();
                                    int i11 = fz2Var4.i;
                                    int i12 = fz2Var4.b;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        fz2Var4.G0(true);
                                    }
                                }
                                rb3 rb3VarB4 = um2Var.B();
                                Object[] objArr4 = rb3VarB4.j;
                                int i13 = rb3VarB4.a;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    fz2 fz2Var5 = ((um2) objArr4[i14]).N.s;
                                    fz2Var5.getClass();
                                    vy2 vy2Var = fz2Var5.e;
                                    vy2Var.v = vy2Var.n;
                                }
                                return og5Var;
                            }
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            boolean z = xa3Var != null && xa3Var.v(um2Var3);
                            bz2 bz2VarW2 = um2Var3.M.n.W0();
                            if (bz2VarW2 != null) {
                                bz2VarW2.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        bz2 bz2VarW3 = fz2Var.w.g().W0();
                        bz2VarW3.getClass();
                        bz2VarW3.v(fz2Var.G);
                        return og5Var;
                    default:
                        ym2 ym2Var3 = fz2Var.w;
                        if (y94.H(ym2Var3.g) || ym2Var3.r) {
                            gh3 gh3Var = ym2Var3.g().D;
                            if (gh3Var != null) {
                                placementScope = gh3Var.f;
                            }
                        } else {
                            gh3 gh3Var2 = ym2Var3.g().D;
                            if (gh3Var2 != null && (bz2VarW0 = gh3Var2.W0()) != null) {
                                placementScope = bz2VarW0.f;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ba) xm2.g(ym2Var3.g)).getPlacementScope();
                        }
                        bz2 bz2VarW4 = ym2Var3.g().W0();
                        bz2VarW4.getClass();
                        ts3.a(placementScope, bz2VarW4, fz2Var.o);
                        return og5Var;
                }
            }
        };
        this.F = ym2Var.b.e;
        this.H = new my1(this) { // from class: dz2
            public final /* synthetic */ fz2 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                bz2 bz2VarW0;
                byte b3 = b;
                og5 og5Var = og5.g;
                xa3 xa3Var = null;
                placementScope = null;
                placementScope = null;
                ts3 placementScope = null;
                fz2 fz2Var = this.t;
                switch (b3) {
                    case 0:
                        ym2 ym2Var2 = fz2Var.w;
                        ym2Var2.j = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            fz2 fz2Var2 = ((um2) objArr[i2]).N.s;
                            fz2Var2.getClass();
                            fz2Var2.i = fz2Var2.b;
                            fz2Var2.b = Integer.MAX_VALUE;
                            if (fz2Var2.s == sm2.t) {
                                fz2Var2.s = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            fz2 fz2Var3 = ((um2) objArr2[i4]).N.s;
                            fz2Var3.getClass();
                            fz2Var3.e.n = false;
                        }
                        rc2 rc2Var = fz2Var.i().k0;
                        if (rc2Var == null) {
                            l0.z("Expected lookahead delegate");
                            return null;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            bz2 bz2VarW1 = um2Var2.M.n.W0();
                            if (bz2VarW1 != null) {
                                if (bz2VarW1.o) {
                                    if (xa3Var == null) {
                                        xa3Var = new xa3();
                                    }
                                    xa3Var.g(um2Var2);
                                }
                                bz2VarW1.o = rc2Var.o;
                            }
                        }
                        rc2Var.F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                rb3 rb3VarB3 = um2Var.B();
                                Object[] objArr3 = rb3VarB3.j;
                                int i9 = rb3VarB3.a;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    fz2 fz2Var4 = ((um2) objArr3[i10]).N.s;
                                    fz2Var4.getClass();
                                    int i11 = fz2Var4.i;
                                    int i12 = fz2Var4.b;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        fz2Var4.G0(true);
                                    }
                                }
                                rb3 rb3VarB4 = um2Var.B();
                                Object[] objArr4 = rb3VarB4.j;
                                int i13 = rb3VarB4.a;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    fz2 fz2Var5 = ((um2) objArr4[i14]).N.s;
                                    fz2Var5.getClass();
                                    vy2 vy2Var = fz2Var5.e;
                                    vy2Var.v = vy2Var.n;
                                }
                                return og5Var;
                            }
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            boolean z = xa3Var != null && xa3Var.v(um2Var3);
                            bz2 bz2VarW2 = um2Var3.M.n.W0();
                            if (bz2VarW2 != null) {
                                bz2VarW2.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        bz2 bz2VarW3 = fz2Var.w.g().W0();
                        bz2VarW3.getClass();
                        bz2VarW3.v(fz2Var.G);
                        return og5Var;
                    default:
                        ym2 ym2Var3 = fz2Var.w;
                        if (y94.H(ym2Var3.g) || ym2Var3.r) {
                            gh3 gh3Var = ym2Var3.g().D;
                            if (gh3Var != null) {
                                placementScope = gh3Var.f;
                            }
                        } else {
                            gh3 gh3Var2 = ym2Var3.g().D;
                            if (gh3Var2 != null && (bz2VarW0 = gh3Var2.W0()) != null) {
                                placementScope = bz2VarW0.f;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ba) xm2.g(ym2Var3.g)).getPlacementScope();
                        }
                        bz2 bz2VarW4 = ym2Var3.g().W0();
                        bz2VarW4.getClass();
                        ts3.a(placementScope, bz2VarW4, fz2Var.o);
                        return og5Var;
                }
            }
        };
        final byte b3 = 2;
        this.I = new my1(this) { // from class: dz2
            public final /* synthetic */ fz2 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                bz2 bz2VarW0;
                byte b4 = b3;
                og5 og5Var = og5.g;
                xa3 xa3Var = null;
                placementScope = null;
                placementScope = null;
                ts3 placementScope = null;
                fz2 fz2Var = this.t;
                switch (b4) {
                    case 0:
                        ym2 ym2Var2 = fz2Var.w;
                        ym2Var2.j = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            fz2 fz2Var2 = ((um2) objArr[i2]).N.s;
                            fz2Var2.getClass();
                            fz2Var2.i = fz2Var2.b;
                            fz2Var2.b = Integer.MAX_VALUE;
                            if (fz2Var2.s == sm2.t) {
                                fz2Var2.s = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            fz2 fz2Var3 = ((um2) objArr2[i4]).N.s;
                            fz2Var3.getClass();
                            fz2Var3.e.n = false;
                        }
                        rc2 rc2Var = fz2Var.i().k0;
                        if (rc2Var == null) {
                            l0.z("Expected lookahead delegate");
                            return null;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            bz2 bz2VarW1 = um2Var2.M.n.W0();
                            if (bz2VarW1 != null) {
                                if (bz2VarW1.o) {
                                    if (xa3Var == null) {
                                        xa3Var = new xa3();
                                    }
                                    xa3Var.g(um2Var2);
                                }
                                bz2VarW1.o = rc2Var.o;
                            }
                        }
                        rc2Var.F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                rb3 rb3VarB3 = um2Var.B();
                                Object[] objArr3 = rb3VarB3.j;
                                int i9 = rb3VarB3.a;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    fz2 fz2Var4 = ((um2) objArr3[i10]).N.s;
                                    fz2Var4.getClass();
                                    int i11 = fz2Var4.i;
                                    int i12 = fz2Var4.b;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        fz2Var4.G0(true);
                                    }
                                }
                                rb3 rb3VarB4 = um2Var.B();
                                Object[] objArr4 = rb3VarB4.j;
                                int i13 = rb3VarB4.a;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    fz2 fz2Var5 = ((um2) objArr4[i14]).N.s;
                                    fz2Var5.getClass();
                                    vy2 vy2Var = fz2Var5.e;
                                    vy2Var.v = vy2Var.n;
                                }
                                return og5Var;
                            }
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            boolean z = xa3Var != null && xa3Var.v(um2Var3);
                            bz2 bz2VarW2 = um2Var3.M.n.W0();
                            if (bz2VarW2 != null) {
                                bz2VarW2.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        bz2 bz2VarW3 = fz2Var.w.g().W0();
                        bz2VarW3.getClass();
                        bz2VarW3.v(fz2Var.G);
                        return og5Var;
                    default:
                        ym2 ym2Var3 = fz2Var.w;
                        if (y94.H(ym2Var3.g) || ym2Var3.r) {
                            gh3 gh3Var = ym2Var3.g().D;
                            if (gh3Var != null) {
                                placementScope = gh3Var.f;
                            }
                        } else {
                            gh3 gh3Var2 = ym2Var3.g().D;
                            if (gh3Var2 != null && (bz2VarW0 = gh3Var2.W0()) != null) {
                                placementScope = bz2VarW0.f;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ba) xm2.g(ym2Var3.g)).getPlacementScope();
                        }
                        bz2 bz2VarW4 = ym2Var3.g().W0();
                        bz2VarW4.getClass();
                        ts3.a(placementScope, bz2VarW4, fz2Var.o);
                        return og5Var;
                }
            }
        };
    }

    public final void A0(boolean z) {
        um2 um2VarO;
        ym2 ym2Var = this.w;
        um2 um2VarO2 = ym2Var.g.o();
        sm2 sm2Var = ym2Var.g.J;
        if (um2VarO2 == null || sm2Var == sm2.a) {
            return;
        }
        while (um2VarO2.J == sm2Var && (um2VarO = um2VarO2.o()) != null) {
            um2VarO2 = um2VarO;
        }
        int iOrdinal = sm2Var.ordinal();
        if (iOrdinal == 0) {
            if (um2VarO2.i != null) {
                um2.V(um2VarO2, z, 6);
                return;
            } else {
                um2.X(um2VarO2, z, 6);
                return;
            }
        }
        if (iOrdinal != 1) {
            l0.z("Intrinsics isn't used by the parent");
        } else if (um2VarO2.i != null) {
            um2VarO2.U(z);
        } else {
            um2VarO2.W(z);
        }
    }

    public final void E0() {
        this.E = true;
    }

    public final boolean F0() {
        return this.d != ez2.a;
    }

    public final void G0(boolean z) {
        if (z && x0()) {
            return;
        }
        if (z || x0()) {
            this.d = ez2.a;
            rb3 rb3VarB = this.w.g.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                fz2 fz2Var = ((um2) objArr[i2]).N.s;
                fz2Var.getClass();
                fz2Var.G0(true);
            }
        }
    }

    public final void H0() {
        ez2 ez2Var = this.d;
        ym2 ym2Var = this.w;
        boolean z = ym2Var.r;
        um2 um2Var = ym2Var.g;
        ez2 ez2Var2 = ez2.j;
        if (z) {
            this.d = ez2.t;
        } else {
            this.d = ez2Var2;
        }
        if (ez2Var != ez2Var2 && ym2Var.v) {
            um2.V(um2Var, true, 6);
        }
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            fz2 fz2Var = um2Var2.N.s;
            if (fz2Var == null) {
                l0.u("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (fz2Var.b != Integer.MAX_VALUE) {
                fz2Var.H0();
                um2.Y(um2Var2);
            }
        }
    }

    public final void I0() {
        ym2 ym2Var = this.w;
        if (ym2Var.i > 0) {
            rb3 rb3VarB = ym2Var.g.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                um2 um2Var = (um2) objArr[i2];
                ym2 ym2Var2 = um2Var.N;
                if ((ym2Var2.w || ym2Var2.c) && !ym2Var2.x) {
                    um2Var.U(false);
                }
                fz2 fz2Var = ym2Var2.s;
                if (fz2Var != null) {
                    fz2Var.I0();
                }
            }
        }
    }

    public final void J0() {
        if (this.d == ez2.a) {
            ym2 ym2Var = this.w;
            if (y94.H(ym2Var.g)) {
                return;
            }
            ym2Var.r = true;
        }
    }

    public final void K0() {
        this.d = ez2.j;
    }

    public final void L0() {
        sm2 sm2Var;
        ym2 ym2Var = this.w;
        um2.V(ym2Var.g, false, 7);
        um2 um2Var = ym2Var.g;
        um2 um2VarO = um2Var.o();
        if (um2VarO == null || um2Var.J != sm2.a) {
            return;
        }
        int iOrdinal = um2VarO.N.n.ordinal();
        if (iOrdinal != 0) {
            sm2Var = iOrdinal != 2 ? um2VarO.J : sm2.t;
        } else {
            sm2Var = sm2.j;
        }
        um2Var.J = sm2Var;
    }

    public final void M0() {
        this.b = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.d = ez2.a;
    }

    public final void N0() {
        qm2 qm2Var;
        this.J = true;
        ym2 ym2Var = this.w;
        um2 um2VarO = ym2Var.g.o();
        ez2 ez2Var = this.d;
        if ((ez2Var != ez2.j && !ym2Var.r) || (ez2Var != ez2.t && ym2Var.r)) {
            H0();
            if (this.c && um2VarO != null) {
                um2VarO.U(false);
            }
        }
        if (um2VarO != null) {
            ym2 ym2Var2 = um2VarO.N;
            if (!this.c && ((qm2Var = ym2Var2.n) == qm2.a || qm2Var == qm2.m)) {
                if (this.b != Integer.MAX_VALUE) {
                    mc2.y("Place was called on a node which was placed already");
                }
                int i = ym2Var2.j;
                this.b = i;
                ym2Var2.j = i + 1;
            }
        } else {
            this.b = 0;
        }
        s();
    }

    public final void O0(long j) {
        ym2 ym2Var = this.w;
        ym2Var.n = qm2.t;
        ym2Var.v = false;
        this.G = j;
        um2 um2Var = ym2Var.g;
        sn3 snapshotObserver = ((ba) xm2.g(um2Var)).getSnapshotObserver();
        snapshotObserver.g.n(um2Var, snapshotObserver.y, this.H);
        ym2Var.x = true;
        ym2Var.l = true;
        boolean zH = y94.H(um2Var);
        s33 s33Var = ym2Var.b;
        if (zH) {
            s33Var.D = true;
            s33Var.E = true;
        } else {
            s33Var.C = true;
        }
        ym2Var.n = qm2.q;
    }

    @Override // defpackage.p33
    public final int P(int i) {
        L0();
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.P(i);
    }

    public final void P0(long j, xy1 xy1Var, x32 x32Var) throws Throwable {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        try {
            um2 um2VarO = um2Var.o();
            qm2 qm2Var = um2VarO != null ? um2VarO.N.n : null;
            qm2 qm2Var2 = qm2.m;
            if (qm2Var == qm2Var2) {
                ym2Var.r = false;
            }
            if (um2Var2.X) {
                mc2.g("place is called on a deactivated node");
            }
            ym2Var.n = qm2Var2;
            this.u = true;
            this.J = false;
            if (!je2.y(j, this.o)) {
                if (ym2Var.c || ym2Var.w) {
                    ym2Var.x = true;
                }
                I0();
            }
            pn3 pn3VarG = xm2.g(um2Var2);
            this.o = j;
            if (ym2Var.x || !F0()) {
                ym2Var.l(false);
                this.e.l = false;
                sn3 snapshotObserver = ((ba) pn3VarG).getSnapshotObserver();
                snapshotObserver.g.n(um2Var2, snapshotObserver.l, this.I);
            } else {
                bz2 bz2VarW0 = ym2Var.g().W0();
                bz2VarW0.getClass();
                bz2VarW0.R0(je2.n(j, bz2VarW0.q));
                N0();
            }
            this.f = xy1Var;
            this.k = x32Var;
            ym2Var.n = qm2.q;
        } catch (Throwable th) {
            um2Var.a0(th);
            throw null;
        }
    }

    @Override // defpackage.b7
    public final int Q() {
        return this.b;
    }

    public final boolean Q0(long j) {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        try {
            if (um2Var.X) {
                mc2.g("measure is called on a deactivated node");
            }
            um2 um2VarO = um2Var2.o();
            um2Var2.L = um2Var2.L || (um2VarO != null && um2VarO.L);
            if (!um2Var2.N.v) {
                ws0 ws0Var = this.h;
                if (ws0Var == null ? false : ws0.r(ws0Var.g, j)) {
                    pn3 pn3Var = um2Var2.h;
                    if (pn3Var != null) {
                        ((ba) pn3Var).q(um2Var2, true);
                    }
                    um2Var2.Z();
                    return false;
                }
            }
            this.h = new ws0(j);
            p0(j);
            this.e.x = false;
            rb3 rb3VarB = um2Var2.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                fz2 fz2Var = ((um2) objArr[i2]).N.s;
                fz2Var.getClass();
                fz2Var.e.r = false;
            }
            long j2 = this.z ? this.a : -9223372034707292160L;
            this.z = true;
            bz2 bz2VarW0 = ym2Var.g().W0();
            if (bz2VarW0 == null) {
                mc2.y("Lookahead result from lookaheadRemeasure cannot be null");
            }
            fz2 fz2Var2 = ym2Var.s;
            if (fz2Var2 != null) {
                fz2Var2.O0(j);
            }
            o0((((long) bz2VarW0.j) << 32) | (((long) bz2VarW0.t) & 4294967295L));
            return (((int) (j2 >> 32)) == bz2VarW0.j && ((int) (j2 & 4294967295L)) == bz2VarW0.t) ? false : true;
        } catch (Throwable th) {
            um2Var.a0(th);
            throw null;
        }
    }

    @Override // defpackage.b7
    public final void R() {
        um2.V(this.w.g, false, 7);
    }

    public final void R0() {
        um2 um2VarO;
        try {
            this.c = true;
            if (!this.u) {
                mc2.y("replace() called on item that was not placed");
            }
            this.J = false;
            boolean zF0 = F0();
            P0(this.o, this.f, this.k);
            if (zF0 && !this.J && (um2VarO = this.w.g.o()) != null) {
                um2VarO.U(false);
            }
        } finally {
            this.c = false;
        }
    }

    public final void S0() {
        this.B = true;
    }

    public final void T0() {
        this.s = sm2.a;
    }

    public final void U0() {
        this.b = Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final boolean V0() {
        Object obj = this.F;
        ym2 ym2Var = this.w;
        if (obj == null) {
            bz2 bz2VarW0 = ym2Var.g().W0();
            bz2VarW0.getClass();
            if (bz2VarW0.B.a() != null) {
                if (this.E) {
                    this.E = false;
                    bz2 bz2VarW1 = ym2Var.g().W0();
                    bz2VarW1.getClass();
                    this.F = bz2VarW1.B.a();
                    return true;
                }
            }
        } else if (this.E) {
            this.E = false;
            bz2 bz2VarW2 = ym2Var.g().W0();
            bz2VarW2.getClass();
            this.F = bz2VarW2.B.a();
            return true;
        }
        return false;
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        L0();
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.Y(i);
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        L0();
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.Z(i);
    }

    @Override // defpackage.us3, defpackage.p33
    public final Object a() {
        return this.F;
    }

    @Override // defpackage.b7
    public final b7 b() {
        ym2 ym2Var;
        um2 um2VarO = this.w.g.o();
        if (um2VarO == null || (ym2Var = um2VarO.N) == null) {
            return null;
        }
        return ym2Var.s;
    }

    @Override // defpackage.b7
    public final void c(z6 z6Var) {
        rb3 rb3VarB = this.w.g.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            fz2 fz2Var = ((um2) objArr[i2]).N.s;
            fz2Var.getClass();
            z6Var.a(fz2Var);
        }
    }

    @Override // defpackage.us3
    public final int c0(v6 v6Var) {
        ym2 ym2Var = this.w;
        um2 um2VarO = ym2Var.g.o();
        qm2 qm2Var = um2VarO != null ? um2VarO.N.n : null;
        qm2 qm2Var2 = qm2.t;
        vy2 vy2Var = this.e;
        if (qm2Var == qm2Var2) {
            vy2Var.r = true;
        } else {
            um2 um2VarO2 = ym2Var.g.o();
            if ((um2VarO2 != null ? um2VarO2.N.n : null) == qm2.m) {
                vy2Var.n = true;
            }
        }
        this.p = true;
        bz2 bz2VarW0 = ym2Var.g().W0();
        bz2VarW0.getClass();
        int iC0 = bz2VarW0.c0(v6Var);
        this.p = false;
        return iC0;
    }

    @Override // defpackage.us3
    public final int d0() {
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.d0();
    }

    @Override // defpackage.us3
    public final int g0() {
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.g0();
    }

    @Override // defpackage.b7
    public final sc2 i() {
        return this.w.g.M.r;
    }

    @Override // defpackage.us3
    public final void l0(long j, float f, xy1 xy1Var) throws Throwable {
        P0(j, xy1Var, null);
    }

    @Override // defpackage.us3
    public final void m0(long j, float f, x32 x32Var) throws Throwable {
        P0(j, null, x32Var);
    }

    @Override // defpackage.d83
    public final void q(boolean z) {
        bz2 bz2VarW0;
        ym2 ym2Var = this.w;
        bz2 bz2VarW1 = ym2Var.g().W0();
        if (Boolean.valueOf(z).equals(bz2VarW1 != null ? Boolean.valueOf(bz2VarW1.u) : null) || (bz2VarW0 = ym2Var.g().W0()) == null) {
            return;
        }
        bz2VarW0.u = z;
    }

    @Override // defpackage.b7
    public final a7 r() {
        return this.e;
    }

    @Override // defpackage.b7
    public final void requestLayout() {
        this.w.g.U(false);
    }

    @Override // defpackage.b7
    public final void s() {
        this.C = true;
        vy2 vy2Var = this.e;
        vy2Var.t();
        ym2 ym2Var = this.w;
        boolean z = ym2Var.x;
        um2 um2Var = ym2Var.g;
        if (z) {
            rb3 rb3VarB = um2Var.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                um2 um2Var2 = (um2) objArr[i2];
                ym2 ym2Var2 = um2Var2.N;
                if (ym2Var2.v && um2Var2.z() == sm2.j) {
                    fz2 fz2Var = ym2Var2.s;
                    fz2Var.getClass();
                    fz2 fz2Var2 = ym2Var2.s;
                    ws0 ws0VarU0 = fz2Var2 != null ? fz2Var2.u0() : null;
                    ws0VarU0.getClass();
                    if (fz2Var.Q0(ws0VarU0.g)) {
                        um2.V(um2Var, false, 7);
                    }
                }
            }
        }
        rc2 rc2Var = i().k0;
        rc2Var.getClass();
        if (ym2Var.l || (!this.p && !rc2Var.o && ym2Var.x)) {
            ym2Var.x = false;
            qm2 qm2Var = ym2Var.n;
            ym2Var.n = qm2.m;
            ym2Var.j(false);
            sn3 snapshotObserver = ((ba) xm2.g(um2Var)).getSnapshotObserver();
            snapshotObserver.g.n(um2Var, snapshotObserver.j, this.D);
            ym2Var.n = qm2Var;
            if (ym2Var.w && rc2Var.o) {
                requestLayout();
            }
            ym2Var.l = false;
        }
        if (vy2Var.n) {
            vy2Var.v = true;
        }
        if (vy2Var.y && vy2Var.x()) {
            vy2Var.j();
        }
        this.C = false;
    }

    public final List t0() {
        ym2 ym2Var = this.w;
        ym2Var.g.i();
        boolean z = this.B;
        rb3 rb3Var = this.A;
        if (!z) {
            return rb3Var.l();
        }
        um2 um2Var = ym2Var.g;
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            if (rb3Var.a <= i2) {
                fz2 fz2Var = um2Var2.N.s;
                fz2Var.getClass();
                rb3Var.y(fz2Var);
            } else {
                fz2 fz2Var2 = um2Var2.N.s;
                fz2Var2.getClass();
                Object[] objArr2 = rb3Var.j;
                Object obj = objArr2[i2];
                objArr2[i2] = fz2Var2;
            }
        }
        rb3Var.c(((qb3) um2Var.i()).j.a, rb3Var.a);
        this.B = false;
        return rb3Var.l();
    }

    public final ws0 u0() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.p33
    public final us3 v(long j) {
        sm2 sm2Var;
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        um2 um2VarO = um2Var.o();
        if ((um2VarO != null ? um2VarO.N.n : null) == qm2.t) {
            ym2Var.y = false;
        } else {
            um2 um2VarO2 = um2Var2.o();
            if ((um2VarO2 != null ? um2VarO2.N.n : null) == qm2.m) {
                ym2Var.y = false;
            }
        }
        um2 um2VarO3 = um2Var2.o();
        sm2 sm2Var2 = sm2.a;
        if (um2VarO3 != null) {
            ym2 ym2Var2 = um2VarO3.N;
            if (this.s != sm2Var2 && !um2Var2.L) {
                mc2.y("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ym2Var2.n.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                sm2Var = sm2.j;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    t94.n(ym2Var2.n, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sm2Var = sm2.t;
            }
            this.s = sm2Var;
        } else {
            this.s = sm2Var2;
        }
        if (um2Var2.J == sm2Var2) {
            um2Var2.r();
        }
        Q0(j);
        return this;
    }

    public final boolean v0() {
        return this.C;
    }

    public final sm2 w0() {
        return this.s;
    }

    @Override // defpackage.p33
    public final int x(int i) {
        L0();
        bz2 bz2VarW0 = this.w.g().W0();
        bz2VarW0.getClass();
        return bz2VarW0.x(i);
    }

    public final boolean x0() {
        ym2 ym2Var = this.w;
        return y94.H(ym2Var.g) || ym2Var.r;
    }

    public final boolean z0() {
        return this.u;
    }
}
