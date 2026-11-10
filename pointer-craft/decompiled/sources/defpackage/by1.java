package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by1 extends RuntimeException {
    public final cy1 j;
    public final Throwable t;

    public by1(cy1 cy1Var, Throwable th) {
        super(th);
        this.j = cy1Var;
        this.t = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.t;
    }
}
