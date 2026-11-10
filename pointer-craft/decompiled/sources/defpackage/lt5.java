package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lt5 implements nt5 {
    public static final Object a = new Object();
    public volatile nt5 j;
    public volatile Object t;

    public static lt5 y(nt5 nt5Var) {
        if (nt5Var instanceof lt5) {
            return (lt5) nt5Var;
        }
        lt5 lt5Var = new lt5();
        lt5Var.t = a;
        lt5Var.j = nt5Var;
        return lt5Var;
    }

    @Override // defpackage.nt5
    public final Object g() {
        Object obj = this.t;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.t;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objG = this.j.g();
                Object obj4 = this.t;
                if (obj4 != obj2 && obj4 != objG) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objG + ". This is likely due to a circular dependency.");
                }
                this.t = objG;
                this.j = null;
                return objG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
