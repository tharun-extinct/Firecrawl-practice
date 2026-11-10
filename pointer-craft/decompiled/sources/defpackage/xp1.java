package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class xp1 {
    public int g;
    public final /* synthetic */ FlexboxLayoutManager j;
    public boolean l;
    public int n = 0;
    public int r;
    public boolean v;
    public boolean x;
    public int y;

    public xp1(FlexboxLayoutManager flexboxLayoutManager) {
        this.j = flexboxLayoutManager;
    }

    public final void g() {
        FlexboxLayoutManager flexboxLayoutManager = this.j;
        if (!flexboxLayoutManager.a() && flexboxLayoutManager.B) {
            this.r = this.v ? flexboxLayoutManager.J.l() : flexboxLayoutManager.h - flexboxLayoutManager.J.a();
            return;
        }
        boolean z = this.v;
        vm3 vm3Var = flexboxLayoutManager.J;
        this.r = z ? vm3Var.l() : vm3Var.a();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.g + ", mFlexLinePosition=" + this.y + ", mCoordinate=" + this.r + ", mPerpendicularCoordinate=" + this.n + ", mLayoutFromEnd=" + this.v + ", mValid=" + this.x + ", mAssignedFromSavedState=" + this.l + '}';
    }

    public final void y() {
        this.g = -1;
        this.y = -1;
        this.r = Integer.MIN_VALUE;
        this.x = false;
        this.l = false;
        FlexboxLayoutManager flexboxLayoutManager = this.j;
        boolean zA = flexboxLayoutManager.a();
        int i = flexboxLayoutManager.k;
        if (zA) {
            if (i == 0) {
                this.v = flexboxLayoutManager.f == 1;
                return;
            } else {
                this.v = i == 2;
                return;
            }
        }
        if (i == 0) {
            this.v = flexboxLayoutManager.f == 3;
        } else {
            this.v = i == 2;
        }
    }
}
