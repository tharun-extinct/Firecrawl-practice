package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public byte g = 1;
    public x53 n;
    public x53 r;
    public int v;
    public int x;
    public final x53 y;

    public ci1(x53 x53Var) {
        this.y = x53Var;
        this.r = x53Var;
    }

    public final void g() {
        this.g = (byte) 1;
        this.r = this.y;
        this.x = 0;
    }

    public final boolean y() {
        v53 v53VarY = this.r.y.y();
        int iG = v53VarY.g(6);
        return !(iG == 0 || ((ByteBuffer) v53VarY.m).get(iG + v53VarY.j) == 0) || this.v == 65039;
    }
}
