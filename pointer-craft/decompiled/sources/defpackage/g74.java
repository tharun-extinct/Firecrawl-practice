package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g74 {
    public long g;
    public int y;

    public final synchronized boolean g() {
        return this.y == 0 || System.currentTimeMillis() > this.g;
    }

    public final synchronized void y(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.y = 0;
            }
            return;
        } else {
            this.y++;
            synchronized (this) {
                this.g = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.y) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }
}
