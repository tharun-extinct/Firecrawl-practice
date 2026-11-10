package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class o05 implements wp2, Serializable {
    public my1 j;
    public volatile Object t = hi0.D;
    public final Object a = this;

    public o05(my1 my1Var) {
        this.j = my1Var;
    }

    public final boolean g() {
        return this.t != hi0.D;
    }

    @Override // defpackage.wp2
    public final Object getValue() {
        Object objG;
        Object obj = this.t;
        hi0 hi0Var = hi0.D;
        if (obj != hi0Var) {
            return obj;
        }
        synchronized (this.a) {
            objG = this.t;
            if (objG == hi0Var) {
                my1 my1Var = this.j;
                my1Var.getClass();
                objG = my1Var.g();
                this.t = objG;
                this.j = null;
            }
        }
        return objG;
    }

    public final String toString() {
        return g() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
