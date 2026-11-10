package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ok1 extends uk1 {
    public final Integer n;
    public final String r;
    public final boolean v;
    public final boolean x;
    public final f61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(f61 f61Var, String str, Integer num, boolean z, boolean z2) {
        super(z2 ? R.string.connection_info_pairing_requested : (z && f61Var == f61.q) ? R.string.connection_info_linked_not_input : f61Var == f61.w ? R.string.connection_info_bond_lost : f61Var == f61.a ? R.string.connection_info_host_rejected : f61Var == f61.j ? R.string.connection_info_never_connected : (f61Var == f61.t || f61Var == f61.m) ? R.string.connection_info_profile_not_connected : R.string.connection_info_disconnected);
        f61Var.getClass();
        this.y = f61Var;
        this.r = str;
        this.n = num;
        this.v = z;
        this.x = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return this.y == ok1Var.y && yf2.p(this.r, ok1Var.r) && yf2.p(this.n, ok1Var.n) && this.v == ok1Var.v && this.x == ok1Var.x;
    }

    public final int hashCode() {
        int iX = xi3.x(this.y.hashCode() * 31, 31, this.r);
        Integer num = this.n;
        return Boolean.hashCode(this.x) + xi3.l((iX + (num == null ? 0 : num.hashCode())) * 31, 31, this.v);
    }

    public final String toString() {
        return "Disconnected(reason=" + this.y + ", deviceName=" + this.r + ", infoMessage=" + this.n + ", stillLinked=" + this.v + ", pairingRequested=" + this.x + ")";
    }
}
