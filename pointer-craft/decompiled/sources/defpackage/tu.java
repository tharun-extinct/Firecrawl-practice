package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tu extends mg3 {
    public final lg3 g;
    public final kg3 y;

    public tu(lg3 lg3Var, kg3 kg3Var) {
        this.g = lg3Var;
        this.y = kg3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mg3) {
            mg3 mg3Var = (mg3) obj;
            lg3 lg3Var = this.g;
            if (lg3Var != null ? lg3Var.equals(((tu) mg3Var).g) : ((tu) mg3Var).g == null) {
                kg3 kg3Var = this.y;
                if (kg3Var != null ? kg3Var.equals(((tu) mg3Var).y) : ((tu) mg3Var).y == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        lg3 lg3Var = this.g;
        int iHashCode = ((lg3Var == null ? 0 : lg3Var.hashCode()) ^ 1000003) * 1000003;
        kg3 kg3Var = this.y;
        return iHashCode ^ (kg3Var != null ? kg3Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.g + ", mobileSubtype=" + this.y + "}";
    }
}
