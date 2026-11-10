package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tl3 extends zb6 {
    public final Throwable y;

    public tl3(Throwable th) {
        this.y = th;
    }

    public final String toString() {
        return du4.i("FAILURE (", this.y.getMessage(), ")");
    }
}
