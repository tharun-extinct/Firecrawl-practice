package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j16 implements Runnable {
    public final h36 j;
    public final a36 t;

    public j16(h36 h36Var, a36 a36Var) {
        this.j = h36Var;
        this.t = a36Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j.j != this) {
            return;
        }
        a36 a36Var = this.t;
        if (t16.c.j(this.j, this, h36.j(a36Var))) {
            h36.a(this.j);
        }
    }
}
