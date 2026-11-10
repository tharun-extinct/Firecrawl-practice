package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements Runnable {
    public final ol4 j;
    public final vw2 t;

    public h0(ol4 ol4Var, vw2 vw2Var) {
        this.j = ol4Var;
        this.t = vw2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j.j != this) {
            return;
        }
        if (k0.w.y(this.j, this, k0.l(this.t))) {
            k0.n(this.j);
        }
    }
}
