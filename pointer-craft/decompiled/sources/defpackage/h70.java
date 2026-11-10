package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h70 implements an5 {
    public final /* synthetic */ m70 a;
    public Object j = o70.b;
    public ib0 t;

    public h70(m70 m70Var) {
        this.a = m70Var;
    }

    @Override // defpackage.an5
    public final void g(nh4 nh4Var, int i) {
        ib0 ib0Var = this.t;
        if (ib0Var != null) {
            ib0Var.g(nh4Var, i);
        }
    }

    public final Object r() {
        Object obj = this.j;
        ky2 ky2Var = o70.b;
        if (obj == ky2Var) {
            l0.z("`hasNext()` has not been invoked");
            return null;
        }
        this.j = ky2Var;
        if (obj != o70.q) {
            return obj;
        }
        Throwable thI = this.a.i();
        int i = bv4.g;
        throw thI;
    }

    public final Object y(ou0 ou0Var) {
        md0 md0VarA;
        Object obj = this.j;
        boolean z = true;
        if (obj == o70.b || obj == o70.q) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m70.c;
            m70 m70Var = this.a;
            md0 md0Var = (md0) atomicReferenceFieldUpdater.get(m70Var);
            while (!m70Var.k()) {
                long andIncrement = m70.a.getAndIncrement(m70Var);
                long j = o70.y;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (md0Var.m != j2) {
                    md0VarA = m70Var.a(j2, md0Var);
                    if (md0VarA == null) {
                        continue;
                    }
                } else {
                    md0VarA = md0Var;
                }
                Object objK = m70Var.K(md0VarA, i, andIncrement, null);
                ky2 ky2Var = o70.w;
                if (objK == ky2Var) {
                    l0.z("unreachable");
                    return null;
                }
                ky2 ky2Var2 = o70.i;
                if (objK == ky2Var2) {
                    if (andIncrement < m70Var.u()) {
                        md0VarA.g();
                    }
                    md0Var = md0VarA;
                } else {
                    if (objK == o70.c) {
                        m70 m70Var2 = this.a;
                        ib0 ib0VarI = gp4.I(pw5.o(ou0Var));
                        try {
                            this.t = ib0VarI;
                            Object objK2 = m70Var2.K(md0VarA, i, andIncrement, this);
                            if (objK2 != ky2Var) {
                                if (objK2 == ky2Var2) {
                                    if (andIncrement < m70Var2.u()) {
                                        md0VarA.g();
                                    }
                                    md0 md0Var2 = (md0) m70.c.get(m70Var2);
                                    while (true) {
                                        if (m70Var2.k()) {
                                            ib0 ib0Var = this.t;
                                            ib0Var.getClass();
                                            this.t = null;
                                            this.j = o70.q;
                                            Throwable thW = m70Var.w();
                                            if (thW != null) {
                                                ib0Var.j(new g84(thW));
                                                break;
                                            }
                                            ib0Var.j(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = m70.a.getAndIncrement(m70Var2);
                                        long j3 = o70.y;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (md0Var2.m != j4) {
                                            md0 md0VarA2 = m70Var2.a(j4, md0Var2);
                                            if (md0VarA2 != null) {
                                                md0Var2 = md0VarA2;
                                            }
                                        }
                                        Object objK3 = m70Var2.K(md0Var2, i2, andIncrement2, this);
                                        if (objK3 == o70.w) {
                                            g(md0Var2, i2);
                                            break;
                                        }
                                        if (objK3 == o70.i) {
                                            if (andIncrement2 < m70Var2.u()) {
                                                md0Var2.g();
                                            }
                                        } else {
                                            if (objK3 == o70.c) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            md0Var2.g();
                                            this.j = objK3;
                                            this.t = null;
                                        }
                                    }
                                } else {
                                    md0VarA.g();
                                    this.j = objK2;
                                    this.t = null;
                                }
                                ib0VarI.m(Boolean.TRUE, null);
                                break;
                            }
                            g(md0VarA, i);
                            return ib0VarI.z();
                        } catch (Throwable th) {
                            ib0VarI.C();
                            throw th;
                        }
                    }
                    md0VarA.g();
                    this.j = objK;
                }
            }
            this.j = o70.q;
            Throwable thW2 = m70Var.w();
            if (thW2 != null) {
                int i3 = bv4.g;
                throw thW2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
