package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hk extends ik {
    public final String g;
    public final my1 y;

    public hk(String str, my1 my1Var) {
        str.getClass();
        my1Var.getClass();
        this.g = str;
        this.y = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return yf2.p(this.g, hkVar.g) && yf2.p(this.y, hkVar.y);
    }

    public final my1 g() {
        return this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "TextAction(name=" + this.g + ", action=" + this.y + ")";
    }

    public final String y() {
        return this.g;
    }
}
