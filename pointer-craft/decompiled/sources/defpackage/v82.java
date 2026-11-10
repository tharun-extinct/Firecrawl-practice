package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class v82 extends wr {
    public final /* synthetic */ w82 c;

    public v82(w82 w82Var) {
        this.c = w82Var;
    }

    @Override // defpackage.wr
    public final void a() {
        this.c.x(kk1.i);
        p82 p82Var = this.c.t;
        synchronized (p82Var) {
            long j = p82Var.o;
            long j2 = p82Var.h;
            if (j < j2) {
                return;
            }
            p82Var.h = j2 + 1;
            p82Var.f = System.nanoTime() + 1000000000;
            a35.y(p82Var.i, du4.b(new StringBuilder(), p82Var.a, " ping"), new qd((Object) p82Var, (byte) 18));
        }
    }

    public final void m() {
        if (t()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
