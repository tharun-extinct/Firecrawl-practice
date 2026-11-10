package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc5 implements fc5 {
    public final Object g;
    public final Object y;

    public gc5(Object obj, Object obj2) {
        this.g = obj;
        this.y = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fc5)) {
            return false;
        }
        fc5 fc5Var = (fc5) obj;
        return yf2.p(this.g, fc5Var.g()) && yf2.p(this.y, fc5Var.r());
    }

    @Override // defpackage.fc5
    public final Object g() {
        return this.g;
    }

    public final int hashCode() {
        Object obj = this.g;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.y;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.fc5
    public final Object r() {
        return this.y;
    }
}
