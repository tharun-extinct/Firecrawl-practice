package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class xa0 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ xa0(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        int i = this.t;
        Object obj = this.a;
        switch (b) {
            case 0:
                jr2 jr2Var = (jr2) ((ha5) obj).t;
                if (jr2Var != null) {
                    jr2Var.C(i);
                }
                break;
            case 1:
                ((al1) obj).g.g.n("Selection-Changed", i);
                break;
            case 2:
                ((u23) obj).q0.n0(i);
                break;
            case 3:
                ((SystemForegroundService) obj).q.cancel(i);
                break;
            default:
                ((su5) obj).v(i);
                break;
        }
    }
}
