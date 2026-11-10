package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 implements AutoCloseable {
    public static final xi1 a;
    public static yy3 m;
    public static final wi1 q;
    public final Object j;
    public volatile boolean t;

    static {
        xi1 xi1Var = new xi1();
        a = xi1Var;
        si1 si1Var = new si1(xi1Var);
        m = si1Var;
        q = new wi1(-1L, -1L, "Empty Thread", si1Var);
        tk0.g.incrementAndGet();
    }

    public xi1() {
        yi1 yi1Var = yi1.j;
        this.j = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yi1.j.close();
    }
}
