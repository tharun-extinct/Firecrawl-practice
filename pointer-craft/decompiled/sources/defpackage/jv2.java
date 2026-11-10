package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public class jv2 {
    public final DecelerateInterpolator a;
    public int b;
    public float c;
    public int g = -1;
    public int i;
    public boolean j;
    public final h54 l;
    public PointF m;
    public boolean n;
    public final DisplayMetrics q;
    public g r;
    public final LinearInterpolator t;
    public boolean v;
    public boolean w;
    public View x;
    public RecyclerView y;

    public jv2(Context context) {
        h54 h54Var = new h54();
        h54Var.n = -1;
        h54Var.x = false;
        h54Var.l = 0;
        h54Var.g = 0;
        h54Var.y = 0;
        h54Var.r = Integer.MIN_VALUE;
        h54Var.v = null;
        this.l = h54Var;
        this.t = new LinearInterpolator();
        this.a = new DecelerateInterpolator();
        this.w = false;
        this.i = 0;
        this.b = 0;
        this.q = context.getResources().getDisplayMetrics();
    }

    public static int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            l0.u("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void j(View view, h54 h54Var) {
        int i;
        PointF pointF = this.m;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iY = y(view, i);
        PointF pointF2 = this.m;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iR = r(view, i2);
        int iCeil = (int) Math.ceil(((double) v((int) Math.sqrt((iR * iR) + (iY * iY)))) / 0.3356d);
        if (iCeil > 0) {
            h54Var.g = -iY;
            h54Var.y = -iR;
            h54Var.r = iCeil;
            h54Var.v = this.a;
            h54Var.x = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void l(int i, int i2) {
        PointF pointFX;
        RecyclerView recyclerView = this.y;
        if (this.g == -1 || recyclerView == null) {
            t();
        }
        if (this.n && this.x == null && this.r != null && (pointFX = x(this.g)) != null) {
            float f = pointFX.x;
            if (f != 0.0f || pointFX.y != 0.0f) {
                recyclerView.j0((int) Math.signum(f), (int) Math.signum(pointFX.y), null);
            }
        }
        this.n = false;
        View view = this.x;
        h54 h54Var = this.l;
        if (view != null) {
            this.y.getClass();
            n54 n54VarO = RecyclerView.O(view);
            if ((n54VarO != null ? n54VarO.n() : -1) == this.g) {
                View view2 = this.x;
                j54 j54Var = recyclerView.o0;
                j(view2, h54Var);
                h54Var.g(recyclerView);
                t();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.x = null;
            }
        }
        if (this.v) {
            j54 j54Var2 = recyclerView.o0;
            if (this.y.h.G() == 0) {
                t();
            } else {
                int i3 = this.i;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.i = i4;
                int i5 = this.b;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.b = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFX2 = x(this.g);
                    if (pointFX2 != null) {
                        float f2 = pointFX2.x;
                        if (f2 == 0.0f && pointFX2.y == 0.0f) {
                            h54Var.n = this.g;
                            t();
                        } else {
                            float f3 = pointFX2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFX2.x / fSqrt;
                            pointFX2.x = f4;
                            float f5 = pointFX2.y / fSqrt;
                            pointFX2.y = f5;
                            this.m = pointFX2;
                            this.i = (int) (f4 * 10000.0f);
                            this.b = (int) (f5 * 10000.0f);
                            int iV = v(10000);
                            int i7 = (int) (this.i * 1.2f);
                            int i8 = (int) (this.b * 1.2f);
                            h54Var.g = i7;
                            h54Var.y = i8;
                            h54Var.r = (int) (iV * 1.2f);
                            h54Var.v = this.t;
                            h54Var.x = true;
                        }
                    } else {
                        h54Var.n = this.g;
                        t();
                    }
                }
            }
            boolean z = h54Var.n >= 0;
            h54Var.g(recyclerView);
            if (z && this.v) {
                this.n = true;
                recyclerView.l0.y();
            }
        }
    }

    public float n(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int r(View view, int i) {
        g gVar = this.r;
        if (gVar == null || !gVar.b()) {
            return 0;
        }
        y44 y44Var = (y44) view.getLayoutParams();
        return g(g.P(view) - ((ViewGroup.MarginLayoutParams) y44Var).topMargin, g.J(view) + ((ViewGroup.MarginLayoutParams) y44Var).bottomMargin, gVar.getPaddingTop(), gVar.o - gVar.getPaddingBottom(), i);
    }

    public final void t() {
        if (this.v) {
            this.v = false;
            this.b = 0;
            this.i = 0;
            this.m = null;
            this.y.o0.g = -1;
            this.x = null;
            this.g = -1;
            this.n = false;
            g gVar = this.r;
            if (gVar.q == this) {
                gVar.q = null;
            }
            this.r = null;
            this.y = null;
        }
    }

    public int v(int i) {
        float fAbs = Math.abs(i);
        if (!this.w) {
            this.c = n(this.q);
            this.w = true;
        }
        return (int) Math.ceil(fAbs * this.c);
    }

    public PointF x(int i) {
        Object obj = this.r;
        if (obj instanceof i54) {
            return ((i54) obj).v(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i54.class.getCanonicalName());
        return null;
    }

    public int y(View view, int i) {
        g gVar = this.r;
        if (gVar == null || !gVar.i()) {
            return 0;
        }
        y44 y44Var = (y44) view.getLayoutParams();
        return g(g.L(view) - ((ViewGroup.MarginLayoutParams) y44Var).leftMargin, g.O(view) + ((ViewGroup.MarginLayoutParams) y44Var).rightMargin, gVar.getPaddingLeft(), gVar.h - gVar.getPaddingRight(), i);
    }
}
