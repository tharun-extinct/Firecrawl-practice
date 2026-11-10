package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends hl1 {
    public final Runnable a;

    public gl1(Runnable runnable, long j) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.hl1
    public final String toString() {
        return super.toString() + this.a;
    }
}
