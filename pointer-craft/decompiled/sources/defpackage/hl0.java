package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class hl0 {
    public static final /* synthetic */ long y = qr.g.objectFieldOffset(hl0.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable g;

    public hl0(Throwable th, boolean z) {
        this.g = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.g + ']';
    }
}
