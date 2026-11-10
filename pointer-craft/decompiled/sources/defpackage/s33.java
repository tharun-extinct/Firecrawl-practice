package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s33 extends us3 implements p33, b7, d83 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean I;
    public final r33 K;
    public final r33 L;
    public float M;
    public boolean N;
    public xy1 O;
    public x32 P;
    public float R;
    public final r33 S;
    public boolean T;
    public boolean c;
    public Object e;
    public x32 f;
    public float k;
    public xy1 o;
    public boolean p;
    public boolean s;
    public final ym2 w;
    public boolean z;
    public int i = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public sm2 u = sm2.a;
    public long h = 0;
    public boolean d = true;
    public final vm2 F = new vm2(this);
    public final rb3 G = new rb3(new s33[16]);
    public boolean H = true;
    public long J = zs0.y(0, 0, 0, 0, 15);
    public long Q = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [r33] */
    /* JADX WARN: Type inference failed for: r2v4, types: [r33] */
    /* JADX WARN: Type inference failed for: r7v4, types: [r33] */
    public s33(ym2 ym2Var) {
        this.w = ym2Var;
        final byte b = 1;
        final byte b2 = 0;
        this.K = new my1(this) { // from class: r33
            public final /* synthetic */ s33 t;

            {
                this.t = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x0112  */
            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                byte b3 = b2;
                xa3 xa3Var = null;
                og5 og5Var = og5.g;
                s33 s33Var = this.t;
                switch (b3) {
                    case 0:
                        s33Var.w.g().v(s33Var.J);
                        break;
                    case 1:
                        ym2 ym2Var2 = s33Var.w;
                        ym2Var2.t = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            s33 s33Var2 = ((um2) objArr[i2]).N.b;
                            s33Var2.i = s33Var2.b;
                            s33Var2.b = Integer.MAX_VALUE;
                            s33Var2.B = false;
                            if (s33Var2.u == sm2.t) {
                                s33Var2.u = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((um2) objArr2[i4]).N.b.F.n = false;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            if (um2Var2.M.n.o) {
                                if (xa3Var == null) {
                                    xa3Var = new xa3();
                                }
                                xa3Var.g(um2Var2);
                            }
                            um2Var2.M.n.o = s33Var.i().o;
                        }
                        s33Var.i().F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        for (int i8 = 0; i8 < i7; i8++) {
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            if (xa3Var != null) {
                                z = true;
                                if (!xa3Var.v(um2Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            um2Var3.M.n.o = z;
                        }
                        rb3 rb3VarB3 = um2Var.B();
                        Object[] objArr3 = rb3VarB3.j;
                        int i9 = rb3VarB3.a;
                        for (int i10 = 0; i10 < i9; i10++) {
                            um2 um2Var4 = (um2) objArr3[i10];
                            ym2 ym2Var3 = um2Var4.N;
                            if (ym2Var3.b.i != um2Var4.f()) {
                                um2Var.Q();
                                um2Var.E();
                                if (um2Var4.f() == Integer.MAX_VALUE) {
                                    if (ym2Var3.r || y94.H(um2Var4)) {
                                        fz2 fz2Var = ym2Var3.s;
                                        fz2Var.getClass();
                                        fz2Var.G0(false);
                                    }
                                    ym2Var3.b.v0();
                                }
                            }
                        }
                        rb3 rb3VarB4 = um2Var.B();
                        Object[] objArr4 = rb3VarB4.j;
                        int i11 = rb3VarB4.a;
                        for (int i12 = 0; i12 < i11; i12++) {
                            vm2 vm2Var = ((um2) objArr4[i12]).N.b.F;
                            vm2Var.v = vm2Var.n;
                        }
                        break;
                    default:
                        ym2 ym2Var4 = s33Var.w;
                        gh3 gh3Var = ym2Var4.g().D;
                        ts3 placementScope = gh3Var != null ? gh3Var.f : ((ba) xm2.g(ym2Var4.g)).getPlacementScope();
                        xy1 xy1Var = s33Var.O;
                        x32 x32Var = s33Var.P;
                        if (x32Var != null) {
                            gh3 gh3VarG = ym2Var4.g();
                            long j = s33Var.Q;
                            float f = s33Var.R;
                            placementScope.x(gh3VarG);
                            gh3VarG.m0(je2.n(j, gh3VarG.q), f, x32Var);
                        } else if (xy1Var == null) {
                            gh3 gh3VarG2 = ym2Var4.g();
                            long j2 = s33Var.Q;
                            float f2 = s33Var.R;
                            placementScope.x(gh3VarG2);
                            gh3VarG2.l0(je2.n(j2, gh3VarG2.q), f2, null);
                        } else {
                            gh3 gh3VarG3 = ym2Var4.g();
                            long j3 = s33Var.Q;
                            float f3 = s33Var.R;
                            placementScope.x(gh3VarG3);
                            gh3VarG3.l0(je2.n(j3, gh3VarG3.q), f3, xy1Var);
                        }
                        break;
                }
                return og5Var;
            }
        };
        this.L = new my1(this) { // from class: r33
            public final /* synthetic */ s33 t;

            {
                this.t = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x0112  */
            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                byte b3 = b;
                xa3 xa3Var = null;
                og5 og5Var = og5.g;
                s33 s33Var = this.t;
                switch (b3) {
                    case 0:
                        s33Var.w.g().v(s33Var.J);
                        break;
                    case 1:
                        ym2 ym2Var2 = s33Var.w;
                        ym2Var2.t = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            s33 s33Var2 = ((um2) objArr[i2]).N.b;
                            s33Var2.i = s33Var2.b;
                            s33Var2.b = Integer.MAX_VALUE;
                            s33Var2.B = false;
                            if (s33Var2.u == sm2.t) {
                                s33Var2.u = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((um2) objArr2[i4]).N.b.F.n = false;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            if (um2Var2.M.n.o) {
                                if (xa3Var == null) {
                                    xa3Var = new xa3();
                                }
                                xa3Var.g(um2Var2);
                            }
                            um2Var2.M.n.o = s33Var.i().o;
                        }
                        s33Var.i().F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        for (int i8 = 0; i8 < i7; i8++) {
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            if (xa3Var != null) {
                                z = true;
                                if (!xa3Var.v(um2Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            um2Var3.M.n.o = z;
                        }
                        rb3 rb3VarB3 = um2Var.B();
                        Object[] objArr3 = rb3VarB3.j;
                        int i9 = rb3VarB3.a;
                        for (int i10 = 0; i10 < i9; i10++) {
                            um2 um2Var4 = (um2) objArr3[i10];
                            ym2 ym2Var3 = um2Var4.N;
                            if (ym2Var3.b.i != um2Var4.f()) {
                                um2Var.Q();
                                um2Var.E();
                                if (um2Var4.f() == Integer.MAX_VALUE) {
                                    if (ym2Var3.r || y94.H(um2Var4)) {
                                        fz2 fz2Var = ym2Var3.s;
                                        fz2Var.getClass();
                                        fz2Var.G0(false);
                                    }
                                    ym2Var3.b.v0();
                                }
                            }
                        }
                        rb3 rb3VarB4 = um2Var.B();
                        Object[] objArr4 = rb3VarB4.j;
                        int i11 = rb3VarB4.a;
                        for (int i12 = 0; i12 < i11; i12++) {
                            vm2 vm2Var = ((um2) objArr4[i12]).N.b.F;
                            vm2Var.v = vm2Var.n;
                        }
                        break;
                    default:
                        ym2 ym2Var4 = s33Var.w;
                        gh3 gh3Var = ym2Var4.g().D;
                        ts3 placementScope = gh3Var != null ? gh3Var.f : ((ba) xm2.g(ym2Var4.g)).getPlacementScope();
                        xy1 xy1Var = s33Var.O;
                        x32 x32Var = s33Var.P;
                        if (x32Var != null) {
                            gh3 gh3VarG = ym2Var4.g();
                            long j = s33Var.Q;
                            float f = s33Var.R;
                            placementScope.x(gh3VarG);
                            gh3VarG.m0(je2.n(j, gh3VarG.q), f, x32Var);
                        } else if (xy1Var == null) {
                            gh3 gh3VarG2 = ym2Var4.g();
                            long j2 = s33Var.Q;
                            float f2 = s33Var.R;
                            placementScope.x(gh3VarG2);
                            gh3VarG2.l0(je2.n(j2, gh3VarG2.q), f2, null);
                        } else {
                            gh3 gh3VarG3 = ym2Var4.g();
                            long j3 = s33Var.Q;
                            float f3 = s33Var.R;
                            placementScope.x(gh3VarG3);
                            gh3VarG3.l0(je2.n(j3, gh3VarG3.q), f3, xy1Var);
                        }
                        break;
                }
                return og5Var;
            }
        };
        final byte b3 = 2;
        this.S = new my1(this) { // from class: r33
            public final /* synthetic */ s33 t;

            {
                this.t = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x0112  */
            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                byte b4 = b3;
                xa3 xa3Var = null;
                og5 og5Var = og5.g;
                s33 s33Var = this.t;
                switch (b4) {
                    case 0:
                        s33Var.w.g().v(s33Var.J);
                        break;
                    case 1:
                        ym2 ym2Var2 = s33Var.w;
                        ym2Var2.t = 0;
                        um2 um2Var = ym2Var2.g;
                        rb3 rb3VarB = um2Var.B();
                        Object[] objArr = rb3VarB.j;
                        int i = rb3VarB.a;
                        for (int i2 = 0; i2 < i; i2++) {
                            s33 s33Var2 = ((um2) objArr[i2]).N.b;
                            s33Var2.i = s33Var2.b;
                            s33Var2.b = Integer.MAX_VALUE;
                            s33Var2.B = false;
                            if (s33Var2.u == sm2.t) {
                                s33Var2.u = sm2.a;
                            }
                        }
                        rb3 rb3VarB2 = um2Var.B();
                        Object[] objArr2 = rb3VarB2.j;
                        int i3 = rb3VarB2.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((um2) objArr2[i4]).N.b.F.n = false;
                        }
                        qb3 qb3Var = (qb3) um2Var.i();
                        int i5 = qb3Var.j.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            um2 um2Var2 = (um2) qb3Var.get(i6);
                            if (um2Var2.M.n.o) {
                                if (xa3Var == null) {
                                    xa3Var = new xa3();
                                }
                                xa3Var.g(um2Var2);
                            }
                            um2Var2.M.n.o = s33Var.i().o;
                        }
                        s33Var.i().F0().n();
                        qb3 qb3Var2 = (qb3) um2Var.i();
                        int i7 = qb3Var2.j.a;
                        for (int i8 = 0; i8 < i7; i8++) {
                            um2 um2Var3 = (um2) qb3Var2.get(i8);
                            if (xa3Var != null) {
                                z = true;
                                if (!xa3Var.v(um2Var3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            um2Var3.M.n.o = z;
                        }
                        rb3 rb3VarB3 = um2Var.B();
                        Object[] objArr3 = rb3VarB3.j;
                        int i9 = rb3VarB3.a;
                        for (int i10 = 0; i10 < i9; i10++) {
                            um2 um2Var4 = (um2) objArr3[i10];
                            ym2 ym2Var3 = um2Var4.N;
                            if (ym2Var3.b.i != um2Var4.f()) {
                                um2Var.Q();
                                um2Var.E();
                                if (um2Var4.f() == Integer.MAX_VALUE) {
                                    if (ym2Var3.r || y94.H(um2Var4)) {
                                        fz2 fz2Var = ym2Var3.s;
                                        fz2Var.getClass();
                                        fz2Var.G0(false);
                                    }
                                    ym2Var3.b.v0();
                                }
                            }
                        }
                        rb3 rb3VarB4 = um2Var.B();
                        Object[] objArr4 = rb3VarB4.j;
                        int i11 = rb3VarB4.a;
                        for (int i12 = 0; i12 < i11; i12++) {
                            vm2 vm2Var = ((um2) objArr4[i12]).N.b.F;
                            vm2Var.v = vm2Var.n;
                        }
                        break;
                    default:
                        ym2 ym2Var4 = s33Var.w;
                        gh3 gh3Var = ym2Var4.g().D;
                        ts3 placementScope = gh3Var != null ? gh3Var.f : ((ba) xm2.g(ym2Var4.g)).getPlacementScope();
                        xy1 xy1Var = s33Var.O;
                        x32 x32Var = s33Var.P;
                        if (x32Var != null) {
                            gh3 gh3VarG = ym2Var4.g();
                            long j = s33Var.Q;
                            float f = s33Var.R;
                            placementScope.x(gh3VarG);
                            gh3VarG.m0(je2.n(j, gh3VarG.q), f, x32Var);
                        } else if (xy1Var == null) {
                            gh3 gh3VarG2 = ym2Var4.g();
                            long j2 = s33Var.Q;
                            float f2 = s33Var.R;
                            placementScope.x(gh3VarG2);
                            gh3VarG2.l0(je2.n(j2, gh3VarG2.q), f2, null);
                        } else {
                            gh3 gh3VarG3 = ym2Var4.g();
                            long j3 = s33Var.Q;
                            float f3 = s33Var.R;
                            placementScope.x(gh3VarG3);
                            gh3VarG3.l0(je2.n(j3, gh3VarG3.q), f3, xy1Var);
                        }
                        break;
                }
                return og5Var;
            }
        };
    }

    public final void A0(long j, float f, xy1 xy1Var, x32 x32Var) throws Throwable {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        try {
            this.B = true;
            if (!je2.y(j, this.h) || xy1Var != this.o || this.T) {
                if (ym2Var.m || ym2Var.a || this.T) {
                    this.D = true;
                    this.T = false;
                }
            }
            fz2 fz2Var = ym2Var.s;
            if (fz2Var != null) {
                fz2Var.J0();
            }
            fz2 fz2Var2 = ym2Var.s;
            if (fz2Var2 != null && fz2Var2.x0()) {
                gh3 gh3Var = ym2Var.g().D;
                ts3 placementScope = gh3Var != null ? gh3Var.f : ((ba) xm2.g(um2Var2)).getPlacementScope();
                fz2 fz2Var3 = ym2Var.s;
                fz2Var3.getClass();
                um2 um2VarO = um2Var2.o();
                if (um2VarO != null) {
                    um2VarO.N.j = 0;
                }
                fz2Var3.U0();
                placementScope.j(fz2Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            fz2 fz2Var4 = ym2Var.s;
            if (fz2Var4 != null && !fz2Var4.z0()) {
                mc2.y("Error: Placement happened before lookahead.");
            }
            z0(j, f, xy1Var, x32Var);
        } catch (Throwable th) {
            um2Var.a0(th);
            throw null;
        }
    }

    public final boolean E0(long j) {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        try {
            if (um2Var.X) {
                mc2.g("measure is called on a deactivated node");
            }
            pn3 pn3VarG = xm2.g(um2Var2);
            um2 um2VarO = um2Var2.o();
            boolean z = true;
            um2Var2.L = um2Var2.L || (um2VarO != null && um2VarO.L);
            if (!um2Var2.p() && ws0.r(this.m, j)) {
                ((ba) pn3VarG).q(um2Var2, false);
                um2Var2.Z();
                return false;
            }
            this.F.x = false;
            rb3 rb3VarB = um2Var2.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((um2) objArr[i2]).N.b.F.r = false;
            }
            this.s = true;
            long j2 = ym2Var.g().a;
            p0(j);
            qm2 qm2Var = ym2Var.n;
            qm2 qm2Var2 = qm2.q;
            if (qm2Var != qm2Var2) {
                mc2.y("layout state is not idle before measure starts");
            }
            this.J = j;
            qm2 qm2Var3 = qm2.j;
            ym2Var.n = qm2Var3;
            this.C = false;
            sn3 snapshotObserver = ((ba) xm2.g(um2Var2)).getSnapshotObserver();
            snapshotObserver.g.n(um2Var2, snapshotObserver.r, this.K);
            if (ym2Var.n == qm2Var3) {
                this.D = true;
                this.E = true;
                ym2Var.n = qm2Var2;
            }
            if (qe2.g(ym2Var.g().a, j2) && ym2Var.g().j == this.j && ym2Var.g().t == this.t) {
                z = false;
            }
            o0((((long) ym2Var.g().t) & 4294967295L) | (((long) ym2Var.g().j) << 32));
            return z;
        } catch (Throwable th) {
            um2Var.a0(th);
            throw null;
        }
    }

    public final void F0() {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        if (!um2Var.K() || ym2Var.q <= 0) {
            return;
        }
        ym2 ym2Var2 = um2Var2.N;
        if ((ym2Var2.a || ym2Var2.m) && !ym2Var2.b.D) {
            um2Var2.W(false);
        }
        rb3 rb3VarB = um2Var2.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            ((um2) objArr[i2]).N.b.F0();
        }
    }

    @Override // defpackage.p33
    public final int P(int i) {
        ym2 ym2Var = this.w;
        if (!y94.H(ym2Var.g)) {
            w0();
            return ym2Var.g().P(i);
        }
        fz2 fz2Var = ym2Var.s;
        fz2Var.getClass();
        return fz2Var.P(i);
    }

    @Override // defpackage.b7
    public final int Q() {
        return this.b;
    }

    @Override // defpackage.b7
    public final void R() {
        um2.X(this.w.g, false, 7);
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        ym2 ym2Var = this.w;
        if (!y94.H(ym2Var.g)) {
            w0();
            return ym2Var.g().Y(i);
        }
        fz2 fz2Var = ym2Var.s;
        fz2Var.getClass();
        return fz2Var.Y(i);
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        ym2 ym2Var = this.w;
        if (!y94.H(ym2Var.g)) {
            w0();
            return ym2Var.g().Z(i);
        }
        fz2 fz2Var = ym2Var.s;
        fz2Var.getClass();
        return fz2Var.Z(i);
    }

    @Override // defpackage.us3, defpackage.p33
    public final Object a() {
        return this.e;
    }

    @Override // defpackage.b7
    public final b7 b() {
        ym2 ym2Var;
        um2 um2VarO = this.w.g.o();
        if (um2VarO == null || (ym2Var = um2VarO.N) == null) {
            return null;
        }
        return ym2Var.b;
    }

    @Override // defpackage.b7
    public final void c(z6 z6Var) {
        rb3 rb3VarB = this.w.g.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            z6Var.a(((um2) objArr[i2]).N.b);
        }
    }

    @Override // defpackage.us3
    public final int c0(v6 v6Var) {
        ym2 ym2Var = this.w;
        um2 um2VarO = ym2Var.g.o();
        qm2 qm2Var = um2VarO != null ? um2VarO.N.n : null;
        qm2 qm2Var2 = qm2.j;
        vm2 vm2Var = this.F;
        if (qm2Var == qm2Var2) {
            vm2Var.r = true;
        } else {
            um2 um2VarO2 = ym2Var.g.o();
            if ((um2VarO2 != null ? um2VarO2.N.n : null) == qm2.a) {
                vm2Var.n = true;
            }
        }
        this.z = true;
        int iC0 = ym2Var.g().c0(v6Var);
        this.z = false;
        return iC0;
    }

    @Override // defpackage.us3
    public final int d0() {
        return this.w.g().d0();
    }

    @Override // defpackage.us3
    public final int g0() {
        return this.w.g().g0();
    }

    @Override // defpackage.b7
    public final sc2 i() {
        return this.w.g.M.r;
    }

    @Override // defpackage.us3
    public final void l0(long j, float f, xy1 xy1Var) throws Throwable {
        A0(j, f, xy1Var, null);
    }

    @Override // defpackage.us3
    public final void m0(long j, float f, x32 x32Var) throws Throwable {
        A0(j, f, null, x32Var);
    }

    @Override // defpackage.d83
    public final void q(boolean z) {
        ym2 ym2Var = this.w;
        if (z != ym2Var.g().u) {
            ym2Var.g().u = z;
            this.T = true;
        }
    }

    @Override // defpackage.b7
    public final a7 r() {
        return this.F;
    }

    @Override // defpackage.b7
    public final void requestLayout() {
        this.w.g.W(false);
    }

    @Override // defpackage.b7
    public final void s() {
        boolean zE0;
        this.I = true;
        vm2 vm2Var = this.F;
        vm2Var.t();
        boolean z = this.D;
        ym2 ym2Var = this.w;
        if (z) {
            rb3 rb3VarB = ym2Var.g.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                um2 um2Var = (um2) objArr[i2];
                boolean zP = um2Var.p();
                ym2 ym2Var2 = um2Var.N;
                if (zP && um2Var.u() == sm2.j) {
                    s33 s33Var = ym2Var2.b;
                    ws0 ws0Var = s33Var.s ? new ws0(s33Var.m) : null;
                    if (ws0Var != null) {
                        if (um2Var.J == sm2.a) {
                            um2Var.r();
                        }
                        zE0 = ym2Var2.b.E0(ws0Var.g);
                    } else {
                        zE0 = false;
                    }
                    if (zE0) {
                        um2.X(ym2Var.g, false, 7);
                    }
                }
            }
        }
        if (this.E || (!this.z && !i().o && this.D)) {
            this.D = false;
            qm2 qm2Var = ym2Var.n;
            ym2Var.n = qm2.a;
            ym2Var.x(false);
            um2 um2Var2 = ym2Var.g;
            sn3 snapshotObserver = ((ba) xm2.g(um2Var2)).getSnapshotObserver();
            snapshotObserver.g.n(um2Var2, snapshotObserver.v, this.L);
            ym2Var.n = qm2Var;
            this.E = false;
        }
        if (vm2Var.n) {
            vm2Var.v = true;
        }
        if (vm2Var.y && vm2Var.x()) {
            vm2Var.j();
        }
        this.I = false;
    }

    public final List t0() {
        ym2 ym2Var = this.w;
        ym2Var.g.h0();
        boolean z = this.H;
        rb3 rb3Var = this.G;
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
                rb3Var.y(um2Var2.N.b);
            } else {
                s33 s33Var = um2Var2.N.b;
                Object[] objArr2 = rb3Var.j;
                Object obj = objArr2[i2];
                objArr2[i2] = s33Var;
            }
        }
        rb3Var.c(((qb3) um2Var.i()).j.a, rb3Var.a);
        this.H = false;
        return rb3Var.l();
    }

    public final void u0() {
        boolean z = this.A;
        this.A = true;
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        ah3 ah3Var = um2Var.M;
        if (!z) {
            ah3Var.r.k1();
            ((ba) xm2.g(um2Var)).getRectManager().l(ym2Var.g);
            if (um2Var.p()) {
                um2.X(um2Var, true, 6);
            } else if (um2Var.N.v) {
                um2.V(um2Var, true, 6);
            }
        }
        gh3 gh3Var = ah3Var.r.C;
        for (gh3 gh3Var2 = ah3Var.n; !yf2.p(gh3Var2, gh3Var) && gh3Var2 != null; gh3Var2 = gh3Var2.C) {
            if (gh3Var2.Z) {
                gh3Var2.g1();
            }
        }
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            if (um2Var2.f() != Integer.MAX_VALUE) {
                um2Var2.N.b.u0();
                um2.Y(um2Var2);
            }
        }
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        sm2 sm2Var;
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        sm2 sm2Var2 = um2Var.J;
        sm2 sm2Var3 = sm2.a;
        if (sm2Var2 == sm2Var3) {
            um2Var.r();
        }
        if (y94.H(um2Var2)) {
            fz2 fz2Var = ym2Var.s;
            fz2Var.getClass();
            fz2Var.T0();
            fz2Var.v(j);
        }
        um2 um2VarO = um2Var2.o();
        if (um2VarO != null) {
            ym2 ym2Var2 = um2VarO.N;
            if (this.u != sm2Var3 && !um2Var2.L) {
                mc2.y("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ym2Var2.n.ordinal();
            if (iOrdinal == 0) {
                sm2Var = sm2.j;
            } else {
                if (iOrdinal != 2) {
                    t94.n(ym2Var2.n, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sm2Var = sm2.t;
            }
            this.u = sm2Var;
        } else {
            this.u = sm2Var3;
        }
        E0(j);
        return this;
    }

    public final void v0() {
        if (this.A) {
            this.A = false;
            ym2 ym2Var = this.w;
            um2 um2Var = ym2Var.g;
            um2 um2Var2 = ym2Var.g;
            ((ba) xm2.g(um2Var)).getRectManager().j(um2Var2);
            ah3 ah3Var = um2Var2.M;
            gh3 gh3Var = ah3Var.r.C;
            for (gh3 gh3Var2 = ah3Var.n; !yf2.p(gh3Var2, gh3Var) && gh3Var2 != null; gh3Var2 = gh3Var2.C) {
                gh3Var2.m1();
                gh3Var2.r1();
            }
            rb3 rb3VarB = um2Var2.B();
            Object[] objArr = rb3VarB.j;
            int i = rb3VarB.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((um2) objArr[i2]).N.b.v0();
            }
        }
    }

    public final void w0() {
        sm2 sm2Var;
        ym2 ym2Var = this.w;
        um2.X(ym2Var.g, false, 7);
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

    @Override // defpackage.p33
    public final int x(int i) {
        ym2 ym2Var = this.w;
        if (!y94.H(ym2Var.g)) {
            w0();
            return ym2Var.g().x(i);
        }
        fz2 fz2Var = ym2Var.s;
        fz2Var.getClass();
        return fz2Var.x(i);
    }

    public final void x0() {
        this.N = true;
        ym2 ym2Var = this.w;
        um2 um2VarO = ym2Var.g.o();
        float f = i().N;
        um2 um2Var = ym2Var.g;
        ah3 ah3Var = um2Var.M;
        gh3 gh3Var = ah3Var.n;
        sc2 sc2Var = ah3Var.r;
        while (gh3Var != sc2Var) {
            gh3Var.getClass();
            nm2 nm2Var = (nm2) gh3Var;
            f += nm2Var.N;
            gh3Var = nm2Var.C;
        }
        if (f != this.M) {
            this.M = f;
            if (um2VarO != null) {
                um2VarO.Q();
            }
            if (um2VarO != null) {
                um2VarO.E();
            }
        }
        if (!i().o) {
            boolean z = this.A;
            if (!z || this.F.v()) {
                u0();
            }
            if (z) {
                um2Var.M.r.k1();
            } else {
                if (um2VarO != null) {
                    um2VarO.E();
                }
                if (this.c && um2VarO != null) {
                    um2VarO.W(false);
                }
            }
        }
        if (um2VarO != null) {
            ym2 ym2Var2 = um2VarO.N;
            if (!this.c && ym2Var2.n == qm2.a) {
                if (this.b != Integer.MAX_VALUE) {
                    mc2.y("Place was called on a node which was placed already");
                }
                int i = ym2Var2.t;
                this.b = i;
                ym2Var2.t = i + 1;
            }
        } else {
            this.b = 0;
        }
        s();
    }

    public final void z0(long j, float f, xy1 xy1Var, x32 x32Var) {
        ym2 ym2Var = this.w;
        um2 um2Var = ym2Var.g;
        um2 um2Var2 = ym2Var.g;
        if (um2Var.X) {
            mc2.g("place is called on a deactivated node");
        }
        ym2Var.n = qm2.a;
        this.h = j;
        this.k = f;
        this.o = xy1Var;
        this.f = x32Var;
        this.N = false;
        pn3 pn3VarG = xm2.g(um2Var2);
        if (this.D || !this.A) {
            this.F.l = false;
            ym2Var.v(false);
            this.O = xy1Var;
            this.Q = j;
            this.R = f;
            this.P = x32Var;
            sn3 snapshotObserver = ((ba) pn3VarG).getSnapshotObserver();
            snapshotObserver.g.n(um2Var2, snapshotObserver.x, this.S);
        } else {
            gh3 gh3VarG = ym2Var.g();
            gh3VarG.p1(je2.n(j, gh3VarG.q), f, xy1Var, x32Var);
            x0();
        }
        ym2Var.n = qm2.q;
        if (ym2Var.g().o && (ym2Var.m || ym2Var.a)) {
            requestLayout();
        }
        this.p = true;
    }
}
