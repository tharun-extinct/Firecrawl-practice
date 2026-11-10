package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 {
    public final Object g;
    public final Object n;
    public final cz1 r;
    public final Throwable v;
    public final cb0 y;

    public /* synthetic */ fl0(Object obj, cb0 cb0Var, cz1 cz1Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : cb0Var, (i & 4) != 0 ? null : cz1Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static fl0 g(fl0 fl0Var, cb0 cb0Var, Throwable th, int i) {
        Object obj = fl0Var.g;
        if ((i & 2) != 0) {
            cb0Var = fl0Var.y;
        }
        cb0 cb0Var2 = cb0Var;
        cz1 cz1Var = fl0Var.r;
        Object obj2 = fl0Var.n;
        if ((i & 16) != 0) {
            th = fl0Var.v;
        }
        return new fl0(obj, cb0Var2, cz1Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl0)) {
            return false;
        }
        fl0 fl0Var = (fl0) obj;
        return yf2.p(this.g, fl0Var.g) && yf2.p(this.y, fl0Var.y) && yf2.p(this.r, fl0Var.r) && yf2.p(this.n, fl0Var.n) && yf2.p(this.v, fl0Var.v);
    }

    public final int hashCode() {
        Object obj = this.g;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        cb0 cb0Var = this.y;
        int iHashCode2 = (iHashCode + (cb0Var == null ? 0 : cb0Var.hashCode())) * 31;
        cz1 cz1Var = this.r;
        int iHashCode3 = (iHashCode2 + (cz1Var == null ? 0 : cz1Var.hashCode())) * 31;
        Object obj2 = this.n;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.v;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.g + ", cancelHandler=" + this.y + ", onCancellation=" + this.r + ", idempotentResume=" + this.n + ", cancelCause=" + this.v + ')';
    }

    public fl0(Object obj, cb0 cb0Var, cz1 cz1Var, Object obj2, Throwable th) {
        this.g = obj;
        this.y = cb0Var;
        this.r = cz1Var;
        this.n = obj2;
        this.v = th;
    }
}
