package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class fv2 {
    public vm3 g;
    public boolean n;
    public int r;
    public boolean v;
    public int y;

    public fv2() {
        r();
    }

    public final void g() {
        boolean z = this.n;
        vm3 vm3Var = this.g;
        this.r = z ? vm3Var.l() : vm3Var.a();
    }

    public final void r() {
        this.y = -1;
        this.r = Integer.MIN_VALUE;
        this.n = false;
        this.v = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.y + ", mCoordinate=" + this.r + ", mLayoutFromEnd=" + this.n + ", mValid=" + this.v + '}';
    }

    public final void y(View view, int i) {
        int iQ = this.g.q();
        if (iQ >= 0) {
            boolean z = this.n;
            vm3 vm3Var = this.g;
            if (z) {
                this.r = this.g.q() + vm3Var.y(view);
            } else {
                this.r = vm3Var.v(view);
            }
            this.y = i;
            return;
        }
        this.y = i;
        boolean z2 = this.n;
        vm3 vm3Var2 = this.g;
        if (!z2) {
            int iV = vm3Var2.v(view);
            int iA = iV - this.g.a();
            this.r = iV;
            if (iA > 0) {
                int iL = (this.g.l() - Math.min(0, (this.g.l() - iQ) - this.g.y(view))) - (this.g.r(view) + iV);
                if (iL < 0) {
                    this.r -= Math.min(iA, -iL);
                    return;
                }
                return;
            }
            return;
        }
        int iL2 = (vm3Var2.l() - iQ) - this.g.y(view);
        this.r = this.g.l() - iL2;
        if (iL2 > 0) {
            int iR = this.r - this.g.r(view);
            int iA2 = this.g.a();
            int iMin = iR - (Math.min(this.g.v(view) - iA2, 0) + iA2);
            if (iMin < 0) {
                this.r = Math.min(iL2, -iMin) + this.r;
            }
        }
    }
}
