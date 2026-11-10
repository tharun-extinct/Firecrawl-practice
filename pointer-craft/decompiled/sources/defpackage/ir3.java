package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ir3 {
    public ib3 a;
    public final yo0 g;
    public final Object l;
    public final i64 m;
    public final bz1 n;
    public final q70 q;
    public final h02 r;
    public final boolean v;
    public final t x;
    public final to0 y;
    public final AtomicReference j = new AtomicReference(kr3.a);
    public long t = zq2.j();

    public ir3(yo0 yo0Var, to0 to0Var, h02 h02Var, lb3 lb3Var, bz1 bz1Var, boolean z, t tVar, Object obj) {
        this.g = yo0Var;
        this.y = to0Var;
        this.r = h02Var;
        this.n = bz1Var;
        this.v = z;
        this.x = tVar;
        this.l = obj;
        ib3 ib3Var = fe4.g;
        ib3Var.getClass();
        this.a = ib3Var;
        i64 i64Var = new i64((byte) 0);
        i64Var.a(lb3Var, h02Var.d());
        this.m = i64Var;
        this.q = new q70(tVar.t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean a(lp4 lp4Var) throws Exception {
        long j;
        kr3 kr3Var = kr3.q;
        AtomicReference atomicReference = this.j;
        try {
            int iOrdinal = ((kr3) atomicReference.get()).ordinal();
            kr3 kr3Var2 = kr3.m;
            yo0 yo0Var = this.g;
            to0 to0Var = this.y;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    h02 h02Var = this.r;
                    boolean z = this.v;
                    if (z) {
                        h02Var.e = 0;
                        h02Var.d = true;
                    }
                    this.a = to0Var.y(yo0Var, lp4Var, this.n);
                    if (z) {
                        if (h02Var.F || h02Var.e != 0) {
                            aw3.g("Cannot disable reuse from root if it was caused by other groups");
                        }
                        h02Var.e = -1;
                        h02Var.d = false;
                    }
                    kr3 kr3Var3 = kr3.a;
                    while (!atomicReference.compareAndSet(kr3Var3, kr3Var2)) {
                        if (atomicReference.get() != kr3Var3) {
                            aw3.y("Unexpected state change from: " + kr3Var3 + " to: " + kr3Var2 + ".");
                            if (this.a.l()) {
                                j();
                            }
                            return x();
                        }
                    }
                    if (this.a.l()) {
                        j();
                    }
                    return x();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(kr3Var2, kr3Var)) {
                            if (atomicReference.get() != kr3Var2) {
                                aw3.y("Unexpected state change from: " + kr3Var2 + " to: " + kr3Var + ".");
                                j = this.t;
                                this.t = zq2.j();
                                this.a = to0Var.c(yo0Var, lp4Var, this.a);
                                this.t = j;
                                while (!atomicReference.compareAndSet(kr3Var, kr3Var2)) {
                                    if (atomicReference.get() != kr3Var) {
                                        aw3.y("Unexpected state change from: " + kr3Var + " to: " + kr3Var2 + ".");
                                        if (this.a.l()) {
                                            j();
                                        }
                                        return x();
                                    }
                                }
                                if (this.a.l()) {
                                    j();
                                }
                                return x();
                            }
                        }
                        this.t = zq2.j();
                        this.a = to0Var.c(yo0Var, lp4Var, this.a);
                        this.t = j;
                        while (!atomicReference.compareAndSet(kr3Var, kr3Var2)) {
                            if (atomicReference.get() != kr3Var) {
                                aw3.y("Unexpected state change from: " + kr3Var + " to: " + kr3Var2 + ".");
                                if (this.a.l()) {
                                    j();
                                }
                                return x();
                            }
                        }
                        if (this.a.l()) {
                            j();
                        }
                        return x();
                    } catch (Throwable th) {
                        this.t = j;
                        while (!atomicReference.compareAndSet(kr3Var, kr3Var2)) {
                            if (atomicReference.get() != kr3Var) {
                                aw3.y("Unexpected state change from: " + kr3Var + " to: " + kr3Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.t;
                case 4:
                    qo0.y("Recursive call to resume()");
                    throw new il0();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new il0();
            }
        } catch (Exception e) {
            atomicReference.set(kr3.j);
            throw e;
        }
    }

    public final void g() throws Exception {
        AtomicReference atomicReference = this.j;
        try {
            switch (((kr3) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    y();
                    kr3 kr3Var = kr3.w;
                    kr3 kr3Var2 = kr3.c;
                    while (!atomicReference.compareAndSet(kr3Var, kr3Var2)) {
                        if (atomicReference.get() != kr3Var) {
                            aw3.y("Unexpected state change from: " + kr3Var + " to: " + kr3Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new il0();
            }
        } catch (Exception e) {
            atomicReference.set(kr3.j);
            throw e;
        }
    }

    public final void j() {
        AtomicReference atomicReference;
        kr3 kr3Var;
        kr3 kr3Var2;
        do {
            atomicReference = this.j;
            kr3Var = kr3.m;
            kr3Var2 = kr3.w;
            if (atomicReference.compareAndSet(kr3Var, kr3Var2)) {
                return;
            }
        } while (atomicReference.get() == kr3Var);
        aw3.y("Unexpected state change from: " + kr3Var + " to: " + kr3Var2 + ".");
    }

    public final boolean l() {
        return this.j.get() == kr3.q && this.t == zq2.j();
    }

    public final q70 n() {
        return this.q;
    }

    public final void r() {
        ib3 ib3Var;
        this.j.set(kr3.t);
        i64 i64Var = this.m;
        if (((ib3) i64Var.l).j()) {
            ib3Var = (ib3) i64Var.l;
            ib3 ib3Var2 = fe4.g;
            i64Var.l = new ib3();
            ((rb3) i64Var.r).j();
        } else {
            ib3Var = null;
        }
        i64Var.r();
        yo0 yo0Var = this.g;
        yo0Var.k = null;
        if (ib3Var != null) {
            yo0Var.B.t = ib3Var;
            yo0Var.D = (byte) 2;
        }
    }

    public final void t() {
        AtomicReference atomicReference;
        kr3 kr3Var;
        do {
            atomicReference = this.j;
            kr3Var = kr3.w;
            if (atomicReference.compareAndSet(kr3Var, kr3.m)) {
                return;
            }
        } while (atomicReference.get() == kr3Var);
    }

    public final i64 v() {
        return this.m;
    }

    public final boolean x() {
        return ((kr3) this.j.get()).compareTo(kr3.w) >= 0;
    }

    public final void y() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.l) {
                try {
                    this.q.e(this.x, this.m);
                    this.m.n();
                    this.m.v();
                    this.m.r();
                    this.g.k = null;
                } catch (Throwable th) {
                    this.m.r();
                    this.g.k = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
