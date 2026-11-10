package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public interface dh2 extends dx0 {
    ya1 A(xy1 xy1Var);

    ya1 D(boolean z, boolean z2, fd fdVar);

    Object M(ou0 ou0Var);

    be0 i(nh2 nh2Var);

    boolean isCancelled();

    CancellationException k();

    boolean start();

    void x(CancellationException cancellationException);

    boolean y();
}
