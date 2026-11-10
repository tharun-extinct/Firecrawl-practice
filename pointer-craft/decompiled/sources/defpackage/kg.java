package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kg extends ViewGroup {
    public final HashMap j;
    public final HashMap t;

    public kg(Context context) {
        super(context);
        setClipChildren(false);
        this.j = new HashMap();
        this.t = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<dg, um2> getHolderToLayoutNode() {
        return this.j;
    }

    public final HashMap<um2, dg> getLayoutNodeToHolder() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (dg dgVar : this.j.keySet()) {
            dgVar.layout(dgVar.getLeft(), dgVar.getTop(), dgVar.getRight(), dgVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            mc2.g("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            mc2.g("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (dg dgVar : this.j.keySet()) {
            int i4 = dgVar.C;
            if (i4 != Integer.MIN_VALUE && (i3 = dgVar.D) != Integer.MIN_VALUE) {
                dgVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            um2 um2Var = (um2) this.j.get(childAt);
            if (childAt.isLayoutRequested() && um2Var != null) {
                um2.X(um2Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
