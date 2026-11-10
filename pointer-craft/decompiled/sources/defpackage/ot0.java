package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ot0 {
    public final n60 g;
    public final ib0 y;

    public ot0(n60 n60Var, ib0 ib0Var) {
        this.g = n60Var;
        this.y = ib0Var;
    }

    public final String toString() {
        ib0 ib0Var = this.y;
        String str = ((kx0) ib0Var.q.h(kx0.t)) != null ? "Room Invalidation Tracker Refresh" : null;
        int iHashCode = hashCode();
        a11.x(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? du4.i("[", str, "](") : "(") + "currentBounds()=" + this.g.g() + ", continuation=" + ib0Var + ")";
    }
}
