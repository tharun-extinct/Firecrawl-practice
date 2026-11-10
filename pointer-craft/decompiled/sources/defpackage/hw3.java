package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw3 extends lr2 {
    public final Object v;
    public final long x;

    public hw3(long j, Object obj) {
        this.v = obj;
        this.x = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw3)) {
            return false;
        }
        hw3 hw3Var = (hw3) obj;
        return this.v.equals(hw3Var.v) && this.x == hw3Var.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + (this.v.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.v + ", compositeKey=" + this.x + ')';
    }
}
