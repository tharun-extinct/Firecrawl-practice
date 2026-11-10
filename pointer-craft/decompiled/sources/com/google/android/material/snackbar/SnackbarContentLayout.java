package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.lr2;
import defpackage.qi;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {
    public Button a;
    public TextView j;
    public int m;
    public Button t;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lr2.E(context, R.attr.motionEasingEmphasizedInterpolator, qi.y);
    }

    public final boolean g(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.j.getPaddingTop() == i2 && this.j.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.j;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.t;
    }

    public Button getCloseView() {
        return this.a;
    }

    public TextView getMessageView() {
        return this.j;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.j = (TextView) findViewById(R.id.snackbar_text);
        this.t = (Button) findViewById(R.id.snackbar_action);
        this.a = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.j.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.m <= 0 || this.t.getMeasuredWidth() <= this.m) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!g(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!g(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.m = i;
    }
}
