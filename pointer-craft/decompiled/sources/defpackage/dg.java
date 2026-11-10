package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.appground.blek.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg extends ViewGroup implements jg3, wn0, qn3, jj3 {
    public static final l1 H = new l1(10);
    public xy1 A;
    public final int[] B;
    public int C;
    public int D;
    public final dn1 E;
    public boolean F;
    public final um2 G;
    public final pn3 a;
    public xy1 b;
    public my1 c;
    public final yf d;
    public final yf e;
    public tp5 f;
    public final int[] h;
    public j73 i;
    public final ag3 j;
    public xy1 k;
    public my1 m;
    public long o;
    public xy1 p;
    public boolean q;
    public j51 s;
    public final View t;
    public gu2 u;
    public my1 w;
    public id4 z;

    public dg(Context context, f02 f02Var, int i, ag3 ag3Var, View view, pn3 pn3Var) {
        super(context);
        this.j = ag3Var;
        this.t = view;
        this.a = pn3Var;
        hb3 hb3Var = pq5.g;
        setTag(R.id.androidx_compose_ui_view_composition_context, f02Var);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        fl5 fl5Var = (fl5) this;
        zf zfVar = new zf(fl5Var);
        WeakHashMap weakHashMap = xk5.g;
        yo5.g(this, zfVar);
        pk5.r(this, this);
        this.m = new y4((byte) 9);
        this.w = new y4((byte) 10);
        byte b2 = 11;
        this.c = new y4(b2);
        g73 g73Var = g73.g;
        this.i = g73Var;
        this.s = y94.j();
        byte b3 = 2;
        this.h = new int[2];
        this.o = 0L;
        this.d = new yf(fl5Var, b);
        byte b4 = 1;
        this.e = new yf(fl5Var, b4);
        this.B = new int[2];
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.E = new dn1();
        um2 um2Var = new um2(3);
        um2Var.o = fl5Var;
        j73 j73VarG = dj4.g(v70.F(g73Var, yf2.g, ag3Var), true, new l1(b2));
        yu3 yu3Var = new yu3();
        yu3Var.g = new wf(fl5Var, b3);
        x60 x60Var = new x60();
        x60 x60Var2 = yu3Var.y;
        if (x60Var2 != null) {
            x60Var2.t = null;
        }
        yu3Var.y = x60Var;
        x60Var.t = yu3Var;
        setOnRequestDisallowInterceptTouchEvent$ui(x60Var);
        j73 j73VarN = k33.N(a11.w(j73VarG.n(yu3Var), new bc(fl5Var, um2Var, fl5Var, b4)), new vf(fl5Var, um2Var, b)).n(new g60(new wf(fl5Var, b)));
        um2Var.f0(this.i.n(j73VarN));
        this.b = new xf(um2Var, j73VarN, b);
        um2Var.b0(this.s);
        this.p = new z6(um2Var, b3);
        um2Var.T = new vf(fl5Var, um2Var, b4);
        um2Var.U = new wf(fl5Var, b4);
        um2Var.e0(new ag(fl5Var, um2Var));
        this.G = um2Var;
    }

    public static final void c(fl5 fl5Var) {
        if (fl5Var.q && fl5Var.isAttachedToWindow() && fl5Var.t.getParent() == fl5Var) {
            sn3 snapshotObserver = fl5Var.getSnapshotObserver();
            snapshotObserver.g.n(fl5Var, H, fl5Var.m);
        }
    }

    private final sn3 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            mc2.y("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ba) this.a).getSnapshotObserver();
    }

    public static nd2 m(nd2 nd2Var, int i, int i2, int i3, int i4) {
        int i5 = nd2Var.g - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = nd2Var.y - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = nd2Var.r - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = nd2Var.n - i4;
        return nd2.r(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int w(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(xs2.w(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // defpackage.qn3
    public final boolean A() {
        return isAttachedToWindow();
    }

    @Override // defpackage.ig3
    public final boolean a(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.ig3
    public final void g(View view, View view2, int i, int i2) {
        dn1 dn1Var = this.E;
        if (i2 == 1) {
            dn1Var.y = i;
        } else {
            dn1Var.g = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.B;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final j51 getDensity() {
        return this.s;
    }

    public final View getInteropView() {
        return this.t;
    }

    public final um2 getLayoutNode() {
        return this.G;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final gu2 getLifecycleOwner() {
        return this.u;
    }

    public final j73 getModifier() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        dn1 dn1Var = this.E;
        return dn1Var.y | dn1Var.g;
    }

    public final xy1 getOnDensityChanged$ui() {
        return this.p;
    }

    public final xy1 getOnModifierChanged$ui() {
        return this.b;
    }

    public final xy1 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.A;
    }

    public final my1 getRelease() {
        return this.c;
    }

    public final my1 getReset() {
        return this.w;
    }

    public final id4 getSavedStateRegistryOwner() {
        return this.z;
    }

    public final my1 getUpdate() {
        return this.m;
    }

    public final View getView() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.F) {
            this.G.E();
            return null;
        }
        this.t.postOnAnimation(new n9(this.e, (byte) 2));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.t.isNestedScrollingEnabled();
    }

    @Override // defpackage.ig3
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.t.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            eg3 eg3Var = this.j.g;
            eg3 eg3VarR0 = eg3Var != null ? eg3Var.R0() : null;
            if (eg3VarR0 != null) {
                eg3VarR0.Q(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.jg3
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.t.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            eg3 eg3Var = this.j.g;
            eg3 eg3VarR0 = eg3Var != null ? eg3Var.R0() : null;
            long jQ = eg3VarR0 != null ? eg3VarR0.Q(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = jb6.y(Float.intBitsToFloat((int) (jQ >> 32)));
            iArr[1] = jb6.y(Float.intBitsToFloat((int) (jQ & 4294967295L)));
        }
    }

    @Override // defpackage.wn0
    public final void n() {
        View view = this.t;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.w.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.g();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.F) {
            this.G.E();
        } else {
            this.t.postOnAnimation(new n9(this.e, (byte) 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().g.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.t.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.t;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.C = i;
        this.D = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.t.isNestedScrollingEnabled()) {
            return false;
        }
        m50.T(this.j.r(), null, new bg(z, this, d06.g(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.t.isNestedScrollingEnabled()) {
            return false;
        }
        m50.T(this.j.r(), null, new cg(this, d06.g(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final tp5 q(tp5 tp5Var) {
        pp5 pp5Var = tp5Var.g;
        nd2 nd2VarT = pp5Var.t(-1);
        nd2 nd2Var = nd2.v;
        if (!nd2VarT.equals(nd2Var) || !pp5Var.a(-9).equals(nd2Var) || pp5Var.j() != null) {
            sc2 sc2Var = this.G.M.r;
            if (sc2Var.j0.h) {
                long jY = k33.Y(sc2Var.N(0L));
                int i = (int) (jY >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jY & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jL = m50.K(sc2Var).L();
                int i3 = (int) (jL >> 32);
                int i4 = (int) (jL & 4294967295L);
                long j = sc2Var.a;
                long jY2 = k33.Y(sc2Var.N((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jY2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jY2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return tp5Var.g.p(i, i2, i5, i7);
                }
            }
        }
        return tp5Var;
    }

    @Override // defpackage.ig3
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        if (this.t.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            eg3 eg3Var = this.j.g;
            eg3 eg3VarR0 = eg3Var != null ? eg3Var.R0() : null;
            long jT0 = eg3VarR0 != null ? eg3VarR0.t0(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = jb6.y(Float.intBitsToFloat((int) (jT0 >> 32)));
            iArr[1] = jb6.y(Float.intBitsToFloat((int) (jT0 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        xy1 xy1Var = this.k;
        if (xy1Var == null) {
            return true;
        }
        xy1Var.a(rect != null ? oe6.v(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        xy1 xy1Var = this.A;
        if (xy1Var != null) {
            xy1Var.a(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(j51 j51Var) {
        if (j51Var != this.s) {
            this.s = j51Var;
            xy1 xy1Var = this.p;
            if (xy1Var != null) {
                xy1Var.a(j51Var);
            }
        }
    }

    public final void setLifecycleOwner(gu2 gu2Var) {
        if (gu2Var != this.u) {
            this.u = gu2Var;
            setTag(R.id.view_tree_lifecycle_owner, gu2Var);
        }
    }

    public final void setModifier(j73 j73Var) {
        if (j73Var != this.i) {
            this.i = j73Var;
            xy1 xy1Var = this.b;
            if (xy1Var != null) {
                xy1Var.a(j73Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(xy1 xy1Var) {
        this.p = xy1Var;
    }

    public final void setOnModifierChanged$ui(xy1 xy1Var) {
        this.b = xy1Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(xy1 xy1Var) {
        this.A = xy1Var;
    }

    public final void setRelease(my1 my1Var) {
        this.c = my1Var;
    }

    public final void setReset(my1 my1Var) {
        this.w = my1Var;
    }

    public final void setSavedStateRegistryOwner(id4 id4Var) {
        if (id4Var != this.z) {
            this.z = id4Var;
            setTag(R.id.view_tree_saved_state_registry_owner, id4Var);
        }
    }

    public final void setUpdate(my1 my1Var) {
        this.m = my1Var;
        this.q = true;
        this.d.g();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.jj3
    public final tp5 t(View view, tp5 tp5Var) {
        this.f = new tp5(tp5Var);
        return q(tp5Var);
    }

    @Override // defpackage.wn0
    public final void v() {
        this.c.g();
    }

    @Override // defpackage.wn0
    public final void x() {
        this.w.g();
        removeAllViewsInLayout();
    }

    @Override // defpackage.ig3
    public final void y(View view, int i) {
        dn1 dn1Var = this.E;
        if (i == 1) {
            dn1Var.y = 0;
        } else {
            dn1Var.g = 0;
        }
    }
}
