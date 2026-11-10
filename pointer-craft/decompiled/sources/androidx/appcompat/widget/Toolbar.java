package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import defpackage.am;
import defpackage.cm;
import defpackage.d11;
import defpackage.dx1;
import defpackage.dz4;
import defpackage.en;
import defpackage.ga5;
import defpackage.h2;
import defpackage.ha5;
import defpackage.i43;
import defpackage.ia5;
import defpackage.ja5;
import defpackage.k33;
import defpackage.ka5;
import defpackage.km5;
import defpackage.l3;
import defpackage.la5;
import defpackage.ml;
import defpackage.n43;
import defpackage.o23;
import defpackage.oa5;
import defpackage.pb4;
import defpackage.r24;
import defpackage.ro;
import defpackage.s25;
import defpackage.wj;
import defpackage.xk5;
import defpackage.z3;
import defpackage.zy5;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    public pb4 A;
    public int B;
    public int C;
    public final int D;
    public CharSequence E;
    public CharSequence F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final int[] M;
    public final ro N;
    public ArrayList O;
    public final s25 P;
    public oa5 Q;
    public z3 R;
    public ia5 S;
    public boolean T;
    public wj U;
    public OnBackInvokedDispatcher V;
    public boolean W;
    public en a;
    public final ml a0;
    public View b;
    public final CharSequence c;
    public int d;
    public int e;
    public int f;
    public final int h;
    public am i;
    public ActionMenuView j;
    public int k;
    public am m;
    public final int o;
    public int p;
    public cm q;
    public Context s;
    public en t;
    public int u;
    public final Drawable w;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.D = 8388627;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new int[2];
        this.N = new ro(new ga5(this, (byte) 1));
        this.O = new ArrayList();
        this.P = new s25(this);
        this.a0 = new ml((Object) this, (byte) 14);
        Context context2 = getContext();
        int[] iArr = r24.f;
        ro roVarP = ro.P(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        xk5.m(this, context, iArr, attributeSet, (TypedArray) roVarP.t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) roVarP.t;
        this.u = typedArray.getResourceId(28, 0);
        this.z = typedArray.getResourceId(19, 0);
        this.D = typedArray.getInteger(0, 8388627);
        this.h = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.e = dimensionPixelOffset;
        this.d = dimensionPixelOffset;
        this.k = dimensionPixelOffset;
        this.f = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.k = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.d = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.e = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        n();
        pb4 pb4Var = this.A;
        pb4Var.j = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            pb4Var.v = dimensionPixelSize;
            pb4Var.g = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            pb4Var.x = dimensionPixelSize2;
            pb4Var.y = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            pb4Var.g(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.B = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.C = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.w = roVarP.h(4);
        this.c = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.s = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableH = roVarP.h(16);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableH2 = roVarP.h(11);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(roVarP.s(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(roVarP.s(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        roVarP.S();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new dz4(getContext());
    }

    public static ja5 j() {
        ja5 ja5Var = new ja5(-2, -2);
        ja5Var.y = (byte) 0;
        ja5Var.g = 8388627;
        return ja5Var;
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static ja5 t(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof ja5;
        if (z) {
            ja5 ja5Var = (ja5) layoutParams;
            ja5 ja5Var2 = new ja5(ja5Var);
            ja5Var2.y = (byte) 0;
            ja5Var2.y = ja5Var.y;
            return ja5Var2;
        }
        if (z) {
            ja5 ja5Var3 = new ja5((ja5) layoutParams);
            ja5Var3.y = (byte) 0;
            return ja5Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ja5 ja5Var4 = new ja5(layoutParams);
            ja5Var4.y = (byte) 0;
            return ja5Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ja5 ja5Var5 = new ja5(marginLayoutParams);
        ja5Var5.y = (byte) 0;
        ((ViewGroup.MarginLayoutParams) ja5Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) ja5Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) ja5Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) ja5Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return ja5Var5;
    }

    public final int a(View view, int i) {
        ja5 ja5Var = (ja5) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = ja5Var.g & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.D & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) ja5Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) ja5Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) ja5Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int b(View view, int i, int i2, int[] iArr) {
        ja5 ja5Var = (ja5) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ja5Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) ja5Var).leftMargin);
    }

    public final boolean c(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ja5);
    }

    public final void g(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ja5 ja5Var = (ja5) childAt.getLayoutParams();
                if (ja5Var.y == 0 && u(childAt)) {
                    int i3 = ja5Var.g;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            ja5 ja5Var2 = (ja5) childAt2.getLayoutParams();
            if (ja5Var2.y == 0 && u(childAt2)) {
                int i5 = ja5Var2.g;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ja5 ja5Var = new ja5(context, attributeSet);
        ja5Var.g = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.y);
        ja5Var.g = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ja5Var.y = (byte) 0;
        return ja5Var;
    }

    public CharSequence getCollapseContentDescription() {
        am amVar = this.i;
        if (amVar != null) {
            return amVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        am amVar = this.i;
        if (amVar != null) {
            return amVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        pb4 pb4Var = this.A;
        if (pb4Var != null) {
            return pb4Var.l ? pb4Var.g : pb4Var.y;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.C;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        pb4 pb4Var = this.A;
        if (pb4Var != null) {
            return pb4Var.g;
        }
        return 0;
    }

    public int getContentInsetRight() {
        pb4 pb4Var = this.A;
        if (pb4Var != null) {
            return pb4Var.y;
        }
        return 0;
    }

    public int getContentInsetStart() {
        pb4 pb4Var = this.A;
        if (pb4Var != null) {
            return pb4Var.l ? pb4Var.y : pb4Var.g;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.B;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i43 i43Var;
        ActionMenuView actionMenuView = this.j;
        return (actionMenuView == null || (i43Var = actionMenuView.f) == null || !i43Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.C, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        cm cmVar = this.q;
        if (cmVar != null) {
            return cmVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        cm cmVar = this.q;
        if (cmVar != null) {
            return cmVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        v();
        return this.j.getMenu();
    }

    public View getNavButtonView() {
        return this.m;
    }

    public CharSequence getNavigationContentDescription() {
        am amVar = this.m;
        if (amVar != null) {
            return amVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        am amVar = this.m;
        if (amVar != null) {
            return amVar.getDrawable();
        }
        return null;
    }

    public z3 getOuterActionMenuPresenter() {
        return this.R;
    }

    public Drawable getOverflowIcon() {
        v();
        return this.j.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.s;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public final TextView getSubtitleTextView() {
        return this.a;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.e;
    }

    public int getTitleMarginEnd() {
        return this.k;
    }

    public int getTitleMarginStart() {
        return this.f;
    }

    public int getTitleMarginTop() {
        return this.d;
    }

    public final TextView getTitleTextView() {
        return this.t;
    }

    public d11 getWrapper() {
        Drawable drawable;
        oa5 oa5Var = this.Q;
        if (oa5Var == null) {
            oa5Var = new oa5();
            oa5Var.c = 0;
            oa5Var.g = this;
            oa5Var.j = getTitle();
            oa5Var.t = getSubtitle();
            oa5Var.l = oa5Var.j != null;
            oa5Var.x = getNavigationIcon();
            ro roVarP = ro.P(R.attr.actionBarStyle, 0, getContext(), null, r24.g);
            TypedArray typedArray = (TypedArray) roVarP.t;
            oa5Var.i = roVarP.h(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                oa5Var.l = true;
                oa5Var.j = text;
                if ((oa5Var.y & 8) != 0) {
                    setTitle(text);
                    if (oa5Var.l) {
                        xk5.w(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                oa5Var.t = text2;
                if ((oa5Var.y & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableH = roVarP.h(20);
            if (drawableH != null) {
                oa5Var.v = drawableH;
                oa5Var.r();
            }
            Drawable drawableH2 = roVarP.h(17);
            if (drawableH2 != null) {
                oa5Var.n = drawableH2;
                oa5Var.r();
            }
            if (oa5Var.x == null && (drawable = oa5Var.i) != null) {
                oa5Var.x = drawable;
                if ((oa5Var.y & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            oa5Var.g(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = oa5Var.r;
                if (view != null && (oa5Var.y & 16) != 0) {
                    removeView(view);
                }
                oa5Var.r = viewInflate;
                if (viewInflate != null && (oa5Var.y & 16) != 0) {
                    addView(viewInflate);
                }
                oa5Var.g(oa5Var.y | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                n();
                this.A.g(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.u = resourceId2;
                en enVar = this.t;
                if (enVar != null) {
                    enVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.z = resourceId3;
                en enVar2 = this.a;
                if (enVar2 != null) {
                    enVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            roVarP.S();
            if (R.string.abc_action_bar_up_description != oa5Var.c) {
                oa5Var.c = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = oa5Var.c;
                    oa5Var.a = i != 0 ? getContext().getString(i) : null;
                    oa5Var.y();
                }
            }
            oa5Var.a = getNavigationContentDescription();
            setNavigationOnClickListener(new o23(oa5Var));
            this.Q = oa5Var;
        }
        return oa5Var;
    }

    public final int i(View view, int i, int i2, int[] iArr) {
        ja5 ja5Var = (ja5) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ja5Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) ja5Var).rightMargin + iMax;
    }

    public final void l() {
        if (this.m == null) {
            this.m = new am(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            ja5 ja5VarJ = j();
            ja5VarJ.g = (this.h & 112) | 8388611;
            this.m.setLayoutParams(ja5VarJ);
        }
    }

    public final void n() {
        if (this.A == null) {
            pb4 pb4Var = new pb4();
            pb4Var.g = 0;
            pb4Var.y = 0;
            pb4Var.r = Integer.MIN_VALUE;
            pb4Var.n = Integer.MIN_VALUE;
            pb4Var.v = 0;
            pb4Var.x = 0;
            pb4Var.l = false;
            pb4Var.j = false;
            this.A = pb4Var;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a0);
        z();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iB;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        en enVar;
        en enVar2;
        ja5 ja5Var;
        ja5 ja5Var2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int size3;
        int i23;
        int i24;
        int measuredWidth;
        int i25;
        int i26;
        int i27;
        int size4;
        cm cmVar;
        View view;
        ActionMenuView actionMenuView;
        am amVar;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.M;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = xk5.g;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (u(this.m)) {
            am amVar2 = this.m;
            if (z3) {
                iB = b(amVar2, i28, iMin2, iArr);
                i5 = paddingLeft;
            } else {
                i5 = i(amVar2, paddingLeft, iMin2, iArr);
            }
            if (u(this.i)) {
                amVar = this.i;
                if (z3) {
                    iB = b(amVar, iB, iMin2, iArr);
                } else {
                    i5 = i(amVar, i5, iMin2, iArr);
                }
            }
            if (u(this.j)) {
                actionMenuView = this.j;
                if (z3) {
                    i5 = i(actionMenuView, i5, iMin2, iArr);
                } else {
                    iB = b(actionMenuView, iB, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i5);
            iArr[1] = Math.max(0, currentContentInsetRight - (i28 - iB));
            iMax = Math.max(i5, currentContentInsetLeft);
            iMin = Math.min(iB, i28 - currentContentInsetRight);
            if (u(this.b)) {
                view = this.b;
                if (z3) {
                    iMin = b(view, iMin, iMin2, iArr);
                } else {
                    iMax = i(view, iMax, iMin2, iArr);
                }
            }
            if (u(this.q)) {
                cmVar = this.q;
                if (z3) {
                    iMin = b(cmVar, iMin, iMin2, iArr);
                } else {
                    iMax = i(cmVar, iMax, iMin2, iArr);
                }
            }
            zU = u(this.t);
            zU2 = u(this.a);
            if (zU) {
                ja5 ja5Var3 = (ja5) this.t.getLayoutParams();
                measuredHeight = this.t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ja5Var3).topMargin + ((ViewGroup.MarginLayoutParams) ja5Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                ja5 ja5Var4 = (ja5) this.a.getLayoutParams();
                measuredHeight = this.a.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ja5Var4).topMargin + ((ViewGroup.MarginLayoutParams) ja5Var4).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    enVar = this.t;
                } else {
                    enVar = this.a;
                }
                if (zU2) {
                    enVar2 = this.a;
                } else {
                    enVar2 = this.t;
                }
                ja5Var = (ja5) enVar.getLayoutParams();
                ja5Var2 = (ja5) enVar2.getLayoutParams();
                i6 = measuredHeight;
                z2 = (!zU && this.t.getMeasuredWidth() > 0) || (zU2 && this.a.getMeasuredWidth() > 0);
                i7 = this.D & 112;
                i8 = iMax;
                if (i7 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
                } else if (i7 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
                    if (iMax2 < i15) {
                        iMax2 = i15;
                    } else {
                        i16 = (((height - paddingBottom) - i6) - iMax2) - paddingTop2;
                        i17 = ((ViewGroup.MarginLayoutParams) ja5Var).bottomMargin;
                        i18 = this.e;
                        if (i16 < i17 + i18) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin + i18) - i16));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin) - this.e) - i6;
                }
                if (z3) {
                    if (z2) {
                        i12 = this.f;
                    } else {
                        i12 = 0;
                    }
                    int i29 = i12 - iArr[1];
                    iMin -= Math.max(0, i29);
                    iArr[1] = Math.max(0, -i29);
                    if (zU) {
                        ja5 ja5Var5 = (ja5) this.t.getLayoutParams();
                        int measuredWidth2 = iMin - this.t.getMeasuredWidth();
                        int measuredHeight2 = this.t.getMeasuredHeight() + paddingTop;
                        this.t.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth2 - this.k;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ja5Var5).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zU2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                        this.a.layout(iMin - this.a.getMeasuredWidth(), i30, iMin, this.a.getMeasuredHeight() + i30);
                        i14 = iMin - this.k;
                    } else {
                        i14 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i13, i14);
                    }
                    iMax = i8;
                } else {
                    if (z2) {
                        i9 = this.f;
                    } else {
                        i9 = 0;
                    }
                    int i31 = i9 - iArr[0];
                    iMax = Math.max(0, i31) + i8;
                    iArr[0] = Math.max(0, -i31);
                    if (zU) {
                        ja5 ja5Var6 = (ja5) this.t.getLayoutParams();
                        int measuredWidth3 = this.t.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.t.getMeasuredHeight() + paddingTop;
                        this.t.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i10 = measuredWidth3 + this.k;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) ja5Var6).bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (zU2) {
                        int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.a.getMeasuredWidth() + iMax;
                        this.a.layout(iMax, i32, measuredWidth4, this.a.getMeasuredHeight() + i32);
                        i11 = measuredWidth4 + this.k;
                    } else {
                        i11 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i10, i11);
                    }
                }
            }
            arrayList = this.K;
            g(3, arrayList);
            size = arrayList.size();
            i19 = iMax;
            for (i20 = 0; i20 < size; i20++) {
                i19 = i((View) arrayList.get(i20), i19, iMin2, iArr);
            }
            g(5, arrayList);
            size2 = arrayList.size();
            for (i21 = 0; i21 < size2; i21++) {
                iMin = b((View) arrayList.get(i21), iMin, iMin2, iArr);
            }
            g(1, arrayList);
            int i33 = iArr[0];
            i22 = iArr[1];
            size3 = arrayList.size();
            i23 = i33;
            i24 = 0;
            measuredWidth = 0;
            while (i24 < size3) {
                View view2 = (View) arrayList.get(i24);
                ja5 ja5Var7 = (ja5) view2.getLayoutParams();
                int i34 = i22;
                int i35 = ((ViewGroup.MarginLayoutParams) ja5Var7).leftMargin - i23;
                int i36 = ((ViewGroup.MarginLayoutParams) ja5Var7).rightMargin - i34;
                int iMax3 = Math.max(0, i35);
                int iMax4 = Math.max(0, i36);
                int iMax5 = Math.max(0, -i35);
                int iMax6 = Math.max(0, -i36);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i24++;
                i23 = iMax5;
                i22 = iMax6;
            }
            i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i27 = measuredWidth + i26;
            if (i26 >= i19) {
                if (i27 > iMin) {
                    i19 = i26 - (i27 - iMin);
                } else {
                    i19 = i26;
                }
            }
            size4 = arrayList.size();
            for (i25 = 0; i25 < size4; i25++) {
                i19 = i((View) arrayList.get(i25), i19, iMin2, iArr);
            }
            arrayList.clear();
        }
        i5 = paddingLeft;
        iB = i28;
        if (u(this.i)) {
            amVar = this.i;
            if (z3) {
                iB = b(amVar, iB, iMin2, iArr);
            } else {
                i5 = i(amVar, i5, iMin2, iArr);
            }
        }
        if (u(this.j)) {
            actionMenuView = this.j;
            if (z3) {
                i5 = i(actionMenuView, i5, iMin2, iArr);
            } else {
                iB = b(actionMenuView, iB, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - iB));
        iMax = Math.max(i5, currentContentInsetLeft2);
        iMin = Math.min(iB, i28 - currentContentInsetRight2);
        if (u(this.b)) {
            view = this.b;
            if (z3) {
                iMin = b(view, iMin, iMin2, iArr);
            } else {
                iMax = i(view, iMax, iMin2, iArr);
            }
        }
        if (u(this.q)) {
            cmVar = this.q;
            if (z3) {
                iMin = b(cmVar, iMin, iMin2, iArr);
            } else {
                iMax = i(cmVar, iMax, iMin2, iArr);
            }
        }
        zU = u(this.t);
        zU2 = u(this.a);
        if (zU) {
            ja5 ja5Var8 = (ja5) this.t.getLayoutParams();
            measuredHeight = this.t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ja5Var8).topMargin + ((ViewGroup.MarginLayoutParams) ja5Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            ja5 ja5Var9 = (ja5) this.a.getLayoutParams();
            measuredHeight = this.a.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ja5Var9).topMargin + ((ViewGroup.MarginLayoutParams) ja5Var9).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                enVar = this.t;
            } else {
                enVar = this.a;
            }
            if (zU2) {
                enVar2 = this.a;
            } else {
                enVar2 = this.t;
            }
            ja5Var = (ja5) enVar.getLayoutParams();
            ja5Var2 = (ja5) enVar2.getLayoutParams();
            i6 = measuredHeight;
            if (zU) {
            }
            i7 = this.D & 112;
            i8 = iMax;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
            } else if (i7 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
                if (iMax2 < i15) {
                    iMax2 = i15;
                } else {
                    i16 = (((height - paddingBottom) - i6) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) ja5Var).bottomMargin;
                    i18 = this.e;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin) - this.e) - i6;
            }
            if (z3) {
                if (z2) {
                    i12 = this.f;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zU) {
                    ja5 ja5Var10 = (ja5) this.t.getLayoutParams();
                    int measuredWidth5 = iMin - this.t.getMeasuredWidth();
                    int measuredHeight4 = this.t.getMeasuredHeight() + paddingTop;
                    this.t.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth5 - this.k;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) ja5Var10).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zU2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                    this.a.layout(iMin - this.a.getMeasuredWidth(), i37, iMin, this.a.getMeasuredHeight() + i37);
                    i14 = iMin - this.k;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = i8;
            } else {
                if (z2) {
                    i9 = this.f;
                } else {
                    i9 = 0;
                }
                int i38 = i9 - iArr[0];
                iMax = Math.max(0, i38) + i8;
                iArr[0] = Math.max(0, -i38);
                if (zU) {
                    ja5 ja5Var11 = (ja5) this.t.getLayoutParams();
                    int measuredWidth6 = this.t.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.t.getMeasuredHeight() + paddingTop;
                    this.t.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i10 = measuredWidth6 + this.k;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) ja5Var11).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zU2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.a.getMeasuredWidth() + iMax;
                    this.a.layout(iMax, i39, measuredWidth7, this.a.getMeasuredHeight() + i39);
                    i11 = measuredWidth7 + this.k;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        } else {
            if (zU) {
                enVar = this.t;
            } else {
                enVar = this.a;
            }
            if (zU2) {
                enVar2 = this.a;
            } else {
                enVar2 = this.t;
            }
            ja5Var = (ja5) enVar.getLayoutParams();
            ja5Var2 = (ja5) enVar2.getLayoutParams();
            i6 = measuredHeight;
            if (zU) {
            }
            i7 = this.D & 112;
            i8 = iMax;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
            } else if (i7 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i6) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) ja5Var).topMargin + this.d;
                if (iMax2 < i15) {
                    iMax2 = i15;
                } else {
                    i16 = (((height - paddingBottom) - i6) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) ja5Var).bottomMargin;
                    i18 = this.e;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) ja5Var2).bottomMargin) - this.e) - i6;
            }
            if (z3) {
                if (z2) {
                    i12 = this.f;
                } else {
                    i12 = 0;
                }
                int i211 = i12 - iArr[1];
                iMin -= Math.max(0, i211);
                iArr[1] = Math.max(0, -i211);
                if (zU) {
                    ja5 ja5Var12 = (ja5) this.t.getLayoutParams();
                    int measuredWidth8 = iMin - this.t.getMeasuredWidth();
                    int measuredHeight6 = this.t.getMeasuredHeight() + paddingTop;
                    this.t.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth8 - this.k;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) ja5Var12).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zU2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                    this.a.layout(iMin - this.a.getMeasuredWidth(), i310, iMin, this.a.getMeasuredHeight() + i310);
                    i14 = iMin - this.k;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = i8;
            } else {
                if (z2) {
                    i9 = this.f;
                } else {
                    i9 = 0;
                }
                int i311 = i9 - iArr[0];
                iMax = Math.max(0, i311) + i8;
                iArr[0] = Math.max(0, -i311);
                if (zU) {
                    ja5 ja5Var13 = (ja5) this.t.getLayoutParams();
                    int measuredWidth9 = this.t.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.t.getMeasuredHeight() + paddingTop;
                    this.t.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i10 = measuredWidth9 + this.k;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) ja5Var13).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zU2) {
                    int i312 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ja5) this.a.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.a.getMeasuredWidth() + iMax;
                    this.a.layout(iMax, i312, measuredWidth10, this.a.getMeasuredHeight() + i312);
                    i11 = measuredWidth10 + this.k;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        }
        arrayList = this.K;
        g(3, arrayList);
        size = arrayList.size();
        i19 = iMax;
        while (i20 < size) {
            i19 = i((View) arrayList.get(i20), i19, iMin2, iArr);
        }
        g(5, arrayList);
        size2 = arrayList.size();
        while (i21 < size2) {
            iMin = b((View) arrayList.get(i21), iMin, iMin2, iArr);
        }
        g(1, arrayList);
        int i313 = iArr[0];
        i22 = iArr[1];
        size3 = arrayList.size();
        i23 = i313;
        i24 = 0;
        measuredWidth = 0;
        while (i24 < size3) {
            View view3 = (View) arrayList.get(i24);
            ja5 ja5Var14 = (ja5) view3.getLayoutParams();
            int i314 = i22;
            int i315 = ((ViewGroup.MarginLayoutParams) ja5Var14).leftMargin - i23;
            int i316 = ((ViewGroup.MarginLayoutParams) ja5Var14).rightMargin - i314;
            int iMax7 = Math.max(0, i315);
            int iMax8 = Math.max(0, i316);
            int iMax9 = Math.max(0, -i315);
            int iMax10 = Math.max(0, -i316);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i24++;
            i23 = iMax9;
            i22 = iMax10;
        }
        i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i27 = measuredWidth + i26;
        if (i26 >= i19) {
            if (i27 > iMin) {
                i19 = i26 - (i27 - iMin);
            } else {
                i19 = i26;
            }
        }
        size4 = arrayList.size();
        while (i25 < size4) {
            i19 = i((View) arrayList.get(i25), i19, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM;
        int iMax;
        int iCombineMeasuredStates;
        int iM2;
        int iQ;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = km5.g;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (u(this.m)) {
            p(this.m, i, 0, i2, this.o);
            iM = m(this.m) + this.m.getMeasuredWidth();
            iMax = Math.max(0, q(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.m.getMeasuredState());
        } else {
            iM = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.i)) {
            p(this.i, i, 0, i2, this.o);
            iM = m(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(iMax, q(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM);
        int iMax4 = Math.max(0, currentContentInsetStart - iM);
        Object[] objArr2 = objArr;
        int[] iArr = this.M;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.j)) {
            p(this.j, i, iMax3, i2, this.o);
            iM2 = m(this.j) + this.j.getMeasuredWidth();
            iMax = Math.max(iMax, q(this.j) + this.j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        } else {
            iM2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM2);
        if (u(this.b)) {
            iMax5 += s(this.b, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, q(this.b) + this.b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
        }
        if (u(this.q)) {
            iMax5 += s(this.q, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, q(this.q) + this.q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((ja5) childAt.getLayoutParams()).y == 0 && u(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, q(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.d + this.e;
        int i7 = this.f + this.k;
        if (u(this.t)) {
            s(this.t, i, i5 + i7, i2, i6, iArr);
            int iM3 = m(this.t) + this.t.getMeasuredWidth();
            iQ = q(this.t) + this.t.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.t.getMeasuredState());
            iMax2 = iM3;
        } else {
            iQ = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.a)) {
            iMax2 = Math.max(iMax2, s(this.a, i, i5 + i7, i2, iQ + i6, iArr));
            iQ += q(this.a) + this.a.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.a.getMeasuredState());
        }
        if (u(this.t) || u(this.a)) {
            iQ += i6;
        }
        int iMax7 = Math.max(iMax, iQ);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.T) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof la5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        la5 la5Var = (la5) parcelable;
        super.onRestoreInstanceState(la5Var.j);
        ActionMenuView actionMenuView = this.j;
        i43 i43Var = actionMenuView != null ? actionMenuView.f : null;
        int i = la5Var.a;
        if (i != 0 && this.S != null && i43Var != null && (menuItemFindItem = i43Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (la5Var.m) {
            ml mlVar = this.a0;
            removeCallbacks(mlVar);
            post(mlVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        n();
        pb4 pb4Var = this.A;
        boolean z = i == 1;
        if (z == pb4Var.l) {
            return;
        }
        pb4Var.l = z;
        if (!pb4Var.j) {
            pb4Var.g = pb4Var.v;
            pb4Var.y = pb4Var.x;
            return;
        }
        if (z) {
            int i2 = pb4Var.n;
            if (i2 == Integer.MIN_VALUE) {
                i2 = pb4Var.v;
            }
            pb4Var.g = i2;
            int i3 = pb4Var.r;
            if (i3 == Integer.MIN_VALUE) {
                i3 = pb4Var.x;
            }
            pb4Var.y = i3;
            return;
        }
        int i4 = pb4Var.r;
        if (i4 == Integer.MIN_VALUE) {
            i4 = pb4Var.v;
        }
        pb4Var.g = i4;
        int i5 = pb4Var.n;
        if (i5 == Integer.MIN_VALUE) {
            i5 = pb4Var.x;
        }
        pb4Var.y = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z3 z3Var;
        n43 n43Var;
        la5 la5Var = new la5(super.onSaveInstanceState());
        ia5 ia5Var = this.S;
        if (ia5Var != null && (n43Var = ia5Var.t) != null) {
            la5Var.a = n43Var.g;
        }
        ActionMenuView actionMenuView = this.j;
        la5Var.m = (actionMenuView == null || (z3Var = actionMenuView.A) == null || !z3Var.j()) ? false : true;
        return la5Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    public final void p(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void r() {
        if (this.i == null) {
            am amVar = new am(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = amVar;
            amVar.setImageDrawable(this.w);
            this.i.setContentDescription(this.c);
            ja5 ja5VarJ = j();
            ja5VarJ.g = (this.h & 112) | 8388611;
            ja5VarJ.y = (byte) 2;
            this.i.setLayoutParams(ja5VarJ);
            this.i.setOnClickListener(new l3(this, (byte) 3));
        }
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.W != z) {
            this.W = z;
            z();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            r();
        }
        am amVar = this.i;
        if (amVar != null) {
            amVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            r();
            this.i.setImageDrawable(drawable);
        } else {
            am amVar = this.i;
            if (amVar != null) {
                amVar.setImageDrawable(this.w);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.T = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.C) {
            this.C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.B) {
            this.B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        cm cmVar = this.q;
        if (drawable != null) {
            if (cmVar == null) {
                cmVar = new cm(getContext(), null, 0);
                this.q = cmVar;
            }
            if (!c(cmVar)) {
                y(this.q, true);
            }
        } else if (cmVar != null && c(cmVar)) {
            removeView(this.q);
            this.L.remove(this.q);
        }
        cm cmVar2 = this.q;
        if (cmVar2 != null) {
            cmVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.q == null) {
            this.q = new cm(getContext(), null, 0);
        }
        cm cmVar = this.q;
        if (cmVar != null) {
            cmVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        am amVar = this.m;
        if (amVar != null) {
            amVar.setContentDescription(charSequence);
            zy5.y(this.m, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!c(this.m)) {
                y(this.m, true);
            }
        } else {
            am amVar = this.m;
            if (amVar != null && c(amVar)) {
                removeView(this.m);
                this.L.remove(this.m);
            }
        }
        am amVar2 = this.m;
        if (amVar2 != null) {
            amVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.m.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        v();
        this.j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p != i) {
            this.p = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        en enVar = this.a;
        if (!zIsEmpty) {
            if (enVar == null) {
                Context context = getContext();
                en enVar2 = new en(context, null);
                this.a = enVar2;
                enVar2.setSingleLine();
                this.a.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z;
                if (i != 0) {
                    this.a.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.a.setTextColor(colorStateList);
                }
            }
            if (!c(this.a)) {
                y(this.a, true);
            }
        } else if (enVar != null && c(enVar)) {
            removeView(this.a);
            this.L.remove(this.a);
        }
        en enVar3 = this.a;
        if (enVar3 != null) {
            enVar3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        en enVar = this.a;
        if (enVar != null) {
            enVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        en enVar = this.t;
        if (!zIsEmpty) {
            if (enVar == null) {
                Context context = getContext();
                en enVar2 = new en(context, null);
                this.t = enVar2;
                enVar2.setSingleLine();
                this.t.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.u;
                if (i != 0) {
                    this.t.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.t.setTextColor(colorStateList);
                }
            }
            if (!c(this.t)) {
                y(this.t, true);
            }
        } else if (enVar != null && c(enVar)) {
            removeView(this.t);
            this.L.remove(this.t);
        }
        en enVar3 = this.t;
        if (enVar3 != null) {
            enVar3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.e = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.k = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.d = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        en enVar = this.t;
        if (enVar != null) {
            enVar.setTextColor(colorStateList);
        }
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void v() {
        x();
        ActionMenuView actionMenuView = this.j;
        if (actionMenuView.f == null) {
            i43 i43Var = (i43) actionMenuView.getMenu();
            if (this.S == null) {
                this.S = new ia5(this);
            }
            this.j.setExpandedActionViewsExclusive(true);
            i43Var.r(this.S, this.s);
            z();
        }
    }

    public final void w() {
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.N.m).iterator();
        while (it.hasNext()) {
            ((dx1) it.next()).g.q(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.O = currentMenuItems2;
    }

    public final void x() {
        if (this.j == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.j = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.j.setOnMenuItemClickListener(this.P);
            ActionMenuView actionMenuView2 = this.j;
            ha5 ha5Var = new ha5((Object) this, (byte) 0);
            actionMenuView2.getClass();
            actionMenuView2.B = ha5Var;
            ja5 ja5VarJ = j();
            ja5VarJ.g = (this.h & 112) | 8388613;
            this.j.setLayoutParams(ja5VarJ);
            y(this.j, false);
        }
    }

    public final void y(View view, boolean z) {
        ja5 ja5VarT;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja5VarT = j();
        } else {
            ja5VarT = !checkLayoutParams(layoutParams) ? t(layoutParams) : (ja5) layoutParams;
        }
        ja5VarT.y = (byte) 1;
        if (!z || this.b == null) {
            addView(view, ja5VarT);
        } else {
            view.setLayoutParams(ja5VarT);
            this.L.add(view);
        }
    }

    public final void z() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherY = h2.y(this);
            ia5 ia5Var = this.S;
            boolean z = (ia5Var == null || ia5Var.t == null || onBackInvokedDispatcherY == null || !isAttachedToWindow() || !this.W) ? false : true;
            if (!z || this.V != null) {
                if (z || (onBackInvokedDispatcher = this.V) == null) {
                    return;
                }
                h2.p(onBackInvokedDispatcher, this.U);
                this.V = null;
                return;
            }
            wj wjVar = this.U;
            if (wjVar == null) {
                wj wjVar2 = new wj(new ga5(this, (byte) 0), (byte) 2);
                this.U = wjVar2;
                wjVar = wjVar2;
            }
            h2.s(onBackInvokedDispatcherY, wjVar);
            this.V = onBackInvokedDispatcherY;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(k33.J(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return t(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(k33.J(getContext(), i));
    }

    public void setOnMenuItemClickListener(ka5 ka5Var) {
    }

    public void setLogo(int i) {
        setLogo(k33.J(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
