package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mf3 extends js2 {
    public final ff3 y;

    public mf3(ff3 ff3Var) {
        ff3Var.getClass();
        this.y = ff3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mf3.class == obj.getClass() && yf2.p(this.y, ((mf3) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.y + ", direction=-1)";
    }
}
