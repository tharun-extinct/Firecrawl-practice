package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n34 extends u25 {
    public final /* synthetic */ byte v;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n34(o34 o34Var, String str) {
        super(str, true);
        this.v = (byte) 0;
        this.x = o34Var;
    }

    @Override // defpackage.u25
    public final long r() {
        switch (this.v) {
            case 0:
                o34 o34Var = (o34) this.x;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - o34Var.g) + 1;
                Iterator it = o34Var.n.iterator();
                it.getClass();
                m34 m34Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                m34 m34Var2 = null;
                m34 m34Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    m34 m34Var4 = (m34) it.next();
                    m34Var4.getClass();
                    synchronized (m34Var4) {
                        if (o34Var.g(m34Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = m34Var4.p;
                            if (j3 < j) {
                                j = j3;
                                m34Var2 = m34Var4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                m34Var3 = m34Var4;
                            }
                        }
                    }
                }
                if (m34Var2 != null) {
                    m34Var = m34Var2;
                } else if (i > 5) {
                    j = j2;
                    m34Var = m34Var3;
                } else {
                    j = -1;
                }
                if (m34Var == null) {
                    if (m34Var3 != null) {
                        return (j2 + o34Var.g) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return o34Var.g;
                    }
                    return -1L;
                }
                synchronized (m34Var) {
                    if (m34Var.s.isEmpty() && m34Var.p == j) {
                        m34Var.m = true;
                        o34Var.n.remove(m34Var);
                        ws5.r(m34Var.v);
                        if (!o34Var.n.isEmpty()) {
                            return 0L;
                        }
                        a35 a35Var = o34Var.y;
                        synchronized (a35Var.g) {
                            if (a35Var.g()) {
                                a35Var.g.r(a35Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            case 1:
                ((my1) this.x).g();
                return -1L;
            default:
                return ((Number) ((h82) this.x).g()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n34(String str, my1 my1Var, byte b) {
        super(str, true);
        this.v = b;
        this.x = my1Var;
    }
}
