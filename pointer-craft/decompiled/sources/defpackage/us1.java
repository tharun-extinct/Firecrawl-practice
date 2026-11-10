package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class us1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof us1);
    }

    public final void g(p33 p33Var, p33 p33Var2, long j) {
        long jX = dc6.x(j, jn2.j);
        if (p33Var != null) {
            int iP = p33Var.P(ws0.j(jX));
            new ee2(ee2.g(iP, p33Var.Z(iP)));
        }
        if (p33Var2 != null) {
            int iP2 = p33Var2.P(ws0.j(jX));
            new ee2(ee2.g(iP2, p33Var2.Z(iP2)));
        }
    }

    public final int hashCode() {
        return Integer.hashCode(0) + du4.r(0, ts1.j.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + ts1.j + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
