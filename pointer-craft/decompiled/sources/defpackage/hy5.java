package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hy5 {
    public static Thread a;
    public static final nm0 j;
    public static final nm0 l;
    public static ha2 t;
    public static final nm0 g = new nm0(876415485, false, new at(4));
    public static final nm0 y = new nm0(-1469517327, false, new os((byte) 19));
    public static final nm0 r = new nm0(1771485793, false, new os((byte) 20));
    public static final nm0 n = new nm0(1409856587, false, new at(6));
    public static final nm0 v = new nm0(-1733594631, false, new os((byte) 10));
    public static final nm0 x = new nm0(815139327, false, new os((byte) 11));

    static {
        new nm0(1548542736, false, new os((byte) 12));
        new nm0(1227698130, false, new os((byte) 13));
        new nm0(722049812, false, new os((byte) 14));
        new nm0(1205780409, false, new os((byte) 15));
        new nm0(1153508345, false, new os((byte) 16));
        new nm0(1730766581, false, new os((byte) 17));
        l = new nm0(1236624662, false, new at((byte) 5));
        j = new nm0(212594877, false, new os((byte) 18));
    }

    public static final void g(boolean z, ya5 ya5Var, ja3 ja3Var, h02 h02Var, int i) {
        h02Var.Z(-627258109);
        int i2 = (h02Var.l(z) ? 4 : 2) | i | (h02Var.x(ya5Var) ? 32 : 16) | (h02Var.x(ja3Var) ? 256 : 128);
        if (!h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            h02Var.Q();
        } else if (z) {
            h02Var.X(756598818);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objK = h02Var.K();
            if (z2 || objK == oo0.g) {
                objK = new s12(ja3Var, ya5Var, null, (byte) 3);
                h02Var.i0(objK);
            }
            k33.b((bz1) objK, h02Var, ja3Var);
            h02Var.b(false);
        } else {
            h02Var.X(757210975);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r80(z, (Object) ya5Var, (Object) ja3Var, i, (byte) 2);
        }
    }

    public static void r() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == a) {
            return;
        }
        l0.z("Must be called on the Main thread.");
    }

    public static final void y(nm0 nm0Var, j73 j73Var, ja3 ja3Var, boolean z, nm0 nm0Var2, h02 h02Var, int i) {
        nm0 nm0Var3;
        ja3 ja3Var2;
        ya5 ya5Var;
        h02Var.Z(-458575864);
        int i2 = i | 48 | (h02Var.l(z) ? 2048 : 1024);
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            Object obj = oo0.g;
            if (ja3Var == null) {
                h02Var.X(857748595);
                Object objK = h02Var.K();
                if (objK == obj) {
                    objK = du4.n(h02Var);
                }
                ja3Var2 = (ja3) objK;
                h02Var.b(false);
            } else {
                h02Var.X(1690236644);
                h02Var.b(false);
                ja3Var2 = ja3Var;
            }
            wa5 wa5VarG = ra5.g(390, h02Var);
            if (z) {
                h02Var.X(857995293);
                Object objK2 = h02Var.K();
                if (objK2 == obj) {
                    objK2 = new jk2();
                    h02Var.i0(objK2);
                }
                ya5Var = (jk2) objK2;
                h02Var.b(false);
            } else {
                h02Var.X(1690246656);
                ac3 ac3Var = new ac3();
                boolean zL = h02Var.l(true) | h02Var.x(ac3Var);
                Object objK3 = h02Var.K();
                if (zL || objK3 == obj) {
                    objK3 = new zz(ac3Var);
                    h02Var.i0(objK3);
                }
                ya5Var = (zz) objK3;
                h02Var.b(false);
            }
            ya5 ya5Var2 = ya5Var;
            u54 u54Var = new u54();
            Object objK4 = h02Var.K();
            if (objK4 == obj) {
                objK4 = kq2.M(null);
                h02Var.i0(objK4);
            }
            u54Var.j = (ob3) objK4;
            Object objK5 = h02Var.K();
            if (objK5 == obj) {
                objK5 = new xa5(new qd(u54Var, (byte) 23), wa5VarG);
                h02Var.i0(objK5);
            }
            nm0Var3 = nm0Var2;
            cz5.g(wa5VarG, ue5.m0(-1572484206, new k6(nm0Var, (xa5) objK5, (byte) 4), h02Var), ya5Var2, false, ue5.m0(-44123786, new k6(u54Var, nm0Var3, (byte) 5), h02Var), h02Var, 102435888, 144);
            g(!z, ya5Var2, ja3Var2, h02Var, 0);
            j73Var = g73.g;
        } else {
            nm0Var3 = nm0Var2;
            h02Var.Q();
        }
        j73 j73Var2 = j73Var;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej2(nm0Var, j73Var2, ja3Var, z, nm0Var3, i);
        }
    }
}
