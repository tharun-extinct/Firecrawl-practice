package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e84 extends ix {
    public e84(mu0 mu0Var) {
        super(mu0Var);
        if (mu0Var == null || mu0Var.v() == ni1.j) {
            return;
        }
        l0.u("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return ni1.j;
    }
}
