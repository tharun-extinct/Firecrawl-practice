package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iu {
    public final Object g;
    public final xx3 y;

    public iu(Object obj, xx3 xx3Var) {
        if (obj == null) {
            l0.q("Null payload");
            throw null;
        }
        this.g = obj;
        this.y = xx3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        return this.g.equals(iuVar.g) && this.y.equals(iuVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() ^ (((1000003 * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.g + ", priority=" + this.y + "}";
    }
}
