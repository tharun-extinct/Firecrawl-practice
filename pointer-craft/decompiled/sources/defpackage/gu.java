package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gu extends yh0 {
    public final xh0 g;
    public final f9 y;

    public gu(xh0 xh0Var, cu cuVar) {
        this.g = xh0Var;
        this.y = cuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yh0) {
            yh0 yh0Var = (yh0) obj;
            xh0 xh0Var = this.g;
            if (xh0Var != null ? xh0Var.equals(((gu) yh0Var).g) : ((gu) yh0Var).g == null) {
                f9 f9Var = this.y;
                if (f9Var != null ? f9Var.equals(((gu) yh0Var).y) : ((gu) yh0Var).y == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xh0 xh0Var = this.g;
        int iHashCode = ((xh0Var == null ? 0 : xh0Var.hashCode()) ^ 1000003) * 1000003;
        f9 f9Var = this.y;
        return iHashCode ^ (f9Var != null ? f9Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.g + ", androidClientInfo=" + this.y + "}";
    }
}
