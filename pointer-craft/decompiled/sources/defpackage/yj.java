package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes2.dex */
public final class yj extends SegmentFinder {
    public final /* synthetic */ rk4 g;

    public yj(rk4 rk4Var) {
        this.g = rk4Var;
    }

    public final int nextEndBoundary(int i) {
        return this.g.n(i);
    }

    public final int nextStartBoundary(int i) {
        return this.g.l(i);
    }

    public final int previousEndBoundary(int i) {
        return this.g.m(i);
    }

    public final int previousStartBoundary(int i) {
        return this.g.y(i);
    }
}
