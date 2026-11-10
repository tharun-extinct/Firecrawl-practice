package defpackage;

import android.os.Build;
import android.window.BackEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ib6 {
    public static final sj0 A;
    public static final sj0 B;
    public static final sj0 C;
    public static final sj0 D;
    public static final sj0 E;
    public static final sj0 F;
    public static final sj0 G;
    public static final sj0 H;
    public static final sj0 I;
    public static final sj0 J;
    public static final sj0 K;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final sj0 d;
    public static final sj0 e;
    public static final sj0 f;
    public static final sj0 g;
    public static final sj0 h;
    public static final sj0 i;
    public static final float j;
    public static final sj0 k;
    public static final sj0 l;
    public static final sj0 m;
    public static final in4 n;
    public static final sj0 o;
    public static final sj0 p;
    public static final float q;
    public static final sj0 r;
    public static final sj0 s;
    public static final sj0 t;
    public static final sj0 u;
    public static final sj0 v;
    public static final sj0 w;
    public static final float x;
    public static final sj0 y;
    public static final sj0 z;

    static {
        sj0 sj0Var = sj0.b;
        g = sj0Var;
        sj0 sj0Var2 = sj0.u;
        y = sj0Var2;
        r = sj0.A;
        n = in4.m;
        sj0 sj0Var3 = sj0.i;
        v = sj0Var3;
        x = 0.38f;
        l = sj0Var3;
        j = 0.38f;
        t = sj0Var3;
        a = 0.38f;
        m = sj0Var3;
        q = 0.38f;
        w = sj0Var3;
        c = 0.38f;
        i = sj0Var3;
        b = 0.38f;
        sj0 sj0Var4 = sj0.j;
        s = sj0Var4;
        p = sj0Var4;
        u = sj0Var3;
        z = sj0Var4;
        h = sj0Var;
        o = sj0Var4;
        f = sj0Var4;
        k = sj0Var2;
        d = sj0Var3;
        e = sj0Var2;
        A = sj0Var;
        B = sj0Var;
        C = sj0Var;
        D = sj0Var3;
        E = sj0Var;
        F = sj0Var;
        G = sj0Var;
        H = sj0Var;
        I = sj0Var;
        J = sj0Var;
        K = sj0Var;
    }

    public static final void g(int i2, my1 my1Var, xy1 xy1Var, h02 h02Var, List list) {
        h02Var.Z(-1947215135);
        int i3 = i2 | (h02Var.x(list) ? 4 : 2) | (h02Var.j(xy1Var) ? 256 : 128);
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objK = h02Var.K();
            if (z2 || objK == oo0.g) {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(Boolean.TRUE);
                }
                st4 st4Var = new st4();
                st4Var.addAll(arrayList);
                h02Var.i0(st4Var);
                objK = st4Var;
            }
            kq2.v(null, ue5.m0(-448514139, new ys(my1Var, (byte) 15), h02Var), null, null, null, 0, 0L, 0L, null, ue5.m0(625216624, new ya4(list, (st4) objK, xy1Var, b2), h02Var), h02Var, 805306416, 509);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm4((Object) list, my1Var, (Object) xy1Var, i2, (byte) 6);
        }
    }

    public static final ff3 l(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new ff3(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void n(fo5 fo5Var, bz1 bz1Var, un5 un5Var, h02 h02Var, int i2) {
        h02Var.Z(-18562583);
        int i3 = (h02Var.n(fo5Var.ordinal()) ? 4 : 2) | i2 | (h02Var.j(bz1Var) ? 32 : 16) | 128;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                wl5 wl5VarG = rx2.g(h02Var);
                if (wl5VarG == null) {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                un5Var = (un5) js2.A(v54.g(un5.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var), xs2.k(wl5VarG), h02Var);
            } else {
                h02Var.Q();
            }
            int i4 = i3 & (-897);
            h02Var.s();
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = kq2.M(null);
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            Object obj2 = (String) ob3Var.getValue();
            sk2 sk2Var = (sk2) ob3Var2.getValue();
            if (obj2 == null) {
                h02Var.X(1053331135);
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
                Object objK3 = h02Var.K();
                if (z2 || objK3 == obj) {
                    objK3 = new nn5(fo5Var, bz1Var, ob3Var, b2);
                    h02Var.i0(objK3);
                }
                y(un5Var, (xy1) objK3, h02Var, 0);
                h02Var.b(false);
            } else if (sk2Var == null) {
                h02Var.X(1053820935);
                Object objK4 = h02Var.K();
                if (objK4 == obj) {
                    objK4 = new ff(ob3Var2, (byte) 24);
                    h02Var.i0(objK4);
                }
                xy1 xy1Var = (xy1) objK4;
                Object objK5 = h02Var.K();
                if (objK5 == obj) {
                    objK5 = new za4(ob3Var, (byte) 14);
                    h02Var.i0(objK5);
                }
                r(un5Var, xy1Var, (my1) objK5, h02Var, 432);
                h02Var.b(false);
            } else {
                h02Var.X(1054048599);
                boolean zX = h02Var.x(sk2Var);
                Object objK6 = h02Var.K();
                if (zX || objK6 == obj) {
                    un5Var.getClass();
                    un5Var.y.getClass();
                    p04 p04VarZ = tg1.v(sk2Var).z();
                    p04VarZ.getClass();
                    objK6 = lr2.c(p04VarZ);
                    h02Var.i0(objK6);
                }
                List list = (List) objK6;
                Object objK7 = h02Var.K();
                if (objK7 == obj) {
                    objK7 = new za4(ob3Var2, (byte) 15);
                    h02Var.i0(objK7);
                }
                my1 my1Var = (my1) objK7;
                boolean zX2 = h02Var.x(obj2) | ((i4 & 112) == 32);
                Object objK8 = h02Var.K();
                if (zX2 || objK8 == obj) {
                    objK8 = new kn2(bz1Var, obj2, (byte) 28);
                    h02Var.i0(objK8);
                }
                g(48, my1Var, (xy1) objK8, h02Var, list);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        un5 un5Var2 = un5Var;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm4((Object) fo5Var, (Object) bz1Var, (Object) un5Var2, i2, (byte) 5);
        }
    }

    public static final void r(un5 un5Var, xy1 xy1Var, my1 my1Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(1816107677);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(un5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.j(my1Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            kq2.v(null, ue5.m0(-1707414687, new ys(my1Var, (byte) 17), h02Var), null, null, null, 0, 0L, 0L, null, ue5.m0(1598803756, new kn5(b2, xy1Var, og0.s(un5Var.n, h02Var)), h02Var), h02Var, 805306416, 509);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(un5Var, xy1Var, my1Var, i2, (byte) 8);
        }
    }

    public static final void v(b30 b30Var, my1 my1Var, h02 h02Var, int i2) {
        ob3 ob3Var;
        h02Var.Z(-1902376764);
        int i3 = i2 | (h02Var.j(b30Var) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16);
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(Boolean.FALSE);
                h02Var.i0(objK);
            }
            ob3 ob3Var2 = (ob3) objK;
            kq2.v(null, ue5.m0(-286046848, new ys(my1Var, (byte) 14), h02Var), null, null, null, 0, 0L, 0L, null, ue5.m0(-1689306923, new ln5(ob3Var2, b2), h02Var), h02Var, 805306416, 509);
            if (((Boolean) ob3Var2.getValue()).booleanValue()) {
                h02Var.X(-1610632787);
                Object objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    ob3Var = ob3Var2;
                    objK2 = new za4(ob3Var, (byte) 13);
                    h02Var.i0(objK2);
                } else {
                    ob3Var = ob3Var2;
                }
                m50.m((my1) objK2, ue5.m0(-257716419, new ev0(b30Var, ob3Var, (byte) 15), h02Var), h02Var, 54);
                h02Var.b(false);
            } else {
                h02Var.X(-1610247426);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jp4((byte) 6, i2, b30Var, my1Var);
        }
    }

    public static String x(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        fa0 fa0Var = fa0.m;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        fa0 fa0VarF = aj6.f(encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(fa0VarF.j, 0, fa0VarF.y());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return "sha256/".concat(new fa0(bArrDigest).g());
    }

    public static final void y(un5 un5Var, xy1 xy1Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-554097179);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var.j(un5Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            kq2.v(null, null, null, null, null, 0, 0L, 0L, null, ue5.m0(-969674444, new kn5(b2, xy1Var, og0.s(un5Var.x, h02Var)), h02Var), h02Var, 805306368, 511);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej((byte) 7, i2, (Object) un5Var, (Object) xy1Var);
        }
    }
}
