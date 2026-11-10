package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.card.MaterialCardView;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wg2 extends w44 {
    public Rect A;
    public long B;
    public float a;
    public vg2 d;
    public ArrayList h;
    public int i;
    public float j;
    public GestureDetector k;
    public float l;
    public float m;
    public float n;
    public ArrayList o;
    public RecyclerView p;
    public int s;
    public float t;
    public float v;
    public final ld1 w;
    public float x;
    public VelocityTracker z;
    public final ArrayList g = new ArrayList();
    public final float[] y = new float[2];
    public n54 r = null;
    public int q = -1;
    public byte c = 0;
    public final ArrayList b = new ArrayList();
    public final ml u = new ml((Object) this, (byte) 8);
    public View f = null;
    public final sg2 e = new sg2(this, 0);

    public wg2(ld1 ld1Var) {
        this.w = ld1Var;
    }

    public static boolean c(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final int a(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.t > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null && this.q > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.l);
            float xVelocity = this.z.getXVelocity(this.q);
            float yVelocity = this.z.getYVelocity(this.q);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.x && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.p.getHeight() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.t) <= height) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final void b(n54 n54Var, int i) {
        n54 n54Var2;
        ld1 ld1Var;
        ?? r12;
        View view;
        boolean z;
        int iA;
        float fSignum;
        ld1 ld1Var2;
        long j;
        if (n54Var == this.r && i == this.c) {
            return;
        }
        this.B = Long.MIN_VALUE;
        byte b = this.c;
        m(n54Var, true);
        this.c = i;
        if (i == 2) {
            if (n54Var == null) {
                l0.u("Must pass a ViewHolder when dragging");
                return;
            }
            this.f = n54Var.g;
        }
        int i2 = (1 << ((i * 8) + 8)) - 1;
        n54 n54Var3 = this.r;
        ld1 ld1Var3 = this.w;
        boolean z2 = false;
        if (n54Var3 != null) {
            View view2 = n54Var3.g;
            if (view2.getParent() != null) {
                if (b == 2 || this.c == 2) {
                    iA = 0;
                } else {
                    ld1Var3.v(this.p, n54Var3);
                    int iY = (ld1.y(983055, this.p.getLayoutDirection()) & 65280) >> 8;
                    if (iY == 0) {
                        iA = 0;
                    } else if (Math.abs(this.j) > Math.abs(this.t)) {
                        int iJ = j(iY);
                        if (iJ > 0) {
                            iA = ld1.r(iJ, this.p.getLayoutDirection());
                        } else {
                            iA = a(iY);
                            if (iA <= 0) {
                                iA = 0;
                            }
                        }
                    } else {
                        iA = a(iY);
                        if (iA <= 0) {
                            int iJ2 = j(iY);
                            if (iJ2 > 0) {
                                iA = ld1.r(iJ2, this.p.getLayoutDirection());
                            } else {
                                iA = 0;
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.z = null;
                }
                char c = 4;
                float fSignum2 = 0.0f;
                if (iA == 1 || iA == 2) {
                    fSignum = Math.signum(this.t) * this.p.getHeight();
                    ld1Var2 = ld1Var3;
                } else if (iA == 4 || iA == 8 || iA == 16 || iA == 32) {
                    ld1Var2 = ld1Var3;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.j) * this.p.getWidth();
                } else {
                    ld1Var2 = ld1Var3;
                    fSignum = 0.0f;
                }
                if (b == 2) {
                    c = '\b';
                } else if (iA > 0) {
                    c = 2;
                }
                float[] fArr = this.y;
                w(fArr);
                ld1 ld1Var4 = ld1Var2;
                char c2 = c;
                z = false;
                tg2 tg2Var = new tg2(this, n54Var3, b, fArr[0], fArr[1], fSignum2, fSignum, iA, n54Var3);
                v44 itemAnimator = this.p.getItemAnimator();
                if (itemAnimator == null) {
                    j = c2 == '\b' ? 200L : 250L;
                } else {
                    j = c2 == '\b' ? itemAnimator.v : itemAnimator.n;
                }
                ValueAnimator valueAnimator = tg2Var.l;
                valueAnimator.setDuration(j);
                this.b.add(tg2Var);
                n54Var3.b(false);
                valueAnimator.start();
                ld1Var = ld1Var4;
                n54Var2 = null;
                z2 = true;
            } else {
                z = false;
                if (view2 == this.f) {
                    n54Var2 = null;
                    this.f = null;
                } else {
                    n54Var2 = null;
                }
                ld1Var = ld1Var3;
                ld1Var.g(this.p, n54Var3);
                z2 = false;
            }
            this.r = n54Var2;
            r12 = z;
        } else {
            n54Var2 = null;
            ld1Var = ld1Var3;
            r12 = 0;
        }
        if (n54Var != null) {
            View view3 = n54Var.g;
            RecyclerView recyclerView = this.p;
            ld1Var.v(recyclerView, n54Var);
            this.i = (ld1.y(983055, recyclerView.getLayoutDirection()) & i2) >> (this.c * 8);
            this.a = view3.getLeft();
            this.m = view3.getTop();
            this.r = n54Var;
            if (i == 2) {
                view3.performHapticFeedback(r12);
            }
        }
        ViewParent parent = this.p.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.r != null ? 1 : r12);
        }
        if (!z2) {
            this.p.getLayoutManager().w = true;
        }
        n54 n54Var4 = this.r;
        byte b2 = this.c;
        if (b2 == 2 && n54Var4 != null) {
            View view4 = n54Var4.g;
            ld1Var.n = view4;
            if (view4 instanceof MaterialCardView) {
                ((MaterialCardView) view4).setDragged(true);
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((vk2) n54Var4).g, "translationZ", 0.0f, 16.0f);
                objectAnimatorOfFloat.getClass();
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        } else if (b2 == 0 && (view = (View) ld1Var.n) != null) {
            if (view instanceof MaterialCardView) {
                ((MaterialCardView) view).setDragged(r12);
            }
            ld1Var.n = n54Var2;
        }
        this.p.invalidate();
    }

    public final void i(n54 n54Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.p.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.c != 2) {
            return;
        }
        int i = (int) (this.a + this.j);
        int i2 = (int) (this.m + this.t);
        View view = n54Var.g;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.h;
            if (arrayList == null) {
                this.h = new ArrayList();
                this.o = new ArrayList();
            } else {
                arrayList.clear();
                this.o.clear();
            }
            int iRound = Math.round(this.a + this.j);
            int iRound2 = Math.round(this.m + this.t);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i3 = (iRound + width) / 2;
            int i4 = (iRound2 + height) / 2;
            g layoutManager = this.p.getLayoutManager();
            int iG = layoutManager.G();
            int i5 = 0;
            while (i5 < iG) {
                char c2 = c;
                View viewF = layoutManager.F(i5);
                if (viewF != view && viewF.getBottom() >= iRound2 && viewF.getTop() <= height && viewF.getRight() >= iRound && viewF.getLeft() <= width) {
                    n54 n54VarN = this.p.N(viewF);
                    int iAbs5 = Math.abs(i3 - ((viewF.getRight() + viewF.getLeft()) / 2));
                    int iAbs6 = Math.abs(i4 - ((viewF.getBottom() + viewF.getTop()) / 2));
                    int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.h.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        int i9 = size;
                        if (i6 <= ((Integer) this.o.get(i7)).intValue()) {
                            break;
                        }
                        i8++;
                        i7++;
                        size = i9;
                    }
                    this.h.add(i8, n54VarN);
                    this.o.add(i8, Integer.valueOf(i6));
                }
                i5++;
                c = c2;
                i = i;
                i2 = i2;
            }
            int i10 = i;
            int i11 = i2;
            ArrayList arrayList2 = this.h;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i10;
            int height2 = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size2 = arrayList2.size();
            n54 n54Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size2; i13++) {
                n54 n54Var3 = (n54) arrayList2.get(i13);
                if (left2 > 0 && (right = n54Var3.g.getRight() - width2) < 0 && n54Var3.g.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    n54Var2 = n54Var3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = n54Var3.g.getLeft() - i10) > 0 && n54Var3.g.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    n54Var2 = n54Var3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = n54Var3.g.getTop() - i11) > 0 && n54Var3.g.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    n54Var2 = n54Var3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = n54Var3.g.getBottom() - height2) < 0 && n54Var3.g.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    n54Var2 = n54Var3;
                    i12 = iAbs;
                }
            }
            if (n54Var2 == null) {
                this.h.clear();
                this.o.clear();
                return;
            }
            View view2 = n54Var2.g;
            int iY = n54Var2.y();
            n54Var.y();
            this.p.getClass();
            int iR = n54Var.r();
            int iR2 = n54Var2.r();
            wk2 wk2Var = (wk2) this.w.r;
            p04 p04Var = wk2Var.r;
            if (iR != -1 && iR2 != -1) {
                r04[] r04VarArr = p04Var.a;
                r04VarArr.getClass();
                ArrayList arrayListK0 = pr.k0(r04VarArr);
                long j = p04Var.a[iR].m;
                boolean zContains = wk2Var.x().g.contains(Long.valueOf(j));
                arrayListK0.add(iR2, (r04) arrayListK0.remove(iR));
                p04Var.a = (r04[]) arrayListK0.toArray(new r04[0]);
                wk2Var.g.r(iR, iR2);
                if (zContains) {
                    wk2Var.x().g();
                    wk2Var.x().m(Long.valueOf(j));
                }
            }
            RecyclerView recyclerView = this.p;
            g layoutManager2 = recyclerView.getLayoutManager();
            if (!(layoutManager2 instanceof LinearLayoutManager)) {
                if (layoutManager2.i()) {
                    if (g.L(view2) <= recyclerView.getPaddingLeft()) {
                        recyclerView.k0(iY);
                    }
                    if (g.O(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.k0(iY);
                    }
                }
                if (layoutManager2.b()) {
                    if (g.P(view2) <= recyclerView.getPaddingTop()) {
                        recyclerView.k0(iY);
                    }
                    if (g.J(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.k0(iY);
                        return;
                    }
                    return;
                }
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
            linearLayoutManager.w("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.W0();
            linearLayoutManager.n1();
            int iR3 = g.R(view);
            int iR4 = g.R(view2);
            byte b = iR3 < iR4 ? (byte) 1 : (byte) -1;
            boolean z = linearLayoutManager.B;
            vm3 vm3Var = linearLayoutManager.d;
            if (z) {
                if (b == 1) {
                    linearLayoutManager.p1(iR4, vm3Var.l() - (linearLayoutManager.d.r(view) + linearLayoutManager.d.v(view2)));
                    return;
                } else {
                    linearLayoutManager.p1(iR4, vm3Var.l() - linearLayoutManager.d.y(view2));
                    return;
                }
            }
            if (b == -1) {
                linearLayoutManager.p1(iR4, vm3Var.v(view2));
            } else {
                linearLayoutManager.p1(iR4, vm3Var.y(view2) - linearLayoutManager.d.r(view));
            }
        }
    }

    public final int j(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.j > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null && this.q > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.l);
            float xVelocity = this.z.getXVelocity(this.q);
            float yVelocity = this.z.getYVelocity(this.q);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.x && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.p.getWidth() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.j) <= width) {
            return 0;
        }
        return i2;
    }

    public final void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.p;
        if (recyclerView2 == recyclerView) {
            return;
        }
        sg2 sg2Var = this.e;
        if (recyclerView2 != null) {
            recyclerView2.g0(this);
            RecyclerView recyclerView3 = this.p;
            recyclerView3.k.remove(sg2Var);
            if (recyclerView3.d == sg2Var) {
                recyclerView3.d = null;
            }
            ArrayList arrayList = this.p.J;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.b;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                tg2 tg2Var = (tg2) arrayList2.get(0);
                tg2Var.l.cancel();
                this.w.g(this.p, tg2Var.v);
            }
            arrayList2.clear();
            this.f = null;
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.z = null;
            }
            vg2 vg2Var = this.d;
            if (vg2Var != null) {
                vg2Var.g = false;
                this.d = null;
            }
            if (this.k != null) {
                this.k = null;
            }
        }
        this.p = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.x = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.l = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.s = ViewConfiguration.get(this.p.getContext()).getScaledTouchSlop();
            this.p.t(this);
            this.p.k.add(sg2Var);
            RecyclerView recyclerView4 = this.p;
            ArrayList arrayList3 = recyclerView4.J;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                recyclerView4.J = arrayList3;
            }
            arrayList3.add(this);
            this.d = new vg2(this);
            this.k = new GestureDetector(this.p.getContext(), this.d);
        }
    }

    public final void m(n54 n54Var, boolean z) {
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tg2 tg2Var = (tg2) arrayList.get(size);
            if (tg2Var.v == n54Var) {
                tg2Var.m |= z;
                if (!tg2Var.q) {
                    tg2Var.l.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        n54 n54Var = this.r;
        if (n54Var != null) {
            View view = n54Var.g;
            if (c(view, x, y, this.a + this.j, this.m + this.t)) {
                return view;
            }
        }
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tg2 tg2Var = (tg2) arrayList.get(size);
            View view2 = tg2Var.v.g;
            if (c(view2, x, y, tg2Var.t, tg2Var.a)) {
                return view2;
            }
        }
        return this.p.E(x, y);
    }

    @Override // defpackage.w44
    public final void r(Rect rect, View view) {
        rect.setEmpty();
    }

    public final void s(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.n;
        this.j = fMax;
        this.t = y - this.v;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.j = fMax;
        }
        if ((i & 8) == 0) {
            this.j = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.t = Math.max(0.0f, this.t);
        }
        if ((i & 2) == 0) {
            this.t = Math.min(0.0f, this.t);
        }
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        View viewQ;
        if (this.r != null || i != 2 || this.c == 2 || this.p.getScrollState() == 1) {
            return;
        }
        g layoutManager = this.p.getLayoutManager();
        int i3 = this.q;
        n54 n54VarN = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.n;
            float y = motionEvent.getY(iFindPointerIndex) - this.v;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.s;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.i()) && ((fAbs2 <= fAbs || !layoutManager.b()) && (viewQ = q(motionEvent)) != null))) {
                n54VarN = this.p.N(viewQ);
            }
        }
        if (n54VarN == null) {
            return;
        }
        RecyclerView recyclerView = this.p;
        this.w.v(recyclerView, n54VarN);
        int iY = (ld1.y(983055, recyclerView.getLayoutDirection()) & 65280) >> 8;
        if (iY == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.n;
        float f3 = y2 - this.v;
        float fAbs3 = Math.abs(f2);
        float fAbs4 = Math.abs(f3);
        float f4 = this.s;
        if (fAbs3 >= f4 || fAbs4 >= f4) {
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (iY & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iY & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iY & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iY & 2) == 0) {
                    return;
                }
            }
            this.t = 0.0f;
            this.j = 0.0f;
            this.q = motionEvent.getPointerId(0);
            b(n54VarN, 1);
        }
    }

    @Override // defpackage.w44
    public final void v(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.r != null) {
            float[] fArr = this.y;
            w(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        n54 n54Var = this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tg2 tg2Var = (tg2) arrayList.get(i);
            n54 n54Var2 = tg2Var.v;
            float f3 = tg2Var.g;
            float f4 = tg2Var.r;
            if (f3 == f4) {
                tg2Var.t = n54Var2.g.getTranslationX();
            } else {
                tg2Var.t = du4.y(f4, f3, tg2Var.w, f3);
            }
            float f5 = tg2Var.y;
            float f6 = tg2Var.n;
            if (f5 == f6) {
                tg2Var.a = n54Var2.g.getTranslationY();
            } else {
                tg2Var.a = du4.y(f6, f5, tg2Var.w, f5);
            }
            int iSave = canvas.save();
            ld1.j(recyclerView, tg2Var.v, tg2Var.t, tg2Var.a, false);
            canvas.restoreToCount(iSave);
        }
        if (n54Var != null) {
            int iSave2 = canvas.save();
            ld1.j(recyclerView, n54Var, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void w(float[] fArr) {
        if ((this.i & 12) != 0) {
            fArr[0] = (this.a + this.j) - this.r.g.getLeft();
        } else {
            fArr[0] = this.r.g.getTranslationX();
        }
        if ((this.i & 3) != 0) {
            fArr[1] = (this.m + this.t) - this.r.g.getTop();
        } else {
            fArr[1] = this.r.g.getTranslationY();
        }
    }

    @Override // defpackage.w44
    public final void x(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.r != null) {
            float[] fArr = this.y;
            w(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        n54 n54Var = this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tg2 tg2Var = (tg2) arrayList.get(i);
            int iSave = canvas.save();
            View view = tg2Var.v.g;
            canvas.restoreToCount(iSave);
        }
        if (n54Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            tg2 tg2Var2 = (tg2) arrayList.get(i2);
            boolean z2 = tg2Var2.q;
            if (z2 && !tg2Var2.j) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
