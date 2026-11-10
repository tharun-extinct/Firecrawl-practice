package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.a4;
import defpackage.en;
import defpackage.g53;
import defpackage.h43;
import defpackage.i43;
import defpackage.n43;
import defpackage.r24;
import defpackage.u3;
import defpackage.v3;
import defpackage.zy5;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuItemView extends en implements g53, View.OnClickListener, a4 {
    public n43 b;
    public int d;
    public final int e;
    public boolean f;
    public v3 h;
    public final int k;
    public boolean o;
    public Drawable p;
    public CharSequence s;
    public h43 u;
    public u3 z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.o = j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.r, 0, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.e = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.d = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.a4
    public final boolean g() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.g53
    public n43 getItemData() {
        return this.b;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h43 h43Var = this.u;
        if (h43Var != null) {
            h43Var.g(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o = j();
        t();
    }

    @Override // defpackage.en, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.d) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.k;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u3 u3Var;
        if (this.b.hasSubMenu() && (u3Var = this.z) != null && u3Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.g53
    public final void r(n43 n43Var) {
        this.b = n43Var;
        setIcon(n43Var.getIcon());
        setTitle(n43Var.getTitleCondensed());
        setId(n43Var.g);
        setVisibility(n43Var.isVisible() ? 0 : 8);
        setEnabled(n43Var.isEnabled());
        if (n43Var.hasSubMenu() && this.z == null) {
            this.z = new u3(this);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f != z) {
            this.f = z;
            n43 n43Var = this.b;
            if (n43Var != null) {
                i43 i43Var = n43Var.c;
                i43Var.m = true;
                i43Var.s(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.e;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(h43 h43Var) {
        this.u = h43Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.d = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(v3 v3Var) {
        this.h = v3Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.s = charSequence;
        t();
    }

    public final void t() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.s);
        if (this.p != null && ((this.b.d & 4) != 4 || (!this.o && !this.f))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.s : null);
        CharSequence charSequence = this.b.s;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.b.v);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.b.p;
        if (TextUtils.isEmpty(charSequence2)) {
            zy5.y(this, z3 ? null : this.b.v);
        } else {
            zy5.y(this, charSequence2);
        }
    }

    @Override // defpackage.a4
    public final boolean y() {
        return !TextUtils.isEmpty(getText()) && this.b.getIcon() == null;
    }
}
