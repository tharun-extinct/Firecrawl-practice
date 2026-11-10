package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class i34 implements Runnable {
    public final /* synthetic */ l34 a;
    public final ua0 j;
    public volatile AtomicInteger t = new AtomicInteger(0);

    public i34(l34 l34Var, ua0 ua0Var) {
        this.a = l34Var;
        this.j = ua0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty tyVar;
        String strConcat = "OkHttp ".concat(((a92) this.a.t.r).x());
        l34 l34Var = this.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            l34Var.q.j();
            boolean z = false;
            try {
                try {
                    try {
                        this.j.r(l34Var, l34Var.x());
                        tyVar = l34Var.j.g;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            ys3 ys3Var = ys3.g;
                            ys3 ys3Var2 = ys3.g;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((l34Var.k ? "canceled " : "") + "call to " + ((a92) l34Var.t.r).x());
                            ys3Var2.a(sb.toString(), 4, e);
                        } else {
                            this.j.a(l34Var, e);
                        }
                        tyVar = l34Var.j.g;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        l34Var.r();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.j.a(l34Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        tyVar = l34Var.j.g;
                    }
                } catch (Throwable th2) {
                    ty tyVar2 = l34Var.j.g;
                    tyVar2.getClass();
                    ty.w(tyVar2, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            tyVar.getClass();
            ty.w(tyVar, null, this, 3);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
