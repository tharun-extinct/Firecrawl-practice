package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x21 extends am1 {
    public static final x21 m;
    public nx0 a;

    static {
        int i = d35.r;
        int i2 = d35.n;
        long j = d35.v;
        String str = d35.g;
        x21 x21Var = new x21();
        x21Var.a = new nx0(i, i2, j, str);
        m = x21Var;
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        nx0.t(this.a, runnable, 6);
    }

    @Override // defpackage.hx0
    public final void P(fx0 fx0Var, Runnable runnable) {
        nx0.t(this.a, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.hx0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
