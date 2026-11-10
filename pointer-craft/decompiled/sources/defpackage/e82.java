package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class e82 extends z72 {
    public boolean q;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.q) {
            y(f82.x);
        }
        this.a = true;
    }

    @Override // defpackage.z72, defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        if (this.a) {
            l0.z("closed");
            return 0L;
        }
        if (this.q) {
            return -1L;
        }
        long j2 = super.j(8192L, c70Var);
        if (j2 != -1) {
            return j2;
        }
        this.q = true;
        y(c52.t);
        return -1L;
    }
}
