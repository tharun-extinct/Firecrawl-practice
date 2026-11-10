package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.cd2;
import defpackage.cv4;
import defpackage.dv4;
import defpackage.e54;
import defpackage.ev4;
import defpackage.fv4;
import defpackage.gv4;
import defpackage.i54;
import defpackage.j54;
import defpackage.jv2;
import defpackage.kf6;
import defpackage.kp2;
import defpackage.l0;
import defpackage.l2;
import defpackage.m2;
import defpackage.ml;
import defpackage.si0;
import defpackage.vm3;
import defpackage.x44;
import defpackage.xk5;
import defpackage.y44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends g implements i54 {
    public final int A;
    public int B;
    public final kp2 C;
    public boolean D;
    public final BitSet F;
    public final cd2 I;
    public final byte J;
    public boolean K;
    public boolean L;
    public fv4 M;
    public final Rect N;
    public final cv4 O;
    public final boolean P;
    public int[] Q;
    public final ml R;
    public final vm3 d;
    public final vm3 e;
    public final int f;
    public final gv4[] k;
    public boolean E = false;
    public int G = -1;
    public int H = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f = -1;
        this.D = false;
        cd2 cd2Var = new cd2((byte) 19, false);
        this.I = cd2Var;
        this.J = (byte) 2;
        this.N = new Rect();
        this.O = new cv4(this);
        this.P = true;
        this.R = new ml((Object) this, (byte) 11);
        x44 x44VarS = g.S(context, attributeSet, i, i2);
        int i3 = x44VarS.g;
        if (i3 != 0 && i3 != 1) {
            l0.u("invalid orientation.");
            throw null;
        }
        w(null);
        if (i3 != this.A) {
            this.A = i3;
            vm3 vm3Var = this.d;
            this.d = this.e;
            this.e = vm3Var;
            B0();
        }
        int i4 = x44VarS.y;
        w(null);
        if (i4 != this.f) {
            cd2Var.q();
            B0();
            this.f = i4;
            this.F = new BitSet(this.f);
            this.k = new gv4[this.f];
            for (int i5 = 0; i5 < this.f; i5++) {
                this.k[i5] = new gv4(this, i5);
            }
            B0();
        }
        boolean z = x44VarS.r;
        w(null);
        fv4 fv4Var = this.M;
        if (fv4Var != null && fv4Var.i != z) {
            fv4Var.i = z;
        }
        this.D = z;
        B0();
        kp2 kp2Var = new kp2();
        kp2Var.g = true;
        kp2Var.x = 0;
        kp2Var.l = 0;
        this.C = kp2Var;
        this.d = vm3.g(this, this.A);
        this.e = vm3.g(this, 1 - this.A);
    }

    public static int q1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 C() {
        return this.A == 0 ? new dv4(-2, -1) : new dv4(-1, -2);
    }

    @Override // androidx.recyclerview.widget.g
    public final int C0(int i, e54 e54Var, j54 j54Var) {
        return m1(i, e54Var, j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 D(Context context, AttributeSet attributeSet) {
        return new dv4(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.g
    public final void D0(int i) {
        fv4 fv4Var = this.M;
        if (fv4Var != null && fv4Var.j != i) {
            fv4Var.m = null;
            fv4Var.a = 0;
            fv4Var.j = -1;
            fv4Var.t = -1;
        }
        this.G = i;
        this.H = Integer.MIN_VALUE;
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new dv4((ViewGroup.MarginLayoutParams) layoutParams) : new dv4(layoutParams);
    }

    @Override // androidx.recyclerview.widget.g
    public final int E0(int i, e54 e54Var, j54 j54Var) {
        return m1(i, e54Var, j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void H0(Rect rect, int i, int i2) {
        int iP;
        int iP2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.A;
        int i4 = this.f;
        if (i3 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.t;
            WeakHashMap weakHashMap = xk5.g;
            iP2 = g.p(i2, iHeight, recyclerView.getMinimumHeight());
            iP = g.p(i, (this.B * i4) + paddingRight, this.t.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.t;
            WeakHashMap weakHashMap2 = xk5.g;
            iP = g.p(i, iWidth, recyclerView2.getMinimumWidth());
            iP2 = g.p(i2, (this.B * i4) + paddingBottom, this.t.getMinimumHeight());
        }
        this.t.setMeasuredDimension(iP, iP2);
    }

    @Override // androidx.recyclerview.widget.g
    public final int I(e54 e54Var, j54 j54Var) {
        if (this.A == 1) {
            return Math.min(this.f, j54Var.y());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.g
    public final void N0(RecyclerView recyclerView, int i) {
        jv2 jv2Var = new jv2(recyclerView.getContext());
        jv2Var.g = i;
        O0(jv2Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean P0() {
        return this.M == null;
    }

    public final boolean Q0() {
        int iX0;
        if (G() != 0 && this.J != 0 && this.c) {
            if (this.E) {
                iX0 = Y0();
                X0();
            } else {
                iX0 = X0();
                Y0();
            }
            if (iX0 == 0 && c1() != null) {
                this.I.q();
                this.w = true;
                B0();
                return true;
            }
        }
        return false;
    }

    public final int R0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.P;
        return kf6.n(j54Var, this.d, U0(z), T0(z), this, this.P, this.E);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int S0(e54 e54Var, kp2 kp2Var, j54 j54Var) {
        int i;
        int i2;
        gv4[] gv4VarArr;
        int iZ0;
        BitSet bitSet;
        gv4[] gv4VarArr2;
        gv4 gv4Var;
        ?? r5;
        int iJ;
        int iR;
        int iR2;
        int iL;
        BitSet bitSet2;
        int i3;
        int i4;
        e54 e54Var2 = e54Var;
        BitSet bitSet3 = this.F;
        int i5 = this.f;
        bitSet3.set(0, i5, true);
        kp2 kp2Var2 = this.C;
        if (kp2Var2.t) {
            i = kp2Var.v;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = kp2Var.v;
            i2 = i == 1 ? kp2Var.l + kp2Var.y : kp2Var.x - kp2Var.y;
        }
        int i6 = 0;
        while (true) {
            gv4VarArr = this.k;
            if (i6 >= i5) {
                break;
            }
            if (!gv4VarArr[i6].g.isEmpty()) {
                p1(gv4VarArr[i6], i, i2);
            }
            i6++;
        }
        boolean z = this.E;
        vm3 vm3Var = this.d;
        int iL2 = z ? vm3Var.l() : vm3Var.a();
        boolean z2 = false;
        while (true) {
            int i7 = kp2Var.r;
            if (i7 < 0 || i7 >= j54Var.y() || (!kp2Var2.t && bitSet3.isEmpty())) {
                break;
            }
            View viewN = e54Var2.n(kp2Var.r);
            kp2Var.r += kp2Var.n;
            dv4 dv4Var = (dv4) viewN.getLayoutParams();
            int iN = dv4Var.j.n();
            cd2 cd2Var = this.I;
            int[] iArr = (int[]) cd2Var.t;
            int i8 = (iArr == null || iN >= iArr.length) ? -1 : iArr[iN];
            if (i8 == -1) {
                if (g1(kp2Var.v)) {
                    i4 = i5 - 1;
                    i5 = -1;
                    i3 = -1;
                } else {
                    i3 = 1;
                    i4 = 0;
                }
                gv4 gv4Var2 = null;
                int i9 = i3;
                if (kp2Var.v == 1) {
                    int iA = vm3Var.a();
                    gv4VarArr2 = gv4VarArr;
                    int i10 = i4;
                    int i11 = Integer.MAX_VALUE;
                    while (i10 != i5) {
                        int i12 = i10;
                        gv4 gv4Var3 = gv4VarArr2[i12];
                        BitSet bitSet4 = bitSet3;
                        int iX = gv4Var3.x(iA);
                        if (iX < i11) {
                            i11 = iX;
                            gv4Var2 = gv4Var3;
                        }
                        i10 = i12 + i9;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    gv4VarArr2 = gv4VarArr;
                    int iL3 = vm3Var.l();
                    int i13 = i4;
                    int i14 = Integer.MIN_VALUE;
                    while (i13 != i5) {
                        gv4 gv4Var4 = gv4VarArr2[i13];
                        int i15 = i5;
                        int iJ2 = gv4Var4.j(iL3);
                        if (iJ2 > i14) {
                            i14 = iJ2;
                            gv4Var2 = gv4Var4;
                        }
                        i13 += i9;
                        i5 = i15;
                    }
                }
                gv4Var = gv4Var2;
                cd2Var.w(iN);
                ((int[]) cd2Var.t)[iN] = gv4Var.v;
            } else {
                bitSet = bitSet3;
                i5 = i5;
                gv4VarArr2 = gv4VarArr;
                gv4Var = gv4VarArr2[i8];
            }
            dv4Var.q = gv4Var;
            if (kp2Var.v == 1) {
                r5 = 0;
                q(viewN, -1, false);
            } else {
                r5 = 0;
                q(viewN, 0, false);
            }
            int i16 = this.A;
            if (i16 == 1) {
                e1(viewN, g.H(r5, this.B, this.u, r5, ((ViewGroup.MarginLayoutParams) dv4Var).width), g.H(true, this.o, this.z, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) dv4Var).height));
            } else {
                e1(viewN, g.H(true, this.h, this.u, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) dv4Var).width), g.H(false, this.B, this.z, 0, ((ViewGroup.MarginLayoutParams) dv4Var).height));
            }
            if (kp2Var.v == 1) {
                iR = gv4Var.x(iL2);
                iJ = vm3Var.r(viewN) + iR;
            } else {
                iJ = gv4Var.j(iL2);
                iR = iJ - vm3Var.r(viewN);
            }
            int i17 = kp2Var.v;
            gv4 gv4Var5 = dv4Var.q;
            if (i17 == 1) {
                gv4Var5.getClass();
                dv4 dv4Var2 = (dv4) viewN.getLayoutParams();
                dv4Var2.q = gv4Var5;
                ArrayList arrayList = gv4Var5.g;
                arrayList.add(viewN);
                gv4Var5.r = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    gv4Var5.y = Integer.MIN_VALUE;
                }
                if (dv4Var2.j.a() || dv4Var2.j.w()) {
                    gv4Var5.n = gv4Var5.x.d.r(viewN) + gv4Var5.n;
                }
            } else {
                gv4Var5.getClass();
                dv4 dv4Var3 = (dv4) viewN.getLayoutParams();
                dv4Var3.q = gv4Var5;
                ArrayList arrayList2 = gv4Var5.g;
                arrayList2.add(0, viewN);
                gv4Var5.y = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    gv4Var5.r = Integer.MIN_VALUE;
                }
                if (dv4Var3.j.a() || dv4Var3.j.w()) {
                    gv4Var5.n = gv4Var5.x.d.r(viewN) + gv4Var5.n;
                }
            }
            boolean zD1 = d1();
            vm3 vm3Var2 = this.e;
            if (zD1 && i16 == 1) {
                iL = vm3Var2.l() - (((i5 - 1) - gv4Var.v) * this.B);
                iR2 = iL - vm3Var2.r(viewN);
            } else {
                int iA2 = (gv4Var.v * this.B) + vm3Var2.a();
                int iR3 = vm3Var2.r(viewN) + iA2;
                iR2 = iA2;
                iL = iR3;
            }
            z2 = true;
            if (i16 == 1) {
                g.Y(viewN, iR2, iR, iL, iJ);
            } else {
                g.Y(viewN, iR, iR2, iJ, iL);
            }
            p1(gv4Var, kp2Var2.v, i2);
            e54Var2 = e54Var;
            i1(e54Var2, kp2Var2);
            if (kp2Var2.j && viewN.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(gv4Var.v, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i5 = i5;
            gv4VarArr = gv4VarArr2;
        }
        if (!z2) {
            i1(e54Var2, kp2Var2);
        }
        if (kp2Var2.v == -1) {
            iZ0 = vm3Var.a() - a1(vm3Var.a());
        } else {
            iZ0 = Z0(vm3Var.l()) - vm3Var.l();
        }
        if (iZ0 > 0) {
            return Math.min(kp2Var.y, iZ0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final int T(e54 e54Var, j54 j54Var) {
        if (this.A == 0) {
            return Math.min(this.f, j54Var.y());
        }
        return -1;
    }

    public final View T0(boolean z) {
        vm3 vm3Var = this.d;
        int iA = vm3Var.a();
        int iL = vm3Var.l();
        View view = null;
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            int iV = vm3Var.v(viewF);
            int iY = vm3Var.y(viewF);
            if (iY > iA && iV < iL) {
                if (iY <= iL || !z) {
                    return viewF;
                }
                if (view == null) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final View U0(boolean z) {
        vm3 vm3Var = this.d;
        int iA = vm3Var.a();
        int iL = vm3Var.l();
        int iG = G();
        View view = null;
        for (int i = 0; i < iG; i++) {
            View viewF = F(i);
            int iV = vm3Var.v(viewF);
            if (vm3Var.y(viewF) > iA && iV < iL) {
                if (iV >= iA || !z) {
                    return viewF;
                }
                if (view == null) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean V() {
        return this.J != 0;
    }

    public final void V0(e54 e54Var, j54 j54Var, boolean z) {
        int iL;
        int iZ0 = Z0(Integer.MIN_VALUE);
        if (iZ0 != Integer.MIN_VALUE && (iL = this.d.l() - iZ0) > 0) {
            int i = iL - (-m1(-iL, e54Var, j54Var));
            if (!z || i <= 0) {
                return;
            }
            this.d.i(i);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean W() {
        return this.D;
    }

    public final void W0(e54 e54Var, j54 j54Var, boolean z) {
        int iA;
        int iA1 = a1(Integer.MAX_VALUE);
        if (iA1 != Integer.MAX_VALUE && (iA = iA1 - this.d.a()) > 0) {
            int iM1 = iA - m1(iA, e54Var, j54Var);
            if (!z || iM1 <= 0) {
                return;
            }
            this.d.i(-iM1);
        }
    }

    public final int X0() {
        if (G() == 0) {
            return 0;
        }
        return g.R(F(0));
    }

    public final int Y0() {
        int iG = G();
        if (iG == 0) {
            return 0;
        }
        return g.R(F(iG - 1));
    }

    @Override // androidx.recyclerview.widget.g
    public final void Z(int i) {
        super.Z(i);
        for (int i2 = 0; i2 < this.f; i2++) {
            gv4 gv4Var = this.k[i2];
            int i3 = gv4Var.y;
            if (i3 != Integer.MIN_VALUE) {
                gv4Var.y = i3 + i;
            }
            int i4 = gv4Var.r;
            if (i4 != Integer.MIN_VALUE) {
                gv4Var.r = i4 + i;
            }
        }
    }

    public final int Z0(int i) {
        int iX = this.k[0].x(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int iX2 = this.k[i2].x(i);
            if (iX2 > iX) {
                iX = iX2;
            }
        }
        return iX;
    }

    @Override // androidx.recyclerview.widget.g
    public final void a0(int i) {
        super.a0(i);
        for (int i2 = 0; i2 < this.f; i2++) {
            gv4 gv4Var = this.k[i2];
            int i3 = gv4Var.y;
            if (i3 != Integer.MIN_VALUE) {
                gv4Var.y = i3 + i;
            }
            int i4 = gv4Var.r;
            if (i4 != Integer.MIN_VALUE) {
                gv4Var.r = i4 + i;
            }
        }
    }

    public final int a1(int i) {
        int iJ = this.k[0].j(i);
        for (int i2 = 1; i2 < this.f; i2++) {
            int iJ2 = this.k[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean b() {
        return this.A == 1;
    }

    @Override // androidx.recyclerview.widget.g
    public final void b0() {
        this.I.q();
        for (int i = 0; i < this.f; i++) {
            this.k[i].y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void b1(int i, int i2, int i3) {
        int i4;
        int i5;
        cd2 cd2Var;
        int[] iArr;
        int iY0;
        ArrayList arrayList;
        ev4 ev4Var;
        int size;
        int i6;
        int i7;
        int size2;
        int[] iArr2;
        int iY1 = this.E ? Y0() : X0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            cd2Var = this.I;
            iArr = (int[]) cd2Var.t;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) cd2Var.a;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                ev4Var = null;
                                break;
                            }
                            ev4Var = (ev4) ((ArrayList) cd2Var.a).get(size2);
                            if (ev4Var.j == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        ev4Var = null;
                        break;
                    }
                    if (ev4Var != null) {
                        ((ArrayList) cd2Var.a).remove(ev4Var);
                    }
                    size = ((ArrayList) cd2Var.a).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((ev4) ((ArrayList) cd2Var.a).get(i6)).j >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        ev4 ev4Var2 = (ev4) ((ArrayList) cd2Var.a).get(i6);
                        ((ArrayList) cd2Var.a).remove(i6);
                        i7 = ev4Var2.j;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                iArr2 = (int[]) cd2Var.t;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) cd2Var.t).length;
                } else {
                    Arrays.fill((int[]) cd2Var.t, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                cd2Var.d(i, i2);
            } else if (i3 != 2) {
                cd2Var.e(i, i2);
            } else if (i3 == 8) {
                cd2Var.e(i, 1);
                cd2Var.d(i2, 1);
            }
            if (i4 <= iY1) {
                return;
            }
            if (this.E) {
                iY0 = X0();
            } else {
                iY0 = Y0();
            }
            if (i5 <= iY0) {
                B0();
            }
        }
        i4 = i + i2;
        i5 = i;
        cd2Var = this.I;
        iArr = (int[]) cd2Var.t;
        if (iArr != null) {
            arrayList = (ArrayList) cd2Var.a;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            ev4Var = null;
                            break;
                        }
                        ev4Var = (ev4) ((ArrayList) cd2Var.a).get(size2);
                        if (ev4Var.j == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    ev4Var = null;
                    break;
                }
                if (ev4Var != null) {
                    ((ArrayList) cd2Var.a).remove(ev4Var);
                }
                size = ((ArrayList) cd2Var.a).size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((ev4) ((ArrayList) cd2Var.a).get(i6)).j >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    ev4 ev4Var3 = (ev4) ((ArrayList) cd2Var.a).get(i6);
                    ((ArrayList) cd2Var.a).remove(i6);
                    i7 = ev4Var3.j;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            iArr2 = (int[]) cd2Var.t;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) cd2Var.t).length;
            } else {
                Arrays.fill((int[]) cd2Var.t, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            cd2Var.d(i, i2);
        } else if (i3 != 2) {
            cd2Var.e(i, i2);
        } else if (i3 == 8) {
            cd2Var.e(i, 1);
            cd2Var.d(i2, 1);
        }
        if (i4 <= iY1) {
            return;
        }
        if (this.E) {
            iY0 = X0();
        } else {
            iY0 = Y0();
        }
        if (i5 <= iY0) {
            B0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View c1() {
        boolean z;
        boolean z2;
        int iG = G();
        int i = iG - 1;
        int i2 = this.f;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.A == 1 && d1()) ? (byte) 1 : (byte) -1;
        if (this.E) {
            iG = -1;
        } else {
            i = 0;
        }
        int i3 = i < iG ? 1 : -1;
        while (i != iG) {
            View viewF = F(i);
            dv4 dv4Var = (dv4) viewF.getLayoutParams();
            boolean z3 = bitSet.get(dv4Var.q.v);
            vm3 vm3Var = this.d;
            if (z3) {
                gv4 gv4Var = dv4Var.q;
                if (this.E) {
                    int i4 = gv4Var.r;
                    if (i4 == Integer.MIN_VALUE) {
                        gv4Var.g();
                        i4 = gv4Var.r;
                    }
                    if (i4 < vm3Var.l()) {
                        ArrayList arrayList = gv4Var.g;
                        ((dv4) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewF;
                    }
                } else {
                    int i5 = gv4Var.y;
                    ArrayList arrayList2 = gv4Var.g;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        dv4 dv4Var2 = (dv4) view.getLayoutParams();
                        gv4Var.y = gv4Var.x.d.v(view);
                        dv4Var2.getClass();
                        i5 = gv4Var.y;
                    }
                    if (i5 > vm3Var.a()) {
                        ((dv4) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewF;
                    }
                }
                bitSet.clear(dv4Var.q.v);
            }
            i += i3;
            if (i != iG) {
                View viewF2 = F(i);
                if (this.E) {
                    int iY = vm3Var.y(viewF);
                    int iY2 = vm3Var.y(viewF2);
                    if (iY >= iY2) {
                        if (iY == iY2) {
                            if (dv4Var.q.v - ((dv4) viewF2.getLayoutParams()).q.v < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewF;
                }
                int iV = vm3Var.v(viewF);
                int iV2 = vm3Var.v(viewF2);
                if (iV <= iV2) {
                    if (iV == iV2) {
                        if (dv4Var.q.v - ((dv4) viewF2.getLayoutParams()).q.v < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewF;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.g
    public final int d(j54 j54Var) {
        return R0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void d0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.R);
        }
        for (int i = 0; i < this.f; i++) {
            this.k[i].y();
        }
        recyclerView.requestLayout();
    }

    public final boolean d1() {
        return this.t.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.P;
        return kf6.v(j54Var, this.d, U0(z), T0(z), this, this.P);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.g
    public final View e0(View view, int i, e54 e54Var, j54 j54Var) {
        View viewF;
        int i2;
        if (G() != 0) {
            RecyclerView recyclerView = this.t;
            if (recyclerView == null || (viewF = recyclerView.F(view)) == null || this.j.r.contains(viewF)) {
                viewF = null;
            }
            if (viewF != null) {
                l1();
                int i3 = this.A;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && d1()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && d1()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    dv4 dv4Var = (dv4) viewF.getLayoutParams();
                    dv4Var.getClass();
                    gv4 gv4Var = dv4Var.q;
                    int iY0 = i2 == 1 ? Y0() : X0();
                    o1(iY0, j54Var);
                    n1(i2);
                    kp2 kp2Var = this.C;
                    kp2Var.r = kp2Var.n + iY0;
                    kp2Var.y = (int) (this.d.m() * 0.33333334f);
                    kp2Var.j = true;
                    kp2Var.g = false;
                    S0(e54Var, kp2Var, j54Var);
                    this.K = this.E;
                    View viewL = gv4Var.l(iY0, i2);
                    if (viewL != null && viewL != viewF) {
                        return viewL;
                    }
                    boolean zG1 = g1(i2);
                    gv4[] gv4VarArr = this.k;
                    int i4 = this.f;
                    if (zG1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewL2 = gv4VarArr[i5].l(iY0, i2);
                            if (viewL2 != null && viewL2 != viewF) {
                                return viewL2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewL3 = gv4VarArr[i6].l(iY0, i2);
                            if (viewL3 != null && viewL3 != viewF) {
                                return viewL3;
                            }
                        }
                    }
                    boolean z = (this.D ^ true) == (i2 == -1);
                    View viewB = B(z ? gv4Var.r() : gv4Var.n());
                    if (viewB != null && viewB != viewF) {
                        return viewB;
                    }
                    if (g1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != gv4Var.v) {
                                View viewB2 = B(z ? gv4VarArr[i7].r() : gv4VarArr[i7].n());
                                if (viewB2 != null && viewB2 != viewF) {
                                    return viewB2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewB3 = B(z ? gv4VarArr[i8].r() : gv4VarArr[i8].n());
                            if (viewB3 != null && viewB3 != viewF) {
                                return viewB3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void e1(View view, int i, int i2) {
        Rect rect = this.N;
        c(rect, view);
        dv4 dv4Var = (dv4) view.getLayoutParams();
        int iQ1 = q1(i, ((ViewGroup.MarginLayoutParams) dv4Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) dv4Var).rightMargin + rect.right);
        int iQ2 = q1(i2, ((ViewGroup.MarginLayoutParams) dv4Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) dv4Var).bottomMargin + rect.bottom);
        if (K0(view, iQ1, iQ2, dv4Var)) {
            view.measure(iQ1, iQ2);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final int f(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.P;
        return kf6.v(j54Var, this.d, U0(z), T0(z), this, this.P);
    }

    @Override // androidx.recyclerview.widget.g
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            View viewU0 = U0(false);
            View viewT0 = T0(false);
            if (viewU0 == null || viewT0 == null) {
                return;
            }
            int iR = g.R(viewU0);
            int iR2 = g.R(viewT0);
            if (iR < iR2) {
                accessibilityEvent.setFromIndex(iR);
                accessibilityEvent.setToIndex(iR2);
            } else {
                accessibilityEvent.setFromIndex(iR2);
                accessibilityEvent.setToIndex(iR);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void f1(e54 e54Var, j54 j54Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        fv4 fv4Var;
        int iG;
        int i2;
        int iR;
        int iR2;
        int iG2;
        boolean z4;
        int i3;
        boolean z5;
        fv4 fv4Var2 = this.M;
        cv4 cv4Var = this.O;
        if (!(fv4Var2 == null && this.G == -1) && j54Var.y() == 0) {
            w0(e54Var);
            cv4Var.g();
            return;
        }
        boolean z6 = cv4Var.v;
        StaggeredGridLayoutManager staggeredGridLayoutManager = cv4Var.l;
        boolean z7 = (z6 && this.G == -1 && this.M == null) ? false : true;
        gv4[] gv4VarArr = this.k;
        int i4 = this.f;
        cd2 cd2Var = this.I;
        if (z7) {
            cv4Var.g();
            fv4 fv4Var3 = this.M;
            vm3 vm3Var = this.d;
            if (fv4Var3 != null) {
                int i5 = fv4Var3.a;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            gv4VarArr[i6].y();
                            fv4 fv4Var4 = this.M;
                            int iL = fv4Var4.m[i6];
                            if (iL != Integer.MIN_VALUE) {
                                iL += fv4Var4.b ? vm3Var.l() : vm3Var.a();
                            }
                            gv4 gv4Var = gv4VarArr[i6];
                            gv4Var.y = iL;
                            gv4Var.r = iL;
                        }
                    } else {
                        fv4Var3.m = null;
                        fv4Var3.a = 0;
                        fv4Var3.q = 0;
                        fv4Var3.w = null;
                        fv4Var3.c = null;
                        fv4Var3.j = fv4Var3.t;
                    }
                }
                fv4 fv4Var5 = this.M;
                this.L = fv4Var5.s;
                boolean z8 = fv4Var5.i;
                w(null);
                fv4 fv4Var6 = this.M;
                if (fv4Var6 != null && fv4Var6.i != z8) {
                    fv4Var6.i = z8;
                }
                this.D = z8;
                B0();
                l1();
                fv4 fv4Var7 = this.M;
                int i7 = fv4Var7.j;
                if (i7 != -1) {
                    this.G = i7;
                    cv4Var.r = fv4Var7.b;
                } else {
                    cv4Var.r = this.E;
                }
                if (fv4Var7.q > 1) {
                    cd2Var.t = fv4Var7.w;
                    cd2Var.a = fv4Var7.c;
                }
            } else {
                l1();
                cv4Var.r = this.E;
            }
            if (j54Var.l || (i3 = this.G) == -1) {
                if (this.K) {
                    int iY = j54Var.y();
                    iG2 = G() - 1;
                    while (true) {
                        if (iG2 < 0) {
                            iR2 = 0;
                            break;
                        }
                        iR2 = g.R(F(iG2));
                        if (iR2 < 0 && iR2 < iY) {
                            break;
                        } else {
                            iG2--;
                        }
                    }
                } else {
                    int iY2 = j54Var.y();
                    iG = G();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iG) {
                            iR2 = 0;
                            break;
                        }
                        iR = g.R(F(i2));
                        if (iR < 0 && iR < iY2) {
                            iR2 = iR;
                            break;
                        }
                        i2++;
                    }
                }
                cv4Var.g = iR2;
                cv4Var.y = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= j54Var.y()) {
                this.G = -1;
                this.H = Integer.MIN_VALUE;
                if (this.K) {
                    int iY3 = j54Var.y();
                    iG2 = G() - 1;
                    while (true) {
                        if (iG2 < 0) {
                            iR2 = 0;
                            break;
                        } else {
                            iR2 = g.R(F(iG2));
                            if (iR2 < 0) {
                            }
                            iG2--;
                        }
                    }
                } else {
                    int iY4 = j54Var.y();
                    iG = G();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iG) {
                            iR2 = 0;
                            break;
                        } else {
                            iR = g.R(F(i2));
                            if (iR < 0) {
                            }
                            i2++;
                        }
                    }
                }
                cv4Var.g = iR2;
                cv4Var.y = Integer.MIN_VALUE;
                z4 = true;
            } else {
                fv4 fv4Var8 = this.M;
                if (fv4Var8 == null || fv4Var8.j == -1 || fv4Var8.a < 1) {
                    View viewB = B(this.G);
                    if (viewB != null) {
                        cv4Var.g = this.E ? Y0() : X0();
                        if (this.H != Integer.MIN_VALUE) {
                            if (cv4Var.r) {
                                cv4Var.y = (vm3Var.l() - this.H) - vm3Var.y(viewB);
                            } else {
                                cv4Var.y = (vm3Var.a() + this.H) - vm3Var.v(viewB);
                            }
                        } else if (vm3Var.r(viewB) > vm3Var.m()) {
                            cv4Var.y = cv4Var.r ? vm3Var.l() : vm3Var.a();
                        } else {
                            int iV = vm3Var.v(viewB) - vm3Var.a();
                            if (iV < 0) {
                                cv4Var.y = -iV;
                            } else {
                                int iL2 = vm3Var.l() - vm3Var.y(viewB);
                                if (iL2 < 0) {
                                    cv4Var.y = iL2;
                                } else {
                                    cv4Var.y = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.G;
                        cv4Var.g = i8;
                        int i9 = this.H;
                        if (i9 == Integer.MIN_VALUE) {
                            if (G() != 0) {
                                if ((i8 < X0()) != this.E) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.E) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            cv4Var.r = z5;
                            vm3 vm3Var2 = staggeredGridLayoutManager.d;
                            cv4Var.y = z5 ? vm3Var2.l() : vm3Var2.a();
                        } else {
                            boolean z9 = cv4Var.r;
                            vm3 vm3Var3 = staggeredGridLayoutManager.d;
                            if (z9) {
                                cv4Var.y = vm3Var3.l() - i9;
                            } else {
                                cv4Var.y = vm3Var3.a() + i9;
                            }
                        }
                        z4 = true;
                        cv4Var.n = true;
                    }
                } else {
                    cv4Var.y = Integer.MIN_VALUE;
                    cv4Var.g = this.G;
                }
                z4 = true;
            }
            cv4Var.v = z4;
        }
        if (this.M == null && this.G == -1 && !(cv4Var.r == this.K && d1() == this.L)) {
            cd2Var.q();
            i = 1;
            cv4Var.n = true;
        } else {
            i = 1;
        }
        if (G() > 0 && ((fv4Var = this.M) == null || fv4Var.a < i)) {
            if (cv4Var.n) {
                for (int i10 = 0; i10 < i4; i10++) {
                    gv4VarArr[i10].y();
                    int i11 = cv4Var.y;
                    if (i11 != Integer.MIN_VALUE) {
                        gv4 gv4Var2 = gv4VarArr[i10];
                        gv4Var2.y = i11;
                        gv4Var2.r = i11;
                    }
                }
            } else if (z7 || cv4Var.x == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    gv4 gv4Var3 = gv4VarArr[i12];
                    boolean z10 = this.E;
                    int i13 = cv4Var.y;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = gv4Var3.x;
                    int iX = z10 ? gv4Var3.x(Integer.MIN_VALUE) : gv4Var3.j(Integer.MIN_VALUE);
                    gv4Var3.y();
                    if (iX != Integer.MIN_VALUE && ((!z10 || iX >= staggeredGridLayoutManager2.d.l()) && (z10 || iX <= staggeredGridLayoutManager2.d.a()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iX += i13;
                        }
                        gv4Var3.r = iX;
                        gv4Var3.y = iX;
                    }
                }
                int length = gv4VarArr.length;
                int[] iArr = cv4Var.x;
                if (iArr == null || iArr.length < length) {
                    cv4Var.x = new int[staggeredGridLayoutManager.k.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    cv4Var.x[i14] = gv4VarArr[i14].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    gv4 gv4Var4 = gv4VarArr[i15];
                    gv4Var4.y();
                    int i16 = cv4Var.x[i15];
                    gv4Var4.y = i16;
                    gv4Var4.r = i16;
                }
            }
        }
        A(e54Var);
        kp2 kp2Var = this.C;
        kp2Var.g = false;
        vm3 vm3Var4 = this.e;
        int iM = vm3Var4.m();
        this.B = iM / i4;
        View.MeasureSpec.makeMeasureSpec(iM, vm3Var4.t());
        o1(cv4Var.g, j54Var);
        if (cv4Var.r) {
            n1(-1);
            S0(e54Var, kp2Var, j54Var);
            n1(1);
            kp2Var.r = cv4Var.g + kp2Var.n;
            S0(e54Var, kp2Var, j54Var);
        } else {
            n1(1);
            S0(e54Var, kp2Var, j54Var);
            n1(-1);
            kp2Var.r = cv4Var.g + kp2Var.n;
            S0(e54Var, kp2Var, j54Var);
        }
        if (vm3Var4.t() != 1073741824) {
            int iG3 = G();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iG3; i17++) {
                View viewF = F(i17);
                float fR = vm3Var4.r(viewF);
                if (fR >= fMax) {
                    ((dv4) viewF.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fR);
                }
            }
            int i18 = this.B;
            int iRound = Math.round(fMax * i4);
            if (vm3Var4.t() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, vm3Var4.m());
            }
            this.B = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, vm3Var4.t());
            if (this.B != i18) {
                for (int i19 = 0; i19 < iG3; i19++) {
                    View viewF2 = F(i19);
                    dv4 dv4Var = (dv4) viewF2.getLayoutParams();
                    dv4Var.getClass();
                    boolean zD1 = d1();
                    int i20 = this.A;
                    if (zD1 && i20 == 1) {
                        int i21 = -((i4 - 1) - dv4Var.q.v);
                        viewF2.offsetLeftAndRight((this.B * i21) - (i21 * i18));
                    } else {
                        int i22 = dv4Var.q.v;
                        int i23 = this.B * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewF2.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewF2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (G() <= 0) {
            z2 = true;
        } else if (this.E) {
            z2 = true;
            V0(e54Var, j54Var, true);
            W0(e54Var, j54Var, false);
        } else {
            z2 = true;
            W0(e54Var, j54Var, true);
            V0(e54Var, j54Var, false);
        }
        if (!z || j54Var.l || this.J == 0 || G() <= 0 || c1() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.t;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.R);
            }
            if (Q0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (j54Var.l) {
            cv4Var.g();
        }
        this.K = cv4Var.r;
        this.L = d1();
        if (z3) {
            cv4Var.g();
            f1(e54Var, j54Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void g0(e54 e54Var, j54 j54Var, m2 m2Var) {
        super.g0(e54Var, j54Var, m2Var);
        m2Var.d("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean g1(int i) {
        if (this.A == 0) {
            return (i == -1) != this.E;
        }
        return ((i == -1) == this.E) == d1();
    }

    @Override // androidx.recyclerview.widget.g
    public final int h(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.P;
        return kf6.r(j54Var, this.d, U0(z), T0(z), this, this.P);
    }

    @Override // androidx.recyclerview.widget.g
    public final void h0(e54 e54Var, j54 j54Var, View view, m2 m2Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof dv4)) {
            i0(view, m2Var);
            return;
        }
        gv4 gv4Var = ((dv4) layoutParams).q;
        if (this.A == 0) {
            m2Var.B(l2.g(false, gv4Var == null ? -1 : gv4Var.v, 1, -1, -1));
        } else {
            m2Var.B(l2.g(false, -1, -1, gv4Var == null ? -1 : gv4Var.v, 1));
        }
    }

    public final void h1(int i, j54 j54Var) {
        int iX0;
        int i2;
        if (i > 0) {
            iX0 = Y0();
            i2 = 1;
        } else {
            iX0 = X0();
            i2 = -1;
        }
        kp2 kp2Var = this.C;
        kp2Var.g = true;
        o1(iX0, j54Var);
        n1(i2);
        kp2Var.r = iX0 + kp2Var.n;
        kp2Var.y = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean i() {
        return this.A == 0;
    }

    public final void i1(e54 e54Var, kp2 kp2Var) {
        if (!kp2Var.g || kp2Var.t) {
            return;
        }
        int i = kp2Var.y;
        int i2 = kp2Var.v;
        if (i == 0) {
            if (i2 == -1) {
                j1(kp2Var.l, e54Var);
                return;
            } else {
                k1(kp2Var.x, e54Var);
                return;
            }
        }
        int i3 = this.f;
        gv4[] gv4VarArr = this.k;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = kp2Var.x;
            int iJ = gv4VarArr[0].j(i5);
            while (i4 < i3) {
                int iJ2 = gv4VarArr[i4].j(i5);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i4++;
            }
            int i6 = i5 - iJ;
            int iMin = kp2Var.l;
            if (i6 >= 0) {
                iMin -= Math.min(i6, kp2Var.y);
            }
            j1(iMin, e54Var);
            return;
        }
        int i7 = kp2Var.l;
        int iX = gv4VarArr[0].x(i7);
        while (i4 < i3) {
            int iX2 = gv4VarArr[i4].x(i7);
            if (iX2 < iX) {
                iX = iX2;
            }
            i4++;
        }
        int i8 = iX - kp2Var.l;
        int iMin2 = kp2Var.x;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, kp2Var.y);
        }
        k1(iMin2, e54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void j0(int i, int i2) {
        b1(i, i2, 1);
    }

    public final void j1(int i, e54 e54Var) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            vm3 vm3Var = this.d;
            if (vm3Var.v(viewF) < i || vm3Var.c(viewF) < i) {
                return;
            }
            dv4 dv4Var = (dv4) viewF.getLayoutParams();
            dv4Var.getClass();
            if (dv4Var.q.g.size() == 1) {
                return;
            }
            gv4 gv4Var = dv4Var.q;
            ArrayList arrayList = gv4Var.g;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            dv4 dv4Var2 = (dv4) view.getLayoutParams();
            dv4Var2.q = null;
            if (dv4Var2.j.a() || dv4Var2.j.w()) {
                gv4Var.n -= gv4Var.x.d.r(view);
            }
            if (size == 1) {
                gv4Var.y = Integer.MIN_VALUE;
            }
            gv4Var.r = Integer.MIN_VALUE;
            y0(viewF, e54Var);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final int k(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.P;
        return kf6.r(j54Var, this.d, U0(z), T0(z), this, this.P);
    }

    @Override // androidx.recyclerview.widget.g
    public final void k0() {
        this.I.q();
        B0();
    }

    public final void k1(int i, e54 e54Var) {
        while (G() > 0) {
            View viewF = F(0);
            vm3 vm3Var = this.d;
            if (vm3Var.y(viewF) > i || vm3Var.w(viewF) > i) {
                return;
            }
            dv4 dv4Var = (dv4) viewF.getLayoutParams();
            dv4Var.getClass();
            if (dv4Var.q.g.size() == 1) {
                return;
            }
            gv4 gv4Var = dv4Var.q;
            ArrayList arrayList = gv4Var.g;
            View view = (View) arrayList.remove(0);
            dv4 dv4Var2 = (dv4) view.getLayoutParams();
            dv4Var2.q = null;
            if (arrayList.size() == 0) {
                gv4Var.r = Integer.MIN_VALUE;
            }
            if (dv4Var2.j.a() || dv4Var2.j.w()) {
                gv4Var.n -= gv4Var.x.d.r(view);
            }
            gv4Var.y = Integer.MIN_VALUE;
            y0(viewF, e54Var);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void l0(int i, int i2) {
        b1(i, i2, 8);
    }

    public final void l1() {
        if (this.A == 1 || !d1()) {
            this.E = this.D;
        } else {
            this.E = !this.D;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void m0(int i, int i2) {
        b1(i, i2, 2);
    }

    public final int m1(int i, e54 e54Var, j54 j54Var) {
        if (G() == 0 || i == 0) {
            return 0;
        }
        h1(i, j54Var);
        kp2 kp2Var = this.C;
        int iS0 = S0(e54Var, kp2Var, j54Var);
        if (kp2Var.y >= iS0) {
            i = i < 0 ? -iS0 : iS0;
        }
        this.d.i(-i);
        this.K = this.E;
        kp2Var.y = 0;
        i1(e54Var, kp2Var);
        return i;
    }

    public final void n1(int i) {
        kp2 kp2Var = this.C;
        kp2Var.v = i;
        kp2Var.n = this.E != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.g
    public final int o(j54 j54Var) {
        return R0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void o0(RecyclerView recyclerView, int i, int i2) {
        b1(i, i2, 4);
    }

    public final void o1(int i, j54 j54Var) {
        int iM;
        int iM2;
        int i2;
        kp2 kp2Var = this.C;
        boolean z = false;
        kp2Var.y = 0;
        kp2Var.r = i;
        jv2 jv2Var = this.q;
        vm3 vm3Var = this.d;
        if (jv2Var == null || !jv2Var.v || (i2 = j54Var.g) == -1) {
            iM = 0;
            iM2 = 0;
        } else {
            if (this.E == (i2 < i)) {
                iM = vm3Var.m();
                iM2 = 0;
            } else {
                iM2 = vm3Var.m();
                iM = 0;
            }
        }
        RecyclerView recyclerView = this.t;
        if (recyclerView == null || !recyclerView.i) {
            kp2Var.l = vm3Var.x() + iM;
            kp2Var.x = -iM2;
        } else {
            kp2Var.x = vm3Var.a() - iM2;
            kp2Var.l = vm3Var.l() + iM;
        }
        kp2Var.j = false;
        kp2Var.g = true;
        if (vm3Var.t() == 0 && vm3Var.x() == 0) {
            z = true;
        }
        kp2Var.t = z;
    }

    @Override // androidx.recyclerview.widget.g
    public final void p0(e54 e54Var, j54 j54Var) {
        f1(e54Var, j54Var, true);
    }

    public final void p1(gv4 gv4Var, int i, int i2) {
        int i3 = gv4Var.n;
        int i4 = gv4Var.v;
        BitSet bitSet = this.F;
        if (i != -1) {
            int i5 = gv4Var.r;
            if (i5 == Integer.MIN_VALUE) {
                gv4Var.g();
                i5 = gv4Var.r;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = gv4Var.y;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) gv4Var.g.get(0);
            dv4 dv4Var = (dv4) view.getLayoutParams();
            gv4Var.y = gv4Var.x.d.v(view);
            dv4Var.getClass();
            i6 = gv4Var.y;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void q0(j54 j54Var) {
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        this.M = null;
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.g
    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof fv4) {
            fv4 fv4Var = (fv4) parcelable;
            this.M = fv4Var;
            if (this.G != -1) {
                fv4Var.j = -1;
                fv4Var.t = -1;
                fv4Var.m = null;
                fv4Var.a = 0;
                fv4Var.q = 0;
                fv4Var.w = null;
                fv4Var.c = null;
            }
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean s(y44 y44Var) {
        return y44Var instanceof dv4;
    }

    @Override // androidx.recyclerview.widget.g
    public final Parcelable s0() {
        int iJ;
        int iA;
        int[] iArr;
        fv4 fv4Var = this.M;
        if (fv4Var != null) {
            fv4 fv4Var2 = new fv4();
            fv4Var2.a = fv4Var.a;
            fv4Var2.j = fv4Var.j;
            fv4Var2.t = fv4Var.t;
            fv4Var2.m = fv4Var.m;
            fv4Var2.q = fv4Var.q;
            fv4Var2.w = fv4Var.w;
            fv4Var2.i = fv4Var.i;
            fv4Var2.b = fv4Var.b;
            fv4Var2.s = fv4Var.s;
            fv4Var2.c = fv4Var.c;
            return fv4Var2;
        }
        fv4 fv4Var3 = new fv4();
        fv4Var3.i = this.D;
        fv4Var3.b = this.K;
        fv4Var3.s = this.L;
        cd2 cd2Var = this.I;
        if (cd2Var == null || (iArr = (int[]) cd2Var.t) == null) {
            fv4Var3.q = 0;
        } else {
            fv4Var3.w = iArr;
            fv4Var3.q = iArr.length;
            fv4Var3.c = (ArrayList) cd2Var.a;
        }
        if (G() <= 0) {
            fv4Var3.j = -1;
            fv4Var3.t = -1;
            fv4Var3.a = 0;
            return fv4Var3;
        }
        fv4Var3.j = this.K ? Y0() : X0();
        View viewT0 = this.E ? T0(true) : U0(true);
        fv4Var3.t = viewT0 != null ? g.R(viewT0) : -1;
        int i = this.f;
        fv4Var3.a = i;
        fv4Var3.m = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.K;
            vm3 vm3Var = this.d;
            gv4[] gv4VarArr = this.k;
            if (z) {
                iJ = gv4VarArr[i2].x(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iA = vm3Var.l();
                    iJ -= iA;
                }
            } else {
                iJ = gv4VarArr[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iA = vm3Var.a();
                    iJ -= iA;
                }
            }
            fv4Var3.m[i2] = iJ;
        }
        return fv4Var3;
    }

    @Override // androidx.recyclerview.widget.g
    public final void t0(int i) {
        if (i == 0) {
            Q0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void u(int i, int i2, j54 j54Var, si0 si0Var) {
        kp2 kp2Var;
        int iX;
        if (this.A != 0) {
            i = i2;
        }
        if (G() == 0 || i == 0) {
            return;
        }
        h1(i, j54Var);
        int[] iArr = this.Q;
        int i3 = this.f;
        if (iArr == null || iArr.length < i3) {
            this.Q = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            kp2Var = this.C;
            if (i4 >= i3) {
                break;
            }
            int i6 = kp2Var.n;
            gv4[] gv4VarArr = this.k;
            if (i6 == -1) {
                int i7 = kp2Var.x;
                iX = i7 - gv4VarArr[i4].j(i7);
            } else {
                iX = gv4VarArr[i4].x(kp2Var.l) - kp2Var.l;
            }
            if (iX >= 0) {
                this.Q[i5] = iX;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.Q, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = kp2Var.r;
            if (i9 < 0 || i9 >= j54Var.y()) {
                return;
            }
            si0Var.g(kp2Var.r, this.Q[i8]);
            kp2Var.r += kp2Var.n;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.i54
    public final PointF v(int i) {
        int i2 = -1;
        if (G() != 0) {
            if ((i < X0()) == this.E) {
                i2 = 1;
            }
        } else if (this.E) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.A == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.g
    public final void w(String str) {
        if (this.M == null) {
            super.w(str);
        }
    }
}
