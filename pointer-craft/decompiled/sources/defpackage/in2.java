package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class in2 implements wn0 {
    public sy4 a;
    public final zm2 b;
    public final hb3 c;
    public final String f;
    public int h;
    public final cn2 i;
    public final um2 j;
    public int m;
    public int o;
    public final ry4 p;
    public int q;
    public final hb3 s;
    public to0 t;
    public final hb3 u;
    public final hb3 w;
    public final rb3 z;

    public in2(um2 um2Var, sy4 sy4Var) {
        this.j = um2Var;
        this.a = sy4Var;
        long[] jArr = ee4.g;
        this.w = new hb3();
        this.c = new hb3();
        this.i = new cn2(this);
        this.b = new zm2(this);
        this.s = new hb3();
        this.p = new ry4();
        this.u = new hb3();
        this.z = new rb3(new Object[16]);
        this.f = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void y(an2 an2Var) {
        ir3 ir3Var = an2Var.x;
        if (ir3Var != null) {
            ir3Var.r();
            an2Var.x = null;
            yo0 yo0Var = an2Var.r;
            if (yo0Var != null) {
                yo0Var.g();
            }
            an2Var.r = null;
        }
    }

    public final void a(boolean z) {
        this.o = 0;
        this.s.g();
        List listB = this.j.b();
        int i = ((qb3) listB).j.a;
        if (this.h != i) {
            this.h = i;
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    um2 um2Var = (um2) ((qb3) listB).get(i2);
                    an2 an2Var = (an2) this.w.l(um2Var);
                    if (an2Var != null && ((Boolean) an2Var.l.getValue()).booleanValue()) {
                        ym2 ym2Var = um2Var.N;
                        ym2Var.b.u = sm2.a;
                        fz2 fz2Var = ym2Var.s;
                        if (fz2Var != null) {
                            fz2Var.T0();
                        }
                        w(an2Var, z);
                        an2Var.g = gp4.E;
                    }
                } catch (Throwable th) {
                    js2.z(at4VarM, at4VarB, xy1VarV);
                    throw th;
                }
            }
            js2.z(at4VarM, at4VarB, xy1VarV);
            this.c.g();
        }
        t();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x00ab, B:60:0x00bd, B:63:0x00d3, B:65:0x00d7, B:77:0x011b, B:66:0x00e4, B:67:0x00ef, B:69:0x00f3, B:71:0x0108, B:75:0x0112, B:74:0x010d, B:76:0x0118, B:61:0x00c0, B:56:0x0092, B:57:0x009e, B:80:0x0125, B:81:0x012f), top: B:84:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x00ab, B:60:0x00bd, B:63:0x00d3, B:65:0x00d7, B:77:0x011b, B:66:0x00e4, B:67:0x00ef, B:69:0x00f3, B:71:0x0108, B:75:0x0112, B:74:0x010d, B:76:0x0118, B:61:0x00c0, B:56:0x0092, B:57:0x009e, B:80:0x0125, B:81:0x012f), top: B:84:0x0076 }] */
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
    public final void c(um2 um2Var, Object obj, boolean z, bz1 bz1Var) {
        boolean z2;
        hb3 hb3Var = this.w;
        Object objL = hb3Var.l(um2Var);
        Object obj2 = objL;
        if (objL == null) {
            nm0 nm0Var = ue5.j;
            an2 an2Var = new an2();
            an2Var.g = obj;
            an2Var.y = nm0Var;
            an2Var.r = null;
            an2Var.l = kq2.M(Boolean.TRUE);
            hb3Var.c(um2Var, an2Var);
            obj2 = an2Var;
        }
        an2 an2Var2 = (an2) obj2;
        boolean z3 = an2Var2.y != bz1Var;
        if (an2Var2.x != null) {
            if (z3) {
                y(an2Var2);
            } else if (z) {
                return;
            } else {
                g(an2Var2, true);
            }
        }
        yo0 yo0Var = an2Var2.r;
        if (yo0Var != null) {
            synchronized (yo0Var.m) {
                z2 = yo0Var.h.v > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || an2Var2.n) {
            an2Var2.y = bz1Var;
            if (an2Var2.x != null) {
                mc2.g("new subcompose call while paused composition is still active");
            }
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                um2 um2Var2 = this.j;
                um2Var2.k = true;
                yo0 yo0Var2 = an2Var2.r;
                to0 to0Var = this.t;
                if (to0Var == null) {
                    mc2.r("parent composition reference not set");
                    throw new il0(false);
                }
                if (yo0Var2 != null) {
                    if (yo0Var2.D == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams = hs5.g;
                            yo0Var2 = oc6.g(new wf5(um2Var), to0Var);
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = hs5.g;
                            yo0Var2 = new yo0(to0Var, new wf5(um2Var));
                        }
                    }
                } else if (z) {
                    ViewGroup.LayoutParams layoutParams3 = hs5.g;
                    yo0Var2 = oc6.g(new wf5(um2Var), to0Var);
                } else {
                    ViewGroup.LayoutParams layoutParams4 = hs5.g;
                    yo0Var2 = new yo0(to0Var, new wf5(um2Var));
                }
                an2Var2.r = yo0Var2;
                bz1 nm0Var2 = an2Var2.y;
                if (((ba) xm2.g(this.j)).m8getOutOfFrameExecutor() != null) {
                    an2Var2.j = false;
                } else {
                    an2Var2.j = true;
                    nm0Var2 = new nm0(1524156494, true, new vn(an2Var2, nm0Var2, (byte) 11));
                }
                if (z) {
                    if (an2Var2.v) {
                        yo0Var2.a();
                        yo0Var2.s();
                        an2Var2.x = yo0Var2.q(true, nm0Var2);
                    } else {
                        an2Var2.x = yo0Var2.q(yo0Var2.a(), nm0Var2);
                    }
                } else if (an2Var2.v) {
                    yo0Var2.a();
                    yo0Var2.s();
                    h02 h02Var = yo0Var2.C;
                    h02Var.e = 0;
                    h02Var.d = true;
                    yo0Var2.j.g(yo0Var2, nm0Var2);
                    if (h02Var.F || h02Var.e != 0) {
                        aw3.g("Cannot disable reuse from root if it was caused by other groups");
                    }
                    h02Var.e = -1;
                    h02Var.d = false;
                } else {
                    yo0Var2.A(nm0Var2);
                }
                an2Var2.v = false;
                um2Var2.k = false;
                js2.z(at4VarM, at4VarB, xy1VarV);
                an2Var2.n = false;
            } catch (Throwable th) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th;
            }
        }
    }

    public final void g(an2 an2Var, boolean z) {
        ir3 ir3Var = an2Var.x;
        if (ir3Var != null) {
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                um2 um2Var = this.j;
                um2Var.k = true;
                if (z) {
                    while (!ir3Var.x()) {
                        try {
                            ir3Var.a(new up((byte) 10));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ir3Var.g();
                an2Var.x = null;
                um2Var.k = false;
                js2.z(at4VarM, at4VarB, xy1VarV);
            } catch (Throwable th2) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th2;
            }
        }
    }

    public final um2 i(Object obj) {
        hb3 hb3Var;
        int i;
        if (this.h == 0) {
            return null;
        }
        qb3 qb3Var = (qb3) this.j.b();
        int i2 = qb3Var.j.a - this.o;
        int i3 = i2 - this.h;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            hb3Var = this.w;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objL = hb3Var.l((um2) qb3Var.get(i5));
            objL.getClass();
            if (yf2.p(((an2) objL).g, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objL2 = hb3Var.l((um2) qb3Var.get(i4));
                objL2.getClass();
                an2 an2Var = (an2) objL2;
                Object obj2 = an2Var.g;
                if (obj2 == gp4.E || this.a.x(obj, obj2)) {
                    an2Var.g = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m(i5, i3);
        }
        this.h--;
        um2 um2Var = (um2) qb3Var.get(i3);
        Object objL3 = hb3Var.l(um2Var);
        objL3.getClass();
        an2 an2Var2 = (an2) objL3;
        an2Var2.l = kq2.M(Boolean.TRUE);
        an2Var2.v = true;
        an2Var2.n = true;
        return um2Var;
    }

    public final void j(Object obj) {
        t();
        um2 um2Var = (um2) this.s.q(obj);
        um2 um2Var2 = this.j;
        if (um2Var != null) {
            if (this.o <= 0) {
                mc2.y("No pre-composed items to dispose");
            }
            int iM = ((qb3) um2Var2.b()).j.m(um2Var);
            if (iM < ((qb3) um2Var2.b()).j.a - this.o) {
                mc2.y("Item is not in pre-composed item range");
            }
            this.h++;
            this.o--;
            an2 an2Var = (an2) this.w.l(um2Var);
            if (an2Var != null) {
                y(an2Var);
            }
            int i = (((qb3) um2Var2.b()).j.a - this.o) - this.h;
            m(iM, i);
            l(i);
        }
        if (this.z.a(obj)) {
            um2.X(um2Var2, true, 6);
        }
    }

    public final void l(int i) {
        boolean z;
        boolean z2 = false;
        this.h = 0;
        List listB = this.j.b();
        qb3 qb3Var = (qb3) listB;
        int i2 = (qb3Var.j.a - this.o) - 1;
        if (i <= i2) {
            this.p.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objL = this.w.l((um2) qb3Var.get(i3));
                    objL.getClass();
                    this.p.j.g(((an2) objL).g);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.a.y(this.p);
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            z = false;
            while (i2 >= i) {
                try {
                    um2 um2Var = (um2) ((qb3) listB).get(i2);
                    Object objL2 = this.w.l(um2Var);
                    objL2.getClass();
                    an2 an2Var = (an2) objL2;
                    Object obj = an2Var.g;
                    if (this.p.j.r(obj)) {
                        this.h++;
                        if (((Boolean) an2Var.l.getValue()).booleanValue()) {
                            ym2 ym2Var = um2Var.N;
                            ym2Var.b.u = sm2.a;
                            fz2 fz2Var = ym2Var.s;
                            if (fz2Var != null) {
                                fz2Var.T0();
                            }
                            w(an2Var, false);
                            if (an2Var.j) {
                                z = true;
                            }
                        }
                    } else {
                        um2 um2Var2 = this.j;
                        um2Var2.k = true;
                        this.w.q(um2Var);
                        yo0 yo0Var = an2Var.r;
                        if (yo0Var != null) {
                            yo0Var.g();
                        }
                        this.j.S(i2, 1);
                        um2Var2.k = false;
                    }
                    this.c.q(obj);
                    i2--;
                } catch (Throwable th) {
                    js2.z(at4VarM, at4VarB, xy1VarV);
                    throw th;
                }
            }
            js2.z(at4VarM, at4VarB, xy1VarV);
        } else {
            z = false;
        }
        if (z) {
            synchronized (it4.r) {
                ib3 ib3Var = it4.a.j;
                if (ib3Var != null && ib3Var.j()) {
                    z2 = true;
                }
            }
            if (z2) {
                it4.r();
            }
        }
        t();
    }

    public final void m(int i, int i2) {
        um2 um2Var = this.j;
        um2Var.k = true;
        um2Var.N(i, i2, 1);
        um2Var.k = false;
    }

    @Override // defpackage.wn0
    public final void n() {
        a(false);
    }

    public final void q(Object obj, bz1 bz1Var, boolean z) {
        um2 um2Var = this.j;
        if (um2Var.J()) {
            t();
            if (this.c.r(obj)) {
                return;
            }
            this.u.q(obj);
            hb3 hb3Var = this.s;
            Object objL = hb3Var.l(obj);
            if (objL == null) {
                objL = i(obj);
                if (objL != null) {
                    m(((qb3) um2Var.b()).j.m(objL), ((qb3) um2Var.b()).j.a);
                    this.o++;
                } else {
                    int i = ((qb3) um2Var.b()).j.a;
                    um2 um2Var2 = new um2(2);
                    um2Var.k = true;
                    um2Var.D(i, um2Var2);
                    um2Var.k = false;
                    this.o++;
                    objL = um2Var2;
                }
                hb3Var.c(obj, objL);
            }
            c((um2) objL, obj, z, bz1Var);
        }
    }

    public final oy4 r(Object obj) {
        return !this.j.J() ? new gn2() : new hn2(this, obj);
    }

    public final void t() {
        int i = ((qb3) this.j.b()).j.a;
        int i2 = this.w.v;
        if (i2 != i) {
            mc2.g("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.h;
        int i4 = this.o;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbS = du4.s(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbS.append(i4);
            mc2.g(sbS.toString());
        }
        int i5 = this.s.v;
        int i6 = this.o;
        if (i5 == i6) {
            return;
        }
        mc2.g("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.wn0
    public final void v() {
        yo0 yo0Var;
        um2 um2Var = this.j;
        um2Var.k = true;
        hb3 hb3Var = this.w;
        Object[] objArr = hb3Var.r;
        long[] jArr = hb3Var.g;
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
                        if ((255 & j) < 128 && (yo0Var = ((an2) objArr[(i << 3) + i3]).r) != null) {
                            yo0Var.g();
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
        um2Var.R();
        um2Var.k = false;
        hb3Var.g();
        this.c.g();
        this.o = 0;
        this.h = 0;
        this.s.g();
        t();
    }

    public final void w(an2 an2Var, boolean z) {
        yo0 yo0Var;
        if (z || !an2Var.j) {
            an2Var.l = kq2.M(Boolean.FALSE);
        } else {
            an2Var.l.setValue(Boolean.FALSE);
        }
        if (an2Var.x != null) {
            y(an2Var);
            return;
        }
        if (z) {
            yo0 yo0Var2 = an2Var.r;
            if (yo0Var2 != null) {
                yo0Var2.w();
                return;
            }
            return;
        }
        wm3 wm3VarM8getOutOfFrameExecutor = ((ba) xm2.g(this.j)).m8getOutOfFrameExecutor();
        if (wm3VarM8getOutOfFrameExecutor != null) {
            ((ba) wm3VarM8getOutOfFrameExecutor).L(new qd((Object) an2Var, (byte) 24));
        } else {
            if (an2Var.j || (yo0Var = an2Var.r) == null) {
                return;
            }
            yo0Var.w();
        }
    }

    @Override // defpackage.wn0
    public final void x() {
        a(true);
    }
}
