package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 {
    public final List g;
    public final qp2 r;
    public final Integer y;

    public xn2(List list, Integer num, qp2 qp2Var) {
        list.getClass();
        this.g = list;
        this.y = num;
        this.r = qp2Var;
    }

    public static xn2 g(xn2 xn2Var, ArrayList arrayList, Integer num, qp2 qp2Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = xn2Var.g;
        }
        if ((i & 2) != 0) {
            num = xn2Var.y;
        }
        if ((i & 4) != 0) {
            qp2Var = xn2Var.r;
        }
        xn2Var.getClass();
        list.getClass();
        return new xn2(list, num, qp2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn2)) {
            return false;
        }
        xn2 xn2Var = (xn2) obj;
        return yf2.p(this.g, xn2Var.g) && yf2.p(this.y, xn2Var.y) && yf2.p(this.r, xn2Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        Integer num = this.y;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        qp2 qp2Var = this.r;
        return iHashCode2 + (qp2Var != null ? qp2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutOverviewUiState(userMessages=" + this.g + ", isUploading=" + this.y + ", layoutShared=" + this.r + ")";
    }
}
