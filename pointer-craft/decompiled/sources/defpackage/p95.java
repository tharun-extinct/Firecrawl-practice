package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p95 extends re4 implements Runnable {
    public final long w;

    public p95(long j, ou0 ou0Var) {
        super(ou0Var, ou0Var.v());
        this.w = j;
    }

    @Override // defpackage.e, defpackage.nh2
    public final String h0() {
        return super.h0() + "(timeMillis=" + this.w + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        fx0 fx0Var = this.m;
        yf2.G(fx0Var);
        String str = ((kx0) fx0Var.h(kx0.t)) != null ? "Room Invalidation Tracker Refresh" : null;
        String string = "Timed out waiting for " + this.w + " ms";
        if (str != null) {
            StringBuilder sb = new StringBuilder("Coroutine \"");
            sb.append(str);
            sb.append("\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sb.append(string);
            string = sb.toString();
        }
        J(new n95(string, this));
    }
}
