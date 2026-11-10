package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import defpackage.ac0;
import defpackage.bc0;
import defpackage.e54;
import defpackage.i54;
import defpackage.j54;
import defpackage.l0;
import defpackage.p24;
import defpackage.xi3;
import defpackage.y44;
import defpackage.y83;
import defpackage.zb0;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends g implements i54 {
    public final View.OnLayoutChangeListener d;
    public final y83 f;
    public bc0 k;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new ac0();
        this.d = new View.OnLayoutChangeListener() { // from class: yb0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new j4(this.g, (byte) 2));
            }
        };
        this.f = new y83();
        B0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.r);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            B0();
            T0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean A0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 C() {
        return new y44(-2, -2);
    }

    @Override // androidx.recyclerview.widget.g
    public final int C0(int i, e54 e54Var, j54 j54Var) {
        if (!R0() || G() == 0 || i == 0) {
            return 0;
        }
        e54Var.n(0);
        l0.z("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final int E0(int i, e54 e54Var, j54 j54Var) {
        if (!b() || G() == 0 || i == 0) {
            return 0;
        }
        e54Var.n(0);
        l0.z("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final void K(Rect rect, View view) {
        super.K(rect, view);
        rect.centerY();
        if (R0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.g
    public final void N0(RecyclerView recyclerView, int i) {
        zb0 zb0Var = new zb0(this, recyclerView.getContext());
        zb0Var.g = i;
        O0(zb0Var);
    }

    public final float Q0(float f, float f2) {
        return S0() ? f - f2 : f + f2;
    }

    public final boolean R0() {
        return !this.k.g;
    }

    public final boolean S0() {
        return R0() && this.t.getLayoutDirection() == 1;
    }

    public final void T0(int i) {
        bc0 bc0Var;
        if (i != 0 && i != 1) {
            l0.u(xi3.j("invalid orientation:", i));
            return;
        }
        w(null);
        bc0 bc0Var2 = this.k;
        if (bc0Var2 == null || i != bc0Var2.g) {
            if (i == 0) {
                bc0Var = new bc0(this, (byte) 1);
            } else {
                if (i != 1) {
                    l0.u("invalid orientation");
                    return;
                }
                bc0Var = new bc0(this, (byte) 0);
            }
            this.k = bc0Var;
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean V() {
        return true;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean b() {
        return !R0();
    }

    @Override // androidx.recyclerview.widget.g
    public final void c0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        y83 y83Var = this.f;
        float dimension = y83Var.g;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        y83Var.g = dimension;
        float dimension2 = y83Var.y;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        y83Var.y = dimension2;
        B0();
        recyclerView.addOnLayoutChangeListener(this.d);
    }

    @Override // androidx.recyclerview.widget.g
    public final void d0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // androidx.recyclerview.widget.g
    public final View e0(View view, int i, e54 e54Var, j54 j54Var) {
        byte b;
        if (G() != 0) {
            boolean z = this.k.g;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (z) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (z) {
                        b = -2147483648;
                    } else if (S0()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (z) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (z) {
                b = -2147483648;
            } else if (S0()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (g.R(view) != 0) {
                        int iR = g.R(F(0)) - 1;
                        if (iR < 0 || iR >= Q()) {
                            return F(S0() ? G() - 1 : 0);
                        }
                        this.k.g();
                        throw null;
                    }
                } else if (g.R(view) != Q() - 1) {
                    int iR2 = g.R(F(G() - 1)) + 1;
                    if (iR2 < 0 || iR2 >= Q()) {
                        return F(S0() ? 0 : G() - 1);
                    }
                    this.k.g();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.g
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            accessibilityEvent.setFromIndex(g.R(F(0)));
            accessibilityEvent.setToIndex(g.R(F(G() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean i() {
        return R0();
    }

    @Override // androidx.recyclerview.widget.g
    public final void j0(int i, int i2) {
        Q();
    }

    @Override // androidx.recyclerview.widget.g
    public final void k0() {
        Q();
    }

    @Override // androidx.recyclerview.widget.g
    public final void m0(int i, int i2) {
        Q();
    }

    @Override // androidx.recyclerview.widget.g
    public final void p0(e54 e54Var, j54 j54Var) {
        if (j54Var.y() > 0) {
            if ((R0() ? this.h : this.o) > 0.0f) {
                S0();
                e54Var.n(0);
                l0.z("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        w0(e54Var);
    }

    @Override // defpackage.i54
    public final PointF v(int i) {
        return null;
    }

    public CarouselLayoutManager() {
        y83 y83Var = new y83();
        new ac0();
        this.d = new View.OnLayoutChangeListener() { // from class: yb0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new j4(this.g, (byte) 2));
            }
        };
        this.f = y83Var;
        B0();
        T0(0);
    }
}
