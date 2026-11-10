package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class g34 implements p70 {
    public boolean a;
    public final bq4 j;
    public final c70 t;

    public g34(bq4 bq4Var) {
        bq4Var.getClass();
        this.j = bq4Var;
        this.t = new c70();
    }

    @Override // defpackage.p70
    public final p70 J(String str) {
        if (this.a) {
            l0.z("closed");
            return null;
        }
        this.t.Q(str);
        y();
        return this;
    }

    @Override // defpackage.bq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        bq4 bq4Var = this.j;
        if (this.a) {
            return;
        }
        c70 c70Var = this.t;
        long j = c70Var.t;
        if (j > 0) {
            bq4Var.z(j, c70Var);
        }
        th = null;
        try {
            bq4Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.a = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final void flush() {
        if (this.a) {
            l0.z("closed");
            return;
        }
        c70 c70Var = this.t;
        long j = c70Var.t;
        bq4 bq4Var = this.j;
        if (j > 0) {
            bq4Var.z(j, c70Var);
        }
        bq4Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.a;
    }

    @Override // defpackage.bq4
    public final m95 r() {
        return this.j.r();
    }

    public final p70 t(int i) {
        if (this.a) {
            l0.z("closed");
            return null;
        }
        this.t.M(i);
        y();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.j + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.a) {
            l0.z("closed");
            return 0;
        }
        int iWrite = this.t.write(byteBuffer);
        y();
        return iWrite;
    }

    public final p70 x(int i) {
        if (this.a) {
            l0.z("closed");
            return null;
        }
        this.t.F(i);
        y();
        return this;
    }

    public final p70 y() {
        if (this.a) {
            l0.z("closed");
            return null;
        }
        c70 c70Var = this.t;
        long j = c70Var.t;
        if (j == 0) {
            j = 0;
        } else {
            mh4 mh4Var = c70Var.j;
            mh4Var.getClass();
            mh4 mh4Var2 = mh4Var.l;
            mh4Var2.getClass();
            int i = mh4Var2.r;
            if (i < 8192 && mh4Var2.v) {
                j -= (long) (i - mh4Var2.y);
            }
        }
        if (j > 0) {
            this.j.z(j, c70Var);
        }
        return this;
    }

    @Override // defpackage.bq4
    public final void z(long j, c70 c70Var) {
        c70Var.getClass();
        if (this.a) {
            l0.z("closed");
        } else {
            this.t.z(j, c70Var);
            y();
        }
    }
}
