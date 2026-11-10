package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bw0;
import defpackage.cw0;
import defpackage.dn1;
import defpackage.dw0;
import defpackage.ew0;
import defpackage.fa4;
import defpackage.fu1;
import defpackage.fw0;
import defpackage.gw0;
import defpackage.ig3;
import defpackage.il5;
import defpackage.jg3;
import defpackage.k24;
import defpackage.l0;
import defpackage.pk5;
import defpackage.qv3;
import defpackage.sp4;
import defpackage.tp5;
import defpackage.ty;
import defpackage.xk5;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements ig3, jg3 {
    public static final String A;
    public static final Class[] B;
    public static final ThreadLocal C;
    public static final fu1 D;
    public static final qv3 E;
    public final ArrayList a;
    public final int[] b;
    public boolean c;
    public fa4 d;
    public final dn1 e;
    public Drawable f;
    public tp5 h;
    public boolean i;
    public final ArrayList j;
    public ViewGroup.OnHierarchyChangeListener k;
    public final ArrayList m;
    public boolean o;
    public View p;
    public final int[] q;
    public View s;
    public final ty t;
    public fw0 u;
    public final int[] w;
    public boolean z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        A = r0 != null ? r0.getName() : null;
        D = new fu1((byte) 7);
        B = new Class[]{Context.class, AttributeSet.class};
        C = new ThreadLocal();
        E = new qv3();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.j = new ArrayList();
        this.t = new ty((byte) 4);
        this.a = new ArrayList();
        this.m = new ArrayList();
        this.q = new int[2];
        this.w = new int[2];
        this.e = new dn1();
        int[] iArr = k24.g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.b = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.b;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        o();
        super.setOnHierarchyChangeListener(new dw0(this));
        WeakHashMap weakHashMap = xk5.g;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static void h(View view, int i) {
        ew0 ew0Var = (ew0) view.getLayoutParams();
        int i2 = ew0Var.a;
        if (i2 != i) {
            WeakHashMap weakHashMap = xk5.g;
            view.offsetTopAndBottom(i - i2);
            ew0Var.a = i;
        }
    }

    public static void m(int i, Rect rect, Rect rect2, ew0 ew0Var, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = ew0Var.r;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = ew0Var.n;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static Rect n() {
        Rect rect = (Rect) E.g();
        return rect == null ? new Rect() : rect;
    }

    public static ew0 w(View view) {
        ew0 ew0Var = (ew0) view.getLayoutParams();
        if (!ew0Var.y) {
            cw0 cw0Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cw0Var = (cw0) superclass.getAnnotation(cw0.class);
                if (cw0Var != null) {
                    break;
                }
            }
            if (cw0Var != null) {
                try {
                    bw0 bw0Var = (bw0) cw0Var.value().getDeclaredConstructor(null).newInstance(null);
                    bw0 bw0Var2 = ew0Var.g;
                    if (bw0Var2 != bw0Var) {
                        if (bw0Var2 != null) {
                            bw0Var2.v();
                        }
                        ew0Var.g = bw0Var;
                        ew0Var.y = true;
                        if (bw0Var != null) {
                            bw0Var.r(ew0Var);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cw0Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            ew0Var.y = true;
        }
        return ew0Var;
    }

    public static void z(View view, int i) {
        ew0 ew0Var = (ew0) view.getLayoutParams();
        int i2 = ew0Var.t;
        if (i2 != i) {
            WeakHashMap weakHashMap = xk5.g;
            view.offsetLeftAndRight(i - i2);
            ew0Var.t = i;
        }
    }

    @Override // defpackage.ig3
    public final boolean a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ew0 ew0Var = (ew0) childAt.getLayoutParams();
                bw0 bw0Var = ew0Var.g;
                if (bw0Var != null) {
                    boolean zI = bw0Var.i(childAt, i, i2);
                    z |= zI;
                    if (i2 == 0) {
                        ew0Var.w = zI;
                    } else if (i2 == 1) {
                        ew0Var.c = zI;
                    }
                } else if (i2 == 0) {
                    ew0Var.w = false;
                } else if (i2 == 1) {
                    ew0Var.c = false;
                }
            }
        }
        return z;
    }

    public final void b(View view, int i) {
        int i2;
        ew0 ew0Var = (ew0) view.getLayoutParams();
        View view2 = ew0Var.m;
        if (view2 == null && ew0Var.x != -1) {
            l0.z("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        qv3 qv3Var = E;
        if (view2 != null) {
            Rect rectN = n();
            Rect rectN2 = n();
            try {
                il5.g(this, view2, rectN);
                ew0 ew0Var2 = (ew0) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i, rectN, rectN2, ew0Var2, measuredWidth, measuredHeight);
                v(ew0Var2, rectN2, measuredWidth, measuredHeight);
                view.layout(rectN2.left, rectN2.top, rectN2.right, rectN2.bottom);
                return;
            } finally {
                rectN.setEmpty();
                qv3Var.a(rectN);
                rectN2.setEmpty();
                qv3Var.a(rectN2);
            }
        }
        int i3 = ew0Var.v;
        if (i3 < 0) {
            ew0 ew0Var3 = (ew0) view.getLayoutParams();
            Rect rectN3 = n();
            rectN3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ew0Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) ew0Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ew0Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ew0Var3).bottomMargin);
            if (this.h != null) {
                WeakHashMap weakHashMap = xk5.g;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectN3.left = this.h.y() + rectN3.left;
                    rectN3.top = this.h.n() + rectN3.top;
                    rectN3.right -= this.h.r();
                    rectN3.bottom -= this.h.g();
                }
            }
            Rect rectN4 = n();
            int i4 = ew0Var3.r;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectN3, rectN4, i);
            view.layout(rectN4.left, rectN4.top, rectN4.right, rectN4.bottom);
            rectN3.setEmpty();
            qv3Var.a(rectN3);
            rectN4.setEmpty();
            qv3Var.a(rectN4);
            return;
        }
        ew0 ew0Var4 = (ew0) view.getLayoutParams();
        int i5 = ew0Var4.r;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iQ = q(i3) - measuredWidth2;
        if (i6 == 1) {
            iQ += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iQ += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ew0Var4).leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) ew0Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ew0Var4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) ew0Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean c(View view, int i, int i2) {
        qv3 qv3Var = E;
        Rect rectN = n();
        il5.g(this, view, rectN);
        try {
            return rectN.contains(i, i2);
        } finally {
            rectN.setEmpty();
            qv3Var.a(rectN);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ew0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        bw0 bw0Var = ((ew0) view.getLayoutParams()).g;
        if (bw0Var != null) {
            bw0Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.ig3
    public final void g(View view, View view2, int i, int i2) {
        dn1 dn1Var = this.e;
        if (i2 == 1) {
            dn1Var.y = i;
        } else {
            dn1Var.g = i;
        }
        this.p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((ew0) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ew0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ew0) {
            return new ew0((ew0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ew0((ViewGroup.MarginLayoutParams) layoutParams) : new ew0(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        p();
        return Collections.unmodifiableList(this.j);
    }

    public final tp5 getLastWindowInsets() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        dn1 dn1Var = this.e;
        return dn1Var.y | dn1Var.g;
    }

    public Drawable getStatusBarBackground() {
        return this.f;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    public final void i(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ew0 ew0Var;
        int i10;
        View view;
        bw0 bw0Var;
        WeakHashMap weakHashMap = xk5.g;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        Rect rectN = n();
        Rect rectN2 = n();
        Rect rectN3 = n();
        int i11 = 0;
        while (true) {
            qv3 qv3Var = E;
            if (i11 >= size) {
                Rect rect2 = rectN3;
                rectN.setEmpty();
                qv3Var.a(rectN);
                rectN2.setEmpty();
                qv3Var.a(rectN2);
                rect2.setEmpty();
                qv3Var.a(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            ew0 ew0Var2 = (ew0) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectN3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (ew0Var2.q == ((View) arrayList2.get(i12))) {
                        ew0 ew0Var3 = (ew0) view2.getLayoutParams();
                        if (ew0Var3.m != null) {
                            Rect rectN4 = n();
                            Rect rectN5 = n();
                            ew0 ew0Var4 = ew0Var2;
                            Rect rectN6 = n();
                            il5.g(this, ew0Var3.m, rectN4);
                            x(view2, rectN5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            ew0Var = ew0Var4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m(layoutDirection, rectN4, rectN6, ew0Var3, measuredWidth, measuredHeight);
                            boolean z3 = (rectN6.left == rectN5.left && rectN6.top == rectN5.top) ? false : true;
                            v(ew0Var3, rectN6, measuredWidth, measuredHeight);
                            int i13 = rectN6.left - rectN5.left;
                            int i14 = rectN6.top - rectN5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = xk5.g;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = xk5.g;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (bw0Var = ew0Var3.g) != null) {
                                bw0Var.n(this, view, ew0Var3.m);
                            }
                            rectN4.setEmpty();
                            qv3Var.a(rectN4);
                            rectN5.setEmpty();
                            qv3Var.a(rectN5);
                            rectN6.setEmpty();
                            qv3Var.a(rectN6);
                        } else {
                            ew0Var = ew0Var2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        ew0Var = ew0Var2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    ew0Var2 = ew0Var;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectN3 = rectN3;
                }
                ArrayList arrayList3 = arrayList2;
                ew0 ew0Var5 = ew0Var2;
                int i15 = size;
                Rect rect3 = rectN3;
                i2 = i11;
                View view4 = view2;
                x(view4, rectN2, true);
                if (ew0Var5.l != 0 && !rectN2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(ew0Var5.l, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectN.top = Math.max(rectN.top, rectN2.bottom);
                    } else if (i16 == 80) {
                        rectN.bottom = Math.max(rectN.bottom, getHeight() - rectN2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectN.left = Math.max(rectN.left, rectN2.right);
                    } else if (i17 == 5) {
                        rectN.right = Math.max(rectN.right, getWidth() - rectN2.left);
                    }
                }
                if (ew0Var5.j != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = xk5.g;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        ew0 ew0Var6 = (ew0) view4.getLayoutParams();
                        bw0 bw0Var2 = ew0Var6.g;
                        Rect rectN7 = n();
                        Rect rectN8 = n();
                        rectN8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bw0Var2 == null || !bw0Var2.g(view4)) {
                            rectN7.set(rectN8);
                        } else if (!rectN8.contains(rectN7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectN7.toShortString() + " | Bounds:" + rectN8.toShortString());
                        }
                        rectN8.setEmpty();
                        qv3Var.a(rectN8);
                        if (rectN7.isEmpty()) {
                            rectN7.setEmpty();
                            qv3Var.a(rectN7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(ew0Var6.j, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectN7.top - ((ViewGroup.MarginLayoutParams) ew0Var6).topMargin) - ew0Var6.a) >= (i9 = rectN.top)) {
                                z = false;
                            } else {
                                h(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectN7.bottom) - ((ViewGroup.MarginLayoutParams) ew0Var6).bottomMargin) + ew0Var6.a) < (i7 = rectN.bottom)) {
                                h(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                h(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectN7.left - ((ViewGroup.MarginLayoutParams) ew0Var6).leftMargin) - ew0Var6.t) >= (i6 = rectN.left)) {
                                z2 = false;
                            } else {
                                z(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectN7.right) - ((ViewGroup.MarginLayoutParams) ew0Var6).rightMargin) + ew0Var6.t) < (i4 = rectN.right)) {
                                z(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                z(view4, 0);
                            }
                            rectN7.setEmpty();
                            qv3Var.a(rectN7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((ew0) view4.getLayoutParams()).i);
                    if (rect.equals(rectN2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((ew0) view4.getLayoutParams()).i.set(rectN2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        bw0 bw0Var3 = ((ew0) view5.getLayoutParams()).g;
                        if (bw0Var3 != null) {
                            bw0Var3.y(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectN3 = rect;
            arrayList2 = arrayList;
        }
    }

    @Override // defpackage.ig3
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        l(view, i, i2, i3, i4, 0, this.w);
    }

    @Override // defpackage.jg3
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        bw0 bw0Var;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ew0 ew0Var = (ew0) childAt.getLayoutParams();
                if (ew0Var.g(i5) && (bw0Var = ew0Var.g) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bw0Var.m(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    public final void o() {
        WeakHashMap weakHashMap = xk5.g;
        if (!getFitsSystemWindows()) {
            pk5.r(this, null);
            return;
        }
        fa4 fa4Var = this.d;
        if (fa4Var == null) {
            fa4Var = new fa4((Object) this, (byte) 10);
            this.d = fa4Var;
        }
        pk5.r(this, fa4Var);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.z) {
            if (this.u == null) {
                this.u = new fw0(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.h == null) {
            WeakHashMap weakHashMap = xk5.g;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.z && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        View view = this.p;
        if (view != null) {
            y(view, 0);
        }
        this.i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.f == null) {
            return;
        }
        tp5 tp5Var = this.h;
        int iN = tp5Var != null ? tp5Var.n() : 0;
        if (iN > 0) {
            this.f.setBounds(0, 0, getWidth(), iN);
            this.f.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        u(true);
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bw0 bw0Var;
        WeakHashMap weakHashMap = xk5.g;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((bw0Var = ((ew0) view.getLayoutParams()).g) == null || !bw0Var.l(this, view, layoutDirection))) {
                b(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        bw0 bw0Var;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zJ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.p();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            sp4 sp4Var = (sp4) coordinatorLayout.t.a;
            int i13 = sp4Var.a;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) sp4Var.t(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.z) {
            boolean z3 = coordinatorLayout.i;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.u == null) {
                        coordinatorLayout.u = new fw0(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.u);
                }
                coordinatorLayout.z = true;
            } else {
                if (z3 && coordinatorLayout.u != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.u);
                }
                coordinatorLayout.z = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = xk5.g;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.h != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.j;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                ew0 ew0Var = (ew0) view2.getLayoutParams();
                int i19 = ew0Var.v;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iQ = coordinatorLayout.q(i19);
                    int i20 = ew0Var.r;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iQ - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iR = coordinatorLayout.h.r() + coordinatorLayout.h.y();
                            int iG = coordinatorLayout.h.g() + coordinatorLayout.h.n();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iR, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iG, mode2);
                        }
                        bw0Var = ew0Var.g;
                        if (bw0Var != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zJ = bw0Var.j(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zJ) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iQ);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    bw0Var = ew0Var.g;
                    if (bw0Var != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zJ = bw0Var.j(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zJ) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                bw0Var = ew0Var.g;
                if (bw0Var != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zJ = bw0Var.j(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zJ) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin + ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ew0 ew0Var = (ew0) childAt.getLayoutParams();
                if (ew0Var.g(0)) {
                    bw0 bw0Var = ew0Var.g;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        bw0 bw0Var;
        int childCount = getChildCount();
        boolean zT = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ew0 ew0Var = (ew0) childAt.getLayoutParams();
                if (ew0Var.g(0) && (bw0Var = ew0Var.g) != null) {
                    zT |= bw0Var.t(view);
                }
            }
        }
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        r(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        j(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof gw0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gw0 gw0Var = (gw0) parcelable;
        super.onRestoreInstanceState(gw0Var.j);
        SparseArray sparseArray = gw0Var.a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            bw0 bw0Var = w(childAt).g;
            if (id != -1 && bw0Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bw0Var.w(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        gw0 gw0Var = new gw0(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            bw0 bw0Var = ((ew0) childAt.getLayoutParams()).g;
            if (id != -1 && bw0Var != null && (parcelableC = bw0Var.c(childAt)) != null) {
                sparseArray.append(id, parcelableC);
            }
        }
        gw0Var.a = sparseArray;
        return gw0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        y(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        boolean zS2;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.s == null) {
            zS = s(motionEvent, 1);
            if (!zS) {
                zS2 = false;
            }
            motionEventObtain = null;
            if (this.s == null) {
                zS2 |= super.onTouchEvent(motionEvent);
            } else if (zS) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zS2;
            }
            u(false);
            return zS2;
        }
        zS = false;
        bw0 bw0Var = ((ew0) this.s.getLayoutParams()).g;
        if (bw0Var != null) {
            zS2 = bw0Var.s(this.s, motionEvent);
        } else {
            zS2 = false;
        }
        motionEventObtain = null;
        if (this.s == null) {
            zS2 |= super.onTouchEvent(motionEvent);
        } else if (zS) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        u(false);
        return zS2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p():void");
    }

    public final int q(int i) {
        int[] iArr = this.b;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // defpackage.ig3
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        bw0 bw0Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ew0 ew0Var = (ew0) childAt.getLayoutParams();
                if (ew0Var.g(i3) && (bw0Var = ew0Var.g) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bw0Var.a(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        bw0 bw0Var = ((ew0) view.getLayoutParams()).g;
        if (bw0Var == null || !bw0Var.q(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.c) {
            return;
        }
        u(false);
        this.c = true;
    }

    public final boolean s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.a;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        fu1 fu1Var = D;
        if (fu1Var != null) {
            Collections.sort(arrayList, fu1Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zX = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            bw0 bw0Var = ((ew0) view.getLayoutParams()).g;
            if (zX && actionMasked != 0) {
                if (bw0Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bw0Var.x(this, view, motionEventObtain);
                    } else if (i == 1) {
                        bw0Var.s(view, motionEventObtain);
                    }
                }
            } else if (!zX && bw0Var != null) {
                if (i == 0) {
                    zX = bw0Var.x(this, view, motionEvent);
                } else if (i == 1) {
                    zX = bw0Var.s(view, motionEvent);
                }
                if (zX) {
                    this.s = view;
                }
            }
        }
        arrayList.clear();
        return zX;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        o();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.k = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f.setState(getDrawableState());
                }
                Drawable drawable3 = this.f;
                WeakHashMap weakHashMap = xk5.g;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f.setVisible(getVisibility() == 0, false);
                this.f.setCallback(this);
            }
            WeakHashMap weakHashMap2 = xk5.g;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f.setVisible(z, false);
    }

    public final ArrayList t(View view) {
        sp4 sp4Var = (sp4) this.t.a;
        int i = sp4Var.a;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) sp4Var.t(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sp4Var.x(i2));
            }
        }
        ArrayList arrayList3 = this.m;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void u(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            bw0 bw0Var = ((ew0) childAt.getLayoutParams()).g;
            if (bw0Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bw0Var.x(this, childAt, motionEventObtain);
                } else {
                    bw0Var.s(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((ew0) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.s = null;
        this.c = false;
    }

    public final void v(ew0 ew0Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ew0Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) ew0Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ew0Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) ew0Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f;
    }

    public final void x(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            il5.g(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // defpackage.ig3
    public final void y(View view, int i) {
        dn1 dn1Var = this.e;
        if (i == 1) {
            dn1Var.y = 0;
        } else {
            dn1Var.g = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ew0 ew0Var = (ew0) childAt.getLayoutParams();
            if (ew0Var.g(i)) {
                bw0 bw0Var = ew0Var.g;
                if (bw0Var != null) {
                    bw0Var.b(childAt, view, i);
                }
                if (i == 0) {
                    ew0Var.w = false;
                } else if (i == 1) {
                    ew0Var.c = false;
                }
            }
        }
        this.p = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ew0(getContext(), attributeSet);
    }
}
