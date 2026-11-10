package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr {
    public final p74 g;

    public yr(p74 p74Var) {
        this.g = p74Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr) && yf2.p(this.g, ((yr) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.g + ", loaderKey=null)";
    }
}
