package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static final b1 n;
    public static final b1 r;
    public final boolean g;
    public final Throwable y;

    static {
        if (h1.m) {
            n = null;
            r = null;
        } else {
            n = new b1(null, false);
            r = new b1(null, true);
        }
    }

    public b1(Throwable th, boolean z) {
        this.g = z;
        this.y = th;
    }
}
