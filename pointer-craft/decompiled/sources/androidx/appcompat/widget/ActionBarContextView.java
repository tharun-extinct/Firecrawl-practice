package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bm5;
import defpackage.d4;
import defpackage.h53;
import defpackage.i43;
import defpackage.k33;
import defpackage.km5;
import defpackage.l0;
import defpackage.l3;
import defpackage.n;
import defpackage.r24;
import defpackage.w3;
import defpackage.xk5;
import defpackage.z3;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContextView extends ViewGroup {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public ActionMenuView a;
    public CharSequence b;
    public boolean c;
    public final int d;
    public boolean e;
    public TextView f;
    public LinearLayout h;
    public boolean i;
    public final n j;
    public final int k;
    public z3 m;
    public TextView o;
    public View p;
    public int q;
    public CharSequence s;
    public final Context t;
    public View u;
    public bm5 w;
    public View z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.j = new n(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.t = context;
        } else {
            this.t = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.n, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : k33.J(context, resourceId));
        this.k = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.q = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
        this.E = getPaddingLeft();
        this.F = getPaddingTop();
        this.G = getPaddingRight();
        this.H = getPaddingBottom();
    }

    public static int j(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public static int x(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            bm5 bm5Var = this.w;
            if (bm5Var != null) {
                bm5Var.y();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.w != null ? this.j.y : getVisibility();
    }

    public int getContentHeight() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.s;
    }

    public CharSequence getTitle() {
        return this.b;
    }

    public final void l(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, r24.g, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        z3 z3Var = this.m;
        if (z3Var != null) {
            Configuration configuration2 = z3Var.t.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            z3Var.h = i;
            i43 i43Var = z3Var.a;
            if (i43Var != null) {
                i43Var.s(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bm5 m(int i, long j) {
        bm5 bm5Var = this.w;
        if (bm5Var != null) {
            bm5Var.y();
        }
        n nVar = this.j;
        if (i != 0) {
            bm5 bm5VarG = xk5.g(this);
            bm5VarG.g(0.0f);
            bm5VarG.r(j);
            nVar.r.w = bm5VarG;
            nVar.y = i;
            bm5VarG.n(nVar);
            return bm5VarG;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        bm5 bm5VarG2 = xk5.g(this);
        bm5VarG2.g(1.0f);
        bm5VarG2.r(j);
        nVar.r.w = bm5VarG2;
        nVar.y = i;
        bm5VarG2.n(nVar);
        return bm5VarG2;
    }

    public final void n() {
        if (this.h == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.h = linearLayout;
            this.o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f = (TextView) this.h.findViewById(R.id.action_bar_subtitle);
            int i = this.k;
            if (i != 0) {
                this.o.setTextAppearance(getContext(), i);
            }
            int i2 = this.d;
            if (i2 != 0) {
                this.f.setTextAppearance(getContext(), i2);
            }
        }
        this.o.setText(this.b);
        this.f.setText(this.s);
        boolean zIsEmpty = TextUtils.isEmpty(this.b);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.s);
        this.f.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.h.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.h.getParent() == null) {
            addView(this.h);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        l(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, r24.n, R.attr.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3 z3Var = this.m;
        if (z3Var != null) {
            z3Var.r();
            w3 w3Var = this.m.d;
            if (w3Var == null || !w3Var.y()) {
                return;
            }
            w3Var.a.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = km5.g;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iJ = j(this.p, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iJ - i6 : iJ + i6;
        }
        LinearLayout linearLayout = this.h;
        if (linearLayout != null && this.z == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(this.h, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.z;
        if (view2 != null) {
            j(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            j(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            l0.z(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            l0.z(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.q;
        int size2 = i3 > 0 ? i3 + this.C : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.p;
        if (view != null) {
            int iX = x(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            paddingLeft = iX - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = x(this.a, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.h;
        if (linearLayout != null && this.z == null) {
            if (this.e) {
                this.h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.h.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.h.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = x(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.z;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.z.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.q > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
        }
        if (!this.c) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.c = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.c = false;
        return true;
    }

    public final void q() {
        super.setPadding(this.B + this.E, this.C + this.F, this.D + this.G, this.H);
    }

    public final void r(d4 d4Var) {
        View view = this.p;
        byte b = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A, (ViewGroup) this, false);
            this.p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View viewFindViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.u = viewFindViewById;
        viewFindViewById.setOnClickListener(new l3(d4Var, b));
        i43 i43VarR = d4Var.r();
        z3 z3Var = this.m;
        if (z3Var != null) {
            z3Var.r();
            w3 w3Var = z3Var.d;
            if (w3Var != null && w3Var.y()) {
                w3Var.a.dismiss();
            }
        }
        z3 z3Var2 = new z3(getContext());
        this.m = z3Var2;
        z3Var2.s = true;
        z3Var2.p = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        i43VarR.r(this.m, this.t);
        z3 z3Var3 = this.m;
        h53 h53Var = z3Var3.w;
        if (h53Var == null) {
            h53 h53Var2 = (h53) z3Var3.m.inflate(R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            z3Var3.w = h53Var2;
            h53Var2.y(z3Var3.a);
            z3Var3.l();
        }
        h53 h53Var3 = z3Var3.w;
        if (h53Var != h53Var3) {
            ((ActionMenuView) h53Var3).setPresenter(z3Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) h53Var3;
        this.a = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.a, layoutParams);
    }

    public void setContentHeight(int i) {
        this.q = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.z;
        if (view2 != null) {
            removeView(view2);
        }
        this.z = view;
        if (view != null && (linearLayout = this.h) != null) {
            removeView(linearLayout);
            this.h = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = i4;
        q();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.E = i;
            this.G = i3;
        } else {
            this.E = i3;
            this.G = i;
        }
        this.F = i2;
        this.H = i4;
        q();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.s = charSequence;
        n();
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        n();
        xk5.w(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.e) {
            requestLayout();
        }
        this.e = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(int i, int i2, int i3) {
        this.B = i;
        this.C = i2;
        this.D = i3;
        q();
    }

    public final void v() {
        removeAllViews();
        this.z = null;
        this.a = null;
        this.m = null;
        View view = this.u;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
