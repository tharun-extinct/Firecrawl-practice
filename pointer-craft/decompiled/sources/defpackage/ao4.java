package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao4 implements ya1 {
    public final Object a;
    public final co4 j;
    public final ib0 m;
    public final long t;

    public ao4(co4 co4Var, long j, Object obj, ib0 ib0Var) {
        this.j = co4Var;
        this.t = j;
        this.a = obj;
        this.m = ib0Var;
    }

    @Override // defpackage.ya1
    public final void g() {
        co4 co4Var = this.j;
        synchronized (co4Var) {
            if (this.t >= co4Var.b()) {
                Object[] objArr = co4Var.i;
                objArr.getClass();
                long j = this.t;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    v70.O(objArr, j, v70.f);
                    co4Var.a();
                }
            }
        }
    }
}
