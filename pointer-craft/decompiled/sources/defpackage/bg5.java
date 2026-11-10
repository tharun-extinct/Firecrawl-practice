package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bg5 {
    public final String g;
    public final int r;
    public final List y;

    public bg5(String str, List list, int i) {
        this.g = str;
        this.y = list;
        this.r = i;
    }

    public static bg5 g(bg5 bg5Var, String str, ArrayList arrayList, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = bg5Var.g;
        }
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = bg5Var.y;
        }
        if ((i2 & 4) != 0) {
            i = bg5Var.r;
        }
        bg5Var.getClass();
        str.getClass();
        return new bg5(str, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg5)) {
            return false;
        }
        bg5 bg5Var = (bg5) obj;
        return this.g.equals(bg5Var.g) && this.y.equals(bg5Var.y) && this.r == bg5Var.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(name=");
        sb.append(this.g);
        sb.append(", steps=");
        sb.append(this.y);
        sb.append(", currentStep=");
        return xi3.m(sb, this.r, ")");
    }
}
