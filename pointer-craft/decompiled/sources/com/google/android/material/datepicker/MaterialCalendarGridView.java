package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.b33;
import defpackage.fa4;
import defpackage.fn4;
import defpackage.mq2;
import defpackage.p23;
import defpackage.q70;
import defpackage.u23;
import defpackage.v73;
import defpackage.xk5;
import defpackage.zh5;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean j;
    public fa4 t;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        zh5.r(null);
        if (b33.U(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(io.appground.blek.R.id.cancel_button);
            setNextFocusRightId(io.appground.blek.R.id.confirm_button);
        }
        this.j = b33.U(getContext(), io.appground.blek.R.attr.nestedScrollable);
        xk5.q(this, new p23((byte) 2));
    }

    public static void g(MaterialCalendarGridView materialCalendarGridView) {
        v73 v73Var = (v73) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f;
        if (mq2.z(context.getTheme(), io.appground.blek.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            q70 q70Var = v73Var.y;
            if (q70Var != null) {
                focusRingDrawable.o.z = (fn4) ((fa4) q70Var.t).t;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (v73) super.getAdapter();
    }

    public final boolean n(int i) {
        v73 v73Var = (v73) super.getAdapter();
        if (!v73Var.v(i)) {
            long itemId = v73Var.getItemId(i);
            int i2 = 1;
            while (true) {
                if (i2 >= v73Var.g.m) {
                    i = -1;
                    break;
                }
                int i3 = i + i2;
                if ((i3 < v73.v && v73Var.getItemId(i3) == itemId && v73Var.v(i3)) || ((i3 = i - i2) >= 0 && v73Var.getItemId(i3) == itemId && v73Var.v(i3))) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((v73) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.g(this.j);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v73 v73Var = (v73) super.getAdapter();
        v73Var.getClass();
        int iMax = Math.max(v73Var.r(), getFirstVisiblePosition());
        int iMin = Math.min(v73Var.x(), getLastVisiblePosition());
        v73Var.getItem(iMax);
        v73Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iY;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            v73 v73Var = (v73) super.getAdapter();
            iY = v73Var.y(v73Var.x() + 1);
        } else if (i == 130 || i == 2) {
            v73 v73Var2 = (v73) super.getAdapter();
            iY = v73Var2.g(v73Var2.r() - 1);
        } else {
            iY = -1;
        }
        if (iY != -1) {
            setSelection(iY);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return r(selectedItemPosition, z);
        }
        if (i == 22) {
            return r(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iY = keyEvent.isShiftPressed() ? ((v73) super.getAdapter()).y(selectedItemPosition) : ((v73) super.getAdapter()).g(selectedItemPosition);
            if (iY == -1) {
                return false;
            }
            setSelection(iY);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        v73 v73Var = (v73) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || v73Var.v(selectedItemPosition2)) {
            return true;
        }
        v73 v73Var2 = (v73) super.getAdapter();
        if (!n(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > v73Var2.x()) {
                            break;
                        }
                        if (!n(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < v73Var2.r()) {
                    return false;
                }
                if (n(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.j) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    public final boolean r(int i, boolean z) {
        fa4 fa4Var;
        fa4 fa4Var2;
        int iG = z ? ((v73) super.getAdapter()).g(i) : ((v73) super.getAdapter()).y(i);
        if (iG != -1) {
            setSelection(iG);
            return true;
        }
        if (!z && (fa4Var2 = this.t) != null) {
            return ((u23) fa4Var2.t).S(false);
        }
        if (!z || (fa4Var = this.t) == null) {
            return true;
        }
        return ((u23) fa4Var.t).S(true);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v73)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v73.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        v73 v73Var = (v73) super.getAdapter();
        super.setSelection(Math.max(i, v73Var.g(v73Var.r() - 1)));
    }

    public final v73 y() {
        return (v73) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (v73) super.getAdapter();
    }
}
