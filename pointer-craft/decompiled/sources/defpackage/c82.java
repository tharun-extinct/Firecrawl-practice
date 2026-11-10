package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c82 extends z72 {
    public long q;
    public final /* synthetic */ f82 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c82(f82 f82Var, a92 a92Var, long j) {
        super(f82Var, a92Var);
        a92Var.getClass();
        this.w = f82Var;
        this.q = j;
        if (j == 0) {
            y(c52.t);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zJ;
        if (this.a) {
            return;
        }
        if (this.q != 0) {
            TimeZone timeZone = ws5.g;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zJ = ws5.j(this, 100);
            } catch (IOException unused) {
                zJ = false;
            }
            if (!zJ) {
                this.w.y.j();
                y(f82.x);
            }
        }
        this.a = true;
    }

    @Override // defpackage.z72, defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        if (this.a) {
            l0.z("closed");
            return 0L;
        }
        long j2 = this.q;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = super.j(Math.min(j2, 8192L), c70Var);
        if (j3 == -1) {
            this.w.y.j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            y(f82.x);
            throw protocolException;
        }
        long j4 = this.q - j3;
        this.q = j4;
        if (j4 == 0) {
            y(c52.t);
        }
        return j3;
    }
}
