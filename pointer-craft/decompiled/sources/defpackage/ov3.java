package defpackage;

import android.database.SQLException;

/* JADX INFO: loaded from: classes2.dex */
public final class ov3 implements tb5, y24 {
    public final aj6 g;
    public final dr n;
    public final boolean r;
    public volatile boolean v;
    public final tq0 y;

    public ov3(aj6 aj6Var, tq0 tq0Var, boolean z) {
        aj6Var.getClass();
        this.g = aj6Var;
        this.y = tq0Var;
        this.r = z;
        this.n = new dr();
    }

    @Override // defpackage.tb5
    public final Object g(sb5 sb5Var, bz1 bz1Var, zz4 zz4Var) {
        if (this.v) {
            zq2.B("Connection is recycled", 21);
            throw null;
        }
        fx0 fx0Var = zz4Var.t;
        fx0Var.getClass();
        bq0 bq0Var = (bq0) fx0Var.h(this.g);
        if (bq0Var != null && bq0Var.t == this) {
            return l(sb5Var, bz1Var, zz4Var);
        }
        zq2.B("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    public final Object l(sb5 sb5Var, bz1 bz1Var, ou0 ou0Var) throws Throwable {
        mv3 mv3Var;
        SQLException e;
        Throwable th;
        if (ou0Var instanceof mv3) {
            mv3Var = (mv3) ou0Var;
            int i = mv3Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv3Var.b = i - Integer.MIN_VALUE;
            } else {
                mv3Var = new mv3(this, ou0Var);
            }
        } else {
            mv3Var = new mv3(this, ou0Var);
        }
        Object objL = mv3Var.c;
        int i2 = mv3Var.b;
        boolean z = true;
        px0 px0Var = px0.j;
        try {
            if (i2 == 0) {
                js2.o(objL);
                if (sb5Var == null) {
                    sb5Var = sb5.j;
                }
                mv3Var.m = bz1Var;
                mv3Var.b = 1;
                if (v(sb5Var, mv3Var) != px0Var) {
                }
                return px0Var;
            }
            if (i2 == 1) {
                bz1Var = (bz1) mv3Var.m;
                js2.o(objL);
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj = mv3Var.m;
                        js2.o(objL);
                        return obj;
                    }
                    if (i2 != 5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = mv3Var.q;
                    th = (Throwable) mv3Var.m;
                    try {
                        js2.o(objL);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        kf6.g(th, e);
                        throw th;
                    }
                }
                z = mv3Var.w;
                js2.o(objL);
            }
            mv3Var.m = objL;
            mv3Var.b = 3;
            this = x(z, mv3Var);
            if (this != px0Var) {
                return px0Var;
            }
            return objL;
            iv3 iv3Var = new iv3(this);
            mv3Var.m = null;
            mv3Var.w = true;
            mv3Var.b = 2;
            objL = bz1Var.l(iv3Var, mv3Var);
            if (objL != px0Var) {
                mv3Var.m = objL;
                mv3Var.b = 3;
                this = x(z, mv3Var);
                if (this != px0Var) {
                    return objL;
                }
            }
            return px0Var;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    mv3Var.m = th;
                    mv3Var.q = th3;
                    mv3Var.b = 5;
                    if (this.x(false, mv3Var) != px0Var) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    kf6.g(th, e);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gv3
    public final Object n(String str, xy1 xy1Var, ou0 ou0Var) {
        nv3 nv3Var;
        tq0 tq0Var;
        if (ou0Var instanceof nv3) {
            nv3Var = (nv3) ou0Var;
            int i = nv3Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nv3Var.b = i - Integer.MIN_VALUE;
            } else {
                nv3Var = new nv3(this, ou0Var);
            }
        } else {
            nv3Var = new nv3(this, ou0Var);
        }
        Object obj = nv3Var.c;
        px0 px0Var = px0.j;
        int i2 = nv3Var.b;
        if (i2 == 0) {
            js2.o(obj);
            if (this.v) {
                zq2.B("Connection is recycled", 21);
                throw null;
            }
            fx0 fx0Var = nv3Var.t;
            fx0Var.getClass();
            bq0 bq0Var = (bq0) fx0Var.h(this.g);
            if (bq0Var == null || bq0Var.t != this) {
                zq2.B("Attempted to use connection on a different coroutine", 21);
                throw null;
            }
            tq0Var = this.y;
            nv3Var.m = str;
            nv3Var.q = xy1Var;
            nv3Var.w = tq0Var;
            nv3Var.b = 1;
            if (tq0Var.t.y(nv3Var) == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tq0 tq0Var2 = nv3Var.w;
            xy1Var = nv3Var.q;
            String str2 = nv3Var.m;
            js2.o(obj);
            tq0Var = tq0Var2;
            str = str2;
        }
        try {
            hv3 hv3Var = new hv3(this, this.y.O(str));
            try {
                Object objA = xy1Var.a(hv3Var);
                c93.h(hv3Var, null);
                tq0Var.x(null);
                return objA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c93.h(hv3Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            tq0Var.x(null);
            throw th3;
        }
    }

    @Override // defpackage.y24
    public final tb4 r() {
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object v(sb5 sb5Var, ou0 ou0Var) {
        kv3 kv3Var;
        tq0 tq0Var;
        dr drVar = this.n;
        if (ou0Var instanceof kv3) {
            kv3Var = (kv3) ou0Var;
            int i = kv3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                kv3Var.i = i - Integer.MIN_VALUE;
            } else {
                kv3Var = new kv3(this, ou0Var);
            }
        } else {
            kv3Var = new kv3(this, ou0Var);
        }
        Object obj = kv3Var.w;
        int i2 = kv3Var.i;
        tq0 tq0Var2 = this.y;
        if (i2 == 0) {
            js2.o(obj);
            kv3Var.m = sb5Var;
            kv3Var.q = tq0Var2;
            kv3Var.i = 1;
            Object objY = tq0Var2.t.y(kv3Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
            tq0Var = tq0Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tq0 tq0Var3 = kv3Var.q;
            sb5 sb5Var2 = kv3Var.m;
            js2.o(obj);
            tq0Var = tq0Var3;
            sb5Var = sb5Var2;
        }
        try {
            int i3 = drVar.a;
            if (drVar.isEmpty()) {
                int iOrdinal = sb5Var.ordinal();
                if (iOrdinal == 0) {
                    zq2.m(tq0Var2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    zq2.m(tq0Var2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new il0();
                    }
                    zq2.m(tq0Var2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                zq2.m(tq0Var2, "SAVEPOINT '" + i3 + '\'');
            }
            drVar.addLast(new jv3(i3));
            og5 og5Var = og5.g;
            tq0Var.x(null);
            return og5Var;
        } catch (Throwable th) {
            tq0Var.x(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(boolean z, ou0 ou0Var) {
        lv3 lv3Var;
        tq0 tq0Var;
        dr drVar = this.n;
        if (ou0Var instanceof lv3) {
            lv3Var = (lv3) ou0Var;
            int i = lv3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                lv3Var.i = i - Integer.MIN_VALUE;
            } else {
                lv3Var = new lv3(this, ou0Var);
            }
        } else {
            lv3Var = new lv3(this, ou0Var);
        }
        Object obj = lv3Var.w;
        int i2 = lv3Var.i;
        tq0 tq0Var2 = this.y;
        if (i2 == 0) {
            js2.o(obj);
            lv3Var.q = tq0Var2;
            lv3Var.m = z;
            lv3Var.i = 1;
            Object objY = tq0Var2.t.y(lv3Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
            tq0Var = tq0Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = lv3Var.m;
            tq0Var = lv3Var.q;
            js2.o(obj);
        }
        try {
            if (drVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            jv3 jv3Var = (jv3) hj0.d0(drVar);
            if (z) {
                jv3Var.getClass();
                if (drVar.isEmpty()) {
                    zq2.m(tq0Var2, "END TRANSACTION");
                } else {
                    zq2.m(tq0Var2, "RELEASE SAVEPOINT '" + jv3Var.g + '\'');
                }
            } else if (drVar.isEmpty()) {
                zq2.m(tq0Var2, "ROLLBACK TRANSACTION");
            } else {
                zq2.m(tq0Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + jv3Var.g + '\'');
            }
            og5 og5Var = og5.g;
            tq0Var.x(null);
            return og5Var;
        } catch (Throwable th) {
            tq0Var.x(null);
            throw th;
        }
    }

    @Override // defpackage.tb5
    public final Boolean y(mu0 mu0Var) {
        if (this.v) {
            zq2.B("Connection is recycled", 21);
            throw null;
        }
        fx0 fx0Var = ((ou0) mu0Var).t;
        fx0Var.getClass();
        bq0 bq0Var = (bq0) fx0Var.h(this.g);
        if (bq0Var != null && bq0Var.t == this) {
            return Boolean.valueOf(!this.n.isEmpty() || this.y.j.p());
        }
        zq2.B("Attempted to use connection on a different coroutine", 21);
        throw null;
    }
}
