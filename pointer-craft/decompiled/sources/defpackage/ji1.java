package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji1 implements wa2 {
    public final boolean j;

    public ji1(boolean z) {
        this.j = z;
    }

    @Override // defpackage.wa2
    public final ih3 n() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.j ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.wa2
    public final boolean y() {
        return this.j;
    }
}
