package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ef4 {
    public final gj4 g;
    public final gh3 n;
    public final ne2 r;
    public final int y;

    public ef4(gj4 gj4Var, int i, ne2 ne2Var, gh3 gh3Var) {
        this.g = gj4Var;
        this.y = i;
        this.r = ne2Var;
        this.n = gh3Var;
    }

    public final bl2 g() {
        return this.n;
    }

    public final ne2 r() {
        return this.r;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.g + ", depth=" + this.y + ", viewportBoundsInWindow=" + this.r + ", coordinates=" + this.n + ")";
    }

    public final gj4 y() {
        return this.g;
    }
}
