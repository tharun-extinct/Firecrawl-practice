package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class gs0 {
    public final ConstraintLayout g;
    public final /* synthetic */ ConstraintLayout j;
    public int l;
    public int n;
    public int r;
    public int v;
    public int x;
    public int y;

    public gs0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.j = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean g(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void y(ts0 ts0Var, vy vyVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        if (ts0Var == null) {
            return;
        }
        as0 as0Var = ts0Var.K;
        as0 as0Var2 = ts0Var.I;
        if (ts0Var.g0 == 8) {
            vyVar.v = 0;
            vyVar.x = 0;
            vyVar.l = 0;
            return;
        }
        if (ts0Var.T == null) {
            return;
        }
        int i2 = vyVar.g;
        int i3 = vyVar.y;
        int i4 = vyVar.r;
        int i5 = vyVar.n;
        int i6 = this.y + this.r;
        int i7 = this.n;
        View view = ts0Var.f0;
        int iD = du4.D(i2);
        if (iD == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iD == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.x, i7, -2);
        } else if (iD == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.x, i7, -2);
            boolean z2 = ts0Var.p == 1;
            int i8 = vyVar.a;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == ts0Var.m();
                if (vyVar.a == 2 || !z2 || ((z2 && z3) || ts0Var.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ts0Var.s(), 1073741824);
                }
            }
        } else if (iD != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.x;
            int i10 = as0Var2 != null ? as0Var2.l : 0;
            if (as0Var != null) {
                i10 += as0Var.l;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iD2 = du4.D(i3);
        if (iD2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iD2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.l, i6, -2);
        } else if (iD2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.l, i6, -2);
            boolean z4 = ts0Var.u == 1;
            int i11 = vyVar.a;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == ts0Var.s();
                if (vyVar.a == 2 || !z4 || ((z4 && z5) || ts0Var.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ts0Var.m(), 1073741824);
                }
            }
        } else if (iD2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.l;
            int i13 = as0Var2 != null ? ts0Var.J.l : 0;
            if (as0Var != null) {
                i13 += ts0Var.L.l;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        us0 us0Var = ts0Var.T;
        ConstraintLayout constraintLayout = this.j;
        if (us0Var != null && y94.k(constraintLayout.b, 256) && view.getMeasuredWidth() == ts0Var.s() && view.getMeasuredWidth() < us0Var.s() && view.getMeasuredHeight() == ts0Var.m() && view.getMeasuredHeight() < us0Var.m() && view.getBaseline() == ts0Var.a0 && !ts0Var.e() && g(ts0Var.G, iMakeMeasureSpec, ts0Var.s()) && g(ts0Var.H, iMakeMeasureSpec2, ts0Var.m())) {
            vyVar.v = ts0Var.s();
            vyVar.x = ts0Var.m();
            vyVar.l = ts0Var.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && ts0Var.W > 0.0f;
        boolean z11 = z7 && ts0Var.W > 0.0f;
        if (view == null) {
            return;
        }
        fs0 fs0Var = (fs0) view.getLayoutParams();
        int i14 = vyVar.a;
        if (i14 != 1 && i14 != 2 && z6 && ts0Var.p == 0 && z7 && ts0Var.u == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            if ((view instanceof sm5) && (ts0Var instanceof tm5)) {
                ((sm5) view).q((tm5) ts0Var, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            ts0Var.G = iMakeMeasureSpec;
            ts0Var.H = iMakeMeasureSpec2;
            ts0Var.l = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = ts0Var.h;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = ts0Var.o;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = ts0Var.k;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = ts0Var.d;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!y94.k(constraintLayout.b, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * ts0Var.W) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / ts0Var.W) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                ts0Var.G = iMakeMeasureSpec;
                ts0Var.H = iMakeMeasureSpec3;
                z = false;
                ts0Var.l = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        vyVar.t = (iMax == vyVar.r && iMax2 == vyVar.n) ? z : true;
        boolean z13 = fs0Var.c0 ? true : z12;
        if (z13 && baseline != -1 && ts0Var.a0 != baseline) {
            vyVar.t = true;
        }
        vyVar.v = iMax;
        vyVar.x = iMax2;
        vyVar.j = z13;
        vyVar.l = baseline;
    }
}
