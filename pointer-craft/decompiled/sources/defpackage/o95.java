package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class o95 extends CancellationException {
    public final String j;
    public final int t;

    public o95(String str, int i) {
        super(str);
        this.j = str;
        this.t = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.j;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.j);
        sb.append(", ");
        return fj.x(sb, this.t, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
