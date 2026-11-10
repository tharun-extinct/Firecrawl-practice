package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements o14 {
    public static final Object r = new Object();
    public volatile o14 g;
    public volatile Object y = r;

    public qb1(o14 o14Var) {
        this.g = o14Var;
    }

    public static o14 g(o14 o14Var) {
        return o14Var instanceof qb1 ? o14Var : new qb1(o14Var);
    }

    @Override // defpackage.p14
    public final Object get() {
        Object obj;
        Object obj2 = this.y;
        Object obj3 = r;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.y;
            if (obj == obj3) {
                obj = this.g.get();
                Object obj4 = this.y;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.y = obj;
                this.g = null;
            }
        }
        return obj;
    }
}
