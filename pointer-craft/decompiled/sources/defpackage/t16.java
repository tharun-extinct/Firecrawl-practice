package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t16 implements a36 {
    public static final qc6 c;
    public static final Object m = new Object();
    public static final x26 q = new x26(h36.class);
    public static final boolean w;
    public volatile r16 a;
    public volatile Object j;
    public volatile m16 t;

    static {
        boolean z;
        qc6 p16Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        w = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                p16Var = new q16();
            } catch (Error | Exception e) {
                try {
                    p16Var = new o16();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    p16Var = new p16();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                p16Var = new o16();
            } catch (NoClassDefFoundError unused2) {
                p16Var = new p16();
            }
        }
        th = null;
        th2 = null;
        c = p16Var;
        if (th != null) {
            x26 x26Var = q;
            Logger loggerG = x26Var.g();
            Level level = Level.SEVERE;
            loggerG.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            x26Var.g().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public abstract Throwable n();

    public final void r(r16 r16Var) {
        r16Var.g = null;
        while (true) {
            r16 r16Var2 = this.a;
            if (r16Var2 != r16.r) {
                r16 r16Var3 = null;
                while (r16Var2 != null) {
                    r16 r16Var4 = r16Var2.y;
                    if (r16Var2.g != null) {
                        r16Var3 = r16Var2;
                    } else if (r16Var3 != null) {
                        r16Var3.y = r16Var4;
                        if (r16Var3.g == null) {
                        }
                    } else if (!c.t(this, r16Var2, r16Var4)) {
                    }
                    r16Var2 = r16Var4;
                }
                return;
            }
            return;
        }
    }
}
