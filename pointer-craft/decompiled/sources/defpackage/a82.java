package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a82 implements bq4 {
    public final /* synthetic */ f82 a;
    public final ew1 j;
    public boolean t;

    public a82(f82 f82Var) {
        this.a = f82Var;
        this.j = new ew1(((g34) f82Var.r.m).j.r());
    }

    @Override // defpackage.bq4, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.t) {
            return;
        }
        this.t = true;
        ((g34) this.a.r.m).J("0\r\n\r\n");
        ((g34) this.a.r.m).flush();
        ew1 ew1Var = this.j;
        m95 m95Var = ew1Var.v;
        ew1Var.v = m95.n;
        m95Var.g();
        m95Var.y();
        this.a.n = (byte) 3;
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final synchronized void flush() {
        if (this.t) {
            return;
        }
        ((g34) this.a.r.m).flush();
    }

    @Override // defpackage.bq4
    public final m95 r() {
        return this.j;
    }

    @Override // defpackage.bq4
    public final void z(long j, c70 c70Var) {
        if (this.t) {
            l0.z("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        g34 g34Var = (g34) this.a.r.m;
        if (g34Var.a) {
            l0.z("closed");
            return;
        }
        g34Var.t.L(j);
        g34Var.y();
        g34Var.J("\r\n");
        g34Var.z(j, c70Var);
        g34Var.J("\r\n");
    }
}
