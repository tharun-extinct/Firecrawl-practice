package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w85 {
    public static final ThreadLocal g = new ThreadLocal();

    public static el1 g() {
        ThreadLocal threadLocal = g;
        el1 el1Var = (el1) threadLocal.get();
        if (el1Var != null) {
            return el1Var;
        }
        r30 r30Var = new r30(Thread.currentThread());
        threadLocal.set(r30Var);
        return r30Var;
    }
}
