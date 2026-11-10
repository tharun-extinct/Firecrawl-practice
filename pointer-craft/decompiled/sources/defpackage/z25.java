package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z25 extends v25 {
    public final Runnable a;

    public z25(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.a;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a11.z(runnable));
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.t ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
