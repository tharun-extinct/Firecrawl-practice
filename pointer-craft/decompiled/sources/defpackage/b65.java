package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b65 {
    public boolean A;
    public y42 a;
    public long b;
    public long c;
    public final z55 d;
    public final mf2 e;
    public final tp3 f;
    public final hg5 g;
    public mf2 h;
    public u75 i;
    public ox0 j;
    public final rk4 k;
    public bi0 l;
    public rt1 m;
    public mt2 n;
    public u75 o;
    public final tp3 p;
    public final tp3 q;
    public final tp3 s;
    public mt3 t;
    public int u;
    public final tp3 w;
    public my1 x;
    public k65 z;
    public aj3 y = if6.g;
    public xy1 r = new vy3(26);
    public final tp3 v = kq2.M(new k65((String) null, 0, 7));

    public b65(hg5 hg5Var) {
        this.g = hg5Var;
        Boolean bool = Boolean.TRUE;
        this.q = kq2.M(bool);
        this.w = kq2.M(bool);
        this.c = 0L;
        this.b = 0L;
        this.s = kq2.M(null);
        this.p = kq2.M(null);
        this.u = -1;
        this.z = new k65((String) null, 0L, 7);
        this.f = kq2.M(Boolean.FALSE);
        rk4 rk4Var = new rk4((byte) 21, false);
        rk4Var.a = ma5.j;
        this.k = rk4Var;
        this.d = new z55(this);
        this.e = new mf2(this);
    }

    public static k65 y(cj cjVar, long j) {
        return new k65(cjVar, j, (u75) null);
    }

    public final long a(boolean z) {
        k75 k75VarN;
        long j;
        mt2 mt2Var = this.n;
        if (mt2Var == null || (k75VarN = mt2Var.n()) == null) {
            return 9205357640488583168L;
        }
        j75 j75Var = k75VarN.g;
        h93 h93Var = j75Var.y;
        cj cjVarM = m();
        if (cjVarM == null) {
            return 9205357640488583168L;
        }
        if (!yf2.p(cjVarM.t, j75Var.g.g.t)) {
            return 9205357640488583168L;
        }
        k65 k65VarQ = q();
        if (z) {
            long j2 = k65VarQ.y;
            int i = u75.r;
            j = j2 >> 32;
        } else {
            long j3 = k65VarQ.y;
            int i2 = u75.r;
            j = j3 & 4294967295L;
        }
        int iJ = this.y.j((int) j);
        boolean zL = u75.l(q().y);
        long j4 = j75Var.r;
        int iN = h93Var.n(iJ);
        if (iN >= h93Var.x) {
            return 9205357640488583168L;
        }
        boolean z2 = j75Var.g(((!z || zL) && (z || !zL)) ? Math.max(iJ + (-1), 0) : iJ) == j75Var.j(iJ);
        h93Var.m(iJ);
        int length = ((cj) h93Var.g.j).t.length();
        ArrayList arrayList = h93Var.j;
        hp3 hp3Var = (hp3) arrayList.get(iJ == length ? arrayList.size() - 1 : xs2.b(iJ, arrayList));
        gd gdVar = hp3Var.g;
        int iN2 = hp3Var.n(iJ);
        h75 h75Var = gdVar.n;
        return (((long) Float.floatToRawIntBits(xs2.q(h93Var.y(iN), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(xs2.q(z2 ? h75Var.t(iN2, false) : h75Var.a(iN2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final void b(wi3 wi3Var) {
        this.p.setValue(wi3Var);
    }

    public final void c(u75 u75Var) {
        cj cjVarM;
        String str;
        ox0 ox0Var;
        if (u75Var == null) {
            return;
        }
        long j = u75Var.g;
        mt3 mt3Var = this.t;
        if (mt3Var == null || (cjVarM = m()) == null || (str = cjVarM.t) == null) {
            return;
        }
        aj3 aj3Var = this.y;
        long jY = sp2.y(aj3Var.j((int) (j >> 32)), aj3Var.j((int) (j & 4294967295L)));
        if (str.length() <= 0 || u75.r(jY) || (ox0Var = this.j) == null) {
            return;
        }
        m50.T(ox0Var, null, new s10(mt3Var, str, jY, u75Var, this, aj3Var, (mu0) null), 3);
    }

    public final iv4 g(boolean z) {
        ox0 ox0Var = this.j;
        mu0 mu0Var = null;
        if (ox0Var != null) {
            return m50.T(ox0Var, null, new lr0((Object) this, z, mu0Var, (byte) 3), 1);
        }
        return null;
    }

    public final void h(boolean z) {
        mt2 mt2Var = this.n;
        if (mt2Var != null) {
            mt2Var.q.setValue(Boolean.valueOf(z));
        }
        if (z) {
            u();
        } else {
            w();
        }
    }

    public final void i() {
        ox0 ox0Var = this.j;
        if (ox0Var != null) {
            m50.T(ox0Var, null, new t55(this, null, (byte) 1), 1);
        }
    }

    public final boolean j() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final wi3 l() {
        return (wi3) this.p.getValue();
    }

    public final cj m() {
        mt2 mt2Var = this.n;
        if (mt2Var != null) {
            return mt2Var.g.g;
        }
        return null;
    }

    public final void n(wi3 wi3Var) {
        if (!u75.r(q().y)) {
            mt2 mt2Var = this.n;
            k75 k75VarN = mt2Var != null ? mt2Var.n() : null;
            int iV = (wi3Var == null || k75VarN == null) ? u75.v(q().y) : this.y.n(k75VarN.y(wi3Var.g, true));
            k65 k65VarG = k65.g(q(), null, sp2.y(iV, iV), 5);
            this.r.a(k65VarG);
            this.o = new u75(k65VarG.y);
        }
        p((wi3Var == null || q().g.t.length() <= 0) ? r42.j : r42.a);
        h(false);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0156  */
    public final long o(k65 k65Var, long j, boolean z, boolean z2, up upVar, boolean z3, z42 z42Var) {
        k75 k75VarN;
        long j2;
        int i;
        long j3;
        ii4 ii4Var;
        ii4 ii4Var2;
        boolean z4;
        y42 y42Var;
        gi4 gi4VarV;
        gi4 gi4Var;
        gi4 gi4Var2;
        ii4 ii4Var3;
        mt2 mt2Var = this.n;
        if (mt2Var == null || (k75VarN = mt2Var.n()) == null) {
            return u75.y;
        }
        aj3 aj3Var = this.y;
        long j4 = k65Var.y;
        cj cjVar = k65Var.g;
        int i2 = u75.r;
        long jY = sp2.y(aj3Var.j((int) (j4 >> 32)), this.y.j((int) (j4 & 4294967295L)));
        int iY = k75VarN.y(j, false);
        int i3 = (z2 || z) ? iY : (int) (jY >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iY;
        } else {
            j2 = 4294967295L;
            i = (int) (jY & 4294967295L);
        }
        mf2 mf2Var = this.h;
        int i4 = -1;
        if (z || mf2Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = this.u;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        j75 j75Var = k75VarN.g;
        if (z) {
            ii4Var = null;
        } else {
            int i6 = (int) (jY >> 32);
            int i7 = (int) (jY & j3);
            ii4Var = new ii4(new gi4(pf6.y(j75Var, i6), i6, 1L), new gi4(pf6.y(j75Var, i7), i7, 1L), u75.l(jY));
        }
        mf2 mf2Var2 = new mf2(z2, ii4Var, new si0(i3, i, i4, j75Var));
        if (ii4Var != null && mf2Var != null && z2 == mf2Var.y) {
            si0 si0Var = (si0) mf2Var.n;
            if (i3 == si0Var.y && i == si0Var.r) {
                return j4;
            }
        }
        this.h = mf2Var2;
        this.u = iY;
        byte b = upVar.j;
        cy0 cy0Var = cy0.j;
        Object obj = mf2Var2.n;
        switch (b) {
            case 18:
                si0 si0Var2 = (si0) obj;
                ii4Var2 = new ii4(si0Var2.y(si0Var2.y), si0Var2.y(si0Var2.r), mf2Var2.r() == cy0Var);
                break;
            case 19:
                ii4Var2 = nf6.g(mf2Var2, t32.i);
                break;
            case 20:
                ii4Var2 = nf6.g(mf2Var2, aj6.c);
                break;
            default:
                ii4Var2 = (ii4) mf2Var2.r;
                si0 si0Var3 = (si0) obj;
                if (ii4Var2 != null) {
                    gi4 gi4Var3 = ii4Var2.y;
                    gi4 gi4Var4 = ii4Var2.g;
                    if (mf2Var2.y) {
                        gi4VarV = nf6.v(mf2Var2, si0Var3, gi4Var4);
                        gi4Var2 = gi4Var3;
                        gi4Var3 = gi4Var4;
                        gi4Var = gi4VarV;
                    } else {
                        gi4VarV = nf6.v(mf2Var2, si0Var3, gi4Var3);
                        gi4Var = gi4Var4;
                        gi4Var2 = gi4VarV;
                    }
                    if (!yf2.p(gi4VarV, gi4Var3)) {
                        ii4 ii4Var4 = new ii4(gi4Var, gi4Var2, mf2Var2.r() == cy0Var || (mf2Var2.r() == cy0.a && gi4Var.y > gi4Var2.y));
                        si0 si0Var4 = (si0) obj;
                        gi4 gi4Var5 = ii4Var4.g;
                        long j5 = gi4Var5.r;
                        gi4 gi4Var6 = ii4Var4.y;
                        if (j5 != gi4Var6.r) {
                            boolean z5 = ii4Var4.r;
                            if ((z5 ? gi4Var5 : gi4Var6).y == 0) {
                                if (((j75) si0Var4.v).g.g.t.length() == (z5 ? gi4Var6 : gi4Var5).y) {
                                    ii4Var3 = (ii4) mf2Var2.r;
                                    String str = ((j75) si0Var4.v).g.g.t;
                                    if (ii4Var3 == null) {
                                    }
                                }
                            }
                        } else if (gi4Var5.y == gi4Var6.y) {
                            ii4Var3 = (ii4) mf2Var2.r;
                            String str2 = ((j75) si0Var4.v).g.g.t;
                            if (ii4Var3 == null && str2.length() != 0) {
                                boolean z6 = mf2Var2.y;
                                String str3 = ((j75) si0Var4.v).g.g.t;
                                int i8 = si0Var4.y;
                                int length = str3.length();
                                if (i8 == 0) {
                                    int iY2 = rg6.y(str3, 0);
                                    ii4Var2 = !z6 ? ii4.g(ii4Var4, null, nf6.r(gi4Var6, si0Var4, iY2), false, 1) : ii4.g(ii4Var4, nf6.r(gi4Var5, si0Var4, iY2), null, true, 2);
                                } else if (i8 != length) {
                                    boolean z7 = ii4Var3.r;
                                    int iR = z6 ^ z7 ? rg6.r(str3, i8) : rg6.y(str3, i8);
                                    ii4Var2 = !z6 ? ii4.g(ii4Var4, null, nf6.r(gi4Var6, si0Var4, iR), z7, 1) : ii4.g(ii4Var4, nf6.r(gi4Var5, si0Var4, iR), null, z7, 2);
                                } else {
                                    int iR2 = rg6.r(str3, length);
                                    ii4Var2 = !z6 ? ii4.g(ii4Var4, null, nf6.r(gi4Var6, si0Var4, iR2), true, 1) : ii4.g(ii4Var4, nf6.r(gi4Var5, si0Var4, iR2), null, false, 2);
                                }
                                break;
                            }
                        }
                        ii4Var2 = ii4Var4;
                    }
                } else {
                    ii4Var2 = nf6.g(mf2Var2, t32.i);
                }
                break;
        }
        long jY2 = sp2.y(this.y.n(ii4Var2.g.y), this.y.n(ii4Var2.y.y));
        if (u75.y(jY2, j4)) {
            return j4;
        }
        boolean z8 = u75.l(jY2) != u75.l(j4) && u75.y(sp2.y((int) (jY2 & j3), (int) (jY2 >> 32)), j4);
        boolean z9 = u75.r(jY2) && u75.r(j4);
        if (z3 && cjVar.t.length() > 0 && !z8 && !z9 && z42Var != null && (y42Var = this.a) != null) {
            ((zs3) y42Var).g(z42Var.g);
        }
        this.r.a(y(cjVar, jY2));
        this.o = new u75(jY2);
        if (!z3) {
            h(!u75.r(jY2));
        }
        mt2 mt2Var2 = this.n;
        if (mt2Var2 != null) {
            mt2Var2.s.setValue(Boolean.valueOf(z3));
        }
        mt2 mt2Var3 = this.n;
        if (mt2Var3 != null) {
            mt2Var3.w.setValue(Boolean.valueOf(!u75.r(jY2) && be2.n(this, true)));
        }
        mt2 mt2Var4 = this.n;
        if (mt2Var4 != null) {
            z4 = false;
            mt2Var4.c.setValue(Boolean.valueOf(!u75.r(jY2) && be2.n(this, false)));
        } else {
            z4 = false;
        }
        mt2 mt2Var5 = this.n;
        if (mt2Var5 != null) {
            mt2Var5.i.setValue(Boolean.valueOf((u75.r(jY2) && be2.n(this, true)) ? true : z4));
        }
        return jY2;
    }

    public final void p(r42 r42Var) {
        mt2 mt2Var = this.n;
        if (mt2Var != null) {
            if (mt2Var.g() == r42Var) {
                mt2Var = null;
            }
            if (mt2Var != null) {
                mt2Var.m.setValue(r42Var);
            }
        }
    }

    public final k65 q() {
        return (k65) this.v.getValue();
    }

    public final void r() {
        ox0 ox0Var = this.j;
        if (ox0Var != null) {
            m50.T(ox0Var, null, new x55(this, null, (byte) 0), 1);
        }
    }

    public final void s(p42 p42Var) {
        this.s.setValue(p42Var);
    }

    public final boolean t() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final void u() {
        mt2 mt2Var;
        e45 e45Var;
        at4 at4VarM = js2.m();
        mu0 mu0Var = null;
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            if (!t() || ((mt2Var = this.n) != null && !((Boolean) mt2Var.s.getValue()).booleanValue())) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                return;
            }
            js2.z(at4VarM, at4VarB, xy1VarV);
            rk4 rk4Var = this.k;
            if (((ma5) rk4Var.a) == ma5.j) {
                pc2.r("ToolbarRequester is not initialized.");
            }
            k45 k45Var = (k45) rk4Var.t;
            if (k45Var == null || !k45Var.h) {
                return;
            }
            iv4 iv4Var = k45Var.B;
            if ((iv4Var == null || !iv4Var.y()) && (e45Var = (e45) v70.b(k45Var, f45.y)) != null) {
                k45Var.B = m50.T(k45Var.E0(), null, new rz(k45Var, e45Var, mu0Var, (byte) 5), 1);
            }
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }

    public final void v(boolean z) {
        rt1 rt1Var;
        mt2 mt2Var = this.n;
        if (mt2Var != null && !mt2Var.y() && (rt1Var = this.m) != null) {
            rt1.g(rt1Var);
        }
        this.z = q();
        h(z);
        p(r42.t);
    }

    public final void w() {
        iv4 iv4Var;
        k45 k45Var = (k45) this.k.t;
        if (k45Var == null || (iv4Var = k45Var.B) == null) {
            return;
        }
        iv4Var.x(null);
        k45Var.B = null;
    }

    public final fp3 x() {
        String str;
        u75 u75Var;
        cj cjVarM = m();
        if (cjVarM == null || (str = cjVarM.t) == null || (u75Var = this.o) == null) {
            return null;
        }
        long j = u75Var.g;
        return new fp3(str, new u75(sp2.y(this.y.j((int) (j >> 32)), this.y.j((int) (j & 4294967295L)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(ou0 ou0Var) {
        a65 a65Var;
        if (ou0Var instanceof a65) {
            a65Var = (a65) ou0Var;
            int i = a65Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a65Var.c = i - Integer.MIN_VALUE;
            } else {
                a65Var = new a65(this, ou0Var);
            }
        } else {
            a65Var = new a65(this, ou0Var);
        }
        Object objValueOf = a65Var.q;
        int i2 = a65Var.c;
        if (i2 == 0) {
            js2.o(objValueOf);
            bi0 bi0Var = this.l;
            if (bi0Var != null) {
                a65Var.m = this;
                a65Var.c = 1;
                if (!(bi0Var instanceof g9)) {
                    l0.t(xi3.t("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", v54.g(bi0Var.getClass()).y()));
                    return null;
                }
                ClipDescription primaryClipDescription = ((g9) bi0Var).g.g().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = px0.j;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = a65Var.m;
        js2.o(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.f.setValue(bool);
        return og5.g;
    }
}
