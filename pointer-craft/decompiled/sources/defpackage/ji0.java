package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements AutoCloseable, ox0 {
    public final fx0 j;

    public ji0(fx0 fx0Var) {
        fx0Var.getClass();
        this.j = fx0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        v70.a(this.j, null);
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.j;
    }
}
