package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i16 {
    public static final i16 n;
    public static final i16 r;
    public final boolean g;
    public final Throwable y;

    static {
        if (t16.w) {
            n = null;
            r = null;
        } else {
            n = new i16(null, false);
            r = new i16(null, true);
        }
    }

    public i16(Throwable th, boolean z) {
        this.g = z;
        this.y = th;
    }
}
