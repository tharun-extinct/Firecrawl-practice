package defpackage;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rw extends i73 implements lm2, wd1, ej4, tu3, l73, vp3, xk2, a32, ct1, qt1, tt1, qn3, w70 {
    public qw f;
    public HashSet k;
    public h73 o;

    @Override // defpackage.qn3
    public final boolean A() {
        return this.h;
    }

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ai5.x((im2) h73Var, zy2Var, p33Var, i);
    }

    @Override // defpackage.vp3
    public final Object H(j51 j51Var, Object obj) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ((up3) h73Var).r();
    }

    @Override // defpackage.i73
    public final void I0() {
        Q0(true);
    }

    @Override // defpackage.i73
    public final void J0() {
        R0();
    }

    @Override // defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        h73 h73Var = this.o;
        h73Var.getClass();
        kb5 kb5Var = ((yu3) h73Var).n;
        yu3 yu3Var = (yu3) kb5Var.m;
        List list = ju3Var.g;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            qu3 qu3Var = (qu3) list.get(i);
            if (fd6.y(qu3Var) || fd6.n(qu3Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((qu3) list.get(i2)).q()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (yu3Var.r) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                qu3 qu3Var2 = (qu3) list.get(i3);
                if (!fd6.y(qu3Var2) && !fd6.n(qu3Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        wu3 wu3Var = (wu3) kb5Var.t;
        wu3 wu3Var2 = wu3.a;
        ku3 ku3Var2 = ku3.a;
        if (wu3Var != wu3Var2) {
            if (ku3Var == ku3.j && z3) {
                kb5Var.a = ju3Var;
                kb5Var.w(ju3Var, !z || yu3Var.r);
            }
            if (ku3Var == ku3.t && z && ju3Var == ((ju3) kb5Var.a) && yu3Var.r) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((qu3) list.get(i4)).g();
                }
            }
            if (ku3Var == ku3Var2 && !z3 && ju3Var != ((ju3) kb5Var.a)) {
                kb5Var.w(ju3Var, true);
            }
        }
        if (ku3Var == ku3Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    kb5Var.t = wu3.j;
                    ((yu3) kb5Var.m).r = false;
                    kb5Var.a = null;
                    break;
                } else if (!fd6.n((qu3) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (ju3Var == ((ju3) kb5Var.a) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((qu3) list.get(i6)).q()) {
                        if (yu3Var.r) {
                            break;
                        }
                        kb5Var.e(ju3Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((qu3) list.get(i7)).g();
                }
            }
        }
    }

    public final void Q0(boolean z) {
        if (!this.h) {
            mc2.y("initializeModifier called on unattached node");
        }
        h73 h73Var = this.o;
        if ((this.a & 32) != 0 && (h73Var instanceof m73)) {
            m73 m73Var = (m73) h73Var;
            k14 k14Var = c93.w;
            qw qwVar = this.f;
            if (qwVar == null || !qwVar.g(k14Var)) {
                qw qwVar2 = new qw();
                qwVar2.y = m73Var;
                this.f = qwVar2;
                g25 g25Var = k33.V(this).M.v;
                g25Var.getClass();
                if (g25Var.o) {
                    k73 modifierLocalManager = ((ba) k33.W(this)).getModifierLocalManager();
                    xa3 xa3Var = modifierLocalManager.y;
                    if (xa3Var == null) {
                        xa3Var = new xa3();
                        modifierLocalManager.y = xa3Var;
                    }
                    xa3Var.g(this);
                    xa3 xa3Var2 = modifierLocalManager.r;
                    if (xa3Var2 == null) {
                        xa3Var2 = new xa3();
                        modifierLocalManager.r = xa3Var2;
                    }
                    xa3Var2.g(k14Var);
                    modifierLocalManager.g();
                }
            } else {
                qwVar.y = m73Var;
                k73 modifierLocalManager2 = ((ba) k33.W(this)).getModifierLocalManager();
                xa3 xa3Var3 = modifierLocalManager2.y;
                if (xa3Var3 == null) {
                    xa3Var3 = new xa3();
                    modifierLocalManager2.y = xa3Var3;
                }
                xa3Var3.g(this);
                xa3 xa3Var4 = modifierLocalManager2.r;
                if (xa3Var4 == null) {
                    xa3Var4 = new xa3();
                    modifierLocalManager2.r = xa3Var4;
                }
                xa3Var4.g(k14Var);
                modifierLocalManager2.g();
            }
        }
        if ((this.a & 4) != 0 && !z) {
            k33.T(this, 2).g1();
        }
        if ((this.a & 2) != 0) {
            g25 g25Var2 = k33.V(this).M.v;
            g25Var2.getClass();
            if (g25Var2.o) {
                gh3 gh3Var = this.i;
                gh3Var.getClass();
                ((nm2) gh3Var).C1(this);
                on3 on3Var = gh3Var.a0;
                if (on3Var != null) {
                    ((a42) on3Var).r();
                }
            }
            if (!z) {
                k33.T(this, 2).g1();
                k33.V(this).G();
            }
        }
        if (h73Var instanceof ps2) {
            ps2 ps2Var = (ps2) h73Var;
            um2 um2VarV = k33.V(this);
            switch (ps2Var.g) {
                case 0:
                    ((ss2) ps2Var.y).q = um2VarV;
                    break;
                default:
                    ((xo3) ps2Var.y).f.setValue(um2VarV);
                    break;
            }
        }
        int i = this.a;
        if ((i & 16) != 0 && (h73Var instanceof yu3)) {
            ((yu3) h73Var).n.j = this.i;
        }
        if ((i & 8) != 0) {
            ((ba) k33.W(this)).F();
        }
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        h73 h73Var = this.o;
        h73Var.getClass();
        ((eb2) ((vd1) h73Var)).l(wm2Var);
    }

    public final void R0() {
        if (!this.h) {
            mc2.y("unInitializeModifier called on unattached node");
        }
        h73 h73Var = this.o;
        if ((this.a & 32) != 0 && (h73Var instanceof m73)) {
            k73 modifierLocalManager = ((ba) k33.W(this)).getModifierLocalManager();
            k14 k14Var = c93.w;
            xa3 xa3Var = modifierLocalManager.n;
            if (xa3Var == null) {
                xa3Var = new xa3();
                modifierLocalManager.n = xa3Var;
            }
            xa3Var.g(k33.V(this));
            xa3 xa3Var2 = modifierLocalManager.v;
            if (xa3Var2 == null) {
                xa3Var2 = new xa3();
                modifierLocalManager.v = xa3Var2;
            }
            xa3Var2.g(k14Var);
            modifierLocalManager.g();
        }
        if ((this.a & 8) != 0) {
            ((ba) k33.W(this)).F();
        }
    }

    public final void S0() {
        if (this.h) {
            this.k.clear();
            sn3 snapshotObserver = ((ba) k33.W(this)).getSnapshotObserver();
            snapshotObserver.g.n(this, a11.v, new qd((Object) this, (byte) 7));
        }
    }

    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ai5.l((im2) h73Var, zy2Var, p33Var, i);
    }

    @Override // defpackage.qt1
    public final void Y(ot1 ot1Var) {
        h73 h73Var = this.o;
        mc2.y("applyFocusProperties called on wrong node");
        fj.w(h73Var);
        throw null;
    }

    @Override // defpackage.l73
    public final zq2 a() {
        qw qwVar = this.f;
        return qwVar != null ? qwVar : ri1.y;
    }

    @Override // defpackage.ct1
    public final void c0(xt1 xt1Var) {
        h73 h73Var = this.o;
        mc2.y("onFocusEvent called on wrong node");
        fj.w(h73Var);
        throw null;
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        if (this.o instanceof yu3) {
            m0();
        }
    }

    @Override // defpackage.tu3
    public final boolean g0() {
        h73 h73Var = this.o;
        h73Var.getClass();
        ((yu3) h73Var).n.getClass();
        return true;
    }

    @Override // defpackage.w70
    public final fl2 getLayoutDirection() {
        return k33.V(this).G;
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ai5.n((im2) h73Var, zy2Var, p33Var, i);
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        h73 h73Var = this.o;
        h73Var.getClass();
        aj4 aj4VarX = ((cj4) h73Var).x();
        nj4Var.getClass();
        aj4 aj4Var = (aj4) nj4Var;
        hb3 hb3Var = aj4Var.j;
        if (aj4VarX.a) {
            aj4Var.a = true;
        }
        if (aj4VarX.m) {
            aj4Var.m = true;
        }
        hb3 hb3Var2 = aj4VarX.j;
        Object[] objArr = hb3Var2.y;
        Object[] objArr2 = hb3Var2.r;
        long[] jArr = hb3Var2.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        mj4 mj4Var = (mj4) obj;
                        if (!hb3Var.y(mj4Var)) {
                            hb3Var.c(mj4Var, obj2);
                        } else if (obj2 instanceof p1) {
                            Object objL = hb3Var.l(mj4Var);
                            objL.getClass();
                            p1 p1Var = (p1) objL;
                            String str = p1Var.g;
                            if (str == null) {
                                str = ((p1) obj2).g;
                            }
                            jz1 jz1Var = p1Var.y;
                            if (jz1Var == null) {
                                jz1Var = ((p1) obj2).y;
                            }
                            hb3Var.c(mj4Var, new p1(str, jz1Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.tu3
    public final void m0() {
        h73 h73Var = this.o;
        h73Var.getClass();
        kb5 kb5Var = ((yu3) h73Var).n;
        wu3 wu3Var = (wu3) kb5Var.t;
        yu3 yu3Var = (yu3) kb5Var.m;
        if (wu3Var == wu3.t) {
            sd6.g(SystemClock.uptimeMillis(), new xu3(yu3Var, (byte) 0));
            kb5Var.t = wu3.j;
            yu3Var.r = false;
            kb5Var.a = null;
        }
    }

    @Override // defpackage.w70
    public final long n() {
        return y94.N(k33.T(this, 128).a);
    }

    @Override // defpackage.a32
    public final void o(gh3 gh3Var) {
        h73 h73Var = this.o;
        h73Var.getClass();
        fj.w(h73Var);
        throw null;
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // defpackage.wd1
    public final void u0() {
        c93.A(this);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ((im2) h73Var).v(v33Var, p33Var, j);
    }

    @Override // defpackage.tu3
    public final void v0() {
        h73 h73Var = this.o;
        h73Var.getClass();
        ((yu3) h73Var).n.getClass();
    }

    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        h73 h73Var = this.o;
        h73Var.getClass();
        return ai5.v((im2) h73Var, zy2Var, p33Var, i);
    }

    @Override // defpackage.w70
    public final j51 y() {
        return k33.V(this).F;
    }

    @Override // defpackage.xk2
    public final void b(bl2 bl2Var) {
    }

    @Override // defpackage.xk2, defpackage.x33
    public final void r(long j) {
    }
}
