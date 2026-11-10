package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class fp3 implements Serializable {
    public final Object j;
    public final Object t;

    public fp3(Object obj, Object obj2) {
        this.j = obj;
        this.t = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp3)) {
            return false;
        }
        fp3 fp3Var = (fp3) obj;
        return yf2.p(this.j, fp3Var.j) && yf2.p(this.t, fp3Var.t);
    }

    public final int hashCode() {
        Object obj = this.j;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.t;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.j + ", " + this.t + ')';
    }
}
