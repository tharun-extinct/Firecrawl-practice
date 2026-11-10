package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.cd2;
import defpackage.du4;
import defpackage.e54;
import defpackage.f2;
import defpackage.fv2;
import defpackage.gv2;
import defpackage.hv2;
import defpackage.i42;
import defpackage.j54;
import defpackage.l0;
import defpackage.l2;
import defpackage.m2;
import defpackage.n54;
import defpackage.p44;
import defpackage.si0;
import defpackage.uo1;
import defpackage.vm3;
import defpackage.xi3;
import defpackage.xk5;
import defpackage.y44;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set W = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean L;
    public int M;
    public int[] N;
    public View[] O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final cd2 R;
    public final Rect S;
    public int T;
    public int U;
    public int V;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.L = false;
        this.M = -1;
        this.P = new SparseIntArray();
        this.Q = new SparseIntArray();
        this.R = new cd2((byte) 13);
        this.S = new Rect();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        G1(g.S(context, attributeSet, i, i2).y);
    }

    public final HashSet A1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.t;
        int iE1 = E1(i2, recyclerView.a, recyclerView.o0);
        for (int i3 = i; i3 < i + iE1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int B1(int i, int i2) {
        if (this.f != 1 || !i1()) {
            int[] iArr = this.N;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.N;
        int i3 = this.M;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 C() {
        return this.f == 0 ? new i42(-2, -1) : new i42(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int C0(int i, e54 e54Var, j54 j54Var) {
        H1();
        w1();
        return super.C0(i, e54Var, j54Var);
    }

    public final int C1(int i, e54 e54Var, j54 j54Var) {
        boolean z = j54Var.l;
        cd2 cd2Var = this.R;
        if (!z) {
            int i2 = this.M;
            cd2Var.getClass();
            return cd2.u(i, i2);
        }
        int iY = e54Var.y(i);
        if (iY != -1) {
            int i3 = this.M;
            cd2Var.getClass();
            return cd2.u(iY, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 D(Context context, AttributeSet attributeSet) {
        i42 i42Var = new i42(context, attributeSet);
        i42Var.q = -1;
        i42Var.w = 0;
        return i42Var;
    }

    public final int D1(int i, e54 e54Var, j54 j54Var) {
        boolean z = j54Var.l;
        cd2 cd2Var = this.R;
        if (!z) {
            int i2 = this.M;
            cd2Var.getClass();
            return i % i2;
        }
        int i3 = this.Q.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iY = e54Var.y(i);
        if (iY != -1) {
            int i4 = this.M;
            cd2Var.getClass();
            return iY % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i42 i42Var = new i42((ViewGroup.MarginLayoutParams) layoutParams);
            i42Var.q = -1;
            i42Var.w = 0;
            return i42Var;
        }
        i42 i42Var2 = new i42(layoutParams);
        i42Var2.q = -1;
        i42Var2.w = 0;
        return i42Var2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int E0(int i, e54 e54Var, j54 j54Var) {
        H1();
        w1();
        return super.E0(i, e54Var, j54Var);
    }

    public final int E1(int i, e54 e54Var, j54 j54Var) {
        boolean z = j54Var.l;
        cd2 cd2Var = this.R;
        if (!z) {
            cd2Var.getClass();
            return 1;
        }
        int i2 = this.P.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (e54Var.y(i) != -1) {
            cd2Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void F1(View view, int i, boolean z) {
        int iH;
        int iH2;
        i42 i42Var = (i42) view.getLayoutParams();
        Rect rect = i42Var.t;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) i42Var).topMargin + ((ViewGroup.MarginLayoutParams) i42Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) i42Var).leftMargin + ((ViewGroup.MarginLayoutParams) i42Var).rightMargin;
        int iB1 = B1(i42Var.q, i42Var.w);
        if (this.f == 1) {
            iH2 = g.H(false, iB1, i, i3, ((ViewGroup.MarginLayoutParams) i42Var).width);
            iH = g.H(true, this.d.m(), this.z, i2, ((ViewGroup.MarginLayoutParams) i42Var).height);
        } else {
            int iH3 = g.H(false, iB1, i, i2, ((ViewGroup.MarginLayoutParams) i42Var).height);
            int iH4 = g.H(true, this.d.m(), this.u, i3, ((ViewGroup.MarginLayoutParams) i42Var).width);
            iH = iH3;
            iH2 = iH4;
        }
        y44 y44Var = (y44) view.getLayoutParams();
        if (z ? M0(view, iH2, iH, y44Var) : K0(view, iH2, iH, y44Var)) {
            view.measure(iH2, iH);
        }
    }

    public final void G1(int i) {
        if (i == this.M) {
            return;
        }
        this.L = true;
        if (i < 1) {
            l0.u(xi3.j("Span count should be at least 1. Provided ", i));
            return;
        }
        this.M = i;
        this.R.h();
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public final void H0(Rect rect, int i, int i2) {
        int iP;
        int iP2;
        if (this.N == null) {
            super.H0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.t;
            WeakHashMap weakHashMap = xk5.g;
            iP2 = g.p(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.N;
            iP = g.p(i, iArr[iArr.length - 1] + paddingRight, this.t.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.t;
            WeakHashMap weakHashMap2 = xk5.g;
            iP = g.p(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.N;
            iP2 = g.p(i2, iArr2[iArr2.length - 1] + paddingBottom, this.t.getMinimumHeight());
        }
        this.t.setMeasuredDimension(iP, iP2);
    }

    public final void H1() {
        int paddingBottom;
        int paddingTop;
        if (this.f == 1) {
            paddingBottom = this.h - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.o - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        v1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.g
    public final int I(e54 e54Var, j54 j54Var) {
        if (this.f == 1) {
            return Math.min(this.M, Q());
        }
        if (j54Var.y() < 1) {
            return 0;
        }
        return C1(j54Var.y() - 1, e54Var, j54Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final boolean P0() {
        return this.G == null && !this.L;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(j54 j54Var, hv2 hv2Var, si0 si0Var) {
        int i;
        int i2 = this.M;
        for (int i3 = 0; i3 < this.M && (i = hv2Var.n) >= 0 && i < j54Var.y() && i2 > 0; i3++) {
            si0Var.g(hv2Var.n, Math.max(0, hv2Var.l));
            this.R.getClass();
            i2--;
            hv2Var.n += hv2Var.v;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final int T(e54 e54Var, j54 j54Var) {
        if (this.f == 0) {
            return Math.min(this.M, Q());
        }
        if (j54Var.y() < 1) {
            return 0;
        }
        return C1(j54Var.y() - 1, e54Var, j54Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int d(j54 j54Var) {
        return T0(j54Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View d1(e54 e54Var, j54 j54Var, boolean z, boolean z2) {
        int i;
        int iG;
        int iG2 = G();
        int i2 = 1;
        if (z2) {
            iG = G() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iG2;
            iG = 0;
        }
        int iY = j54Var.y();
        W0();
        int iA = this.d.a();
        int iL = this.d.l();
        View view = null;
        View view2 = null;
        while (iG != i) {
            View viewF = F(iG);
            int iR = g.R(viewF);
            if (iR >= 0 && iR < iY && D1(iR, e54Var, j54Var) == 0) {
                if (((y44) viewF.getLayoutParams()).j.a()) {
                    if (view2 == null) {
                        view2 = viewF;
                    }
                } else {
                    if (this.d.v(viewF) < iL && this.d.y(viewF) >= iA) {
                        return viewF;
                    }
                    if (view == null) {
                        view = viewF;
                    }
                }
            }
            iG += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int e(j54 j54Var) {
        return U0(j54Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View e0(android.view.View r23, int r24, defpackage.e54 r25, defpackage.j54 r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.e0(android.view.View, int, e54, j54):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int f(j54 j54Var) {
        return U0(j54Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final void g0(e54 e54Var, j54 j54Var, m2 m2Var) {
        super.g0(e54Var, j54Var, m2Var);
        m2Var.d(GridView.class.getName());
        p44 p44Var = this.t.z;
        if (p44Var == null || p44Var.g() <= 1) {
            return;
        }
        m2Var.y(f2.s);
    }

    @Override // androidx.recyclerview.widget.g
    public final void h0(e54 e54Var, j54 j54Var, View view, m2 m2Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof i42)) {
            i0(view, m2Var);
            return;
        }
        i42 i42Var = (i42) layoutParams;
        int iC1 = C1(i42Var.j.n(), e54Var, j54Var);
        int i = this.f;
        int i2 = i42Var.q;
        int i3 = i42Var.w;
        if (i == 0) {
            m2Var.B(l2.g(false, i2, i3, iC1, 1));
        } else {
            m2Var.B(l2.g(false, iC1, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void j0(int i, int i2) {
        cd2 cd2Var = this.R;
        cd2Var.h();
        ((SparseIntArray) cd2Var.a).clear();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01df  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0221  */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:130:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4 A[LOOP:1: B:49:0x00a2->B:50:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0142  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(e54 e54Var, j54 j54Var, hv2 hv2Var, gv2 gv2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int iN;
        int iN2;
        int paddingLeft;
        int i11;
        View[] viewArr;
        View view;
        i42 i42Var;
        View view2;
        i42 i42Var2;
        int i12;
        int i13;
        int iB1;
        int iH;
        int iH2;
        int i14;
        int iR;
        View view3;
        boolean z;
        int iR2;
        float fN;
        int i15;
        View viewY;
        vm3 vm3Var = this.d;
        switch (vm3Var.n) {
            case 0:
                i = vm3Var.g.z;
                break;
            default:
                i = vm3Var.g.u;
                break;
        }
        boolean z2 = i != 1073741824;
        int i16 = G() > 0 ? this.N[this.M] : 0;
        if (z2) {
            H1();
        }
        boolean z3 = hv2Var.v == 1;
        int iD1 = this.M;
        if (!z3) {
            iD1 = D1(hv2Var.n, e54Var, j54Var) + E1(hv2Var.n, e54Var, j54Var);
        }
        for (int i17 = 0; i17 < this.M && (i15 = hv2Var.n) >= 0 && i15 < j54Var.y() && iD1 > 0; i17++) {
            int i18 = hv2Var.n;
            int iE1 = E1(i18, e54Var, j54Var);
            if (iE1 > this.M) {
                l0.u(xi3.m(du4.s(i18, iE1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.M, " spans."));
                return;
            }
            iD1 -= iE1;
            if (iD1 >= 0 && (viewY = hv2Var.y(e54Var)) != null) {
                this.O[i17] = viewY;
            } else {
                if (i17 == 0) {
                    gv2Var.y = true;
                    return;
                }
                if (z3) {
                    i4 = 1;
                    i3 = i17;
                    i2 = 0;
                } else {
                    i2 = i17 - 1;
                    i3 = -1;
                    i4 = -1;
                }
                i5 = 0;
                while (i2 != i3) {
                    View view4 = this.O[i2];
                    i42 i42Var3 = (i42) view4.getLayoutParams();
                    int iE2 = E1(g.R(view4), e54Var, j54Var);
                    i42Var3.w = iE2;
                    i42Var3.q = i5;
                    i5 += iE2;
                    i2 += i4;
                }
                f = 0.0f;
                i7 = 0;
                for (i6 = 0; i6 < i17; i6++) {
                    view3 = this.O[i6];
                    if (hv2Var.m == null) {
                        z = false;
                        if (z3) {
                            q(view3, -1, true);
                        } else {
                            q(view3, 0, true);
                        }
                    } else if (z3) {
                        z = false;
                        q(view3, -1, false);
                    } else {
                        z = false;
                        q(view3, 0, false);
                    }
                    c(this.S, view3);
                    F1(view3, i, z);
                    iR2 = this.d.r(view3);
                    if (iR2 > i7) {
                        i7 = iR2;
                    }
                    fN = (this.d.n(view3) * 1.0f) / ((i42) view3.getLayoutParams()).w;
                    if (fN > f) {
                        f = fN;
                    }
                }
                if (z2) {
                    v1(Math.max(Math.round(f * this.M), i16));
                    i7 = 0;
                    for (i14 = 0; i14 < i17; i14++) {
                        View view5 = this.O[i14];
                        F1(view5, 1073741824, true);
                        iR = this.d.r(view5);
                        if (iR > i7) {
                            i7 = iR;
                        }
                    }
                }
                for (i8 = 0; i8 < i17; i8++) {
                    view2 = this.O[i8];
                    if (this.d.r(view2) != i7) {
                        i42Var2 = (i42) view2.getLayoutParams();
                        Rect rect = i42Var2.t;
                        i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) i42Var2).topMargin + ((ViewGroup.MarginLayoutParams) i42Var2).bottomMargin;
                        i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) i42Var2).leftMargin + ((ViewGroup.MarginLayoutParams) i42Var2).rightMargin;
                        iB1 = B1(i42Var2.q, i42Var2.w);
                        if (this.f == 1) {
                            iH2 = g.H(false, iB1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) i42Var2).width);
                            iH = View.MeasureSpec.makeMeasureSpec(i7 - i12, 1073741824);
                        } else {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - i13, 1073741824);
                            iH = g.H(false, iB1, 1073741824, i12, ((ViewGroup.MarginLayoutParams) i42Var2).height);
                            iH2 = iMakeMeasureSpec;
                        }
                        if (M0(view2, iH2, iH, (y44) view2.getLayoutParams())) {
                            view2.measure(iH2, iH);
                        }
                    }
                }
                paddingTop = 0;
                gv2Var.g = i7;
                i9 = this.f;
                i10 = hv2Var.x;
                iN = hv2Var.y;
                if (i9 == 1) {
                    if (i10 == -1) {
                        paddingLeft = iN - i7;
                        iN2 = iN;
                    } else {
                        iN2 = iN + i7;
                        paddingLeft = iN;
                    }
                    iN = paddingTop;
                } else if (i10 == -1) {
                    paddingTop = iN - i7;
                    paddingLeft = 0;
                    iN2 = 0;
                } else {
                    iN2 = 0;
                    paddingTop = iN;
                    iN += i7;
                    paddingLeft = 0;
                }
                i11 = 0;
                while (true) {
                    viewArr = this.O;
                    if (i11 < i17) {
                        Arrays.fill(viewArr, (Object) null);
                        return;
                    }
                    view = viewArr[i11];
                    i42Var = (i42) view.getLayoutParams();
                    if (this.f == 1) {
                        paddingTop = getPaddingTop() + this.N[i42Var.q];
                        iN = this.d.n(view) + paddingTop;
                    } else if (i1()) {
                        int paddingLeft2 = getPaddingLeft() + this.N[this.M - i42Var.q];
                        iN2 = paddingLeft2;
                        paddingLeft = paddingLeft2 - this.d.n(view);
                    } else {
                        paddingLeft = getPaddingLeft() + this.N[i42Var.q];
                        iN2 = this.d.n(view) + paddingLeft;
                    }
                    g.Y(view, paddingLeft, paddingTop, iN2, iN);
                    if (i42Var.j.a() || i42Var.j.w()) {
                        gv2Var.r = true;
                    }
                    gv2Var.n = view.hasFocusable() | gv2Var.n;
                    i11++;
                }
            }
        }
        if (i17 == 0) {
            gv2Var.y = true;
            return;
        }
        if (z3) {
            i4 = 1;
            i3 = i17;
            i2 = 0;
        } else {
            i2 = i17 - 1;
            i3 = -1;
            i4 = -1;
        }
        i5 = 0;
        while (i2 != i3) {
            View view6 = this.O[i2];
            i42 i42Var4 = (i42) view6.getLayoutParams();
            int iE3 = E1(g.R(view6), e54Var, j54Var);
            i42Var4.w = iE3;
            i42Var4.q = i5;
            i5 += iE3;
            i2 += i4;
        }
        f = 0.0f;
        i7 = 0;
        while (i6 < i17) {
            view3 = this.O[i6];
            if (hv2Var.m == null) {
                z = false;
                if (z3) {
                    q(view3, -1, true);
                } else {
                    q(view3, 0, true);
                }
            } else if (z3) {
                z = false;
                q(view3, -1, false);
            } else {
                z = false;
                q(view3, 0, false);
            }
            c(this.S, view3);
            F1(view3, i, z);
            iR2 = this.d.r(view3);
            if (iR2 > i7) {
                i7 = iR2;
            }
            fN = (this.d.n(view3) * 1.0f) / ((i42) view3.getLayoutParams()).w;
            if (fN > f) {
                f = fN;
            }
        }
        if (z2) {
            v1(Math.max(Math.round(f * this.M), i16));
            i7 = 0;
            while (i14 < i17) {
                View view7 = this.O[i14];
                F1(view7, 1073741824, true);
                iR = this.d.r(view7);
                if (iR > i7) {
                    i7 = iR;
                }
            }
        }
        while (i8 < i17) {
            view2 = this.O[i8];
            if (this.d.r(view2) != i7) {
                i42Var2 = (i42) view2.getLayoutParams();
                Rect rect2 = i42Var2.t;
                i12 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) i42Var2).topMargin + ((ViewGroup.MarginLayoutParams) i42Var2).bottomMargin;
                i13 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) i42Var2).leftMargin + ((ViewGroup.MarginLayoutParams) i42Var2).rightMargin;
                iB1 = B1(i42Var2.q, i42Var2.w);
                if (this.f == 1) {
                    iH2 = g.H(false, iB1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) i42Var2).width);
                    iH = View.MeasureSpec.makeMeasureSpec(i7 - i12, 1073741824);
                } else {
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7 - i13, 1073741824);
                    iH = g.H(false, iB1, 1073741824, i12, ((ViewGroup.MarginLayoutParams) i42Var2).height);
                    iH2 = iMakeMeasureSpec2;
                }
                if (M0(view2, iH2, iH, (y44) view2.getLayoutParams())) {
                    view2.measure(iH2, iH);
                }
            }
        }
        paddingTop = 0;
        gv2Var.g = i7;
        i9 = this.f;
        i10 = hv2Var.x;
        iN = hv2Var.y;
        if (i9 == 1) {
            if (i10 == -1) {
                paddingLeft = iN - i7;
                iN2 = iN;
            } else {
                iN2 = iN + i7;
                paddingLeft = iN;
            }
            iN = paddingTop;
        } else if (i10 == -1) {
            paddingTop = iN - i7;
            paddingLeft = 0;
            iN2 = 0;
        } else {
            iN2 = 0;
            paddingTop = iN;
            iN += i7;
            paddingLeft = 0;
        }
        i11 = 0;
        while (true) {
            viewArr = this.O;
            if (i11 < i17) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            view = viewArr[i11];
            i42Var = (i42) view.getLayoutParams();
            if (this.f == 1) {
                paddingTop = getPaddingTop() + this.N[i42Var.q];
                iN = this.d.n(view) + paddingTop;
            } else if (i1()) {
                int paddingLeft3 = getPaddingLeft() + this.N[this.M - i42Var.q];
                iN2 = paddingLeft3;
                paddingLeft = paddingLeft3 - this.d.n(view);
            } else {
                paddingLeft = getPaddingLeft() + this.N[i42Var.q];
                iN2 = this.d.n(view) + paddingLeft;
            }
            g.Y(view, paddingLeft, paddingTop, iN2, iN);
            if (i42Var.j.a()) {
                gv2Var.r = true;
            } else {
                gv2Var.r = true;
            }
            gv2Var.n = view.hasFocusable() | gv2Var.n;
            i11++;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void k0() {
        cd2 cd2Var = this.R;
        cd2Var.h();
        ((SparseIntArray) cd2Var.a).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(e54 e54Var, j54 j54Var, fv2 fv2Var, int i) {
        H1();
        if (j54Var.y() > 0 && !j54Var.l) {
            boolean z = i == 1;
            int iD1 = D1(fv2Var.y, e54Var, j54Var);
            if (z) {
                while (iD1 > 0) {
                    int i2 = fv2Var.y;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    fv2Var.y = i3;
                    iD1 = D1(i3, e54Var, j54Var);
                }
            } else {
                int iY = j54Var.y() - 1;
                int i4 = fv2Var.y;
                while (i4 < iY) {
                    int i5 = i4 + 1;
                    int iD2 = D1(i5, e54Var, j54Var);
                    if (iD2 <= iD1) {
                        break;
                    }
                    i4 = i5;
                    iD1 = iD2;
                }
                fv2Var.y = i4;
            }
        }
        w1();
    }

    @Override // androidx.recyclerview.widget.g
    public final void l0(int i, int i2) {
        cd2 cd2Var = this.R;
        cd2Var.h();
        ((SparseIntArray) cd2Var.a).clear();
    }

    @Override // androidx.recyclerview.widget.g
    public final void m0(int i, int i2) {
        cd2 cd2Var = this.R;
        cd2Var.h();
        ((SparseIntArray) cd2Var.a).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final int o(j54 j54Var) {
        return T0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void o0(RecyclerView recyclerView, int i, int i2) {
        cd2 cd2Var = this.R;
        cd2Var.h();
        ((SparseIntArray) cd2Var.a).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final void p0(e54 e54Var, j54 j54Var) {
        boolean z = j54Var.l;
        SparseIntArray sparseIntArray = this.Q;
        SparseIntArray sparseIntArray2 = this.P;
        if (z) {
            int iG = G();
            for (int i = 0; i < iG; i++) {
                i42 i42Var = (i42) F(i).getLayoutParams();
                int iN = i42Var.j.n();
                sparseIntArray2.put(iN, i42Var.w);
                sparseIntArray.put(iN, i42Var.q);
            }
        }
        super.p0(e54Var, j54Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final void q0(j54 j54Var) {
        View viewB;
        super.q0(j54Var);
        this.L = false;
        int i = this.T;
        if (i == -1 || (viewB = B(i)) == null) {
            return;
        }
        viewB.sendAccessibilityEvent(67108864);
        this.T = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(boolean z) {
        if (z) {
            uo1.u("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.r1(false);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean s(y44 y44Var) {
        return y44Var instanceof i42;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.g
    public final boolean u0(int i, Bundle bundle) {
        View viewF;
        n54 n54VarN;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == f2.s.y() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= G()) {
                    viewF = null;
                    break;
                }
                View viewF2 = F(i5);
                Objects.requireNonNull(viewF2);
                if (viewF2.isAccessibilityFocused()) {
                    viewF = F(i5);
                    break;
                }
                i5++;
            }
            if (viewF != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (W.contains(Integer.valueOf(i6)) && (n54VarN = this.t.N(viewF)) != null) {
                    int iY = n54VarN.y();
                    int iY1 = y1(iY);
                    int iX1 = x1(iY);
                    if (iY1 >= 0 && iX1 >= 0) {
                        if (!z1(iY).contains(Integer.valueOf(this.U)) || !A1(x1(iY), iY).contains(Integer.valueOf(this.V))) {
                            this.U = iY1;
                            this.V = iX1;
                        }
                        int i7 = this.U;
                        if (i7 == -1) {
                            i7 = iY1;
                        }
                        int i8 = this.V;
                        if (i8 != -1) {
                            iX1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iY - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iY2 = y1(iIntValue);
                                    int iX2 = x1(iIntValue);
                                    if (iY2 >= 0 && iX2 >= 0) {
                                        if (this.f != 1) {
                                            if (z1(iIntValue).contains(Integer.valueOf(i7)) && iX2 < iX1) {
                                                this.V = iX2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iY2 == i7 && iX2 < iX1) || iY2 < i7) {
                                                this.U = iY2;
                                                this.V = iX2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iY1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < Q()) {
                                                    it2 = z1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iY1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.U = iIntValue2;
                                                                this.V = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iY1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < Q()) {
                                                it4 = z1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iY1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.U = iIntValue3;
                                                            this.V = x1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                D0(iIntValue);
                                this.T = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iY - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iY3 = y1(iIntValue);
                                    int iX3 = x1(iIntValue);
                                    if (iY3 >= 0 && iX3 >= 0) {
                                        if (this.f != 1) {
                                            if (iY3 < i7 && iX3 == iX1) {
                                                this.U = ((Integer) Collections.max(z1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iY3 < i7 && A1(x1(iIntValue), iIntValue).contains(Integer.valueOf(iX1))) {
                                                this.U = iY3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iY1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < Q()) {
                                                    it2 = z1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iY1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.U = iIntValue2;
                                                                this.V = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iY1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < Q()) {
                                                it4 = z1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iY1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.U = iIntValue3;
                                                            this.V = x1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                D0(iIntValue);
                                this.T = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iY + 1;
                            while (true) {
                                if (iIntValue < Q()) {
                                    int iY4 = y1(iIntValue);
                                    int iX4 = x1(iIntValue);
                                    if (iY4 >= 0 && iX4 >= 0) {
                                        if (this.f != 1) {
                                            if (iX4 > iX1 && z1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.V = iX4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iY4 == i7 && iX4 > iX1) || iY4 > i7) {
                                                this.U = iY4;
                                                this.V = iX4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iY1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < Q()) {
                                                    it2 = z1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iY1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.U = iIntValue2;
                                                                this.V = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iY1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < Q()) {
                                                it4 = z1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iY1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.U = iIntValue3;
                                                            this.V = x1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                D0(iIntValue);
                                this.T = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iY + 1;
                            while (true) {
                                if (iIntValue < Q()) {
                                    int iY5 = y1(iIntValue);
                                    int iX5 = x1(iIntValue);
                                    if (iY5 >= 0 && iX5 >= 0) {
                                        if (this.f != 1) {
                                            if (iY5 > i7 && iX5 == iX1) {
                                                this.U = y1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iY5 > i7 && (iX5 == iX1 || A1(x1(iIntValue), iIntValue).contains(Integer.valueOf(iX1)))) {
                                                this.U = iY5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.f) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iY1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < Q()) {
                                                it2 = z1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iY1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.U = iIntValue2;
                                                            this.V = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iY1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < Q()) {
                                            it4 = z1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iY1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.U = iIntValue3;
                                                        this.V = x1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                D0(iIntValue);
                                this.T = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.u0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iG = this.t.z.g();
                int i11 = 0;
                while (true) {
                    if (i11 >= iG) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.t;
                    int iD1 = D1(i11, recyclerView.a, recyclerView.o0);
                    RecyclerView recyclerView2 = this.t;
                    int iC1 = C1(i11, recyclerView2.a, recyclerView2.o0);
                    if (this.f != 1) {
                        if (iD1 == i9 && iC1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iD1 == i10 && iC1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    p1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    public final void v1(int i) {
        int i2;
        int[] iArr = this.N;
        int i3 = this.M;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.N = iArr;
    }

    public final void w1() {
        View[] viewArr = this.O;
        if (viewArr == null || viewArr.length != this.M) {
            this.O = new View[this.M];
        }
    }

    public final int x1(int i) {
        int i2 = this.f;
        RecyclerView recyclerView = this.t;
        return i2 == 0 ? C1(i, recyclerView.a, recyclerView.o0) : D1(i, recyclerView.a, recyclerView.o0);
    }

    public final int y1(int i) {
        int i2 = this.f;
        RecyclerView recyclerView = this.t;
        return i2 == 1 ? C1(i, recyclerView.a, recyclerView.o0) : D1(i, recyclerView.a, recyclerView.o0);
    }

    public final HashSet z1(int i) {
        return A1(y1(i), i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.L = false;
        this.M = -1;
        this.P = new SparseIntArray();
        this.Q = new SparseIntArray();
        this.R = new cd2((byte) 13);
        this.S = new Rect();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        G1(i);
    }
}
