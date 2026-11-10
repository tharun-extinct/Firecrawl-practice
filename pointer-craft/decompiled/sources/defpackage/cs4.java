package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cs4 {
    public final String g;
    public final xr4 r;
    public final String y;

    public cs4(String str, String str2, xr4 xr4Var) {
        this.g = str;
        this.y = str2;
        this.r = xr4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cs4.class != obj.getClass()) {
            return false;
        }
        cs4 cs4Var = (cs4) obj;
        return yf2.p(this.g, cs4Var.g) && yf2.p(this.y, cs4Var.y) && this.r == cs4Var.r;
    }

    public final String g() {
        return this.y;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        String str = this.y;
        return this.r.hashCode() + xi3.l((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, false);
    }

    public final xr4 y() {
        return this.r;
    }
}
