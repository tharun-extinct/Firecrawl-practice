package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yk0 {
    public final String g;
    public final boolean n;
    public final List r;
    public final List y;

    public yk0(String str, List list, List list2, boolean z) {
        this.g = str;
        this.y = list;
        this.r = list2;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk0)) {
            return false;
        }
        yk0 yk0Var = (yk0) obj;
        return yf2.p(this.g, yk0Var.g) && yf2.p(this.y, yk0Var.y) && yf2.p(this.r, yk0Var.r) && this.n == yk0Var.n;
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.y;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.r;
        return Boolean.hashCode(this.n) + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CommunityLayoutsUiState(message=" + this.g + ", layouts=" + this.y + ", elements=" + this.r + ", isLoading=" + this.n + ")";
    }
}
