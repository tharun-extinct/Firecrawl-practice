package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xv extends lr2 {
    public final Object v;
    public final long x;

    public xv(long j, Object obj) {
        this.v = obj;
        this.x = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return this.v.equals(xvVar.v) && this.x == xvVar.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + (this.v.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.v + ", compositeKey=" + this.x + ')';
    }
}
