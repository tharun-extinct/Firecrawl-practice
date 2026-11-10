package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.dv2;
import defpackage.g53;
import defpackage.n43;
import defpackage.s23;
import defpackage.x74;
import defpackage.xk5;
import defpackage.zv1;
import defpackage.zy5;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends zv1 implements g53 {
    public static final int[] N = {R.attr.state_checked};
    public int C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public final CheckedTextView G;
    public FrameLayout H;
    public n43 I;
    public ColorStateList J;
    public boolean K;
    public Drawable L;
    public final s23 M;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = true;
        s23 s23Var = new s23(this, (byte) 1);
        this.M = s23Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(io.appground.blek.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(io.appground.blek.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(io.appground.blek.R.id.design_menu_item_text);
        this.G = checkedTextView;
        xk5.q(checkedTextView, s23Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.H == null) {
                this.H = (FrameLayout) ((ViewStub) findViewById(io.appground.blek.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.H.removeAllViews();
            this.H.addView(view);
        }
    }

    @Override // defpackage.g53
    public n43 getItemData() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        n43 n43Var = this.I;
        if (n43Var != null && n43Var.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.g53
    public final void r(n43 n43Var) {
        StateListDrawable stateListDrawable;
        this.I = n43Var;
        int i = n43Var.g;
        if (i > 0) {
            setId(i);
        }
        setVisibility(n43Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(io.appground.blek.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(N, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(n43Var.isCheckable());
        setChecked(n43Var.isChecked());
        setEnabled(n43Var.isEnabled());
        setTitle(n43Var.v);
        setIcon(n43Var.getIcon());
        setActionView(n43Var.getActionView());
        setContentDescription(n43Var.s);
        zy5.y(this, n43Var.p);
        n43 n43Var2 = this.I;
        CharSequence charSequence = n43Var2.v;
        CheckedTextView checkedTextView = this.G;
        if (charSequence == null && n43Var2.getIcon() == null && this.I.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.H;
            if (frameLayout != null) {
                dv2 dv2Var = (dv2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) dv2Var).width = -1;
                this.H.setLayoutParams(dv2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.H;
        if (frameLayout2 != null) {
            dv2 dv2Var2 = (dv2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) dv2Var2).width = -2;
            this.H.setLayoutParams(dv2Var2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.E != z) {
            this.E = z;
            this.M.j(this.G, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.G;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.F) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.K) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.J);
            }
            int i = this.C;
            drawable.setBounds(0, 0, i, i);
        } else if (this.D) {
            if (this.L == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = x74.g;
                Drawable drawable2 = resources.getDrawable(io.appground.blek.R.drawable.navigation_empty_icon, theme);
                this.L = drawable2;
                if (drawable2 != null) {
                    int i2 = this.C;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.L;
        }
        this.G.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.G.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.C = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.J = colorStateList;
        this.K = colorStateList != null;
        n43 n43Var = this.I;
        if (n43Var != null) {
            setIcon(n43Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.G.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.D = z;
    }

    public void setTextAppearance(int i) {
        this.G.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.G.setText(charSequence);
    }
}
