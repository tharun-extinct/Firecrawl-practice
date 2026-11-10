package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h02 {
    public int A;
    public int B;
    public boolean C;
    public final g02 D;
    public final ArrayList E;
    public boolean F;
    public lr4 G;
    public mr4 H;
    public pr4 I;
    public boolean J;
    public tr3 K;
    public vc0 L;
    public final po0 M;
    public c02 N;
    public qp1 O;
    public lp4 P;
    public final wo0 Q;
    public final fx0 R;
    public boolean S;
    public long T;
    public i02 U;
    public k02 a;
    public fa3 b;
    public boolean d;
    public boolean f;
    public final t g;
    public int[] i;
    public final yo0 j;
    public final y22 l;
    public int m;
    public final lb3 n;
    public ha3 o;
    public boolean p;
    public int q;
    public final mr4 r;
    public boolean s;
    public final vc0 v;
    public int w;
    public final vc0 x;
    public final to0 y;
    public final ArrayList t = new ArrayList();
    public final re2 c = new re2();
    public final ArrayList u = new ArrayList();
    public final re2 z = new re2();
    public tr3 h = tr3.m;
    public final re2 k = new re2();
    public int e = -1;

    public h02(t tVar, to0 to0Var, mr4 mr4Var, lb3 lb3Var, vc0 vc0Var, vc0 vc0Var2, y22 y22Var, yo0 yo0Var) {
        this.g = tVar;
        this.y = to0Var;
        this.r = mr4Var;
        this.n = lb3Var;
        this.v = vc0Var;
        this.x = vc0Var2;
        this.l = y22Var;
        this.j = yo0Var;
        this.C = to0Var.x() || to0Var.n();
        this.D = new g02(this, (byte) 0);
        this.E = new ArrayList();
        lr4 lr4VarN = mr4Var.n();
        lr4VarN.r();
        this.G = lr4VarN;
        mr4 mr4Var2 = new mr4();
        if (to0Var.x()) {
            mr4Var2.y();
        }
        if (to0Var.n()) {
            mr4Var2.p = new ha3();
        }
        this.H = mr4Var2;
        pr4 pr4VarV = mr4Var2.v();
        pr4VarV.v(true);
        this.I = pr4VarV;
        this.M = new po0(this, vc0Var);
        lr4 lr4VarN2 = this.H.n();
        try {
            c02 c02VarG = lr4VarN2.g(0);
            lr4VarN2.r();
            this.N = c02VarG;
            this.O = new qp1();
            this.Q = new wo0(this);
            fx0 fx0VarA = to0Var.a();
            fx0 fx0VarD = d();
            this.R = fx0VarA.b(fx0VarD == null ? ni1.j : fx0VarD);
        } catch (Throwable th) {
            lr4VarN2.r();
            throw th;
        }
    }

    public static final int M(h02 h02Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        lr4 lr4Var;
        lr4 lr4Var2 = h02Var.G;
        int i6 = 0;
        if (lr4Var2.a(i)) {
            int iT = lr4Var2.t(i);
            Object objB = lr4Var2.b(lr4Var2.y, i);
            if (iT == 206 && yf2.p(objB, qo0.v)) {
                Object objJ = lr4Var2.j(i, 0);
                l02 l02Var = objJ instanceof l02 ? (l02) objJ : null;
                j64 j64Var = l02Var != null ? l02Var.g : null;
                e02 e02Var = j64Var instanceof e02 ? (e02) j64Var : null;
                if (e02Var != null) {
                    ib3 ib3Var = e02Var.j.v;
                    Object[] objArr = ib3Var.y;
                    long[] jArr2 = ib3Var.g;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr2[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i6;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        h02 h02Var2 = (h02) objArr[(i7 << 3) + i10];
                                        mr4 mr4Var = h02Var2.r;
                                        if (mr4Var.t <= 0 || (mr4Var.j[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            yo0 yo0Var = h02Var2.j;
                                            synchronized (yo0Var.m) {
                                                yo0Var.b();
                                                hb3 hb3Var = yo0Var.h;
                                                yo0Var.h = xq2.a();
                                                try {
                                                    yo0Var.C.e0(hb3Var);
                                                } catch (Throwable th) {
                                                    yo0Var.h = hb3Var;
                                                    throw th;
                                                }
                                            }
                                            vc0 vc0Var = new vc0();
                                            h02Var2.L = vc0Var;
                                            lr4 lr4VarN = h02Var2.r.n();
                                            try {
                                                h02Var2.G = lr4VarN;
                                                po0 po0Var = h02Var2.M;
                                                vc0 vc0Var2 = po0Var.y;
                                                try {
                                                    po0Var.y = vc0Var;
                                                    h02Var2.L(0);
                                                    po0 po0Var2 = h02Var2.M;
                                                    po0Var2.y();
                                                    try {
                                                        if (po0Var2.r) {
                                                            lr4Var = lr4VarN;
                                                            try {
                                                                po0Var2.y.C.N(rl3.r);
                                                                if (po0Var2.r) {
                                                                    po0Var2.n(false);
                                                                    po0Var2.n(false);
                                                                    po0Var2.y.C.N(bl3.r);
                                                                    i5 = 0;
                                                                    po0Var2.r = false;
                                                                }
                                                                po0Var.y = vc0Var2;
                                                                lr4Var.r();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                po0Var.y = vc0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            lr4Var = lr4VarN;
                                                        }
                                                        po0Var.y = vc0Var2;
                                                        lr4Var.r();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        lr4Var.r();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    lr4Var = lr4VarN;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                lr4Var = lr4VarN;
                                            }
                                        }
                                        h02Var.y.p(h02Var2.j);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i8 = i8;
                                    }
                                    j >>= i8;
                                    i10++;
                                    i8 = i8;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return lr4Var2.i(i);
            }
            i3 = 1;
            if (!lr4Var2.q(i)) {
                return lr4Var2.i(i);
            }
        } else {
            i3 = 1;
            if (lr4Var2.n(i)) {
                int i11 = lr4Var2.y[(i * 5) + 3] + i;
                int iM = 0;
                for (int i12 = i + 1; i12 < i11; i12 += lr4Var2.y[(i12 * 5) + 3]) {
                    boolean zQ = lr4Var2.q(i12);
                    if (zQ) {
                        h02Var.M.r();
                        po0 po0Var3 = h02Var.M;
                        Object objC = lr4Var2.c(i12);
                        po0Var3.r();
                        po0Var3.j.add(objC);
                    }
                    iM += M(h02Var, i12, zQ || z, zQ ? 0 : i2 + iM);
                    if (zQ) {
                        h02Var.M.r();
                        h02Var.M.g();
                    }
                }
                if (!lr4Var2.q(i)) {
                    return iM;
                }
            } else if (!lr4Var2.q(i)) {
                return lr4Var2.i(i);
            }
        }
        return i3;
    }

    public final void A(ArrayList arrayList) {
        h02 h02Var = this;
        vc0 vc0Var = h02Var.x;
        po0 po0Var = h02Var.M;
        vc0 vc0Var2 = po0Var.y;
        try {
            po0Var.y = vc0Var;
            vc0Var.C.N(pl3.r);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                fp3 fp3Var = (fp3) arrayList.get(i);
                w83 w83Var = (w83) fp3Var.j;
                c02 c02VarT = v70.t(w83Var.g());
                mr4 mr4VarG = or4.g(w83Var.n());
                int iG = mr4VarG.g(c02VarT);
                oe2 oe2Var = new oe2();
                po0Var.y();
                em3 em3Var = po0Var.y.C;
                em3Var.N(yk3.r);
                xq2.I(em3Var, 0, oe2Var, 1, c02VarT);
                if (mr4VarG == h02Var.H) {
                    if (!h02Var.I.f) {
                        qo0.g("Check failed");
                    }
                    h02Var.h();
                }
                lr4 lr4VarN = mr4VarG.n();
                try {
                    lr4VarN.p(iG);
                    po0Var.x = iG;
                    vc0 vc0Var3 = new vc0();
                    h02Var.F(null, null, null, pi1.j, new lt(h02Var, vc0Var3, lr4VarN, w83Var));
                    vc0 vc0Var4 = po0Var.y;
                    vc0Var4.getClass();
                    if (!vc0Var3.C.M()) {
                        em3 em3Var2 = vc0Var4.C;
                        em3Var2.N(uk3.r);
                        xq2.I(em3Var2, 0, vc0Var3, 1, oe2Var);
                    }
                    lr4VarN.r();
                    po0Var.y.C.N(rl3.r);
                    i++;
                    h02Var = this;
                } catch (Throwable th) {
                    lr4VarN.r();
                    throw th;
                }
            }
            po0Var.y();
            po0Var.y.C.N(cl3.r);
            po0Var.x = 0;
            po0Var.y = vc0Var2;
        } catch (Throwable th2) {
            po0Var.y = vc0Var2;
            throw th2;
        }
    }

    public final void B(tr3 tr3Var, Object obj) {
        U(126665345, null);
        C();
        j0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                pr4.d(this.I);
            }
            boolean z = (this.S || yf2.p(this.G.x(), tr3Var)) ? false : true;
            if (z) {
                I(tr3Var);
            }
            R(202, 0, qo0.r, tr3Var);
            this.K = null;
            boolean z2 = this.f;
            this.f = z;
            y94.F(new nm0(-59194059, true, new ed(obj, (byte) 9)), this);
            this.f = z2;
            b(false);
            this.K = null;
            this.T = j;
            b(false);
        } catch (Throwable th) {
            try {
                yc6.g(th, new d02(this));
                throw th;
            } catch (Throwable th2) {
                b(false);
                this.K = null;
                this.T = j;
                b(false);
                throw th2;
            }
        }
    }

    public final Object C() {
        boolean z = this.S;
        l76 l76Var = oo0.g;
        if (!z) {
            Object objW = this.G.w();
            if (!this.d || (objW instanceof n84)) {
                return objW;
            }
        } else if (this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected");
            return l76Var;
        }
        return l76Var;
    }

    public final List D() {
        to0 to0Var = this.y;
        so0 so0VarJ = to0Var.j();
        yo0 yo0Var = so0VarJ != null ? (yo0) so0VarJ : null;
        if (yo0Var != null) {
            mr4 mr4Var = yo0Var.w;
            Integer numX = xc6.x(or4.g(mr4Var), to0Var);
            if (numX != null) {
                lr4 lr4VarN = or4.g(mr4Var).n();
                try {
                    return cj0.w0(xc6.j(lr4VarN, numX.intValue(), 0), yo0Var.C.D());
                } finally {
                    lr4VarN.r();
                }
            }
        }
        return pi1.j;
    }

    public final int E(int i) {
        int iS = this.G.s(i) + 1;
        int i2 = 0;
        while (iS < i) {
            if (!this.G.m(iS)) {
                i2++;
            }
            iS += this.G.y[(iS * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object F(yo0 yo0Var, yo0 yo0Var2, Integer num, List list, my1 my1Var) {
        Object objG;
        boolean z = this.F;
        int i = this.m;
        try {
            this.F = true;
            this.m = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                fp3 fp3Var = (fp3) list.get(i2);
                u34 u34Var = (u34) fp3Var.j;
                Object obj = fp3Var.t;
                if (obj != null) {
                    d0(u34Var, obj);
                } else {
                    d0(u34Var, null);
                }
            }
            if (yo0Var == null) {
                objG = my1Var.g();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (yo0Var2 == null || yo0Var2.equals(yo0Var) || iIntValue < 0) {
                    objG = my1Var.g();
                } else {
                    yo0Var.d = yo0Var2;
                    yo0Var.e = iIntValue;
                    try {
                        objG = my1Var.g();
                        yo0Var.d = null;
                        yo0Var.e = 0;
                    } catch (Throwable th) {
                        yo0Var.d = null;
                        yo0Var.e = 0;
                        throw th;
                    }
                }
                if (objG == null) {
                    objG = my1Var.g();
                }
            }
            this.F = z;
            this.m = i;
            return objG;
        } catch (Throwable th2) {
            this.F = z;
            this.m = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h02.G():void");
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.l);
        po0 po0Var = this.M;
        po0Var.n(false);
        re2 re2Var = po0Var.n;
        h02 h02Var = po0Var.g;
        lr4 lr4Var = h02Var.G;
        if (lr4Var.r > 0 && re2Var.g(-2) != (i = lr4Var.t)) {
            if (!po0Var.r && po0Var.v) {
                po0Var.n(false);
                po0Var.y.C.N(fl3.r);
                po0Var.r = true;
            }
            if (i > 0) {
                c02 c02VarG = lr4Var.g(i);
                re2Var.r(i);
                po0Var.n(false);
                em3 em3Var = po0Var.y.C;
                em3Var.N(el3.r);
                xq2.H(em3Var, 0, c02VarG);
                po0Var.r = true;
            }
        }
        po0Var.y.C.N(nl3.r);
        int i2 = po0Var.x;
        lr4 lr4Var2 = h02Var.G;
        po0Var.x = lr4Var2.y[(lr4Var2.l * 5) + 3] + i2;
    }

    public final void I(tr3 tr3Var) {
        ha3 ha3Var = this.o;
        if (ha3Var == null) {
            ha3Var = new ha3();
            this.o = ha3Var;
        }
        ha3Var.t(this.G.l, tr3Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void J(int i, int i2, int i3) {
        lr4 lr4Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (lr4Var.s(i) == i2) {
                i3 = i2;
            } else if (lr4Var.s(i2) == i) {
                i3 = i;
            } else if (lr4Var.s(i) == lr4Var.s(i2)) {
                i3 = lr4Var.s(i);
            } else {
                int iS = i;
                int i4 = 0;
                while (iS > 0 && iS != i3) {
                    iS = lr4Var.s(iS);
                    i4++;
                }
                int iS2 = i2;
                int i5 = 0;
                while (iS2 > 0 && iS2 != i3) {
                    iS2 = lr4Var.s(iS2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iS3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iS3 = lr4Var.s(iS3);
                }
                int i8 = i5 - i4;
                int iS4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iS4 = lr4Var.s(iS4);
                }
                i3 = iS3;
                for (int iS5 = iS4; i3 != iS5; iS5 = lr4Var.s(iS5)) {
                    i3 = lr4Var.s(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (lr4Var.q(i)) {
                this.M.g();
            }
            i = lr4Var.s(i);
        }
        i(i2, i3);
    }

    public final Object K() {
        boolean z = this.S;
        l76 l76Var = oo0.g;
        if (!z) {
            Object objW = this.G.w();
            if (!this.d || (objW instanceof n84)) {
                return objW instanceof l02 ? ((l02) objW).g : objW;
            }
        } else if (this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected");
            return l76Var;
        }
        return l76Var;
    }

    public final void L(int i) throws Throwable {
        boolean zQ = this.G.q(i);
        po0 po0Var = this.M;
        if (zQ) {
            po0Var.r();
            Object objC = this.G.c(i);
            po0Var.r();
            po0Var.j.add(objC);
        }
        M(this, i, zQ, 0);
        po0Var.r();
        if (zQ) {
            po0Var.g();
        }
    }

    public final boolean N(int i, boolean z) {
        u34 u34VarF;
        if ((i & 1) == 0 && (this.S || this.d)) {
            lp4 lp4Var = this.P;
            if (lp4Var != null && (u34VarF = f()) != null && lp4Var.g()) {
                int i2 = u34VarF.y;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                u34VarF.y = i3;
                u34VarF.y = (this.d ? i2 | 129 : i3 & (-129)) | 256;
                em3 em3Var = this.M.y.C;
                em3Var.N(ml3.r);
                xq2.H(em3Var, 0, u34VarF);
                this.y.s(u34VarF);
                return false;
            }
        } else if (!z && e()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void O() {
        long jRotateLeft;
        if (this.u.isEmpty()) {
            this.q = this.G.u() + this.q;
            return;
        }
        lr4 lr4Var = this.G;
        int iL = lr4Var.l();
        int[] iArr = lr4Var.y;
        int i = lr4Var.l;
        Object objB = i < lr4Var.j ? lr4Var.b(iArr, i) : null;
        Object objX = lr4Var.x();
        int i2 = this.w;
        l76 l76Var = oo0.g;
        if (objB == null) {
            if (objX == null || iL != 207 || objX.equals(l76Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iL), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objX.hashCode()), 3) ^ ((long) i2);
            }
            W(null, (iArr[(lr4Var.l * 5) + 1] & 1073741824) != 0);
            G();
            lr4Var.v();
            if (objB != null) {
                if (objB instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objB).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objB.hashCode()), 3);
                }
            }
            if (objX == null && iL == 207 && !objX.equals(l76Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objX.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iL) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objB instanceof Enum ? ((Enum) objB).ordinal() : objB.hashCode())), 3);
        this.T = jRotateLeft;
        W(null, (iArr[(lr4Var.l * 5) + 1] & 1073741824) != 0);
        G();
        lr4Var.v();
        if (objB != null) {
            if (objX == null) {
            }
            this.T = Long.rotateRight(((long) iL) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objB instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objB).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objB.hashCode()), 3);
        }
    }

    public final void P() {
        lr4 lr4Var = this.G;
        int i = lr4Var.t;
        this.q = i >= 0 ? lr4Var.y[(i * 5) + 1] & 67108863 : 0;
        lr4Var.z();
    }

    public final void Q() {
        if (this.q != 0) {
            qo0.g("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        u34 u34VarF = f();
        if (u34VarF != null) {
            int i = u34VarF.y;
            if ((i & 128) == 0) {
                u34VarF.y = i | 16;
            }
        }
        if (this.u.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        k02 k02Var;
        k02 k02Var2;
        ArrayList arrayList;
        ha3 ha3Var;
        int i3;
        Object objValueOf;
        hb3 hb3Var;
        Object objL;
        xa3 xa3Var;
        pr4 pr4Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        lr4 lr4Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        lr4 lr4Var2;
        int i13;
        Object objB;
        pr4 pr4Var2;
        int i14;
        k02 k02Var3;
        Object obj4 = obj;
        if (this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.w;
        Object obj5 = oo0.g;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.w++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.m++;
                pr4Var2 = this.I;
                i14 = pr4Var2.z;
                if (z) {
                    pr4Var2.P(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    pr4Var2.P(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    pr4Var2.P(i, obj4, false, obj5);
                }
                k02Var3 = this.a;
                if (k02Var3 != null) {
                    int i16 = (-2) - i14;
                    mi2 mi2Var = new mi2(-1, i, i16, -1);
                    k02Var3.v.t(i16, new k42(-1, this.m - k02Var3.y, 0));
                    k02Var3.n.add(mi2Var);
                }
                z(z, null);
                return;
            }
            if (i2 != 1 && this.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.a == null) {
                int iL = this.G.l();
                if (!z2 && iL == i) {
                    lr4Var2 = this.G;
                    i13 = lr4Var2.l;
                    if (i13 < lr4Var2.j) {
                        objB = lr4Var2.b(lr4Var2.y, i13);
                    } else {
                        objB = null;
                    }
                    if (yf2.p(obj4, objB)) {
                        W(obj2, z);
                        z3 = z2;
                    }
                }
                lr4Var = this.G;
                iArr = lr4Var.y;
                arrayList2 = new ArrayList();
                if (lr4Var.m <= 0) {
                    i10 = lr4Var.l;
                    while (i10 < lr4Var.j) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objB2 = lr4Var.b(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new mi2(objB2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.a = new k02(this.m, arrayList2);
            } else {
                z3 = z2;
            }
            k02Var = this.a;
            if (k02Var != null) {
                arrayList = k02Var.n;
                ha3Var = k02Var.v;
                i3 = k02Var.y;
                if (obj4 != null) {
                    objValueOf = new oh2(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                hb3Var = ((o93) k02Var.x.getValue()).g;
                objL = hb3Var.l(objValueOf);
                if (objL == null) {
                    objL = null;
                } else if (objL instanceof xa3) {
                    xa3Var = (xa3) objL;
                    Object objQ = xa3Var.q(0);
                    if (xa3Var.t()) {
                        hb3Var.q(objValueOf);
                    }
                    if (xa3Var.y == 1) {
                        hb3Var.c(objValueOf, xa3Var.x());
                    }
                    objL = objQ;
                } else {
                    hb3Var.q(objValueOf);
                }
                mi2 mi2Var2 = (mi2) objL;
                if (!z3 || mi2Var2 == null) {
                    this.G.m++;
                    this.S = true;
                    this.K = null;
                    if (this.I.f) {
                        pr4 pr4VarV = this.H.v();
                        this.I = pr4VarV;
                        pr4VarV.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.n();
                    pr4Var = this.I;
                    int i19 = pr4Var.z;
                    if (z) {
                        pr4Var.P(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        pr4Var.P(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        pr4Var.P(i, obj3, false, obj5);
                    }
                    this.N = this.I.y(i19);
                    int i20 = (-2) - i19;
                    mi2 mi2Var3 = new mi2(-1, i, i20, -1);
                    ha3Var.t(i20, new k42(-1, this.m - i3, i4));
                    arrayList.add(mi2Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.m;
                    }
                    k02Var2 = new k02(i5, arrayList3);
                } else {
                    int i21 = mi2Var2.r;
                    arrayList.add(mi2Var2);
                    k42 k42Var = (k42) ha3Var.y(i21);
                    this.m = (k42Var != null ? k42Var.y : -1) + i3;
                    k42 k42Var2 = (k42) ha3Var.y(i21);
                    int i22 = k42Var2 != null ? k42Var2.g : -1;
                    int i23 = k02Var.r;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = ha3Var.r;
                            long[] jArr = ha3Var.g;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                k42 k42Var3 = (k42) objArr3[(i26 << 3) + i28];
                                                int i29 = k42Var3.g;
                                                if (i29 == i22) {
                                                    k42Var3.g = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        k42Var3.g = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = ha3Var.r;
                        long[] jArr2 = ha3Var.g;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            k42 k42Var4 = (k42) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = k42Var4.g;
                                            if (i33 == i22) {
                                                k42Var4.g = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                k42Var4.g = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    po0 po0Var = this.M;
                    int i34 = po0Var.x;
                    h02 h02Var = po0Var.g;
                    po0Var.x = (i21 - h02Var.G.l) + i34;
                    this.G.p(i21);
                    if (i6 > 0) {
                        po0Var.n(false);
                        re2 re2Var = po0Var.n;
                        lr4 lr4Var3 = h02Var.G;
                        if (lr4Var3.r > 0 && re2Var.g(-2) != (i7 = lr4Var3.t)) {
                            if (!po0Var.r && po0Var.v) {
                                po0Var.n(false);
                                po0Var.y.C.N(fl3.r);
                                po0Var.r = true;
                            }
                            if (i7 > 0) {
                                c02 c02VarG = lr4Var3.g(i7);
                                re2Var.r(i7);
                                po0Var.n(false);
                                em3 em3Var = po0Var.y.C;
                                em3Var.N(el3.r);
                                xq2.H(em3Var, 0, c02VarG);
                                po0Var.r = true;
                            }
                        }
                        em3 em3Var2 = po0Var.y.C;
                        em3Var2.N(jl3.r);
                        em3Var2.n[em3Var2.v - em3Var2.y[em3Var2.r - 1].g] = i6;
                    }
                    W(obj2, z);
                    k02Var2 = null;
                }
            } else {
                k02Var2 = null;
            }
            z(z, k02Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.w++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.m++;
            pr4Var2 = this.I;
            i14 = pr4Var2.z;
            if (z) {
                pr4Var2.P(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                pr4Var2.P(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                pr4Var2.P(i, obj4, false, obj5);
            }
            k02Var3 = this.a;
            if (k02Var3 != null) {
                int i110 = (-2) - i14;
                mi2 mi2Var4 = new mi2(-1, i, i110, -1);
                k02Var3.v.t(i110, new k42(-1, this.m - k02Var3.y, 0));
                k02Var3.n.add(mi2Var4);
            }
            z(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.a == null) {
            int iL2 = this.G.l();
            if (!z2) {
                lr4Var2 = this.G;
                i13 = lr4Var2.l;
                if (i13 < lr4Var2.j) {
                    objB = lr4Var2.b(lr4Var2.y, i13);
                } else {
                    objB = null;
                }
                if (yf2.p(obj4, objB)) {
                    W(obj2, z);
                    z3 = z2;
                }
            }
            lr4Var = this.G;
            iArr = lr4Var.y;
            arrayList2 = new ArrayList();
            if (lr4Var.m <= 0) {
                i10 = lr4Var.l;
                while (i10 < lr4Var.j) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objB3 = lr4Var.b(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new mi2(objB3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.a = new k02(this.m, arrayList2);
        } else {
            z3 = z2;
        }
        k02Var = this.a;
        if (k02Var != null) {
            arrayList = k02Var.n;
            ha3Var = k02Var.v;
            i3 = k02Var.y;
            if (obj4 != null) {
                objValueOf = new oh2(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            hb3Var = ((o93) k02Var.x.getValue()).g;
            objL = hb3Var.l(objValueOf);
            if (objL == null) {
                objL = null;
            } else if (objL instanceof xa3) {
                xa3Var = (xa3) objL;
                Object objQ2 = xa3Var.q(0);
                if (xa3Var.t()) {
                    hb3Var.q(objValueOf);
                }
                if (xa3Var.y == 1) {
                    hb3Var.c(objValueOf, xa3Var.x());
                }
                objL = objQ2;
            } else {
                hb3Var.q(objValueOf);
            }
            mi2 mi2Var5 = (mi2) objL;
            if (z3) {
            }
            this.G.m++;
            this.S = true;
            this.K = null;
            if (this.I.f) {
                pr4 pr4VarV2 = this.H.v();
                this.I = pr4VarV2;
                pr4VarV2.L();
                this.J = false;
                this.K = null;
            }
            this.I.n();
            pr4Var = this.I;
            int i113 = pr4Var.z;
            if (z) {
                pr4Var.P(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                pr4Var.P(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                pr4Var.P(i, obj3, false, obj5);
            }
            this.N = this.I.y(i113);
            int i210 = (-2) - i113;
            mi2 mi2Var6 = new mi2(-1, i, i210, -1);
            ha3Var.t(i210, new k42(-1, this.m - i3, i4));
            arrayList.add(mi2Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.m;
            }
            k02Var2 = new k02(i5, arrayList4);
        } else {
            k02Var2 = null;
        }
        z(z, k02Var2);
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, rk3 rk3Var) {
        R(i, 0, rk3Var, null);
    }

    public final void U(int i, Object obj) {
        R(i, 0, obj, null);
    }

    public final void V() {
        R(125, 1, null, null);
        this.p = true;
    }

    public final void W(Object obj, boolean z) {
        if (z) {
            lr4 lr4Var = this.G;
            if (lr4Var.m <= 0) {
                if ((lr4Var.y[(lr4Var.l * 5) + 1] & 1073741824) == 0) {
                    aw3.g("Expected a node group");
                }
                lr4Var.h();
                return;
            }
            return;
        }
        if (obj != null && this.G.x() != obj) {
            po0 po0Var = this.M;
            po0Var.getClass();
            po0Var.n(false);
            em3 em3Var = po0Var.y.C;
            em3Var.N(xl3.r);
            xq2.H(em3Var, 0, obj);
        }
        this.G.h();
    }

    public final void X(int i) {
        int i2;
        int i3;
        if (this.a != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.w);
        this.w++;
        lr4 lr4Var = this.G;
        boolean z = this.S;
        l76 l76Var = oo0.g;
        if (z) {
            lr4Var.m++;
            this.I.P(i, l76Var, false, l76Var);
            z(false, null);
            return;
        }
        if (lr4Var.l() == i && ((i3 = lr4Var.l) >= lr4Var.j || (lr4Var.y[(i3 * 5) + 1] & 536870912) == 0)) {
            lr4Var.h();
            z(false, null);
            return;
        }
        if (lr4Var.m <= 0 && (i2 = lr4Var.l) != lr4Var.j) {
            int i4 = this.m;
            H();
            this.M.v(i4, lr4Var.u());
            a11.B(this.u, i2, lr4Var.l);
        }
        lr4Var.m++;
        this.S = true;
        this.K = null;
        if (this.I.f) {
            pr4 pr4VarV = this.H.v();
            this.I = pr4VarV;
            pr4VarV.L();
            this.J = false;
            this.K = null;
        }
        pr4 pr4Var = this.I;
        pr4Var.n();
        int i5 = pr4Var.z;
        pr4Var.P(i, l76Var, false, l76Var);
        this.N = pr4Var.y(i5);
        z(false, null);
    }

    public final void Y(int i) {
        R(i, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final h02 Z(int i) {
        u34 u34Var;
        boolean z;
        X(i);
        boolean z2 = this.S;
        y22 y22Var = this.l;
        ArrayList arrayList = this.E;
        yo0 yo0Var = this.j;
        if (z2) {
            u34 u34Var2 = new u34(yo0Var);
            arrayList.add(u34Var2);
            j0(u34Var2);
            u34Var2.v = this.B;
            u34Var2.y &= -17;
            y22Var.c();
            return this;
        }
        int i2 = this.G.t;
        ArrayList arrayList2 = this.u;
        int iS = a11.s(i2, arrayList2);
        mg2 mg2Var = iS >= 0 ? (mg2) arrayList2.remove(iS) : null;
        Object objW = this.G.w();
        if (yf2.p(objW, oo0.g)) {
            u34Var = new u34(yo0Var);
            j0(u34Var);
        } else {
            objW.getClass();
            u34Var = (u34) objW;
        }
        if (mg2Var == null) {
            int i3 = u34Var.y;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                u34Var.y = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = u34Var.y;
        u34Var.y = z ? i4 | 8 : i4 & (-9);
        arrayList.add(u34Var);
        u34Var.v = this.B;
        u34Var.y &= -17;
        y22Var.c();
        int i5 = u34Var.y;
        if ((i5 & 256) != 0) {
            u34Var.y = (i5 & (-257)) | 512;
            em3 em3Var = this.M.y.C;
            em3Var.N(sl3.r);
            xq2.H(em3Var, 0, u34Var);
            if (!this.d) {
                int i6 = u34Var.y;
                if ((i6 & 128) != 0) {
                    this.d = true;
                    this.e = this.G.t;
                    u34Var.y = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final Object a(j14 j14Var) {
        return a11.e(q(), j14Var);
    }

    public final void a0(Object obj) {
        if (!this.S && this.G.l() == 207 && !yf2.p(this.G.x(), obj) && this.e < 0) {
            this.e = this.G.l;
            this.d = true;
        }
        R(207, 0, null, obj);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void b(boolean z) {
        long jRotateRight;
        re2 re2Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        re2 re2Var2;
        int i7;
        ib3 ib3Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        re2 re2Var3 = this.c;
        int i15 = re2Var3.g[re2Var3.y - 2] - 1;
        boolean z2 = this.S;
        l76 l76Var = oo0.g;
        if (z2) {
            pr4 pr4Var = this.I;
            int i16 = pr4Var.o;
            int iP = pr4Var.p(i16);
            Object objU = this.I.u(i16);
            Object objB = this.I.b(i16);
            if (objU != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objU instanceof Enum ? ((Enum) objU).ordinal() : objU.hashCode()));
            } else if (objB == null || iP != 207 || objB.equals(l76Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iP);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            lr4 lr4Var = this.G;
            int i17 = lr4Var.t;
            int iT = lr4Var.t(i17);
            lr4 lr4Var2 = this.G;
            Object objB2 = lr4Var2.b(lr4Var2.y, i17);
            lr4 lr4Var3 = this.G;
            Object objY = lr4Var3.y(lr4Var3.y, i17);
            if (objB2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objB2 instanceof Enum ? ((Enum) objB2).ordinal() : objB2.hashCode()));
            } else if (objY == null || iT != 207 || objY.equals(l76Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iT);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objY.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i18 = this.q;
        k02 k02Var = this.a;
        ArrayList arrayList4 = this.u;
        po0 po0Var = this.M;
        if (k02Var != null) {
            ha3 ha3Var = k02Var.v;
            int i19 = k02Var.y;
            ArrayList arrayList5 = k02Var.g;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = k02Var.n;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList6.get(i20));
                }
                i = -1;
                ib3 ib3Var2 = fe4.g;
                ib3 ib3Var3 = new ib3();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    mi2 mi2Var = (mi2) arrayList5.get(i21);
                    if (hashSet2.contains(mi2Var)) {
                        re2Var2 = re2Var3;
                        i7 = i21;
                        if (!ib3Var3.r(mi2Var)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                mi2 mi2Var2 = (mi2) arrayList6.get(i24);
                                if (mi2Var2 != mi2Var) {
                                    k42 k42Var = (k42) ha3Var.y(mi2Var2.r);
                                    int i25 = k42Var != null ? k42Var.y : -1;
                                    ib3Var3.g(mi2Var2);
                                    i10 = i23;
                                    if (i25 != i10) {
                                        k42 k42Var2 = (k42) ha3Var.y(mi2Var2.r);
                                        int i26 = k42Var2 != null ? k42Var2.r : mi2Var2.n;
                                        ib3Var = ib3Var3;
                                        int i27 = i25 + i19;
                                        i8 = size2;
                                        int i28 = i10 + i19;
                                        if (i26 > 0) {
                                            i9 = i19;
                                            int i29 = po0Var.q;
                                            if (i29 > 0) {
                                                arrayList2 = arrayList5;
                                                if (po0Var.a == i27 - i29 && po0Var.m == i28 - i29) {
                                                    po0Var.q = i29 + i26;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            po0Var.r();
                                            po0Var.a = i27;
                                            po0Var.m = i28;
                                            po0Var.q = i26;
                                        } else {
                                            i9 = i19;
                                            arrayList2 = arrayList5;
                                            po0Var.getClass();
                                        }
                                        if (i25 <= i10) {
                                            int i30 = i26;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i25) {
                                                Object[] objArr5 = ha3Var.r;
                                                long[] jArr5 = ha3Var.g;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j = jArr5[i31];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length)) >>> 31);
                                                            int i33 = 0;
                                                            while (i33 < i32) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    k42 k42Var3 = (k42) objArr5[(i31 << 3) + i33];
                                                                    jArr2 = jArr5;
                                                                    int i34 = k42Var3.y;
                                                                    i13 = i25;
                                                                    if (i25 <= i34 && i34 < i13 + i30) {
                                                                        k42Var3.y = (i34 - i13) + i10;
                                                                    } else if (i13 + 1 <= i34 && i34 < i10) {
                                                                        k42Var3.y = i34 - i30;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i25;
                                                                }
                                                                j >>= 8;
                                                                i33++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i25 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                        }
                                                        if (i31 == length) {
                                                            break;
                                                        }
                                                        i31++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i25 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = ha3Var.r;
                                            long[] jArr6 = ha3Var.g;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i35 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i35];
                                                    int i36 = i26;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i37 = 8 - ((~(i35 - length2)) >>> 31);
                                                        int i38 = 0;
                                                        while (i38 < i37) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i38;
                                                                k42 k42Var4 = (k42) objArr6[(i35 << 3) + i38];
                                                                objArr4 = objArr6;
                                                                int i39 = k42Var4.y;
                                                                jArr4 = jArr6;
                                                                if (i25 <= i39 && i39 < i25 + i36) {
                                                                    k42Var4.y = (i39 - i25) + i10;
                                                                } else if (i10 <= i39 && i39 < i25) {
                                                                    k42Var4.y = i39 + i36;
                                                                }
                                                            } else {
                                                                i14 = i38;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i38 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i37 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i35 == length2) {
                                                        break;
                                                    }
                                                    i35++;
                                                    arrayList4 = arrayList4;
                                                    i26 = i36;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        ib3Var = ib3Var3;
                                        i8 = size2;
                                        i9 = i19;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    ib3Var = ib3Var3;
                                    i8 = size2;
                                    i9 = i19;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i23;
                                    i11 = i7 + 1;
                                }
                                i22 = i24 + 1;
                                k42 k42Var5 = (k42) ha3Var.y(mi2Var2.r);
                                int i40 = i10 + (k42Var5 != null ? k42Var5.r : mi2Var2.n);
                                i21 = i11;
                                k02Var = k02Var;
                                ib3Var3 = ib3Var;
                                size2 = i8;
                                i19 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i23 = i40;
                                re2Var3 = re2Var2;
                            } else {
                                i22 = i24;
                                re2Var3 = re2Var2;
                                i21 = i7;
                            }
                        }
                    } else {
                        re2Var2 = re2Var3;
                        k42 k42Var6 = (k42) ha3Var.y(mi2Var.r);
                        int i41 = k42Var6 != null ? k42Var6.y : -1;
                        int i42 = mi2Var.r;
                        i7 = i21;
                        po0Var.v(i41 + i19, mi2Var.n);
                        k02Var.g(i42, 0);
                        po0Var.x = (i42 - po0Var.g.G.l) + po0Var.x;
                        this.G.p(i42);
                        H();
                        this.G.u();
                        a11.B(arrayList4, i42, this.G.y[(i42 * 5) + 3] + i42);
                    }
                    i21 = i7 + 1;
                    re2Var3 = re2Var2;
                }
                re2Var = re2Var3;
                arrayList = arrayList4;
                po0Var.r();
                if (arrayList5.size() > 0) {
                    lr4 lr4Var4 = this.G;
                    po0Var.x = (lr4Var4.j - po0Var.g.G.l) + po0Var.x;
                    lr4Var4.z();
                }
            } else {
                re2Var = re2Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            re2Var = re2Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            lr4 lr4Var5 = this.G;
            int i43 = lr4Var5.w - lr4Var5.q;
            if (i43 > 0) {
                if (i43 > 0) {
                    po0Var.n(false);
                    re2 re2Var4 = po0Var.n;
                    lr4 lr4Var6 = po0Var.g.G;
                    if (lr4Var6.r > 0 && re2Var4.g(-2) != (i6 = lr4Var6.t)) {
                        if (!po0Var.r && po0Var.v) {
                            po0Var.n(false);
                            po0Var.y.C.N(fl3.r);
                            po0Var.r = true;
                        }
                        if (i6 > 0) {
                            c02 c02VarG = lr4Var6.g(i6);
                            re2Var4.r(i6);
                            po0Var.n(false);
                            em3 em3Var = po0Var.y.C;
                            em3Var.N(el3.r);
                            xq2.H(em3Var, 0, c02VarG);
                            po0Var.r = true;
                        }
                    }
                    em3 em3Var2 = po0Var.y.C;
                    em3Var2.N(wl3.r);
                    em3Var2.n[em3Var2.v - em3Var2.y[em3Var2.r - 1].g] = i43;
                } else {
                    po0Var.getClass();
                }
            }
        }
        int i44 = this.m;
        while (true) {
            lr4 lr4Var7 = this.G;
            if (lr4Var7.m > 0 || (i5 = lr4Var7.l) == lr4Var7.j) {
                break;
            }
            H();
            po0Var.v(i44, this.G.u());
            a11.B(arrayList, i5, this.G.l);
        }
        if (z3) {
            if (z) {
                qp1 qp1Var = this.O;
                em3 em3Var3 = qp1Var.r;
                if (em3Var3.r == 0) {
                    qo0.g("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                em3 em3Var4 = qp1Var.y;
                bm3[] bm3VarArr = em3Var3.y;
                int i45 = em3Var3.r - 1;
                em3Var3.r = i45;
                bm3 bm3Var = bm3VarArr[i45];
                bm3VarArr[i45] = null;
                em3Var4.N(bm3Var);
                Object[] objArr7 = em3Var3.x;
                Object[] objArr8 = em3Var4.x;
                int i46 = em3Var4.l;
                int i47 = bm3Var.y;
                int i48 = em3Var3.l;
                int i49 = i48 - i47;
                System.arraycopy(objArr7, i49, objArr8, i46 - i47, i48 - i49);
                Object[] objArr9 = em3Var3.x;
                int i50 = em3Var3.l;
                Arrays.fill(objArr9, i50 - i47, i50, (Object) null);
                int[] iArr = em3Var3.n;
                int[] iArr2 = em3Var4.n;
                int i51 = em3Var4.v;
                int i52 = bm3Var.g;
                int i53 = em3Var3.v;
                pr.M(i51 - i52, i53 - i52, i53, iArr, iArr2);
                em3Var3.l -= i47;
                em3Var3.v -= i52;
                i18 = 1;
            }
            lr4 lr4Var8 = this.G;
            if (lr4Var8.m <= 0) {
                aw3.g("Unbalanced begin/end empty");
            }
            lr4Var8.m--;
            pr4 pr4Var2 = this.I;
            int i54 = pr4Var2.o;
            pr4Var2.t();
            if (this.G.m <= 0) {
                int i55 = (-2) - i54;
                this.I.a();
                this.I.v(true);
                c02 c02Var = this.N;
                boolean zM = this.O.y.M();
                mr4 mr4Var = this.H;
                if (zM) {
                    po0Var.y();
                    po0Var.n(false);
                    re2 re2Var5 = po0Var.n;
                    lr4 lr4Var9 = po0Var.g.G;
                    if (lr4Var9.r <= 0 || re2Var5.g(-2) == (i4 = lr4Var9.t)) {
                        i3 = 1;
                    } else {
                        if (!po0Var.r && po0Var.v) {
                            po0Var.n(false);
                            po0Var.y.C.N(fl3.r);
                            po0Var.r = true;
                        }
                        if (i4 > 0) {
                            c02 c02VarG2 = lr4Var9.g(i4);
                            re2Var5.r(i4);
                            po0Var.n(false);
                            em3 em3Var5 = po0Var.y.C;
                            em3Var5.N(el3.r);
                            xq2.H(em3Var5, 0, c02VarG2);
                            i3 = 1;
                            po0Var.r = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    po0Var.r();
                    em3 em3Var6 = po0Var.y.C;
                    em3Var6.N(hl3.r);
                    xq2.I(em3Var6, 0, c02Var, i3, mr4Var);
                    r3 = 0;
                } else {
                    qp1 qp1Var2 = this.O;
                    po0Var.y();
                    po0Var.n(false);
                    re2 re2Var6 = po0Var.n;
                    lr4 lr4Var10 = po0Var.g.G;
                    if (lr4Var10.r > 0 && re2Var6.g(-2) != (i2 = lr4Var10.t)) {
                        if (!po0Var.r && po0Var.v) {
                            po0Var.n(false);
                            po0Var.y.C.N(fl3.r);
                            po0Var.r = true;
                        }
                        if (i2 > 0) {
                            c02 c02VarG3 = lr4Var10.g(i2);
                            re2Var6.r(i2);
                            po0Var.n(false);
                            em3 em3Var7 = po0Var.y.C;
                            em3Var7.N(el3.r);
                            xq2.H(em3Var7, 0, c02VarG3);
                            po0Var.r = true;
                        }
                    }
                    po0Var.r();
                    em3 em3Var8 = po0Var.y.C;
                    em3Var8.N(il3.r);
                    int i56 = em3Var8.l - em3Var8.y[em3Var8.r - 1].y;
                    Object[] objArr10 = em3Var8.x;
                    objArr10[i56] = c02Var;
                    objArr10[i56 + 1] = mr4Var;
                    objArr10[i56 + 2] = qp1Var2;
                    this.O = new qp1();
                    r3 = 0;
                }
                this.S = r3;
                if (this.r.t != 0) {
                    f0(i55, r3);
                    g0(i55, i18);
                }
            }
        } else {
            if (z) {
                po0Var.g();
            }
            int i57 = po0Var.g.G.t;
            re2 re2Var7 = po0Var.n;
            int i58 = i;
            if (re2Var7.g(i58) > i57) {
                qo0.g("Missed recording an endGroup");
            }
            if (re2Var7.g(i58) == i57) {
                po0Var.n(false);
                re2Var7.y();
                po0Var.y.C.N(bl3.r);
            }
            int i59 = this.G.t;
            if (i18 != k0(i59)) {
                g0(i59, i18);
            }
            if (z) {
                i18 = 1;
            }
            this.G.v();
            po0Var.r();
        }
        ArrayList arrayList7 = this.t;
        k02 k02Var2 = (k02) arrayList7.remove(arrayList7.size() - 1);
        if (k02Var2 != null && !z3) {
            k02Var2.r++;
        }
        this.a = k02Var2;
        this.m = re2Var.y() + i18;
        this.w = re2Var.y();
        this.q = re2Var.y() + i18;
    }

    public final void b0() {
        R(125, 2, null, null);
        this.p = true;
    }

    public final void c(hb3 hb3Var, bz1 bz1Var) {
        ArrayList arrayList = this.u;
        if (this.F) {
            qo0.g("Reentrant composition is not supported");
        }
        this.l.c();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(it4.j().l());
            this.o = null;
            e0(hb3Var);
            this.m = 0;
            this.F = true;
            try {
                c0();
                Object objC = C();
                if (objC != bz1Var && bz1Var != null) {
                    j0(bz1Var);
                }
                g02 g02Var = this.D;
                rb3 rb3VarG = pt4.g();
                try {
                    rb3VarG.y(g02Var);
                    rk3 rk3Var = qo0.g;
                    if (bz1Var != null) {
                        T(200, rk3Var);
                        y94.F(bz1Var, this);
                        b(false);
                    } else if (!this.f || objC == null || objC.equals(oo0.g)) {
                        O();
                    } else {
                        T(200, rk3Var);
                        ue5.f(2, objC);
                        y94.F((bz1) objC, this);
                        b(false);
                    }
                    rb3VarG.w(rb3VarG.a - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f) {
                        qo0.g("Check failed");
                    }
                    h();
                    Trace.endSection();
                } catch (Throwable th) {
                    rb3VarG.w(rb3VarG.a - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    yc6.g(th2, new gf((Object) this, (byte) 9));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    g();
                    if (!this.I.f) {
                        qo0.g("Check failed");
                    }
                    h();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
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
    public final void c0() {
        this.w = 0;
        this.G = this.r.n();
        R(100, 0, null, null);
        to0 to0Var = this.y;
        to0Var.z();
        tr3 tr3VarT = to0Var.t();
        this.k.r(this.f ? 1 : 0);
        this.f = x(tr3VarT);
        this.K = null;
        if (!this.s) {
            this.s = to0Var.v();
        }
        boolean zX = this.C;
        if (!zX) {
            zX = to0Var.x();
            this.C = zX;
        }
        if (zX) {
            vf1 vf1VarG = xo0.g();
            vf1VarG.getClass();
            tr3VarT = tr3VarT.y(vf1VarG, new bx4(d()));
        }
        this.h = tr3VarT;
        Set set = (Set) a11.e(tr3VarT, zd2.g);
        if (set != null) {
            set.add(o());
            to0Var.i(set);
        }
        R(Long.hashCode(to0Var.l()), 0, null, null);
    }

    public final wo0 d() {
        if (this.y.m()) {
            return this.Q;
        }
        return null;
    }

    public final boolean d0(u34 u34Var, Object obj) {
        c02 c02Var = u34Var.r;
        if (c02Var == null) {
            return false;
        }
        int iG = this.G.g.g(v70.t(c02Var));
        if (!this.F || iG < this.G.l) {
            return false;
        }
        ArrayList arrayList = this.u;
        int iS = a11.s(iG, arrayList);
        if (iS < 0) {
            int i = -(iS + 1);
            if (!(obj instanceof z51)) {
                obj = null;
            }
            arrayList.add(i, new mg2(u34Var, iG, obj));
            return true;
        }
        mg2 mg2Var = (mg2) arrayList.get(iS);
        if (!(obj instanceof z51)) {
            mg2Var.r = null;
            return true;
        }
        Object obj2 = mg2Var.r;
        if (obj2 == null) {
            mg2Var.r = obj;
            return true;
        }
        if (obj2 instanceof ib3) {
            ((ib3) obj2).g(obj);
            return true;
        }
        ib3 ib3Var = fe4.g;
        ib3 ib3Var2 = new ib3(2);
        ib3Var2.m(obj2);
        ib3Var2.m(obj);
        mg2Var.r = ib3Var2;
        return true;
    }

    public final boolean e() {
        u34 u34VarF;
        return (this.S || this.d || this.f || (u34VarF = f()) == null || (u34VarF.y & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void e0(hb3 hb3Var) {
        ArrayList arrayList = this.u;
        for (int iU = pw5.u(arrayList); -1 < iU; iU--) {
            mg2 mg2Var = (mg2) arrayList.get(iU);
            c02 c02Var = mg2Var.g.r;
            c02 c02VarT = c02Var != null ? v70.t(c02Var) : null;
            if (c02VarT == null || !c02VarT.g()) {
                arrayList.remove(iU);
            } else {
                int i = mg2Var.y;
                int i2 = c02VarT.g;
                if (i != i2) {
                    mg2Var.y = i2;
                }
            }
        }
        Object[] objArr = hb3Var.y;
        Object[] objArr2 = hb3Var.r;
        long[] jArr = hb3Var.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            u34 u34Var = (u34) obj;
                            c02 c02Var2 = u34Var.r;
                            if (c02Var2 != null) {
                                int i7 = v70.t(c02Var2).g;
                                if (obj2 == cm1.i) {
                                    obj2 = null;
                                }
                                arrayList.add(new mg2(u34Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        gj0.Z(arrayList, a11.z);
    }

    public final u34 f() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (u34) arrayList.get(arrayList.size() - 1);
    }

    public final void f0(int i, int i2) {
        if (k0(i) != i2) {
            if (i < 0) {
                fa3 fa3Var = this.b;
                if (fa3Var == null) {
                    fa3Var = new fa3();
                    this.b = fa3Var;
                }
                fa3Var.x(i, i2);
                return;
            }
            int[] iArr = this.i;
            if (iArr == null) {
                int i3 = this.G.r;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.i = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void g() {
        t();
        this.t.clear();
        this.c.y = 0;
        this.z.y = 0;
        this.k.y = 0;
        this.o = null;
        qp1 qp1Var = this.O;
        qp1Var.r.K();
        qp1Var.y.K();
        this.T = 0L;
        this.A = 0;
        this.p = false;
        this.S = false;
        this.d = false;
        this.F = false;
        this.e = -1;
        lr4 lr4Var = this.G;
        if (!lr4Var.x) {
            lr4Var.r();
        }
        if (this.I.f) {
            return;
        }
        h();
    }

    public final void g0(int i, int i2) {
        int iK0 = k0(i);
        if (iK0 != i2) {
            int i3 = i2 - iK0;
            ArrayList arrayList = this.t;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iK1 = k0(i) + i3;
                f0(i, iK1);
                for (int i4 = size; -1 < i4; i4--) {
                    k02 k02Var = (k02) arrayList.get(i4);
                    if (k02Var != null && k02Var.g(i, iK1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                lr4 lr4Var = this.G;
                if (i < 0) {
                    i = lr4Var.t;
                } else if (lr4Var.q(i)) {
                    return;
                } else {
                    i = this.G.s(i);
                }
            }
        }
    }

    public final void h() {
        mr4 mr4Var = new mr4();
        if (this.C) {
            mr4Var.y();
        }
        if (this.y.n()) {
            mr4Var.p = new ha3();
        }
        this.H = mr4Var;
        pr4 pr4VarV = mr4Var.v();
        pr4VarV.v(true);
        this.I = pr4VarV;
    }

    public final tr3 h0(tr3 tr3Var, tr3 tr3Var2) {
        tr3Var.getClass();
        sr3 sr3Var = new sr3(tr3Var);
        sr3Var.putAll(tr3Var2);
        tr3 tr3VarG = sr3Var.g();
        T(204, qo0.n);
        C();
        j0(tr3VarG);
        C();
        j0(tr3Var2);
        b(false);
        return tr3VarG;
    }

    public final void i(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        i(this.G.s(i), i2);
        if (this.G.q(i)) {
            Object objC = this.G.c(i);
            po0 po0Var = this.M;
            po0Var.r();
            po0Var.j.add(objC);
        }
    }

    public final void i0(Object obj) {
        if (obj instanceof j64) {
            l02 l02Var = new l02((j64) obj, this.w - 1);
            if (this.S) {
                em3 em3Var = this.M.y.C;
                em3Var.N(ll3.r);
                xq2.H(em3Var, 0, l02Var);
            }
            this.n.add(obj);
            obj = l02Var;
        }
        j0(obj);
    }

    public final boolean j(Object obj) {
        if (C() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void j0(Object obj) {
        if (this.S) {
            pr4 pr4Var = this.I;
            if (pr4Var.c <= 0 || pr4Var.t == pr4Var.m) {
                pr4Var.E(obj);
                return;
            }
            ha3 ha3Var = pr4Var.u;
            if (ha3Var == null) {
                ha3Var = new ha3();
            }
            pr4Var.u = ha3Var;
            int i = pr4Var.o;
            Object objY = ha3Var.y(i);
            if (objY == null) {
                objY = new xa3();
                ha3Var.t(i, objY);
            }
            ((xa3) objY).g(obj);
            return;
        }
        lr4 lr4Var = this.G;
        boolean z = lr4Var.c;
        po0 po0Var = this.M;
        if (!z) {
            c02 c02VarG = lr4Var.g(lr4Var.t);
            em3 em3Var = po0Var.y.C;
            em3Var.N(tk3.r);
            xq2.I(em3Var, 0, c02VarG, 1, obj);
            return;
        }
        int iN = (lr4Var.q - or4.n(lr4Var.y, lr4Var.t)) - 1;
        if (po0Var.g.G.t - po0Var.x >= 0) {
            po0Var.n(true);
            em3 em3Var2 = po0Var.y.C;
            em3Var2.N(gl3.l);
            xq2.H(em3Var2, 0, obj);
            em3Var2.n[em3Var2.v - em3Var2.y[em3Var2.r - 1].g] = iN;
            return;
        }
        lr4 lr4Var2 = this.G;
        c02 c02VarG2 = lr4Var2.g(lr4Var2.t);
        em3 em3Var3 = po0Var.y.C;
        em3Var3.N(gl3.x);
        xq2.I(em3Var3, 0, obj, 1, c02VarG2);
        em3Var3.n[em3Var3.v - em3Var3.y[em3Var3.r - 1].g] = iN;
    }

    public final boolean k() {
        if (!e() || this.f) {
            return true;
        }
        u34 u34VarF = f();
        return (u34VarF == null || (u34VarF.y & 4) == 0) ? false : true;
    }

    public final int k0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.i;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.i(i) : i2;
        }
        fa3 fa3Var = this.b;
        if (fa3Var == null || fa3Var.r(i) < 0) {
            return 0;
        }
        int iR = fa3Var.r(i);
        if (iR >= 0) {
            return fa3Var.r[iR];
        }
        cf6.a("Cannot find value for key " + i);
        throw null;
    }

    public final boolean l(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z));
        return true;
    }

    public final void l0() {
        if (!this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.p = false;
        if (this.S) {
            qo0.g("useNode() called while inserting");
        }
        lr4 lr4Var = this.G;
        Object objC = lr4Var.c(lr4Var.t);
        po0 po0Var = this.M;
        po0Var.r();
        po0Var.j.add(objC);
        if (this.d && (objC instanceof wn0)) {
            po0Var.y();
            po0Var.y.C.N(am3.r);
        }
    }

    public final void m(my1 my1Var) {
        if (!this.p) {
            qo0.g("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.p = false;
        if (!this.S) {
            qo0.g("createNode() can only be called when inserting");
        }
        re2 re2Var = this.c;
        int i = re2Var.g[re2Var.y - 1];
        pr4 pr4Var = this.I;
        c02 c02VarY = pr4Var.y(pr4Var.o);
        this.q++;
        qp1 qp1Var = this.O;
        em3 em3Var = qp1Var.y;
        em3Var.N(gl3.n);
        xq2.H(em3Var, 0, my1Var);
        em3Var.n[em3Var.v - em3Var.y[em3Var.r - 1].g] = i;
        xq2.H(em3Var, 1, c02VarY);
        em3 em3Var2 = qp1Var.r;
        em3Var2.N(gl3.v);
        em3Var2.n[em3Var2.v - em3Var2.y[em3Var2.r - 1].g] = i;
        xq2.H(em3Var2, 0, c02VarY);
    }

    public final boolean n(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i));
        return true;
    }

    public final vo0 o() {
        i02 i02Var = this.U;
        if (i02Var != null) {
            return i02Var;
        }
        i02 i02Var2 = new i02(this.j);
        this.U = i02Var2;
        return i02Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:16:0x003f->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[EDGE_INSN: B:29:0x0085->B:30:0x0086 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[SYNTHETIC] */
    public final u34 p() {
        u34 u34Var;
        c02 c02VarG;
        t34 t34Var;
        ArrayList arrayList = this.E;
        u34 u34Var2 = !arrayList.isEmpty() ? (u34) arrayList.remove(arrayList.size() - 1) : null;
        byte b = 0;
        if (u34Var2 != null) {
            u34Var2.y &= -9;
            this.l.c();
            int i = this.B;
            ta3 ta3Var = u34Var2.x;
            if (ta3Var == null || (u34Var2.y & 16) != 0) {
                t34Var = null;
                break;
            }
            Object[] objArr = ta3Var.y;
            int[] iArr = ta3Var.r;
            long[] jArr = ta3Var.g;
            int length = jArr.length - 2;
            if (length < 0) {
                t34Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                t34Var = new t34(b, i, u34Var2, ta3Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    t34Var = null;
                    break;
                }
                if (i2 == length) {
                    t34Var = null;
                    break;
                }
                i2++;
            }
            po0 po0Var = this.M;
            if (t34Var != null) {
                em3 em3Var = po0Var.y.C;
                em3Var.N(al3.r);
                xq2.I(em3Var, 0, t34Var, 1, this.j);
            }
            int i6 = u34Var2.y;
            if ((i6 & 512) != 0) {
                u34Var2.y = i6 & (-513);
                em3 em3Var2 = po0Var.y.C;
                em3Var2.N(dl3.r);
                xq2.H(em3Var2, 0, u34Var2);
                int i7 = u34Var2.y;
                u34Var2.y = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    u34Var2.y = i7 & (-1153);
                    if (this.e == this.G.t) {
                        this.d = false;
                        this.e = -1;
                    }
                }
            }
        }
        if (u34Var2 != null) {
            int i8 = u34Var2.y;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.s)) {
                if (u34Var2.r == null) {
                    if (this.S) {
                        pr4 pr4Var = this.I;
                        c02VarG = pr4Var.y(pr4Var.o);
                    } else {
                        lr4 lr4Var = this.G;
                        c02VarG = lr4Var.g(lr4Var.t);
                    }
                    u34Var2.r = c02VarG;
                }
                u34Var2.y &= -5;
                u34Var = u34Var2;
            } else {
                u34Var = null;
            }
        } else {
            u34Var = null;
        }
        b(false);
        return u34Var;
    }

    public final tr3 q() {
        tr3 tr3Var;
        tr3 tr3Var2 = this.K;
        if (tr3Var2 != null) {
            return tr3Var2;
        }
        int iS = this.G.t;
        boolean z = this.S;
        rk3 rk3Var = qo0.r;
        if (z && this.J) {
            int iD = this.I.o;
            while (iD > 0) {
                if (this.I.p(iD) == 202 && yf2.p(this.I.u(iD), rk3Var)) {
                    Object objB = this.I.b(iD);
                    objB.getClass();
                    tr3 tr3Var3 = (tr3) objB;
                    this.K = tr3Var3;
                    return tr3Var3;
                }
                pr4 pr4Var = this.I;
                iD = pr4Var.D(pr4Var.y, iD);
            }
        }
        if (this.G.r > 0) {
            while (iS > 0) {
                if (this.G.t(iS) == 202) {
                    lr4 lr4Var = this.G;
                    if (yf2.p(lr4Var.b(lr4Var.y, iS), rk3Var)) {
                        ha3 ha3Var = this.o;
                        if (ha3Var == null || (tr3Var = (tr3) ha3Var.y(iS)) == null) {
                            lr4 lr4Var2 = this.G;
                            Object objY = lr4Var2.y(lr4Var2.y, iS);
                            objY.getClass();
                            tr3Var = (tr3) objY;
                        }
                        this.K = tr3Var;
                        return tr3Var;
                    }
                }
                iS = this.G.s(iS);
            }
        }
        tr3 tr3Var4 = this.h;
        this.K = tr3Var4;
        return tr3Var4;
    }

    public final boolean r(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f));
        return true;
    }

    public final void s() {
        b(false);
        u34 u34VarF = f();
        if (u34VarF != null) {
            int i = u34VarF.y;
            if ((i & 1) != 0) {
                u34VarF.y = i | 2;
            }
        }
    }

    public final void t() {
        this.a = null;
        this.m = 0;
        this.q = 0;
        this.T = 0L;
        this.p = false;
        po0 po0Var = this.M;
        po0Var.r = false;
        po0Var.n.y = 0;
        po0Var.x = 0;
        po0Var.v = true;
        po0Var.l = 0;
        po0Var.j.clear();
        po0Var.t = -1;
        po0Var.a = -1;
        po0Var.m = -1;
        po0Var.q = 0;
        this.E.clear();
        this.i = null;
        this.b = null;
    }

    public final void u() {
        b(false);
        this.y.r();
        b(false);
        po0 po0Var = this.M;
        if (po0Var.r) {
            po0Var.n(false);
            po0Var.n(false);
            po0Var.y.C.N(bl3.r);
            po0Var.r = false;
        }
        po0Var.y();
        if (po0Var.n.y != 0) {
            qo0.g("Missed recording an endGroup()");
        }
        if (!this.t.isEmpty()) {
            qo0.g("Start/end imbalance");
        }
        t();
        this.G.r();
        this.f = this.k.y() != 0;
    }

    public final boolean v(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        j0(Long.valueOf(j));
        return true;
    }

    public final go0 w() {
        if (!this.y.m()) {
            return null;
        }
        uv2 uv2VarC = pw5.c();
        uv2VarC.addAll(xc6.v(this.I));
        uv2VarC.addAll(xc6.r(this.G));
        uv2VarC.addAll(D());
        return new go0(pw5.a(uv2VarC), this.C);
    }

    public final boolean x(Object obj) {
        if (yf2.p(C(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void y(bz1 bz1Var, Object obj) {
        if (this.S) {
            em3 em3Var = this.O.y;
            em3Var.N(yl3.r);
            xq2.H(em3Var, 0, obj);
            ue5.f(2, bz1Var);
            xq2.H(em3Var, 1, bz1Var);
            return;
        }
        po0 po0Var = this.M;
        po0Var.y();
        em3 em3Var2 = po0Var.y.C;
        em3Var2.N(yl3.r);
        ue5.f(2, bz1Var);
        xq2.I(em3Var2, 0, obj, 1, bz1Var);
    }

    public final void z(boolean z, k02 k02Var) {
        this.t.add(this.a);
        this.a = k02Var;
        int i = this.q;
        re2 re2Var = this.c;
        re2Var.r(i);
        re2Var.r(this.w);
        re2Var.r(this.m);
        if (z) {
            this.m = 0;
        }
        this.q = 0;
        this.w = 0;
    }
}
