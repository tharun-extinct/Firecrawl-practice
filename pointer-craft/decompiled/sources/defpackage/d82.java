package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d82 implements bq4 {
    public final /* synthetic */ f82 a;
    public final ew1 j;
    public boolean t;

    public d82(f82 f82Var) {
        this.a = f82Var;
        this.j = new ew1(((g34) f82Var.r.m).j.r());
    }

    @Override // defpackage.bq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.t) {
            return;
        }
        this.t = true;
        f82 f82Var = this.a;
        ((g34) f82Var.r.m).flush();
        ew1 ew1Var = this.j;
        m95 m95Var = ew1Var.v;
        ew1Var.v = m95.n;
        m95Var.g();
        m95Var.y();
        f82Var.n = (byte) 3;
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final void flush() {
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
        } else {
            us5.y(c70Var.t, 0L, j);
            ((g34) this.a.r.m).z(j, c70Var);
        }
    }
}
