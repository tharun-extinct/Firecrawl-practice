package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class it3 extends CancellationException {
    public final /* synthetic */ byte j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it3(String str, byte b) {
        super(str);
        this.j = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.j) {
            case 0:
                setStackTrace(bd6.g);
                break;
            case 1:
                setStackTrace(m50.m);
                break;
            default:
                setStackTrace(ra.E);
                break;
        }
        return this;
    }
}
