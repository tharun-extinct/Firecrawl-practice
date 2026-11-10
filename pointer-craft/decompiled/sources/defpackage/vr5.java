package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vr5 implements Runnable {
    public final wr5 j;
    public final String t;

    public vr5(wr5 wr5Var, String str) {
        this.j = wr5Var;
        this.t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.j.n) {
            try {
                if (((vr5) this.j.y.remove(this.t)) != null) {
                    m41 m41Var = (m41) this.j.r.remove(this.t);
                    if (m41Var != null) {
                        String str = this.t;
                        iy2.r().g(m41.s, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        m41Var.x();
                    }
                } else {
                    iy2.r().g("WrkTimerRunnable", "Timer with " + this.t + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
