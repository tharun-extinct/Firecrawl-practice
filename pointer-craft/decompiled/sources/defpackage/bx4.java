package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx4 implements oi5 {
    public final Object g;

    public bx4(Object obj) {
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx4) && yf2.p(this.g, ((bx4) obj).g);
    }

    @Override // defpackage.oi5
    public final Object g(tr3 tr3Var) {
        return this.g;
    }

    public final int hashCode() {
        Object obj = this.g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.g + ")";
    }
}
