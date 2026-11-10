package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class bh5 implements wp2, Serializable {
    public my1 j;
    public Object t;

    @Override // defpackage.wp2
    public final Object getValue() {
        Object obj = this.t;
        if (obj != hi0.D) {
            return obj;
        }
        my1 my1Var = this.j;
        my1Var.getClass();
        Object objG = my1Var.g();
        this.t = objG;
        this.j = null;
        return objG;
    }

    public final String toString() {
        return this.t != hi0.D ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
