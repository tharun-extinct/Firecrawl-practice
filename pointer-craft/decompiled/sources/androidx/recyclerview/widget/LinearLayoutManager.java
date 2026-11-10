package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.e54;
import defpackage.f2;
import defpackage.fv2;
import defpackage.gv2;
import defpackage.hv2;
import defpackage.i54;
import defpackage.iv2;
import defpackage.j54;
import defpackage.kf6;
import defpackage.l0;
import defpackage.m2;
import defpackage.n54;
import defpackage.p44;
import defpackage.si0;
import defpackage.vm3;
import defpackage.x44;
import defpackage.xi3;
import defpackage.y44;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends g implements i54 {
    public final boolean A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public int E;
    public int F;
    public iv2 G;
    public final fv2 H;
    public final gv2 I;
    public final byte J;
    public final int[] K;
    public vm3 d;
    public boolean e;
    public int f;
    public hv2 k;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = null;
        this.H = new fv2();
        this.I = new gv2();
        this.J = (byte) 2;
        this.K = new int[2];
        x44 x44VarS = g.S(context, attributeSet, i, i2);
        q1(x44VarS.g);
        boolean z = x44VarS.r;
        w(null);
        if (z != this.A) {
            this.A = z;
            B0();
        }
        r1(x44VarS.n);
    }

    @Override // androidx.recyclerview.widget.g
    public final View B(int i) {
        int iG = G();
        if (iG == 0) {
            return null;
        }
        int iR = i - g.R(F(0));
        if (iR >= 0 && iR < iG) {
            View viewF = F(iR);
            if (g.R(viewF) == i) {
                return viewF;
            }
        }
        return super.B(i);
    }

    @Override // androidx.recyclerview.widget.g
    public int C0(int i, e54 e54Var, j54 j54Var) {
        if (this.f == 1) {
            return 0;
        }
        return o1(i, e54Var, j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void D0(int i) {
        this.E = i;
        this.F = Integer.MIN_VALUE;
        iv2 iv2Var = this.G;
        if (iv2Var != null) {
            iv2Var.j = -1;
        }
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public int E0(int i, e54 e54Var, j54 j54Var) {
        if (this.f == 0) {
            return 0;
        }
        return o1(i, e54Var, j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean L0() {
        if (this.z != 1073741824 && this.u != 1073741824) {
            int iG = G();
            for (int i = 0; i < iG; i++) {
                ViewGroup.LayoutParams layoutParams = F(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.g
    public boolean P0() {
        return this.G == null && this.e == this.C;
    }

    public void Q0(j54 j54Var, int[] iArr) {
        int i;
        int iM = j54Var.g != -1 ? this.d.m() : 0;
        if (this.k.x == -1) {
            i = 0;
        } else {
            i = iM;
            iM = 0;
        }
        iArr[0] = iM;
        iArr[1] = i;
    }

    public void R0(j54 j54Var, hv2 hv2Var, si0 si0Var) {
        int i = hv2Var.n;
        if (i < 0 || i >= j54Var.y()) {
            return;
        }
        si0Var.g(i, Math.max(0, hv2Var.l));
    }

    public final int S0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        W0();
        vm3 vm3Var = this.d;
        boolean z = !this.D;
        return kf6.r(j54Var, vm3Var, Z0(z), Y0(z), this, this.D);
    }

    public final int T0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        W0();
        vm3 vm3Var = this.d;
        boolean z = !this.D;
        return kf6.n(j54Var, vm3Var, Z0(z), Y0(z), this, this.D, this.B);
    }

    public final int U0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        W0();
        vm3 vm3Var = this.d;
        boolean z = !this.D;
        return kf6.v(j54Var, vm3Var, Z0(z), Y0(z), this, this.D);
    }

    public final int V0(int i) {
        if (i == 1) {
            return (this.f != 1 && i1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f != 1 && i1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean W() {
        return this.A;
    }

    public final void W0() {
        if (this.k == null) {
            hv2 hv2Var = new hv2();
            hv2Var.g = true;
            hv2Var.j = 0;
            hv2Var.t = 0;
            hv2Var.m = null;
            this.k = hv2Var;
        }
    }

    public final int X0(e54 e54Var, hv2 hv2Var, j54 j54Var, boolean z) {
        int i;
        int i2 = hv2Var.r;
        int i3 = hv2Var.l;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                hv2Var.l = i3 + i2;
            }
            l1(e54Var, hv2Var);
        }
        int i4 = hv2Var.r + hv2Var.j;
        while (true) {
            if ((!hv2Var.q && i4 <= 0) || (i = hv2Var.n) < 0 || i >= j54Var.y()) {
                break;
            }
            gv2 gv2Var = this.I;
            gv2Var.g = 0;
            gv2Var.y = false;
            gv2Var.r = false;
            gv2Var.n = false;
            j1(e54Var, j54Var, hv2Var, gv2Var);
            if (!gv2Var.y) {
                int i5 = hv2Var.y;
                int i6 = gv2Var.g;
                hv2Var.y = (hv2Var.x * i6) + i5;
                if (!gv2Var.r || hv2Var.m != null || !j54Var.l) {
                    hv2Var.r -= i6;
                    i4 -= i6;
                }
                int i7 = hv2Var.l;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    hv2Var.l = i8;
                    int i9 = hv2Var.r;
                    if (i9 < 0) {
                        hv2Var.l = i8 + i9;
                    }
                    l1(e54Var, hv2Var);
                }
                if (z && gv2Var.n) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - hv2Var.r;
    }

    public final View Y0(boolean z) {
        return this.B ? c1(0, G(), z) : c1(G() - 1, -1, z);
    }

    public final View Z0(boolean z) {
        return this.B ? c1(G() - 1, -1, z) : c1(0, G(), z);
    }

    public final int a1() {
        View viewC1 = c1(G() - 1, -1, false);
        if (viewC1 == null) {
            return -1;
        }
        return g.R(viewC1);
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean b() {
        return this.f == 1;
    }

    public final View b1(int i, int i2) {
        int i3;
        int i4;
        W0();
        if (i2 <= i && i2 >= i) {
            return F(i);
        }
        if (this.d.v(F(i)) < this.d.a()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f == 0 ? this.a.u(i, i2, i3, i4) : this.m.u(i, i2, i3, i4);
    }

    public final View c1(int i, int i2, boolean z) {
        W0();
        int i3 = z ? 24579 : 320;
        return this.f == 0 ? this.a.u(i, i2, i3, 320) : this.m.u(i, i2, i3, 320);
    }

    @Override // androidx.recyclerview.widget.g
    public int d(j54 j54Var) {
        return T0(j54Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View d1(e54 e54Var, j54 j54Var, boolean z, boolean z2) {
        int i;
        int iG;
        int i2;
        W0();
        int iG2 = G();
        if (z2) {
            iG = G() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iG2;
            iG = 0;
            i2 = 1;
        }
        int iY = j54Var.y();
        int iA = this.d.a();
        int iL = this.d.l();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iG != i) {
            View viewF = F(iG);
            int iR = g.R(viewF);
            int iV = this.d.v(viewF);
            int iY2 = this.d.y(viewF);
            if (iR >= 0 && iR < iY) {
                if (!((y44) viewF.getLayoutParams()).j.a()) {
                    boolean z3 = iY2 <= iA && iV < iA;
                    boolean z4 = iV >= iL && iY2 > iL;
                    if (!z3 && !z4) {
                        return viewF;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewF;
                        } else if (view == null) {
                            view = viewF;
                        }
                    } else if (z3) {
                        view2 = viewF;
                    } else if (view == null) {
                        view = viewF;
                    }
                } else if (view3 == null) {
                    view3 = viewF;
                }
            }
            iG += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.g
    public int e(j54 j54Var) {
        return U0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public View e0(View view, int i, e54 e54Var, j54 j54Var) {
        int iV0;
        View viewB1;
        n1();
        if (G() != 0 && (iV0 = V0(i)) != Integer.MIN_VALUE) {
            W0();
            s1(iV0, (int) (this.d.m() * 0.33333334f), false, j54Var);
            hv2 hv2Var = this.k;
            hv2Var.l = Integer.MIN_VALUE;
            hv2Var.g = false;
            X0(e54Var, hv2Var, j54Var, true);
            boolean z = this.B;
            if (iV0 == -1) {
                viewB1 = z ? b1(G() - 1, -1) : b1(0, G());
            } else {
                viewB1 = z ? b1(0, G()) : b1(G() - 1, -1);
            }
            View viewH1 = iV0 == -1 ? h1() : g1();
            if (!viewH1.hasFocusable()) {
                return viewB1;
            }
            if (viewB1 != null) {
                return viewH1;
            }
        }
        return null;
    }

    public final int e1(int i, e54 e54Var, j54 j54Var, boolean z) {
        int iL;
        int iL2 = this.d.l() - i;
        if (iL2 <= 0) {
            return 0;
        }
        int i2 = -o1(-iL2, e54Var, j54Var);
        int i3 = i + i2;
        if (!z || (iL = this.d.l() - i3) <= 0) {
            return i2;
        }
        this.d.i(iL);
        return iL + i2;
    }

    @Override // androidx.recyclerview.widget.g
    public int f(j54 j54Var) {
        return U0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            View viewC1 = c1(0, G(), false);
            accessibilityEvent.setFromIndex(viewC1 == null ? -1 : g.R(viewC1));
            accessibilityEvent.setToIndex(a1());
        }
    }

    public final int f1(int i, e54 e54Var, j54 j54Var, boolean z) {
        int iA;
        int iA2 = i - this.d.a();
        if (iA2 <= 0) {
            return 0;
        }
        int i2 = -o1(iA2, e54Var, j54Var);
        int i3 = i + i2;
        if (!z || (iA = i3 - this.d.a()) <= 0) {
            return i2;
        }
        this.d.i(-iA);
        return i2 - iA;
    }

    @Override // androidx.recyclerview.widget.g
    public void g0(e54 e54Var, j54 j54Var, m2 m2Var) {
        super.g0(e54Var, j54Var, m2Var);
        p44 p44Var = this.t.z;
        if (p44Var == null || p44Var.g() <= 0) {
            return;
        }
        m2Var.y(f2.q);
    }

    public final View g1() {
        return F(this.B ? 0 : G() - 1);
    }

    @Override // androidx.recyclerview.widget.g
    public final int h(j54 j54Var) {
        return S0(j54Var);
    }

    public final View h1() {
        return F(this.B ? G() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean i() {
        return this.f == 0;
    }

    public final boolean i1() {
        return this.t.getLayoutDirection() == 1;
    }

    public void j1(e54 e54Var, j54 j54Var, hv2 hv2Var, gv2 gv2Var) {
        int i;
        int iN;
        int i2;
        int iN2;
        View viewY = hv2Var.y(e54Var);
        if (viewY == null) {
            gv2Var.y = true;
            return;
        }
        y44 y44Var = (y44) viewY.getLayoutParams();
        List list = hv2Var.m;
        boolean z = this.B;
        int i3 = hv2Var.x;
        if (list == null) {
            if (z == (i3 == -1)) {
                q(viewY, -1, false);
            } else {
                q(viewY, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                q(viewY, -1, true);
            } else {
                q(viewY, 0, true);
            }
        }
        y44 y44Var2 = (y44) viewY.getLayoutParams();
        Rect rectP = this.t.P(viewY);
        int i4 = rectP.left + rectP.right;
        int i5 = rectP.top + rectP.bottom;
        int iH = g.H(i(), this.h, this.u, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) y44Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y44Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) y44Var2).width);
        int iH2 = g.H(b(), this.o, this.z, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) y44Var2).topMargin + ((ViewGroup.MarginLayoutParams) y44Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) y44Var2).height);
        if (K0(viewY, iH, iH2, y44Var2)) {
            viewY.measure(iH, iH2);
        }
        gv2Var.g = this.d.r(viewY);
        if (this.f == 1) {
            if (i1()) {
                iN2 = this.h - getPaddingRight();
                iN = iN2 - this.d.n(viewY);
            } else {
                int paddingLeft = getPaddingLeft();
                iN2 = this.d.n(viewY) + paddingLeft;
                iN = paddingLeft;
            }
            int i6 = hv2Var.x;
            i2 = hv2Var.y;
            int i7 = gv2Var.g;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iN3 = this.d.n(viewY) + paddingTop;
            int i9 = hv2Var.x;
            int i10 = hv2Var.y;
            int i11 = gv2Var.g;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iN2 = i10;
                i2 = paddingTop;
                i = iN3;
                iN = i12;
            } else {
                int i13 = i10 + i11;
                i = iN3;
                iN = i10;
                i2 = paddingTop;
                iN2 = i13;
            }
        }
        g.Y(viewY, iN, i2, iN2, i);
        if (y44Var.j.a() || y44Var.j.w()) {
            gv2Var.r = true;
        }
        gv2Var.n = viewY.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.g
    public final int k(j54 j54Var) {
        return S0(j54Var);
    }

    public final void l1(e54 e54Var, hv2 hv2Var) {
        if (!hv2Var.g || hv2Var.q) {
            return;
        }
        int i = hv2Var.l;
        int i2 = hv2Var.t;
        if (hv2Var.x == -1) {
            int iG = G();
            if (i < 0) {
                return;
            }
            int iX = (this.d.x() - i) + i2;
            if (this.B) {
                for (int i3 = 0; i3 < iG; i3++) {
                    View viewF = F(i3);
                    if (this.d.v(viewF) < iX || this.d.c(viewF) < iX) {
                        m1(e54Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iG - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewF2 = F(i5);
                if (this.d.v(viewF2) < iX || this.d.c(viewF2) < iX) {
                    m1(e54Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iG2 = G();
        if (!this.B) {
            for (int i7 = 0; i7 < iG2; i7++) {
                View viewF3 = F(i7);
                if (this.d.y(viewF3) > i6 || this.d.w(viewF3) > i6) {
                    m1(e54Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iG2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewF4 = F(i9);
            if (this.d.y(viewF4) > i6 || this.d.w(viewF4) > i6) {
                m1(e54Var, i8, i9);
                return;
            }
        }
    }

    public final void m1(e54 e54Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                z0(i, e54Var);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                z0(i3, e54Var);
            }
        }
    }

    public final void n1() {
        if (this.f == 1 || !i1()) {
            this.B = this.A;
        } else {
            this.B = !this.A;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public int o(j54 j54Var) {
        return T0(j54Var);
    }

    public final int o1(int i, e54 e54Var, j54 j54Var) {
        if (G() != 0 && i != 0) {
            W0();
            this.k.g = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            s1(i2, iAbs, true, j54Var);
            hv2 hv2Var = this.k;
            int iX0 = X0(e54Var, hv2Var, j54Var, false) + hv2Var.l;
            if (iX0 >= 0) {
                if (iAbs > iX0) {
                    i = i2 * iX0;
                }
                this.d.i(-i);
                this.k.a = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:138:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.g
    public void p0(e54 e54Var, j54 j54Var) {
        View focusedChild;
        int iY;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewD1;
        boolean z3;
        vm3 vm3Var;
        int iV;
        int iY2;
        int iA;
        int iL;
        boolean z4;
        boolean z5;
        y44 y44Var;
        int i;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int iE1;
        int i6;
        View viewB;
        int iV2;
        int iL2;
        int i7;
        int i8 = -1;
        if (!(this.G == null && this.E == -1) && j54Var.y() == 0) {
            w0(e54Var);
            return;
        }
        iv2 iv2Var = this.G;
        if (iv2Var != null && (i7 = iv2Var.j) >= 0) {
            this.E = i7;
        }
        W0();
        boolean z6 = false;
        this.k.g = false;
        n1();
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.j.r.contains(focusedChild)) {
            focusedChild = null;
        }
        fv2 fv2Var = this.H;
        if (!fv2Var.v || this.E != -1 || this.G != null) {
            fv2Var.r();
            fv2Var.n = this.B ^ this.C;
            if (j54Var.l || (i = this.E) == -1) {
                if (G() != 0) {
                    recyclerView = this.t;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.j.r.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        y44Var = (y44) focusedChild2.getLayoutParams();
                        if (!y44Var.j.a() || y44Var.j.n() < 0 || y44Var.j.n() >= j54Var.y()) {
                            z = this.e;
                            z2 = this.C;
                            if (z == z2 || (viewD1 = d1(e54Var, j54Var, fv2Var.n, z2)) == null) {
                                fv2Var.g();
                                if (this.C) {
                                    iY = j54Var.y() - 1;
                                } else {
                                    iY = 0;
                                }
                                fv2Var.y = iY;
                            } else {
                                int iR = g.R(viewD1);
                                z3 = fv2Var.n;
                                vm3Var = fv2Var.g;
                                if (z3) {
                                    fv2Var.r = fv2Var.g.q() + vm3Var.y(viewD1);
                                } else {
                                    fv2Var.r = vm3Var.v(viewD1);
                                }
                                fv2Var.y = iR;
                                if (!j54Var.l && P0()) {
                                    iV = this.d.v(viewD1);
                                    iY2 = this.d.y(viewD1);
                                    iA = this.d.a();
                                    iL = this.d.l();
                                    if (iY2 <= iA || iV >= iA) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iV >= iL || iY2 <= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (fv2Var.n) {
                                            iA = iL;
                                        }
                                        fv2Var.r = iA;
                                    }
                                }
                            }
                        } else {
                            fv2Var.y(focusedChild2, g.R(focusedChild2));
                        }
                    } else {
                        z = this.e;
                        z2 = this.C;
                        if (z == z2) {
                            fv2Var.g();
                            if (this.C) {
                                iY = j54Var.y() - 1;
                            } else {
                                iY = 0;
                            }
                            fv2Var.y = iY;
                        } else {
                            int iR2 = g.R(viewD1);
                            z3 = fv2Var.n;
                            vm3Var = fv2Var.g;
                            if (z3) {
                                fv2Var.r = fv2Var.g.q() + vm3Var.y(viewD1);
                            } else {
                                fv2Var.r = vm3Var.v(viewD1);
                            }
                            fv2Var.y = iR2;
                            if (!j54Var.l) {
                                iV = this.d.v(viewD1);
                                iY2 = this.d.y(viewD1);
                                iA = this.d.a();
                                iL = this.d.l();
                                if (iY2 <= iA) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iV >= iL) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (fv2Var.n) {
                                        iA = iL;
                                    }
                                    fv2Var.r = iA;
                                } else {
                                    if (fv2Var.n) {
                                        iA = iL;
                                    }
                                    fv2Var.r = iA;
                                }
                            }
                        }
                    }
                } else {
                    fv2Var.g();
                    if (this.C) {
                        iY = j54Var.y() - 1;
                    } else {
                        iY = 0;
                    }
                    fv2Var.y = iY;
                }
            } else if (i < 0 || i >= j54Var.y()) {
                this.E = -1;
                this.F = Integer.MIN_VALUE;
                if (G() != 0) {
                    recyclerView = this.t;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        y44Var = (y44) focusedChild2.getLayoutParams();
                        if (y44Var.j.a()) {
                            z = this.e;
                            z2 = this.C;
                            if (z == z2) {
                                fv2Var.g();
                                if (this.C) {
                                    iY = j54Var.y() - 1;
                                } else {
                                    iY = 0;
                                }
                                fv2Var.y = iY;
                            } else {
                                int iR3 = g.R(viewD1);
                                z3 = fv2Var.n;
                                vm3Var = fv2Var.g;
                                if (z3) {
                                    fv2Var.r = fv2Var.g.q() + vm3Var.y(viewD1);
                                } else {
                                    fv2Var.r = vm3Var.v(viewD1);
                                }
                                fv2Var.y = iR3;
                                if (!j54Var.l) {
                                    iV = this.d.v(viewD1);
                                    iY2 = this.d.y(viewD1);
                                    iA = this.d.a();
                                    iL = this.d.l();
                                    if (iY2 <= iA) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iV >= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (fv2Var.n) {
                                            iA = iL;
                                        }
                                        fv2Var.r = iA;
                                    } else {
                                        if (fv2Var.n) {
                                            iA = iL;
                                        }
                                        fv2Var.r = iA;
                                    }
                                }
                            }
                        } else {
                            z = this.e;
                            z2 = this.C;
                            if (z == z2) {
                                fv2Var.g();
                                if (this.C) {
                                    iY = j54Var.y() - 1;
                                } else {
                                    iY = 0;
                                }
                                fv2Var.y = iY;
                            } else {
                                int iR4 = g.R(viewD1);
                                z3 = fv2Var.n;
                                vm3Var = fv2Var.g;
                                if (z3) {
                                    fv2Var.r = fv2Var.g.q() + vm3Var.y(viewD1);
                                } else {
                                    fv2Var.r = vm3Var.v(viewD1);
                                }
                                fv2Var.y = iR4;
                                if (!j54Var.l) {
                                    iV = this.d.v(viewD1);
                                    iY2 = this.d.y(viewD1);
                                    iA = this.d.a();
                                    iL = this.d.l();
                                    if (iY2 <= iA) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iV >= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (fv2Var.n) {
                                            iA = iL;
                                        }
                                        fv2Var.r = iA;
                                    } else {
                                        if (fv2Var.n) {
                                            iA = iL;
                                        }
                                        fv2Var.r = iA;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.e;
                        z2 = this.C;
                        if (z == z2) {
                            fv2Var.g();
                            if (this.C) {
                                iY = j54Var.y() - 1;
                            } else {
                                iY = 0;
                            }
                            fv2Var.y = iY;
                        } else {
                            int iR5 = g.R(viewD1);
                            z3 = fv2Var.n;
                            vm3Var = fv2Var.g;
                            if (z3) {
                                fv2Var.r = fv2Var.g.q() + vm3Var.y(viewD1);
                            } else {
                                fv2Var.r = vm3Var.v(viewD1);
                            }
                            fv2Var.y = iR5;
                            if (!j54Var.l) {
                                iV = this.d.v(viewD1);
                                iY2 = this.d.y(viewD1);
                                iA = this.d.a();
                                iL = this.d.l();
                                if (iY2 <= iA) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iV >= iL) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (fv2Var.n) {
                                        iA = iL;
                                    }
                                    fv2Var.r = iA;
                                } else {
                                    if (fv2Var.n) {
                                        iA = iL;
                                    }
                                    fv2Var.r = iA;
                                }
                            }
                        }
                    }
                } else {
                    fv2Var.g();
                    if (this.C) {
                        iY = j54Var.y() - 1;
                    } else {
                        iY = 0;
                    }
                    fv2Var.y = iY;
                }
            } else {
                int i9 = this.E;
                fv2Var.y = i9;
                iv2 iv2Var2 = this.G;
                if (iv2Var2 != null && iv2Var2.j >= 0) {
                    boolean z7 = iv2Var2.a;
                    fv2Var.n = z7;
                    vm3 vm3Var2 = this.d;
                    if (z7) {
                        fv2Var.r = vm3Var2.l() - this.G.t;
                    } else {
                        fv2Var.r = vm3Var2.a() + this.G.t;
                    }
                } else if (this.F == Integer.MIN_VALUE) {
                    View viewB2 = B(i9);
                    if (viewB2 == null) {
                        if (G() > 0) {
                            fv2Var.n = (this.E < g.R(F(0))) == this.B;
                        }
                        fv2Var.g();
                    } else if (this.d.r(viewB2) > this.d.m()) {
                        fv2Var.g();
                    } else {
                        int iV3 = this.d.v(viewB2) - this.d.a();
                        vm3 vm3Var3 = this.d;
                        if (iV3 < 0) {
                            fv2Var.r = vm3Var3.a();
                            fv2Var.n = false;
                        } else if (vm3Var3.l() - this.d.y(viewB2) < 0) {
                            fv2Var.r = this.d.l();
                            fv2Var.n = true;
                        } else {
                            boolean z8 = fv2Var.n;
                            vm3 vm3Var4 = this.d;
                            fv2Var.r = z8 ? this.d.q() + vm3Var4.y(viewB2) : vm3Var4.v(viewB2);
                        }
                    }
                } else {
                    boolean z9 = this.B;
                    fv2Var.n = z9;
                    vm3 vm3Var5 = this.d;
                    if (z9) {
                        fv2Var.r = vm3Var5.l() - this.F;
                    } else {
                        fv2Var.r = vm3Var5.a() + this.F;
                    }
                }
            }
            fv2Var.v = true;
        } else if (focusedChild != null && (this.d.v(focusedChild) >= this.d.l() || this.d.y(focusedChild) <= this.d.a())) {
            fv2Var.y(focusedChild, g.R(focusedChild));
        }
        hv2 hv2Var = this.k;
        hv2Var.x = hv2Var.a >= 0 ? 1 : -1;
        int[] iArr = this.K;
        iArr[0] = 0;
        iArr[1] = 0;
        Q0(j54Var, iArr);
        int iA2 = this.d.a() + Math.max(0, iArr[0]);
        int iJ = this.d.j() + Math.max(0, iArr[1]);
        if (j54Var.l && (i6 = this.E) != -1 && this.F != Integer.MIN_VALUE && (viewB = B(i6)) != null) {
            boolean z10 = this.B;
            vm3 vm3Var6 = this.d;
            if (z10) {
                iL2 = vm3Var6.l() - this.d.y(viewB);
                iV2 = this.F;
            } else {
                iV2 = vm3Var6.v(viewB) - this.d.a();
                iL2 = this.F;
            }
            int i10 = iL2 - iV2;
            if (i10 > 0) {
                iA2 += i10;
            } else {
                iJ -= i10;
            }
        }
        boolean z11 = fv2Var.n;
        boolean z12 = this.B;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        k1(e54Var, j54Var, fv2Var, i8);
        A(e54Var);
        this.k.q = this.d.t() == 0 && this.d.x() == 0;
        this.k.getClass();
        this.k.t = 0;
        boolean z13 = fv2Var.n;
        int i11 = fv2Var.y;
        if (z13) {
            u1(i11, fv2Var.r);
            hv2 hv2Var2 = this.k;
            hv2Var2.j = iA2;
            X0(e54Var, hv2Var2, j54Var, false);
            hv2 hv2Var3 = this.k;
            i3 = hv2Var3.y;
            int i12 = hv2Var3.n;
            int i13 = hv2Var3.r;
            if (i13 > 0) {
                iJ += i13;
            }
            t1(fv2Var.y, fv2Var.r);
            hv2 hv2Var4 = this.k;
            hv2Var4.j = iJ;
            hv2Var4.n += hv2Var4.v;
            X0(e54Var, hv2Var4, j54Var, false);
            hv2 hv2Var5 = this.k;
            i2 = hv2Var5.y;
            int i14 = hv2Var5.r;
            if (i14 > 0) {
                u1(i12, i3);
                hv2 hv2Var6 = this.k;
                hv2Var6.j = i14;
                X0(e54Var, hv2Var6, j54Var, false);
                i3 = this.k.y;
            }
        } else {
            t1(i11, fv2Var.r);
            hv2 hv2Var7 = this.k;
            hv2Var7.j = iJ;
            X0(e54Var, hv2Var7, j54Var, false);
            hv2 hv2Var8 = this.k;
            i2 = hv2Var8.y;
            int i15 = hv2Var8.n;
            int i16 = hv2Var8.r;
            if (i16 > 0) {
                iA2 += i16;
            }
            u1(fv2Var.y, fv2Var.r);
            hv2 hv2Var9 = this.k;
            hv2Var9.j = iA2;
            hv2Var9.n += hv2Var9.v;
            X0(e54Var, hv2Var9, j54Var, false);
            hv2 hv2Var10 = this.k;
            int i17 = hv2Var10.y;
            int i18 = hv2Var10.r;
            if (i18 > 0) {
                t1(i15, i2);
                hv2 hv2Var11 = this.k;
                hv2Var11.j = i18;
                X0(e54Var, hv2Var11, j54Var, false);
                i2 = this.k.y;
            }
            i3 = i17;
        }
        if (G() > 0) {
            if (this.B ^ this.C) {
                int iE2 = e1(i2, e54Var, j54Var, true);
                i4 = i3 + iE2;
                i5 = i2 + iE2;
                iE1 = f1(i4, e54Var, j54Var, false);
            } else {
                int iF1 = f1(i3, e54Var, j54Var, true);
                i4 = i3 + iF1;
                i5 = i2 + iF1;
                iE1 = e1(i5, e54Var, j54Var, false);
            }
            i3 = i4 + iE1;
            i2 = i5 + iE1;
        }
        if (j54Var.m && G() != 0 && !j54Var.l && P0()) {
            List list2 = e54Var.n;
            int size = list2.size();
            int iR6 = g.R(F(0));
            int i19 = 0;
            int iR7 = 0;
            int iR8 = 0;
            while (i19 < size) {
                n54 n54Var = (n54) list2.get(i19);
                boolean zA = n54Var.a();
                View view = n54Var.g;
                if (!zA) {
                    boolean z14 = n54Var.n() < iR6 ? true : z6;
                    boolean z15 = this.B;
                    vm3 vm3Var7 = this.d;
                    if (z14 != z15) {
                        iR7 += vm3Var7.r(view);
                    } else {
                        iR8 += vm3Var7.r(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.k.m = list2;
            if (iR7 > 0) {
                u1(g.R(h1()), i3);
                hv2 hv2Var12 = this.k;
                hv2Var12.j = iR7;
                r4 = 0;
                hv2Var12.r = 0;
                hv2Var12.g(null);
                X0(e54Var, this.k, j54Var, false);
            } else {
                r4 = 0;
            }
            if (iR8 > 0) {
                t1(g.R(g1()), i2);
                hv2 hv2Var13 = this.k;
                hv2Var13.j = iR8;
                hv2Var13.r = r4;
                list = null;
                hv2Var13.g(null);
                X0(e54Var, this.k, j54Var, r4);
            } else {
                list = null;
            }
            this.k.m = list;
        }
        if (j54Var.l) {
            fv2Var.r();
        } else {
            vm3 vm3Var8 = this.d;
            vm3Var8.y = vm3Var8.m();
        }
        this.e = this.C;
    }

    public final void p1(int i, int i2) {
        this.E = i;
        this.F = i2;
        iv2 iv2Var = this.G;
        if (iv2Var != null) {
            iv2Var.j = -1;
        }
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public void q0(j54 j54Var) {
        this.G = null;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.H.r();
    }

    public final void q1(int i) {
        if (i != 0 && i != 1) {
            l0.u(xi3.j("invalid orientation:", i));
            return;
        }
        w(null);
        if (i != this.f || this.d == null) {
            vm3 vm3VarG = vm3.g(this, i);
            this.d = vm3VarG;
            this.H.g = vm3VarG;
            this.f = i;
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof iv2) {
            iv2 iv2Var = (iv2) parcelable;
            this.G = iv2Var;
            if (this.E != -1) {
                iv2Var.j = -1;
            }
            B0();
        }
    }

    public void r1(boolean z) {
        w(null);
        if (this.C == z) {
            return;
        }
        this.C = z;
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public final Parcelable s0() {
        iv2 iv2Var = this.G;
        if (iv2Var != null) {
            iv2 iv2Var2 = new iv2();
            iv2Var2.j = iv2Var.j;
            iv2Var2.t = iv2Var.t;
            iv2Var2.a = iv2Var.a;
            return iv2Var2;
        }
        iv2 iv2Var3 = new iv2();
        if (G() <= 0) {
            iv2Var3.j = -1;
            return iv2Var3;
        }
        W0();
        boolean z = this.e ^ this.B;
        iv2Var3.a = z;
        if (z) {
            View viewG1 = g1();
            iv2Var3.t = this.d.l() - this.d.y(viewG1);
            iv2Var3.j = g.R(viewG1);
            return iv2Var3;
        }
        View viewH1 = h1();
        iv2Var3.j = g.R(viewH1);
        iv2Var3.t = this.d.v(viewH1) - this.d.a();
        return iv2Var3;
    }

    public final void s1(int i, int i2, boolean z, j54 j54Var) {
        int iA;
        this.k.q = this.d.t() == 0 && this.d.x() == 0;
        this.k.x = i;
        int[] iArr = this.K;
        iArr[0] = 0;
        iArr[1] = 0;
        Q0(j54Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        hv2 hv2Var = this.k;
        int i3 = z2 ? iMax2 : iMax;
        hv2Var.j = i3;
        if (!z2) {
            iMax = iMax2;
        }
        hv2Var.t = iMax;
        if (z2) {
            hv2Var.j = this.d.j() + i3;
            View viewG1 = g1();
            hv2 hv2Var2 = this.k;
            hv2Var2.v = this.B ? -1 : 1;
            int iR = g.R(viewG1);
            hv2 hv2Var3 = this.k;
            hv2Var2.n = iR + hv2Var3.v;
            hv2Var3.y = this.d.y(viewG1);
            iA = this.d.y(viewG1) - this.d.l();
        } else {
            View viewH1 = h1();
            hv2 hv2Var4 = this.k;
            hv2Var4.j = this.d.a() + hv2Var4.j;
            hv2 hv2Var5 = this.k;
            hv2Var5.v = this.B ? 1 : -1;
            int iR2 = g.R(viewH1);
            hv2 hv2Var6 = this.k;
            hv2Var5.n = iR2 + hv2Var6.v;
            hv2Var6.y = this.d.v(viewH1);
            iA = (-this.d.v(viewH1)) + this.d.a();
        }
        hv2 hv2Var7 = this.k;
        hv2Var7.r = i2;
        if (z) {
            hv2Var7.r = i2 - iA;
        }
        hv2Var7.l = iA;
    }

    public final void t1(int i, int i2) {
        this.k.r = this.d.l() - i2;
        hv2 hv2Var = this.k;
        hv2Var.v = this.B ? -1 : 1;
        hv2Var.n = i;
        hv2Var.x = 1;
        hv2Var.y = i2;
        hv2Var.l = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.g
    public final void u(int i, int i2, j54 j54Var, si0 si0Var) {
        if (this.f != 0) {
            i = i2;
        }
        if (G() == 0 || i == 0) {
            return;
        }
        W0();
        s1(i > 0 ? 1 : -1, Math.abs(i), true, j54Var);
        R0(j54Var, this.k, si0Var);
    }

    @Override // androidx.recyclerview.widget.g
    public boolean u0(int i, Bundle bundle) {
        int iMin;
        if (super.u0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.t;
                iMin = Math.min(i2, T(recyclerView.a, recyclerView.o0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.t;
                iMin = Math.min(i3, I(recyclerView2.a, recyclerView2.o0) - 1);
            }
            if (iMin >= 0) {
                p1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final void u1(int i, int i2) {
        this.k.r = i2 - this.d.a();
        hv2 hv2Var = this.k;
        hv2Var.n = i;
        hv2Var.v = this.B ? 1 : -1;
        hv2Var.x = -1;
        hv2Var.y = i2;
        hv2Var.l = Integer.MIN_VALUE;
    }

    @Override // defpackage.i54
    public final PointF v(int i) {
        if (G() == 0) {
            return null;
        }
        int i2 = (i < g.R(F(0))) != this.B ? -1 : 1;
        return this.f == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.g
    public final void w(String str) {
        if (this.G == null) {
            super.w(str);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void z(int i, si0 si0Var) {
        boolean z;
        int i2;
        iv2 iv2Var = this.G;
        if (iv2Var == null || (i2 = iv2Var.j) < 0) {
            n1();
            z = this.B;
            i2 = this.E;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = iv2Var.a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.J && i2 >= 0 && i2 < i; i4++) {
            si0Var.g(i2, 0);
            i2 += i3;
        }
    }

    public LinearLayoutManager(int i) {
        this.f = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = null;
        this.H = new fv2();
        this.I = new gv2();
        this.J = (byte) 2;
        this.K = new int[2];
        q1(i);
        w(null);
        if (this.A) {
            this.A = false;
            B0();
        }
    }

    public void k1(e54 e54Var, j54 j54Var, fv2 fv2Var, int i) {
    }
}
