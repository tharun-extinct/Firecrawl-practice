package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym3 extends br2 {
    public final k44 n;

    public ym3(k44 k44Var) {
        this.n = k44Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym3) {
            return this.n.equals(((ym3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // defpackage.br2
    public final k44 p() {
        return this.n;
    }
}
