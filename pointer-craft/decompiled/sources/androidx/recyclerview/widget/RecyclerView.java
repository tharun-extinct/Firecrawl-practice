package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a54;
import defpackage.b54;
import defpackage.bf6;
import defpackage.br2;
import defpackage.c31;
import defpackage.c54;
import defpackage.cd2;
import defpackage.cl5;
import defpackage.d54;
import defpackage.du4;
import defpackage.e54;
import defpackage.ee0;
import defpackage.f54;
import defpackage.g54;
import defpackage.hg3;
import defpackage.i54;
import defpackage.j21;
import defpackage.j54;
import defpackage.jl5;
import defpackage.jv2;
import defpackage.k12;
import defpackage.k54;
import defpackage.l0;
import defpackage.l54;
import defpackage.m54;
import defpackage.n02;
import defpackage.n24;
import defpackage.n44;
import defpackage.n54;
import defpackage.o44;
import defpackage.o5;
import defpackage.p44;
import defpackage.p5;
import defpackage.p54;
import defpackage.q91;
import defpackage.qo3;
import defpackage.rk5;
import defpackage.ro3;
import defpackage.s44;
import defpackage.si0;
import defpackage.sn1;
import defpackage.sp4;
import defpackage.t44;
import defpackage.u44;
import defpackage.ug2;
import defpackage.uo1;
import defpackage.up;
import defpackage.uy2;
import defpackage.v44;
import defpackage.vm3;
import defpackage.w44;
import defpackage.wg2;
import defpackage.xk5;
import defpackage.y44;
import defpackage.z44;
import defpackage.za6;
import defpackage.zk5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup {
    public static boolean J0 = false;
    public static boolean K0 = false;
    public static final int[] L0 = {R.attr.nestedScrollingEnabled};
    public static final float M0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean N0 = true;
    public static final boolean O0 = true;
    public static final Class[] P0;
    public static final ug2 Q0;
    public static final k54 R0;
    public boolean A;
    public final int[] A0;
    public boolean B;
    public final ArrayList B0;
    public int C;
    public final n44 C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public int E0;
    public boolean F;
    public int F0;
    public int G;
    public final boolean G0;
    public boolean H;
    public final k12 H0;
    public final AccessibilityManager I;
    public final q91 I0;
    public ArrayList J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public t44 O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public v44 T;
    public int U;
    public int V;
    public VelocityTracker W;
    public final e54 a;
    public int a0;
    public final n44 b;
    public int b0;
    public final cd2 c;
    public int c0;
    public a54 d;
    public int d0;
    public boolean e;
    public int e0;
    public final ArrayList f;
    public z44 f0;
    public final int g0;
    public g h;
    public final int h0;
    public boolean i;
    public final float i0;
    public final float j;
    public final float j0;
    public final ArrayList k;
    public boolean k0;
    public final m54 l0;
    public g54 m;
    public n02 m0;
    public final si0 n0;
    public final ArrayList o;
    public final j54 o0;
    public final Rect p;
    public b54 p0;
    public final p5 q;
    public ArrayList q0;
    public boolean r0;
    public final Rect s;
    public boolean s0;
    public final c31 t;
    public final k12 t0;
    public final RectF u;
    public boolean u0;
    public p54 v0;
    public final ee0 w;
    public final int[] w0;
    public hg3 x0;
    public final int[] y0;
    public p44 z;
    public final int[] z0;

    static {
        Class cls = Integer.TYPE;
        P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Q0 = new ug2((byte) 2);
        R0 = new k54();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        byte b = 1;
        this.t = new c31(this, b);
        this.a = new e54(this);
        this.c = new cd2((byte) 22);
        this.b = new n44(this, (byte) 0);
        this.s = new Rect();
        this.p = new Rect();
        this.u = new RectF();
        this.o = new ArrayList();
        this.f = new ArrayList();
        this.k = new ArrayList();
        this.C = 0;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = R0;
        j21 j21Var = new j21();
        j21Var.g = null;
        j21Var.y = new ArrayList();
        j21Var.r = (byte) 120;
        j21Var.n = (byte) 120;
        j21Var.v = (short) 250;
        j21Var.x = (short) 250;
        j21Var.l = true;
        j21Var.j = new ArrayList();
        j21Var.t = new ArrayList();
        j21Var.a = new ArrayList();
        j21Var.m = new ArrayList();
        j21Var.q = new ArrayList();
        j21Var.w = new ArrayList();
        j21Var.c = new ArrayList();
        j21Var.i = new ArrayList();
        j21Var.b = new ArrayList();
        j21Var.s = new ArrayList();
        j21Var.p = new ArrayList();
        this.T = j21Var;
        this.U = 0;
        this.V = -1;
        this.i0 = Float.MIN_VALUE;
        this.j0 = Float.MIN_VALUE;
        this.k0 = true;
        this.l0 = new m54(this);
        this.n0 = O0 ? new si0((byte) 2) : null;
        j54 j54Var = new j54();
        j54Var.g = -1;
        j54Var.y = 0;
        j54Var.r = 0;
        j54Var.n = (byte) 1;
        j54Var.v = 0;
        j54Var.x = false;
        j54Var.l = false;
        j54Var.j = false;
        j54Var.t = false;
        j54Var.a = false;
        j54Var.m = false;
        this.o0 = j54Var;
        this.r0 = false;
        this.s0 = false;
        k12 k12Var = new k12(this, null == true ? 1 : 0);
        this.t0 = k12Var;
        this.u0 = false;
        this.w0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new ArrayList();
        this.C0 = new n44(this, b);
        this.E0 = 0;
        this.F0 = 0;
        this.H0 = new k12(this, null == true ? 1 : 0);
        this.I0 = new q91(getContext(), new o44(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.e0 = viewConfiguration.getScaledTouchSlop();
        this.i0 = cl5.y(viewConfiguration, context);
        this.j0 = cl5.r(viewConfiguration, context);
        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.T.g = k12Var;
        this.q = new p5(new o44(this));
        this.w = new ee0(new k12(this, null == true ? 1 : 0));
        WeakHashMap weakHashMap = xk5.g;
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 26 ? rk5.g(this) : 0) == 0 && i3 >= 26) {
            rk5.y(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.I = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new p54(this));
        int[] iArr = n24.g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        xk5.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                l0.u("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new sn1(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(io.appground.blek.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(io.appground.blek.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(io.appground.blek.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.G0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(g.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(P0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[b] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((g) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    up.x(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    up.x(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    up.x(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    up.x(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    up.x(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = L0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        xk5.m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(io.appground.blek.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static n54 O(View view) {
        if (view == null) {
            return null;
        }
        return ((y44) view.getLayoutParams()).j;
    }

    private hg3 getScrollingChildHelper() {
        hg3 hg3Var = this.x0;
        if (hg3Var != null) {
            return hg3Var;
        }
        hg3 hg3Var2 = new hg3(this);
        this.x0 = hg3Var2;
        return hg3Var2;
    }

    public static int i(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && bf6.y(edgeEffect) != 0.0f) {
            int iRound = Math.round(bf6.r(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || bf6.y(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(bf6.r(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void q(n54 n54Var) {
        WeakReference weakReference = n54Var.y;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == n54Var.g) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            n54Var.y = null;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        J0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        K0 = z;
    }

    public final void A() {
        if (this.R != null) {
            return;
        }
        ((k54) this.O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.R = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.Q != null) {
            return;
        }
        ((k54) this.O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.z + ", layout:" + this.h + ", context:" + getContext();
    }

    public final void D(j54 j54Var) {
        if (getScrollState() != 2) {
            j54Var.getClass();
            return;
        }
        OverScroller overScroller = this.l0.a;
        overScroller.getFinalX();
        overScroller.getCurrX();
        j54Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(float f, float f2) {
        ee0 ee0Var = this.w;
        for (int iV = ee0Var.v() - 1; iV >= 0; iV--) {
            View viewN = ee0Var.n(iV);
            float translationX = viewN.getTranslationX();
            float translationY = viewN.getTranslationY();
            if (f >= viewN.getLeft() + translationX && f <= viewN.getRight() + translationX && f2 >= viewN.getTop() + translationY && f2 <= viewN.getBottom() + translationY) {
                return viewN;
            }
        }
        return null;
    }

    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a54 a54Var = (a54) arrayList.get(i);
            if (a54Var.g(this, motionEvent) && action != 3) {
                this.d = a54Var;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        ee0 ee0Var = this.w;
        int iV = ee0Var.v();
        if (iV == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iV; i3++) {
            n54 n54VarO = O(ee0Var.n(i3));
            if (!n54VarO.s()) {
                int iN = n54VarO.n();
                if (iN < i) {
                    i = iN;
                }
                if (iN > i2) {
                    i2 = iN;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final n54 J(int i) {
        n54 n54Var = null;
        if (this.K) {
            return null;
        }
        ee0 ee0Var = this.w;
        int iJ = ee0Var.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            n54 n54VarO = O(ee0Var.l(i2));
            if (n54VarO != null && !n54VarO.a() && L(n54VarO) == i) {
                if (!ee0Var.r.contains(n54VarO.g)) {
                    return n54VarO;
                }
                n54Var = n54VarO;
            }
        }
        return n54Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:165:0x021d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        vm3 vm3VarN;
        int iR;
        PointF pointFV;
        int i6;
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.E) {
            boolean zI = gVar.i();
            boolean zB = this.h.b();
            int i7 = (!zI || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zB || Math.abs(i2) < i3) ? 0 : i2;
            if (i7 != 0 || iMax2 != 0) {
                if (i7 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.P;
                    if (edgeEffect == null || bf6.y(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.R;
                        if (edgeEffect2 == null || bf6.y(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (l0(this.R, i7, getWidth())) {
                            this.R.onAbsorb(i7);
                            i7 = 0;
                        }
                    } else {
                        int i8 = -i7;
                        if (l0(this.P, i8, getWidth())) {
                            this.P.onAbsorb(i8);
                            i7 = 0;
                        }
                    }
                    iMax = i7;
                    i7 = 0;
                }
                if (iMax2 == 0) {
                    i5 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.Q;
                    if (edgeEffect3 == null || bf6.y(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.S;
                        if (edgeEffect4 == null || bf6.y(edgeEffect4) == 0.0f) {
                            i5 = iMax2;
                            iMax2 = 0;
                        } else if (l0(this.S, iMax2, getHeight())) {
                            this.S.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i9 = -iMax2;
                        if (l0(this.Q, i9, getHeight())) {
                            this.Q.onAbsorb(i9);
                            iMax2 = 0;
                        }
                    }
                    i5 = 0;
                }
                m54 m54Var = this.l0;
                if (iMax != 0 || iMax2 != 0) {
                    int i10 = -i4;
                    iMax = Math.max(i10, Math.min(iMax, i4));
                    iMax2 = Math.max(i10, Math.min(iMax2, i4));
                    p0(1);
                    m54Var.g(iMax, iMax2);
                }
                if (i7 != 0 || i5 != 0) {
                    float f = i7;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z5 = zI || zB;
                        dispatchNestedFling(f, f2, z5);
                        z44 z44Var = this.f0;
                        if (z44Var != null) {
                            ro3 ro3Var = (ro3) z44Var;
                            g layoutManager = ro3Var.g.getLayoutManager();
                            if (layoutManager == 0 || ro3Var.g.getAdapter() == null || ((Math.abs(i5) <= (minFlingVelocity = ro3Var.g.getMinFlingVelocity()) && Math.abs(i7) <= minFlingVelocity) || !((z4 = layoutManager instanceof i54)))) {
                                z = z5;
                                z2 = false;
                                z3 = true;
                            } else {
                                View view = null;
                                qo3 qo3Var = !z4 ? null : new qo3(ro3Var, ro3Var.g.getContext());
                                if (qo3Var == null) {
                                    z = z5;
                                    z2 = false;
                                    z3 = true;
                                } else {
                                    int iQ = layoutManager.Q();
                                    if (iQ != 0) {
                                        if (layoutManager.b()) {
                                            vm3VarN = ro3Var.v(layoutManager);
                                        } else {
                                            vm3VarN = layoutManager.i() ? ro3Var.n(layoutManager) : null;
                                        }
                                        if (vm3VarN == null) {
                                            z = z5;
                                            z2 = false;
                                            z3 = true;
                                        } else {
                                            z2 = false;
                                            int iG = layoutManager.G();
                                            z3 = true;
                                            int i11 = 0;
                                            int i12 = Integer.MIN_VALUE;
                                            int i13 = Integer.MAX_VALUE;
                                            View view2 = null;
                                            while (i11 < iG) {
                                                boolean z6 = z5;
                                                View viewF = layoutManager.F(i11);
                                                if (viewF == null) {
                                                    i6 = iG;
                                                } else {
                                                    i6 = iG;
                                                    int iY = ro3.y(viewF, vm3VarN);
                                                    if (iY <= 0 && iY > i12) {
                                                        view2 = viewF;
                                                        i12 = iY;
                                                    }
                                                    if (iY >= 0 && iY < i13) {
                                                        view = viewF;
                                                        i13 = iY;
                                                    }
                                                }
                                                i11++;
                                                z5 = z6;
                                                iG = i6;
                                            }
                                            z = z5;
                                            Object[] objArr = !layoutManager.i() ? i5 <= 0 : i7 <= 0;
                                            if (objArr == true && view != null) {
                                                iR = g.R(view);
                                            } else if (objArr == true || view2 == null) {
                                                if (objArr != false) {
                                                    view = view2;
                                                }
                                                if (view != null) {
                                                    iR = ((z4 && (pointFV = ((i54) layoutManager).v(layoutManager.Q() + (-1))) != null && ((pointFV.x > 0.0f ? 1 : (pointFV.x == 0.0f ? 0 : -1)) < 0 || (pointFV.y > 0.0f ? 1 : (pointFV.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + g.R(view);
                                                    if (iR < 0 || iR >= iQ) {
                                                    }
                                                }
                                            } else {
                                                iR = g.R(view2);
                                            }
                                        }
                                        iR = -1;
                                    } else {
                                        z = z5;
                                        z2 = false;
                                        z3 = true;
                                        iR = -1;
                                    }
                                    if (iR != -1) {
                                        qo3Var.g = iR;
                                        layoutManager.O0(qo3Var);
                                        return z3;
                                    }
                                }
                            }
                        } else {
                            z = z5;
                            z2 = false;
                            z3 = true;
                        }
                        if (!z) {
                            return z2;
                        }
                        boolean z7 = z3;
                        p0(z7 ? 1 : 0);
                        int i14 = -i4;
                        m54Var.g(Math.max(i14, Math.min(i7, i4)), Math.max(i14, Math.min(i5, i4)));
                        return z7;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int L(n54 n54Var) {
        if ((n54Var.a & 524) == 0 && n54Var.l()) {
            int i = n54Var.r;
            ArrayList arrayList = (ArrayList) this.q.r;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o5 o5Var = (o5) arrayList.get(i2);
                byte b = o5Var.g;
                if (b != 1) {
                    if (b == 2) {
                        int i3 = o5Var.y;
                        if (i3 <= i) {
                            int i4 = o5Var.n;
                            if (i3 + i4 <= i) {
                                i -= i4;
                            }
                        } else {
                            continue;
                        }
                    } else if (b == 8) {
                        int i5 = o5Var.y;
                        if (i5 == i) {
                            i = o5Var.n;
                        } else {
                            if (i5 < i) {
                                i--;
                            }
                            if (o5Var.n <= i) {
                                i++;
                            }
                        }
                    }
                } else if (o5Var.y <= i) {
                    i += o5Var.n;
                }
            }
            return i;
        }
        return -1;
    }

    public final long M(n54 n54Var) {
        return this.z.y ? n54Var.v : n54Var.r;
    }

    public final n54 N(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return O(view);
        }
        l0.w("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect P(View view) {
        y44 y44Var = (y44) view.getLayoutParams();
        boolean z = y44Var.a;
        Rect rect = y44Var.t;
        if (!z || (this.o0.l && (y44Var.j.w() || y44Var.j.j()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.s;
            rect2.set(0, 0, 0, 0);
            ((w44) arrayList.get(i)).r(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        y44Var.a = false;
        return rect;
    }

    public final boolean Q() {
        return !this.B || this.K || this.q.l();
    }

    public final boolean R() {
        return this.M > 0;
    }

    public final void S(int i) {
        if (this.h == null) {
            return;
        }
        setScrollState(2);
        this.h.D0(i);
        awakenScrollBars();
    }

    public final void T() {
        ee0 ee0Var = this.w;
        int iJ = ee0Var.j();
        for (int i = 0; i < iJ; i++) {
            ((y44) ee0Var.l(i).getLayoutParams()).a = true;
        }
        ArrayList arrayList = this.a.r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            y44 y44Var = (y44) ((n54) arrayList.get(i2)).g.getLayoutParams();
            if (y44Var != null) {
                y44Var.a = true;
            }
        }
    }

    public final void U(int i, int i2, MotionEvent motionEvent) {
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.E) {
            return;
        }
        int[] iArr = this.A0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zI = gVar.i();
        boolean zB = this.h.b();
        int i3 = zB ? (zI ? 1 : 0) | 2 : zI ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iE0 = i - e0(i, height);
        int iF0 = i2 - f0(i2, width);
        getScrollingChildHelper().l(i3, 1);
        if (o(zI ? iE0 : 0, zB ? iF0 : 0, 1, this.A0, this.y0)) {
            iE0 -= iArr[0];
            iF0 -= iArr[1];
        }
        i0(zI ? iE0 : 0, zB ? iF0 : 0, motionEvent, 1);
        n02 n02Var = this.m0;
        if (n02Var != null && (iE0 != 0 || iF0 != 0)) {
            n02Var.g(this, iE0, iF0);
        }
        r0(1);
    }

    public final void V(int i, int i2, boolean z) {
        int i3 = i + i2;
        ee0 ee0Var = this.w;
        int iJ = ee0Var.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            n54 n54VarO = O(ee0Var.l(i4));
            if (n54VarO != null && !n54VarO.s()) {
                int i5 = n54VarO.r;
                j54 j54Var = this.o0;
                if (i5 >= i3) {
                    if (K0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + n54VarO + " now at position " + (n54VarO.r - i2));
                    }
                    n54VarO.c(-i2, z);
                    j54Var.x = true;
                } else if (i5 >= i) {
                    if (K0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + n54VarO + " now REMOVED");
                    }
                    n54VarO.g(8);
                    n54VarO.c(-i2, z);
                    n54VarO.r = i - 1;
                    j54Var.x = true;
                }
            }
        }
        e54 e54Var = this.a;
        ArrayList arrayList = e54Var.r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n54 n54Var = (n54) arrayList.get(size);
            if (n54Var != null) {
                int i6 = n54Var.r;
                if (i6 >= i3) {
                    if (K0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + n54Var + " now at position " + (n54Var.r - i2));
                    }
                    n54Var.c(-i2, z);
                } else if (i6 >= i) {
                    n54Var.g(8);
                    e54Var.j(size);
                }
            }
        }
        requestLayout();
    }

    public final void W() {
        this.M++;
    }

    public final void X(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.M - 1;
        this.M = i2;
        if (i2 < 1) {
            if (J0 && i2 < 0) {
                l0.z("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.M = 0;
            if (z) {
                int i3 = this.G;
                this.G = 0;
                if (i3 != 0 && (accessibilityManager = this.I) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.B0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n54 n54Var = (n54) arrayList.get(size);
                    if (n54Var.g.getParent() == this && !n54Var.s() && (i = n54Var.s) != -1) {
                        n54Var.g.setImportantForAccessibility(i);
                        n54Var.s = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i = actionIndex == 0 ? 1 : 0;
            this.V = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.c0 = x;
            this.a0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.d0 = y;
            this.b0 = y;
        }
    }

    public final void Z() {
        if (this.u0 || !this.e) {
            return;
        }
        WeakHashMap weakHashMap = xk5.g;
        postOnAnimation(this.C0);
        this.u0 = true;
    }

    public final void a(b54 b54Var) {
        ArrayList arrayList = this.q0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.q0 = arrayList;
        }
        arrayList.add(b54Var);
    }

    public final void a0() {
        boolean z;
        boolean z2 = this.K;
        p5 p5Var = this.q;
        boolean z3 = false;
        if (z2) {
            p5Var.m((ArrayList) p5Var.r);
            p5Var.m((ArrayList) p5Var.n);
            p5Var.g = 0;
            if (this.L) {
                this.h.k0();
            }
        }
        if (this.T != null && this.h.P0()) {
            p5Var.a();
        } else {
            p5Var.r();
        }
        boolean z4 = this.r0 || this.s0;
        boolean z5 = this.B && this.T != null && ((z = this.K) || z4 || this.h.w) && (!z || this.z.y);
        j54 j54Var = this.o0;
        j54Var.a = z5;
        if (z5 && z4 && !this.K && this.T != null && this.h.P0()) {
            z3 = true;
        }
        j54Var.m = z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b() {
        if (!this.B || this.K) {
            Trace.beginSection("RV FullInvalidate");
            u();
            Trace.endSection();
            return;
        }
        p5 p5Var = this.q;
        if (p5Var.l()) {
            int i = p5Var.g;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (p5Var.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    u();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            o0();
            W();
            p5Var.a();
            if (!this.D) {
                ee0 ee0Var = this.w;
                int iV = ee0Var.v();
                for (int i2 = 0; i2 < iV; i2++) {
                    n54 n54VarO = O(ee0Var.n(i2));
                    if (n54VarO != null && !n54VarO.s() && n54VarO.w()) {
                        u();
                    }
                }
                p5Var.y();
            }
            q0(true);
            X(true);
            Trace.endSection();
        }
    }

    public final void b0(boolean z) {
        this.L = z | this.L;
        this.K = true;
        ee0 ee0Var = this.w;
        int iJ = ee0Var.j();
        for (int i = 0; i < iJ; i++) {
            n54 n54VarO = O(ee0Var.l(i));
            if (n54VarO != null && !n54VarO.s()) {
                n54VarO.g(6);
            }
        }
        T();
        e54 e54Var = this.a;
        ArrayList arrayList = e54Var.r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n54 n54Var = (n54) arrayList.get(i2);
            if (n54Var != null) {
                n54Var.g(6);
                n54Var.g(1024);
            }
        }
        p44 p44Var = e54Var.j.z;
        if (p44Var == null || !p44Var.y) {
            e54Var.l();
        }
    }

    public final void c(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.P.onRelease();
            zIsFinished = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.R.onRelease();
            zIsFinished |= this.R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.Q.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.S.onRelease();
            zIsFinished |= this.S.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void c0(n54 n54Var, u44 u44Var) {
        n54Var.a &= -8193;
        boolean z = this.o0.j;
        cd2 cd2Var = this.c;
        if (z && n54Var.w() && !n54Var.a() && !n54Var.s()) {
            ((uy2) cd2Var.a).v(M(n54Var), n54Var);
        }
        sp4 sp4Var = (sp4) cd2Var.t;
        jl5 jl5VarG = (jl5) sp4Var.get(n54Var);
        if (jl5VarG == null) {
            jl5VarG = jl5.g();
            sp4Var.put(n54Var, jl5VarG);
        }
        jl5VarG.y = u44Var;
        jl5VarG.g |= 4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof y44) && this.h.s((y44) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        g gVar = this.h;
        if (gVar != null && gVar.i()) {
            return this.h.h(this.o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        g gVar = this.h;
        if (gVar != null && gVar.i()) {
            return this.h.o(this.o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        g gVar = this.h;
        if (gVar != null && gVar.i()) {
            return this.h.f(this.o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        g gVar = this.h;
        if (gVar != null && gVar.b()) {
            return this.h.k(this.o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        g gVar = this.h;
        if (gVar != null && gVar.b()) {
            return this.h.d(this.o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        g gVar = this.h;
        if (gVar != null && gVar.b()) {
            return this.h.e(this.o0);
        }
        return 0;
    }

    public final void d() {
        if (this.S != null) {
            return;
        }
        ((k54) this.O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.S = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void d0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.P.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.S.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        g layoutManager = getLayoutManager();
        int iG = 0;
        if (layoutManager != null) {
            if (layoutManager.b()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m0(0, measuredHeight, false);
                        return true;
                    }
                    m0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zW = layoutManager.W();
                    if (keyCode == 122) {
                        if (zW) {
                            iG = getAdapter().g();
                        }
                    } else if (!zW) {
                        iG = getAdapter().g();
                    }
                    n0(iG);
                    return true;
                }
            } else if (layoutManager.i()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m0(measuredWidth, 0, false);
                        return true;
                    }
                    m0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zW2 = layoutManager.W();
                    if (keyCode2 == 122) {
                        if (zW2) {
                            iG = getAdapter().g();
                        }
                    } else if (!zW2) {
                        iG = getAdapter().g();
                    }
                    n0(iG);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().g(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().y(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().r(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().n(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((w44) arrayList.get(i)).x(canvas, this);
        }
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.P;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Q;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.R;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.T == null || arrayList.size() <= 0 || !this.T.x()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (this.P != null) {
            return;
        }
        ((k54) this.O).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final int e0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.P;
        float f2 = 0.0f;
        if (edgeEffect == null || bf6.y(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.R;
            if (edgeEffect2 != null && bf6.y(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.R;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fR = bf6.r(edgeEffect3, width, height);
                    if (bf6.y(this.R) == 0.0f) {
                        this.R.onRelease();
                    }
                    f2 = fR;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.P;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -bf6.r(edgeEffect4, -width, 1.0f - height);
                if (bf6.y(this.P) == 0.0f) {
                    this.P.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().n(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final int f0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.Q;
        float f2 = 0.0f;
        if (edgeEffect == null || bf6.y(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.S;
            if (edgeEffect2 != null && bf6.y(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.S;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fR = bf6.r(edgeEffect3, height, 1.0f - width);
                    if (bf6.y(this.S) == 0.0f) {
                        this.S.onRelease();
                    }
                    f2 = fR;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.Q;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -bf6.r(edgeEffect4, -height, width);
                if (bf6.y(this.Q) == 0.0f) {
                    this.Q.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0161, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017f, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0182, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0185, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x018d, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0195, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x0164, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(w44 w44Var) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.w("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f;
        arrayList.remove(w44Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.C();
        }
        l0.z("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.D(getContext(), attributeSet);
        }
        l0.z("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public p44 getAdapter() {
        return this.z;
    }

    @Override // android.view.View
    public int getBaseline() {
        g gVar = this.h;
        if (gVar == null) {
            return super.getBaseline();
        }
        gVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.i;
    }

    public p54 getCompatAccessibilityDelegate() {
        return this.v0;
    }

    public t44 getEdgeEffectFactory() {
        return this.O;
    }

    public v44 getItemAnimator() {
        return this.T;
    }

    public int getItemDecorationCount() {
        return this.f.size();
    }

    public g getLayoutManager() {
        return this.h;
    }

    public int getMaxFlingVelocity() {
        return this.h0;
    }

    public int getMinFlingVelocity() {
        return this.g0;
    }

    public long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public z44 getOnFlingListener() {
        return this.f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.k0;
    }

    public d54 getRecycledViewPool() {
        return this.a.r();
    }

    public int getScrollState() {
        return this.U;
    }

    public final void h() {
        o0();
        W();
        j54 j54Var = this.o0;
        j54Var.g(6);
        this.q.r();
        j54Var.v = this.z.g();
        j54Var.r = 0;
        if (this.m != null) {
            p44 p44Var = this.z;
            p44Var.getClass();
            int iD = du4.D(1);
            if (iD == 1 ? p44Var.g() > 0 : iD != 2) {
                Parcelable parcelable = this.m.a;
                if (parcelable != null) {
                    this.h.r0(parcelable);
                }
                this.m = null;
            }
        }
        j54Var.l = false;
        this.h.p0(this.a, j54Var);
        j54Var.x = false;
        j54Var.a = j54Var.a && this.T != null;
        j54Var.n = (byte) 4;
        X(true);
        q0(false);
    }

    public final void h0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.s;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof y44) {
            y44 y44Var = (y44) layoutParams;
            if (!y44Var.a) {
                Rect rect2 = y44Var.t;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.h.A0(this, view, this.s, !this.B, view2 == null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().x(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
  0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean i0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        b();
        p44 p44Var = this.z;
        int[] iArr = this.A0;
        if (p44Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            j0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        f(i4, i5, i6, i7, this.y0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.c0;
        int[] iArr2 = this.y0;
        int i13 = iArr2[0];
        this.c0 = i12 - i13;
        int i14 = this.d0;
        int i15 = iArr2[1];
        this.d0 = i14 - i15;
        int[] iArr3 = this.z0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || za6.a(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    e();
                    z = true;
                    z2 = false;
                    bf6.r(this.P, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        A();
                        bf6.r(this.R, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        B();
                        bf6.r(this.Q, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        d();
                        bf6.r(this.S, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && za6.a(motionEvent, 4194304)) {
                            d0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        d0();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    B();
                    bf6.r(this.Q, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    d();
                    bf6.r(this.S, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        d0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    d0();
                }
            }
            c(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            k(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.E;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().n;
    }

    public final void j(n54 n54Var) {
        View view = n54Var.g;
        boolean z = view.getParent() == this;
        this.a.w(N(view));
        boolean zQ = n54Var.q();
        ee0 ee0Var = this.w;
        if (zQ) {
            ee0Var.y(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            ee0Var.g(view, -1, true);
            return;
        }
        int iIndexOfChild = ee0Var.g.g.indexOfChild(view);
        if (iIndexOfChild < 0) {
            l0.m(view, "view is not a child, cannot hide ");
        } else {
            ee0Var.y.c(iIndexOfChild);
            ee0Var.t(view);
        }
    }

    public final void j0(int i, int i2, int[] iArr) {
        n54 n54Var;
        o0();
        W();
        Trace.beginSection("RV Scroll");
        j54 j54Var = this.o0;
        D(j54Var);
        e54 e54Var = this.a;
        int iC0 = i != 0 ? this.h.C0(i, e54Var, j54Var) : 0;
        int iE0 = i2 != 0 ? this.h.E0(i2, e54Var, j54Var) : 0;
        Trace.endSection();
        ee0 ee0Var = this.w;
        int iV = ee0Var.v();
        for (int i3 = 0; i3 < iV; i3++) {
            View viewN = ee0Var.n(i3);
            n54 n54VarN = N(viewN);
            if (n54VarN != null && (n54Var = n54VarN.t) != null) {
                View view = n54Var.g;
                int left = viewN.getLeft();
                int top = viewN.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        X(true);
        q0(false);
        if (iArr != null) {
            iArr[0] = iC0;
            iArr[1] = iE0;
        }
    }

    public final void k(int i, int i2) {
        this.N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        b54 b54Var = this.p0;
        if (b54Var != null) {
            b54Var.y(this, i, i2);
        }
        ArrayList arrayList = this.q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b54) this.q0.get(size)).y(this, i, i2);
            }
        }
        this.N--;
    }

    public final void k0(int i) {
        if (this.E) {
            return;
        }
        s0();
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            gVar.D0(i);
            awakenScrollBars();
        }
    }

    public final boolean l0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fY = bf6.y(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.j * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = M0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fY;
    }

    public final void m(String str) {
        if (!R()) {
            if (this.N > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
            }
        } else if (str == null) {
            l0.z("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            l0.z(str);
        }
    }

    public final void m0(int i, int i2, boolean z) {
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.E) {
            return;
        }
        if (!gVar.i()) {
            i = 0;
        }
        if (!this.h.b()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().l(i3, 1);
        }
        this.l0.r(i, i2, Integer.MIN_VALUE, null);
    }

    public final void n0(int i) {
        if (this.E) {
            return;
        }
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            gVar.N0(this, i);
        }
    }

    public final boolean o(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().r(i, i2, i3, iArr, iArr2);
    }

    public final void o0() {
        int i = this.C + 1;
        this.C = i;
        if (i != 1 || this.E) {
            return;
        }
        this.D = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.M = 0;
        this.e = true;
        this.B = this.B && !isLayoutRequested();
        this.a.v();
        g gVar = this.h;
        if (gVar != null) {
            gVar.c = true;
            gVar.c0(this);
        }
        this.u0 = false;
        if (O0) {
            ThreadLocal threadLocal = n02.q;
            n02 n02Var = (n02) threadLocal.get();
            this.m0 = n02Var;
            if (n02Var == null) {
                this.m0 = new n02();
                WeakHashMap weakHashMap = xk5.g;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                n02 n02Var2 = this.m0;
                n02Var2.a = (long) (1.0E9f / refreshRate);
                threadLocal.set(n02Var2);
            }
            ArrayList arrayList = this.m0.j;
            if (J0 && arrayList.contains(this)) {
                l0.z("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n02 n02Var;
        super.onDetachedFromWindow();
        v44 v44Var = this.T;
        if (v44Var != null) {
            v44Var.v();
        }
        s0();
        int i = 0;
        this.e = false;
        g gVar = this.h;
        if (gVar != null) {
            gVar.c = false;
            gVar.d0(this);
        }
        this.B0.clear();
        removeCallbacks(this.C0);
        this.c.getClass();
        while (jl5.n.g() != null) {
        }
        e54 e54Var = this.a;
        ArrayList arrayList = e54Var.r;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            br2.l(((n54) arrayList.get(i2)).g);
        }
        e54Var.x(e54Var.j.z, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = br2.z(childAt).g;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((zk5) arrayList2.get(size)).g.v();
                }
            }
            i = i3;
        }
        if (!O0 || (n02Var = this.m0) == null) {
            return;
        }
        boolean zRemove = n02Var.j.remove(this);
        if (!J0 || zRemove) {
            this.m0 = null;
        } else {
            l0.z("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w44) arrayList.get(i)).v(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float axisValue;
        if (this.h != null && !this.E && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.h.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                z = false;
                axisValue = this.h.i() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f2;
                i = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.h.b()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.h.i()) {
                    axisValue = 0.0f;
                }
                z = this.G0;
            } else {
                i = 0;
                z = false;
                axisValue = 0.0f;
            }
            int i2 = (int) (f * this.j0);
            int i3 = (int) (axisValue * this.i0);
            if (z) {
                OverScroller overScroller = this.l0.a;
                m0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                U(i3, i2, motionEvent);
            }
            if (i != 0 && !z) {
                this.I0.g(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.E) {
            this.d = null;
            if (G(motionEvent)) {
                VelocityTracker velocityTracker = this.W;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                r0(0);
                d0();
                setScrollState(0);
                return true;
            }
            g gVar = this.h;
            if (gVar != null) {
                boolean zI = gVar.i();
                boolean zB = this.h.b();
                VelocityTracker velocityTrackerObtain = this.W;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.W = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.F) {
                        this.F = false;
                    }
                    this.V = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.c0 = x;
                    this.a0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.d0 = y;
                    this.b0 = y;
                    EdgeEffect edgeEffect = this.P;
                    if (edgeEffect == null || bf6.y(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        bf6.r(this.P, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.R;
                    if (edgeEffect2 != null && bf6.y(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        bf6.r(this.R, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.Q;
                    if (edgeEffect3 != null && bf6.y(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        bf6.r(this.Q, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.S;
                    if (edgeEffect4 != null && bf6.y(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        bf6.r(this.S, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.U == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        r0(1);
                    }
                    int[] iArr = this.z0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    p0(0);
                } else if (actionMasked == 1) {
                    this.W.clear();
                    r0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.V);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.V + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.U != 1) {
                        int i = x2 - this.a0;
                        int i2 = y2 - this.b0;
                        if (!zI || Math.abs(i) <= this.e0) {
                            z2 = false;
                        } else {
                            this.c0 = x2;
                            z2 = true;
                        }
                        if (zB && Math.abs(i2) > this.e0) {
                            this.d0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.W;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    r0(0);
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.V = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.c0 = x3;
                    this.a0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.d0 = y3;
                    this.b0 = y3;
                } else if (actionMasked == 6) {
                    Y(motionEvent);
                }
                if (this.U == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        u();
        Trace.endSection();
        this.B = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g gVar = this.h;
        if (gVar == null) {
            s(i, i2);
            return;
        }
        boolean zV = gVar.V();
        boolean z = false;
        j54 j54Var = this.o0;
        if (zV) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.h.t.s(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.D0 = z;
            if (z || this.z == null) {
                return;
            }
            if (j54Var.n == 1) {
                z();
            }
            this.h.G0(i, i2);
            j54Var.t = true;
            h();
            this.h.I0(i, i2);
            if (this.h.L0()) {
                this.h.G0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                j54Var.t = true;
                h();
                this.h.I0(i, i2);
            }
            this.E0 = getMeasuredWidth();
            this.F0 = getMeasuredHeight();
            return;
        }
        if (this.A) {
            this.h.t.s(i, i2);
            return;
        }
        if (this.H) {
            o0();
            W();
            a0();
            X(true);
            if (j54Var.m) {
                j54Var.l = true;
            } else {
                this.q.r();
                j54Var.l = false;
            }
            this.H = false;
            q0(false);
        } else if (j54Var.m) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        p44 p44Var = this.z;
        if (p44Var != null) {
            j54Var.v = p44Var.g();
        } else {
            j54Var.v = 0;
        }
        o0();
        this.h.t.s(i, i2);
        q0(false);
        j54Var.l = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g54)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g54 g54Var = (g54) parcelable;
        this.m = g54Var;
        super.onRestoreInstanceState(g54Var.j);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g54 g54Var = new g54(super.onSaveInstanceState());
        g54 g54Var2 = this.m;
        if (g54Var2 != null) {
            g54Var.a = g54Var2.a;
            return g54Var;
        }
        g gVar = this.h;
        if (gVar != null) {
            g54Var.a = gVar.s0();
            return g54Var;
        }
        g54Var.a = null;
        return g54Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zG;
        boolean z;
        if (!this.E && !this.F) {
            a54 a54Var = this.d;
            if (a54Var == null) {
                zG = motionEvent.getAction() == 0 ? false : G(motionEvent);
            } else {
                a54Var.y(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.d = null;
                }
                zG = true;
            }
            if (zG) {
                VelocityTracker velocityTracker = this.W;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                r0(0);
                d0();
                setScrollState(0);
                return true;
            }
            g gVar = this.h;
            if (gVar != null) {
                boolean zI = gVar.i();
                boolean zB = this.h.b();
                if (this.W == null) {
                    this.W = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.z0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.W.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.W;
                        int i = this.h0;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zI ? -this.W.getXVelocity(this.V) : 0.0f;
                        float f2 = zB ? -this.W.getYVelocity(this.V) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !K((int) f, (int) f2, this.g0, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.W;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        r0(0);
                        d0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.V);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.V + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.c0 - x;
                        int iMax2 = this.d0 - y;
                        if (this.U != 1) {
                            if (zI) {
                                int i2 = this.e0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zB) {
                                int i3 = this.e0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.U == 1) {
                            int[] iArr2 = this.A0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iE0 = iMax - e0(iMax, motionEvent.getY());
                            int iF0 = iMax2 - f0(iMax2, motionEvent.getX());
                            boolean zO = o(zI ? iE0 : 0, zB ? iF0 : 0, 0, this.A0, this.y0);
                            int[] iArr3 = this.y0;
                            if (zO) {
                                iE0 -= iArr2[0];
                                iF0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iE0;
                            int i5 = iF0;
                            this.c0 = x - iArr3[0];
                            this.d0 = y - iArr3[1];
                            if (i0(zI ? i4 : 0, zB ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            n02 n02Var = this.m0;
                            if (n02Var != null && (i4 != 0 || i5 != 0)) {
                                n02Var.g(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.W;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        r0(0);
                        d0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.V = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.c0 = x2;
                        this.a0 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.d0 = y2;
                        this.b0 = y2;
                    } else if (actionMasked == 6) {
                        Y(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.V = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.c0 = x3;
                this.a0 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.d0 = y3;
                this.b0 = y3;
                p0(0);
                this.W.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(View view) {
        O(view);
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wg2 wg2Var = (wg2) this.J.get(size);
                if (view == wg2Var.f) {
                    wg2Var.f = null;
                }
                n54 n54VarN = wg2Var.p.N(view);
                if (n54VarN != null) {
                    n54 n54Var = wg2Var.r;
                    if (n54Var == null || n54VarN != n54Var) {
                        wg2Var.m(n54VarN, false);
                        if (wg2Var.g.remove(n54VarN.g)) {
                            wg2Var.w.g(wg2Var.p, n54VarN);
                        }
                    } else {
                        wg2Var.b(null, 0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(int i) {
        boolean zI = this.h.i();
        int i2 = zI;
        if (this.h.b()) {
            i2 = (zI ? 1 : 0) | 2;
        }
        getScrollingChildHelper().l(i2, i);
    }

    public final void q0(boolean z) {
        int i = this.C;
        if (i < 1) {
            if (J0) {
                l0.z("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            } else {
                this.C = 1;
                i = 1;
            }
        }
        if (!z && !this.E) {
            this.D = false;
        }
        if (i == 1) {
            if (z && this.D && !this.E && this.h != null && this.z != null) {
                u();
            }
            if (!this.E) {
                this.D = false;
            }
        }
        this.C--;
    }

    public final void r0(int i) {
        getScrollingChildHelper().j(i);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        n54 n54VarO = O(view);
        if (n54VarO != null) {
            if (n54VarO.q()) {
                n54VarO.a &= -257;
            } else if (!n54VarO.s()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(n54VarO);
                l0.i(sb, C());
                return;
            }
        } else if (J0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            l0.i(sb2, C());
            return;
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        jv2 jv2Var = this.h.q;
        if ((jv2Var == null || !jv2Var.v) && !R() && view2 != null) {
            h0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.h.A0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a54) arrayList.get(i)).n(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C != 0 || this.E) {
            this.D = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = xk5.g;
        setMeasuredDimension(g.p(i, paddingRight, getMinimumWidth()), g.p(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void s0() {
        jv2 jv2Var;
        setScrollState(0);
        m54 m54Var = this.l0;
        m54Var.c.removeCallbacks(m54Var);
        m54Var.a.abortAnimation();
        g gVar = this.h;
        if (gVar == null || (jv2Var = gVar.q) == null) {
            return;
        }
        jv2Var.t();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        g gVar = this.h;
        if (gVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.E) {
            return;
        }
        boolean zI = gVar.i();
        boolean zB = this.h.b();
        if (zI || zB) {
            if (!zI) {
                i = 0;
            }
            if (!zB) {
                i2 = 0;
            }
            i0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.G |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(p54 p54Var) {
        this.v0 = p54Var;
        xk5.q(this, p54Var);
    }

    public void setAdapter(p44 p44Var) {
        setLayoutFrozen(false);
        p44 p44Var2 = this.z;
        c31 c31Var = this.t;
        if (p44Var2 != null) {
            p44Var2.g.unregisterObserver(c31Var);
            this.z.getClass();
        }
        v44 v44Var = this.T;
        if (v44Var != null) {
            v44Var.v();
        }
        g gVar = this.h;
        e54 e54Var = this.a;
        if (gVar != null) {
            gVar.w0(e54Var);
            this.h.x0(e54Var);
        }
        e54Var.g.clear();
        e54Var.l();
        p5 p5Var = this.q;
        p5Var.m((ArrayList) p5Var.r);
        p5Var.m((ArrayList) p5Var.n);
        p5Var.g = 0;
        p44 p44Var3 = this.z;
        this.z = p44Var;
        if (p44Var != null) {
            p44Var.g.registerObserver(c31Var);
        }
        g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.b0();
        }
        p44 p44Var4 = this.z;
        e54Var.g.clear();
        e54Var.l();
        e54Var.x(p44Var3, true);
        d54 d54VarR = e54Var.r();
        if (p44Var3 != null) {
            d54VarR.y--;
        }
        if (d54VarR.y == 0) {
            SparseArray sparseArray = d54VarR.g;
            for (int i = 0; i < sparseArray.size(); i++) {
                c54 c54Var = (c54) sparseArray.valueAt(i);
                ArrayList arrayList = c54Var.g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    br2.l(((n54) obj).g);
                }
                c54Var.g.clear();
            }
        }
        if (p44Var4 != null) {
            d54VarR.y++;
        }
        e54Var.v();
        this.o0.x = true;
        b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(s44 s44Var) {
        if (s44Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.i) {
            this.S = null;
            this.Q = null;
            this.R = null;
            this.P = null;
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(t44 t44Var) {
        t44Var.getClass();
        this.O = t44Var;
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    public void setHasFixedSize(boolean z) {
        this.A = z;
    }

    public void setItemAnimator(v44 v44Var) {
        v44 v44Var2 = this.T;
        if (v44Var2 != null) {
            v44Var2.v();
            this.T.g = null;
        }
        this.T = v44Var;
        if (v44Var != null) {
            v44Var.g = this.t0;
        }
    }

    public void setItemViewCacheSize(int i) {
        e54 e54Var = this.a;
        e54Var.v = i;
        e54Var.c();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(g gVar) {
        RecyclerView recyclerView;
        if (gVar == this.h) {
            return;
        }
        s0();
        g gVar2 = this.h;
        e54 e54Var = this.a;
        if (gVar2 != null) {
            v44 v44Var = this.T;
            if (v44Var != null) {
                v44Var.v();
            }
            this.h.w0(e54Var);
            this.h.x0(e54Var);
            e54Var.g.clear();
            e54Var.l();
            if (this.e) {
                g gVar3 = this.h;
                gVar3.c = false;
                gVar3.d0(this);
            }
            this.h.J0(null);
            this.h = null;
        } else {
            e54Var.g.clear();
            e54Var.l();
        }
        ee0 ee0Var = this.w;
        ee0Var.y.a();
        ArrayList arrayList = ee0Var.r;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ee0Var.g.g;
            if (size < 0) {
                break;
            }
            n54 n54VarO = O((View) arrayList.get(size));
            if (n54VarO != null) {
                int i = n54VarO.b;
                if (recyclerView.R()) {
                    n54VarO.s = i;
                    recyclerView.B0.add(n54VarO);
                } else {
                    n54VarO.g.setImportantForAccessibility(i);
                }
                n54VarO.b = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.h = gVar;
        if (gVar != null) {
            if (gVar.t != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(gVar);
                String strC = gVar.t.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strC);
                throw new IllegalArgumentException(sb.toString());
            }
            gVar.J0(this);
            if (this.e) {
                g gVar4 = this.h;
                gVar4.c = true;
                gVar4.c0(this);
            }
        }
        e54Var.c();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            l0.u("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        hg3 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.n) {
            ViewGroup viewGroup = scrollingChildHelper.r;
            WeakHashMap weakHashMap = xk5.g;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.n = z;
    }

    public void setOnFlingListener(z44 z44Var) {
        this.f0 = z44Var;
    }

    @Deprecated
    public void setOnScrollListener(b54 b54Var) {
        this.p0 = b54Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.k0 = z;
    }

    public void setRecycledViewPool(d54 d54Var) {
        e54 e54Var = this.a;
        RecyclerView recyclerView = e54Var.j;
        e54Var.x(recyclerView.z, false);
        d54 d54Var2 = e54Var.l;
        if (d54Var2 != null) {
            d54Var2.y--;
        }
        e54Var.l = d54Var;
        if (d54Var != null && recyclerView.getAdapter() != null) {
            e54Var.l.y++;
        }
        e54Var.v();
    }

    public void setScrollState(int i) {
        jv2 jv2Var;
        if (i == this.U) {
            return;
        }
        if (K0) {
            StringBuilder sbP = du4.p(i, "setting scroll state to ", " from ");
            sbP.append(this.U);
            Log.d("RecyclerView", sbP.toString(), new Exception());
        }
        this.U = i;
        if (i != 2) {
            m54 m54Var = this.l0;
            m54Var.c.removeCallbacks(m54Var);
            m54Var.a.abortAnimation();
            g gVar = this.h;
            if (gVar != null && (jv2Var = gVar.q) != null) {
                jv2Var.t();
            }
        }
        g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.t0(i);
        }
        b54 b54Var = this.p0;
        if (b54Var != null) {
            b54Var.g(this, i);
        }
        ArrayList arrayList = this.q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b54) this.q0.get(size)).g(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.e0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.e0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(l54 l54Var) {
        this.a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().l(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.E) {
            m("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.E = true;
                this.F = true;
                s0();
                return;
            }
            this.E = false;
            if (this.D && this.h != null && this.z != null) {
                requestLayout();
            }
            this.D = false;
        }
    }

    public final void t(w44 w44Var) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.w("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(w44Var);
        T();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0277  */
    /* JADX WARN: Code duplicated, block: B:163:0x0344  */
    /* JADX WARN: Code duplicated, block: B:182:0x0382  */
    /* JADX WARN: Code duplicated, block: B:184:0x0385  */
    /* JADX WARN: Code duplicated, block: B:190:0x0398  */
    /* JADX WARN: Code duplicated, block: B:192:0x039e  */
    /* JADX WARN: Code duplicated, block: B:195:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:204:0x03bc A[LOOP:4: B:197:0x03a9->B:204:0x03bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:213:0x03da A[LOOP:5: B:206:0x03c7->B:213:0x03da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03df  */
    /* JADX WARN: Code duplicated, block: B:243:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03dd A[EDGE_INSN: B:246:0x03dd->B:214:0x03dd BREAK  A[LOOP:5: B:206:0x03c7->B:213:0x03da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        boolean z;
        long j;
        n54 n54Var;
        int i;
        int iY;
        int i2;
        int iMin;
        n54 n54VarJ;
        View view;
        n54 n54VarJ2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        sp4 sp4Var;
        u44 u44Var;
        boolean zL;
        boolean z3;
        if (this.z == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.h == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        j54 j54Var = this.o0;
        boolean z4 = false;
        j54Var.t = false;
        boolean z5 = true;
        Object[] objArr = this.D0 && !(this.E0 == getWidth() && this.F0 == getHeight());
        this.E0 = 0;
        this.F0 = 0;
        this.D0 = false;
        if (j54Var.n == 1) {
            z();
            this.h.F0(this);
            h();
        } else {
            p5 p5Var = this.q;
            if ((((ArrayList) p5Var.n).isEmpty() || ((ArrayList) p5Var.r).isEmpty()) && !objArr == true && this.h.h == getWidth() && this.h.o == getHeight()) {
                this.h.F0(this);
            } else {
                this.h.F0(this);
                h();
            }
        }
        j54Var.g(4);
        o0();
        W();
        j54Var.n = (byte) 1;
        boolean z6 = j54Var.a;
        ee0 ee0Var = this.w;
        e54 e54Var = this.a;
        cd2 cd2Var = this.c;
        if (z6) {
            int iV = ee0Var.v() - 1;
            while (iV >= 0) {
                n54 n54VarO = O(ee0Var.n(iV));
                if (n54VarO.s()) {
                    z3 = z5;
                } else {
                    long jM = M(n54VarO);
                    this.T.getClass();
                    u44 u44Var2 = new u44();
                    u44Var2.g(n54VarO);
                    uy2 uy2Var = (uy2) cd2Var.a;
                    z3 = z5;
                    sp4 sp4Var2 = (sp4) cd2Var.t;
                    n54 n54Var2 = (n54) uy2Var.y(jM);
                    if (n54Var2 == null || n54Var2.s()) {
                        cd2Var.t(n54VarO, u44Var2);
                    } else {
                        jl5 jl5Var = (jl5) sp4Var2.get(n54Var2);
                        boolean z7 = (jl5Var == null || (jl5Var.g & 1) == 0) ? z4 : z3;
                        jl5 jl5Var2 = (jl5) sp4Var2.get(n54VarO);
                        boolean z8 = (jl5Var2 == null || (jl5Var2.g & 1) == 0) ? z4 : z3;
                        if (z7 && n54Var2 == n54VarO) {
                            cd2Var.t(n54VarO, u44Var2);
                        } else {
                            u44 u44VarE = cd2Var.E(n54Var2, 4);
                            cd2Var.t(n54VarO, u44Var2);
                            u44 u44VarE2 = cd2Var.E(n54VarO, 8);
                            if (u44VarE == null) {
                                int iV2 = ee0Var.v();
                                for (int i4 = 0; i4 < iV2; i4++) {
                                    n54 n54VarO2 = O(ee0Var.n(i4));
                                    if (n54VarO2 != n54VarO && M(n54VarO2) == jM) {
                                        p44 p44Var = this.z;
                                        if (p44Var == null || !p44Var.y) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(n54VarO2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(n54VarO);
                                            uo1.i(sb, C());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(n54VarO2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(n54VarO);
                                        uo1.i(sb2, C());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + n54Var2 + " cannot be found but it is necessary for " + n54VarO + C());
                            } else {
                                n54Var2.b(false);
                                if (z7) {
                                    j(n54Var2);
                                }
                                if (n54Var2 != n54VarO) {
                                    if (z8) {
                                        j(n54VarO);
                                    }
                                    n54Var2.j = n54VarO;
                                    j(n54Var2);
                                    e54Var.w(n54Var2);
                                    n54VarO.b(false);
                                    n54VarO.t = n54Var2;
                                }
                                if (this.T.g(n54Var2, n54VarO, u44VarE, u44VarE2)) {
                                    Z();
                                }
                            }
                        }
                    }
                }
                iV--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            sp4 sp4Var3 = (sp4) cd2Var.t;
            int i5 = sp4Var3.a - 1;
            while (i5 >= 0) {
                n54 n54Var3 = (n54) sp4Var3.x(i5);
                jl5 jl5Var3 = (jl5) sp4Var3.l(i5);
                int i6 = jl5Var3.g;
                int i7 = i6 & 3;
                k12 k12Var = this.H0;
                if (i7 == 3) {
                    RecyclerView recyclerView = k12Var.g;
                    recyclerView.h.y0(n54Var3.g, recyclerView.a);
                } else if ((i6 & 1) != 0) {
                    u44 u44Var3 = jl5Var3.y;
                    if (u44Var3 == null) {
                        RecyclerView recyclerView2 = k12Var.g;
                        recyclerView2.h.y0(n54Var3.g, recyclerView2.a);
                    } else {
                        k12Var.r(n54Var3, u44Var3, jl5Var3.r);
                    }
                } else if ((i6 & 14) == 14) {
                    k12Var.y(n54Var3, jl5Var3.y, jl5Var3.r);
                } else {
                    if ((i6 & 12) == 12) {
                        u44 u44Var4 = jl5Var3.y;
                        u44 u44Var5 = jl5Var3.r;
                        k12Var.getClass();
                        n54Var3.b(false);
                        RecyclerView recyclerView3 = k12Var.g;
                        boolean z9 = recyclerView3.K;
                        v44 v44Var = recyclerView3.T;
                        if (!z9) {
                            j21 j21Var = (j21) v44Var;
                            j21Var.getClass();
                            int i8 = u44Var4.j;
                            int i9 = u44Var5.j;
                            if (i8 == i9) {
                                sp4Var = sp4Var3;
                                if (u44Var4.t == u44Var5.t) {
                                    j21Var.r(n54Var3);
                                    zL = false;
                                }
                                if (zL) {
                                    recyclerView3.Z();
                                }
                            } else {
                                sp4Var = sp4Var3;
                            }
                            zL = j21Var.l(n54Var3, i8, u44Var4.t, i9, u44Var5.t);
                            if (zL) {
                                recyclerView3.Z();
                            }
                        } else if (v44Var.g(n54Var3, n54Var3, u44Var4, u44Var5)) {
                            recyclerView3.Z();
                        }
                        u44Var = null;
                    } else {
                        sp4Var = sp4Var3;
                        if ((i6 & 4) != 0) {
                            u44Var = null;
                            k12Var.r(n54Var3, jl5Var3.y, null);
                        } else {
                            u44Var = null;
                            if ((i6 & 8) != 0) {
                                k12Var.y(n54Var3, jl5Var3.y, jl5Var3.r);
                            }
                        }
                    }
                    jl5Var3.g = 0;
                    jl5Var3.y = u44Var;
                    jl5Var3.r = u44Var;
                    jl5.n.a(jl5Var3);
                    i5--;
                    sp4Var3 = sp4Var;
                }
                sp4Var = sp4Var3;
                u44Var = null;
                jl5Var3.g = 0;
                jl5Var3.y = u44Var;
                jl5Var3.r = u44Var;
                jl5.n.a(jl5Var3);
                i5--;
                sp4Var3 = sp4Var;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.h.x0(e54Var);
        j54Var.y = j54Var.v;
        this.K = false;
        this.L = false;
        j54Var.a = false;
        j54Var.m = false;
        this.h.w = false;
        ArrayList arrayList = e54Var.y;
        if (arrayList != null) {
            arrayList.clear();
        }
        g gVar = this.h;
        if (gVar.p) {
            gVar.s = 0;
            gVar.p = false;
            e54Var.c();
        }
        this.h.q0(j54Var);
        boolean z10 = z;
        X(z10);
        q0(false);
        ((sp4) cd2Var.t).clear();
        ((uy2) cd2Var.a).g();
        int[] iArr = this.w0;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        H(iArr);
        if (iArr[0] != i10 || iArr[z10 ? 1 : 0] != i11) {
            k(0, 0);
        }
        if (this.k0 && this.z != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = j54Var.w;
                if (j == -1) {
                    n54Var = null;
                } else {
                    n54Var = null;
                }
                if (n54Var != null) {
                    view3 = n54Var.g;
                    if (!ee0Var.r.contains(view3)) {
                        if (ee0Var.v() > 0) {
                            i = j54Var.q;
                            if (i == -1) {
                                i = 0;
                            }
                            iY = j54Var.y();
                            i2 = i;
                            while (true) {
                                if (i2 < iY) {
                                    n54VarJ2 = J(i2);
                                    if (n54VarJ2 != null) {
                                        view2 = n54VarJ2.g;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iY, i) - 1; iMin >= 0; iMin--) {
                                    n54VarJ = J(iMin);
                                    if (n54VarJ == null) {
                                        break;
                                        break;
                                    }
                                    view = n54VarJ.g;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (ee0Var.v() > 0) {
                        i = j54Var.q;
                        if (i == -1) {
                            i = 0;
                        }
                        iY = j54Var.y();
                        i2 = i;
                        while (true) {
                            if (i2 < iY) {
                                n54VarJ2 = J(i2);
                                if (n54VarJ2 != null) {
                                    view2 = n54VarJ2.g;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                n54VarJ = J(iMin);
                                if (n54VarJ == null) {
                                    break;
                                    break;
                                }
                                view = n54VarJ.g;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (ee0Var.v() > 0) {
                    i = j54Var.q;
                    if (i == -1) {
                        i = 0;
                    }
                    iY = j54Var.y();
                    i2 = i;
                    while (true) {
                        if (i2 < iY) {
                            n54VarJ2 = J(i2);
                            if (n54VarJ2 != null) {
                                view2 = n54VarJ2.g;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            n54VarJ = J(iMin);
                            if (n54VarJ == null) {
                                break;
                                break;
                            }
                            view = n54VarJ.g;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = j54Var.c;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (ee0Var.r.contains(getFocusedChild())) {
                j = j54Var.w;
                if (j == -1 && (z2 = this.z.y) && z2) {
                    int iJ = ee0Var.j();
                    n54Var = null;
                    for (int i12 = 0; i12 < iJ; i12++) {
                        n54 n54VarO3 = O(ee0Var.l(i12));
                        if (n54VarO3 != null && !n54VarO3.a() && n54VarO3.v == j) {
                            if (!ee0Var.r.contains(n54VarO3.g)) {
                                n54Var = n54VarO3;
                                break;
                            }
                            n54Var = n54VarO3;
                        }
                    }
                } else {
                    n54Var = null;
                }
                if (n54Var != null) {
                    view3 = n54Var.g;
                    if (!ee0Var.r.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (ee0Var.v() > 0) {
                        i = j54Var.q;
                        if (i == -1) {
                            i = 0;
                        }
                        iY = j54Var.y();
                        i2 = i;
                        while (true) {
                            if (i2 < iY) {
                                n54VarJ2 = J(i2);
                                if (n54VarJ2 != null) {
                                    view2 = n54VarJ2.g;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                n54VarJ = J(iMin);
                                if (n54VarJ == null) {
                                    break;
                                }
                                view = n54VarJ.g;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (ee0Var.v() > 0) {
                    i = j54Var.q;
                    if (i == -1) {
                        i = 0;
                    }
                    iY = j54Var.y();
                    i2 = i;
                    while (true) {
                        if (i2 < iY) {
                            n54VarJ2 = J(i2);
                            if (n54VarJ2 != null) {
                                view2 = n54VarJ2.g;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            n54VarJ = J(iMin);
                            if (n54VarJ == null) {
                                break;
                                break;
                            }
                            view = n54VarJ.g;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = j54Var.c;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        j54Var.w = -1L;
        j54Var.q = -1;
        j54Var.c = -1;
    }

    public final void w() {
        ee0 ee0Var = this.w;
        int iJ = ee0Var.j();
        for (int i = 0; i < iJ; i++) {
            n54 n54VarO = O(ee0Var.l(i));
            if (!n54VarO.s()) {
                n54VarO.n = -1;
                n54VarO.l = -1;
            }
        }
        e54 e54Var = this.a;
        ArrayList arrayList = e54Var.g;
        ArrayList arrayList2 = e54Var.r;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            n54 n54Var = (n54) arrayList2.get(i2);
            n54Var.n = -1;
            n54Var.l = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            n54 n54Var2 = (n54) arrayList.get(i3);
            n54Var2.n = -1;
            n54Var2.l = -1;
        }
        ArrayList arrayList3 = e54Var.y;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                n54 n54Var3 = (n54) e54Var.y.get(i4);
                n54Var3.n = -1;
                n54Var3.l = -1;
            }
        }
    }

    public final void z() {
        jl5 jl5Var;
        View viewF;
        j54 j54Var = this.o0;
        j54Var.g(1);
        D(j54Var);
        j54Var.t = false;
        o0();
        cd2 cd2Var = this.c;
        sp4 sp4Var = (sp4) cd2Var.t;
        sp4 sp4Var2 = (sp4) cd2Var.t;
        sp4Var.clear();
        uy2 uy2Var = (uy2) cd2Var.a;
        uy2Var.g();
        W();
        a0();
        n54 n54VarN = null;
        View focusedChild = (this.k0 && hasFocus() && this.z != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            n54VarN = N(viewF);
        }
        if (n54VarN == null) {
            j54Var.w = -1L;
            j54Var.q = -1;
            j54Var.c = -1;
        } else {
            j54Var.w = this.z.y ? n54VarN.v : -1L;
            j54Var.q = this.K ? -1 : n54VarN.a() ? n54VarN.n : n54VarN.y();
            View focusedChild2 = n54VarN.g;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            j54Var.c = id;
        }
        j54Var.j = j54Var.a && this.s0;
        this.s0 = false;
        this.r0 = false;
        j54Var.l = j54Var.m;
        j54Var.v = this.z.g();
        H(this.w0);
        boolean z = j54Var.a;
        ee0 ee0Var = this.w;
        if (z) {
            int iV = ee0Var.v();
            for (int i = 0; i < iV; i++) {
                n54 n54VarO = O(ee0Var.n(i));
                if (!n54VarO.s() && (!n54VarO.j() || this.z.y)) {
                    v44 v44Var = this.T;
                    v44.y(n54VarO);
                    n54VarO.v();
                    v44Var.getClass();
                    u44 u44Var = new u44();
                    u44Var.g(n54VarO);
                    jl5 jl5VarG = (jl5) sp4Var2.get(n54VarO);
                    if (jl5VarG == null) {
                        jl5VarG = jl5.g();
                        sp4Var2.put(n54VarO, jl5VarG);
                    }
                    jl5VarG.y = u44Var;
                    jl5VarG.g |= 4;
                    if (j54Var.j && n54VarO.w() && !n54VarO.a() && !n54VarO.s() && !n54VarO.j()) {
                        uy2Var.v(M(n54VarO), n54VarO);
                    }
                }
            }
        }
        if (j54Var.m) {
            int iJ = ee0Var.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                n54 n54VarO2 = O(ee0Var.l(i2));
                if (J0 && n54VarO2.r == -1 && !n54VarO2.a()) {
                    l0.z("view holder cannot have position -1 unless it is removed".concat(C()));
                    return;
                }
                if (!n54VarO2.s() && n54VarO2.n == -1) {
                    n54VarO2.n = n54VarO2.r;
                }
            }
            boolean z2 = j54Var.x;
            j54Var.x = false;
            this.h.p0(this.a, j54Var);
            j54Var.x = z2;
            for (int i3 = 0; i3 < ee0Var.v(); i3++) {
                n54 n54VarO3 = O(ee0Var.n(i3));
                if (!n54VarO3.s() && ((jl5Var = (jl5) sp4Var2.get(n54VarO3)) == null || (jl5Var.g & 4) == 0)) {
                    v44.y(n54VarO3);
                    boolean z3 = (n54VarO3.a & 8192) != 0;
                    v44 v44Var2 = this.T;
                    n54VarO3.v();
                    v44Var2.getClass();
                    u44 u44Var2 = new u44();
                    u44Var2.g(n54VarO3);
                    if (z3) {
                        c0(n54VarO3, u44Var2);
                    } else {
                        jl5 jl5VarG2 = (jl5) sp4Var2.get(n54VarO3);
                        if (jl5VarG2 == null) {
                            jl5VarG2 = jl5.g();
                            sp4Var2.put(n54VarO3, jl5VarG2);
                        }
                        jl5VarG2.g |= 2;
                        jl5VarG2.y = u44Var2;
                    }
                }
            }
            w();
        } else {
            w();
        }
        X(true);
        q0(false);
        j54Var.n = (byte) 2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.E(layoutParams);
        }
        l0.z("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(f54 f54Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, io.appground.blek.R.attr.recyclerViewStyle);
    }
}
