package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vl2 {
    public final q04 g;
    public final int y;

    public vl2(q04 q04Var, int i) {
        this.g = q04Var;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl2)) {
            return false;
        }
        vl2 vl2Var = (vl2) obj;
        return yf2.p(this.g, vl2Var.g) && this.y == vl2Var.y;
    }

    public final q04 g() {
        return this.g;
    }

    public final int hashCode() {
        q04 q04Var = this.g;
        return Integer.hashCode(this.y) + ((q04Var == null ? 0 : q04Var.hashCode()) * 31);
    }

    public final String toString() {
        return "LayoutUiState(data=" + this.g + ", version=" + this.y + ")";
    }
}
