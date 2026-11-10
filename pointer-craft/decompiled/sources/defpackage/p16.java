package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p16 extends qc6 {
    @Override // defpackage.qc6
    public final boolean j(t16 t16Var, Object obj, Object obj2) {
        synchronized (t16Var) {
            try {
                if (t16Var.j != obj) {
                    return false;
                }
                t16Var.j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qc6
    public final boolean l(h36 h36Var, m16 m16Var, m16 m16Var2) {
        synchronized (h36Var) {
            try {
                if (h36Var.t != m16Var) {
                    return false;
                }
                h36Var.t = m16Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qc6
    public final r16 n(h36 h36Var) {
        r16 r16Var;
        r16 r16Var2 = r16.r;
        synchronized (h36Var) {
            try {
                r16Var = h36Var.a;
                if (r16Var != r16Var2) {
                    h36Var.a = r16Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r16Var;
    }

    @Override // defpackage.qc6
    public final m16 r(h36 h36Var) {
        m16 m16Var;
        m16 m16Var2 = m16.n;
        synchronized (h36Var) {
            try {
                m16Var = h36Var.t;
                if (m16Var != m16Var2) {
                    h36Var.t = m16Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m16Var;
    }

    @Override // defpackage.qc6
    public final boolean t(t16 t16Var, r16 r16Var, r16 r16Var2) {
        synchronized (t16Var) {
            try {
                if (t16Var.a != r16Var) {
                    return false;
                }
                t16Var.a = r16Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qc6
    public final void v(r16 r16Var, r16 r16Var2) {
        r16Var.y = r16Var2;
    }

    @Override // defpackage.qc6
    public final void x(r16 r16Var, Thread thread) {
        r16Var.g = thread;
    }
}
