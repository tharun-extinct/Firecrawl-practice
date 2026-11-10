package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wf6 extends wb6 {
    public final /* synthetic */ x56 a;
    public final /* synthetic */ jj6 m;
    public final /* synthetic */ x25 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf6(jj6 jj6Var, x25 x25Var, x25 x25Var2, x56 x56Var) {
        super(x25Var);
        this.t = x25Var2;
        this.a = x56Var;
        this.m = jj6Var;
    }

    @Override // defpackage.wb6
    public final void g() {
        synchronized (this.m.x) {
            try {
                jj6 jj6Var = this.m;
                x25 x25Var = this.t;
                jj6Var.v.add(x25Var);
                x25Var.g.g(new ve6(jj6Var, x25Var));
                if (this.m.m.getAndIncrement() > 0) {
                    this.m.y.n("Already connected to the service.", new Object[0]);
                }
                jj6.y(this.m, this.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
