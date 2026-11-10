package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hl1 implements Runnable, Comparable, ya1 {
    private volatile Object _heap;
    public long j;
    public int t = -1;

    public hl1(long j) {
        this.j = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.j - ((hl1) obj).j;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.ya1
    public final void g() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ky2 ky2Var = c93.c;
                if (obj == ky2Var) {
                    return;
                }
                il1 il1Var = obj instanceof il1 ? (il1) obj : null;
                if (il1Var != null) {
                    synchronized (il1Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof z85 ? (z85) obj2 : null) != null) {
                            il1Var.r(this.t);
                        }
                    }
                }
                this._heap = ky2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(il1 il1Var) {
        if (this._heap != c93.c) {
            this._heap = il1Var;
        } else {
            l0.u("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.j + ']';
    }

    public final int y(long j, il1 il1Var, jl1 jl1Var) {
        synchronized (this) {
            if (this._heap == c93.c) {
                return 2;
            }
            synchronized (il1Var) {
                try {
                    hl1[] hl1VarArr = il1Var.g;
                    hl1 hl1Var = hl1VarArr != null ? hl1VarArr[0] : null;
                    int i = jl1.s;
                    if (qr.g.getIntVolatile(jl1Var, jl1.i) == 1) {
                        return 1;
                    }
                    if (hl1Var == null) {
                        il1Var.r = j;
                    } else {
                        long j2 = hl1Var.j;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = il1Var.r;
                        if (j - j3 > 0) {
                            il1Var.r = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.j - j < 0) {
                        this.j = j;
                    }
                    il1Var.g(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
