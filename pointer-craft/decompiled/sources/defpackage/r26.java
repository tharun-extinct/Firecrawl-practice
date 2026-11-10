package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class r26 implements wi6, hk3, ak3, wj3 {
    public final nu0 a;
    public final /* synthetic */ byte j;
    public final nj6 m;
    public final Executor t;

    public /* synthetic */ r26(Executor executor, nu0 nu0Var, nj6 nj6Var, byte b) {
        this.j = b;
        this.t = executor;
        this.a = nu0Var;
        this.m = nj6Var;
    }

    @Override // defpackage.wi6
    public final void g(nj6 nj6Var) {
        byte b = this.j;
        Executor executor = this.t;
        boolean z = false;
        switch (b) {
            case 0:
                executor.execute(new i26((byte) 20, this, nj6Var, z));
                break;
            default:
                executor.execute(new i26((byte) 21, this, nj6Var, z));
                break;
        }
    }

    @Override // defpackage.ak3
    public void m(Exception exc) {
        this.m.w(exc);
    }

    @Override // defpackage.hk3
    public void v(Object obj) {
        this.m.m(obj);
    }

    @Override // defpackage.wj3
    public void y() {
        this.m.c();
    }
}
