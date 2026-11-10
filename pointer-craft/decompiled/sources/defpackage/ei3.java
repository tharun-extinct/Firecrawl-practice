package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ei3 {
    public static int[] _values() {
        return du4.E(5);
    }

    public static /* synthetic */ boolean a(zh4 zh4Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zh4.w;
        ky2 ky2Var = pw5.q;
        while (!atomicReferenceFieldUpdater.compareAndSet(zh4Var, obj, ky2Var)) {
            if (atomicReferenceFieldUpdater.get(zh4Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean b(sj4 sj4Var, nh4 nh4Var, nh4 nh4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sj4.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(sj4Var, nh4Var, nh4Var2)) {
            if (atomicReferenceFieldUpdater.get(sj4Var) != nh4Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean c(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static final void g(int i, Runnable runnable) {
        ((uv5) v92.E().t).post(runnable);
    }

    public static /* synthetic */ boolean i(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void j(h76 h76Var) {
        if (h76Var == null) {
            return;
        }
        uo1.B();
    }

    public static void l(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ boolean m(sj4 sj4Var, nh4 nh4Var, nh4 nh4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sj4.q;
        while (!atomicReferenceFieldUpdater.compareAndSet(sj4Var, nh4Var, nh4Var2)) {
            if (atomicReferenceFieldUpdater.get(sj4Var) != nh4Var) {
                return false;
            }
        }
        return true;
    }

    public static HashMap n(Class cls, nw5 nw5Var) {
        HashMap map = new HashMap();
        map.put(cls, nw5Var);
        return map;
    }

    public static /* synthetic */ boolean q(Object obj, v25 v25Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pr5.y;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, v25Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != v25Var) {
                return false;
            }
        }
        return true;
    }

    public static int r(k85 k85Var, int i, int i2) {
        return (k85Var.hashCode() + i) * i2;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "QUEUING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "RUNNING";
        }
        return "QUEUED";
    }

    public static /* synthetic */ boolean t(oc4 oc4Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oc4.a;
        hi0 hi0Var = hi0.D;
        while (!atomicReferenceFieldUpdater.compareAndSet(oc4Var, hi0Var, obj)) {
            if (atomicReferenceFieldUpdater.get(oc4Var) != hi0Var) {
                return false;
            }
        }
        return true;
    }

    public static nw5 v(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new nw5(i);
    }

    public static /* synthetic */ boolean w(AtomicReferenceArray atomicReferenceArray, int i, v25 v25Var) {
        while (!atomicReferenceArray.compareAndSet(i, v25Var, null)) {
            if (atomicReferenceArray.get(i) != v25Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void x(View view) {
        throw new ClassCastException();
    }

    public static int y(String str) {
        if (str == null) {
            l0.q("Name is null");
            return 0;
        }
        if (str.equals("DEFAULT_APP_CHECK_TOKEN")) {
            return 1;
        }
        if (str.equals("UNKNOWN_APP_CHECK_TOKEN")) {
            return 2;
        }
        l0.u("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(str));
        return 0;
    }
}
