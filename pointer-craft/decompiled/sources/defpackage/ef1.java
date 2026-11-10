package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.appground.blek.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class ef1 extends ListView {
    public int a;
    public final boolean b;
    public cf1 c;
    public boolean i;
    public final Rect j;
    public int m;
    public uw2 p;
    public int q;
    public boolean s;
    public int t;
    public ml u;
    public int w;

    public ef1(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.j = new Rect();
        this.t = 0;
        this.a = 0;
        this.m = 0;
        this.q = 0;
        this.b = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.j;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.u != null) {
            return;
        }
        super.drawableStateChanged();
        cf1 cf1Var = this.c;
        if (cf1Var != null) {
            cf1Var.t = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public final int g(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.b || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.b || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.b || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.b && this.i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.u == null) {
            ml mlVar = new ml((Object) this, (byte) 6);
            this.u = mlVar;
            post(mlVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !bf1.n) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        bf1.g.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        bf1.y.invoke(this, Integer.valueOf(iPointToPosition));
                        bf1.r.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ml mlVar = this.u;
        if (mlVar != null) {
            ef1 ef1Var = (ef1) mlVar.t;
            ef1Var.u = null;
            ef1Var.removeCallbacks(mlVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        cf1 cf1Var = null;
        if (drawable != null) {
            cf1 cf1Var2 = new cf1();
            Drawable drawable2 = cf1Var2.j;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            cf1Var2.j = drawable;
            drawable.setCallback(cf1Var2);
            cf1Var2.t = true;
            cf1Var = cf1Var2;
        }
        this.c = cf1Var;
        super.setSelector(cf1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.t = rect.left;
        this.a = rect.top;
        this.m = rect.right;
        this.q = rect.bottom;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean y(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zV;
        View childAt;
        View childAt2;
        uw2 uw2Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.s = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.w - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            uw2Var = this.p;
            if (z) {
                if (uw2Var == null) {
                    uw2Var = new uw2(this);
                    this.p = uw2Var;
                }
                uw2Var.o = true;
                uw2Var.onTouch(this, motionEvent);
            } else if (uw2Var != null) {
                if (uw2Var.o) {
                    uw2Var.n();
                }
                uw2Var.o = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.s = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.w;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.w = iPointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.j;
                rect.set(left, top, right, bottom);
                rect.left -= this.t;
                rect.top -= this.a;
                rect.right += this.m;
                rect.bottom += this.q;
                if (Build.VERSION.SDK_INT >= 33) {
                    zV = h2.v(this);
                } else {
                    Field field = df1.g;
                    if (field != null) {
                        try {
                            zV = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zV = false;
                        }
                    } else {
                        zV = false;
                    }
                }
                if (childAt3.isEnabled() != zV) {
                    boolean z4 = !zV;
                    if (Build.VERSION.SDK_INT >= 33) {
                        h2.b(this, z4);
                    } else {
                        Field field2 = df1.g;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z4));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                cf1 cf1Var = this.c;
                if (cf1Var != null) {
                    cf1Var.t = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.w - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.w - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        uw2Var = this.p;
        if (z) {
            if (uw2Var == null) {
                uw2Var = new uw2(this);
                this.p = uw2Var;
            }
            uw2Var.o = true;
            uw2Var.onTouch(this, motionEvent);
        } else if (uw2Var != null) {
            if (uw2Var.o) {
                uw2Var.n();
            }
            uw2Var.o = false;
        }
        return z;
    }
}
