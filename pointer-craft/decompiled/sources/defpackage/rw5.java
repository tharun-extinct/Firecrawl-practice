package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class rw5 implements hk3, ak3, wj3 {
    public final nj6 a;
    public Exception c;
    public boolean i;
    public final Object j = new Object();
    public int m;
    public int q;
    public final int t;
    public int w;

    public rw5(int i, nj6 nj6Var) {
        this.t = i;
        this.a = nj6Var;
    }

    public final void g() {
        int i = this.m;
        int i2 = this.q;
        int i3 = i + i2 + this.w;
        int i4 = this.t;
        if (i3 == i4) {
            Exception exc = this.c;
            nj6 nj6Var = this.a;
            if (exc == null) {
                if (this.i) {
                    nj6Var.c();
                    return;
                } else {
                    nj6Var.m(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            nj6Var.w(new ExecutionException(sb.toString(), this.c));
        }
    }

    @Override // defpackage.ak3
    public final void m(Exception exc) {
        synchronized (this.j) {
            this.q++;
            this.c = exc;
            g();
        }
    }

    @Override // defpackage.hk3
    public final void v(Object obj) {
        synchronized (this.j) {
            this.m++;
            g();
        }
    }

    @Override // defpackage.wj3
    public final void y() {
        synchronized (this.j) {
            this.w++;
            this.i = true;
            g();
        }
    }
}
