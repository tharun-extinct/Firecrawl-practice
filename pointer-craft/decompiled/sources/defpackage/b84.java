package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b84 implements Closeable {
    public static final a84 j;

    static {
        fa0 fa0Var = fa0.m;
        fa0Var.getClass();
        c70 c70Var = new c70();
        c70Var.D(fa0Var);
        j = new a84(fa0Var.j.length, c70Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        us5.r(t());
    }

    public abstract r70 t();

    public e43 x() {
        return null;
    }

    public abstract long y();
}
