package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class w82 implements vt4 {
    public final ko5 a;
    public final t82 b;
    public boolean c;
    public final u82 i;
    public final int j;
    public long m;
    public final v82 p;
    public long q;
    public final v82 s;
    public final p82 t;
    public kk1 u;
    public final ArrayDeque w;
    public IOException z;

    public w82(int i, p82 p82Var, boolean z, boolean z2, c52 c52Var) {
        p82Var.getClass();
        this.j = i;
        this.t = p82Var;
        this.a = new ko5(i);
        this.q = p82Var.e.g();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.w = arrayDeque;
        this.i = new u82(this, p82Var.d.g(), z2);
        this.b = new t82(this, z);
        this.s = new v82(this);
        this.p = new v82(this);
        if (c52Var == null) {
            if (j()) {
                return;
            }
            l0.z("remotely-initiated streams should have headers");
            throw null;
        }
        if (j()) {
            l0.z("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c52Var);
    }

    public final void a(c52 c52Var, boolean z) {
        boolean zT;
        c52Var.getClass();
        TimeZone timeZone = ws5.g;
        synchronized (this) {
            try {
                if (this.c && c52Var.g(":status") == null && c52Var.g(":method") == null) {
                    this.i.getClass();
                } else {
                    this.c = true;
                    this.w.add(c52Var);
                }
                if (z) {
                    this.i.t = true;
                }
                zT = t();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zT) {
            return;
        }
        this.t.t(this.j);
    }

    @Override // defpackage.vt4
    public final bq4 b() {
        return this.b;
    }

    @Override // defpackage.vt4
    public final hu4 g() {
        return this.i;
    }

    public final boolean j() {
        boolean z = (this.j & 1) == 1;
        this.t.getClass();
        return true == z;
    }

    public final kk1 l() {
        kk1 kk1Var;
        synchronized (this) {
            kk1Var = this.u;
        }
        return kk1Var;
    }

    public final void n(kk1 kk1Var, IOException iOException) {
        if (v(kk1Var, iOException)) {
            p82 p82Var = this.t;
            p82Var.getClass();
            p82Var.E.b(this.j, kk1Var);
        }
    }

    public final void r() throws IOException {
        t82 t82Var = this.b;
        if (t82Var.a) {
            uo1.t("stream closed");
            return;
        }
        if (t82Var.j) {
            uo1.t("stream finished");
            return;
        }
        if (l() != null) {
            IOException iOException = this.z;
            if (iOException != null) {
                throw iOException;
            }
            kk1 kk1VarL = l();
            kk1VarL.getClass();
            throw new ox4(kk1VarL);
        }
    }

    public final boolean t() {
        synchronized (this) {
            try {
                if (l() != null) {
                    return false;
                }
                u82 u82Var = this.i;
                if (u82Var.t || u82Var.q) {
                    t82 t82Var = this.b;
                    if ((t82Var.j || t82Var.a) && this.c) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(kk1 kk1Var, IOException iOException) {
        TimeZone timeZone = ws5.g;
        synchronized (this) {
            if (l() != null) {
                return false;
            }
            this.u = kk1Var;
            this.z = iOException;
            notifyAll();
            if (this.i.t && this.b.j) {
                return false;
            }
            this.t.t(this.j);
            return true;
        }
    }

    public final void x(kk1 kk1Var) {
        if (v(kk1Var, null)) {
            this.t.b(this.j, kk1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void y() {
        boolean z;
        boolean zT;
        TimeZone timeZone = ws5.g;
        synchronized (this) {
            try {
                u82 u82Var = this.i;
                if (u82Var.t || !u82Var.q) {
                    z = false;
                } else {
                    t82 t82Var = this.b;
                    if (t82Var.j || t82Var.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zT = t();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            n(kk1.i, null);
        } else {
            if (zT) {
                return;
            }
            this.t.t(this.j);
        }
    }
}
