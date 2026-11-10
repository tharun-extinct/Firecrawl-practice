package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b82 extends z72 {
    public final /* synthetic */ f82 c;
    public long q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b82(f82 f82Var, a92 a92Var) {
        super(f82Var, a92Var);
        a92Var.getClass();
        this.c = f82Var;
        this.q = -1L;
        this.w = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zJ;
        if (this.a) {
            return;
        }
        if (this.w) {
            TimeZone timeZone = ws5.g;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zJ = ws5.j(this, 100);
            } catch (IOException unused) {
                zJ = false;
            }
            if (!zJ) {
                this.c.y.j();
                y(f82.x);
            }
        }
        this.a = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r16.w == false) goto L46;
     */
    @Override // defpackage.z72, defpackage.hu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(long r17, defpackage.c70 r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b82.j(long, c70):long");
    }
}
