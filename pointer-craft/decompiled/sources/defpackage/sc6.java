package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sc6 {
    public static ha2 a;
    public static final float j;
    public static final sj0 l;
    public static final nf5 t;
    public static final sj0 x;
    public static final sj0 g = sj0.d;
    public static final sj0 y = sj0.c;
    public static final sj0 r = sj0.f;
    public static final in4 n = in4.q;
    public static final sj0 v = sj0.o;

    static {
        sj0 sj0Var = sj0.b;
        x = sj0Var;
        l = sj0Var;
        j = 80.0f;
        t = nf5.w;
    }

    public static final cl0 g(xy1 xy1Var, h02 h02Var, int i) {
        Context context = (Context) h02Var.a(sa.y);
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (objK == obj) {
            objK = new cl0(context);
            h02Var.i0(objK);
        }
        cl0 cl0Var = (cl0) objK;
        byte b = 1;
        t4 t4Var = new t4(b);
        boolean z = (((i & 14) ^ 6) > 4 && h02Var.x(xy1Var)) || (i & 6) == 4;
        Object objK2 = h02Var.K();
        if (z || objK2 == obj) {
            objK2 = new tf(xy1Var, b);
            h02Var.i0(objK2);
        }
        Object objL = ra.L(t4Var, (xy1) objK2, h02Var, 0);
        boolean zJ = h02Var.j(cl0Var) | h02Var.j(objL);
        Object objK3 = h02Var.K();
        if (zJ || objK3 == obj) {
            objK3 = new m(cl0Var, objL, (byte) 14);
            h02Var.i0(objK3);
        }
        k33.t(cl0Var, objL, (xy1) objK3, h02Var);
        return cl0Var;
    }

    public static /* synthetic */ boolean y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, t16 t16Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(t16Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(t16Var) != obj && atomicReferenceFieldUpdater.get(t16Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
