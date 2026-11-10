package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j54 {
    public boolean a;
    public int c;
    public int g;
    public boolean j;
    public boolean l;
    public boolean m;
    public byte n;
    public int q;
    public int r;
    public boolean t;
    public int v;
    public long w;
    public boolean x;
    public int y;

    public final void g(int i) {
        if ((this.n & i) != 0) {
            return;
        }
        uo1.h("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.n));
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.g + ", mData=null, mItemCount=" + this.v + ", mIsMeasuring=" + this.t + ", mPreviousLayoutItemCount=" + this.y + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.r + ", mStructureChanged=" + this.x + ", mInPreLayout=" + this.l + ", mRunSimpleAnimations=" + this.a + ", mRunPredictiveAnimations=" + this.m + '}';
    }

    public final int y() {
        return this.l ? this.y - this.r : this.v;
    }
}
