package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe {
    public boolean g;
    public long y;

    public final long g() {
        if (this.g) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.y - System.nanoTime());
    }
}
