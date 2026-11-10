package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk4 implements Runnable {
    public boolean a;
    public final ju2 j;
    public final vt2 t;

    public pk4(ju2 ju2Var, vt2 vt2Var) {
        vt2Var.getClass();
        this.j = ju2Var;
        this.t = vt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.j.n(this.t);
        this.a = true;
    }
}
