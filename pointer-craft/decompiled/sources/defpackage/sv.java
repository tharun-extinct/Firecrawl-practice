package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sv {
    public final float g;
    public final int n;
    public final float r;
    public final long v;
    public final float y;

    public sv(ff3 ff3Var) {
        ff3Var.getClass();
        float f = ff3Var.r;
        float f2 = ff3Var.n;
        float f3 = ff3Var.y;
        int i = ff3Var.g;
        long j = ff3Var.v;
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = i;
        this.v = j;
    }

    public final float g() {
        return this.r;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.g + ", touchY=" + this.y + ", progress=" + this.r + ", swipeEdge=" + this.n + ", frameTimeMillis=" + this.v + ')';
    }
}
