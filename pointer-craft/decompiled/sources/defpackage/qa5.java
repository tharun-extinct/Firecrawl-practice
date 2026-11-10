package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import io.appground.blek.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qa5 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static qa5 p;
    public static qa5 u;
    public final int a;
    public boolean b;
    public int c;
    public va5 i;
    public final View j;
    public final pa5 m;
    public final pa5 q;
    public boolean s;
    public final CharSequence t;
    public int w;

    /* JADX WARN: Type inference failed for: r0v0, types: [pa5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [pa5] */
    public qa5(View view, CharSequence charSequence) {
        final byte b = 0;
        this.m = new Runnable(this) { // from class: pa5
            public final /* synthetic */ qa5 t;

            {
                this.t = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                qa5 qa5Var = this.t;
                switch (b2) {
                    case 0:
                        qa5Var.r(false);
                        break;
                    default:
                        qa5Var.g();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.q = new Runnable(this) { // from class: pa5
            public final /* synthetic */ qa5 t;

            {
                this.t = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                qa5 qa5Var = this.t;
                switch (b3) {
                    case 0:
                        qa5Var.r(false);
                        break;
                    default:
                        qa5Var.g();
                        break;
                }
            }
        };
        this.j = view;
        this.t = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = cl5.g;
        this.a = Build.VERSION.SDK_INT >= 28 ? ym.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void y(qa5 qa5Var) {
        qa5 qa5Var2 = p;
        if (qa5Var2 != null) {
            qa5Var2.j.removeCallbacks(qa5Var2.m);
        }
        p = qa5Var;
        if (qa5Var != null) {
            qa5Var.j.postDelayed(qa5Var.m, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void g() {
        qa5 qa5Var = u;
        View view = this.j;
        if (qa5Var == this) {
            u = null;
            va5 va5Var = this.i;
            if (va5Var != null) {
                View view2 = (View) va5Var.y;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) va5Var.g).getSystemService("window")).removeView(view2);
                }
                this.i = null;
                this.s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (p == this) {
            y(null);
        }
        view.removeCallbacks(this.q);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i == null || !this.b) {
            View view2 = this.j;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.s = true;
                        g();
                        return false;
                    }
                } else if (view2.isEnabled() && this.i == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.s) {
                        this.w = x;
                        this.c = y;
                        this.s = false;
                        y(this);
                    } else {
                        int iAbs = Math.abs(x - this.w);
                        int i = this.a;
                        if (iAbs > i || Math.abs(y - this.c) > i) {
                            this.w = x;
                            this.c = y;
                            this.s = false;
                            y(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.w = view.getWidth() / 2;
        this.c = view.getHeight() / 2;
        r(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        g();
    }

    public final void r(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.j;
        if (view.isAttachedToWindow()) {
            y(null);
            qa5 qa5Var = u;
            if (qa5Var != null) {
                qa5Var.g();
            }
            u = this;
            this.b = z;
            Context context = view.getContext();
            va5 va5Var = new va5();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            va5Var.n = layoutParams;
            va5Var.v = new Rect();
            va5Var.x = new int[2];
            va5Var.l = new int[2];
            va5Var.g = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            va5Var.y = viewInflate;
            va5Var.r = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(va5.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) va5Var.y;
            Context context2 = (Context) va5Var.g;
            this.i = va5Var;
            int width = this.w;
            int i4 = this.c;
            boolean z2 = this.b;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) va5Var.n;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) va5Var.r).setText(this.t);
            int[] iArr = (int[]) va5Var.l;
            int[] iArr2 = (int[]) va5Var.x;
            Rect rect = (Rect) va5Var.v;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.b) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = xk5.g;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            pa5 pa5Var = this.q;
            view.removeCallbacks(pa5Var);
            view.postDelayed(pa5Var, j2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
