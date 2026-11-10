package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 implements Closeable {
    public p14 a;
    public p14 j;
    public pl1 m;
    public p14 q;
    public wx0 t;
    public p14 w;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((bc4) this.q.get()).close();
    }
}
