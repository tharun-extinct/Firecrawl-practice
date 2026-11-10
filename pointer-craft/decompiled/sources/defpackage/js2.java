package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class js2 {
    public static ha2 g;

    public static final pl5 A(tf0 tf0Var, wl5 wl5Var, tl5 tl5Var, zx0 zx0Var, h02 h02Var) {
        if (tl5Var == null) {
            tl5Var = xs2.d(wl5Var);
        }
        tl5Var.getClass();
        zx0Var.getClass();
        vl5 vl5VarT = wl5Var.t();
        vl5VarT.getClass();
        kb5 kb5Var = new kb5(vl5VarT, tl5Var, zx0Var);
        String strY = tf0Var.y();
        if (strY != null) {
            return kb5Var.h(tf0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY));
        }
        l0.u("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static int B(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final Object a(gv3 gv3Var, String str, ou0 ou0Var) {
        Object objN = gv3Var.n(str, new nd4((byte) 29), ou0Var);
        return objN == px0.j ? objN : og5.g;
    }

    public static at4 b(at4 at4Var) {
        if (at4Var instanceof bd5) {
            bd5 bd5Var = (bd5) at4Var;
            if (bd5Var.z == zq2.j()) {
                bd5Var.p = null;
                return at4Var;
            }
        }
        if (at4Var instanceof cd5) {
            cd5 cd5Var = (cd5) at4Var;
            if (cd5Var.t == zq2.j()) {
                cd5Var.j = null;
                return at4Var;
            }
        }
        at4 at4VarV = it4.v(at4Var, null, false);
        at4VarV.a();
        return at4VarV;
    }

    public static final String c(int i) {
        return xi3.j("appWidgetLayout-", i);
    }

    public static final so2 d(int i) {
        if (i == 0) {
            return so2.t;
        }
        if (i == 1) {
            return so2.a;
        }
        if (i == 2) {
            return so2.m;
        }
        uo1.d(q6.y(i), "unknown horizontal alignment ");
        return null;
    }

    public static final double e(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        if ((r2 instanceof defpackage.t91) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ro2 f(defpackage.x91 r2, android.content.Context r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = r2 instanceof defpackage.t91
            if (r2 == 0) goto L1a
            goto L28
        Lb:
            x91 r2 = defpackage.ip2.v(r2, r3)
            boolean r3 = r2 instanceof defpackage.s91
            if (r3 == 0) goto L16
            ro2 r2 = defpackage.ro2.t
            return r2
        L16:
            boolean r3 = r2 instanceof defpackage.w91
            if (r3 == 0) goto L1d
        L1a:
            ro2 r2 = defpackage.ro2.a
            return r2
        L1d:
            boolean r3 = r2 instanceof defpackage.u91
            if (r3 == 0) goto L24
            ro2 r2 = defpackage.ro2.m
            return r2
        L24:
            boolean r2 = r2 instanceof defpackage.t91
            if (r2 == 0) goto L2b
        L28:
            ro2 r2 = defpackage.ro2.q
            return r2
        L2b:
            java.lang.String r2 = "After resolution, no other type should be present"
            defpackage.l0.z(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js2.f(x91, android.content.Context):ro2");
    }

    public static final void g(final u21 u21Var, final j73 j73Var, zn3 zn3Var, cm1 cm1Var, j00 j00Var, ts4 ts4Var, boolean z, xf3 xf3Var, d52 d52Var, tb tbVar, final nm0 nm0Var, h02 h02Var, final int i) {
        final zn3 zn3Var2;
        final cm1 cm1Var2;
        final j00 j00Var2;
        final ts4 ts4Var2;
        final boolean z2;
        final xf3 xf3Var2;
        final d52 d52Var2;
        final tb tbVar2;
        ts4 ts4Var3;
        tb tbVarY;
        j00 j00Var3;
        xf3 xf3Var3;
        int i2;
        cm1 cm1Var3;
        zn3 zn3Var3;
        boolean z3;
        h02Var.Z(1860873769);
        int i3 = i | (h02Var.x(u21Var) ? 4 : 2) | (h02Var.x(j73Var) ? 32 : 16) | 911961472;
        if (h02Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                bo3 bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                cm1 cm1Var4 = cm1.c;
                j00 j00Var4 = hi0.u;
                int i4 = (i3 & 14) | 196608;
                po3 po3Var = new po3();
                c11 c11VarG = vu4.g(h02Var);
                Map map = ym5.g;
                zu4 zu4VarB0 = m50.b0(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                Object obj = (j51) h02Var.a(hp0.j);
                j14 j14Var = hp0.c;
                fl2 fl2Var = (fl2) h02Var.a(j14Var);
                boolean zX = ((((i4 & 14) ^ 6) > 4 && h02Var.x(u21Var)) || (i4 & 6) == 4) | h02Var.x(c11VarG) | h02Var.x(zu4VarB0) | h02Var.x(po3Var) | h02Var.x(obj) | h02Var.n(fl2Var.ordinal());
                Object objK = h02Var.K();
                Object obj2 = oo0.g;
                if (zX || objK == obj2) {
                    objK = new ts4(new ji(u21Var, new bb4(u21Var, fl2Var, (byte) 5), po3Var), c11VarG, zu4VarB0);
                    h02Var.i0(objK);
                }
                ts4 ts4Var4 = (ts4) objK;
                int i5 = i3 & (-29360129);
                int i6 = (i3 & 14) | 432;
                fl2 fl2Var2 = (fl2) h02Var.a(j14Var);
                boolean zN = ((((i6 & 14) ^ 6) > 4 && h02Var.x(u21Var)) || (i6 & 6) == 4) | h02Var.n(fl2Var2.ordinal());
                Object objK2 = h02Var.K();
                if (zN || objK2 == obj2) {
                    objK2 = new s21(u21Var, fl2Var2);
                    h02Var.i0(objK2);
                }
                s21 s21Var = (s21) objK2;
                d52 d52Var3 = d52.w;
                ts4Var3 = ts4Var4;
                tbVarY = ln3.y(h02Var);
                j00Var3 = j00Var4;
                xf3Var3 = s21Var;
                i2 = i5;
                cm1Var3 = cm1Var4;
                d52Var2 = d52Var3;
                zn3Var3 = bo3Var;
                z3 = true;
            } else {
                h02Var.Q();
                i2 = i3 & (-29360129);
                zn3Var3 = zn3Var;
                cm1Var3 = cm1Var;
                j00Var3 = j00Var;
                ts4Var3 = ts4Var;
                z3 = z;
                xf3Var3 = xf3Var;
                d52Var2 = d52Var;
                tbVarY = tbVar;
            }
            h02Var.s();
            jr2.y(j73Var, u21Var, zn3Var3, ts4Var3, z3, tbVarY, cm1Var3, xf3Var3, j00Var3, d52Var2, nm0Var, h02Var, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 24576 | 907545984, 1797510);
            tbVar2 = tbVarY;
            j00Var2 = j00Var3;
            xf3Var2 = xf3Var3;
            z2 = z3;
            cm1Var2 = cm1Var3;
            ts4Var2 = ts4Var3;
            zn3Var2 = zn3Var3;
        } else {
            h02Var.Q();
            zn3Var2 = zn3Var;
            cm1Var2 = cm1Var;
            j00Var2 = j00Var;
            ts4Var2 = ts4Var;
            z2 = z;
            xf3Var2 = xf3Var;
            d52Var2 = d52Var;
            tbVar2 = tbVar;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var, zn3Var2, cm1Var2, j00Var2, ts4Var2, z2, xf3Var2, d52Var2, tbVar2, nm0Var, i) { // from class: ho3
                public final /* synthetic */ zn3 a;
                public final /* synthetic */ d52 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ xf3 i;
                public final /* synthetic */ cm1 m;
                public final /* synthetic */ nm0 p;
                public final /* synthetic */ j00 q;
                public final /* synthetic */ tb s;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ ts4 w;

                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iJ = aq2.J(1);
                    js2.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, (h02) obj3, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static Set h(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final ji i(bz1 bz1Var, xy1 xy1Var) {
        f fVar = new f(bz1Var, (byte) 21);
        ue5.f(1, xy1Var);
        return new ji((Object) fVar, (Object) xy1Var, (byte) 29);
    }

    public static final g84 j(Throwable th) {
        th.getClass();
        return new g84(th);
    }

    public static final bp2 k(int i) {
        if (i == 0) {
            return bp2.t;
        }
        if (i == 1) {
            return bp2.a;
        }
        if (i == 2) {
            return bp2.m;
        }
        uo1.d(s6.y(i), "unknown vertical alignment ");
        return null;
    }

    public static int l(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static at4 m() {
        return (at4) it4.y.i();
    }

    public static final int n(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void o(Object obj) {
        if (obj instanceof g84) {
            throw ((g84) obj).j;
        }
    }

    public static Object p(x51 x51Var, my1 my1Var) {
        at4 bd5Var;
        at4 at4Var = (at4) it4.y.i();
        if (at4Var instanceof bd5) {
            bd5 bd5Var2 = (bd5) at4Var;
            if (bd5Var2.z == zq2.j()) {
                xy1 xy1Var = bd5Var2.p;
                xy1 xy1Var2 = bd5Var2.u;
                try {
                    ((bd5) at4Var).p = it4.t(x51Var, xy1Var, true);
                    ((bd5) at4Var).u = xy1Var2;
                    return my1Var.g();
                } finally {
                    bd5Var2.p = xy1Var;
                    bd5Var2.u = xy1Var2;
                }
            }
        }
        if (at4Var == null || (at4Var instanceof nb3)) {
            bd5Var = new bd5(at4Var instanceof nb3 ? (nb3) at4Var : null, x51Var, null, true, false);
        } else {
            bd5Var = at4Var.h(x51Var);
        }
        try {
            at4 at4VarA = bd5Var.a();
            try {
                Object objG = my1Var.g();
                at4.s(at4VarA);
                bd5Var.r();
                return objG;
            } catch (Throwable th) {
                at4.s(at4VarA);
                throw th;
            }
        } catch (Throwable th2) {
            bd5Var.r();
            throw th2;
        }
    }

    public static final ha2 q() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Mouse", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3VarJ = du4.j(20.0f, 9.0f);
        kq3VarJ.r(-0.04f, -4.39f, -3.6f, -7.93f, -8.0f, -7.93f);
        kq3VarJ.a(4.04f, 4.61f, 4.0f, 9.0f);
        kq3VarJ.w(6.0f);
        kq3VarJ.r(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        kq3VarJ.m(8.0f, -3.58f, 8.0f, -8.0f);
        kq3VarJ.x(20.0f, 9.0f);
        kq3VarJ.g();
        kq3VarJ.j(18.0f, 9.0f);
        kq3VarJ.v(-5.0f);
        kq3VarJ.x(13.0f, 3.16f);
        kq3VarJ.r(2.81f, 0.47f, 4.96f, 2.9f, 5.0f, 5.84f);
        kq3VarJ.g();
        kq3VarJ.j(11.0f, 3.16f);
        kq3VarJ.x(11.0f, 9.0f);
        kq3VarJ.x(6.0f, 9.0f);
        kq3VarJ.r(0.04f, -2.94f, 2.19f, -5.37f, 5.0f, -5.84f);
        kq3VarJ.g();
        kq3VarJ.j(18.0f, 15.0f);
        kq3VarJ.r(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        kq3VarJ.m(-6.0f, -2.69f, -6.0f, -6.0f);
        kq3VarJ.w(-4.0f);
        kq3VarJ.v(12.0f);
        kq3VarJ.w(4.0f);
        kq3VarJ.g();
        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static jl4 r(jl4 jl4Var) {
        f13 f13Var = jl4Var.j;
        f13Var.y();
        return f13Var.b > 0 ? jl4Var : jl4.t;
    }

    public static String s(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            l0.u("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final zo2 t(Context context, ah1 ah1Var) {
        ap2 ap2Var;
        qo2 qo2Var;
        yo2 yo2VarI = zo2.i();
        if (ah1Var instanceof bh1) {
            ap2Var = ap2.m;
        } else if (ah1Var instanceof fh1) {
            ap2Var = w(((fh1) ah1Var).r) ? ap2.b : ap2.t;
        } else if (ah1Var instanceof ch1) {
            ap2Var = w(((ch1) ah1Var).r) ? ap2.s : ap2.a;
        } else if (ah1Var instanceof ih1) {
            ap2Var = ap2.q;
        } else if (ah1Var instanceof hh1) {
            ap2Var = ap2.w;
        } else if (ah1Var instanceof eh1) {
            ap2Var = ap2.i;
        } else if (ah1Var instanceof u64) {
            ap2Var = ap2.c;
        } else {
            if (!(ah1Var instanceof gh1)) {
                t94.j(ah1Var.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            ap2Var = ap2.p;
        }
        yo2VarI.n();
        ((zo2) yo2VarI.t).k(ap2Var);
        go5 go5Var = (go5) ah1Var.y().g(cn0.K, null);
        x91 x91Var = w91.g;
        ro2 ro2VarF = f(go5Var != null ? go5Var.g : x91Var, context);
        yo2VarI.n();
        ((zo2) yo2VarI.t).e(ro2VarF);
        k52 k52Var = (k52) ah1Var.y().g(cn0.L, null);
        if (k52Var != null) {
            x91Var = k52Var.g;
        }
        ro2 ro2VarF2 = f(x91Var, context);
        yo2VarI.n();
        ((zo2) yo2VarI.t).z(ro2VarF2);
        int i = 0;
        boolean z = ah1Var.y().g(cn0.I, null) != null;
        yo2VarI.n();
        ((zo2) yo2VarI.t).b(z);
        if (ah1Var.y().g(cn0.J, null) != null) {
            yo2VarI.n();
            ((zo2) yo2VarI.t).o();
        }
        if (ah1Var instanceof eh1) {
            eh1 eh1Var = (eh1) ah1Var;
            byte b = eh1Var.v;
            if (b == 1) {
                qo2Var = qo2.t;
            } else if (b == 0) {
                qo2Var = qo2.a;
            } else {
                if (b != 2) {
                    uo1.d(xt0.g(eh1Var.v), "Unknown content scale ");
                    return null;
                }
                qo2Var = qo2.m;
            }
            yo2VarI.n();
            ((zo2) yo2VarI.t).f(qo2Var);
            boolean z2 = !ra.E(eh1Var);
            yo2VarI.n();
            ((zo2) yo2VarI.t).u(z2);
            boolean z3 = eh1Var.r != null;
            yo2VarI.n();
            ((zo2) yo2VarI.t).p(z3);
            boolean z4 = eh1Var.n != null;
            yo2VarI.n();
            ((zo2) yo2VarI.t).s(z4);
        } else if (ah1Var instanceof ch1) {
            so2 so2VarD = d(((ch1) ah1Var).v);
            yo2VarI.n();
            ((zo2) yo2VarI.t).h(so2VarD);
        } else if (ah1Var instanceof fh1) {
            bp2 bp2VarK = k(((fh1) ah1Var).v);
            yo2VarI.n();
            ((zo2) yo2VarI.t).d(bp2VarK);
        } else if (ah1Var instanceof bh1) {
            bh1 bh1Var = (bh1) ah1Var;
            so2 so2VarD2 = d(bh1Var.n.g);
            yo2VarI.n();
            ((zo2) yo2VarI.t).h(so2VarD2);
            bp2 bp2VarK2 = k(bh1Var.n.y);
            yo2VarI.n();
            ((zo2) yo2VarI.t).d(bp2VarK2);
        }
        if (ah1Var instanceof jh1) {
            ArrayList arrayList = ((jh1) ah1Var).y;
            ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(t(context, (ah1) obj));
            }
            yo2VarI.n();
            ((zo2) yo2VarI.t).w(arrayList2);
        }
        return (zo2) yo2VarI.y();
    }

    public static final sc4 u(h02 h02Var) {
        h02Var.X(1967007413);
        Object[] objArr = new Object[0];
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new lc3((byte) 7);
            h02Var.i0(objK);
        }
        sc4 sc4Var = (sc4) xq2.d(objArr, sc4.q, (my1) objK, h02Var, 384);
        sc4Var.a = (uc4) h02Var.a(wc4.g);
        h02Var.b(false);
        return sc4Var;
    }

    public static void v(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final boolean w(o22 o22Var) {
        return o22Var.r(new rn3((byte) 7));
    }

    public static float x(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x0239  */
    /* JADX WARN: Code duplicated, block: B:159:0x023f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0250  */
    /* JADX WARN: Code duplicated, block: B:167:0x0256  */
    /* JADX WARN: Code duplicated, block: B:173:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x0266  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:180:0x0297  */
    /* JADX WARN: Code duplicated, block: B:183:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:201:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:207:0x0310  */
    /* JADX WARN: Code duplicated, block: B:209:0x0316  */
    /* JADX WARN: Code duplicated, block: B:215:0x032c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0332  */
    /* JADX WARN: Code duplicated, block: B:223:0x0342  */
    /* JADX WARN: Code duplicated, block: B:225:0x0348  */
    /* JADX WARN: Code duplicated, block: B:231:0x0358  */
    /* JADX WARN: Code duplicated, block: B:233:0x035e  */
    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0374  */
    /* JADX WARN: Code duplicated, block: B:247:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x038e  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:254:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:258:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:260:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:267:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:274:0x0406  */
    /* JADX WARN: Code duplicated, block: B:276:0x0417  */
    /* JADX WARN: Code duplicated, block: B:277:0x0419  */
    /* JADX WARN: Code duplicated, block: B:280:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0425  */
    /* JADX WARN: Code duplicated, block: B:286:0x044c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x0459  */
    /* JADX WARN: Code duplicated, block: B:293:0x045b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0474  */
    /* JADX WARN: Code duplicated, block: B:298:0x047a  */
    /* JADX WARN: Code duplicated, block: B:304:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x048d  */
    /* JADX WARN: Code duplicated, block: B:307:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:310:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0166, please report this as an issue */
    public static final void y(final j73 j73Var, final ss2 ss2Var, final zn3 zn3Var, final boolean z, final bq1 bq1Var, final boolean z2, final tb tbVar, r6 r6Var, ar arVar, j00 j00Var, xq xqVar, final xy1 xy1Var, h02 h02Var, final int i, final int i2, final int i3) {
        int i4;
        r6 r6Var2;
        final ar arVar2;
        int i5;
        boolean z3;
        final j00 j00Var2;
        xq xqVar2;
        u34 u34VarP;
        int i6;
        j00 j00Var3;
        j00 j00Var4;
        ar arVar3;
        r6 r6Var3;
        int i7;
        ob3 ob3VarQ;
        byte b;
        boolean z4;
        Object objK;
        l76 l76Var;
        ai2 ai2Var;
        int i8;
        boolean z5;
        Object objK2;
        Object objK3;
        ox0 ox0Var;
        w32 w32Var;
        tg1 tg1Var;
        int i9;
        boolean zN;
        Object is2Var;
        ss2 ss2Var2;
        int i10;
        ai2 ai2Var2;
        um3 um3Var;
        Object obj;
        j73 j73VarU;
        boolean z6;
        Object objK4;
        my1 my1Var;
        s60 s60Var;
        fl2 fl2Var;
        boolean z7;
        boolean zN2;
        Object objK5;
        boolean zN3;
        Object objK6;
        h02Var.Z(924924659);
        if ((i & 6) == 0) {
            i4 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= h02Var.x(ss2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= h02Var.x(zn3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= h02Var.l(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= h02Var.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= h02Var.x(bq1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= h02Var.l(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= h02Var.x(tbVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
            r6Var2 = r6Var;
        } else {
            r6Var2 = r6Var;
            if ((i & 805306368) == 0) {
                i4 |= h02Var.x(r6Var2) ? 536870912 : 268435456;
            }
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
            arVar2 = arVar;
        } else {
            arVar2 = arVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (h02Var.x(arVar2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i13 = i4;
        int i14 = i3 & 2048;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= h02Var.x(j00Var) ? 32 : 16;
        }
        int i15 = i5;
        int i16 = i3 & 4096;
        if (i16 == 0) {
            if ((i2 & 384) == 0) {
                i15 |= h02Var.x(xqVar) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                i15 |= h02Var.j(xy1Var) ? 2048 : 1024;
            }
            if ((i13 & 306783379) == 306783378 || (i15 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i13 & 1, z3)) {
                h02Var.S();
                if ((i & 1) != 0 || h02Var.k()) {
                    i6 = i13 & (-234881025);
                    if (i11 != 0) {
                        r6Var2 = null;
                    }
                    if (i12 != 0) {
                        arVar2 = null;
                    }
                    if (i14 != 0) {
                        j00Var3 = null;
                    } else {
                        j00Var3 = j00Var;
                    }
                    if (i16 != 0) {
                        j00Var4 = j00Var3;
                        arVar3 = arVar2;
                        r6Var3 = r6Var2;
                        xqVar = null;
                    } else {
                        j00Var4 = j00Var3;
                    }
                    h02Var.s();
                    i7 = i6 >> 3;
                    int i17 = i7 & 14;
                    int i18 = ((i15 >> 6) & 112) | i17;
                    ob3VarQ = kq2.Q(xy1Var, h02Var);
                    b = 6;
                    int i19 = i6;
                    z4 = (((i18 & 14) ^ 6) <= 4 && h02Var.x(ss2Var)) || (i18 & 6) == 4;
                    objK = h02Var.K();
                    l76Var = oo0.g;
                    if (z4 || objK == l76Var) {
                        bq2 bq2Var = new bq2();
                        bq2Var.g = new qp3(Integer.MAX_VALUE);
                        bq2Var.y = new qp3(Integer.MAX_VALUE);
                        l76 l76Var2 = l76.q;
                        ln lnVar = new ln(ob3VarQ, b);
                        ro roVar = pt4.g;
                        objK = new ir2(new z51(new un(new z51(lnVar, l76Var2), ss2Var, bq2Var, b), l76Var2), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                        h02Var.i0(objK);
                    }
                    ai2Var = (ai2) objK;
                    i8 = i19 >> 9;
                    int i20 = i8 & 112;
                    int i21 = i17 | i20;
                    z5 = ((((i21 & 112) ^ 48) <= 32 && h02Var.l(z)) || (i21 & 48) == 32) | ((((i21 & 14) ^ 6) <= 4 && h02Var.x(ss2Var)) || (i21 & 6) == 4);
                    objK2 = h02Var.K();
                    if (z5 || objK2 == l76Var) {
                        objK2 = new wr2(ss2Var, z);
                        h02Var.i0(objK2);
                    }
                    tr2 tr2Var = (tr2) objK2;
                    objK3 = h02Var.K();
                    if (objK3 == l76Var) {
                        objK3 = k33.E(h02Var);
                        h02Var.i0(objK3);
                    }
                    ox0Var = (ox0) objK3;
                    w32Var = (w32) h02Var.a(hp0.l);
                    tg1Var = ((Boolean) h02Var.a(hp0.k)).booleanValue() ? null : ix4.g;
                    i9 = i19 & 112;
                    int i22 = i15 << 18;
                    int i23 = (i19 & 65520) | (i8 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i15 << 27) & 1879048192);
                    zN = ((((i23 & 896) ^ 384) <= 256 && h02Var.x(zn3Var)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) <= 32 && h02Var.x(ss2Var)) || (i23 & 48) == 32) | ((((i23 & 7168) ^ 3072) <= 2048 && h02Var.l(false)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) <= 16384 && h02Var.l(z)) || (i23 & 24576) == 16384) | h02Var.n(0) | ((((i23 & 3670016) ^ 1572864) <= 1048576 && h02Var.x(r6Var3)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) <= 8388608 && h02Var.x(j00Var4)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) <= 67108864 && h02Var.x(xqVar)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && h02Var.x(arVar3)) || (i23 & 805306368) == 536870912) | h02Var.x(w32Var) | h02Var.x(tg1Var);
                    Object objK7 = h02Var.K();
                    if (!zN || objK7 == l76Var) {
                        ss2Var2 = ss2Var;
                        i10 = 4;
                        is2Var = new is2(ss2Var2, z, zn3Var, ai2Var, arVar3, xqVar, ox0Var, w32Var, tg1Var, r6Var3, j00Var4);
                        ai2Var2 = ai2Var;
                        h02Var.i0(is2Var);
                    } else {
                        is2Var = objK7;
                        ai2Var2 = ai2Var;
                        i10 = 4;
                        ss2Var2 = ss2Var;
                    }
                    cr2 cr2Var = (cr2) is2Var;
                    if (r4 != 0) {
                        um3Var = um3.j;
                    } else {
                        um3Var = um3.t;
                    }
                    if (z2) {
                        h02Var.X(-2077147368);
                        zN3 = ((((i7 & 14) ^ 6) <= i10 && h02Var.x(ss2Var2)) || (i7 & 6) == i10) | h02Var.n(0);
                        objK6 = h02Var.K();
                        if (zN3) {
                            obj = l76Var;
                        } else {
                            obj = l76Var;
                            if (objK6 == obj) {
                            }
                            j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                            h02Var.b(false);
                        }
                        objK6 = new bs2(ss2Var2);
                        h02Var.i0(objK6);
                        j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                        h02Var.b(false);
                    } else {
                        obj = l76Var;
                        h02Var.X(-2076718545);
                        h02Var.b(false);
                        j73VarU = g73.g;
                    }
                    if (i9 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objK4 = h02Var.K();
                    if (z6 || objK4 == obj) {
                        objK4 = new ur2(ss2Var2, (byte) 1);
                        h02Var.i0(objK4);
                    }
                    my1Var = (my1) objK4;
                    s60Var = (s60) h02Var.a(u60.g);
                    fl2Var = (fl2) h02Var.a(hp0.c);
                    boolean zX = h02Var.x(my1Var);
                    if (((i8 & 14) ^ 6) <= i10 && h02Var.l(false)) {
                        z7 = true;
                    } else if ((i8 & 6) == i10) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zN2 = zX | z7 | h02Var.n(fl2Var.ordinal()) | h02Var.x(s60Var) | (((i20 ^ 48) <= 32 && h02Var.l(z)) || (i8 & 48) == 32);
                    objK5 = h02Var.K();
                    if (zN2 || objK5 == obj) {
                        objK5 = new hx4(my1Var, fl2Var, r4, s60Var);
                        h02Var.i0(objK5);
                    }
                    br2.g(ai2Var2, ue5.n0(og0.D(yf2.P(j73Var.n(ss2Var2.w).n(ss2Var2.c), ai2Var2, tr2Var, um3Var, z2).n(j73VarU), ss2Var2.i), ss2Var2, um3Var, tbVar, z2, bq1Var, ss2Var2.l, (hx4) objK5), ss2Var2.s, cr2Var, h02Var, 0);
                    xqVar2 = xqVar;
                    r6Var2 = r6Var3;
                    j00Var2 = j00Var4;
                    arVar2 = arVar3;
                } else {
                    h02Var.Q();
                    i6 = i13 & (-234881025);
                    j00Var4 = j00Var;
                }
                arVar3 = arVar2;
                r6Var3 = r6Var2;
                h02Var.s();
                i7 = i6 >> 3;
                int i110 = i7 & 14;
                int i111 = ((i15 >> 6) & 112) | i110;
                ob3VarQ = kq2.Q(xy1Var, h02Var);
                b = 6;
                int i112 = i6;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objK = h02Var.K();
                l76Var = oo0.g;
                if (z4) {
                    bq2 bq2Var2 = new bq2();
                    bq2Var2.g = new qp3(Integer.MAX_VALUE);
                    bq2Var2.y = new qp3(Integer.MAX_VALUE);
                    l76 l76Var3 = l76.q;
                    ln lnVar2 = new ln(ob3VarQ, b);
                    ro roVar2 = pt4.g;
                    objK = new ir2(new z51(new un(new z51(lnVar2, l76Var3), ss2Var, bq2Var2, b), l76Var3), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                    h02Var.i0(objK);
                } else {
                    bq2 bq2Var3 = new bq2();
                    bq2Var3.g = new qp3(Integer.MAX_VALUE);
                    bq2Var3.y = new qp3(Integer.MAX_VALUE);
                    l76 l76Var4 = l76.q;
                    ln lnVar3 = new ln(ob3VarQ, b);
                    ro roVar3 = pt4.g;
                    objK = new ir2(new z51(new un(new z51(lnVar3, l76Var4), ss2Var, bq2Var3, b), l76Var4), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                    h02Var.i0(objK);
                }
                ai2Var = (ai2) objK;
                i8 = i112 >> 9;
                int i24 = i8 & 112;
                int i25 = i110 | i24;
                z5 = ((((i25 & 112) ^ 48) <= 32 && h02Var.l(z)) || (i25 & 48) == 32) | ((((i25 & 14) ^ 6) <= 4 && h02Var.x(ss2Var)) || (i25 & 6) == 4);
                objK2 = h02Var.K();
                if (z5) {
                    objK2 = new wr2(ss2Var, z);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new wr2(ss2Var, z);
                    h02Var.i0(objK2);
                }
                tr2 tr2Var2 = (tr2) objK2;
                objK3 = h02Var.K();
                if (objK3 == l76Var) {
                    objK3 = k33.E(h02Var);
                    h02Var.i0(objK3);
                }
                ox0Var = (ox0) objK3;
                w32Var = (w32) h02Var.a(hp0.l);
                tg1Var = ((Boolean) h02Var.a(hp0.k)).booleanValue() ? null : ix4.g;
                i9 = i112 & 112;
                int i26 = i15 << 18;
                int i27 = (i112 & 65520) | (i8 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | ((i15 << 27) & 1879048192);
                if (((i27 & 112) ^ 48) <= 32) {
                }
                zN = ((((i27 & 896) ^ 384) <= 256 && h02Var.x(zn3Var)) || (i27 & 384) == 256) | ((((i27 & 112) ^ 48) <= 32 && h02Var.x(ss2Var)) || (i27 & 48) == 32) | ((((i27 & 7168) ^ 3072) <= 2048 && h02Var.l(false)) || (i27 & 3072) == 2048) | ((((57344 & i27) ^ 24576) <= 16384 && h02Var.l(z)) || (i27 & 24576) == 16384) | h02Var.n(0) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && h02Var.x(r6Var3)) || (i27 & 1572864) == 1048576) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && h02Var.x(j00Var4)) || (i27 & 12582912) == 8388608) | ((((i27 & 234881024) ^ 100663296) <= 67108864 && h02Var.x(xqVar)) || (i27 & 100663296) == 67108864) | ((((i27 & 1879048192) ^ 805306368) <= 536870912 && h02Var.x(arVar3)) || (i27 & 805306368) == 536870912) | h02Var.x(w32Var) | h02Var.x(tg1Var);
                Object objK8 = h02Var.K();
                if (zN) {
                    ss2Var2 = ss2Var;
                    i10 = 4;
                    is2Var = new is2(ss2Var2, z, zn3Var, ai2Var, arVar3, xqVar, ox0Var, w32Var, tg1Var, r6Var3, j00Var4);
                    ai2Var2 = ai2Var;
                    h02Var.i0(is2Var);
                } else {
                    ss2Var2 = ss2Var;
                    i10 = 4;
                    is2Var = new is2(ss2Var2, z, zn3Var, ai2Var, arVar3, xqVar, ox0Var, w32Var, tg1Var, r6Var3, j00Var4);
                    ai2Var2 = ai2Var;
                    h02Var.i0(is2Var);
                }
                cr2 cr2Var2 = (cr2) is2Var;
                if (r4 != 0) {
                    um3Var = um3.j;
                } else {
                    um3Var = um3.t;
                }
                if (z2) {
                    h02Var.X(-2077147368);
                    zN3 = ((((i7 & 14) ^ 6) <= i10 && h02Var.x(ss2Var2)) || (i7 & 6) == i10) | h02Var.n(0);
                    objK6 = h02Var.K();
                    if (zN3) {
                        obj = l76Var;
                        if (objK6 == obj) {
                        }
                        j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                        h02Var.b(false);
                    } else {
                        obj = l76Var;
                    }
                    objK6 = new bs2(ss2Var2);
                    h02Var.i0(objK6);
                    j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                    h02Var.b(false);
                } else {
                    obj = l76Var;
                    h02Var.X(-2076718545);
                    h02Var.b(false);
                    j73VarU = g73.g;
                }
                if (i9 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objK4 = h02Var.K();
                if (z6) {
                    objK4 = new ur2(ss2Var2, (byte) 1);
                    h02Var.i0(objK4);
                } else {
                    objK4 = new ur2(ss2Var2, (byte) 1);
                    h02Var.i0(objK4);
                }
                my1Var = (my1) objK4;
                s60Var = (s60) h02Var.a(u60.g);
                fl2Var = (fl2) h02Var.a(hp0.c);
                boolean zX2 = h02Var.x(my1Var);
                if (((i8 & 14) ^ 6) <= i10) {
                }
                if ((i8 & 6) == i10) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zN2 = zX2 | z7 | h02Var.n(fl2Var.ordinal()) | h02Var.x(s60Var) | (((i24 ^ 48) <= 32 && h02Var.l(z)) || (i8 & 48) == 32);
                objK5 = h02Var.K();
                if (zN2) {
                    objK5 = new hx4(my1Var, fl2Var, r4, s60Var);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new hx4(my1Var, fl2Var, r4, s60Var);
                    h02Var.i0(objK5);
                }
                br2.g(ai2Var2, ue5.n0(og0.D(yf2.P(j73Var.n(ss2Var2.w).n(ss2Var2.c), ai2Var2, tr2Var2, um3Var, z2).n(j73VarU), ss2Var2.i), ss2Var2, um3Var, tbVar, z2, bq1Var, ss2Var2.l, (hx4) objK5), ss2Var2.s, cr2Var2, h02Var, 0);
                xqVar2 = xqVar;
                r6Var2 = r6Var3;
                j00Var2 = j00Var4;
                arVar2 = arVar3;
            } else {
                h02Var.Q();
                j00Var2 = j00Var;
                xqVar2 = xqVar;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                final r6 r6Var4 = r6Var2;
                final xq xqVar3 = xqVar2;
                u34VarP.n = new bz1() { // from class: gs2
                    @Override // defpackage.bz1
                    public final Object l(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iJ = aq2.J(i | 1);
                        int iJ2 = aq2.J(i2);
                        js2.y(j73Var, ss2Var, zn3Var, z, bq1Var, z2, tbVar, r6Var4, arVar2, j00Var2, xqVar3, xy1Var, (h02) obj2, iJ, iJ2, i3);
                        return og5.g;
                    }
                };
            }
        }
        i15 |= 384;
        if ((i2 & 3072) != 0) {
            i15 |= h02Var.j(xy1Var) ? 2048 : 1024;
        }
        if ((i13 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (h02Var.N(i13 & 1, z3)) {
            h02Var.S();
            if ((i & 1) != 0) {
                i6 = i13 & (-234881025);
                if (i11 != 0) {
                    r6Var2 = null;
                }
                if (i12 != 0) {
                    arVar2 = null;
                }
                if (i14 != 0) {
                    j00Var3 = null;
                } else {
                    j00Var3 = j00Var;
                }
                if (i16 != 0) {
                    j00Var4 = j00Var3;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                    xqVar = null;
                } else {
                    j00Var4 = j00Var3;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                }
            } else {
                i6 = i13 & (-234881025);
                if (i11 != 0) {
                    r6Var2 = null;
                }
                if (i12 != 0) {
                    arVar2 = null;
                }
                if (i14 != 0) {
                    j00Var3 = null;
                } else {
                    j00Var3 = j00Var;
                }
                if (i16 != 0) {
                    j00Var4 = j00Var3;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                    xqVar = null;
                } else {
                    j00Var4 = j00Var3;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                }
            }
            h02Var.s();
            i7 = i6 >> 3;
            int i113 = i7 & 14;
            int i114 = ((i15 >> 6) & 112) | i113;
            ob3VarQ = kq2.Q(xy1Var, h02Var);
            b = 6;
            int i115 = i6;
            if (((i114 & 14) ^ 6) <= 4) {
            }
            objK = h02Var.K();
            l76Var = oo0.g;
            if (z4) {
                bq2 bq2Var4 = new bq2();
                bq2Var4.g = new qp3(Integer.MAX_VALUE);
                bq2Var4.y = new qp3(Integer.MAX_VALUE);
                l76 l76Var5 = l76.q;
                ln lnVar4 = new ln(ob3VarQ, b);
                ro roVar4 = pt4.g;
                objK = new ir2(new z51(new un(new z51(lnVar4, l76Var5), ss2Var, bq2Var4, b), l76Var5), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                h02Var.i0(objK);
            } else {
                bq2 bq2Var5 = new bq2();
                bq2Var5.g = new qp3(Integer.MAX_VALUE);
                bq2Var5.y = new qp3(Integer.MAX_VALUE);
                l76 l76Var6 = l76.q;
                ln lnVar5 = new ln(ob3VarQ, b);
                ro roVar5 = pt4.g;
                objK = new ir2(new z51(new un(new z51(lnVar5, l76Var6), ss2Var, bq2Var5, b), l76Var6), bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1);
                h02Var.i0(objK);
            }
            ai2Var = (ai2) objK;
            i8 = i115 >> 9;
            int i28 = i8 & 112;
            int i29 = i113 | i28;
            z5 = ((((i29 & 112) ^ 48) <= 32 && h02Var.l(z)) || (i29 & 48) == 32) | ((((i29 & 14) ^ 6) <= 4 && h02Var.x(ss2Var)) || (i29 & 6) == 4);
            objK2 = h02Var.K();
            if (z5) {
                objK2 = new wr2(ss2Var, z);
                h02Var.i0(objK2);
            } else {
                objK2 = new wr2(ss2Var, z);
                h02Var.i0(objK2);
            }
            tr2 tr2Var3 = (tr2) objK2;
            objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = k33.E(h02Var);
                h02Var.i0(objK3);
            }
            ox0Var = (ox0) objK3;
            w32Var = (w32) h02Var.a(hp0.l);
            tg1Var = ((Boolean) h02Var.a(hp0.k)).booleanValue() ? null : ix4.g;
            i9 = i115 & 112;
            int i210 = i15 << 18;
            int i211 = (i115 & 65520) | (i8 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | ((i15 << 27) & 1879048192);
            if (((i211 & 112) ^ 48) <= 32) {
            }
            zN = ((((i211 & 896) ^ 384) <= 256 && h02Var.x(zn3Var)) || (i211 & 384) == 256) | ((((i211 & 112) ^ 48) <= 32 && h02Var.x(ss2Var)) || (i211 & 48) == 32) | ((((i211 & 7168) ^ 3072) <= 2048 && h02Var.l(false)) || (i211 & 3072) == 2048) | ((((57344 & i211) ^ 24576) <= 16384 && h02Var.l(z)) || (i211 & 24576) == 16384) | h02Var.n(0) | ((((i211 & 3670016) ^ 1572864) <= 1048576 && h02Var.x(r6Var3)) || (i211 & 1572864) == 1048576) | ((((i211 & 29360128) ^ 12582912) <= 8388608 && h02Var.x(j00Var4)) || (i211 & 12582912) == 8388608) | ((((i211 & 234881024) ^ 100663296) <= 67108864 && h02Var.x(xqVar)) || (i211 & 100663296) == 67108864) | ((((i211 & 1879048192) ^ 805306368) <= 536870912 && h02Var.x(arVar3)) || (i211 & 805306368) == 536870912) | h02Var.x(w32Var) | h02Var.x(tg1Var);
            Object objK9 = h02Var.K();
            if (zN) {
                ss2Var2 = ss2Var;
                i10 = 4;
                is2Var = new is2(ss2Var2, z, zn3Var, ai2Var, arVar3, xqVar, ox0Var, w32Var, tg1Var, r6Var3, j00Var4);
                ai2Var2 = ai2Var;
                h02Var.i0(is2Var);
            } else {
                ss2Var2 = ss2Var;
                i10 = 4;
                is2Var = new is2(ss2Var2, z, zn3Var, ai2Var, arVar3, xqVar, ox0Var, w32Var, tg1Var, r6Var3, j00Var4);
                ai2Var2 = ai2Var;
                h02Var.i0(is2Var);
            }
            cr2 cr2Var3 = (cr2) is2Var;
            if (r4 != 0) {
                um3Var = um3.j;
            } else {
                um3Var = um3.t;
            }
            if (z2) {
                h02Var.X(-2077147368);
                zN3 = ((((i7 & 14) ^ 6) <= i10 && h02Var.x(ss2Var2)) || (i7 & 6) == i10) | h02Var.n(0);
                objK6 = h02Var.K();
                if (zN3) {
                    obj = l76Var;
                    if (objK6 == obj) {
                    }
                    j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                    h02Var.b(false);
                } else {
                    obj = l76Var;
                }
                objK6 = new bs2(ss2Var2);
                h02Var.i0(objK6);
                j73VarU = m50.U((bs2) objK6, ss2Var2.b, um3Var);
                h02Var.b(false);
            } else {
                obj = l76Var;
                h02Var.X(-2076718545);
                h02Var.b(false);
                j73VarU = g73.g;
            }
            if (i9 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objK4 = h02Var.K();
            if (z6) {
                objK4 = new ur2(ss2Var2, (byte) 1);
                h02Var.i0(objK4);
            } else {
                objK4 = new ur2(ss2Var2, (byte) 1);
                h02Var.i0(objK4);
            }
            my1Var = (my1) objK4;
            s60Var = (s60) h02Var.a(u60.g);
            fl2Var = (fl2) h02Var.a(hp0.c);
            boolean zX3 = h02Var.x(my1Var);
            if (((i8 & 14) ^ 6) <= i10) {
            }
            if ((i8 & 6) == i10) {
                z7 = true;
            } else {
                z7 = false;
            }
            zN2 = zX3 | z7 | h02Var.n(fl2Var.ordinal()) | h02Var.x(s60Var) | (((i28 ^ 48) <= 32 && h02Var.l(z)) || (i8 & 48) == 32);
            objK5 = h02Var.K();
            if (zN2) {
                objK5 = new hx4(my1Var, fl2Var, r4, s60Var);
                h02Var.i0(objK5);
            } else {
                objK5 = new hx4(my1Var, fl2Var, r4, s60Var);
                h02Var.i0(objK5);
            }
            br2.g(ai2Var2, ue5.n0(og0.D(yf2.P(j73Var.n(ss2Var2.w).n(ss2Var2.c), ai2Var2, tr2Var3, um3Var, z2).n(j73VarU), ss2Var2.i), ss2Var2, um3Var, tbVar, z2, bq1Var, ss2Var2.l, (hx4) objK5), ss2Var2.s, cr2Var3, h02Var, 0);
            xqVar2 = xqVar;
            r6Var2 = r6Var3;
            j00Var2 = j00Var4;
            arVar2 = arVar3;
        } else {
            h02Var.Q();
            j00Var2 = j00Var;
            xqVar2 = xqVar;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            final r6 r6Var5 = r6Var2;
            final xq xqVar4 = xqVar2;
            u34VarP.n = new bz1() { // from class: gs2
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(i | 1);
                    int iJ2 = aq2.J(i2);
                    js2.y(j73Var, ss2Var, zn3Var, z, bq1Var, z2, tbVar, r6Var5, arVar2, j00Var2, xqVar4, xy1Var, (h02) obj2, iJ, iJ2, i3);
                    return og5.g;
                }
            };
        }
    }

    public static void z(at4 at4Var, at4 at4Var2, xy1 xy1Var) {
        if (at4Var != at4Var2) {
            at4Var2.getClass();
            at4.s(at4Var);
            at4Var2.r();
        } else if (at4Var instanceof bd5) {
            ((bd5) at4Var).p = xy1Var;
        } else if (at4Var instanceof cd5) {
            ((cd5) at4Var).j = xy1Var;
        } else {
            l0.b(at4Var, "Non-transparent snapshot was reused: ");
        }
    }
}
