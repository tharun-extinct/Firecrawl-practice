package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {
    public static ha2 A;
    public static final /* synthetic */ int B = 0;
    public static final sj0 a;
    public static final float b;
    public static final float c;
    public static ha2 d;
    public static final /* synthetic */ int e = 0;
    public static final ky2 f;
    public static final l5 g;
    public static final ud h;
    public static final sj0 i;
    public static final d52 k;
    public static final float m;
    public static final ud o;
    public static final sj0 p;
    public static final sj0 q;
    public static final wq r;
    public static final float s;
    public static final ky2 t;
    public static final qq2[] u;
    public static final f73 v;
    public static final sj0 w;
    public static final d93 x;
    public static final ud z;
    public static final wq y = new wq(1);
    public static final vq n = new vq();
    public static final nm0 l = new nm0(-2143290010, false, new hn0(11));
    public static final nm0 j = new nm0(2088250308, false, new hn0(12));

    static {
        byte b2 = 0;
        g = new l5(b2);
        r = new wq(b2);
        byte b3 = 8;
        v = new f73(b3);
        x = new d93(b3);
        new nm0(1639784196, false, new gg((byte) 21));
        new nm0(1540847831, false, new gg((byte) 22));
        new nm0(1528985290, false, new gg((byte) 23));
        new nm0(-462410222, false, new gg((byte) 24));
        t = new ky2("CLOSED", (byte) 2);
        a = sj0.p;
        m = 1.0f;
        q = sj0.u;
        w = sj0.i;
        c = 0.1f;
        i = sj0.b;
        b = 0.38f;
        s = 1.0f;
        p = sj0.q;
        u = new qq2[0];
        z = new ud(1000);
        new ud(1007);
        h = new ud(1008);
        o = new ud(1002);
        f = new ky2("NO_VALUE", (byte) 2);
        k = new d52((byte) 16);
    }

    public static ya1 A(dh2 dh2Var, ih2 ih2Var) {
        return dh2Var instanceof nh2 ? ((nh2) dh2Var).c0(true, ih2Var) : dh2Var.D(ih2Var.w(), true, new fd(ih2Var));
    }

    public static final boolean B(fx0 fx0Var) {
        dh2 dh2Var = (dh2) fx0Var.h(d52.m);
        if (dh2Var != null) {
            return dh2Var.y();
        }
        return true;
    }

    public static final boolean C(aj4 aj4Var) {
        mj4 mj4Var = kj4.u;
        hb3 hb3Var = aj4Var.j;
        Object objL = hb3Var.l(mj4Var);
        if (objL == null) {
            objL = null;
        }
        if (yf2.p(objL, cm1.t)) {
            return false;
        }
        return hb3Var.y(yi4.l) || hb3Var.y(yi4.j);
    }

    public static final float[] D(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] E(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final j73 F(j73 j73Var, xf3 xf3Var, ag3 ag3Var) {
        return j73Var.n(new bg3(xf3Var, ag3Var));
    }

    public static final my0 G(cu1 cu1Var, int i2) {
        int iOrdinal = cu1Var.V0().ordinal();
        my0 my0Var = my0.j;
        if (iOrdinal != 0) {
            my0 my0Var2 = my0.t;
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (cu1VarK == null) {
                    l0.u("ActiveParent with no focused child");
                    return null;
                }
                my0 my0VarG = G(cu1VarK, i2);
                my0 my0Var3 = my0VarG != my0Var ? my0VarG : null;
                if (my0Var3 != null) {
                    return my0Var3;
                }
                if (cu1Var.k) {
                    return my0Var;
                }
                cu1Var.k = true;
                try {
                    pt1 pt1VarS0 = cu1Var.S0();
                    db0 db0Var = new db0(i2);
                    nt1 nt1Var = (nt1) ((ba) k33.W(cu1Var)).getFocusOwner();
                    cu1 cu1VarX = nt1Var.x();
                    pt1VarS0.m.a(db0Var);
                    cu1 cu1VarX2 = nt1Var.x();
                    if (db0Var.r()) {
                        rt1 rt1Var = rt1.y;
                        return my0Var2;
                    }
                    if (cu1VarX == cu1VarX2 || cu1VarX2 == null) {
                        return my0Var;
                    }
                    return rt1.n == rt1.r ? my0Var2 : my0.a;
                } finally {
                    cu1Var.k = false;
                }
            }
            if (iOrdinal == 2) {
                return my0Var2;
            }
            if (iOrdinal != 3) {
                uo1.g();
                return null;
            }
        }
        return my0Var;
    }

    public static final my0 H(cu1 cu1Var, int i2) {
        if (!cu1Var.d) {
            cu1Var.d = true;
            try {
                pt1 pt1VarS0 = cu1Var.S0();
                db0 db0Var = new db0(i2);
                nt1 nt1Var = (nt1) ((ba) k33.W(cu1Var)).getFocusOwner();
                cu1 cu1VarX = nt1Var.x();
                pt1VarS0.a.a(db0Var);
                cu1 cu1VarX2 = nt1Var.x();
                boolean zR = db0Var.r();
                my0 my0Var = my0.t;
                if (zR) {
                    rt1 rt1Var = rt1.y;
                    return my0Var;
                }
                if (cu1VarX != cu1VarX2 && cu1VarX2 != null) {
                    return rt1.n == rt1.r ? my0Var : my0.a;
                }
            } finally {
                cu1Var.d = false;
            }
        }
        return my0.j;
    }

    public static final my0 I(cu1 cu1Var, int i2) {
        i73 i73VarQ;
        ah3 ah3Var;
        int iOrdinal = cu1Var.V0().ordinal();
        my0 my0Var = my0.j;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (cu1VarK != null) {
                    return G(cu1VarK, i2);
                }
                l0.u("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    uo1.g();
                    return null;
                }
                if (!cu1Var.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var = cu1Var.j.q;
                um2 um2VarV = k33.V(cu1Var);
                loop0: while (true) {
                    if (um2VarV == null) {
                        i73VarQ = null;
                        break;
                    }
                    if ((um2VarV.M.x.m & 1024) != 0) {
                        while (i73Var != null) {
                            if ((i73Var.a & 1024) != 0) {
                                i73VarQ = i73Var;
                                rb3 rb3Var = null;
                                while (i73VarQ != null) {
                                    if (i73VarQ instanceof cu1) {
                                        break loop0;
                                    }
                                    if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                        int i3 = 0;
                                        for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                            if ((i73Var2.a & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    i73VarQ = i73Var2;
                                                } else {
                                                    if (rb3Var == null) {
                                                        rb3Var = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ != null) {
                                                        rb3Var.y(i73VarQ);
                                                        i73VarQ = null;
                                                    }
                                                    rb3Var.y(i73Var2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    i73VarQ = k33.Q(rb3Var);
                                }
                            }
                            i73Var = i73Var.q;
                        }
                    }
                    um2VarV = um2VarV.o();
                    i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
                }
                cu1 cu1Var2 = (cu1) i73VarQ;
                if (cu1Var2 == null) {
                    return my0Var;
                }
                int iOrdinal2 = cu1Var2.V0().ordinal();
                if (iOrdinal2 == 0) {
                    return H(cu1Var2, i2);
                }
                if (iOrdinal2 == 1) {
                    return I(cu1Var2, i2);
                }
                if (iOrdinal2 == 2) {
                    return my0.t;
                }
                if (iOrdinal2 != 3) {
                    uo1.g();
                    return null;
                }
                my0 my0VarI = I(cu1Var2, i2);
                my0 my0Var2 = my0VarI != my0Var ? my0VarI : null;
                return my0Var2 == null ? H(cu1Var2, i2) : my0Var2;
            }
        }
        return my0Var;
    }

    public static final boolean J(cu1 cu1Var) {
        rb3 rb3Var;
        ah3 ah3Var;
        boolean z2;
        ah3 ah3Var2;
        nt1 nt1Var = (nt1) ((ba) k33.W(cu1Var)).getFocusOwner();
        cu1 cu1VarX = nt1Var.x();
        xt1 xt1VarV0 = cu1Var.V0();
        if (cu1VarX == cu1Var) {
            cu1Var.R0(xt1VarV0, xt1VarV0);
            return true;
        }
        if ((cu1VarX == null || cu1VarX.o) && !cu1Var.o && !((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).g.K()) {
            return false;
        }
        if (cu1VarX != null) {
            rb3Var = new rb3(new cu1[16]);
            if (!cu1VarX.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73 i73Var = cu1VarX.j.q;
            um2 um2VarV = k33.V(cu1VarX);
            while (um2VarV != null) {
                if ((um2VarV.M.x.m & 1024) != 0) {
                    while (i73Var != null) {
                        if ((i73Var.a & 1024) != 0) {
                            i73 i73VarQ = i73Var;
                            rb3 rb3Var2 = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof cu1) {
                                    rb3Var.y((cu1) i73VarQ);
                                } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                    int i2 = 0;
                                    for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                        if ((i73Var2.a & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                i73VarQ = i73Var2;
                                            } else {
                                                if (rb3Var2 == null) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var2.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var2.y(i73Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var2);
                            }
                        }
                        i73Var = i73Var.q;
                    }
                }
                um2VarV = um2VarV.o();
                i73Var = (um2VarV == null || (ah3Var2 = um2VarV.M) == null) ? null : ah3Var2.v;
            }
        } else {
            rb3Var = null;
        }
        Object[] objArr = new cu1[16];
        Object[] objArr2 = new cu1[16];
        if (!cu1Var.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var3 = cu1Var.j.q;
        um2 um2VarV2 = k33.V(cu1Var);
        boolean z3 = true;
        int i3 = 0;
        int i4 = 0;
        while (um2VarV2 != null) {
            if ((um2VarV2.M.x.m & 1024) != 0) {
                while (i73Var3 != null) {
                    if ((i73Var3.a & 1024) != 0) {
                        i73 i73VarQ2 = i73Var3;
                        rb3 rb3Var3 = null;
                        while (i73VarQ2 != null) {
                            if (i73VarQ2 instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ2;
                                if (yf2.p(rb3Var != null ? Boolean.valueOf(rb3Var.q(cu1Var2)) : null, Boolean.TRUE)) {
                                    int i5 = i3 + 1;
                                    if (objArr.length < i5) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i3] = cu1Var2;
                                    i3 = i5;
                                } else {
                                    nt1Var = nt1Var;
                                    int i6 = i4 + 1;
                                    if (objArr2.length < i6) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i4] = cu1Var2;
                                    i4 = i6;
                                }
                                if (cu1Var2 == cu1VarX) {
                                    z3 = false;
                                }
                                z2 = false;
                            } else {
                                nt1Var = nt1Var;
                                z2 = true;
                            }
                            if (z2 && (i73VarQ2.a & 1024) != 0 && (i73VarQ2 instanceof p41)) {
                                int i7 = 0;
                                for (i73 i73Var4 = ((p41) i73VarQ2).f; i73Var4 != null; i73Var4 = i73Var4.w) {
                                    if ((i73Var4.a & 1024) != 0) {
                                        int i8 = i7 + 1;
                                        if (i8 == 1) {
                                            i73VarQ2 = i73Var4;
                                            i8 = i8;
                                        } else {
                                            rb3 rb3Var4 = rb3Var3 == null ? new rb3(new i73[16]) : rb3Var3;
                                            if (i73VarQ2 != null) {
                                                rb3Var4.y(i73VarQ2);
                                                i73VarQ2 = null;
                                            }
                                            rb3Var4.y(i73Var4);
                                            rb3Var3 = rb3Var4;
                                        }
                                        i7 = i8;
                                    }
                                }
                                if (i7 != 1) {
                                    i73VarQ2 = k33.Q(rb3Var3);
                                }
                            } else {
                                i73VarQ2 = k33.Q(rb3Var3);
                            }
                        }
                    }
                    i73Var3 = i73Var3.q;
                    nt1Var = nt1Var;
                }
            }
            nt1 nt1Var2 = nt1Var;
            um2VarV2 = um2VarV2.o();
            i73Var3 = (um2VarV2 == null || (ah3Var = um2VarV2.M) == null) ? null : ah3Var.v;
            nt1Var = nt1Var2;
        }
        nt1 nt1Var3 = nt1Var;
        if (z3 && cu1VarX != null && !M(cu1VarX, false)) {
            return false;
        }
        mq2.b(cu1Var, new gf((Object) cu1Var, (byte) 7));
        int iOrdinal = cu1Var.V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).t(cu1Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    uo1.g();
                    return false;
                }
                ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).t(cu1Var);
            }
        }
        xt1 xt1Var = xt1.a;
        xt1 xt1Var2 = xt1.j;
        if (z3 && cu1VarX != null) {
            cu1VarX.R0(xt1Var2, xt1Var);
        }
        xt1 xt1Var3 = xt1.t;
        if (rb3Var != null) {
            int i9 = rb3Var.a - 1;
            Object[] objArr5 = rb3Var.j;
            if (i9 < objArr5.length) {
                while (i9 >= 0) {
                    cu1 cu1Var3 = (cu1) objArr5[i9];
                    if (nt1Var3.x() != cu1Var) {
                        return false;
                    }
                    cu1Var3.R0(xt1Var3, xt1Var);
                    i9--;
                }
            }
        }
        int i10 = i4 - 1;
        if (i10 < objArr2.length) {
            while (i10 >= 0) {
                cu1 cu1Var4 = (cu1) objArr2[i10];
                if (nt1Var3.x() != cu1Var) {
                    return false;
                }
                cu1Var4.R0(cu1Var4 == cu1VarX ? xt1Var2 : xt1Var, xt1Var3);
                i10--;
            }
        }
        if (nt1Var3.x() != cu1Var) {
            return false;
        }
        cu1Var.R0(xt1VarV0, xt1Var2);
        return nt1Var3.x() == cu1Var;
    }

    public static void K(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void L(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static final boolean M(cu1 cu1Var, boolean z2) {
        int iOrdinal = cu1Var.V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (!(cu1VarK != null ? M(cu1VarK, z2) : true)) {
                    return false;
                }
                cu1Var.R0(xt1.t, xt1.a);
                return true;
            }
            if (iOrdinal == 2) {
                return z2;
            }
            if (iOrdinal != 3) {
                uo1.g();
                return false;
            }
        }
        return true;
    }

    public static final Object N(fx0 fx0Var, bz1 bz1Var) throws Throwable {
        el1 el1VarG;
        fx0 fx0VarE;
        long jV;
        ex0 ex0Var = f73.t;
        hx0 hx0Var = (hx0) fx0Var.h(ex0Var);
        ni1 ni1Var = ni1.j;
        if (hx0Var == null) {
            el1VarG = w85.g();
            fx0VarE = yf2.E(ni1Var, fx0Var.b(el1VarG), true);
            x21 x21Var = na1.g;
            if (fx0VarE != x21Var && fx0VarE.h(ex0Var) == null) {
                fx0VarE = fx0VarE.b(x21Var);
            }
        } else {
            el1VarG = (el1) w85.g.get();
            fx0VarE = yf2.E(ni1Var, fx0Var, true);
            x21 x21Var2 = na1.g;
            if (fx0VarE != x21Var2 && fx0VarE.h(ex0Var) == null) {
                fx0VarE = fx0VarE.b(x21Var2);
            }
        }
        q30 q30Var = new q30(fx0VarE, Thread.currentThread(), el1VarG);
        q30Var.t0(rx0.j, q30Var, bz1Var);
        el1 el1Var = q30Var.w;
        if (el1Var != null) {
            int i2 = el1.w;
            el1Var.U(false);
        }
        while (true) {
            if (el1Var != null) {
                try {
                    jV = el1Var.V();
                } catch (Throwable th) {
                    if (el1Var != null) {
                        int i3 = el1.w;
                        el1Var.S(false);
                    }
                    throw th;
                }
            } else {
                jV = Long.MAX_VALUE;
            }
            if (q30Var.d0()) {
                break;
            }
            LockSupport.parkNanos(q30Var, jV);
            if (Thread.interrupted()) {
                q30Var.J(new InterruptedException());
            }
        }
        if (el1Var != null) {
            int i4 = el1.w;
            el1Var.S(false);
        }
        Object objV = gp4.V(q30Var.Y());
        hl0 hl0Var = objV instanceof hl0 ? (hl0) objV : null;
        if (hl0Var == null) {
            return objV;
        }
        throw hl0Var.g;
    }

    public static final void O(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final void a(fx0 fx0Var, CancellationException cancellationException) {
        dh2 dh2Var = (dh2) fx0Var.h(d52.m);
        if (dh2Var != null) {
            dh2Var.x(cancellationException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(zo0 zo0Var, j14 j14Var) {
        if (!((i73) zo0Var).j.h) {
            mc2.y("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        tr3 tr3Var = (tr3) k33.V(zo0Var).I;
        tr3Var.getClass();
        return a11.e(tr3Var, j14Var);
    }

    public static pi c(pi piVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) piVar.t.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ri) piVar.a).g;
        }
        return new pi(piVar.j, Float.valueOf(f2), new ri(f3), piVar.m, piVar.q, piVar.w);
    }

    public static final ji0 d(pl5 pl5Var) {
        ji0 ji0Var;
        pl5Var.getClass();
        synchronized (k) {
            ji0Var = (ji0) pl5Var.r("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (ji0Var == null) {
                fx0 fx0Var = ni1.j;
                try {
                    x21 x21Var = na1.g;
                    fx0Var = p03.g.w;
                } catch (IllegalStateException | uh3 unused) {
                }
                ji0 ji0Var2 = new ji0(fx0Var.b(v13.v()));
                pl5Var.g("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", ji0Var2);
                ji0Var = ji0Var2;
            }
        }
        return ji0Var;
    }

    public static final float[] e(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float f(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = l75.g;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? za2.g[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static pi g(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new pi(m50.w, Float.valueOf(f2), new ri(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final ha2 h() {
        ha2 ha2Var = A;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Devices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(4.0f, 6.0f);
        kq3Var.v(18.0f);
        kq3Var.x(22.0f, 4.0f);
        kq3Var.x(4.0f, 4.0f);
        kq3Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        kq3Var.w(11.0f);
        kq3Var.x(0.0f, 17.0f);
        kq3Var.w(3.0f);
        kq3Var.v(14.0f);
        kq3Var.w(-3.0f);
        kq3Var.x(4.0f, 17.0f);
        kq3Var.x(4.0f, 6.0f);
        kq3Var.g();
        kq3Var.j(23.0f, 8.0f);
        kq3Var.v(-6.0f);
        kq3Var.r(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        kq3Var.w(10.0f);
        kq3Var.r(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        kq3Var.v(6.0f);
        kq3Var.r(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kq3Var.x(24.0f, 9.0f);
        kq3Var.r(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kq3Var.g();
        kq3Var.j(22.0f, 17.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(-7.0f);
        kq3Var.v(4.0f);
        kq3Var.w(7.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        A = ha2VarY;
        return ha2VarY;
    }

    public static final ur0 i(uj0 uj0Var, uj0 uj0Var2) {
        if (uj0Var == uj0Var2) {
            return new sr0(uj0Var, uj0Var, 1);
        }
        return (m50.I(uj0Var.y, 12884901888L) && m50.I(uj0Var2.y, 12884901888L)) ? new tr0((c94) uj0Var, (c94) uj0Var2) : new ur0(uj0Var, uj0Var2, 0);
    }

    public static uj0 j(uj0 uj0Var) {
        fn5 fn5Var = c93.s;
        y22 y22Var = y22.m;
        if (m50.I(uj0Var.y, 12884901888L)) {
            c94 c94Var = (c94) uj0Var;
            fn5 fn5Var2 = c94Var.n;
            if (!w(fn5Var2, fn5Var)) {
                return new c94(c94Var.g, c94Var.j, fn5Var, D(q((float[]) y22Var.t, fn5Var2.g(), fn5Var.g()), c94Var.t), c94Var.m, c94Var.c, c94Var.v, c94Var.x, c94Var.l, -1);
            }
        }
        return uj0Var;
    }

    public static final dh2 k(fx0 fx0Var) {
        dh2 dh2Var = (dh2) fx0Var.h(d52.m);
        if (dh2Var != null) {
            return dh2Var;
        }
        l0.b(fx0Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final void l(my1 my1Var, float f2, nm0 nm0Var, h02 h02Var, int i2) {
        float f3;
        ce4 ce4Var;
        h02Var.Z(1369431294);
        int i3 = i2 | (h02Var.j(my1Var) ? 4 : 2) | 48;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new ce4();
                h02Var.i0(objK);
            }
            ce4 ce4Var2 = (ce4) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            boolean z2 = false;
            r54 r54Var = new r54();
            float fE = ((j51) h02Var.a(hp0.j)).e(16.0f);
            r54Var.j = fE;
            boolean zR = h02Var.r(fE);
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            boolean zJ = zR | z2 | h02Var.j(ox0Var);
            Object objK3 = h02Var.K();
            if (zJ || objK3 == l76Var) {
                ce4Var = ce4Var2;
                objK3 = new tc(my1Var, ox0Var, ce4Var, r54Var, null, (byte) 3);
                h02Var.i0(objK3);
            } else {
                ce4Var = ce4Var2;
            }
            sp2.g(6, (bz1) objK3, h02Var, true);
            nm0Var.x(ce4Var, h02Var, 54);
            f3 = 16.0f;
        } else {
            h02Var.Q();
            f3 = f2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ar1(my1Var, f3, nm0Var, i2, (byte) 0);
        }
    }

    public static final Object m(dh2 dh2Var, zz4 zz4Var) {
        dh2Var.x(null);
        Object objM = dh2Var.M(zz4Var);
        return objM == px0.j ? objM : og5.g;
    }

    public static final void n(boolean z2, my1 my1Var, j73 j73Var, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        j73 j73Var2;
        my1Var.getClass();
        h02Var.Z(-826800087);
        int i4 = i2 & 6;
        e60 e60Var = e60.g;
        if (i4 == 0) {
            i3 = (h02Var.x(e60Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.l(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.j(my1Var) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= h02Var.j(nm0Var) ? 16384 : 8192;
        }
        if (h02Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            k00 k00Var = hi0.b;
            g73 g73Var = g73.g;
            j73 j73VarG = e60Var.g(g73Var, k00Var);
            Object objK = h02Var.K();
            byte b2 = 12;
            Object obj = oo0.g;
            if (objK == obj) {
                objK = new q21(b2);
                h02Var.i0(objK);
            }
            ek1 ek1VarA = yj1.a((xy1) objK);
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = new q21(b2);
                h02Var.i0(objK2);
            }
            gp4.n(z2, j73VarG, ek1VarA, yj1.m((xy1) objK2), null, ue5.m0(-300488623, new bb4(my1Var, nm0Var), h02Var), h02Var, ((i5 >> 3) & 14) | 200064, 16);
            j73Var2 = g73Var;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zq1(z2, my1Var, j73Var2, nm0Var, i2);
        }
    }

    public static final float o(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = l75.g;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : za2.g[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final Object p(nh4 nh4Var, long j2, bz1 bz1Var) {
        Unsafe unsafe;
        long j3;
        while (true) {
            nh4 nh4Var2 = nh4Var;
            while (true) {
                if (nh4Var2.m >= j2 && !nh4Var2.n()) {
                    return nh4Var2;
                }
                Object objectVolatile = qr.g.getObjectVolatile(nh4Var2, np0.t);
                ky2 ky2Var = t;
                if (objectVolatile == ky2Var) {
                    return ky2Var;
                }
                nh4Var = (nh4) ((np0) objectVolatile);
                if (nh4Var != null) {
                    break;
                }
                nh4 nh4Var3 = (nh4) bz1Var.l(Long.valueOf(nh4Var2.m + 1), nh4Var2);
                do {
                    unsafe = qr.g;
                    j3 = np0.t;
                    if (unsafe.compareAndSwapObject(nh4Var2, j3, (Object) null, nh4Var3)) {
                        if (nh4Var2.n()) {
                            nh4Var2.v();
                        }
                        nh4Var2 = nh4Var3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(nh4Var2, j3) == null);
            }
        }
    }

    public static final float[] q(float[] fArr, float[] fArr2, float[] fArr3) {
        E(fArr, fArr2);
        E(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrE = e(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return D(fArrE, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final mr3 r(int i2) {
        return new mr3(i2);
    }

    public static final void s(fx0 fx0Var) {
        dh2 dh2Var = (dh2) fx0Var.h(d52.m);
        if (dh2Var != null && !dh2Var.y()) {
            throw dh2Var.k();
        }
    }

    public static final c02 t(c02 c02Var) {
        if (c02Var == null) {
            c02Var = null;
        }
        if (c02Var != null) {
            return c02Var;
        }
        qo0.y("Inconsistent composition");
        l0.x();
        return null;
    }

    public static final er1 u(zn4 zn4Var, fx0 fx0Var, int i2, f70 f70Var) {
        return ((i2 == 0 || i2 == -3) && f70Var == f70.j) ? zn4Var : new ed0(zn4Var, fx0Var, i2, f70Var);
    }

    public static fh2 v() {
        return new fh2(null);
    }

    public static final boolean w(fn5 fn5Var, fn5 fn5Var2) {
        if (fn5Var == fn5Var2) {
            return true;
        }
        return Math.abs(fn5Var.g - fn5Var2.g) < 0.001f && Math.abs(fn5Var.y - fn5Var2.y) < 0.001f;
    }

    public static co4 x(int i2, int i3, f70 f70Var) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i5 = i3 & 4;
        f70 f70Var2 = f70.j;
        if (i5 != 0) {
            f70Var = f70Var2;
        }
        if (i2 < 0) {
            l0.t(xi3.j("extraBufferCapacity cannot be negative, but was ", i2));
            return null;
        }
        if (i4 <= 0 && i2 <= 0 && f70Var != f70Var2) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + f70Var).toString());
        }
        int i6 = i2 + i4;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new co4(i4, i6, f70Var);
    }

    public static m70 y(int i2, int i3, f70 f70Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        f70 f70Var2 = f70.j;
        if (i4 != 0) {
            f70Var = f70Var2;
        }
        if (i2 == -2) {
            if (f70Var != f70Var2) {
                return new rp0(1, f70Var);
            }
            yc0.y.getClass();
            return new m70(xc0.y);
        }
        if (i2 == -1) {
            if (f70Var == f70Var2) {
                return new rp0(1, f70.t);
            }
            l0.u("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return f70Var == f70Var2 ? new m70(0) : new rp0(1, f70Var);
        }
        if (i2 != Integer.MAX_VALUE) {
            return f70Var == f70Var2 ? new m70(i2) : new rp0(i2, f70Var);
        }
        return new m70(Integer.MAX_VALUE);
    }

    public static final ha2 z() {
        ha2 ha2Var = d;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Apps", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(4.0f, 8.0f);
        kq3Var.v(4.0f);
        kq3Var.x(8.0f, 4.0f);
        kq3Var.x(4.0f, 4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        du4.e(kq3Var, 10.0f, 20.0f, 4.0f, -4.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        kq3Var.j(4.0f, 20.0f);
        kq3Var.v(4.0f);
        kq3Var.w(-4.0f);
        kq3Var.x(4.0f, 16.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        kq3Var.j(4.0f, 14.0f);
        kq3Var.v(4.0f);
        kq3Var.w(-4.0f);
        kq3Var.x(4.0f, 10.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        du4.e(kq3Var, 10.0f, 14.0f, 4.0f, -4.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        kq3Var.j(16.0f, 4.0f);
        kq3Var.w(4.0f);
        kq3Var.v(4.0f);
        kq3Var.x(20.0f, 4.0f);
        kq3Var.v(-4.0f);
        kq3Var.g();
        kq3Var.j(10.0f, 8.0f);
        kq3Var.v(4.0f);
        kq3Var.x(14.0f, 4.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        du4.e(kq3Var, 16.0f, 14.0f, 4.0f, -4.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        kq3Var.j(16.0f, 20.0f);
        kq3Var.v(4.0f);
        kq3Var.w(-4.0f);
        kq3Var.v(-4.0f);
        kq3Var.w(4.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        d = ha2VarY;
        return ha2VarY;
    }
}
