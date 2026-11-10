package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lb5 {
    public final long g;
    public final boolean r;
    public final long y;

    public lb5(long j, long j2, boolean z) {
        this.g = j;
        this.y = j2;
        this.r = z;
    }

    public final lb5 g(lb5 lb5Var) {
        return new lb5(wi3.v(this.g, lb5Var.g), Math.max(this.y, lb5Var.y), this.r || lb5Var.r);
    }
}
