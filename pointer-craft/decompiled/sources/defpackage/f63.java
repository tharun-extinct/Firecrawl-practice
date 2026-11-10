package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f63 {
    public static f63 r;
    public static final Object y = new Object();
    public lm0 g;

    public static f63 y() {
        f63 f63Var;
        synchronized (y) {
            jr2.w("MlKitContext has not been initialized", r != null);
            f63Var = r;
            jr2.m(f63Var);
        }
        return f63Var;
    }

    public final Object g(Class cls) {
        jr2.w("MlKitContext has been deleted", r == this);
        jr2.m(this.g);
        return this.g.g(cls);
    }
}
