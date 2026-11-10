package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import io.appground.blek.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class ba extends ViewGroup implements pn3, da4, m33, n21, wm3, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, kt1 {
    public static Class P0;
    public static Method Q0;
    public static Method R0;
    public static final xa3 S0 = new xa3();
    public static r9 T0;
    public static Method U0;
    public static Method V0;
    public final ha3 A;
    public float A0;
    public final m44 B;
    public float B0;
    public final jj4 C;
    public final y9 C0;
    public final ia D;
    public final o9 D0;
    public ya E;
    public boolean E0;
    public final jc F;
    public bz1 F0;
    public final iv G;
    public final yb2 G0;
    public final xa3 H;
    public final l9 H0;
    public xa3 I;
    public final l9 I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public boolean K0;
    public final z73 L;
    public boolean L0;
    public final fe0 M;
    public final y22 M0;
    public final tp3 N;
    public View N0;
    public final z51 O;
    public final x9 O0;
    public final z8 P;
    public final a9 Q;
    public boolean R;
    public final sn3 S;
    public boolean T;
    public kg U;
    public ws0 V;
    public boolean W;
    public final boolean a;
    public final t51 a0;
    public final dr b;
    public long b0;
    public za1 c;
    public final int[] c0;
    public final rd2 d;
    public final float[] d0;
    public final um2 e;
    public final Matrix e0;
    public final tp3 f;
    public final float[] f0;
    public final float[] g0;
    public fx0 h;
    public long h0;
    public l84 i;
    public boolean i0;
    public final tp3 j;
    public long j0;
    public final z51 k;
    public xy1 k0;
    public x65 l0;
    public nb2 m;
    public v65 m0;
    public final AtomicReference n0;
    public final pb o;
    public z41 o0;
    public final tp3 p;
    public final ob3 p0;
    public ku2 q;
    public final tp3 q0;
    public gd2 r0;
    public final o9 s;
    public final k73 s0;
    public long t;
    public jf t0;
    public final View u;
    public MotionEvent u0;
    public long v0;
    public lu2 w;
    public final wh4 w0;
    public final xa3 x0;
    public float y0;
    public final nt1 z;
    public float z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ba(Context context, mo0 mo0Var) {
        fl2 fl2Var;
        super(context);
        this.j = kq2.M(mo0Var);
        this.t = 9205357640488583168L;
        byte b = 1;
        this.a = true;
        this.i = hi0.A;
        this.b = new dr();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this.s = new o9(this, (byte) 0);
        this.p = new tp3(k33.l(context), l76.q);
        this.z = new nt1(this, this);
        this.h = mo0Var.r().a();
        this.o = new pb();
        this.f = kq2.M(Boolean.FALSE);
        this.k = pt4.y(new l9(this, b));
        this.d = new rd2();
        byte b2 = 3;
        um2 um2Var = new um2(3);
        um2Var.e0(ea4.r);
        um2Var.b0(getDensity());
        um2Var.g0(getViewConfiguration());
        um2Var.f0(new z9(this).n(((nt1) getFocusOwner()).v).n(getDragAndDropManager().r));
        this.e = um2Var;
        ha3 ha3Var = ie2.g;
        this.A = new ha3();
        this.B = new m44(m7getLayoutNodes(), this);
        this.C = new jj4(getRoot(), new ti1(), m7getLayoutNodes());
        ia iaVar = new ia(this);
        this.D = iaVar;
        this.E = new ya(this, new w9(0, this, ra.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.F = new jc(this);
        this.G = new iv();
        this.H = new xa3();
        this.L = new z73();
        um2 root = getRoot();
        fe0 fe0Var = new fe0();
        fe0Var.y = root;
        fe0Var.r = new z62(root.M.r);
        fe0Var.n = new q64((byte) 29);
        fe0Var.v = new c72();
        this.M = fe0Var;
        this.N = kq2.M(new Configuration(context.getResources().getConfiguration()));
        this.O = pt4.y(new l9(this, (byte) 2));
        this.P = n() ? new z8(this, getAutofillTree()) : null;
        this.Q = n() ? new a9(new ji((byte) 22, (Object) context, (boolean) (objArr4 == true ? 1 : 0)), getSemanticsOwner(), this, getRectManager(), context.getPackageName()) : null;
        this.S = new sn3(new p9(this, objArr3 == true ? 1 : 0));
        um2 root2 = getRoot();
        t51 t51Var = new t51();
        t51Var.r = root2;
        t51Var.n = new ro((byte) 12);
        t51Var.v = new ji((byte) 18);
        t51Var.x = new rb3(new um2[16]);
        t51Var.l = new rb3(new q33[16]);
        this.a0 = t51Var;
        this.b0 = 9223372034707292159L;
        this.c0 = new int[]{0, 0};
        this.d0 = l33.g();
        this.e0 = new Matrix();
        this.f0 = l33.g();
        this.g0 = l33.g();
        this.h0 = -1L;
        this.j0 = 9187343241974906880L;
        this.n0 = new AtomicReference(null);
        this.p0 = mo0Var.b;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = it1.g;
        fl2 fl2Var2 = fl2.j;
        if (layoutDirection != 0) {
            fl2Var = layoutDirection != 1 ? null : fl2.t;
        } else {
            fl2Var = fl2Var2;
        }
        this.q0 = kq2.M(fl2Var != null ? fl2Var : fl2Var2);
        this.s0 = new k73(this);
        this.w0 = new wh4((byte) 6);
        this.x0 = new xa3();
        this.y0 = Float.NaN;
        this.z0 = Float.NaN;
        this.A0 = Float.NaN;
        this.B0 = Float.NaN;
        this.C0 = new y9(this, objArr2 == true ? 1 : 0);
        this.D0 = new o9(this, b);
        this.F0 = new q9(this, objArr == true ? 1 : 0);
        this.G0 = new yb2(context, new p9(this, b));
        this.H0 = new l9(this, b2);
        this.I0 = new l9(this, (byte) 4);
        addOnAttachStateChangeListener(this.E);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            qa.g.g(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        xk5.q(this, iaVar);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            ka.g.g(this);
        }
        if (u()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.u = view;
            addView(view, -1);
        }
        this.M0 = i >= 31 ? new y22((byte) 29) : null;
        this.O0 = new x9(this);
    }

    public static final boolean c(ba baVar, MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    private final qb0 getCanvasHolder() {
        return getComposeViewContext().h;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final x65 getLegacyTextInputServiceAndroid() {
        x65 x65Var = this.l0;
        if (x65Var != null) {
            return x65Var;
        }
        x65 x65Var2 = new x65(getView(), this, new k9(this));
        this.l0 = x65Var2;
        return x65Var2;
    }

    private final mo0 get_composeViewContext() {
        return (mo0) this.j.getValue();
    }

    public static long l(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static final boolean m(ba baVar, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void s(um2 um2Var) {
        um2Var.F();
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            s((um2) objArr[i2]);
        }
    }

    private final void setAttached(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    private void setDensity(j51 j51Var) {
        this.p.setValue(j51Var);
    }

    private void setLayoutDirection(fl2 fl2Var) {
        this.q0.setValue(fl2Var);
    }

    private final void set_composeViewContext(mo0 mo0Var) {
        this.j.setValue(mo0Var);
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static void v(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ba) {
                ((ba) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                v((ViewGroup) childAt);
            }
        }
    }

    public static boolean z(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !a83.g.g(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public final boolean A(int i) {
        if (i != 7 && i != 8) {
            Integer numR = it1.r(i);
            if (numR == null) {
                mc2.r("Invalid focus direction");
                l0.x();
                return false;
            }
            int iIntValue = numR.intValue();
            cu1 cu1VarX = ((nt1) getFocusOwner()).x();
            if (cu1VarX == null) {
                l0.z("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numR2 = it1.r(i);
            if (numR2 == null) {
                mc2.r("Invalid focus direction");
                l0.x();
                return false;
            }
            int iIntValue2 = numR2.intValue();
            fl5 fl5Var = k33.V(cu1VarX).o;
            View interopView = fl5Var != null ? fl5Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !ra.i(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return it1.y(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void B() {
        xa3 xa3Var;
        a9 a9VarM4getAutofillManager;
        Object[] objArr;
        if (this.R) {
            ut4 ut4Var = getSnapshotObserver().g;
            rn3 rn3Var = new rn3((byte) 2);
            synchronized (ut4Var.l) {
                try {
                    rb3 rb3Var = ut4Var.x;
                    int i = rb3Var.a;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = rb3Var.j;
                        if (i2 >= i) {
                            break;
                        }
                        tt4 tt4Var = (tt4) objArr[i2];
                        tt4Var.n(rn3Var);
                        if (!tt4Var.x.a()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = rb3Var.j;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    rb3Var.a = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.R = false;
        }
        kg kgVar = this.U;
        if (kgVar != null) {
            v(kgVar);
        }
        if (n() && (a9VarM4getAutofillManager = m4getAutofillManager()) != null) {
            ia3 ia3Var = a9VarM4getAutofillManager.i;
            if (ia3Var.n == 0 && a9VarM4getAutofillManager.b) {
                a9VarM4getAutofillManager.j.G().commit();
                a9VarM4getAutofillManager.b = false;
            }
            if (ia3Var.n != 0) {
                a9VarM4getAutofillManager.b = true;
            }
        }
        while (this.x0.a() && this.x0.l(0) != null) {
            int i5 = this.x0.y;
            int i6 = 0;
            while (true) {
                xa3Var = this.x0;
                if (i6 < i5) {
                    my1 my1Var = (my1) xa3Var.l(i6);
                    this.x0.i(i6, null);
                    if (my1Var != null) {
                        my1Var.g();
                    }
                    i6++;
                }
            }
            xa3Var.w(0, i5);
        }
    }

    public final void C(um2 um2Var) {
        ia iaVar = this.D;
        iaVar.E = true;
        if (iaVar.o()) {
            iaVar.f(um2Var);
        }
        ya yaVar = this.E;
        yaVar.w = true;
        if (yaVar.v()) {
            yaVar.c.z(og5.g);
        }
    }

    public final void D(um2 um2Var, boolean z, boolean z2, boolean z3) {
        um2 um2VarO;
        um2 um2VarO2;
        t51 t51Var = this.a0;
        if (!z) {
            if (t51Var.D(um2Var, z2) && z3) {
                M(um2Var);
                return;
            }
            return;
        }
        ro roVar = (ro) t51Var.n;
        um2 um2Var2 = um2Var.i;
        ym2 ym2Var = um2Var.N;
        if (um2Var2 == null) {
            mc2.y("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = ym2Var.n.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    uo1.g();
                    return;
                }
                if (!ym2Var.v || z2) {
                    ym2Var.v = true;
                    ym2Var.b.C = true;
                    if (um2Var.X) {
                        return;
                    }
                    if ((yf2.p(um2Var.L(), Boolean.TRUE) || t51.i(um2Var)) && ((um2VarO = um2Var.o()) == null || !um2VarO.N.v)) {
                        roVar.g(um2Var, lg2.j);
                    } else if ((um2Var.K() || t51.b(um2Var)) && ((um2VarO2 = um2Var.o()) == null || !um2VarO2.p())) {
                        roVar.g(um2Var, lg2.a);
                    }
                    if (t51Var.y || !z3) {
                        return;
                    }
                    M(um2Var);
                    return;
                }
                return;
            }
        }
        ((rb3) t51Var.l).y(new q33(um2Var, true, z2));
    }

    public final void E(um2 um2Var, boolean z, boolean z2) {
        ym2 ym2Var = um2Var.N;
        lg2 lg2Var = lg2.m;
        t51 t51Var = this.a0;
        if (!z) {
            t51Var.getClass();
            int iOrdinal = ym2Var.n.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                uo1.g();
                return;
            }
            um2 um2VarO = um2Var.o();
            boolean z3 = um2VarO == null || um2VarO.K();
            if (!z2) {
                if (um2Var.p()) {
                    return;
                }
                if (um2Var.s() && um2Var.K() == z3 && um2Var.K() == ym2Var.b.B) {
                    return;
                }
            }
            s33 s33Var = ym2Var.b;
            s33Var.D = true;
            s33Var.E = true;
            if (!um2Var.X && s33Var.B && z3) {
                if ((um2VarO == null || !um2VarO.s()) && (um2VarO == null || !um2VarO.p())) {
                    ((ro) t51Var.n).g(um2Var, lg2Var);
                }
                if (t51Var.y) {
                    return;
                }
                M(null);
                return;
            }
            return;
        }
        ro roVar = (ro) t51Var.n;
        int iOrdinal2 = ym2Var.n.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    uo1.g();
                    return;
                }
            }
        }
        if ((ym2Var.v || ym2Var.x) && !z2) {
            return;
        }
        ym2Var.x = true;
        ym2Var.l = true;
        s33 s33Var2 = ym2Var.b;
        s33Var2.D = true;
        s33Var2.E = true;
        if (um2Var.X) {
            return;
        }
        um2 um2VarO2 = um2Var.o();
        if (yf2.p(um2Var.L(), Boolean.TRUE) && ((um2VarO2 == null || !um2VarO2.N.v) && (um2VarO2 == null || !um2VarO2.N.x))) {
            roVar.g(um2Var, lg2.t);
        } else if (um2Var.K() && ((um2VarO2 == null || !um2VarO2.s()) && (um2VarO2 == null || !um2VarO2.p()))) {
            roVar.g(um2Var, lg2Var);
        }
        if (t51Var.y) {
            return;
        }
        M(null);
    }

    public final void F() {
        ia iaVar = this.D;
        iaVar.E = true;
        Handler handler = iaVar.m.getHandler();
        if (iaVar.o() && !iaVar.P && handler != null) {
            iaVar.P = true;
            handler.post(iaVar.R);
        }
        ya yaVar = this.E;
        yaVar.w = true;
        Handler handler2 = yaVar.j.getHandler();
        if (!yaVar.v() || yaVar.u || handler2 == null) {
            return;
        }
        yaVar.u = true;
        handler2.post(yaVar.z);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    public final void G(ViewStructure viewStructure) {
        a9 a9VarM4getAutofillManager = m4getAutofillManager();
        if (a9VarM4getAutofillManager != null) {
            um2 um2Var = a9VarM4getAutofillManager.t.g;
            AutofillId autofillId = a9VarM4getAutofillManager.c;
            String str = a9VarM4getAutofillManager.q;
            m44 m44Var = a9VarM4getAutofillManager.m;
            ud6.n(viewStructure, um2Var, autofillId, str, m44Var);
            Object[] objArr = ni3.g;
            xa3 xa3Var = new xa3(2);
            xa3Var.g(um2Var);
            xa3Var.g(viewStructure);
            while (xa3Var.a()) {
                Object objQ = xa3Var.q(xa3Var.y - 1);
                objQ.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objQ;
                Object objQ2 = xa3Var.q(xa3Var.y - 1);
                objQ2.getClass();
                qb3 qb3Var = (qb3) ((um2) objQ2).i();
                int i = qb3Var.j.a;
                for (int i2 = 0; i2 < i; i2++) {
                    um2 um2Var2 = (um2) qb3Var.get(i2);
                    if (!um2Var2.X && um2Var2.J() && um2Var2.K()) {
                        aj4 aj4VarK = um2Var2.k();
                        if (aj4VarK != null) {
                            hb3 hb3Var = aj4VarK.j;
                            if (hb3Var.y(yi4.l) || hb3Var.y(yi4.j) || hb3Var.y(kj4.p) || hb3Var.y(kj4.u) || (Build.VERSION.SDK_INT >= 34 && hb3Var.y(ge6.r))) {
                                ViewStructure viewStructureV = iy5.v(viewStructure2, iy5.g(viewStructure2));
                                ud6.n(viewStructureV, um2Var2, a9VarM4getAutofillManager.c, str, m44Var);
                                xa3Var.g(um2Var2);
                                xa3Var.g(viewStructureV);
                            } else {
                                xa3Var.g(um2Var2);
                                xa3Var.g(viewStructure2);
                            }
                        } else {
                            xa3Var.g(um2Var2);
                            xa3Var.g(viewStructure2);
                        }
                    }
                }
            }
        }
        z8 autofill = getAutofill();
        if (autofill != null) {
            og6.r(autofill, viewStructure);
        }
    }

    public final void H() {
        if (this.i0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.h0) {
            this.h0 = jCurrentAnimationTimeMillis;
            J();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.c0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.j0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void I(MotionEvent motionEvent) {
        this.h0 = AnimationUtils.currentAnimationTimeMillis();
        J();
        float x = motionEvent.getX();
        long jY = l33.y((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.f0);
        this.j0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jY >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jY & 4294967295L)))) & 4294967295L);
    }

    public final void J() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.f0;
        int[] iArr = this.c0;
        if (i >= 29) {
            oa0.g.g(this, fArr, this.e0, iArr);
        } else {
            d06.y(this, fArr, this.d0, iArr);
        }
        ra.D(fArr, this.g0);
    }

    public final boolean K() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void L(my1 my1Var) {
        dr drVar = this.b;
        boolean zIsEmpty = drVar.isEmpty();
        drVar.addLast(my1Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.s);
            } else {
                l0.u("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void M(um2 um2Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (um2Var != null) {
            while (um2Var != null && um2Var.u() == sm2.j) {
                if (!this.W) {
                    um2 um2VarO = um2Var.o();
                    if (um2VarO == null) {
                        break;
                    }
                    long j = um2VarO.M.r.m;
                    if (ws0.l(j) && ws0.x(j)) {
                        break;
                    }
                }
                um2Var = um2Var.o();
            }
            if (um2Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long N(long j) {
        H();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.j0 >> 32));
        return l33.y((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.j0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.g0);
    }

    public final int O(MotionEvent motionEvent) {
        Object obj;
        if (this.J0) {
            this.J0 = false;
            dt2 dt2Var = getComposeViewContext().z;
            int metaState = motionEvent.getMetaState();
            tp3 tp3Var = po5.g;
            qb6.r().setValue(new zu3(metaState));
        }
        z73 z73Var = this.L;
        rk4 rk4VarR = z73Var.r(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        fe0 fe0Var = this.M;
        if (rk4VarR == null) {
            if (!fe0Var.g) {
                ((uy2) ((q64) fe0Var.n).t).g();
                ((z62) fe0Var.r).r();
            }
            return jd6.g(false, false, false);
        }
        ArrayList arrayList = (ArrayList) rk4VarR.k();
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((su3) obj).g() && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        su3 su3Var = (su3) obj;
        if (su3Var != null) {
            this.t = su3Var.x();
        }
        int iG = fe0Var.g(rk4VarR, this, h(motionEvent));
        rk4VarR.P();
        if ((actionMasked != 0 && actionMasked != 5) || (iG & 1) != 0) {
            return iG;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        z73Var.r.delete(pointerId);
        z73Var.y.delete(pointerId);
        return iG;
    }

    public final void P(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jK = k((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jK >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jK & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        rk4 rk4VarR = this.L.r(this, motionEventObtain);
        rk4VarR.getClass();
        this.M.g(rk4VarR, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void Q(bz1 bz1Var, ou0 ou0Var) {
        aa aaVar;
        if (ou0Var instanceof aa) {
            aaVar = (aa) ou0Var;
            int i = aaVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aaVar.w = i - Integer.MIN_VALUE;
            } else {
                aaVar = new aa(this, ou0Var);
            }
        } else {
            aaVar = new aa(this, ou0Var);
        }
        Object obj = aaVar.m;
        int i2 = aaVar.w;
        if (i2 == 0) {
            js2.o(obj);
            h hVar = new h((Object) this, (byte) 3);
            aaVar.w = 1;
            if (k33.B(new n10(hVar, this.n0, bz1Var, null, (byte) 4), aaVar) == px0.j) {
                return;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            js2.o(obj);
        }
        l0.x();
    }

    public final void R(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (yf2.p(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(k33.l(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void S() {
        boolean z;
        int i;
        int[] iArr = this.c0;
        getLocationOnScreen(iArr);
        long j = this.b0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.h0 >= 0) {
            z = false;
        } else {
            this.b0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                rb3 rb3VarB = getRoot().B();
                Object[] objArr = rb3VarB.j;
                int i5 = rb3VarB.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((um2) objArr[i6]).N.b.F0();
                }
                z = true;
            }
        }
        H();
        View rootView = this.N0;
        if (rootView == null) {
            rootView = getRootView();
            this.N0 = rootView;
        }
        m44 rectManager = getRectManager();
        long j2 = this.b0;
        long jY = k33.Y(this.j0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        e95 e95Var = rectManager.n;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.l = e95Var.y(j2, jY, fArr, width, height) || rectManager.l;
        this.a0.l(z);
        getRectManager().g();
    }

    public final void T(float f) {
        if (u()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.y0) || f > this.y0) {
                    this.y0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.z0) || f < this.z0) {
                    this.z0 = f;
                }
            }
        }
    }

    @Override // defpackage.n21
    public final void a(gu2 gu2Var) {
        jb0 jb0VarU;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(yf2.H());
        }
        lu2 lu2Var = this.w;
        if (lu2Var != null) {
            ku2 ku2Var = this.q;
            ku2Var.getClass();
            y03 y03Var = (y03) lu2Var.g.t;
            if (!y03Var.j || y03Var.a) {
                return;
            }
            try {
                jb0VarU = ((gs5) ku2Var).g.u(new gf((Object) lu2Var, (byte) 16));
            } catch (CancellationException unused) {
                if (!y03Var.t) {
                    if (y03Var.a) {
                        bw3.g("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    y03Var.g();
                    y03Var.a = true;
                }
                jb0VarU = null;
            }
            jb0 jb0Var = lu2Var.n;
            if (jb0Var != null) {
                jb0Var.cancel();
            }
            lu2Var.n = jb0VarU;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        cu1 cu1Var = ((nt1) getFocusOwner()).r;
        if (!cu1Var.h) {
            return;
        }
        if (!cu1Var.j.h) {
            mc2.y("visitSubtreeIf called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var = cu1Var.j;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 == null) {
            k33.o(rb3Var, i73Var);
        } else {
            rb3Var.y(i73Var2);
        }
        while (true) {
            int i3 = rb3Var.a;
            if (i3 == 0) {
                return;
            }
            i73 i73Var3 = (i73) rb3Var.w(i3 - 1);
            if ((i73Var3.m & 1024) != 0) {
                for (i73 i73Var4 = i73Var3; i73Var4 != null && i73Var4.h; i73Var4 = i73Var4.w) {
                    if ((i73Var4.a & 1024) != 0) {
                        i73 i73VarQ = i73Var4;
                        rb3 rb3Var2 = null;
                        while (i73VarQ != null) {
                            int i4 = 0;
                            if (i73VarQ instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ;
                                if (cu1Var2.h && cu1Var2.S0().g) {
                                    super.addFocusables(arrayList, i, i2);
                                    cu1 cu1Var3 = ((nt1) getFocusOwner()).r;
                                    if (cu1Var3.h) {
                                        if (!cu1Var3.j.h) {
                                            mc2.y("visitSubtreeIf called on an unattached node");
                                        }
                                        rb3 rb3Var3 = new rb3(new i73[16]);
                                        i73 i73Var5 = cu1Var3.j;
                                        i73 i73Var6 = i73Var5.w;
                                        if (i73Var6 == null) {
                                            k33.o(rb3Var3, i73Var5);
                                        } else {
                                            rb3Var3.y(i73Var6);
                                        }
                                        while (true) {
                                            int i5 = rb3Var3.a;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            i73 i73Var7 = (i73) rb3Var3.w(i5 - 1);
                                            if ((i73Var7.m & 1024) != 0) {
                                                for (i73 i73Var8 = i73Var7; i73Var8 != null && i73Var8.h; i73Var8 = i73Var8.w) {
                                                    if ((i73Var8.a & 1024) != 0) {
                                                        i73 i73VarQ2 = i73Var8;
                                                        rb3 rb3Var4 = null;
                                                        while (i73VarQ2 != null) {
                                                            if (i73VarQ2 instanceof cu1) {
                                                                cu1 cu1Var4 = (cu1) i73VarQ2;
                                                                if (cu1Var4.h) {
                                                                    pt1 pt1VarS0 = cu1Var4.S0();
                                                                    if (cu1Var4.h && !cu1Var4.o && pt1VarS0.g) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((i73VarQ2.a & 1024) != 0 && (i73VarQ2 instanceof p41)) {
                                                                int i6 = 0;
                                                                for (i73 i73Var9 = ((p41) i73VarQ2).f; i73Var9 != null; i73Var9 = i73Var9.w) {
                                                                    if ((i73Var9.a & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            i73VarQ2 = i73Var9;
                                                                        } else {
                                                                            if (rb3Var4 == null) {
                                                                                rb3Var4 = new rb3(new i73[16]);
                                                                            }
                                                                            if (i73VarQ2 != null) {
                                                                                rb3Var4.y(i73VarQ2);
                                                                                i73VarQ2 = null;
                                                                            }
                                                                            rb3Var4.y(i73Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            i73VarQ2 = k33.Q(rb3Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            k33.o(rb3Var3, i73Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                for (i73 i73Var10 = ((p41) i73VarQ).f; i73Var10 != null; i73Var10 = i73Var10.w) {
                                    if ((i73Var10.a & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            i73VarQ = i73Var10;
                                        } else {
                                            if (rb3Var2 == null) {
                                                rb3Var2 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var2.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var2.y(i73Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var2);
                        }
                    }
                }
            }
            k33.o(rb3Var, i73Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        aj4 aj4VarK;
        xy1 xy1Var;
        xy1 xy1Var2;
        if (n()) {
            a9 a9VarM4getAutofillManager = m4getAutofillManager();
            if (a9VarM4getAutofillManager != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueX = a2.x(sparseArray.get(iKeyAt));
                    um2 um2Var = (um2) a9VarM4getAutofillManager.t.r.y(iKeyAt);
                    if (um2Var != null && (aj4VarK = um2Var.k()) != null) {
                        hb3 hb3Var = aj4VarK.j;
                        Object objL = hb3Var.l(yi4.l);
                        if (objL == null) {
                            objL = null;
                        }
                        p1 p1Var = (p1) objL;
                        if (p1Var != null && (xy1Var2 = (xy1) p1Var.y) != null) {
                        }
                        Object objL2 = hb3Var.l(yi4.j);
                        p1 p1Var2 = (p1) (objL2 != null ? objL2 : null);
                        if (p1Var2 != null && (xy1Var = (xy1) p1Var2.y) != null) {
                        }
                    }
                }
            }
            z8 autofill = getAutofill();
            if (autofill != null) {
                og6.y(autofill, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.D.w(i, this.t, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.D.w(i, this.t, true);
    }

    public final void d(boolean z) {
        t51 t51Var = this.a0;
        if (((ro) t51Var.n).N() || ((rb3) ((ji) t51Var.v).t).a != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (t51Var.u(z ? this.H0 : this.I0)) {
                    requestLayout();
                }
                t51Var.l(false);
                getRectManager().g();
                if (this.K) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.K = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xa3 xa3Var = this.H;
        if (!isAttachedToWindow()) {
            s(getRoot());
        }
        d(true);
        it4.j().w();
        this.J = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            qb0 canvasHolder = getCanvasHolder();
            c9 c9Var = canvasHolder.g;
            Canvas canvas2 = c9Var.g;
            c9Var.g = canvas;
            getRoot().a(c9Var, null);
            canvasHolder.g.g = canvas2;
            if (xa3Var.a()) {
                int i = xa3Var.y;
                for (int i2 = 0; i2 < i; i2++) {
                    ((a42) ((on3) xa3Var.l(i2))).l();
                }
            }
            int i3 = ml5.j;
            xa3Var.n();
            this.J = false;
            Trace.endSection();
            xa3 xa3Var2 = this.I;
            if (xa3Var2 != null) {
                xa3Var.y(xa3Var2);
                xa3Var2.n();
            }
            if (u()) {
                if (Float.compare(this.y0, this.A0) != 0) {
                    float f = this.y0;
                    this.A0 = f;
                    zj.g(this, f);
                }
                View view = this.u;
                if (view != null) {
                    if (Float.compare(this.z0, this.B0) != 0) {
                        float f2 = this.z0;
                        this.B0 = f2;
                        zj.g(view, f2);
                    }
                    if (!Float.isNaN(this.z0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.y0 = Float.NaN;
                this.z0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:206:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:214:0x0308  */
    /* JADX WARN: Code duplicated, block: B:215:0x030d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0310  */
    /* JADX WARN: Code duplicated, block: B:220:0x032b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0336  */
    /* JADX WARN: Code duplicated, block: B:224:0x033d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0348  */
    /* JADX WARN: Code duplicated, block: B:227:0x034c  */
    /* JADX WARN: Code duplicated, block: B:229:0x035b  */
    /* JADX WARN: Code duplicated, block: B:233:0x037f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0384  */
    /* JADX WARN: Code duplicated, block: B:369:0x054e  */
    /* JADX WARN: Code duplicated, block: B:376:0x055d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [i73] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [i73] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int pointerCount;
        ArrayList arrayList;
        int i2;
        nb2 nb2Var;
        String str;
        int iR;
        ld1 ld1Var;
        int pointerId;
        int iIndexOfKey;
        long jValueAt;
        long jFloatToRawIntBits;
        boolean z2;
        y73 y73Var;
        String str2;
        long eventTime;
        long jN;
        boolean zR;
        wb2 wb2Var;
        ah3 ah3Var;
        boolean z3;
        ?? Q;
        ah3 ah3Var2;
        wb2 wb2Var2;
        boolean z4;
        int size;
        int size2;
        ah3 ah3Var3;
        boolean z5;
        Object obj;
        ah3 ah3Var4;
        int action;
        boolean z6;
        u9 u9Var;
        int size3;
        ah3 ah3Var5;
        boolean z7;
        i73 i73VarQ;
        ah3 ah3Var6;
        if (this.E0) {
            o9 o9Var = this.D0;
            removeCallbacks(o9Var);
            if (motionEvent.getActionMasked() == 8) {
                this.E0 = false;
            } else {
                o9Var.run();
            }
        }
        if (z(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        byte b = 2;
        String str3 = "visitAncestors called on an unattached node";
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (w(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            cl5.r(viewConfiguration, getContext());
            cl5.y(viewConfiguration, getContext());
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            lt1 focusOwner = getFocusOwner();
            p2 p2Var = new p2(this, motionEvent, b);
            nt1 nt1Var = (nt1) focusOwner;
            if (nt1Var.n.v) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            cu1 cu1VarH = og0.h(nt1Var.r);
            if (cu1VarH != null) {
                if (!cu1VarH.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var = cu1VarH.j;
                um2 um2VarV = k33.V(cu1VarH);
                loop0: while (true) {
                    if (um2VarV == null) {
                        i73VarQ = null;
                        break;
                    }
                    if ((um2VarV.M.x.m & 16384) != 0) {
                        while (i73Var != null) {
                            if ((i73Var.a & 16384) != 0) {
                                i73VarQ = i73Var;
                                rb3 rb3Var = null;
                                while (i73VarQ != null) {
                                    if (i73VarQ instanceof u9) {
                                        break loop0;
                                    }
                                    if ((i73VarQ.a & 16384) != 0 && (i73VarQ instanceof p41)) {
                                        int i3 = 0;
                                        for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                            if ((i73Var2.a & 16384) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    i73VarQ = i73Var2;
                                                } else {
                                                    if (rb3Var == null) {
                                                        rb3Var = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ != null) {
                                                        rb3Var.y(i73VarQ);
                                                        i73VarQ = null;
                                                    }
                                                    rb3Var.y(i73Var2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    i73VarQ = k33.Q(rb3Var);
                                }
                            }
                            i73Var = i73Var.q;
                        }
                    }
                    um2VarV = um2VarV.o();
                    i73Var = (um2VarV == null || (ah3Var6 = um2VarV.M) == null) ? null : ah3Var6.v;
                }
                u9Var = (u9) i73VarQ;
            } else {
                u9Var = null;
            }
            if (u9Var != null) {
                if (!u9Var.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var3 = u9Var.j.q;
                um2 um2VarV2 = k33.V(u9Var);
                ArrayList arrayList2 = null;
                while (um2VarV2 != null) {
                    if ((um2VarV2.M.x.m & 16384) != 0) {
                        while (i73Var3 != null) {
                            if ((i73Var3.a & 16384) != 0) {
                                i73 i73VarQ2 = i73Var3;
                                rb3 rb3Var2 = null;
                                while (i73VarQ2 != null) {
                                    if (i73VarQ2 instanceof u9) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(i73VarQ2);
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z7 && (i73VarQ2.a & 16384) != 0 && (i73VarQ2 instanceof p41)) {
                                        int i4 = 0;
                                        for (i73 i73Var4 = ((p41) i73VarQ2).f; i73Var4 != null; i73Var4 = i73Var4.w) {
                                            if ((i73Var4.a & 16384) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    i73VarQ2 = i73Var4;
                                                } else {
                                                    if (rb3Var2 == null) {
                                                        rb3Var2 = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ2 != null) {
                                                        rb3Var2.y(i73VarQ2);
                                                        i73VarQ2 = null;
                                                    }
                                                    rb3Var2.y(i73Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    i73VarQ2 = k33.Q(rb3Var2);
                                }
                            }
                            i73Var3 = i73Var3.q;
                        }
                    }
                    um2VarV2 = um2VarV2.o();
                    i73Var3 = (um2VarV2 == null || (ah3Var5 = um2VarV2.M) == null) ? null : ah3Var5.v;
                }
                if (arrayList2 != null && (size3 = arrayList2.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size3 - 1;
                        ((u9) arrayList2.get(size3)).getClass();
                        if (i5 < 0) {
                            break;
                        }
                        size3 = i5;
                    }
                }
                i73 i73VarQ3 = u9Var.j;
                rb3 rb3Var3 = null;
                while (i73VarQ3 != null) {
                    if (!(i73VarQ3 instanceof u9) && (i73VarQ3.a & 16384) != 0 && (i73VarQ3 instanceof p41)) {
                        int i6 = 0;
                        for (i73 i73Var5 = ((p41) i73VarQ3).f; i73Var5 != null; i73Var5 = i73Var5.w) {
                            if ((i73Var5.a & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    i73VarQ3 = i73Var5;
                                } else {
                                    if (rb3Var3 == null) {
                                        rb3Var3 = new rb3(new i73[16]);
                                    }
                                    if (i73VarQ3 != null) {
                                        rb3Var3.y(i73VarQ3);
                                        i73VarQ3 = null;
                                    }
                                    rb3Var3.y(i73Var5);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    i73VarQ3 = k33.Q(rb3Var3);
                }
                if (!((Boolean) p2Var.g()).booleanValue()) {
                    i73 i73VarQ4 = u9Var.j;
                    rb3 rb3Var4 = null;
                    while (i73VarQ4 != null) {
                        if (!(i73VarQ4 instanceof u9) && (i73VarQ4.a & 16384) != 0 && (i73VarQ4 instanceof p41)) {
                            int i7 = 0;
                            for (i73 i73Var6 = ((p41) i73VarQ4).f; i73Var6 != null; i73Var6 = i73Var6.w) {
                                if ((i73Var6.a & 16384) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        i73VarQ4 = i73Var6;
                                    } else {
                                        if (rb3Var4 == null) {
                                            rb3Var4 = new rb3(new i73[16]);
                                        }
                                        if (i73VarQ4 != null) {
                                            rb3Var4.y(i73VarQ4);
                                            i73VarQ4 = null;
                                        }
                                        rb3Var4.y(i73Var6);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        i73VarQ4 = k33.Q(rb3Var4);
                    }
                    if (arrayList2 != null) {
                        int size4 = arrayList2.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            ((u9) arrayList2.get(i8)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        nb2 nb2Var2 = this.m;
        z73 z73Var = this.L;
        uy2 uy2Var = z73Var.v;
        SparseLongArray sparseLongArray = z73Var.y;
        int actionMasked = motionEvent.getActionMasked();
        z73Var.y(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            z73Var.r.clear();
            i = 2097152;
            str = "visitAncestors called on an unattached node";
            ld1Var = null;
        } else {
            z73Var.g(motionEvent);
            int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
            if (actionMasked == 0 || actionMasked == 2) {
                i = 2097152;
            } else {
                i = 2097152;
                z = actionMasked == 5;
                pointerCount = motionEvent.getPointerCount();
                arrayList = new ArrayList(pointerCount);
                i2 = 0;
                while (i2 < pointerCount) {
                    pointerId = motionEvent.getPointerId(i2);
                    iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        jValueAt = z73Var.g;
                        z73Var.g = jValueAt + 1;
                        sparseLongArray.put(pointerId, jValueAt);
                    }
                    z73 z73Var2 = z73Var;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getY(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i2))) << 32);
                    if (i2 != actionIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    y73Var = (y73) uy2Var.y(jValueAt);
                    if (i2 == actionIndex) {
                        uy2Var.x(jValueAt);
                        str2 = str3;
                    } else {
                        str2 = str3;
                        if (z != 0) {
                            uy2Var.v(jValueAt, y73.g(y73.y(motionEvent.getEventTime(), jFloatToRawIntBits)));
                        }
                    }
                    long eventTime2 = motionEvent.getEventTime();
                    float pressure = motionEvent.getPressure(i2);
                    if (y73Var != null) {
                        eventTime = y73.v(y73Var.x());
                    } else {
                        eventTime = motionEvent.getEventTime();
                    }
                    long j = eventTime;
                    if (y73Var != null) {
                        jN = y73.n(y73Var.x());
                    } else {
                        jN = jFloatToRawIntBits;
                    }
                    if (y73Var != null) {
                        zR = y73.r(y73Var.x());
                    } else {
                        zR = false;
                    }
                    arrayList.add(new ob2(jValueAt, eventTime2, jFloatToRawIntBits, z2, pressure, j, jN, zR));
                    i2++;
                    str3 = str2;
                    z73Var = z73Var2;
                    nb2Var2 = nb2Var2;
                    z = z;
                }
                nb2Var = nb2Var2;
                z73 z73Var3 = z73Var;
                str = str3;
                z73Var3.v(motionEvent);
                if (nb2Var != null) {
                    iR = nb2Var.g;
                } else {
                    iR = bh6.r(motionEvent);
                }
                ld1Var = new ld1(arrayList, iR, motionEvent);
            }
            pointerCount = motionEvent.getPointerCount();
            arrayList = new ArrayList(pointerCount);
            i2 = 0;
            while (i2 < pointerCount) {
                pointerId = motionEvent.getPointerId(i2);
                iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                } else {
                    jValueAt = z73Var.g;
                    z73Var.g = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                z73 z73Var4 = z73Var;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getY(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i2))) << 32);
                if (i2 != actionIndex) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                y73Var = (y73) uy2Var.y(jValueAt);
                if (i2 == actionIndex) {
                    uy2Var.x(jValueAt);
                    str2 = str3;
                } else {
                    str2 = str3;
                    if (z != 0) {
                        uy2Var.v(jValueAt, y73.g(y73.y(motionEvent.getEventTime(), jFloatToRawIntBits)));
                    }
                }
                long eventTime3 = motionEvent.getEventTime();
                float pressure2 = motionEvent.getPressure(i2);
                if (y73Var != null) {
                    eventTime = y73.v(y73Var.x());
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                long j2 = eventTime;
                if (y73Var != null) {
                    jN = y73.n(y73Var.x());
                } else {
                    jN = jFloatToRawIntBits;
                }
                if (y73Var != null) {
                    zR = y73.r(y73Var.x());
                } else {
                    zR = false;
                }
                arrayList.add(new ob2(jValueAt, eventTime3, jFloatToRawIntBits, z2, pressure2, j2, jN, zR));
                i2++;
                str3 = str2;
                z73Var = z73Var4;
                nb2Var2 = nb2Var2;
                z = z;
            }
            nb2Var = nb2Var2;
            z73 z73Var5 = z73Var;
            str = str3;
            z73Var5.v(motionEvent);
            if (nb2Var != null) {
                iR = nb2Var.g;
            } else {
                iR = bh6.r(motionEvent);
            }
            ld1Var = new ld1(arrayList, iR, motionEvent);
        }
        yb2 yb2Var = this.G0;
        if (ld1Var == null) {
            cu1 cu1VarX = ((nt1) getFocusOwner()).x();
            if (cu1VarX != null) {
                if (!cu1VarX.j.h) {
                    mc2.y(str);
                }
                i73 i73Var7 = cu1VarX.j;
                um2 um2VarV3 = k33.V(cu1VarX);
                loop26: while (true) {
                    if (um2VarV3 == null) {
                        Q = 0;
                        break;
                    }
                    if ((um2VarV3.M.x.m & i) != 0) {
                        while (i73Var7 != null) {
                            if ((i73Var7.a & i) != 0) {
                                Q = i73Var7;
                                ?? r5 = 0;
                                while (Q != 0) {
                                    if (Q instanceof wb2) {
                                        break loop26;
                                    }
                                    if ((Q.a & i) != 0 && (Q instanceof p41)) {
                                        i73 i73Var8 = ((p41) Q).f;
                                        ?? rb3Var5 = r5;
                                        ?? r6 = Q;
                                        int i9 = 0;
                                        while (i73Var8 != null) {
                                            if ((i73Var8.a & i) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    rb3Var5 = rb3Var5;
                                                    r6 = i73Var8;
                                                } else {
                                                    if (rb3Var5 == 0) {
                                                        rb3Var5 = new rb3(new i73[16]);
                                                    }
                                                    if (r6 != 0) {
                                                        rb3Var5.y(r6);
                                                        r6 = 0;
                                                    }
                                                    rb3Var5.y(i73Var8);
                                                }
                                            }
                                            i73Var8 = i73Var8.w;
                                            r6 = r6;
                                            rb3Var5 = rb3Var5;
                                        }
                                        if (i9 == 1) {
                                            Q = r6;
                                            r5 = rb3Var5;
                                        } else {
                                            r5 = rb3Var5;
                                        }
                                    }
                                    Q = k33.Q(r5);
                                }
                            }
                            i73Var7 = i73Var7.q;
                        }
                    }
                    um2VarV3 = um2VarV3.o();
                    i73Var7 = (um2VarV3 == null || (ah3Var2 = um2VarV3.M) == null) ? null : ah3Var2.v;
                }
                wb2Var = (wb2) Q;
            } else {
                wb2Var = null;
            }
            if (wb2Var != null) {
                i73 i73Var9 = (i73) wb2Var;
                if (!i73Var9.j.h) {
                    mc2.y(str);
                }
                i73 i73Var10 = i73Var9.j.q;
                um2 um2VarV4 = k33.V(wb2Var);
                ArrayList arrayList3 = null;
                while (um2VarV4 != null) {
                    if ((um2VarV4.M.x.m & i) != 0) {
                        while (i73Var10 != null) {
                            if ((i73Var10.a & i) != 0) {
                                i73 i73VarQ5 = i73Var10;
                                rb3 rb3Var6 = null;
                                while (i73VarQ5 != null) {
                                    if (i73VarQ5 instanceof wb2) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(i73VarQ5);
                                        arrayList3 = arrayList3;
                                        z3 = false;
                                    } else {
                                        arrayList3 = arrayList3;
                                        z3 = true;
                                    }
                                    if (z3 && (i73VarQ5.a & i) != 0 && (i73VarQ5 instanceof p41)) {
                                        rb3 rb3Var7 = rb3Var6;
                                        i73 i73Var11 = i73VarQ5;
                                        int i10 = 0;
                                        for (i73 i73Var12 = ((p41) i73VarQ5).f; i73Var12 != null; i73Var12 = i73Var12.w) {
                                            if ((i73Var12.a & i) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    i73Var11 = i73Var12;
                                                } else {
                                                    if (rb3Var7 == null) {
                                                        rb3Var7 = new rb3(new i73[16]);
                                                    }
                                                    if (i73Var11 != null) {
                                                        rb3Var7.y(i73Var11);
                                                        i73Var11 = null;
                                                    }
                                                    rb3Var7.y(i73Var12);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                            i73VarQ5 = i73Var11;
                                            rb3Var6 = rb3Var7;
                                        } else {
                                            rb3Var6 = rb3Var7;
                                            i73VarQ5 = k33.Q(rb3Var6);
                                        }
                                    } else {
                                        i73VarQ5 = k33.Q(rb3Var6);
                                    }
                                }
                            }
                            i73Var10 = i73Var10.q;
                        }
                    }
                    um2VarV4 = um2VarV4.o();
                    i73Var10 = (um2VarV4 == null || (ah3Var = um2VarV4.M) == null) ? null : ah3Var.v;
                }
                wb2Var.C();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i11 = 0; i11 < size5; i11++) {
                        ((wb2) arrayList3.get(i11)).C();
                    }
                }
            }
            yb2Var.y = 0;
            yb2Var.r = true;
            return true;
        }
        nt1 nt1Var2 = (nt1) getFocusOwner();
        if (!nt1Var2.n.v) {
            cu1 cu1VarX2 = nt1Var2.x();
            if (cu1VarX2 != null) {
                if (!cu1VarX2.j.h) {
                    mc2.y(str);
                }
                i73 i73Var13 = cu1VarX2.j;
                um2 um2VarV5 = k33.V(cu1VarX2);
                loop14: while (true) {
                    if (um2VarV5 == null) {
                        obj = null;
                        break;
                    }
                    if ((um2VarV5.M.x.m & i) != 0) {
                        while (i73Var13 != null) {
                            if ((i73Var13.a & i) != 0) {
                                i73 i73VarQ6 = i73Var13;
                                rb3 rb3Var8 = null;
                                while (i73VarQ6 != null) {
                                    if (i73VarQ6 instanceof wb2) {
                                        obj = i73VarQ6;
                                        break loop14;
                                    }
                                    if ((i73VarQ6.a & i) != 0 && (i73VarQ6 instanceof p41)) {
                                        int i12 = 0;
                                        rb3 rb3Var9 = rb3Var8;
                                        i73 i73Var14 = i73VarQ6;
                                        for (i73 i73Var15 = ((p41) i73VarQ6).f; i73Var15 != null; i73Var15 = i73Var15.w) {
                                            if ((i73Var15.a & i) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    i73Var14 = i73Var15;
                                                } else {
                                                    if (rb3Var9 == null) {
                                                        rb3Var9 = new rb3(new i73[16]);
                                                    }
                                                    if (i73Var14 != null) {
                                                        rb3Var9.y(i73Var14);
                                                        i73Var14 = null;
                                                    }
                                                    rb3Var9.y(i73Var15);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                            i73VarQ6 = i73Var14;
                                            rb3Var8 = rb3Var9;
                                        } else {
                                            rb3Var8 = rb3Var9;
                                        }
                                    }
                                    i73VarQ6 = k33.Q(rb3Var8);
                                }
                            }
                            i73Var13 = i73Var13.q;
                        }
                    }
                    um2VarV5 = um2VarV5.o();
                    i73Var13 = (um2VarV5 == null || (ah3Var4 = um2VarV5.M) == null) ? null : ah3Var4.v;
                }
                wb2Var2 = (wb2) obj;
            } else {
                wb2Var2 = null;
            }
            if (wb2Var2 != null) {
                i73 i73Var16 = (i73) wb2Var2;
                if (!i73Var16.j.h) {
                    mc2.y(str);
                }
                i73 i73Var17 = i73Var16.j.q;
                um2 um2VarV6 = k33.V(wb2Var2);
                ArrayList arrayList4 = null;
                while (um2VarV6 != null) {
                    if ((um2VarV6.M.x.m & i) != 0) {
                        while (i73Var17 != null) {
                            if ((i73Var17.a & i) != 0) {
                                i73 i73VarQ7 = i73Var17;
                                rb3 rb3Var10 = null;
                                while (i73VarQ7 != null) {
                                    if (i73VarQ7 instanceof wb2) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(i73VarQ7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (i73VarQ7.a & i) != 0 && (i73VarQ7 instanceof p41)) {
                                        int i13 = 0;
                                        for (i73 i73Var18 = ((p41) i73VarQ7).f; i73Var18 != null; i73Var18 = i73Var18.w) {
                                            if ((i73Var18.a & i) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    i73VarQ7 = i73Var18;
                                                } else {
                                                    if (rb3Var10 == null) {
                                                        rb3Var10 = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ7 != null) {
                                                        rb3Var10.y(i73VarQ7);
                                                        i73VarQ7 = null;
                                                    }
                                                    rb3Var10.y(i73Var18);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    i73VarQ7 = k33.Q(rb3Var10);
                                }
                            }
                            i73Var17 = i73Var17.q;
                        }
                    }
                    um2VarV6 = um2VarV6.o();
                    i73Var17 = (um2VarV6 == null || (ah3Var3 = um2VarV6.M) == null) ? null : ah3Var3.v;
                }
                ku3 ku3Var = ku3.j;
                if (arrayList4 != null && (size2 = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i14 = size2 - 1;
                        ((wb2) arrayList4.get(size2)).h(ld1Var, ku3Var);
                        if (i14 < 0) {
                            break;
                        }
                        size2 = i14;
                    }
                }
                wb2Var2.h(ld1Var, ku3Var);
                ku3 ku3Var2 = ku3.t;
                wb2Var2.h(ld1Var, ku3Var2);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i15 = 0; i15 < size6; i15++) {
                        ((wb2) arrayList4.get(i15)).h(ld1Var, ku3Var2);
                    }
                }
                ku3 ku3Var3 = ku3.a;
                if (arrayList4 != null && (size = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i16 = size - 1;
                        ((wb2) arrayList4.get(size)).h(ld1Var, ku3Var3);
                        if (i16 < 0) {
                            break;
                        }
                        size = i16;
                    }
                }
                wb2Var2.h(ld1Var, ku3Var3);
            }
            ArrayList arrayList5 = (ArrayList) ld1Var.n();
            int size7 = arrayList5.size();
            int i17 = 0;
            while (true) {
                if (i17 < size7) {
                    if (((ob2) arrayList5.get(i17)).v()) {
                        z4 = true;
                        break;
                    }
                    i17++;
                }
            }
            yb2Var.getClass();
            MotionEvent motionEventY = bh6.y(ld1Var);
            action = motionEventY.getAction();
            if (action != 0) {
                z6 = true;
                if ((action != 1 || action == 2) && z4) {
                    yb2Var.y = 0;
                    yb2Var.r = true;
                }
            } else {
                z6 = true;
                yb2Var.y = ld1Var.x();
                yb2Var.r = false;
            }
            yb2Var.n.onTouchEvent(motionEventY);
            return z6;
        }
        System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        z4 = false;
        yb2Var.getClass();
        MotionEvent motionEventY2 = bh6.y(ld1Var);
        action = motionEventY2.getAction();
        if (action != 0) {
            z6 = true;
            if (action != 1) {
                yb2Var.y = 0;
                yb2Var.r = true;
            } else {
                yb2Var.y = 0;
                yb2Var.r = true;
            }
        } else {
            z6 = true;
            yb2Var.y = ld1Var.x();
            yb2Var.r = false;
        }
        yb2Var.n.onTouchEvent(motionEventY2);
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        if (o(r25) == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = 1;
        if (!isFocused()) {
            return ((nt1) getFocusOwner()).n(keyEvent, new p2(this, keyEvent, b));
        }
        dt2 dt2Var = getComposeViewContext().z;
        int metaState = keyEvent.getMetaState();
        tp3 tp3Var = po5.g;
        qb6.r().setValue(new zu3(metaState));
        return ((nt1) getFocusOwner()).n(keyEvent, new ym0((byte) 25)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        ah3 ah3Var;
        if (isFocused()) {
            nt1 nt1Var = (nt1) getFocusOwner();
            if (nt1Var.n.v) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                cu1 cu1VarH = og0.h(nt1Var.r);
                if (cu1VarH != null) {
                    if (!cu1VarH.j.h) {
                        mc2.y("visitAncestors called on an unattached node");
                    }
                    i73 i73Var = cu1VarH.j;
                    um2 um2VarV = k33.V(cu1VarH);
                    while (um2VarV != null) {
                        if ((um2VarV.M.x.m & 131072) != 0) {
                            while (i73Var != null) {
                                if ((i73Var.a & 131072) != 0) {
                                    i73 i73VarQ = i73Var;
                                    rb3 rb3Var = null;
                                    while (i73VarQ != null) {
                                        if ((i73VarQ.a & 131072) != 0 && (i73VarQ instanceof p41)) {
                                            int i = 0;
                                            for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                                if ((i73Var2.a & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        i73VarQ = i73Var2;
                                                    } else {
                                                        if (rb3Var == null) {
                                                            rb3Var = new rb3(new i73[16]);
                                                        }
                                                        if (i73VarQ != null) {
                                                            rb3Var.y(i73VarQ);
                                                            i73VarQ = null;
                                                        }
                                                        rb3Var.y(i73Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        i73VarQ = k33.Q(rb3Var);
                                    }
                                }
                                i73Var = i73Var.q;
                            }
                        }
                        um2VarV = um2VarV.o();
                        i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (n()) {
            this.L0 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.L0 = false;
                G(viewStructure);
            } catch (Throwable th) {
                this.L0 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            ja.g.g(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object objG;
        cu1 cu1VarX;
        if (this.E0) {
            o9 o9Var = this.D0;
            removeCallbacks(o9Var);
            MotionEvent motionEvent2 = this.u0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.E0 = false;
            } else {
                o9Var.run();
            }
        }
        if (!z(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int iW = w(motionEvent);
            if ((iW & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (objG = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    objG = is.g(1);
                }
                if (objG.equals(is.g(1)) && (cu1VarX = ((nt1) getFocusOwner()).x()) != null) {
                    gh3 gh3VarU = k33.U(cu1VarX);
                    if (!m50.K(gh3VarU).H(gh3VarU, true).g((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((nt1) getFocusOwner()).y(8, false, true);
                    }
                }
            }
            if ((iW & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void e(um2 um2Var, long j) {
        t51 t51Var = this.a0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t51Var.z(um2Var, j);
            if (!((ro) t51Var.n).N()) {
                t51Var.l(false);
                getRectManager().g();
                this.I0.g();
                if (this.K) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.K = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void f(float[] fArr) {
        H();
        l33.v(fArr, this.f0);
        ra.J(fArr, Float.intBitsToFloat((int) (this.j0 >> 32)), Float.intBitsToFloat((int) (this.j0 & 4294967295L)), this.d0);
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return yf2.D(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        k44 k44VarG;
        if (view == null || this.a0.g) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !ra.i(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            cu1 cu1VarH = og0.h(((nt1) getFocusOwner()).r);
            k44VarG = cu1VarH != null ? og0.o(cu1VarH) : null;
            if (k44VarG == null) {
                k44VarG = it1.g(view, this);
            }
        } else {
            k44VarG = it1.g(view, this);
        }
        bt1 bt1VarN = it1.n(i);
        int i2 = bt1VarN != null ? bt1VarN.g : 6;
        u54 u54Var = new u54();
        if (((nt1) getFocusOwner()).v(i2, k44VarG, new j9(u54Var, (byte) 0)) == null) {
            return view;
        }
        if (u54Var.j == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || yf6.w(i2) || kq2.I(og0.o((cu1) u54Var.j), it1.g(viewFindNextFocus, this), k44VarG, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // defpackage.kt1
    public final void g(cu1 cu1Var, cu1 cu1Var2) {
        ah3 ah3Var;
        boolean z;
        ah3 ah3Var2;
        boolean z2;
        if (cu1Var != null) {
            cu1 cu1Var3 = cu1Var;
            if (!cu1Var3.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73 i73Var = cu1Var3.j;
            um2 um2VarV = k33.V(cu1Var);
            ib3 ib3Var = null;
            ArrayList arrayList = null;
            while (um2VarV != null) {
                if ((um2VarV.M.x.m & 2097152) != 0) {
                    while (i73Var != null) {
                        if ((i73Var.a & 2097152) != 0) {
                            i73 i73VarQ = i73Var;
                            rb3 rb3Var = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof wb2) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(i73VarQ);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (i73VarQ.a & 2097152) != 0 && (i73VarQ instanceof p41)) {
                                    int i = 0;
                                    for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                        if ((i73Var2.a & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i73VarQ = i73Var2;
                                            } else {
                                                if (rb3Var == null) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var.y(i73Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var);
                            }
                        }
                        i73Var = i73Var.q;
                    }
                }
                um2VarV = um2VarV.o();
                i73Var = (um2VarV == null || (ah3Var2 = um2VarV.M) == null) ? null : ah3Var2.v;
            }
            if (arrayList == null) {
                return;
            }
            if (cu1Var2 != null) {
                if (!cu1Var2.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var3 = cu1Var2.j;
                um2 um2VarV2 = k33.V(cu1Var2);
                ib3 ib3Var2 = null;
                while (um2VarV2 != null) {
                    if ((um2VarV2.M.x.m & 2097152) != 0) {
                        while (i73Var3 != null) {
                            if ((i73Var3.a & 2097152) != 0) {
                                i73 i73VarQ2 = i73Var3;
                                rb3 rb3Var2 = null;
                                while (i73VarQ2 != null) {
                                    if (i73VarQ2 instanceof wb2) {
                                        if (ib3Var2 == null) {
                                            ib3 ib3Var3 = fe4.g;
                                            ib3Var2 = new ib3();
                                        }
                                        ib3Var2.g(i73VarQ2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (i73VarQ2.a & 2097152) != 0 && (i73VarQ2 instanceof p41)) {
                                        int i2 = 0;
                                        for (i73 i73Var4 = ((p41) i73VarQ2).f; i73Var4 != null; i73Var4 = i73Var4.w) {
                                            if ((i73Var4.a & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    i73VarQ2 = i73Var4;
                                                } else {
                                                    if (rb3Var2 == null) {
                                                        rb3Var2 = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ2 != null) {
                                                        rb3Var2.y(i73VarQ2);
                                                        i73VarQ2 = null;
                                                    }
                                                    rb3Var2.y(i73Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    i73VarQ2 = k33.Q(rb3Var2);
                                }
                            }
                            i73Var3 = i73Var3.q;
                        }
                    }
                    um2VarV2 = um2VarV2.o();
                    i73Var3 = (um2VarV2 == null || (ah3Var = um2VarV2.M) == null) ? null : ah3Var.v;
                }
                ib3Var = ib3Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                wb2 wb2Var = (wb2) arrayList.get(i3);
                if (!(ib3Var != null ? ib3Var.r(wb2Var) : false)) {
                    wb2Var.C();
                }
            }
        }
    }

    public y1 getAccessibilityManager() {
        return getComposeViewContext().m;
    }

    public final kg getAndroidViewsHandler$ui() {
        if (this.U == null) {
            kg kgVar = new kg(getContext());
            this.U = kgVar;
            addView(kgVar, -1);
            requestLayout();
        }
        kg kgVar2 = this.U;
        kgVar2.getClass();
        return kgVar2;
    }

    public iv getAutofillTree() {
        return this.G;
    }

    public bi0 getClipboard() {
        return getComposeViewContext().c;
    }

    public ci0 getClipboardManager() {
        return getComposeViewContext().w;
    }

    public final mo0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.K0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.N.getValue();
    }

    public final ya getContentCaptureManager$ui() {
        return this.E;
    }

    public fx0 getCoroutineContext() {
        return this.h;
    }

    public j51 getDensity() {
        return (j51) this.p.getValue();
    }

    public k44 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            cu1 cu1VarH = og0.h(((nt1) getFocusOwner()).r);
            if (cu1VarH != null) {
                return og0.o(cu1VarH);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return it1.g(viewFindFocus, this);
        }
        return null;
    }

    public lt1 getFocusOwner() {
        return this.z;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        k44 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.g);
            rect.top = Math.round(embeddedViewFocusRect.y);
            rect.right = Math.round(embeddedViewFocusRect.r);
            rect.bottom = Math.round(embeddedViewFocusRect.n);
            return;
        }
        if (yf2.p(((nt1) getFocusOwner()).v(6, null, new m9((byte) 0)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public ku1 getFontFamilyResolver() {
        return (ku1) this.p0.getValue();
    }

    public ju1 getFontLoader() {
        return getComposeViewContext().i;
    }

    public final ku2 getFrameEndScheduler$ui() {
        return this.q;
    }

    public w32 getGraphicsContext() {
        return this.F;
    }

    public y42 getHapticFeedBack() {
        return getComposeViewContext().s;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((ro) this.a0.n).N() || !this.b.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public gd2 getInputModeManager() {
        gd2 gd2Var = this.r0;
        if (gd2Var == null) {
            gd2Var = new gd2(isInTouchMode() ? 1 : 2);
            this.r0 = gd2Var;
        }
        return gd2Var;
    }

    public final rd2 getInsetsListener() {
        return this.d;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.h0;
    }

    @Override // android.view.View, android.view.ViewParent
    public fl2 getLayoutDirection() {
        return (fl2) this.q0.getValue();
    }

    public tx2 getLocaleList() {
        return (tx2) this.O.getValue();
    }

    public long getMeasureIteration() {
        if (this.a0.g) {
            return 1L;
        }
        mc2.g("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public k73 getModifierLocalManager() {
        return this.s0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ba m8getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public ts3 getPlacementScope() {
        rn3 rn3Var = vs3.g;
        return new az2(this, (byte) 1);
    }

    public final bz1 getPlayNavigationSoundEffect$ui() {
        return this.F0;
    }

    public pu3 getPointerIconService() {
        return this.O0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final nb2 m1getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.m;
    }

    public m44 getRectManager() {
        return this.B;
    }

    public l84 getRetainedValuesStore() {
        return this.i;
    }

    public um2 getRoot() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final za1 getSavedStateRegistry() {
        boolean z;
        za1 za1Var = this.c;
        if (za1Var != null) {
            return za1Var;
        }
        mo0 composeViewContext = getComposeViewContext();
        composeViewContext.l();
        id4 id4Var = composeViewContext.v;
        id4Var.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strT = xi3.t("SaveableStateRegistry:", strValueOf);
        ji jiVarR = id4Var.r();
        Bundle bundleA = jiVarR.a(strT);
        if (bundleA != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleA.keySet()) {
                ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        q21 q21Var = new q21((byte) 5);
        vf1 vf1Var = wc4.g;
        vc4 vc4Var = new vc4(linkedHashMap, q21Var);
        byte b = 0;
        if (jiVarR.H(strT) != null) {
            z = false;
        } else {
            try {
                z = true;
                jiVarR.T(strT, new rl0(vc4Var, 1 == true ? 1 : 0));
            } catch (IllegalArgumentException unused) {
                z = false;
            }
        }
        za1 za1Var2 = new za1(vc4Var, new ab1(b, jiVarR, strT, z));
        this.c = za1Var2;
        return za1Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        y22 y22Var;
        if (Build.VERSION.SDK_INT >= 31 && (y22Var = this.M0) != null && ((Boolean) ((tp3) y22Var.t).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ba) {
                return ((ba) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public jj4 getSemanticsOwner() {
        return this.C;
    }

    public wm2 getSharedDrawScope() {
        return getComposeViewContext().u;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? uj.g.g(this) : this.T;
    }

    public sn3 getSnapshotObserver() {
        return this.S;
    }

    public yt4 getSoftwareKeyboardController() {
        z41 z41Var = this.o0;
        if (z41Var != null) {
            return z41Var;
        }
        z41 z41Var2 = new z41(getTextInputService());
        this.o0 = z41Var2;
        return z41Var2;
    }

    public v65 getTextInputService() {
        v65 v65Var = this.m0;
        if (v65Var != null) {
            return v65Var;
        }
        v65 v65Var2 = new v65(getLegacyTextInputServiceAndroid());
        this.m0 = v65Var2;
        return v65Var2;
    }

    public l85 getTextToolbar() {
        jf jfVar = this.t0;
        if (jfVar != null) {
            return jfVar;
        }
        jf jfVar2 = new jf(this);
        this.t0 = jfVar2;
        return jfVar2;
    }

    public final ca4 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public bl5 getViewConfiguration() {
        return getComposeViewContext().p;
    }

    public oo5 getWindowInfo() {
        return getComposeViewContext().z;
    }

    public final boolean h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final on3 j(bz1 bz1Var, bh3 bh3Var, x32 x32Var) {
        rb3 rb3Var;
        Reference referencePoll;
        Object obj;
        if (x32Var != null) {
            return new a42(x32Var, null, this, bz1Var, bh3Var);
        }
        do {
            wh4 wh4Var = this.w0;
            ReferenceQueue referenceQueue = (ReferenceQueue) wh4Var.t;
            rb3Var = (rb3) wh4Var.j;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                rb3Var.q(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = rb3Var.a;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) rb3Var.w(i - 1)).get();
        } while (obj == null);
        on3 on3Var = (on3) obj;
        if (on3Var == null) {
            return new a42(getGraphicsContext().y(), getGraphicsContext(), this, bz1Var, bh3Var);
        }
        a42 a42Var = (a42) on3Var;
        w32 w32Var = a42Var.t;
        if (w32Var == null) {
            mc2.r("currently reuse is only supported when we manage the layer lifecycle");
            l0.x();
            return null;
        }
        if (!a42Var.j.u) {
            mc2.g("layer should have been released before reuse");
        }
        a42Var.j = w32Var.y();
        a42Var.c = false;
        a42Var.m = bz1Var;
        a42Var.q = bh3Var;
        a42Var.k = false;
        a42Var.d = false;
        a42Var.e = true;
        l33.n(a42Var.i);
        float[] fArr = a42Var.b;
        if (fArr != null) {
            l33.n(fArr);
        }
        a42Var.o = vb5.y;
        a42Var.A = false;
        a42Var.w = 9223372034707292159L;
        a42Var.f = null;
        a42Var.h = 0;
        return on3Var;
    }

    public final long k(long j) {
        H();
        long jY = l33.y(j, this.f0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.j0 >> 32)) + Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.j0 & 4294967295L)) + Float.intBitsToFloat((int) (jY & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.u0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        l84 l84Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().J()) {
            getRoot().y(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(yf2.H());
        }
        this.d.onViewAttachedToWindow(this);
        if (!this.K0) {
            getComposeViewContext().v();
        }
        int i = 0;
        Object[] objArr = 0;
        this.K0 = false;
        p(getRoot());
        s(getRoot());
        getSnapshotObserver().g.v();
        ba baVarM8getOutOfFrameExecutor = m8getOutOfFrameExecutor();
        if (baVarM8getOutOfFrameExecutor == null) {
            l0.z("Expected the view to be attached to window.");
            return;
        }
        baVarM8getOutOfFrameExecutor.L(new l9(this, objArr == true ? 1 : 0));
        getComposeViewContext().n();
        mo0 composeViewContext = getComposeViewContext();
        composeViewContext.l();
        wl5 wl5Var = composeViewContext.x;
        ku2 ku2Var = this.q;
        if (wl5Var == null || ku2Var == null) {
            l84Var = null;
        } else {
            vl5 vl5VarT = wl5Var.t();
            ul5 ul5Var = new ul5();
            xx0 xx0Var = xx0.y;
            vl5VarT.getClass();
            xx0Var.getClass();
            kb5 kb5Var = new kb5(vl5VarT, ul5Var, xx0Var);
            tf0 tf0VarG = v54.g(mu2.class);
            String strY = tf0VarG.y();
            if (strY == null) {
                l0.u("Local and anonymous classes can not be ViewModels");
                return;
            }
            mu2 mu2Var = (mu2) kb5Var.h(tf0VarG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY));
            ViewParent parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            ha3 ha3Var = mu2Var.y;
            Object objY = ha3Var.y(id);
            if (objY == null) {
                objY = new xa3(1);
                ha3Var.t(id, objY);
            }
            xa3 xa3Var = (xa3) objY;
            Object[] objArr2 = xa3Var.g;
            int i2 = xa3Var.y;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr2[i];
                if (!((lu2) obj).r) {
                    break;
                } else {
                    i++;
                }
            }
            lu2 lu2Var = (lu2) obj;
            if (lu2Var == null) {
                lu2Var = new lu2();
                xa3Var.g(lu2Var);
            }
            lu2Var.r = true;
            this.w = lu2Var;
            l84Var = lu2Var.y;
        }
        if (l84Var == null) {
            l84Var = hi0.A;
        }
        this.i = l84Var;
        xy1 xy1Var = this.k0;
        if (xy1Var != null) {
            xy1Var.a(getComposeViewContext());
            this.k0 = null;
        }
        ju2 ju2VarA = getComposeViewContext().n().a();
        ju2VarA.g(this);
        ju2VarA.g(this.E);
        getInputModeManager().g.setValue(new ed2(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            oa.g.y(this);
        }
        a9 a9VarM4getAutofillManager = m4getAutofillManager();
        if (a9VarM4getAutofillManager != null) {
            ((nt1) getFocusOwner()).l.g(a9VarM4getAutofillManager);
            getSemanticsOwner().n.g(a9VarM4getAutofillManager);
        }
        ((nt1) getFocusOwner()).l.g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bl4 bl4Var = (bl4) this.n0.get();
        td tdVar = (td) (bl4Var != null ? bl4Var.y : null);
        if (tdVar == null) {
            return getLegacyTextInputServiceAndroid().n;
        }
        bl4 bl4Var2 = (bl4) tdVar.m.get();
        dd2 dd2Var = (dd2) (bl4Var2 != null ? bl4Var2.y : null);
        return dd2Var != null && dd2Var.y();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        R(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        bl4 bl4Var = (bl4) this.n0.get();
        td tdVar = (td) (bl4Var != null ? bl4Var.y : null);
        if (tdVar == null) {
            x65 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.n) {
                lx5.v(editorInfo, legacyTextInputServiceAndroid.j, legacyTextInputServiceAndroid.l);
                lx5.g(editorInfo);
                g44 g44Var = new g44(legacyTextInputServiceAndroid.l, new fa4((Object) legacyTextInputServiceAndroid, (byte) 29), legacyTextInputServiceAndroid.j.r);
                legacyTextInputServiceAndroid.t.add(new WeakReference(g44Var));
                return g44Var;
            }
        } else {
            bl4 bl4Var2 = (bl4) tdVar.m.get();
            dd2 dd2Var = (dd2) (bl4Var2 != null ? bl4Var2.y : null);
            if (dd2Var != null) {
                return dd2Var.g(editorInfo);
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ya yaVar = this.E;
        yaVar.getClass();
        wa.v(yaVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.d.onViewDetachedFromWindow(this);
        View view = this.u;
        if (u() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            xa3 xa3Var = S0;
            synchronized (xa3Var) {
                xa3Var.m(this);
            }
        }
        getComposeViewContext().y();
        ut4 ut4Var = getSnapshotObserver().g;
        d5 d5Var = ut4Var.j;
        if (d5Var != null) {
            d5Var.y();
        }
        ut4Var.g();
        ju2 ju2VarA = getComposeViewContext().n().a();
        ju2VarA.x(this.E);
        ju2VarA.x(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        lu2 lu2Var = this.w;
        if (lu2Var != null) {
            lu2Var.r = false;
        }
        this.w = null;
        if (i >= 31) {
            oa.g.g(this);
        }
        a9 a9VarM4getAutofillManager = m4getAutofillManager();
        if (a9VarM4getAutofillManager != null) {
            getSemanticsOwner().n.m(a9VarM4getAutofillManager);
            ((nt1) getFocusOwner()).l.m(a9VarM4getAutofillManager);
        }
        m44 rectManager = getRectManager();
        rectManager.l = rectManager.n.y(0L, 0L, null, 0, 0);
        getRectManager().g();
        m44 rectManager2 = getRectManager();
        n9 n9Var = rectManager2.t;
        if (n9Var != null) {
            rectManager2.y.removeCallbacks(n9Var);
            rectManager2.t = null;
        }
        ((nt1) getFocusOwner()).l.m(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        nt1 nt1Var = (nt1) getFocusOwner();
        v70.M(nt1Var.r, true);
        if (nt1Var.x() != null) {
            cu1 cu1VarX = nt1Var.x();
            nt1Var.t(null);
            if (cu1VarX != null) {
                cu1VarX.R0(xt1.j, xt1.a);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.h0 = 0L;
        S();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        R(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.h0 = 0L;
            this.a0.u(this.H0);
            this.V = null;
            S();
            if (this.U != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        t51 t51Var = this.a0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().J()) {
                getRoot().y(this);
            }
            if (!isAttachedToWindow()) {
                p(getRoot());
            }
            long jL = l(i);
            long jL2 = l(i2);
            long jE = y94.e((int) (jL >>> 32), (int) (jL & 4294967295L), (int) (jL2 >>> 32), (int) (4294967295L & jL2));
            ws0 ws0Var = this.V;
            if (ws0Var == null) {
                this.V = new ws0(jE);
                this.W = false;
            } else if (!ws0.r(ws0Var.g, jE)) {
                this.W = true;
            }
            t51Var.E(jE);
            t51Var.h();
            setMeasuredDimension(getRoot().N.b.j, getRoot().N.b.t);
            if (this.U != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().N.b.j, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N.b.t, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!n() || viewStructure == null || this.L0) {
            return;
        }
        G(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        ou3 ou3Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (ou3Var = ((x9) getPointerIconService()).g) == null) ? super.onResolvePointerIcon(motionEvent, i) : pa.y(getContext(), ou3Var);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        fl2 fl2Var;
        if (this.a) {
            int[] iArr = it1.g;
            fl2 fl2Var2 = fl2.j;
            if (i != 0) {
                fl2Var = i != 1 ? null : fl2.t;
            } else {
                fl2Var = fl2Var2;
            }
            if (fl2Var != null) {
                fl2Var2 = fl2Var;
            }
            setLayoutDirection(fl2Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        y22 y22Var;
        if (Build.VERSION.SDK_INT < 31 || (y22Var = this.M0) == null) {
            return;
        }
        jj4 semanticsOwner = getSemanticsOwner();
        fx0 coroutineContext = getCoroutineContext();
        rb3 rb3Var = new rb3(new ef4[16]);
        if6.n(semanticsOwner.g(), 0, new df4(rb3Var));
        Arrays.sort(rb3Var.j, 0, rb3Var.a, new dl0(new xy1[]{new vy3((byte) 6), new vy3((byte) 7)}, (byte) 0));
        int i = rb3Var.a;
        ef4 ef4Var = (ef4) (i == 0 ? null : rb3Var.j[i - 1]);
        if (ef4Var == null) {
            return;
        }
        eo0 eo0Var = new eo0(ef4Var.y(), ef4Var.r(), k33.x(coroutineContext), y22Var, this);
        bl2 bl2VarG = ef4Var.g();
        k44 k44VarH = m50.K(bl2VarG).H(bl2VarG, true);
        long jR = ef4Var.r().r();
        ScrollCaptureTarget scrollCaptureTargetJ = ka4.j(this, oe6.y(c93.E(k44VarH)), new Point((int) (jR >> 32), (int) (jR & 4294967295L)), eo0Var);
        scrollCaptureTargetJ.setScrollBounds(oe6.y(ef4Var.r()));
        consumer.accept(scrollCaptureTargetJ);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        S();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().g.setValue(new ed2(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ya yaVar = this.E;
        yaVar.getClass();
        wa.l(yaVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zH;
        this.J0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zH = yf2.H())) {
            return;
        }
        setShowLayoutBounds(zH);
        s(getRoot());
    }

    public final void p(um2 um2Var) {
        this.a0.D(um2Var, false);
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            p((um2) objArr[i2]);
        }
    }

    public final void q(um2 um2Var, boolean z) {
        this.a0.w(um2Var, z);
    }

    public final void r(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iN;
        ia iaVar = this.D;
        if (yf2.p(str, iaVar.K)) {
            int iN2 = iaVar.I.n(i);
            if (iN2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iN2);
                return;
            }
            return;
        }
        if (!yf2.p(str, iaVar.L) || (iN = iaVar.J.n(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iN);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            bt1 bt1VarN = it1.n(i);
            int i2 = bt1VarN != null ? bt1VarN.g : 7;
            Boolean boolV = ((nt1) getFocusOwner()).v(i2, rect != null ? oe6.v(rect) : null, new i9(i2, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!yf2.p(boolV, bool)) {
                if (!yf2.p(((nt1) getFocusOwner()).v(i2, null, new i9(i2, b)), bool)) {
                    if (hasFocus() && yf6.w(i2)) {
                        return ((nt1) getFocusOwner()).j(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.D.i = j;
    }

    public final void setComposeViewContext(mo0 mo0Var) {
        if (getCoroutineContext() != mo0Var.r().a() && !((qb3) getRoot().i()).isEmpty()) {
            mc2.g("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            mo0 mo0Var2 = get_composeViewContext();
            js2.z(at4VarM, at4VarB, xy1VarV);
            if (mo0Var != mo0Var2) {
                if (isAttachedToWindow()) {
                    mo0Var2.y();
                    mo0Var.v();
                }
                set_composeViewContext(mo0Var);
                setCoroutineContext(mo0Var.r().a());
            }
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.K0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.N.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ya yaVar) {
        this.E = yaVar;
    }

    public void setCoroutineContext(fx0 fx0Var) {
        this.h = fx0Var;
    }

    public final void setFrameEndScheduler$ui(ku2 ku2Var) {
        this.q = ku2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.h0 = j;
    }

    public final void setOnReadyForComposition(xy1 xy1Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.K0) {
            xy1Var.a(getComposeViewContext());
        } else {
            this.k0 = xy1Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(bz1 bz1Var) {
        this.F0 = bz1Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(nb2 nb2Var) {
        this.m = nb2Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.T = z;
    }

    public void setUncaughtExceptionHandler(ca4 ca4Var) {
        this.a0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int w(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        ba baVar;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iO;
        z62 z62Var;
        ba baVar2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        z73 z73Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        z62 z62Var2;
        ba baVar3 = this;
        baVar3.removeCallbacks(baVar3.C0);
        try {
            I(motionEvent);
            baVar3.i0 = true;
            baVar3.d(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = baVar3.u0;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                fe0 fe0Var = baVar3.M;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        baVar = this;
                    } else {
                        baVar = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = baVar.u0;
                    if (motionEvent3 != null) {
                        motionEvent4 = baVar.u0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        z73Var = baVar.L;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = baVar.u0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = baVar.u0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = baVar.u0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        z73Var.r.delete(pointerId);
                                        z73Var.y.delete(pointerId);
                                    }
                                    z62Var2 = (z62) fe0Var.r;
                                    if (z62Var2.n) {
                                        z62Var2.n = true;
                                    } else {
                                        z62Var2.l.g.j();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        z73Var.r.delete(pointerId);
                                        z73Var.y.delete(pointerId);
                                    }
                                    z62Var2 = (z62) fe0Var.r;
                                    if (z62Var2.n) {
                                        z62Var2.n = true;
                                    } else {
                                        z62Var2.l.g.j();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = baVar.u0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = baVar.u0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = baVar.u0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    z73Var.r.delete(pointerId);
                                    z73Var.y.delete(pointerId);
                                }
                                z62Var2 = (z62) fe0Var.r;
                                if (z62Var2.n) {
                                    z62Var2.n = true;
                                } else {
                                    z62Var2.l.g.j();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    z73Var.r.delete(pointerId);
                                    z73Var.y.delete(pointerId);
                                }
                                z62Var2 = (z62) fe0Var.r;
                                if (z62Var2.n) {
                                    z62Var2.n = true;
                                } else {
                                    z62Var2.l.g.j();
                                }
                            }
                        }
                    }
                    baVar.u0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        baVar.P(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iO = O(motionEvent);
                    Trace.endSection();
                    if ((iO & 4) != 0) {
                        baVar2 = this;
                    } else {
                        z62Var = (z62) fe0Var.r;
                        if (z62Var.n) {
                            z62Var.n = true;
                        } else {
                            z62Var.l.g.j();
                        }
                        baVar2 = this;
                        baVar2.P(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    baVar2.i0 = false;
                    return iO;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!fe0Var.g) {
                            ((uy2) ((q64) fe0Var.n).t).g();
                            ((z62) fe0Var.r).r();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        baVar3.P(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !h(motionEvent)) {
                        baVar = this;
                    } else {
                        baVar = this;
                        baVar.P(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = baVar.u0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = baVar.u0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        z73Var = baVar.L;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = baVar.u0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = baVar.u0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = baVar.u0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        z73Var.r.delete(pointerId);
                                        z73Var.y.delete(pointerId);
                                    }
                                    z62Var2 = (z62) fe0Var.r;
                                    if (z62Var2.n) {
                                        z62Var2.n = true;
                                    } else {
                                        z62Var2.l.g.j();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            z73Var.r.delete(pointerId);
                            z73Var.y.delete(pointerId);
                        }
                    }
                    baVar.u0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        baVar.P(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iO = O(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iO & 4) != 0 && z3) {
                            z62Var = (z62) fe0Var.r;
                            if (z62Var.n) {
                                z62Var.n = true;
                            } else {
                                z62Var.l.g.j();
                            }
                            baVar2 = this;
                            baVar2.P(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            baVar2 = this;
                        }
                        baVar2.i0 = false;
                        return iO;
                    } catch (Throwable th) {
                        th = th;
                        baVar3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        baVar3.i0 = false;
        throw th;
    }

    @Override // defpackage.n21
    public final void y(gu2 gu2Var) {
        lu2 lu2Var = this.w;
        if (lu2Var != null) {
            y03 y03Var = (y03) lu2Var.g.t;
            if (y03Var.j && !y03Var.a) {
                jb0 jb0Var = lu2Var.n;
                if (jb0Var != null) {
                    jb0Var.cancel();
                }
                lu2Var.n = null;
                return;
            }
            if (y03Var.t) {
                return;
            }
            if (!y03Var.a) {
                bw3.g("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!y03Var.m.t()) {
                bw3.g("Attempted to start retaining exited values with pending exited values");
            }
            y03Var.a = false;
        }
    }

    public z8 getAutofill() {
        return this.P;
    }

    /* JADX INFO: renamed from: getAutofillManager, reason: merged with bridge method [inline-methods] */
    public a9 m4getAutofillManager() {
        return this.Q;
    }

    public pb getDragAndDropManager() {
        return this.o;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public ha3 m7getLayoutNodes() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @v51
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @v51
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public da4 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(ca4 ca4Var) {
    }
}
