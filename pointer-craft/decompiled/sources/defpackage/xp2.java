package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 implements n14 {
    public static final Object r = new Object();
    public volatile Object g = r;
    public volatile n14 y;

    public xp2(n14 n14Var) {
        this.y = n14Var;
    }

    @Override // defpackage.n14
    public final Object get() {
        Object obj;
        Object obj2 = this.g;
        Object obj3 = r;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.g;
                if (obj == obj3) {
                    obj = this.y.get();
                    this.g = obj;
                    this.y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
