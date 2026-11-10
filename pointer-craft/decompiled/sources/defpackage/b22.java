package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b22 {
    public final Map g;
    public final Map y;

    public b22(Map map, Map map2) {
        this.g = map;
        this.y = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b22)) {
            return false;
        }
        b22 b22Var = (b22) obj;
        return yf2.p(this.g, b22Var.g) && yf2.p(this.y, b22Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.g + ", providerNameToReceivers=" + this.y + ')';
    }
}
