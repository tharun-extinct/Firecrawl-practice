package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yy3 extends uq4 {
    public final ma3 m;
    public volatile b95 q;
    public volatile b95 w;

    public yy3(xi1 xi1Var, int i, String str) {
        super(xi1Var, tk0.g.incrementAndGet());
        int i2 = my2.g;
        this.m = new ma3(6);
        new hb3();
    }

    public b95 x(long j, long j2, String str) {
        b95 b95Var;
        synchronized (this.m) {
            try {
                ma3 ma3Var = this.m;
                Object objN = ma3Var.n(j);
                if (objN == null) {
                    b95 b95Var2 = new b95(j, j2, str, this);
                    ma3Var.l(j, b95Var2);
                    objN = b95Var2;
                }
                b95Var = (b95) objN;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b95Var;
    }
}
