package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zg5 extends b84 implements hu4 {
    public final long a;
    public final e43 t;

    public zg5(e43 e43Var, long j) {
        this.t = e43Var;
        this.a = j;
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return m95.n;
    }

    @Override // defpackage.b84
    public final r70 t() {
        return new h34(this);
    }

    @Override // defpackage.b84
    public final e43 x() {
        return this.t;
    }

    @Override // defpackage.b84
    public final long y() {
        return this.a;
    }

    @Override // defpackage.b84, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
