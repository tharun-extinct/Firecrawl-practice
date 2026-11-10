package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zp1 {
    public int g;
    public int j;
    public int l;
    public int n;
    public int r;
    public boolean t;
    public int v;
    public int x;
    public boolean y;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.g);
        sb.append(", mFlexLinePosition=");
        sb.append(this.r);
        sb.append(", mPosition=");
        sb.append(this.n);
        sb.append(", mOffset=");
        sb.append(this.v);
        sb.append(", mScrollingOffset=");
        sb.append(this.x);
        sb.append(", mLastScrollDelta=");
        sb.append(this.l);
        sb.append(", mItemDirection=1, mLayoutDirection=");
        return fj.x(sb, this.j, '}');
    }
}
