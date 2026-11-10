package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.am5;
import defpackage.ew0;
import defpackage.js2;
import defpackage.p24;
import defpackage.xk5;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends am5 {
    public final int y;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.D);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // defpackage.bw0
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        u(coordinatorLayout.t(view));
        return false;
    }

    @Override // defpackage.bw0
    public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((ew0) view2.getLayoutParams()).g instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.y;
            int iL = bottom - (i == 0 ? 0 : js2.l((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = xk5.g;
            view.offsetTopAndBottom(iL);
        }
        return false;
    }

    @Override // defpackage.am5
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i) {
        u(coordinatorLayout.t(view));
        coordinatorLayout.b(view, i);
    }

    @Override // defpackage.bw0
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        u(coordinatorLayout.t(view));
        return false;
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    @Override // defpackage.bw0
    public final void y(View view) {
    }
}
