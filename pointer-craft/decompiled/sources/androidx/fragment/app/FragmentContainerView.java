package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.ex1;
import defpackage.fw;
import defpackage.kx1;
import defpackage.l0;
import defpackage.m24;
import defpackage.pw1;
import defpackage.rw1;
import defpackage.tp5;
import defpackage.uo1;
import defpackage.xk5;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener a;
    public final ArrayList j;
    public boolean m;
    public final ArrayList t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, kx1 kx1Var) {
        String str;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.j = new ArrayList();
        this.t = new ArrayList();
        this.m = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m24.y, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        pw1 pw1VarD = kx1Var.D(id);
        if (classAttribute != null && pw1VarD == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + ((Object) string);
                } else {
                    str = "";
                }
                uo1.l(classAttribute, str, "FragmentContainerView must have an android:id to add Fragment ");
                throw null;
            }
            ex1 ex1VarK = kx1Var.K();
            context.getClassLoader();
            pw1 pw1VarG = ex1VarK.g(classAttribute);
            pw1VarG.getClass();
            pw1VarG.E = id;
            pw1VarG.F = id;
            pw1VarG.G = string;
            pw1VarG.A = kx1Var;
            rw1 rw1Var = kx1Var.f;
            pw1VarG.B = rw1Var;
            pw1VarG.M = true;
            if ((rw1Var == null ? null : rw1Var.f) != null) {
                pw1VarG.M = true;
            }
            fw fwVar = new fw(kx1Var);
            fwVar.i = true;
            pw1VarG.N = this;
            pw1VarG.f = true;
            fwVar.x(getId(), pw1VarG, string, 1);
            if (fwVar.l) {
                l0.z("This transaction is already being added to the back stack");
                throw null;
            }
            fwVar.s.B(fwVar, true);
        }
        kx1Var.V(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof pw1 ? (pw1) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            uo1.s(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        tp5 tp5VarL;
        windowInsets.getClass();
        tp5 tp5VarL2 = tp5.l(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.a;
        if (onApplyWindowInsetsListener != null) {
            tp5VarL = tp5.l(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = xk5.g;
            WindowInsets windowInsetsX = tp5VarL2.x();
            if (windowInsetsX != null && !windowInsetsX.equals(windowInsetsX)) {
                tp5VarL2 = tp5.l(this, windowInsetsX);
            }
            tp5VarL = tp5VarL2;
        }
        if (!tp5VarL.g.u()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                xk5.y(getChildAt(i), tp5VarL);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.m) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.m) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.t.remove(view);
        if (this.j.remove(view)) {
            this.m = true;
        }
        super.endViewTransition(view);
    }

    public final void g(View view) {
        if (this.t.contains(view)) {
            this.j.add(view);
        }
    }

    public final <F extends pw1> F getFragment() {
        return (F) kx1.F(this).D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                g(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        g(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        g(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        g(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            g(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            g(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.m = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.a = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.t.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.j = new ArrayList();
        this.t = new ArrayList();
        this.m = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m24.y, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + ((Object) str) + "=\"" + ((Object) classAttribute) + "\"");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.j = new ArrayList();
        this.t = new ArrayList();
        this.m = true;
    }
}
