package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gq3 implements tb5, y24 {
    public final bz1 g;
    public sb5 n;
    public final AtomicInteger r;
    public final tb4 y;

    public gq3(bz1 bz1Var, tb4 tb4Var) {
        tb4Var.getClass();
        this.g = bz1Var;
        this.y = tb4Var;
        this.r = new AtomicInteger(0);
    }

    @Override // defpackage.tb5
    public final Object g(sb5 sb5Var, bz1 bz1Var, zz4 zz4Var) {
        return this.g.l(new fq3(this, sb5Var, bz1Var, null, (byte) 0), zz4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gv3
    public final Object n(String str, xy1 xy1Var, ou0 ou0Var) {
        dq3 dq3Var;
        if (ou0Var instanceof dq3) {
            dq3Var = (dq3) ou0Var;
            int i = dq3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq3Var.i = i - Integer.MIN_VALUE;
            } else {
                dq3Var = new dq3(this, ou0Var);
            }
        } else {
            dq3Var = new dq3(this, ou0Var);
        }
        Object objY = dq3Var.w;
        int i2 = dq3Var.i;
        Object obj = px0.j;
        if (i2 == 0) {
            js2.o(objY);
            dq3Var.m = str;
            dq3Var.q = xy1Var;
            dq3Var.i = 1;
            objY = y(dq3Var);
            if (objY != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(objY);
                return objY;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xy1Var = dq3Var.q;
        str = dq3Var.m;
        js2.o(objY);
        if (((Boolean) objY).booleanValue()) {
            eq3 eq3Var = new eq3(this, str, xy1Var, null);
            dq3Var.m = null;
            dq3Var.q = null;
            dq3Var.i = 2;
            Object objL = this.g.l(eq3Var, dq3Var);
            return objL == obj ? obj : objL;
        }
        cc4 cc4VarO = this.y.O(str);
        try {
            Object objA = xy1Var.a(cc4VarO);
            c93.h(cc4VarO, null);
            return objA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.y24
    public final tb4 r() {
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(sb5 sb5Var, bz1 bz1Var, ou0 ou0Var) {
        cq3 cq3Var;
        if (ou0Var instanceof cq3) {
            cq3Var = (cq3) ou0Var;
            int i = cq3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq3Var.c = i - Integer.MIN_VALUE;
            } else {
                cq3Var = new cq3(this, ou0Var);
            }
        } else {
            cq3Var = new cq3(this, ou0Var);
        }
        Object objL = cq3Var.q;
        int i2 = cq3Var.c;
        AtomicInteger atomicInteger = this.r;
        boolean z = true;
        tb4 tb4Var = this.y;
        try {
            if (i2 == 0) {
                js2.o(objL);
                int iOrdinal = sb5Var.ordinal();
                if (iOrdinal == 0) {
                    zq2.m(tb4Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    zq2.m(tb4Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        uo1.g();
                        return null;
                    }
                    zq2.m(tb4Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.n = sb5Var;
                }
                Object bq3Var = new bq3(this);
                cq3Var.m = true;
                cq3Var.c = 1;
                objL = bz1Var.l(bq3Var, cq3Var);
                Object obj = px0.j;
                if (objL == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = cq3Var.m;
                js2.o(objL);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.n = null;
            }
            if (z) {
                zq2.m(tb4Var, "END TRANSACTION");
                return objL;
            }
            zq2.m(tb4Var, "ROLLBACK TRANSACTION");
            return objL;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.n = null;
                    }
                    zq2.m(tb4Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    kf6.g(th, e);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.tb5
    public final Boolean y(mu0 mu0Var) {
        return Boolean.valueOf(this.n != null || this.y.p());
    }
}
