package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 implements Comparable {
    public static final hk2 t = new hk2();
    public final int j = 132116;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hk2 hk2Var = (hk2) obj;
        hk2Var.getClass();
        return this.j - hk2Var.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hk2 hk2Var = obj instanceof hk2 ? (hk2) obj : null;
        return hk2Var != null && this.j == hk2Var.j;
    }

    public final int hashCode() {
        return this.j;
    }

    public final String toString() {
        return "2.4.20";
    }
}
