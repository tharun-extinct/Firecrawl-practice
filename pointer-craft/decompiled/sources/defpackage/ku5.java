package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ku5 extends hu5 {
    public final /* synthetic */ ht5 a;
    public final /* synthetic */ bt5 m;
    public final /* synthetic */ x25 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku5(bt5 bt5Var, x25 x25Var, x25 x25Var2, ht5 ht5Var) {
        super(x25Var);
        this.t = x25Var2;
        this.a = ht5Var;
        Objects.requireNonNull(bt5Var);
        this.m = bt5Var;
    }

    @Override // defpackage.hu5
    public final void y() {
        bt5 bt5Var = this.m;
        synchronized (bt5Var.x) {
            try {
                x25 x25Var = this.t;
                bt5Var.v.add(x25Var);
                x25Var.g.g(new rk4((Object) bt5Var, (Object) x25Var, (byte) 26));
                if (bt5Var.q.getAndIncrement() > 0) {
                    bt5Var.y.g("Already connected to the service.", new Object[0]);
                }
                bt5.y(bt5Var, this.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
