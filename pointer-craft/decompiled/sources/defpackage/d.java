package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ViewGroup {
    public es5 a;
    public boolean b;
    public boolean c;
    public boolean i;
    public WeakReference j;
    public to0 m;
    public mo0 q;
    public IBinder t;
    public un w;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        hc hcVar = new hc(this, (byte) 2);
        addOnAttachStateChangeListener(hcVar);
        zk5 zk5Var = new zk5(this);
        br2.z(this).g.add(zk5Var);
        this.w = new un(this, hcVar, zk5Var, (byte) 9);
    }

    private final void setParentContext(to0 to0Var) {
        if (this.m != to0Var) {
            this.m = to0Var;
            if (to0Var != null) {
                this.j = null;
            }
            es5 es5Var = this.a;
            if (es5Var != null) {
                es5Var.g();
                this.a = null;
                if (isAttachedToWindow()) {
                    x();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.t != iBinder) {
            this.t = iBinder;
            this.j = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final mo0 a() {
        mo0 composeViewContext;
        wl5 wl5Var;
        wl5 wl5Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ba baVar = childAt instanceof ba ? (ba) childAt : null;
            if (baVar != null) {
                composeViewContext = baVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewO = ra.o(this);
        mo0 mo0VarF = ra.f(viewO);
        if (mo0VarF != null) {
            return q(viewO, mo0VarF);
        }
        to0 to0VarM = m();
        gu2 gu2VarC = aq2.c(viewO);
        if (gu2VarC == null) {
            gu2VarC = composeViewContext != null ? composeViewContext.n() : null;
            if (gu2VarC == null) {
                l0.z("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        gu2 gu2Var = gu2VarC;
        id4 id4VarM = v13.m(viewO);
        if (id4VarM == null) {
            if (composeViewContext != null) {
                composeViewContext.l();
                id4VarM = composeViewContext.v;
                id4VarM.getClass();
            } else {
                id4VarM = null;
            }
            if (id4VarM == null) {
                l0.z("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        id4 id4Var = id4VarM;
        wl5 wl5VarB = kq2.B(viewO);
        if (wl5VarB == null) {
            if (composeViewContext != null) {
                composeViewContext.l();
                wl5Var2 = composeViewContext.x;
            }
            wl5Var = wl5Var2;
        } else {
            wl5Var = wl5VarB;
        }
        mo0 mo0Var = new mo0(ra.f(ra.o(viewO)), viewO, to0VarM, gu2Var, id4Var, wl5Var);
        viewO.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(mo0Var));
        return mo0Var;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        r();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        r();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void g(int i, h02 h02Var);

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m17getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        is isVar = tag instanceof is ? (is) tag : null;
        if (isVar != null) {
            return isVar.y();
        }
        return 1;
    }

    public final mo0 getComposeViewContext$ui() {
        return this.q;
    }

    public final boolean getHasComposition() {
        return this.a != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.b || super.isTransitionGroup();
    }

    public void j(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void l(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [to0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [to0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [to0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [a44] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final to0 m() {
        to0 to0Var;
        ?? G = this.m;
        if (G == 0) {
            G = pq5.g(this);
            if (G == 0) {
                Object parent = getParent();
                while (true) {
                    if (G != 0 || !(parent instanceof View)) {
                        G = G;
                        break;
                    }
                    G = G;
                    View view = (View) parent;
                    to0 to0VarG = pq5.g(view);
                    parent = sp2.s(view);
                    G = to0VarG;
                }
            }
            x34 x34Var = x34.t;
            if (G != 0) {
                ?? r3 = (!(G instanceof a44) || ((x34) ((a44) G).f.getValue()).compareTo(x34Var) > 0) ? G : 0;
                if (r3 != 0) {
                    this.j = new WeakReference(r3);
                }
            } else {
                G = 0;
            }
            if (G == 0) {
                WeakReference weakReference = this.j;
                if (weakReference == null || (to0Var = (to0) weakReference.get()) == null || ((to0Var instanceof a44) && ((x34) ((a44) to0Var).f.getValue()).compareTo(x34Var) <= 0)) {
                    G = to0Var;
                    G = to0Var;
                    G = 0;
                }
                if (G == 0) {
                    G = pq5.y(this);
                    ?? r2 = ((x34) G.f.getValue()).compareTo(x34Var) > 0 ? G : 0;
                    if (r2 != 0) {
                        this.j = new WeakReference(r2);
                    }
                }
            }
        }
        return G;
    }

    public final void n() {
        mo0 mo0Var;
        if (this.m != null || isAttachedToWindow() || ((mo0Var = this.q) != null && mo0Var.g.isAttachedToWindow())) {
            x();
        } else {
            l0.z("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hb3 hb3Var = pq5.g;
        Object objS = sp2.s(this);
        View view = this;
        while (objS instanceof View) {
            View view2 = (View) objS;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objS = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new k(this, (byte) 0));
        } else {
            y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        l(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        x();
        j(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final mo0 q(View view, mo0 mo0Var) {
        to0 to0VarM = m();
        gu2 gu2VarC = aq2.c(view);
        wl5 wl5VarB = kq2.B(view);
        id4 id4VarM = v13.m(view);
        if (to0VarM == mo0Var.r() && gu2VarC == mo0Var.n()) {
            mo0Var.l();
            if (wl5VarB == mo0Var.x) {
                mo0Var.l();
                id4 id4Var = mo0Var.v;
                id4Var.getClass();
                if (id4VarM == id4Var) {
                    return mo0Var;
                }
            }
        }
        if (to0VarM.a() != mo0Var.r().a()) {
            v();
        }
        if (gu2VarC == null) {
            gu2VarC = mo0Var.n();
        }
        gu2 gu2Var = gu2VarC;
        if (id4VarM == null) {
            mo0Var.l();
            id4VarM = mo0Var.v;
            id4VarM.getClass();
        }
        mo0 mo0Var2 = new mo0(mo0Var, view, to0VarM, gu2Var, id4VarM, wl5VarB);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(mo0Var2));
        return mo0Var2;
    }

    public final void r() {
        if (this.i) {
            return;
        }
        uo1.u(du4.i("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m18setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, is.g(i));
    }

    public final void setComposeViewContext$ui(mo0 mo0Var) {
        if (this.q != mo0Var) {
            if (mo0Var == null) {
                v();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ba baVar = childAt instanceof ba ? (ba) childAt : null;
                if (baVar != null) {
                    if (baVar.getCoroutineContext() != mo0Var.r().a()) {
                        v();
                    }
                    baVar.setComposeViewContext(mo0Var);
                }
            }
            this.q = mo0Var;
        }
    }

    public final void setParentCompositionContext(to0 to0Var) {
        setParentContext(to0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.c = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ba) ((pn3) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.b = true;
    }

    public final void setViewCompositionStrategy(al5 al5Var) {
        un unVar = this.w;
        if (unVar != null) {
            unVar.g();
        }
        ((lr2) al5Var).getClass();
        hc hcVar = new hc(this, (byte) 2);
        addOnAttachStateChangeListener(hcVar);
        zk5 zk5Var = new zk5(this);
        br2.z(this).g.add(zk5Var);
        this.w = new un(this, hcVar, zk5Var, (byte) 9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void v() {
        View childAt = getChildAt(0);
        ba baVar = childAt instanceof ba ? (ba) childAt : null;
        if (baVar != null && baVar.K0) {
            baVar.getComposeViewContext().y();
            baVar.K0 = false;
        }
        es5 es5Var = this.a;
        if (es5Var != null) {
            es5Var.g();
        }
        this.a = null;
        requestLayout();
    }

    public final void x() {
        if (this.a == null) {
            byte b = 0;
            try {
                this.i = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    mo0 mo0VarA = this.q;
                    if (mo0VarA == null) {
                        mo0VarA = a();
                    }
                    this.a = hs5.g(this, mo0VarA, new nm0(1003123809, true, new f(this, b)));
                    Trace.endSection();
                    this.i = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.i = false;
                throw th2;
            }
        }
    }

    public final void y() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.q == null) {
                ba baVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ba) {
                        baVar = (ba) childAt;
                    }
                }
                if (baVar != null) {
                    baVar.setComposeViewContext(q(ra.o(this), baVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                x();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        r();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        r();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        r();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        r();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
