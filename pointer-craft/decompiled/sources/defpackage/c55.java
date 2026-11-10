package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c55 implements jq1, kz1 {
    public final /* synthetic */ e04 g;

    public c55(e04 e04Var) {
        this.g = e04Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jq1) || !(obj instanceof kz1)) {
            return false;
        }
        return this.g.equals(((kz1) obj).y());
    }

    @Override // defpackage.jq1
    public final float g() {
        return ((Number) this.g.get()).floatValue();
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.kz1
    public final jz1 y() {
        return this.g;
    }
}
