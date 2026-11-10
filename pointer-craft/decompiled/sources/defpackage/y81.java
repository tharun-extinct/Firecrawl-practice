package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y81 extends RuntimeException {
    public final transient fx0 j;

    public y81(fx0 fx0Var) {
        this.j = fx0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.j);
    }
}
