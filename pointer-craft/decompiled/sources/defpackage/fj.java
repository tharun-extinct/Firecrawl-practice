package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class fj {
    public static /* synthetic */ void a(nh2 nh2Var, Object obj, wa2 wa2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nh2.j;
        while (!atomicReferenceFieldUpdater.compareAndSet(nh2Var, obj, wa2Var) && atomicReferenceFieldUpdater.get(nh2Var) == obj) {
        }
    }

    public static /* synthetic */ boolean b(m70 m70Var, nh4 nh4Var, nh4 nh4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m70.i;
        while (!atomicReferenceFieldUpdater.compareAndSet(m70Var, nh4Var, nh4Var2)) {
            if (atomicReferenceFieldUpdater.get(m70Var) != nh4Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void c(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    public static boolean g(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec("getprop ".concat(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            String line = bufferedReader.readLine();
            processExec.waitFor();
            bufferedReader.close();
            if (line != null && line.length() != 0) {
                return Boolean.parseBoolean(line);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "FIXED";
        }
        if (i == 2) {
            return "WRAP_CONTENT";
        }
        if (i == 3) {
            return "MATCH_CONSTRAINT";
        }
        if (i == 4) {
            return "MATCH_PARENT";
        }
        throw null;
    }

    public static /* synthetic */ boolean i(m70 m70Var, nh4 nh4Var, md0 md0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m70.i;
        while (!atomicReferenceFieldUpdater.compareAndSet(m70Var, nh4Var, md0Var)) {
            if (atomicReferenceFieldUpdater.get(m70Var) != nh4Var) {
                return false;
            }
        }
        return true;
    }

    public static void j(int i, int i2, int i3, int i4, int i5) {
        vx5.n(i);
        vx5.n(i2);
        vx5.n(i3);
        vx5.n(i4);
        vx5.n(i5);
    }

    public static Map l(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void m(zx2 zx2Var, by2 by2Var, by2 by2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zx2.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(zx2Var, by2Var, by2Var2) && atomicReferenceFieldUpdater.get(zx2Var) == by2Var) {
        }
    }

    public static int n(qj0 qj0Var, int i, int i2) {
        return (qj0Var.hashCode() + i) * i2;
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference, s52 s52Var) {
        while (!atomicReference.compareAndSet(s52Var, null)) {
            if (atomicReference.get() != s52Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void q(by2 by2Var, by2 by2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = by2.v;
        while (!atomicReferenceFieldUpdater.compareAndSet(by2Var, null, by2Var2) && atomicReferenceFieldUpdater.get(by2Var) == null) {
        }
    }

    public static /* synthetic */ boolean s(np0 np0Var, Object obj, np0 np0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = np0.j;
        while (!atomicReferenceFieldUpdater.compareAndSet(np0Var, obj, np0Var2)) {
            if (atomicReferenceFieldUpdater.get(np0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void t(long j, StringBuilder sb, String str) {
        sb.append((Object) jj0.j(j));
        sb.append(str);
    }

    public static /* synthetic */ boolean u(AtomicReference atomicReference, xb3 xb3Var, xb3 xb3Var2) {
        while (!atomicReference.compareAndSet(xb3Var, xb3Var2)) {
            if (atomicReference.get() != xb3Var) {
                return false;
            }
        }
        return true;
    }

    public static fp3 v(jp2 jp2Var, jp2 jp2Var2, Integer num) {
        return new fp3(new rq4(jp2Var, jp2Var2), num);
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj == null) {
            return;
        }
        uo1.B();
    }

    public static String x(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static int y(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static /* synthetic */ void z(Object obj) {
        throw new ClassCastException();
    }
}
