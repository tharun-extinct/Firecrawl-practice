package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class gh2 extends kk2 implements xy1 {
    public final /* synthetic */ vw2 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh2(vw2 vw2Var, byte b) {
        super(1);
        this.t = b;
        this.a = vw2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        og5 og5Var = og5.g;
        vw2 vw2Var = this.a;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ol4 ol4Var = ((hh2) vw2Var).j;
                if (th == null) {
                    if (ol4Var.isDone()) {
                        return og5Var;
                    }
                    l0.u("Failed requirement.");
                    return null;
                }
                if (th instanceof CancellationException) {
                    ol4Var.cancel(true);
                    return og5Var;
                }
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                ol4Var.m(th);
                return og5Var;
            default:
                vw2Var.cancel(false);
                return og5Var;
        }
    }
}
