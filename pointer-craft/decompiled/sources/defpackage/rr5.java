package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rr5 {
    public String g;
    public int n;
    public qz0 r;
    public ArrayList v;
    public ArrayList x;
    public hr5 y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr5)) {
            return false;
        }
        rr5 rr5Var = (rr5) obj;
        if (this.n != rr5Var.n) {
            return false;
        }
        String str = this.g;
        String str2 = rr5Var.g;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        if (this.y != rr5Var.y) {
            return false;
        }
        qz0 qz0Var = this.r;
        qz0 qz0Var2 = rr5Var.r;
        if (qz0Var != null) {
            if (!qz0Var.equals(qz0Var2)) {
                return false;
            }
        } else if (qz0Var2 != null) {
            return false;
        }
        ArrayList arrayList = this.v;
        ArrayList arrayList2 = rr5Var.v;
        if (arrayList != null) {
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        } else if (arrayList2 != null) {
            return false;
        }
        ArrayList arrayList3 = this.x;
        ArrayList arrayList4 = rr5Var.x;
        if (arrayList3 != null) {
            return arrayList3.equals(arrayList4);
        }
        return arrayList4 == null;
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        hr5 hr5Var = this.y;
        int iHashCode2 = (iHashCode + (hr5Var != null ? hr5Var.hashCode() : 0)) * 31;
        qz0 qz0Var = this.r;
        int iHashCode3 = (((iHashCode2 + (qz0Var != null ? qz0Var.hashCode() : 0)) * 31) + this.n) * 31;
        ArrayList arrayList = this.v;
        int iHashCode4 = (iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList arrayList2 = this.x;
        return iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }
}
