package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yg6 extends wb6 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte t;

    public /* synthetic */ yg6(Object obj, byte b) {
        this.t = b;
        this.a = obj;
    }

    @Override // defpackage.wb6
    public final void g() {
        switch (this.t) {
            case 0:
                synchronized (((jj6) this.a).x) {
                    try {
                        if (((jj6) this.a).m.get() > 0 && ((jj6) this.a).m.decrementAndGet() > 0) {
                            ((jj6) this.a).y.n("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        jj6 jj6Var = (jj6) this.a;
                        if (jj6Var.w != null) {
                            jj6Var.y.n("Unbind from service.", new Object[0]);
                            jj6 jj6Var2 = (jj6) this.a;
                            jj6Var2.g.unbindService(jj6Var2.q);
                            jj6Var = (jj6) this.a;
                            jj6Var.l = false;
                            jj6Var.w = null;
                            jj6Var.q = null;
                        }
                        jj6Var.r();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                jj6 jj6Var3 = (jj6) ((at5) this.a).y;
                jj6Var3.y.n("unlinkToDeath", new Object[0]);
                ((s26) jj6Var3.w).r.unlinkToDeath(jj6Var3.a, 0);
                jj6Var3.w = null;
                jj6Var3.l = false;
                return;
        }
    }
}
