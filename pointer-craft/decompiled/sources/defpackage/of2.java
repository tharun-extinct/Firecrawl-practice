package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class of2 {
    public final int g;
    public final lq2 r;
    public final int y;

    public of2(int i, int i2, lq2 lq2Var) {
        this.g = i;
        this.y = i2;
        this.r = lq2Var;
        if (i < 0) {
            pc2.g("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        pc2.g("size should be > 0");
    }
}
