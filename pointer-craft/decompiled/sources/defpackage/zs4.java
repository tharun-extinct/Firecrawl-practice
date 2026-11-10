package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs4 implements nf1 {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public zs4(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zs4) && ((zs4) obj).g == this.g;
    }

    @Override // defpackage.oi
    public final lj5 g(te5 te5Var) {
        return new rj5(this.g);
    }

    public final int hashCode() {
        return this.g;
    }
}
