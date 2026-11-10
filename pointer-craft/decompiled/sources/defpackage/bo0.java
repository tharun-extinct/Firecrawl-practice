package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bo0 extends IllegalStateException {
    public final String j;

    public bo0(String str) {
        this.j = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.j;
    }
}
