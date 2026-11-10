package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qa4 {
    public final ra4 g;
    public final Throwable r;
    public final ra4 y;

    public qa4(ra4 ra4Var, up0 up0Var, Throwable th) {
        this.g = ra4Var;
        this.y = up0Var;
        this.r = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa4)) {
            return false;
        }
        qa4 qa4Var = (qa4) obj;
        return yf2.p(this.g, qa4Var.g) && yf2.p(this.y, qa4Var.y) && yf2.p(this.r, qa4Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        ra4 ra4Var = this.y;
        int iHashCode2 = (iHashCode + (ra4Var == null ? 0 : ra4Var.hashCode())) * 31;
        Throwable th = this.r;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.g + ", nextPlan=" + this.y + ", throwable=" + this.r + ')';
    }

    public /* synthetic */ qa4(ra4 ra4Var, Throwable th, int i) {
        this(ra4Var, (up0) null, (i & 4) != 0 ? null : th);
    }
}
