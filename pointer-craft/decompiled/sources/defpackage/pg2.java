package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pg2 extends ih2 {
    public static final /* synthetic */ long w = qr.g.objectFieldOffset(pg2.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final fd q;

    public pg2(fd fdVar) {
        this.q = fdVar;
    }

    @Override // defpackage.ih2
    public final void c(Throwable th) {
        if (qr.g.compareAndSwapInt(this, w, 0, 1)) {
            this.q.a(th);
        }
    }

    @Override // defpackage.ih2
    public final boolean w() {
        return true;
    }
}
