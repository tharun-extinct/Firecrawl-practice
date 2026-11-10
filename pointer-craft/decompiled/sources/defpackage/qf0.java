package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf0 {
    public int a;
    public float b;
    public float c;
    public int g;
    public boolean h;
    public float i;
    public int j;
    public int l;
    public int m;
    public boolean n;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final boolean g(boolean z) {
        if (this.q <= 0) {
            return false;
        }
        if (z || this.m <= 0) {
            return z && this.a > 0;
        }
        return true;
    }

    public final void y() {
        if (this.t >= 0) {
            return;
        }
        l0.u("indicatorTrackGapSize must be >= 0.");
    }
}
