package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class oc4 implements wp2, Serializable {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(oc4.class, Object.class, "t");
    public volatile my1 j;
    public volatile Object t;

    @Override // defpackage.wp2
    public final Object getValue() {
        Object obj = this.t;
        if (obj != hi0.D) {
            return obj;
        }
        my1 my1Var = this.j;
        if (my1Var != null) {
            Object objG = my1Var.g();
            if (ei3.t(this, objG)) {
                this.j = null;
                return objG;
            }
        }
        return this.t;
    }

    public final String toString() {
        return this.t != hi0.D ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
