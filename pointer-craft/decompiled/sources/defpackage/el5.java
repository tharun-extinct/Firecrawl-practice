package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class el5 {
    public static final ug2 f = new ug2((byte) 3);
    public int[] a;
    public final OverScroller b;
    public final float c;
    public byte g;
    public ug2 h;
    public final int i;
    public int[] j;
    public float[] l;
    public int m;
    public float[] n;
    public View p;
    public VelocityTracker q;
    public final ya6 s;
    public int[] t;
    public boolean u;
    public float[] v;
    public final float w;
    public float[] x;
    public final int y;
    public final ViewGroup z;
    public int r = -1;
    public final ml o = new ml((Object) this, (byte) 16);

    public el5(Context context, ViewGroup viewGroup, ya6 ya6Var) {
        if (ya6Var == null) {
            l0.q("Callback may not be null");
            throw null;
        }
        this.z = viewGroup;
        this.s = ya6Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = f;
        this.b = new OverScroller(context, new dl5(this));
    }

    public final void a() {
        VelocityTracker velocityTracker = this.q;
        float f2 = this.w;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.q.getXVelocity(this.r);
        float fAbs = Math.abs(xVelocity);
        float f3 = this.c;
        if (fAbs < f3) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.q.getYVelocity(this.r);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f2 = 0.0f;
        } else if (fAbs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.u = true;
        this.s.w(this.p, xVelocity, f2);
        this.u = false;
        if (this.g == 1) {
            w(0);
        }
    }

    public final boolean b(View view, int i) {
        if (view == this.p && this.r == i) {
            return true;
        }
        if (view == null || !this.s.c(view, i)) {
            return false;
        }
        this.r = i;
        y(view, i);
        return true;
    }

    public final boolean c(int i, int i2) {
        if (this.u) {
            return j(i, i2, (int) this.q.getXVelocity(this.r), (int) this.q.getYVelocity(this.r));
        }
        l0.z("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    public final void g() {
        this.r = -1;
        float[] fArr = this.n;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.v, 0.0f);
            Arrays.fill(this.x, 0.0f);
            Arrays.fill(this.l, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.t, 0);
            Arrays.fill(this.a, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    public final boolean i(MotionEvent motionEvent) {
        View viewL;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            g();
        }
        VelocityTracker velocityTrackerObtain = this.q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m(x, y, pointerId);
            View viewL2 = l((int) x, (int) y);
            if (viewL2 == this.p && this.g == 2) {
                b(viewL2, pointerId);
            }
            int i = this.j[pointerId];
        } else if (actionMasked == 1) {
            g();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                g();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m(x2, y2, pointerId2);
                byte b = this.g;
                if (b == 0) {
                    int i2 = this.j[pointerId2];
                } else if (b == 2 && (viewL = l((int) x2, (int) y2)) == this.p) {
                    b(viewL, pointerId2);
                }
            } else if (actionMasked == 6) {
                n(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.n != null && this.v != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                int pointerId3 = motionEvent.getPointerId(i3);
                if ((this.m & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.n[pointerId3];
                    float f3 = y3 - this.v[pointerId3];
                    View viewL3 = l((int) x3, (int) y3);
                    boolean zR = r(viewL3, f2, f3);
                    if (!zR) {
                        Math.abs(f2);
                        Math.abs(f3);
                        int i4 = this.j[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i5 = this.j[pointerId3];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i6 = this.j[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i7 = this.j[pointerId3];
                        if (this.g != 1) {
                            break;
                        }
                    } else {
                        int left = viewL3.getLeft();
                        ya6 ya6Var = this.s;
                        int iG = ya6Var.g(viewL3, ((int) f2) + left);
                        int top = viewL3.getTop();
                        int iY = ya6Var.y(viewL3, ((int) f3) + top);
                        int iJ = ya6Var.j(viewL3);
                        int iT = ya6Var.t();
                        if ((iJ == 0 || (iJ > 0 && iG == left)) && (iT == 0 || (iT > 0 && iY == top))) {
                            break;
                        }
                        Math.abs(f2);
                        Math.abs(f3);
                        int i8 = this.j[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i9 = this.j[pointerId3];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i10 = this.j[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i11 = this.j[pointerId3];
                        if (this.g != 1 || (zR && b(viewL3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            q(motionEvent);
        }
        return this.g == 1;
    }

    public final boolean j(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.p.getLeft();
        int top = this.p.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.b;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            w(0);
            return false;
        }
        View view = this.p;
        int i7 = (int) this.c;
        int i8 = (int) this.w;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f2 = iAbs5;
            f3 = i9;
        } else {
            f2 = iAbs3;
            f3 = i10;
        }
        float f6 = f2 / f3;
        if (i4 != 0) {
            f4 = iAbs6;
            f5 = i9;
        } else {
            f4 = iAbs4;
            f5 = i10;
        }
        float f7 = f4 / f5;
        ya6 ya6Var = this.s;
        int iV = (int) ((v(i6, i4, ya6Var.t()) * f7) + (v(i5, i3, ya6Var.j(view)) * f6));
        this.h = f;
        overScroller.startScroll(left, top, i5, i6, iV);
        w(2);
        return true;
    }

    public final View l(int i, int i2) {
        ViewGroup viewGroup = this.z;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void m(float f2, float f3, int i) {
        float[] fArr = this.n;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.v;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.x;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.l;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.t;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.a;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.n = fArr2;
            this.v = fArr3;
            this.x = fArr4;
            this.l = fArr5;
            this.j = iArr;
            this.t = iArr2;
            this.a = iArr3;
            fArr = fArr2;
        }
        this.x[i] = f2;
        fArr[i] = f2;
        float[] fArr9 = this.v;
        this.l[i] = f3;
        fArr9[i] = f3;
        int[] iArr7 = this.j;
        int i3 = (int) f2;
        int i4 = (int) f3;
        ViewGroup viewGroup = this.z;
        int left = viewGroup.getLeft();
        int i5 = this.i;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.m |= 1 << i;
    }

    public final void n(int i) {
        float[] fArr = this.n;
        if (fArr != null) {
            int i2 = this.m;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.v[i] = 0.0f;
                this.x[i] = 0.0f;
                this.l[i] = 0.0f;
                this.j[i] = 0;
                this.t[i] = 0;
                this.a[i] = 0;
                this.m = (~i3) & i2;
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.m & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.x[pointerId] = x;
                this.l[pointerId] = y;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[RETURN] */
    public final boolean r(View view, float f2, float f3) {
        if (view != null) {
            ya6 ya6Var = this.s;
            boolean z = ya6Var.j(view) > 0;
            boolean z2 = ya6Var.t() > 0;
            int i = this.y;
            if (z && z2) {
                if ((f3 * f3) + (f2 * f2) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f3) <= i) : Math.abs(f2) > i) {
                return true;
            }
        }
        return false;
    }

    public final void t(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            g();
        }
        VelocityTracker velocityTrackerObtain = this.q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewL = l((int) x, (int) y);
            m(x, y, pointerId);
            b(viewL, pointerId);
            int i3 = this.j[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.g == 1) {
                a();
            }
            g();
            return;
        }
        ya6 ya6Var = this.s;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.g == 1) {
                    this.u = true;
                    ya6Var.w(this.p, 0.0f, 0.0f);
                    this.u = false;
                    if (this.g == 1) {
                        w(0);
                    }
                }
                g();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m(x2, y2, pointerId2);
                if (this.g == 0) {
                    b(l((int) x2, (int) y2), pointerId2);
                    int i4 = this.j[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.p;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    b(this.p, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.g == 1 && pointerId3 == this.r) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.r) {
                        View viewL2 = l((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.p;
                        if (viewL2 == view2 && b(view2, pointerId4)) {
                            i = this.r;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    a();
                }
            }
            n(pointerId3);
            return;
        }
        if (this.g == 1) {
            int i7 = this.r;
            if ((this.m & (1 << i7)) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.x;
            int i8 = this.r;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.l[i8]);
            int left = this.p.getLeft() + i9;
            int top = this.p.getTop() + i10;
            int left2 = this.p.getLeft();
            int top2 = this.p.getTop();
            if (i9 != 0) {
                left = ya6Var.g(this.p, left);
                WeakHashMap weakHashMap = xk5.g;
                this.p.offsetLeftAndRight(left - left2);
            }
            if (i10 != 0) {
                top = ya6Var.y(this.p, top);
                WeakHashMap weakHashMap2 = xk5.g;
                this.p.offsetTopAndBottom(top - top2);
            }
            if (i9 != 0 || i10 != 0) {
                ya6Var.q(this.p, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if ((this.m & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i2);
                    float y4 = motionEvent.getY(i2);
                    float f2 = x4 - this.n[pointerId5];
                    float f3 = y4 - this.v[pointerId5];
                    Math.abs(f2);
                    Math.abs(f3);
                    int i11 = this.j[pointerId5];
                    Math.abs(f3);
                    Math.abs(f2);
                    int i12 = this.j[pointerId5];
                    Math.abs(f2);
                    Math.abs(f3);
                    int i13 = this.j[pointerId5];
                    Math.abs(f3);
                    Math.abs(f2);
                    int i14 = this.j[pointerId5];
                    if (this.g != 1) {
                        View viewL3 = l((int) x4, (int) y4);
                        if (r(viewL3, f2, f3) && b(viewL3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        q(motionEvent);
    }

    public final int v(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.z.getWidth();
        float f2 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f2) + f2;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(int i) {
        this.z.removeCallbacks(this.o);
        if (this.g != i) {
            this.g = i;
            this.s.m(i);
            if (this.g == 0) {
                this.p = null;
            }
        }
    }

    public final boolean x() {
        if (this.g == 2) {
            OverScroller overScroller = this.b;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.p.getLeft();
            int top = currY - this.p.getTop();
            if (left != 0) {
                View view = this.p;
                WeakHashMap weakHashMap = xk5.g;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.p;
                WeakHashMap weakHashMap2 = xk5.g;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.q(this.p, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.z.post(this.o);
            }
        }
        return this.g == 2;
    }

    public final void y(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.z;
        if (parent != viewGroup) {
            t94.r(viewGroup, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return;
        }
        this.p = view;
        this.r = i;
        this.s.a(view, i);
        w(1);
    }
}
