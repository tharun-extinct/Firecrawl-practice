package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pm extends sw2 implements rm {
    public CharSequence J;
    public mm K;
    public final Rect L;
    public int M;
    public final /* synthetic */ sm N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(sm smVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.N = smVar;
        this.L = new Rect();
        this.o = smVar;
        this.F = true;
        this.G.setFocusable(true);
        this.f = new nm(this, (byte) 0);
    }

    @Override // defpackage.rm
    public final void a(int i) {
        this.M = i;
    }

    @Override // defpackage.sw2, defpackage.rm
    public final void b(ListAdapter listAdapter) {
        super.b(listAdapter);
        this.K = (mm) listAdapter;
    }

    @Override // defpackage.rm
    public final CharSequence i() {
        return this.J;
    }

    @Override // defpackage.rm
    public final void q(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        em emVar = this.G;
        boolean zIsShowing = emVar.isShowing();
        u();
        emVar.setInputMethodMode(2);
        r();
        ef1 ef1Var = this.a;
        ef1Var.setChoiceMode(1);
        ef1Var.setTextDirection(i);
        ef1Var.setTextAlignment(i2);
        sm smVar = this.N;
        int selectedItemPosition = smVar.getSelectedItemPosition();
        ef1 ef1Var2 = this.a;
        if (emVar.isShowing() && ef1Var2 != null) {
            ef1Var2.setListSelectionHidden(false);
            ef1Var2.setSelection(selectedItemPosition);
            if (ef1Var2.getChoiceMode() != 0) {
                ef1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = smVar.getViewTreeObserver()) == null) {
            return;
        }
        km kmVar = new km(this, (byte) 1);
        viewTreeObserver.addOnGlobalLayoutListener(kmVar);
        emVar.setOnDismissListener(new om(this, kmVar));
    }

    public final void u() {
        int i;
        em emVar = this.G;
        Drawable background = emVar.getBackground();
        sm smVar = this.N;
        Rect rect = smVar.i;
        if (background != null) {
            background.getPadding(rect);
            boolean z = km5.g;
            i = smVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = smVar.getPaddingLeft();
        int paddingRight = smVar.getPaddingRight();
        int width = smVar.getWidth();
        int i2 = smVar.c;
        if (i2 == -2) {
            int iG = smVar.g(this.K, emVar.getBackground());
            int i3 = (smVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iG > i3) {
                iG = i3;
            }
            p(Math.max(iG, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i2);
        }
        boolean z2 = km5.g;
        this.w = smVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.q) - this.M) + i : paddingLeft + this.M + i;
    }

    @Override // defpackage.rm
    public final void v(CharSequence charSequence) {
        this.J = charSequence;
    }
}
