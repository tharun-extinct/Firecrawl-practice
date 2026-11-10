package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l91 extends d implements jj3 {
    public boolean h;
    public boolean o;
    public final tp3 p;
    public final Window s;
    public boolean u;
    public boolean z;

    public l91(Context context, Window window) {
        super(context, null);
        this.s = window;
        this.p = kq2.M(xx5.g);
        WeakHashMap weakHashMap = xk5.g;
        pk5.r(this, this);
        yo5.g(this, new k91(this));
    }

    @Override // defpackage.d
    public final void g(int i, h02 h02Var) {
        h02Var.Z(1735448596);
        int i2 = (h02Var.j(this) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((bz1) this.p.getValue()).l(h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(this, i, (byte) 7);
        }
    }

    @Override // defpackage.d
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // defpackage.d
    public final void j(int i, int i2) {
        int iG;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.j(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.s;
        if (mode != Integer.MIN_VALUE || this.u || window.getAttributes().height != -2) {
            iG = size2;
        } else if (this.z) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iG = qj.g.g(window);
            } else if (i3 < 32) {
                iG = tj.g.g(window);
            } else {
                iG = size2;
            }
        } else {
            iG = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iG - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.z || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.u) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // defpackage.d
    public final void l(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.jj3
    public final tp5 t(View view, tp5 tp5Var) {
        if (!this.z) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return tp5Var.g.p(iMax, iMax2, iMax3, iMax4);
            }
        }
        return tp5Var;
    }
}
