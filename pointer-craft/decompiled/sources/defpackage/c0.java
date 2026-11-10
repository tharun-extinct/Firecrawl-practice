package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final c0 n;
    public static final c0 r;
    public final boolean g;
    public final Throwable y;

    static {
        if (k0.m) {
            n = null;
            r = null;
        } else {
            n = new c0(null, false);
            r = new c0(null, true);
        }
    }

    public c0(Throwable th, boolean z) {
        this.g = z;
        this.y = th;
    }
}
