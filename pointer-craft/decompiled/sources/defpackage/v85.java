package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v85 implements u85 {
    public final x85 a;
    public final Object j;
    public final ThreadLocal t;

    public v85(Object obj, ThreadLocal threadLocal) {
        this.j = obj;
        this.t = threadLocal;
        this.a = new x85(threadLocal);
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return this.a.equals(ex0Var) ? ni1.j : this;
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.dx0
    public final ex0 getKey() {
        return this.a;
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        if (this.a.equals(ex0Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.u85
    public final void o(Object obj) {
        this.t.set(obj);
    }

    @Override // defpackage.u85
    public final Object t() {
        ThreadLocal threadLocal = this.t;
        Object obj = threadLocal.get();
        threadLocal.set(this.j);
        return obj;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.j + ", threadLocal = " + this.t + ')';
    }
}
