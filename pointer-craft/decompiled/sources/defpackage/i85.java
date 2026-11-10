package defpackage;

import android.graphics.Paint;
import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i85 extends i73 implements lm2, wd1, ej4 {
    public int A;
    public int B;
    public HashMap C;
    public kp3 D;
    public g85 E;
    public h85 F;
    public int d;
    public boolean e;
    public k85 f;
    public ku1 k;
    public String o;

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        kp3 kp3VarQ0;
        h85 h85Var = this.F;
        if (h85Var == null) {
            kp3VarQ0 = Q0();
        } else {
            if (!h85Var.r()) {
                h85Var = null;
            }
            if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                kp3VarQ0 = Q0();
            }
        }
        kp3VarQ0.n(zy2Var);
        return kp3VarQ0.g(i, zy2Var.getLayoutDirection());
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    public final kp3 Q0() {
        k85 k85Var = this.f;
        kp3 kp3Var = this.D;
        if (kp3Var != null) {
            return kp3Var;
        }
        kp3 kp3Var2 = new kp3(this.o, k85Var, this.k, this.d, this.e, this.A, this.B);
        this.D = kp3Var2;
        return kp3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        kp3 kp3VarQ0;
        if (this.h) {
            h85 h85Var = this.F;
            if (h85Var == null) {
                kp3VarQ0 = Q0();
            } else {
                if (!h85Var.r()) {
                    h85Var = null;
                }
                if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                    kp3VarQ0 = Q0();
                }
            }
            gd gdVar = kp3VarQ0.a;
            if (gdVar == null) {
                pc2.y("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.D + ", textSubstitution=" + this.F + ")");
                l0.x();
                return;
            }
            nb0 nb0VarB = wm2Var.j.t.b();
            boolean z = kp3VarQ0.m;
            if (z) {
                long j = kp3VarQ0.q;
                nb0VarB.q();
                nb0VarB.x(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                k85 k85Var = this.f;
                ju4 ju4Var = k85Var.g;
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
                    gdVar.x(nb0VarB, z60VarR, k85Var.g.g.g(), ym4Var2, l45Var2, yd1Var2);
                } else {
                    long jY = jj0.j;
                    if (jY == 16) {
                        jY = k85Var.y() != 16 ? k85Var.y() : jj0.y;
                    }
                    gdVar.v(nb0VarB, jY, ym4Var2, l45Var2, yd1Var2);
                }
            } finally {
                if (z) {
                    nb0VarB.t();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // defpackage.lm2
    public final int W(zy2 zy2Var, p33 p33Var, int i) {
        kp3 kp3VarQ0;
        h85 h85Var = this.F;
        if (h85Var == null) {
            kp3VarQ0 = Q0();
        } else {
            if (!h85Var.r()) {
                h85Var = null;
            }
            if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                kp3VarQ0 = Q0();
            }
        }
        kp3VarQ0.n(zy2Var);
        return js2.n(kp3VarQ0.v(zy2Var.getLayoutDirection()).g());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        kp3 kp3VarQ0;
        h85 h85Var = this.F;
        if (h85Var == null) {
            kp3VarQ0 = Q0();
        } else {
            if (!h85Var.r()) {
                h85Var = null;
            }
            if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                kp3VarQ0 = Q0();
            }
        }
        kp3VarQ0.n(zy2Var);
        return kp3VarQ0.g(i, zy2Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xy1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g85] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        g85 g85Var = this.E;
        ?? r0 = g85Var;
        if (g85Var == null) {
            final byte b = 0;
            ?? r1 = new xy1(this) { // from class: g85
                public final /* synthetic */ i85 t;

                {
                    this.t = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
                @Override // defpackage.xy1
                public final Object a(Object obj) {
                    j51 j51Var;
                    j75 j75Var;
                    byte b2 = b;
                    boolean z = true;
                    i85 i85Var = this.t;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            kp3 kp3VarQ0 = i85Var.Q0();
                            k85 k85VarV = k85.v(i85Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214);
                            fl2 fl2Var = kp3VarQ0.i;
                            j75 j75Var2 = null;
                            if (fl2Var == null || (j51Var = kp3VarQ0.t) == null) {
                                j75Var = null;
                            } else {
                                cj cjVar = new cj(kp3VarQ0.g);
                                if (kp3VarQ0.a == null || kp3VarQ0.c == null) {
                                    j75Var = null;
                                } else {
                                    long j = kp3VarQ0.b & (-8589934589L);
                                    int i = kp3VarQ0.x;
                                    boolean z2 = kp3VarQ0.v;
                                    int i2 = kp3VarQ0.n;
                                    ku1 ku1Var = kp3VarQ0.r;
                                    pi1 pi1Var = pi1.j;
                                    j75Var = new j75(new i75(cjVar, k85VarV, pi1Var, i, z2, i2, j51Var, fl2Var, ku1Var, j), new h93(new rv(cjVar, j51Var, ku1Var, k85VarV, pi1Var, z2), j, kp3VarQ0.x, kp3VarQ0.n), kp3VarQ0.q);
                                }
                            }
                            if (j75Var != null) {
                                list.add(j75Var);
                                j75Var2 = j75Var;
                            }
                            return Boolean.valueOf(j75Var2 != null);
                        case 1:
                            String str = ((cj) obj).t;
                            h85 h85Var = i85Var.F;
                            if (h85Var == null) {
                                h85 h85Var2 = new h85(i85Var.o, str);
                                kp3 kp3Var = new kp3(str, i85Var.f, i85Var.k, i85Var.d, i85Var.e, i85Var.A, i85Var.B);
                                kp3Var.n(i85Var.Q0().t);
                                h85Var2.n(kp3Var);
                                i85Var.F = h85Var2;
                            } else if (!yf2.p(str, h85Var.y())) {
                                h85Var.x(str);
                                kp3 kp3VarG = h85Var.g();
                                if (kp3VarG != null) {
                                    k85 k85Var = i85Var.f;
                                    ku1 ku1Var2 = i85Var.k;
                                    int i3 = i85Var.d;
                                    boolean z3 = i85Var.e;
                                    int i4 = i85Var.A;
                                    int i5 = i85Var.B;
                                    kp3VarG.g = str;
                                    kp3VarG.y = k85Var;
                                    kp3VarG.r = ku1Var2;
                                    kp3VarG.n = i3;
                                    kp3VarG.v = z3;
                                    kp3VarG.x = i4;
                                    kp3VarG.l = i5;
                                    kp3VarG.u = (kp3VarG.u << 2) | 2;
                                    kp3VarG.r();
                                }
                            }
                            br2.d(i85Var);
                            c93.B(i85Var);
                            c93.A(i85Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            h85 h85Var3 = i85Var.F;
                            if (h85Var3 == null) {
                                z = false;
                            } else {
                                h85Var3.v(zBooleanValue);
                                br2.d(i85Var);
                                c93.B(i85Var);
                                c93.A(i85Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.E = r1;
            r0 = r1;
        }
        cj cjVar = new cj(this.o);
        ci2[] ci2VarArr = lj4.g;
        nj4Var.g(kj4.C, pw5.k(cjVar));
        h85 h85Var = this.F;
        if (h85Var != null) {
            boolean zR = h85Var.r();
            mj4 mj4Var = kj4.E;
            ci2[] ci2VarArr2 = lj4.g;
            ci2 ci2Var = ci2VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(zR);
            mj4Var.getClass();
            nj4Var.g(mj4Var, boolValueOf);
            cj cjVar2 = new cj(h85Var.y());
            mj4 mj4Var2 = kj4.D;
            ci2 ci2Var2 = ci2VarArr2[16];
            mj4Var2.getClass();
            nj4Var.g(mj4Var2, cjVar2);
        }
        final byte b2 = 1;
        nj4Var.g(yi4.q, new p1(null, new xy1(this) { // from class: g85
            public final /* synthetic */ i85 t;

            {
                this.t = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                j51 j51Var;
                j75 j75Var;
                byte b3 = b2;
                boolean z = true;
                i85 i85Var = this.t;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        kp3 kp3VarQ0 = i85Var.Q0();
                        k85 k85VarV = k85.v(i85Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214);
                        fl2 fl2Var = kp3VarQ0.i;
                        j75 j75Var2 = null;
                        if (fl2Var == null || (j51Var = kp3VarQ0.t) == null) {
                            j75Var = null;
                        } else {
                            cj cjVar3 = new cj(kp3VarQ0.g);
                            if (kp3VarQ0.a == null || kp3VarQ0.c == null) {
                                j75Var = null;
                            } else {
                                long j = kp3VarQ0.b & (-8589934589L);
                                int i = kp3VarQ0.x;
                                boolean z2 = kp3VarQ0.v;
                                int i2 = kp3VarQ0.n;
                                ku1 ku1Var = kp3VarQ0.r;
                                pi1 pi1Var = pi1.j;
                                j75Var = new j75(new i75(cjVar3, k85VarV, pi1Var, i, z2, i2, j51Var, fl2Var, ku1Var, j), new h93(new rv(cjVar3, j51Var, ku1Var, k85VarV, pi1Var, z2), j, kp3VarQ0.x, kp3VarQ0.n), kp3VarQ0.q);
                            }
                        }
                        if (j75Var != null) {
                            list.add(j75Var);
                            j75Var2 = j75Var;
                        }
                        return Boolean.valueOf(j75Var2 != null);
                    case 1:
                        String str = ((cj) obj).t;
                        h85 h85Var2 = i85Var.F;
                        if (h85Var2 == null) {
                            h85 h85Var3 = new h85(i85Var.o, str);
                            kp3 kp3Var = new kp3(str, i85Var.f, i85Var.k, i85Var.d, i85Var.e, i85Var.A, i85Var.B);
                            kp3Var.n(i85Var.Q0().t);
                            h85Var3.n(kp3Var);
                            i85Var.F = h85Var3;
                        } else if (!yf2.p(str, h85Var2.y())) {
                            h85Var2.x(str);
                            kp3 kp3VarG = h85Var2.g();
                            if (kp3VarG != null) {
                                k85 k85Var = i85Var.f;
                                ku1 ku1Var2 = i85Var.k;
                                int i3 = i85Var.d;
                                boolean z3 = i85Var.e;
                                int i4 = i85Var.A;
                                int i5 = i85Var.B;
                                kp3VarG.g = str;
                                kp3VarG.y = k85Var;
                                kp3VarG.r = ku1Var2;
                                kp3VarG.n = i3;
                                kp3VarG.v = z3;
                                kp3VarG.x = i4;
                                kp3VarG.l = i5;
                                kp3VarG.u = (kp3VarG.u << 2) | 2;
                                kp3VarG.r();
                            }
                        }
                        br2.d(i85Var);
                        c93.B(i85Var);
                        c93.A(i85Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h85 h85Var4 = i85Var.F;
                        if (h85Var4 == null) {
                            z = false;
                        } else {
                            h85Var4.v(zBooleanValue);
                            br2.d(i85Var);
                            c93.B(i85Var);
                            c93.A(i85Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final byte b3 = 2;
        nj4Var.g(yi4.w, new p1(null, new xy1(this) { // from class: g85
            public final /* synthetic */ i85 t;

            {
                this.t = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                j51 j51Var;
                j75 j75Var;
                byte b4 = b3;
                boolean z = true;
                i85 i85Var = this.t;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        kp3 kp3VarQ0 = i85Var.Q0();
                        k85 k85VarV = k85.v(i85Var.f, jj0.j, 0L, null, null, 0L, 0, 0L, 16777214);
                        fl2 fl2Var = kp3VarQ0.i;
                        j75 j75Var2 = null;
                        if (fl2Var == null || (j51Var = kp3VarQ0.t) == null) {
                            j75Var = null;
                        } else {
                            cj cjVar3 = new cj(kp3VarQ0.g);
                            if (kp3VarQ0.a == null || kp3VarQ0.c == null) {
                                j75Var = null;
                            } else {
                                long j = kp3VarQ0.b & (-8589934589L);
                                int i = kp3VarQ0.x;
                                boolean z2 = kp3VarQ0.v;
                                int i2 = kp3VarQ0.n;
                                ku1 ku1Var = kp3VarQ0.r;
                                pi1 pi1Var = pi1.j;
                                j75Var = new j75(new i75(cjVar3, k85VarV, pi1Var, i, z2, i2, j51Var, fl2Var, ku1Var, j), new h93(new rv(cjVar3, j51Var, ku1Var, k85VarV, pi1Var, z2), j, kp3VarQ0.x, kp3VarQ0.n), kp3VarQ0.q);
                            }
                        }
                        if (j75Var != null) {
                            list.add(j75Var);
                            j75Var2 = j75Var;
                        }
                        return Boolean.valueOf(j75Var2 != null);
                    case 1:
                        String str = ((cj) obj).t;
                        h85 h85Var2 = i85Var.F;
                        if (h85Var2 == null) {
                            h85 h85Var3 = new h85(i85Var.o, str);
                            kp3 kp3Var = new kp3(str, i85Var.f, i85Var.k, i85Var.d, i85Var.e, i85Var.A, i85Var.B);
                            kp3Var.n(i85Var.Q0().t);
                            h85Var3.n(kp3Var);
                            i85Var.F = h85Var3;
                        } else if (!yf2.p(str, h85Var2.y())) {
                            h85Var2.x(str);
                            kp3 kp3VarG = h85Var2.g();
                            if (kp3VarG != null) {
                                k85 k85Var = i85Var.f;
                                ku1 ku1Var2 = i85Var.k;
                                int i3 = i85Var.d;
                                boolean z3 = i85Var.e;
                                int i4 = i85Var.A;
                                int i5 = i85Var.B;
                                kp3VarG.g = str;
                                kp3VarG.y = k85Var;
                                kp3VarG.r = ku1Var2;
                                kp3VarG.n = i3;
                                kp3VarG.v = z3;
                                kp3VarG.x = i4;
                                kp3VarG.l = i5;
                                kp3VarG.u = (kp3VarG.u << 2) | 2;
                                kp3VarG.r();
                            }
                        }
                        br2.d(i85Var);
                        c93.B(i85Var);
                        c93.A(i85Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h85 h85Var4 = i85Var.F;
                        if (h85Var4 == null) {
                            z = false;
                        } else {
                            h85Var4.v(zBooleanValue);
                            br2.d(i85Var);
                            c93.B(i85Var);
                            c93.A(i85Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        nj4Var.g(yi4.c, new p1(null, new gd4(this, (byte) 11)));
        lj4.g(nj4Var, r0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0013, B:13:0x001d, B:15:0x002c, B:16:0x002f, B:18:0x003a, B:20:0x0046, B:21:0x004d, B:24:0x005d, B:26:0x006d, B:28:0x0088, B:30:0x0098, B:29:0x0091, B:25:0x0066, B:31:0x00a5, B:12:0x0019), top: B:37:0x0005 }] */
    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        kp3 kp3VarQ0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            h85 h85Var = this.F;
            if (h85Var == null) {
                kp3VarQ0 = Q0();
            } else {
                if (!h85Var.r()) {
                    h85Var = null;
                }
                if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                    kp3VarQ0 = Q0();
                }
            }
            kp3VarQ0.n(v33Var);
            boolean zY = kp3VarQ0.y(j, v33Var.getLayoutDirection());
            jp3 jp3Var = kp3VarQ0.c;
            if (jp3Var != null) {
                jp3Var.y();
            }
            gd gdVar = kp3VarQ0.a;
            gdVar.getClass();
            h75 h75Var = gdVar.n;
            long j2 = kp3VarQ0.q;
            if (zY) {
                k33.T(this, 2).g1();
                HashMap map = this.C;
                if (map == null) {
                    map = new HashMap(2);
                    this.C = map;
                }
                f72 f72Var = y6.g;
                Paint.FontMetricsInt fontMetricsInt = h75Var.q;
                map.put(f72Var, Integer.valueOf(Math.round(h75Var.j + ((h75Var.l + (-1) != 0 || fontMetricsInt == null) ? h75Var.x.getLineBaseline(0) : h75Var.j(0) - fontMetricsInt.ascent) + 0.0f)));
                f72 f72Var2 = y6.y;
                int i = h75Var.l - 1;
                Paint.FontMetricsInt fontMetricsInt2 = h75Var.q;
                map.put(f72Var2, Integer.valueOf(Math.round(h75Var.j + (fontMetricsInt2 != null ? h75Var.j(i) - fontMetricsInt2.ascent : h75Var.x.getLineBaseline(i)) + 0.0f)));
            }
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            us3 us3VarV = p33Var.v(y94.A(i2, i2, i3, i3));
            HashMap map2 = this.C;
            map2.getClass();
            return v33Var.k0(i2, i3, map2, new t9(us3VarV, (byte) 7));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // defpackage.lm2
    public final int x(zy2 zy2Var, p33 p33Var, int i) {
        kp3 kp3VarQ0;
        h85 h85Var = this.F;
        if (h85Var == null) {
            kp3VarQ0 = Q0();
        } else {
            if (!h85Var.r()) {
                h85Var = null;
            }
            if (h85Var == null || (kp3VarQ0 = h85Var.g()) == null) {
                kp3VarQ0 = Q0();
            }
        }
        kp3VarQ0.n(zy2Var);
        return js2.n(kp3VarQ0.v(zy2Var.getLayoutDirection()).r());
    }
}
