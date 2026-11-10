package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq2 {
    public final tp3 a;
    public final qg b;
    public long c;
    public final ox0 g;
    public x32 i;
    public final tp3 j;
    public boolean l;
    public final tp3 m;
    public no1 n;
    public final tp3 p;
    public long q;
    public final qd r;
    public final qg s;
    public final tp3 t;
    public no1 v;
    public long w;
    public no1 x;
    public final w32 y;

    public qq2(ox0 ox0Var, w32 w32Var, qd qdVar) {
        this.g = ox0Var;
        this.y = w32Var;
        this.r = qdVar;
        Boolean bool = Boolean.FALSE;
        this.j = kq2.M(bool);
        this.t = kq2.M(bool);
        this.a = kq2.M(bool);
        this.m = kq2.M(bool);
        this.q = 9223372034707292159L;
        this.w = 0L;
        this.c = 9223372034707292159L;
        this.i = w32Var != null ? w32Var.y() : null;
        this.b = new qg(new je2(0L), m50.u, null, 12);
        this.s = new qg(Float.valueOf(1.0f), m50.w, null, 12);
        this.p = kq2.M(new je2(0L));
    }

    public final void g() {
        x32 x32Var = this.i;
        no1 no1Var = this.n;
        tp3 tp3Var = this.t;
        boolean zBooleanValue = ((Boolean) tp3Var.getValue()).booleanValue();
        ox0 ox0Var = this.g;
        mu0 mu0Var = null;
        if (zBooleanValue || no1Var == null || x32Var == null) {
            if (y()) {
                if (x32Var != null) {
                    x32Var.v(1.0f);
                }
                m50.T(ox0Var, null, new nq2(this, mu0Var, (byte) 0), 3);
                return;
            }
            return;
        }
        tp3Var.setValue(Boolean.TRUE);
        boolean zY = y();
        boolean z = !zY;
        if (!zY) {
            x32Var.v(0.0f);
        }
        m50.T(ox0Var, null, new pq2(z, this, no1Var, x32Var, null), 3);
    }

    public final void n(long j) {
        this.p.setValue(new je2(j));
    }

    public final void r() {
        w32 w32Var;
        tp3 tp3Var = this.j;
        boolean zBooleanValue = ((Boolean) tp3Var.getValue()).booleanValue();
        byte b = 3;
        ox0 ox0Var = this.g;
        mu0 mu0Var = null;
        if (zBooleanValue) {
            tp3Var.setValue(Boolean.FALSE);
            m50.T(ox0Var, null, new nq2(this, mu0Var, (byte) 2), 3);
        }
        tp3 tp3Var2 = this.t;
        if (((Boolean) tp3Var2.getValue()).booleanValue()) {
            tp3Var2.setValue(Boolean.FALSE);
            m50.T(ox0Var, null, new nq2(this, mu0Var, b), 3);
        }
        if (y()) {
            this.a.setValue(Boolean.FALSE);
            m50.T(ox0Var, null, new nq2(this, mu0Var, (byte) 4), 3);
        }
        this.l = false;
        n(0L);
        this.q = 9223372034707292159L;
        x32 x32Var = this.i;
        if (x32Var != null && (w32Var = this.y) != null) {
            w32Var.g(x32Var);
        }
        this.i = null;
        this.n = null;
        this.x = null;
        this.v = null;
    }

    public final boolean y() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
