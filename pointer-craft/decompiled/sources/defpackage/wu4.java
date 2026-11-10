package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wu4 {
    public float a;
    public float c;
    public boolean i;
    public final Object n;
    public final ra v;
    public xu4 w;
    public static final qf1 b = new qf1(1);
    public static final qf1 s = new qf1(2);
    public static final qf1 p = new qf1(3);
    public static final qf1 u = new qf1(4);
    public static final qf1 z = new qf1(5);
    public static final qf1 h = new qf1(0);
    public float g = 0.0f;
    public float y = Float.MAX_VALUE;
    public boolean r = false;
    public boolean x = false;
    public final float l = Float.MAX_VALUE;
    public final float j = -3.4028235E38f;
    public long t = 0;
    public final ArrayList m = new ArrayList();
    public final ArrayList q = new ArrayList();

    public wu4(Object obj, ra raVar) {
        this.n = obj;
        this.v = raVar;
        if (raVar == p || raVar == u || raVar == z) {
            this.a = 0.1f;
        } else if (raVar == h) {
            this.a = 0.00390625f;
        } else if (raVar == b || raVar == s) {
            this.a = 0.002f;
        } else {
            this.a = 1.0f;
        }
        this.w = null;
        this.c = Float.MAX_VALUE;
        this.i = false;
    }

    public static ki y() {
        ThreadLocal threadLocal = ki.t;
        if (threadLocal.get() == null) {
            threadLocal.set(new ki(new ji((byte) 0)));
        }
        return (ki) threadLocal.get();
    }

    public final void g(float f) {
        if (this.x) {
            this.c = f;
            return;
        }
        xu4 xu4Var = this.w;
        if (xu4Var == null) {
            xu4Var = new xu4(f);
            this.w = xu4Var;
        }
        double d = f;
        xu4Var.t = d;
        double d2 = (float) d;
        float f2 = this.l;
        if (d2 > f2) {
            uo1.u("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f3 = this.j;
        if (d2 < f3) {
            uo1.u("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.a * 0.75f);
        xu4Var.n = dAbs;
        xu4Var.v = dAbs * 62.5d;
        if (Thread.currentThread() != ((Looper) y().v.a).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z2 = this.x;
        if (z2 || z2) {
            return;
        }
        this.x = true;
        if (!this.r) {
            this.y = this.v.C(this.n);
        }
        float f4 = this.y;
        if (f4 > f2 || f4 < f3) {
            l0.u("Starting value need to be in between min value and max value");
            return;
        }
        ki kiVarY = y();
        ArrayList arrayList = kiVarY.y;
        if (arrayList.size() == 0) {
            ((Choreographer) kiVarY.v.t).postFrameCallback(new ii(kiVarY.n));
            if (Build.VERSION.SDK_INT >= 33) {
                kiVarY.l = ValueAnimator.getDurationScale();
                cd2 cd2Var = kiVarY.j;
                if (cd2Var == null) {
                    cd2Var = new cd2(kiVarY);
                    kiVarY.j = cd2Var;
                }
                cd2Var.F();
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void n() {
        if (this.w.y <= 0.0d) {
            uo1.u("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ((Looper) y().v.a).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.x) {
            this.i = true;
        }
    }

    public final void r(float f) {
        ArrayList arrayList;
        this.v.T(this.n, f);
        int i = 0;
        while (true) {
            arrayList = this.q;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((ec5) arrayList.get(i)).l(this.y);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
