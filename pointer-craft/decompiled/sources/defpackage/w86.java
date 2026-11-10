package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class w86 implements wi6, hk3, ak3, wj3 {
    public final Object a;
    public final /* synthetic */ byte j;
    public final Object m;
    public final Executor t;

    public w86(Executor executor, wj3 wj3Var) {
        this.j = (byte) 0;
        this.a = new Object();
        this.t = executor;
        this.m = wj3Var;
    }

    @Override // defpackage.wi6
    public final void g(nj6 nj6Var) {
        byte b = 24;
        boolean z = false;
        switch (this.j) {
            case 0:
                if (nj6Var.n) {
                    synchronized (this.a) {
                        break;
                    }
                    this.t.execute(new ml(this, b));
                    return;
                }
                return;
            case 1:
                synchronized (this.a) {
                    break;
                }
                this.t.execute(new i26((byte) 23, this, nj6Var, z));
                return;
            case 2:
                if (nj6Var.t() || nj6Var.n) {
                    return;
                }
                synchronized (this.a) {
                    break;
                }
                this.t.execute(new i26(b, this, nj6Var, z));
                return;
            case 3:
                if (nj6Var.t()) {
                    synchronized (this.a) {
                        break;
                    }
                    this.t.execute(new i26((byte) 27, this, nj6Var, z));
                    return;
                }
                return;
            default:
                this.t.execute(new i26((byte) 28, this, nj6Var, z));
                return;
        }
    }

    @Override // defpackage.ak3
    public void m(Exception exc) {
        ((nj6) this.m).w(exc);
    }

    @Override // defpackage.hk3
    public void v(Object obj) {
        ((nj6) this.m).m(obj);
    }

    @Override // defpackage.wj3
    public void y() {
        ((nj6) this.m).c();
    }

    public w86(Executor executor, xj3 xj3Var) {
        this.j = (byte) 1;
        this.a = new Object();
        this.t = executor;
        this.m = xj3Var;
    }

    public w86(Executor executor, ak3 ak3Var) {
        this.j = (byte) 2;
        this.a = new Object();
        this.t = executor;
        this.m = ak3Var;
    }

    public w86(Executor executor, hk3 hk3Var) {
        this.j = (byte) 3;
        this.a = new Object();
        this.t = executor;
        this.m = hk3Var;
    }

    public w86(Executor executor, vy4 vy4Var, nj6 nj6Var) {
        this.j = (byte) 4;
        this.t = executor;
        this.a = vy4Var;
        this.m = nj6Var;
    }
}
