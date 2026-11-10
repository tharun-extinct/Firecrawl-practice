package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends CancellationException {
    public final transient gr1 j;

    public r(gr1 gr1Var) {
        super("Flow was aborted, no more elements needed");
        this.j = gr1Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
