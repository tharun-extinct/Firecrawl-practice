package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.k3;
import defpackage.og4;
import defpackage.r24;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {
    public View a;
    public final int b;
    public final boolean c;
    public boolean i;
    public boolean j;
    public Drawable m;
    public Drawable q;
    public View t;
    public Drawable w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new k3(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.g);
        boolean z = false;
        this.m = typedArrayObtainStyledAttributes.getDrawable(0);
        this.q = typedArrayObtainStyledAttributes.getDrawable(2);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.c = true;
            this.w = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.c ? !(this.m != null || this.q != null) : this.w == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.m;
        if (drawable != null && drawable.isStateful()) {
            this.m.setState(getDrawableState());
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            this.q.setState(getDrawableState());
        }
        Drawable drawable3 = this.w;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.w.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.t = findViewById(R.id.action_bar);
        this.a = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.c) {
            Drawable drawable = this.w;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.m == null) {
                z2 = false;
            } else if (this.t.getVisibility() == 0 || ((view = this.a) != null && view.getVisibility() == 0)) {
                this.m.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                this.m.setBounds(0, 0, 0, 0);
            }
            this.i = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.t == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.b) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.t == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.m);
        }
        this.m = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.t != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.c ? !(this.m != null || this.q != null) : this.w == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.w);
        }
        this.w = drawable;
        boolean z = this.c;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.w) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.m != null || this.q != null) : this.w == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.q);
        }
        this.q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && this.q != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.c ? !(this.m != null || this.q != null) : this.w == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.j = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.m;
        boolean z = this.c;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.q && this.i) {
            return true;
        }
        return (drawable == this.w && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(og4 og4Var) {
    }
}
