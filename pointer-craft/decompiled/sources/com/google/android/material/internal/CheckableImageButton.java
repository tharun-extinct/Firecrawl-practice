package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.am;
import defpackage.qd0;
import defpackage.rd0;
import defpackage.sd0;
import defpackage.xk5;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends am implements Checkable {
    public static final int[] i = {R.attr.state_checked};
    public rd0 c;
    public boolean m;
    public boolean q;
    public boolean w;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.appground.blek.R.attr.imageButtonStyle);
        this.q = true;
        this.w = true;
        xk5.q(this, new qd0(this, (byte) 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.m ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), i) : super.onCreateDrawableState(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.c = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sd0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sd0 sd0Var = (sd0) parcelable;
        super.onRestoreInstanceState(sd0Var.j);
        setChecked(sd0Var.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        sd0 sd0Var = new sd0(super.onSaveInstanceState());
        sd0Var.a = this.m;
        return sd0Var;
    }

    public void setCheckable(boolean z) {
        if (this.q != z) {
            this.q = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.q || this.m == z) {
            return;
        }
        this.m = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        rd0 rd0Var;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (rd0Var = this.c) == null) {
            return;
        }
        rd0Var.g();
    }

    public void setOnFocusableChangedListener(rd0 rd0Var) {
        this.c = rd0Var;
    }

    public void setPressable(boolean z) {
        this.w = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.w) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m);
    }
}
