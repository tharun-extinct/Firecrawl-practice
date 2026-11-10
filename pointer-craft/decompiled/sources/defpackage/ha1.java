package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha1 extends Exception {
    public final Throwable j;

    public ha1(Throwable th, hx0 hx0Var, fx0 fx0Var) {
        super("Coroutine dispatcher " + hx0Var + " threw an exception, context = " + fx0Var, th);
        this.j = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.j;
    }
}
