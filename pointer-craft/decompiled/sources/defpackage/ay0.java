package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ay0 extends c93 {
    public final r6 G;

    public ay0(i00 i00Var) {
        this.G = i00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay0) && yf2.p(this.G, ((ay0) obj).G);
    }

    public final int hashCode() {
        return this.G.hashCode();
    }

    @Override // defpackage.c93
    public final int p(int i, int i2, fl2 fl2Var) {
        return this.G.g(i2, i, fl2Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.G + ")";
    }
}
