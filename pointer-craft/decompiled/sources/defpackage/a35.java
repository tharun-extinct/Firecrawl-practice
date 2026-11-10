package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a35 {
    public final b35 g;
    public u25 n;
    public boolean r;
    public final ArrayList v = new ArrayList();
    public boolean x;
    public final String y;

    public a35(b35 b35Var, String str) {
        this.g = b35Var;
        this.y = str;
    }

    public static void y(a35 a35Var, String str, my1 my1Var) {
        a35Var.getClass();
        str.getClass();
        my1Var.getClass();
        a35Var.l(new n34(str, my1Var, (byte) 1), 0L);
    }

    public final void a() {
        this.x = false;
    }

    public final boolean g() {
        u25 u25Var = this.n;
        if (u25Var != null && u25Var.y) {
            this.x = true;
        }
        ArrayList arrayList = this.v;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((u25) arrayList.get(size)).y) {
                Logger logger = this.g.y;
                u25 u25Var2 = (u25) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    fh6.y(logger, u25Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[LOOP:0: B:23:0x0063->B:27:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[EDGE_INSN: B:39:0x0079->B:29:0x0079 BREAK  A[LOOP:0: B:23:0x0063->B:27:0x0075], SYNTHETIC] */
    public final boolean j(u25 u25Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        Logger logger = this.g.y;
        u25Var.getClass();
        a35 a35Var = u25Var.r;
        if (a35Var != this) {
            if (a35Var != null) {
                l0.z("task is in multiple queues");
                return false;
            }
            u25Var.r = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.v;
        int iIndexOf = arrayList.indexOf(u25Var);
        if (iIndexOf == -1) {
            u25Var.n = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(fh6.g(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(fh6.g(j2 - jNanoTime));
                }
                fh6.y(logger, u25Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((u25) obj).n - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, u25Var);
            if (size2 == 0) {
                return true;
            }
        } else if (u25Var.n > j2) {
            arrayList.remove(iIndexOf);
            u25Var.n = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(fh6.g(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(fh6.g(j2 - jNanoTime));
                }
                fh6.y(logger, u25Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((u25) obj).n - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, u25Var);
            if (size2 == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            fh6.y(logger, u25Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void l(u25 u25Var, long j) {
        u25Var.getClass();
        synchronized (this.g) {
            if (!this.r) {
                if (j(u25Var, j, false)) {
                    this.g.r(this);
                }
                return;
            }
            boolean z = u25Var.y;
            Logger logger = this.g.y;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    fh6.y(logger, u25Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    fh6.y(logger, u25Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void m() {
        b35 b35Var = this.g;
        TimeZone timeZone = ws5.g;
        synchronized (b35Var) {
            this.r = true;
            if (g()) {
                this.g.r(this);
            }
        }
    }

    public final boolean n() {
        return this.x;
    }

    public final u25 r() {
        return this.n;
    }

    public final void t(u25 u25Var) {
        this.n = u25Var;
    }

    public final String toString() {
        return this.y;
    }

    public final ArrayList v() {
        return this.v;
    }

    public final boolean x() {
        return this.r;
    }
}
