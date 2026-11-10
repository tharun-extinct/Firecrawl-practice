package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class sw2 implements mp4 {
    public static final Method H;
    public static final Method I;
    public final Handler C;
    public Rect E;
    public boolean F;
    public final em G;
    public ef1 a;
    public boolean b;
    public int c;
    public AdapterView.OnItemClickListener f;
    public pw2 h;
    public final Context j;
    public AdapterView.OnItemSelectedListener k;
    public View o;
    public boolean p;
    public boolean s;
    public ListAdapter t;
    public int w;
    public final int m = -2;
    public int q = -2;
    public final short i = 1002;
    public int u = 0;
    public final int z = Integer.MAX_VALUE;
    public final ow2 d = new ow2(this, (byte) 1);
    public final rw2 e = new rw2(this, (byte) 0);
    public final qw2 A = new qw2(this);
    public final ow2 B = new ow2(this, (byte) 0);
    public final Rect D = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public sw2(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.j = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.i, i, i2);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.c = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        em emVar = new em(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r24.u, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            emVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        emVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : k33.J(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.G = emVar;
        emVar.setInputMethodMode(1);
    }

    public void b(ListAdapter listAdapter) {
        pw2 pw2Var = this.h;
        if (pw2Var == null) {
            this.h = new pw2(this);
        } else {
            ListAdapter listAdapter2 = this.t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(pw2Var);
            }
        }
        this.t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.h);
        }
        ef1 ef1Var = this.a;
        if (ef1Var != null) {
            ef1Var.setAdapter(this.t);
        }
    }

    public final int c() {
        if (this.b) {
            return this.c;
        }
        return 0;
    }

    @Override // defpackage.mp4
    public final void dismiss() {
        em emVar = this.G;
        emVar.dismiss();
        emVar.setContentView(null);
        this.a = null;
        this.C.removeCallbacks(this.d);
    }

    @Override // defpackage.mp4
    public final boolean g() {
        return this.G.isShowing();
    }

    @Override // defpackage.mp4
    public final ef1 j() {
        return this.a;
    }

    public final void l(int i) {
        this.c = i;
        this.b = true;
    }

    public final void m(int i) {
        this.w = i;
    }

    public final Drawable n() {
        return this.G.getBackground();
    }

    public final void p(int i) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            this.q = i;
            return;
        }
        Rect rect = this.D;
        background.getPadding(rect);
        this.q = rect.left + rect.right + i;
    }

    @Override // defpackage.mp4
    public final void r() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        ef1 ef1Var;
        ef1 ef1Var2 = this.a;
        Context context = this.j;
        em emVar = this.G;
        if (ef1Var2 == null) {
            ef1 ef1VarS = s(context, !this.F);
            this.a = ef1VarS;
            ef1VarS.setAdapter(this.t);
            this.a.setOnItemClickListener(this.f);
            this.a.setFocusable(true);
            this.a.setFocusableInTouchMode(true);
            this.a.setOnItemSelectedListener(new nw2(this));
            this.a.setOnScrollListener(this.A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.k;
            if (onItemSelectedListener != null) {
                this.a.setOnItemSelectedListener(onItemSelectedListener);
            }
            emVar.setContentView(this.a);
        }
        Drawable background = emVar.getBackground();
        Rect rect = this.D;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.b) {
                this.c = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = emVar.getMaxAvailableHeight(this.o, this.c, emVar.getInputMethodMode() == 2);
        int i3 = this.m;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.q;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iG = this.a.g(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iG + (iG > 0 ? this.a.getPaddingBottom() + this.a.getPaddingTop() + i : 0);
        }
        boolean z = emVar.getInputMethodMode() == 2;
        emVar.setWindowLayoutType(this.i);
        if (emVar.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.q;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.q;
                    if (z) {
                        emVar.setWidth(i5 == -1 ? -1 : 0);
                        emVar.setHeight(0);
                    } else {
                        emVar.setWidth(i5 == -1 ? -1 : 0);
                        emVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                emVar.setOutsideTouchable(true);
                int i6 = width;
                View view = this.o;
                int i7 = this.w;
                int i8 = this.c;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                emVar.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.q;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        emVar.setWidth(width2);
        emVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(emVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            sj.u(emVar);
        }
        emVar.setOutsideTouchable(true);
        emVar.setTouchInterceptor(this.e);
        if (this.p) {
            emVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = I;
            if (method2 != null) {
                try {
                    method2.invoke(emVar, this.E);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            sj.p(emVar, this.E);
        }
        emVar.showAsDropDown(this.o, this.w, this.c, this.u);
        this.a.setSelection(-1);
        if ((!this.F || this.a.isInTouchMode()) && (ef1Var = this.a) != null) {
            ef1Var.setListSelectionHidden(true);
            ef1Var.requestLayout();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.B);
    }

    public ef1 s(Context context, boolean z) {
        return new ef1(context, z);
    }

    public final void x(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public final int y() {
        return this.w;
    }
}
