package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cx4 extends ex4 {
    public final ok4 g;

    public cx4(ok4 ok4Var) {
        this.g = ok4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx4) && this.g == ((cx4) obj).g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "Error(serviceError=" + this.g + ")";
    }
}
