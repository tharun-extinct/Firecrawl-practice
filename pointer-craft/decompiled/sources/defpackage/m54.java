package defpackage;

import android.os.Build;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class m54 implements Runnable {
    public OverScroller a;
    public final /* synthetic */ RecyclerView c;
    public int j;
    public Interpolator m;
    public boolean q;
    public int t;
    public boolean w;

    public m54(RecyclerView recyclerView) {
        this.c = recyclerView;
        ug2 ug2Var = RecyclerView.Q0;
        this.m = ug2Var;
        this.q = false;
        this.w = false;
        this.a = new OverScroller(recyclerView.getContext(), ug2Var);
    }

    public final void g(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.setScrollState(2);
        this.t = 0;
        this.j = 0;
        Interpolator interpolator = this.m;
        ug2 ug2Var = RecyclerView.Q0;
        if (interpolator != ug2Var) {
            this.m = ug2Var;
            this.a = new OverScroller(recyclerView.getContext(), ug2Var);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        y();
    }

    public final void r(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.c;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.Q0;
        }
        if (this.m != interpolator) {
            this.m = interpolator;
            this.a = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.t = 0;
        this.j = 0;
        recyclerView.setScrollState(2);
        this.a.startScroll(0, 0, i, i2, i4);
        y();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.c;
        int[] iArr = recyclerView.A0;
        if (recyclerView.h == null) {
            recyclerView.removeCallbacks(this);
            this.a.abortAnimation();
            return;
        }
        this.w = false;
        this.q = true;
        recyclerView.b();
        OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.j;
            int i7 = currY - this.t;
            this.j = currX;
            this.t = currY;
            int i8 = RecyclerView.i(i6, recyclerView.P, recyclerView.R, recyclerView.getWidth());
            int i9 = RecyclerView.i(i7, recyclerView.Q, recyclerView.S, recyclerView.getHeight());
            int[] iArr2 = recyclerView.A0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.o(i8, i9, 1, iArr2, null)) {
                i8 -= iArr[0];
                i9 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i8, i9);
            }
            if (recyclerView.z != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.j0(i8, i9, iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = i8 - i10;
                int i13 = i9 - i11;
                jv2 jv2Var = recyclerView.h.q;
                if (jv2Var != null && !jv2Var.n && jv2Var.v) {
                    int iY = recyclerView.o0.y();
                    if (iY == 0) {
                        jv2Var.t();
                    } else if (jv2Var.g >= iY) {
                        jv2Var.g = iY - 1;
                        jv2Var.l(i10, i11);
                    } else {
                        jv2Var.l(i10, i11);
                    }
                }
                i = i12;
                i3 = i10;
                i2 = i13;
                i4 = i11;
            } else {
                i = i8;
                i2 = i9;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.A0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.f(i3, i4, i, i2, null, 1, iArr3);
            int i14 = i - iArr[0];
            int i15 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.k(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
            jv2 jv2Var2 = recyclerView.h.q;
            if ((jv2Var2 == null || !jv2Var2.n) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i14 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i14 > 0 ? currVelocity : 0;
                    }
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.e();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.A();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.Q.isFinished()) {
                            recyclerView.Q.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.d();
                        if (recyclerView.S.isFinished()) {
                            recyclerView.S.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O0) {
                    si0 si0Var = recyclerView.n0;
                    int[] iArr4 = (int[]) si0Var.v;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    si0Var.n = 0;
                }
            } else {
                y();
                n02 n02Var = recyclerView.m0;
                if (n02Var != null) {
                    n02Var.g(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                r44.g(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        jv2 jv2Var3 = recyclerView.h.q;
        if (jv2Var3 != null && jv2Var3.n) {
            jv2Var3.l(0, 0);
        }
        this.q = false;
        if (!this.w) {
            recyclerView.setScrollState(0);
            recyclerView.r0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = xk5.g;
            recyclerView.postOnAnimation(this);
        }
    }

    public final void y() {
        if (this.q) {
            this.w = true;
            return;
        }
        RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = xk5.g;
        recyclerView.postOnAnimation(this);
    }
}
