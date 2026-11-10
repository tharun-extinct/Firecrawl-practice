package defpackage;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class by5 {
    public static ha2 v;
    public static final nm0 g = new nm0(-1647741252, false, new at(2));
    public static final nm0 y = new nm0(1861228154, false, new at(3));
    public static final nm0 r = new nm0(1089710421, false, new os(7));
    public static final nm0 n = new nm0(696711476, false, new os(8));

    public static final void g(wi2 wi2Var, bz1 bz1Var, h02 h02Var, int i) {
        byte b;
        float f;
        float f2;
        ei2 ei2Var;
        bz1 bz1Var2 = bz1Var;
        bz1Var2.getClass();
        h02Var.Z(-124575369);
        int i2 = i | (h02Var.j(wi2Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= h02Var.j(bz1Var2) ? 32 : 16;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4 || h02Var.x(wi2Var);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (z || objK == obj) {
                boolean z2 = wi2Var.y;
                zf5[] zf5VarArr = {ey5.v("Esc", 41, 0.0f, null, 14), ey5.v("F1", 58, 0.0f, null, 14), ey5.v("F2", 59, 0.0f, null, 14), ey5.v("F3", 60, 0.0f, null, 14), ey5.v("F4", 61, 0.0f, null, 14), ey5.v("F5", 62, 0.0f, null, 14), ey5.v("F6", 63, 0.0f, null, 14), ey5.v("F7", 64, 0.0f, null, 14), ey5.v("F8", 65, 0.0f, null, 14), ey5.v("F9", 66, 0.0f, null, 14), ey5.v("F10", 67, 0.0f, null, 14), ey5.v("F11", 68, 0.0f, null, 14), ey5.v("F12", 69, 0.0f, null, 14), ey5.v("Del", 76, 0.0f, null, 14)};
                ei2 ei2Var2 = wi2Var.N;
                zf5 zf5VarN = ei2Var2 != null ? ey5.n(ei2Var2, 53) : null;
                ei2 ei2Var3 = wi2Var.O;
                zf5 zf5VarN2 = ei2Var3 != null ? ey5.n(ei2Var3, 30) : null;
                ei2 ei2Var4 = wi2Var.P;
                zf5 zf5VarN3 = ei2Var4 != null ? ey5.n(ei2Var4, 31) : null;
                ei2 ei2Var5 = wi2Var.Q;
                zf5 zf5VarN4 = ei2Var5 != null ? ey5.n(ei2Var5, 32) : null;
                ei2 ei2Var6 = wi2Var.R;
                zf5 zf5VarN5 = ei2Var6 != null ? ey5.n(ei2Var6, 33) : null;
                ei2 ei2Var7 = wi2Var.S;
                zf5 zf5VarN6 = ei2Var7 != null ? ey5.n(ei2Var7, 34) : null;
                ei2 ei2Var8 = wi2Var.T;
                zf5 zf5VarN7 = ei2Var8 != null ? ey5.n(ei2Var8, 35) : null;
                ei2 ei2Var9 = wi2Var.U;
                zf5 zf5VarN8 = ei2Var9 != null ? ey5.n(ei2Var9, 36) : null;
                ei2 ei2Var10 = wi2Var.V;
                zf5 zf5VarN9 = ei2Var10 != null ? ey5.n(ei2Var10, 37) : null;
                ei2 ei2Var11 = wi2Var.W;
                zf5 zf5VarN10 = ei2Var11 != null ? ey5.n(ei2Var11, 38) : null;
                ei2 ei2Var12 = wi2Var.X;
                zf5 zf5VarN11 = ei2Var12 != null ? ey5.n(ei2Var12, 39) : null;
                ei2 ei2Var13 = wi2Var.Y;
                zf5 zf5VarN12 = ei2Var13 != null ? ey5.n(ei2Var13, 45) : null;
                ei2 ei2Var14 = wi2Var.Z;
                zf5[] zf5VarArr2 = (zf5[]) pr.W(new zf5[]{zf5VarN, zf5VarN2, zf5VarN3, zf5VarN4, zf5VarN5, zf5VarN6, zf5VarN7, zf5VarN8, zf5VarN9, zf5VarN10, zf5VarN11, zf5VarN12, ei2Var14 != null ? ey5.n(ei2Var14, 46) : null, ey5.v("←", 42, 1.7f, null, 12)}).toArray(new zf5[0]);
                zf5 zf5VarV = ey5.v("Tab", 43, 1.5f, null, 12);
                ei2 ei2Var15 = wi2Var.A;
                zf5 zf5VarN13 = ei2Var15 != null ? ey5.n(ei2Var15, 20) : null;
                ei2 ei2Var16 = wi2Var.B;
                zf5 zf5VarN14 = ei2Var16 != null ? ey5.n(ei2Var16, 26) : null;
                ei2 ei2Var17 = wi2Var.C;
                zf5 zf5VarN15 = ei2Var17 != null ? ey5.n(ei2Var17, 8) : null;
                ei2 ei2Var18 = wi2Var.D;
                zf5 zf5VarN16 = ei2Var18 != null ? ey5.n(ei2Var18, 21) : null;
                ei2 ei2Var19 = wi2Var.E;
                zf5 zf5VarN17 = ei2Var19 != null ? ey5.n(ei2Var19, 23) : null;
                ei2 ei2Var20 = wi2Var.F;
                zf5 zf5VarN18 = ei2Var20 != null ? ey5.n(ei2Var20, 28) : null;
                ei2 ei2Var21 = wi2Var.G;
                zf5 zf5VarN19 = ei2Var21 != null ? ey5.n(ei2Var21, 24) : null;
                ei2 ei2Var22 = wi2Var.H;
                zf5 zf5VarN20 = ei2Var22 != null ? ey5.n(ei2Var22, 12) : null;
                ei2 ei2Var23 = wi2Var.I;
                zf5 zf5VarN21 = ei2Var23 != null ? ey5.n(ei2Var23, 18) : null;
                ei2 ei2Var24 = wi2Var.J;
                zf5 zf5VarN22 = ei2Var24 != null ? ey5.n(ei2Var24, 19) : null;
                ei2 ei2Var25 = wi2Var.K;
                zf5 zf5VarN23 = ei2Var25 != null ? ey5.n(ei2Var25, 47) : null;
                ei2 ei2Var26 = wi2Var.L;
                zf5 zf5VarN24 = ei2Var26 != null ? ey5.n(ei2Var26, 48) : null;
                ei2 ei2Var27 = wi2Var.M;
                zf5[] zf5VarArr3 = (zf5[]) pr.W(new zf5[]{zf5VarV, zf5VarN13, zf5VarN14, zf5VarN15, zf5VarN16, zf5VarN17, zf5VarN18, zf5VarN19, zf5VarN20, zf5VarN21, zf5VarN22, zf5VarN23, zf5VarN24, ei2Var27 != null ? ey5.n(ei2Var27, 50) : null}).toArray(new zf5[0]);
                zf5 zf5VarV2 = ey5.v("Caps", 57, 1.7f, null, 12);
                ei2 ei2Var28 = wi2Var.i;
                zf5 zf5VarN25 = ei2Var28 != null ? ey5.n(ei2Var28, 4) : null;
                ei2 ei2Var29 = wi2Var.b;
                zf5 zf5VarN26 = ei2Var29 != null ? ey5.n(ei2Var29, 22) : null;
                ei2 ei2Var30 = wi2Var.s;
                zf5 zf5VarN27 = ei2Var30 != null ? ey5.n(ei2Var30, 7) : null;
                ei2 ei2Var31 = wi2Var.p;
                zf5 zf5VarN28 = ei2Var31 != null ? ey5.n(ei2Var31, 9) : null;
                ei2 ei2Var32 = wi2Var.u;
                zf5 zf5VarN29 = ei2Var32 != null ? ey5.n(ei2Var32, 10) : null;
                ei2 ei2Var33 = wi2Var.z;
                zf5 zf5VarN30 = ei2Var33 != null ? ey5.n(ei2Var33, 11) : null;
                ei2 ei2Var34 = wi2Var.h;
                zf5 zf5VarN31 = ei2Var34 != null ? ey5.n(ei2Var34, 13) : null;
                ei2 ei2Var35 = wi2Var.o;
                zf5 zf5VarN32 = ei2Var35 != null ? ey5.n(ei2Var35, 14) : null;
                ei2 ei2Var36 = wi2Var.f;
                zf5 zf5VarN33 = ei2Var36 != null ? ey5.n(ei2Var36, 15) : null;
                ei2 ei2Var37 = wi2Var.k;
                zf5 zf5VarN34 = ei2Var37 != null ? ey5.n(ei2Var37, 51) : null;
                ei2 ei2Var38 = wi2Var.d;
                zf5 zf5VarN35 = ei2Var38 != null ? ey5.n(ei2Var38, 52) : null;
                ei2 ei2Var39 = wi2Var.e;
                zf5[] zf5VarArr4 = (zf5[]) pr.W(new zf5[]{zf5VarV2, zf5VarN25, zf5VarN26, zf5VarN27, zf5VarN28, zf5VarN29, zf5VarN30, zf5VarN31, zf5VarN32, zf5VarN33, zf5VarN34, zf5VarN35, ei2Var39 != null ? ey5.n(ei2Var39, 49) : null}).toArray(new zf5[0]);
                int i5 = wi2Var.r;
                boolean z3 = i5 == 2;
                boolean z4 = i5 == 3;
                uv2 uv2VarC = pw5.c();
                uv2VarC.add(ey5.v("Shift", 225, z3 ? 2.5f : 1.5f, i63.t, 8));
                if (!z3 && (ei2Var = wi2Var.n) != null) {
                    uv2VarC.add(ey5.n(ei2Var, 100));
                }
                ei2 ei2Var40 = wi2Var.v;
                zf5 zf5VarN36 = ei2Var40 != null ? ey5.n(ei2Var40, 29) : null;
                ei2 ei2Var41 = wi2Var.x;
                zf5 zf5VarN37 = ei2Var41 != null ? ey5.n(ei2Var41, 27) : null;
                ei2 ei2Var42 = wi2Var.l;
                zf5 zf5VarN38 = ei2Var42 != null ? ey5.n(ei2Var42, 6) : null;
                ei2 ei2Var43 = wi2Var.j;
                zf5 zf5VarN39 = ei2Var43 != null ? ey5.n(ei2Var43, 25) : null;
                ei2 ei2Var44 = wi2Var.t;
                zf5 zf5VarN40 = ei2Var44 != null ? ey5.n(ei2Var44, 5) : null;
                ei2 ei2Var45 = wi2Var.a;
                zf5 zf5VarN41 = ei2Var45 != null ? ey5.n(ei2Var45, 17) : null;
                ei2 ei2Var46 = wi2Var.m;
                uv2VarC.addAll(pr.W(new zf5[]{zf5VarN36, zf5VarN37, zf5VarN38, zf5VarN39, zf5VarN40, zf5VarN41, ei2Var46 != null ? ey5.n(ei2Var46, 16) : null}));
                uv2VarC.add(ey5.v("↑", 82, 0.0f, null, 14));
                ei2 ei2Var47 = wi2Var.q;
                zf5 zf5VarN42 = ei2Var47 != null ? ey5.n(ei2Var47, 54) : null;
                ei2 ei2Var48 = wi2Var.w;
                zf5 zf5VarN43 = ei2Var48 != null ? ey5.n(ei2Var48, 55) : null;
                ei2 ei2Var49 = wi2Var.c;
                uv2VarC.addAll(pr.W(new zf5[]{zf5VarN42, zf5VarN43, ei2Var49 != null ? ey5.n(ei2Var49, 56) : null}));
                if (z4) {
                    uv2VarC.add(ey5.v("Ro", 135, 0.0f, null, 14));
                }
                uv2VarC.add(ey5.v("Shift", 229, z4 ? 1.2f : 1.0f, i63.q, 8));
                zf5[] zf5VarArr5 = (zf5[]) pw5.a(uv2VarC).toArray(new zf5[0]);
                uv2 uv2VarC2 = pw5.c();
                i63 i63Var = i63.m;
                i63 i63Var2 = i63.a;
                i63 i63Var3 = i63.j;
                boolean z5 = z4;
                if (z2) {
                    f = 0.0f;
                    uv2VarC2.add(ey5.v("Ctrl", 224, 0.0f, i63Var3, 10));
                    uv2VarC2.add(ey5.v("Opt", 226, 0.0f, i63Var2, 10));
                    uv2VarC2.add(ey5.v("Cmd", 227, 0.0f, i63Var, 10));
                } else {
                    f = 0.0f;
                    uv2VarC2.add(ey5.v("Ctrl", 224, 0.0f, i63Var3, 10));
                    uv2VarC2.add(ey5.v("Win", 227, 0.0f, i63Var, 10));
                    uv2VarC2.add(ey5.v("Alt", 226, 0.0f, i63Var2, 10));
                }
                if (z5) {
                    if (z2) {
                        uv2VarC2.add(ey5.v("EISU", 145, f, null, 14));
                    } else {
                        uv2VarC2.add(ey5.v("無変換", 139, f, null, 14));
                    }
                }
                uv2VarC2.add(ey5.v("Space", 44, z5 ? 2.0f : z2 != 0 ? 3.0f : 3.5f, null, 4));
                if (!z5) {
                    f2 = 0.0f;
                } else if (z2 != 0) {
                    f2 = 0.0f;
                    uv2VarC2.add(ey5.v("KANA", 144, 0.0f, null, 14));
                } else {
                    f2 = 0.0f;
                    uv2VarC2.add(ey5.v("変換", 138, 0.0f, null, 14));
                    uv2VarC2.add(ey5.v("かな", 136, 0.0f, null, 14));
                }
                i63 i63Var4 = i63.w;
                if (z2 != 0) {
                    uv2VarC2.add(ey5.v("Cmd", 231, f2, i63.c, 10));
                    uv2VarC2.add(ey5.v("Opt", 230, f2, i63Var4, 10));
                } else if (!z5) {
                    uv2VarC2.add(ey5.v("Alt Gr", 230, f2, i63Var4, 10));
                }
                uv2VarC2.add(ey5.v("←", 80, f2, null, 14));
                uv2VarC2.add(ey5.v("↓", 81, f2, null, 14));
                uv2VarC2.add(ey5.v("→", 79, f2, null, 14));
                uv2VarC2.add(ey5.v("Enter", 40, z5 ? 2.0f : z2 != 0 ? 2.8f : 2.5f, null, 12));
                objK = new zf5[][]{zf5VarArr, zf5VarArr2, zf5VarArr3, zf5VarArr4, zf5VarArr5, (zf5[]) pw5.a(uv2VarC2).toArray(new zf5[0])};
                h02Var.i0(objK);
            } else {
                i3 = i3;
            }
            zf5[][] zf5VarArr6 = (zf5[][]) objK;
            boolean z6 = i4 == 4 || h02Var.x(wi2Var);
            Object objK2 = h02Var.K();
            if (z6 || objK2 == obj) {
                objK2 = new st4();
                h02Var.i0(objK2);
            }
            st4 st4Var = (st4) objK2;
            boolean zX = h02Var.x(st4Var);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = pt4.y(new qd(st4Var, (byte) 22));
                h02Var.i0(objK3);
            }
            bw4 bw4Var = (bw4) objK3;
            j73 j73VarM = mq4.m(g73.g, 0.0f, 0.0f, 0.0f, 7);
            ek0 ek0VarG = ck0.g(new yq(1.0f, true, new l0((byte) 2)), hi0.h, h02Var, 6);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarM);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, ek0VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            h02Var.X(56131617);
            for (zf5[] zf5VarArr7 : zf5VarArr6) {
                y(new tp2(1.0f, true), bz1Var, zf5VarArr7, st4Var, (uj2) bw4Var.getValue(), h02Var, i3 & 112);
            }
            bz1Var2 = bz1Var;
            b = 1;
            h02Var.b(false);
            h02Var.b(true);
        } else {
            b = 1;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zn(wi2Var, bz1Var2, i, b);
        }
    }

    public static final void n(j73 j73Var, xy1 xy1Var, h02 h02Var, int i) {
        xy1Var.getClass();
        h02Var.Z(2098749273);
        int i2 = (h02Var.x(j73Var) ? 4 : 2) | i | (h02Var.j(xy1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = zj2.i;
                h02Var.i0(objK);
            }
            cz1 cz1Var = (cz1) ((nz1) objK);
            boolean z = (i2 & 112) == 32;
            Object objK2 = h02Var.K();
            if (z || objK2 == l76Var) {
                objK2 = new tf(xy1Var, (byte) 5);
                h02Var.i0(objK2);
            }
            kh6.y(cz1Var, j73Var, (xy1) objK2, h02Var, ((i2 << 3) & 112) | 6);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 19, i, j73Var, xy1Var);
        }
    }

    public static final void r(wi2 wi2Var, ol1 ol1Var, bz1 bz1Var, xy1 xy1Var, my1 my1Var, h02 h02Var, int i) {
        ol1Var.getClass();
        bz1Var.getClass();
        xy1Var.getClass();
        my1Var.getClass();
        h02Var.Z(2050205557);
        int i2 = i | (h02Var.j(wi2Var) ? 4 : 2) | (h02Var.j(ol1Var) ? 32 : 16) | (h02Var.j(bz1Var) ? 256 : 128) | (h02Var.j(xy1Var) ? 2048 : 1024) | (h02Var.j(my1Var) ? 16384 : 8192);
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new ym0((byte) 29);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) xq2.f(objArr, (my1) objK, h02Var);
            Object[] objArr2 = new Object[0];
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new yj2((byte) 0);
                h02Var.i0(objK2);
            }
            iz5.g(null, null, ue5.m0(-227982881, new w61(ob3Var, (ob3) xq2.f(objArr2, (my1) objK2, h02Var), ol1Var, xy1Var, wi2Var, bz1Var, my1Var), h02Var), h02Var, 3072);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vb0(wi2Var, ol1Var, bz1Var, xy1Var, my1Var, i, (byte) 2);
        }
    }

    public static DecimalFormatSymbols v(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static final void y(final j73 j73Var, final bz1 bz1Var, final zf5[] zf5VarArr, final st4 st4Var, final uj2 uj2Var, h02 h02Var, final int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        h02 h02Var2 = h02Var;
        bz1Var.getClass();
        zf5VarArr.getClass();
        st4Var.getClass();
        uj2Var.getClass();
        h02Var2.Z(109684849);
        int i4 = i | (h02Var2.x(j73Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= h02Var2.j(bz1Var) ? 32 : 16;
        }
        int i5 = 2048;
        uj2 uj2Var2 = uj2Var;
        int i6 = i4 | (h02Var2.j(zf5VarArr) ? 256 : 128) | (h02Var2.x(st4Var) ? 2048 : 1024) | (h02Var2.x(uj2Var2) ? 16384 : 8192);
        boolean z3 = true;
        if (h02Var2.N(i6 & 1, (i6 & 9363) != 9362)) {
            kb4 kb4VarG = jb4.g(new yq(1.0f, true, new l0((byte) 2)), hi0.p, h02Var2, 6);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73Var);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, kb4VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            h02Var2.X(-1634295358);
            int length = zf5VarArr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7;
                zf5 zf5Var = zf5VarArr[i8];
                i63 i63Var = zf5Var.x;
                float f = zf5Var.v;
                l76 l76Var = oo0.g;
                if (i63Var != null) {
                    h02Var2.X(1437466556);
                    int i9 = i6 & 7168;
                    boolean z4 = i9 == i5 ? z3 : false;
                    Object objK = h02Var2.K();
                    if (z4 || objK == l76Var) {
                        objK = pt4.y(new o82((Object) st4Var, (Object) zf5Var, (byte) 3));
                        h02Var2.i0(objK);
                    }
                    bw4 bw4Var = (bw4) objK;
                    boolean zJ = h02Var2.j(zf5Var) | h02Var2.x(bw4Var);
                    Object objK2 = h02Var2.K();
                    if (zJ || objK2 == l76Var) {
                        objK2 = new o82((Object) zf5Var, (Object) bw4Var, (byte) 4);
                        h02Var2.i0(objK2);
                    }
                    ((my1) objK2).getClass();
                    if (f <= 0.0d) {
                        kc2.g("invalid weight; must be greater than zero");
                    }
                    if (f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    tp2 tp2Var = new tp2(f, true);
                    boolean zBooleanValue = ((Boolean) bw4Var.getValue()).booleanValue();
                    if (i9 == 2048) {
                        z2 = true;
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    h02Var2 = h02Var;
                    boolean zJ2 = z2 | h02Var2.j(zf5Var) | ((i6 & 112) == 32 ? z : false);
                    Object objK3 = h02Var2.K();
                    if (zJ2 || objK3 == l76Var) {
                        objK3 = new wj2(st4Var, zf5Var, bz1Var);
                        h02Var2.i0(objK3);
                    }
                    i2 = i8;
                    hc6.v(zf5Var, tp2Var, zBooleanValue, (xy1) objK3, h02Var2, 0);
                    h02Var2.b(false);
                    i3 = 2048;
                } else {
                    i2 = i8;
                    boolean z5 = z3;
                    h02Var2.X(1438992035);
                    if (f <= 0.0d) {
                        kc2.g("invalid weight; must be greater than zero");
                    }
                    if (f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    tp2 tp2Var2 = new tp2(f, z5);
                    boolean zJ3 = ((i6 & 112) == 32 ? z5 : false) | h02Var2.j(zf5Var);
                    i3 = 2048;
                    boolean z6 = zJ3 | ((i6 & 7168) == 2048);
                    Object objK4 = h02Var2.K();
                    if (z6 || objK4 == l76Var) {
                        objK4 = new wj2(bz1Var, zf5Var, st4Var);
                        h02Var2.i0(objK4);
                    }
                    hc6.r(zf5Var, tp2Var2, uj2Var2, (xy1) objK4, h02Var2, (i6 >> 6) & 896);
                    h02Var2.b(false);
                }
                uj2Var2 = uj2Var;
                i7 = i2 + 1;
                i5 = i3;
                z3 = true;
            }
            h02Var2.b(false);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: xj2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    by5.y(j73Var, bz1Var, zf5VarArr, st4Var, uj2Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
