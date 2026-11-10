package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj4 implements n22 {
    public final zi4 g;

    public bj4(zi4 zi4Var) {
        this.g = zi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj4) && this.g == ((bj4) obj).g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.g + ')';
    }
}
