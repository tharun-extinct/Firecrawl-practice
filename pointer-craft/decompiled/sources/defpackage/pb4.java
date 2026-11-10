package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pb4 {
    public int g;
    public boolean j;
    public boolean l;
    public int n;
    public int r;
    public int v;
    public int x;
    public int y;

    public final void g(int i, int i2) {
        this.r = i;
        this.n = i2;
        this.j = true;
        if (this.l) {
            if (i2 != Integer.MIN_VALUE) {
                this.g = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.y = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.g = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.y = i2;
        }
    }
}
