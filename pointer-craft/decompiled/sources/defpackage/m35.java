package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m35 extends i73 implements lm2, wd1, ej4 {
    public boolean A;
    public int B;
    public int C;
    public List D;
    public xy1 E;
    public xy1 F;
    public Map G;
    public j93 H;
    public k35 I;
    public l35 J;
    public xy1 d;
    public int e;
    public k85 f;
    public ku1 k;
    public cj o;

    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        return R0(zy2Var).g(i, zy2Var.getLayoutDirection());
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    public final j93 Q0() {
        j93 j93Var = this.H;
        if (j93Var != null) {
            return j93Var;
        }
        j93 j93Var2 = new j93(this.o, this.f, this.k, this.e, this.A, this.B, this.C, this.D);
        this.H = j93Var2;
        return j93Var2;
    }

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        List list;
        if (this.h) {
            nb0 nb0VarB = wm2Var.j.t.b();
            j93 j93VarR0 = R0(wm2Var);
            j75 j75Var = j93VarR0.c;
            if (j75Var == null) {
                uo1.j(j93VarR0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            h93 h93Var = j75Var.y;
            boolean z = j75Var.n() && this.e != 3;
            if (z) {
                long j = j75Var.r;
                k44 k44VarR = kq2.r(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                nb0VarB.q();
                nb0.m(nb0VarB, k44VarR);
            }
            try {
                ju4 ju4Var = this.f.g;
                l45 l45Var = ju4Var.w;
                if (l45Var == null) {
                    l45Var = l45.y;
                }
                l45 l45Var2 = l45Var;
                ym4 ym4Var = ju4Var.c;
                if (ym4Var == null) {
                    ym4Var = ym4.n;
                }
                ym4 ym4Var2 = ym4Var;
                yd1 yd1Var = ju4Var.b;
                if (yd1Var == null) {
                    yd1Var = go1.g;
                }
                yd1 yd1Var2 = yd1Var;
                z60 z60VarR = ju4Var.g.r();
                if (z60VarR != null) {
                    q62.v(h93Var, nb0VarB, z60VarR, this.f.g.g.g(), ym4Var2, l45Var2, yd1Var2);
                } else {
                    long jY = jj0.j;
                    if (jY == 16) {
                        jY = this.f.y() != 16 ? this.f.y() : jj0.y;
                    }
                    h93Var.t(nb0VarB, jY, ym4Var2, l45Var2, yd1Var2);
                }
                if (z) {
                    nb0VarB.t();
                }
                l35 l35Var = this.J;
                if (((l35Var == null || !l35Var.n()) ? jr2.A(this.o) : false) || !((list = this.D) == null || list.isEmpty())) {
                    wm2Var.g();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                nb0VarB.t();
                throw th;
            }
        }
    }

    public final j93 R0(j51 j51Var) {
        j93 j93VarG;
        l35 l35Var = this.J;
        if (l35Var != null && l35Var.n() && (j93VarG = l35Var.g()) != null) {
            j93VarG.n(j51Var);
            return j93VarG;
        }
        j93 j93VarQ0 = Q0();
        j93VarQ0.n(j51Var);
        return j93VarQ0;
    }

    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        return js2.n(R0(zy2Var).v(zy2Var.getLayoutDirection()).g());
    }

    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        return R0(zy2Var).g(i, zy2Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xy1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k35] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        k35 k35Var = this.I;
        ?? r0 = k35Var;
        if (k35Var == null) {
            final byte b = 0;
            ?? r1 = new xy1(this) { // from class: k35
                public final /* synthetic */ m35 t;

                {
                    this.t = this;
                }

                @Override // defpackage.xy1
                public final Object a(Object obj) {
                    boolean z;
                    byte b2 = b;
                    j75 j75Var = null;
                    m35 m35Var = this.t;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            j75 j75Var2 = m35Var.Q0().c;
                            if (j75Var2 != null) {
                                i75 i75Var = j75Var2.g;
                                j75 j75Var3 = new j75(new i75(i75Var.g, k85.v(m35Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214), i75Var.r, i75Var.n, i75Var.v, i75Var.x, i75Var.l, i75Var.j, i75Var.t, i75Var.a), j75Var2.y, j75Var2.r);
                                list.add(j75Var3);
                                j75Var = j75Var3;
                            }
                            return Boolean.valueOf(j75Var != null);
                        case 1:
                            cj cjVar = (cj) obj;
                            l35 l35Var = m35Var.J;
                            pi1 pi1Var = pi1.j;
                            if (l35Var == null) {
                                l35 l35Var2 = new l35(m35Var.o, cjVar);
                                j93 j93Var = new j93(cjVar, m35Var.f, m35Var.k, m35Var.e, m35Var.A, m35Var.B, m35Var.C, pi1Var);
                                j93Var.n(m35Var.Q0().a);
                                l35Var2.v(j93Var);
                                m35Var.J = l35Var2;
                            } else if (!yf2.p(cjVar, l35Var.r())) {
                                l35Var.l(cjVar);
                                j93 j93VarG = l35Var.g();
                                if (j93VarG != null) {
                                    k85 k85Var = m35Var.f;
                                    ku1 ku1Var = m35Var.k;
                                    int i = m35Var.e;
                                    boolean z2 = m35Var.A;
                                    int i2 = m35Var.B;
                                    int i3 = m35Var.C;
                                    j93VarG.g = cjVar;
                                    boolean zR = k85Var.r(j93VarG.m);
                                    j93VarG.m = k85Var;
                                    if (!zR) {
                                        j93VarG.s <<= 2;
                                        j93VarG.q = null;
                                        j93VarG.c = null;
                                        j93VarG.b = -1;
                                        j93VarG.i = -1;
                                    }
                                    j93VarG.y = ku1Var;
                                    j93VarG.r = i;
                                    j93VarG.n = z2;
                                    j93VarG.v = i2;
                                    j93VarG.x = i3;
                                    j93VarG.l = pi1Var;
                                    j93VarG.s = (j93VarG.s << 2) | 2;
                                    j93VarG.q = null;
                                    j93VarG.c = null;
                                    j93VarG.b = -1;
                                    j93VarG.i = -1;
                                }
                            }
                            br2.d(m35Var);
                            c93.B(m35Var);
                            c93.A(m35Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            l35 l35Var3 = m35Var.J;
                            if (l35Var3 == null) {
                                z = false;
                            } else {
                                xy1 xy1Var = m35Var.F;
                                if (xy1Var != null) {
                                    xy1Var.a(l35Var3);
                                }
                                l35 l35Var4 = m35Var.J;
                                if (l35Var4 != null) {
                                    l35Var4.x(zBooleanValue);
                                }
                                br2.d(m35Var);
                                c93.B(m35Var);
                                c93.A(m35Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.I = r1;
            r0 = r1;
        }
        cj cjVar = this.o;
        ci2[] ci2VarArr = lj4.g;
        nj4Var.g(kj4.C, pw5.k(cjVar));
        l35 l35Var = this.J;
        if (l35Var != null) {
            cj cjVarR = l35Var.r();
            mj4 mj4Var = kj4.D;
            ci2[] ci2VarArr2 = lj4.g;
            ci2 ci2Var = ci2VarArr2[16];
            mj4Var.getClass();
            nj4Var.g(mj4Var, cjVarR);
            boolean zN = l35Var.n();
            mj4 mj4Var2 = kj4.E;
            ci2 ci2Var2 = ci2VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(zN);
            mj4Var2.getClass();
            nj4Var.g(mj4Var2, boolValueOf);
        }
        final byte b2 = 1;
        nj4Var.g(yi4.q, new p1(null, new xy1(this) { // from class: k35
            public final /* synthetic */ m35 t;

            {
                this.t = this;
            }

            @Override // defpackage.xy1
            public final Object a(Object obj) {
                boolean z;
                byte b3 = b2;
                j75 j75Var = null;
                m35 m35Var = this.t;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        j75 j75Var2 = m35Var.Q0().c;
                        if (j75Var2 != null) {
                            i75 i75Var = j75Var2.g;
                            j75 j75Var3 = new j75(new i75(i75Var.g, k85.v(m35Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214), i75Var.r, i75Var.n, i75Var.v, i75Var.x, i75Var.l, i75Var.j, i75Var.t, i75Var.a), j75Var2.y, j75Var2.r);
                            list.add(j75Var3);
                            j75Var = j75Var3;
                        }
                        return Boolean.valueOf(j75Var != null);
                    case 1:
                        cj cjVar2 = (cj) obj;
                        l35 l35Var2 = m35Var.J;
                        pi1 pi1Var = pi1.j;
                        if (l35Var2 == null) {
                            l35 l35Var3 = new l35(m35Var.o, cjVar2);
                            j93 j93Var = new j93(cjVar2, m35Var.f, m35Var.k, m35Var.e, m35Var.A, m35Var.B, m35Var.C, pi1Var);
                            j93Var.n(m35Var.Q0().a);
                            l35Var3.v(j93Var);
                            m35Var.J = l35Var3;
                        } else if (!yf2.p(cjVar2, l35Var2.r())) {
                            l35Var2.l(cjVar2);
                            j93 j93VarG = l35Var2.g();
                            if (j93VarG != null) {
                                k85 k85Var = m35Var.f;
                                ku1 ku1Var = m35Var.k;
                                int i = m35Var.e;
                                boolean z2 = m35Var.A;
                                int i2 = m35Var.B;
                                int i3 = m35Var.C;
                                j93VarG.g = cjVar2;
                                boolean zR = k85Var.r(j93VarG.m);
                                j93VarG.m = k85Var;
                                if (!zR) {
                                    j93VarG.s <<= 2;
                                    j93VarG.q = null;
                                    j93VarG.c = null;
                                    j93VarG.b = -1;
                                    j93VarG.i = -1;
                                }
                                j93VarG.y = ku1Var;
                                j93VarG.r = i;
                                j93VarG.n = z2;
                                j93VarG.v = i2;
                                j93VarG.x = i3;
                                j93VarG.l = pi1Var;
                                j93VarG.s = (j93VarG.s << 2) | 2;
                                j93VarG.q = null;
                                j93VarG.c = null;
                                j93VarG.b = -1;
                                j93VarG.i = -1;
                            }
                        }
                        br2.d(m35Var);
                        c93.B(m35Var);
                        c93.A(m35Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        l35 l35Var4 = m35Var.J;
                        if (l35Var4 == null) {
                            z = false;
                        } else {
                            xy1 xy1Var = m35Var.F;
                            if (xy1Var != null) {
                                xy1Var.a(l35Var4);
                            }
                            l35 l35Var5 = m35Var.J;
                            if (l35Var5 != null) {
                                l35Var5.x(zBooleanValue);
                            }
                            br2.d(m35Var);
                            c93.B(m35Var);
                            c93.A(m35Var);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final byte b3 = 2;
        nj4Var.g(yi4.w, new p1(null, new xy1(this) { // from class: k35
            public final /* synthetic */ m35 t;

            {
                this.t = this;
            }

            @Override // defpackage.xy1
            public final Object a(Object obj) {
                boolean z;
                byte b4 = b3;
                j75 j75Var = null;
                m35 m35Var = this.t;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        j75 j75Var2 = m35Var.Q0().c;
                        if (j75Var2 != null) {
                            i75 i75Var = j75Var2.g;
                            j75 j75Var3 = new j75(new i75(i75Var.g, k85.v(m35Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214), i75Var.r, i75Var.n, i75Var.v, i75Var.x, i75Var.l, i75Var.j, i75Var.t, i75Var.a), j75Var2.y, j75Var2.r);
                            list.add(j75Var3);
                            j75Var = j75Var3;
                        }
                        return Boolean.valueOf(j75Var != null);
                    case 1:
                        cj cjVar2 = (cj) obj;
                        l35 l35Var2 = m35Var.J;
                        pi1 pi1Var = pi1.j;
                        if (l35Var2 == null) {
                            l35 l35Var3 = new l35(m35Var.o, cjVar2);
                            j93 j93Var = new j93(cjVar2, m35Var.f, m35Var.k, m35Var.e, m35Var.A, m35Var.B, m35Var.C, pi1Var);
                            j93Var.n(m35Var.Q0().a);
                            l35Var3.v(j93Var);
                            m35Var.J = l35Var3;
                        } else if (!yf2.p(cjVar2, l35Var2.r())) {
                            l35Var2.l(cjVar2);
                            j93 j93VarG = l35Var2.g();
                            if (j93VarG != null) {
                                k85 k85Var = m35Var.f;
                                ku1 ku1Var = m35Var.k;
                                int i = m35Var.e;
                                boolean z2 = m35Var.A;
                                int i2 = m35Var.B;
                                int i3 = m35Var.C;
                                j93VarG.g = cjVar2;
                                boolean zR = k85Var.r(j93VarG.m);
                                j93VarG.m = k85Var;
                                if (!zR) {
                                    j93VarG.s <<= 2;
                                    j93VarG.q = null;
                                    j93VarG.c = null;
                                    j93VarG.b = -1;
                                    j93VarG.i = -1;
                                }
                                j93VarG.y = ku1Var;
                                j93VarG.r = i;
                                j93VarG.n = z2;
                                j93VarG.v = i2;
                                j93VarG.x = i3;
                                j93VarG.l = pi1Var;
                                j93VarG.s = (j93VarG.s << 2) | 2;
                                j93VarG.q = null;
                                j93VarG.c = null;
                                j93VarG.b = -1;
                                j93VarG.i = -1;
                            }
                        }
                        br2.d(m35Var);
                        c93.B(m35Var);
                        c93.A(m35Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        l35 l35Var4 = m35Var.J;
                        if (l35Var4 == null) {
                            z = false;
                        } else {
                            xy1 xy1Var = m35Var.F;
                            if (xy1Var != null) {
                                xy1Var.a(l35Var4);
                            }
                            l35 l35Var5 = m35Var.J;
                            if (l35Var5 != null) {
                                l35Var5.x(zBooleanValue);
                            }
                            br2.d(m35Var);
                            c93.B(m35Var);
                            c93.A(m35Var);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        nj4Var.g(yi4.c, new p1(null, new gd4(this, (byte) 8)));
        lj4.g(nj4Var, r0);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            j93 j93VarR0 = R0(v33Var);
            boolean zR = j93VarR0.r(j, v33Var.getLayoutDirection());
            j75 j75Var = j93VarR0.c;
            if (j75Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + j93VarR0);
            }
            long j2 = j75Var.r;
            j75Var.y.g.y();
            if (zR) {
                k33.T(this, 2).g1();
                xy1 xy1Var = this.d;
                if (xy1Var != null) {
                    xy1Var.a(j75Var);
                }
                Map linkedHashMap = this.G;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(y6.g, Integer.valueOf(Math.round(j75Var.n)));
                linkedHashMap.put(y6.y, Integer.valueOf(Math.round(j75Var.v)));
                this.G = linkedHashMap;
            }
            xy1 xy1Var2 = this.E;
            if (xy1Var2 != null) {
                xy1Var2.a(j75Var.x);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            us3 us3VarV = p33Var.v(y94.A(i, i, i2, i2));
            Map map = this.G;
            map.getClass();
            u33 u33VarK0 = v33Var.k0(i, i2, map, new t9(us3VarV, (byte) 6));
            Trace.endSection();
            return u33VarK0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        return js2.n(R0(zy2Var).v(zy2Var.getLayoutDirection()).r());
    }
}
