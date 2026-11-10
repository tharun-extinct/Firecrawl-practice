package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ir5 {
    public UUID g;
    public HashSet n;
    public qz0 r;
    public qz0 v;
    public int x;
    public hr5 y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ir5.class != obj.getClass()) {
            return false;
        }
        ir5 ir5Var = (ir5) obj;
        if (this.x == ir5Var.x && this.g.equals(ir5Var.g) && this.y == ir5Var.y && this.r.equals(ir5Var.r) && this.n.equals(ir5Var.n)) {
            return this.v.equals(ir5Var.v);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.v.hashCode() + ((this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.x;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.g + "', mState=" + this.y + ", mOutputData=" + this.r + ", mTags=" + this.n + ", mProgress=" + this.v + '}';
    }
}
