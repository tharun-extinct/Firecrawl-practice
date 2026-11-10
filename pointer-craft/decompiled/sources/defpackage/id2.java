package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class id2 implements hu4 {
    public final InputStream j;
    public final m95 t;

    public id2(InputStream inputStream, m95 m95Var) {
        this.j = inputStream;
        this.t = m95Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j.close();
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        try {
            this.t.x();
            mh4 mh4VarA = c70Var.A(1);
            int i = this.j.read(mh4VarA.g, mh4VarA.r, (int) Math.min(8192L, 8192 - mh4VarA.r));
            if (i != -1) {
                mh4VarA.r += i;
                long j2 = i;
                c70Var.t += j2;
                return j2;
            }
            if (mh4VarA.y != mh4VarA.r) {
                return -1L;
            }
            c70Var.j = mh4VarA.g();
            ph4.g(mh4VarA);
            return -1L;
        } catch (AssertionError e) {
            if (ts5.g(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.t;
    }

    public final String toString() {
        return "source(" + this.j + ')';
    }
}
