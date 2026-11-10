package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import defpackage.aq1;
import defpackage.e54;
import defpackage.i54;
import defpackage.j54;
import defpackage.jv2;
import defpackage.rp1;
import defpackage.rv;
import defpackage.tp1;
import defpackage.uo1;
import defpackage.up1;
import defpackage.vm3;
import defpackage.x44;
import defpackage.xp1;
import defpackage.y44;
import defpackage.yk5;
import defpackage.yp1;
import defpackage.zp1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FlexboxLayoutManager extends g implements rp1, i54 {
    public static final Rect V = new Rect();
    public boolean B;
    public boolean C;
    public e54 F;
    public j54 G;
    public zp1 H;
    public vm3 J;
    public vm3 K;
    public aq1 L;
    public final Context R;
    public View S;
    public int d;
    public int e;
    public int f;
    public int k;
    public final int A = -1;
    public List D = new ArrayList();
    public final rv E = new rv(this);
    public final xp1 I = new xp1(this);
    public int M = -1;
    public int N = Integer.MIN_VALUE;
    public int O = Integer.MIN_VALUE;
    public int P = Integer.MIN_VALUE;
    public final SparseArray Q = new SparseArray();
    public int T = -1;
    public final up1 U = new up1();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        x44 x44VarS = g.S(context, attributeSet, i, i2);
        int i3 = x44VarS.g;
        if (i3 != 0) {
            if (i3 == 1) {
                if (x44VarS.r) {
                    h1(3);
                } else {
                    h1(2);
                }
            }
        } else if (x44VarS.r) {
            h1(1);
        } else {
            h1(0);
        }
        i1(1);
        g1(4);
        this.R = context;
    }

    public static boolean X(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 C() {
        return new yp1(-2);
    }

    @Override // androidx.recyclerview.widget.g
    public final int C0(int i, e54 e54Var, j54 j54Var) {
        if (!a() || this.k == 0) {
            int iD1 = d1(i, e54Var, j54Var);
            this.Q.clear();
            return iD1;
        }
        int iE1 = e1(i);
        this.I.n += iE1;
        this.K.i(-iE1);
        return iE1;
    }

    @Override // androidx.recyclerview.widget.g
    public final y44 D(Context context, AttributeSet attributeSet) {
        yp1 yp1Var = new yp1(context, attributeSet);
        yp1Var.q = 0.0f;
        yp1Var.w = 1.0f;
        yp1Var.c = -1;
        yp1Var.i = -1.0f;
        yp1Var.p = 16777215;
        yp1Var.u = 16777215;
        return yp1Var;
    }

    @Override // androidx.recyclerview.widget.g
    public final void D0(int i) {
        this.M = i;
        this.N = Integer.MIN_VALUE;
        aq1 aq1Var = this.L;
        if (aq1Var != null) {
            aq1Var.j = -1;
        }
        B0();
    }

    @Override // androidx.recyclerview.widget.g
    public final int E0(int i, e54 e54Var, j54 j54Var) {
        if (a() || (this.k == 0 && !a())) {
            int iD1 = d1(i, e54Var, j54Var);
            this.Q.clear();
            return iD1;
        }
        int iE1 = e1(i);
        this.I.n += iE1;
        this.K.i(-iE1);
        return iE1;
    }

    @Override // androidx.recyclerview.widget.g
    public final void N0(RecyclerView recyclerView, int i) {
        jv2 jv2Var = new jv2(recyclerView.getContext());
        jv2Var.g = i;
        O0(jv2Var);
    }

    public final int Q0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        int iY = j54Var.y();
        T0();
        View viewV0 = V0(iY);
        View viewX0 = X0(iY);
        if (j54Var.y() == 0 || viewV0 == null || viewX0 == null) {
            return 0;
        }
        return Math.min(this.J.m(), this.J.y(viewX0) - this.J.v(viewV0));
    }

    public final int R0(j54 j54Var) {
        if (G() == 0) {
            return 0;
        }
        int iY = j54Var.y();
        View viewV0 = V0(iY);
        View viewX0 = X0(iY);
        if (j54Var.y() == 0 || viewV0 == null || viewX0 == null) {
            return 0;
        }
        int iR = g.R(viewV0);
        int iR2 = g.R(viewX0);
        int iAbs = Math.abs(this.J.y(viewX0) - this.J.v(viewV0));
        int[] iArr = (int[]) this.E.a;
        int i = iArr[iR];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iR2] - i) + 1))) + (this.J.a() - this.J.v(viewV0)));
    }

    public final int S0(j54 j54Var) {
        if (G() != 0) {
            int iY = j54Var.y();
            View viewV0 = V0(iY);
            View viewX0 = X0(iY);
            if (j54Var.y() != 0 && viewV0 != null && viewX0 != null) {
                View viewZ0 = Z0(0, G());
                int iR = viewZ0 == null ? -1 : g.R(viewZ0);
                View viewZ1 = Z0(G() - 1, -1);
                return (int) ((Math.abs(this.J.y(viewX0) - this.J.v(viewV0)) / (((viewZ1 != null ? g.R(viewZ1) : -1) - iR) + 1)) * j54Var.y());
            }
        }
        return 0;
    }

    public final void T0() {
        if (this.J != null) {
            return;
        }
        boolean zA = a();
        int i = this.k;
        if (zA) {
            if (i == 0) {
                this.J = new vm3(this, (byte) 0);
                this.K = new vm3(this, (byte) 1);
                return;
            } else {
                this.J = new vm3(this, (byte) 1);
                this.K = new vm3(this, (byte) 0);
                return;
            }
        }
        if (i == 0) {
            this.J = new vm3(this, (byte) 1);
            this.K = new vm3(this, (byte) 0);
        } else {
            this.J = new vm3(this, (byte) 0);
            this.K = new vm3(this, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:127:0x0310  */
    /* JADX WARN: Code duplicated, block: B:130:0x0336  */
    /* JADX WARN: Code duplicated, block: B:132:0x0347  */
    /* JADX WARN: Code duplicated, block: B:135:0x037d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x037f  */
    /* JADX WARN: Code duplicated, block: B:137:0x039e  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:141:0x03de  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    public final int U0(e54 e54Var, j54 j54Var, zp1 zp1Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float fMax;
        int i4;
        int i5;
        int i6;
        int i7;
        View viewY;
        float f6;
        int i8;
        int i9;
        yp1 yp1Var;
        float f7;
        float f8;
        Rect rect;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        int i12;
        rv rvVar;
        View view;
        boolean z5;
        int i13;
        float measuredHeight;
        float measuredHeight2;
        int i14;
        float f9;
        float f10;
        float f11;
        float f12;
        float measuredWidth;
        float fMax2;
        int i15;
        int i16;
        int i17;
        View viewY2;
        int i18;
        int i19;
        yp1 yp1Var2;
        float f13;
        float f14;
        int i20;
        boolean z6;
        rv rvVar2;
        int i21;
        View view2;
        int i22 = zp1Var.x;
        if (i22 != Integer.MIN_VALUE) {
            int i23 = zp1Var.g;
            if (i23 < 0) {
                zp1Var.x = i22 + i23;
            }
            f1(e54Var, zp1Var);
        }
        int i24 = zp1Var.g;
        boolean zA = a();
        int i25 = i24;
        int i26 = 0;
        while (true) {
            if (i25 <= 0 && !this.H.y) {
                break;
            }
            List list = this.D;
            int i27 = zp1Var.n;
            if (i27 < 0 || i27 >= j54Var.y() || (i = zp1Var.r) < 0 || i >= list.size()) {
                break;
            }
            tp1 tp1Var = (tp1) this.D.get(zp1Var.r);
            zp1Var.n = tp1Var.i;
            boolean zA2 = a();
            xp1 xp1Var = this.I;
            boolean z7 = false;
            Rect rect2 = V;
            rv rvVar3 = this.E;
            if (zA2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i28 = this.h;
                int i29 = zp1Var.v;
                if (zp1Var.j == -1) {
                    i29 -= tp1Var.l;
                }
                int i30 = i29;
                int i31 = zp1Var.n;
                int i32 = this.d;
                if (i32 != 0) {
                    i14 = i30;
                    if (i32 != 1) {
                        if (i32 == 2) {
                            float f15 = paddingLeft;
                            float f16 = (i28 - tp1Var.v) / 2.0f;
                            f10 = (i28 - paddingRight) - f16;
                            f9 = f15 + f16;
                        } else if (i32 == 3) {
                            f9 = paddingLeft;
                            int i33 = tp1Var.j;
                            f11 = (i28 - tp1Var.v) / (i33 != 1 ? i33 - 1 : 1.0f);
                            f10 = i28 - paddingRight;
                        } else if (i32 == 4) {
                            int i34 = tp1Var.j;
                            f11 = i34 != 0 ? (i28 - tp1Var.v) / i34 : 0.0f;
                            float f17 = f11 / 2.0f;
                            f9 = paddingLeft + f17;
                            f10 = (i28 - paddingRight) - f17;
                        } else {
                            if (i32 != 5) {
                                uo1.z("Invalid justifyContent is set: ", this.d);
                                return 0;
                            }
                            int i35 = tp1Var.j;
                            f11 = i35 != 0 ? (i28 - tp1Var.v) / (i35 + 1) : 0.0f;
                            f9 = paddingLeft + f11;
                            f10 = (i28 - paddingRight) - f11;
                        }
                        float f18 = xp1Var.n;
                        f12 = f9 - f18;
                        measuredWidth = f10 - f18;
                        fMax2 = Math.max(f11, 0.0f);
                        i15 = tp1Var.j;
                        i16 = i31;
                        i17 = 0;
                        while (i16 < i31 + i15) {
                            viewY2 = y(i16);
                            if (viewY2 == null) {
                                rect2 = rect2;
                                i21 = i16;
                                i31 = i31;
                            } else {
                                float f19 = measuredWidth;
                                if (zp1Var.j == 1) {
                                    c(rect2, viewY2);
                                    q(viewY2, -1, z7);
                                } else {
                                    c(rect2, viewY2);
                                    q(viewY2, i17, z7);
                                    i17++;
                                }
                                int i36 = i17;
                                long j = ((long[]) rvVar3.m)[i16];
                                i18 = (int) j;
                                i19 = (int) (j >> 32);
                                yp1Var2 = (yp1) viewY2.getLayoutParams();
                                if (j1(viewY2, i18, i19, yp1Var2)) {
                                    viewY2.measure(i18, i19);
                                }
                                f13 = f12 + ((ViewGroup.MarginLayoutParams) yp1Var2).leftMargin + ((y44) viewY2.getLayoutParams()).t.left;
                                f14 = f19 - (((ViewGroup.MarginLayoutParams) yp1Var2).rightMargin + ((y44) viewY2.getLayoutParams()).t.right);
                                i20 = i14 + ((y44) viewY2.getLayoutParams()).t.top;
                                z6 = this.B;
                                rvVar2 = this.E;
                                if (z6) {
                                    int iRound = Math.round(f14) - viewY2.getMeasuredWidth();
                                    int iRound2 = Math.round(f14);
                                    int measuredHeight3 = viewY2.getMeasuredHeight() + i20;
                                    view2 = viewY2;
                                    i21 = i16;
                                    rvVar2.z(view2, tp1Var, iRound, i20, iRound2, measuredHeight3);
                                } else {
                                    i21 = i16;
                                    view2 = viewY2;
                                    rvVar2.z(view2, tp1Var, Math.round(f13), i20, view2.getMeasuredWidth() + Math.round(f13), view2.getMeasuredHeight() + i20);
                                }
                                float measuredWidth2 = view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) yp1Var2).rightMargin + ((y44) view2.getLayoutParams()).t.right + fMax2 + f13;
                                measuredWidth = f14 - (((view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) yp1Var2).leftMargin) + ((y44) view2.getLayoutParams()).t.left) + fMax2);
                                f12 = measuredWidth2;
                                i17 = i36;
                            }
                            i16 = i21 + 1;
                            i15 = i15;
                            i31 = i31;
                            zA = zA;
                            rect2 = rect2;
                            z7 = false;
                        }
                        z = zA;
                        zp1Var.r += this.H.j;
                        i7 = tp1Var.l;
                    } else {
                        int i37 = tp1Var.v;
                        float f20 = (i28 - i37) + paddingRight;
                        float f21 = i37 - paddingLeft;
                        f9 = f20;
                        f10 = f21;
                    }
                } else {
                    i14 = i30;
                    f9 = paddingLeft;
                    f10 = i28 - paddingRight;
                }
                f11 = 0.0f;
                float f110 = xp1Var.n;
                f12 = f9 - f110;
                measuredWidth = f10 - f110;
                fMax2 = Math.max(f11, 0.0f);
                i15 = tp1Var.j;
                i16 = i31;
                i17 = 0;
                while (i16 < i31 + i15) {
                    viewY2 = y(i16);
                    if (viewY2 == null) {
                        rect2 = rect2;
                        i21 = i16;
                        i31 = i31;
                    } else {
                        float f111 = measuredWidth;
                        if (zp1Var.j == 1) {
                            c(rect2, viewY2);
                            q(viewY2, -1, z7);
                        } else {
                            c(rect2, viewY2);
                            q(viewY2, i17, z7);
                            i17++;
                        }
                        int i38 = i17;
                        long j2 = ((long[]) rvVar3.m)[i16];
                        i18 = (int) j2;
                        i19 = (int) (j2 >> 32);
                        yp1Var2 = (yp1) viewY2.getLayoutParams();
                        if (j1(viewY2, i18, i19, yp1Var2)) {
                            viewY2.measure(i18, i19);
                        }
                        f13 = f12 + ((ViewGroup.MarginLayoutParams) yp1Var2).leftMargin + ((y44) viewY2.getLayoutParams()).t.left;
                        f14 = f111 - (((ViewGroup.MarginLayoutParams) yp1Var2).rightMargin + ((y44) viewY2.getLayoutParams()).t.right);
                        i20 = i14 + ((y44) viewY2.getLayoutParams()).t.top;
                        z6 = this.B;
                        rvVar2 = this.E;
                        if (z6) {
                            int iRound3 = Math.round(f14) - viewY2.getMeasuredWidth();
                            int iRound4 = Math.round(f14);
                            int measuredHeight4 = viewY2.getMeasuredHeight() + i20;
                            view2 = viewY2;
                            i21 = i16;
                            rvVar2.z(view2, tp1Var, iRound3, i20, iRound4, measuredHeight4);
                        } else {
                            i21 = i16;
                            view2 = viewY2;
                            rvVar2.z(view2, tp1Var, Math.round(f13), i20, view2.getMeasuredWidth() + Math.round(f13), view2.getMeasuredHeight() + i20);
                        }
                        float measuredWidth3 = view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) yp1Var2).rightMargin + ((y44) view2.getLayoutParams()).t.right + fMax2 + f13;
                        measuredWidth = f14 - (((view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) yp1Var2).leftMargin) + ((y44) view2.getLayoutParams()).t.left) + fMax2);
                        f12 = measuredWidth3;
                        i17 = i38;
                    }
                    i16 = i21 + 1;
                    i15 = i15;
                    i31 = i31;
                    zA = zA;
                    rect2 = rect2;
                    z7 = false;
                }
                z = zA;
                zp1Var.r += this.H.j;
                i7 = tp1Var.l;
            } else {
                z = zA;
                Rect rect3 = rect2;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i39 = this.o;
                int i40 = zp1Var.v;
                if (zp1Var.j == -1) {
                    int i41 = tp1Var.l;
                    i3 = i40 + i41;
                    i2 = i40 - i41;
                } else {
                    i2 = i40;
                    i3 = i2;
                }
                int i42 = zp1Var.n;
                int i43 = this.d;
                if (i43 != 0) {
                    z2 = true;
                    if (i43 != 1) {
                        if (i43 == 2) {
                            float f22 = paddingTop;
                            float f23 = (i39 - tp1Var.v) / 2.0f;
                            f2 = (i39 - paddingBottom) - f23;
                            f = f22 + f23;
                        } else if (i43 == 3) {
                            f = paddingTop;
                            int i44 = tp1Var.j;
                            f3 = (i39 - tp1Var.v) / (i44 != 1 ? i44 - 1 : 1.0f);
                            f2 = i39 - paddingBottom;
                        } else if (i43 == 4) {
                            int i45 = tp1Var.j;
                            f3 = i45 != 0 ? (i39 - tp1Var.v) / i45 : 0.0f;
                            float f24 = f3 / 2.0f;
                            f = paddingTop + f24;
                            f2 = (i39 - paddingBottom) - f24;
                        } else {
                            if (i43 != 5) {
                                uo1.z("Invalid justifyContent is set: ", this.d);
                                return 0;
                            }
                            int i46 = tp1Var.j;
                            f3 = i46 != 0 ? (i39 - tp1Var.v) / (i46 + 1) : 0.0f;
                            f = paddingTop + f3;
                            f2 = (i39 - paddingBottom) - f3;
                        }
                        float f25 = xp1Var.n;
                        f4 = f - f25;
                        f5 = f2 - f25;
                        fMax = Math.max(f3, 0.0f);
                        i4 = tp1Var.j;
                        i5 = i42;
                        i6 = 0;
                        while (i5 < i42 + i4) {
                            viewY = y(i5);
                            if (viewY == null) {
                                f6 = fMax;
                                measuredHeight2 = f5;
                                i13 = i42;
                                rect = rect3;
                                measuredHeight = f4;
                                z5 = z2;
                            } else {
                                f6 = fMax;
                                long j3 = ((long[]) rvVar3.m)[i5];
                                i8 = (int) j3;
                                i9 = (int) (j3 >> 32);
                                yp1Var = (yp1) viewY.getLayoutParams();
                                if (j1(viewY, i8, i9, yp1Var)) {
                                    viewY.measure(i8, i9);
                                }
                                f7 = f4 + ((ViewGroup.MarginLayoutParams) yp1Var).topMargin + ((y44) viewY.getLayoutParams()).t.top;
                                f8 = f5 - (((ViewGroup.MarginLayoutParams) yp1Var).rightMargin + ((y44) viewY.getLayoutParams()).t.bottom);
                                if (zp1Var.j == 1) {
                                    rect = rect3;
                                    c(rect, viewY);
                                    q(viewY, -1, false);
                                } else {
                                    rect = rect3;
                                    c(rect, viewY);
                                    q(viewY, i6, false);
                                    i6++;
                                }
                                int i47 = i6;
                                i10 = i2 + ((y44) viewY.getLayoutParams()).t.left;
                                i11 = i3 - ((y44) viewY.getLayoutParams()).t.right;
                                z3 = this.B;
                                z4 = this.C;
                                i12 = i42;
                                rvVar = this.E;
                                if (z3) {
                                    view = viewY;
                                    z5 = true;
                                    i13 = i12;
                                    if (z4) {
                                        rvVar.h(view, tp1Var, z3, i10, Math.round(f8) - view.getMeasuredHeight(), view.getMeasuredWidth() + i10, Math.round(f8));
                                    } else {
                                        rvVar.h(view, tp1Var, z3, i10, Math.round(f7), view.getMeasuredWidth() + i10, view.getMeasuredHeight() + Math.round(f7));
                                    }
                                } else if (z4) {
                                    i13 = i12;
                                    z5 = true;
                                    view = viewY;
                                    rvVar.h(view, tp1Var, z3, i11 - viewY.getMeasuredWidth(), Math.round(f8) - viewY.getMeasuredHeight(), i11, Math.round(f8));
                                } else {
                                    view = viewY;
                                    z5 = true;
                                    i13 = i12;
                                    rvVar.h(view, tp1Var, z3, i11 - view.getMeasuredWidth(), Math.round(f7), i11, view.getMeasuredHeight() + Math.round(f7));
                                }
                                measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yp1Var).topMargin + ((y44) view.getLayoutParams()).t.bottom + f6 + f7;
                                measuredHeight2 = f8 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yp1Var).bottomMargin) + ((y44) view.getLayoutParams()).t.top) + f6);
                                i6 = i47;
                            }
                            i5++;
                            f4 = measuredHeight;
                            i42 = i13;
                            z2 = z5;
                            rect3 = rect;
                            f5 = measuredHeight2;
                            rvVar3 = rvVar3;
                            fMax = f6;
                        }
                        zp1Var.r += this.H.j;
                        i7 = tp1Var.l;
                    } else {
                        int i48 = tp1Var.v;
                        float f26 = (i39 - i48) + paddingBottom;
                        float f27 = i48 - paddingTop;
                        f = f26;
                        f2 = f27;
                    }
                } else {
                    z2 = true;
                    f = paddingTop;
                    f2 = i39 - paddingBottom;
                }
                f3 = 0.0f;
                float f28 = xp1Var.n;
                f4 = f - f28;
                f5 = f2 - f28;
                fMax = Math.max(f3, 0.0f);
                i4 = tp1Var.j;
                i5 = i42;
                i6 = 0;
                while (i5 < i42 + i4) {
                    viewY = y(i5);
                    if (viewY == null) {
                        f6 = fMax;
                        measuredHeight2 = f5;
                        i13 = i42;
                        rect = rect3;
                        measuredHeight = f4;
                        z5 = z2;
                    } else {
                        f6 = fMax;
                        long j4 = ((long[]) rvVar3.m)[i5];
                        i8 = (int) j4;
                        i9 = (int) (j4 >> 32);
                        yp1Var = (yp1) viewY.getLayoutParams();
                        if (j1(viewY, i8, i9, yp1Var)) {
                            viewY.measure(i8, i9);
                        }
                        f7 = f4 + ((ViewGroup.MarginLayoutParams) yp1Var).topMargin + ((y44) viewY.getLayoutParams()).t.top;
                        f8 = f5 - (((ViewGroup.MarginLayoutParams) yp1Var).rightMargin + ((y44) viewY.getLayoutParams()).t.bottom);
                        if (zp1Var.j == 1) {
                            rect = rect3;
                            c(rect, viewY);
                            q(viewY, -1, false);
                        } else {
                            rect = rect3;
                            c(rect, viewY);
                            q(viewY, i6, false);
                            i6++;
                        }
                        int i49 = i6;
                        i10 = i2 + ((y44) viewY.getLayoutParams()).t.left;
                        i11 = i3 - ((y44) viewY.getLayoutParams()).t.right;
                        z3 = this.B;
                        z4 = this.C;
                        i12 = i42;
                        rvVar = this.E;
                        if (z3) {
                            view = viewY;
                            z5 = true;
                            i13 = i12;
                            if (z4) {
                                rvVar.h(view, tp1Var, z3, i10, Math.round(f8) - view.getMeasuredHeight(), view.getMeasuredWidth() + i10, Math.round(f8));
                            } else {
                                rvVar.h(view, tp1Var, z3, i10, Math.round(f7), view.getMeasuredWidth() + i10, view.getMeasuredHeight() + Math.round(f7));
                            }
                        } else if (z4) {
                            i13 = i12;
                            z5 = true;
                            view = viewY;
                            rvVar.h(view, tp1Var, z3, i11 - viewY.getMeasuredWidth(), Math.round(f8) - viewY.getMeasuredHeight(), i11, Math.round(f8));
                        } else {
                            view = viewY;
                            z5 = true;
                            i13 = i12;
                            rvVar.h(view, tp1Var, z3, i11 - view.getMeasuredWidth(), Math.round(f7), i11, view.getMeasuredHeight() + Math.round(f7));
                        }
                        measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yp1Var).topMargin + ((y44) view.getLayoutParams()).t.bottom + f6 + f7;
                        measuredHeight2 = f8 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) yp1Var).bottomMargin) + ((y44) view.getLayoutParams()).t.top) + f6);
                        i6 = i49;
                    }
                    i5++;
                    f4 = measuredHeight;
                    i42 = i13;
                    z2 = z5;
                    rect3 = rect;
                    f5 = measuredHeight2;
                    rvVar3 = rvVar3;
                    fMax = f6;
                }
                zp1Var.r += this.H.j;
                i7 = tp1Var.l;
            }
            int i50 = i7;
            i26 += i7;
            if (z || !this.B) {
                zp1Var.v += zp1Var.j * i50;
            } else {
                zp1Var.v -= zp1Var.j * i50;
            }
            i25 -= i50;
            zA = z;
            i24 = i24;
        }
        int i51 = i24;
        int i52 = zp1Var.g - i26;
        zp1Var.g = i52;
        int i53 = zp1Var.x;
        if (i53 != Integer.MIN_VALUE) {
            int i54 = i53 + i26;
            zp1Var.x = i54;
            if (i52 < 0) {
                zp1Var.x = i54 + i52;
            }
            f1(e54Var, zp1Var);
        }
        return i51 - zp1Var.g;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean V() {
        return true;
    }

    public final View V0(int i) {
        View viewA1 = a1(0, G(), i);
        if (viewA1 == null) {
            return null;
        }
        int i2 = ((int[]) this.E.a)[g.R(viewA1)];
        if (i2 == -1) {
            return null;
        }
        return W0(viewA1, (tp1) this.D.get(i2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View W0(View view, tp1 tp1Var) {
        boolean zA = a();
        int i = tp1Var.j;
        for (int i2 = 1; i2 < i; i2++) {
            View viewF = F(i2);
            if (viewF != null && viewF.getVisibility() != 8) {
                if (!this.B || zA) {
                    if (this.J.v(view) > this.J.v(viewF)) {
                        view = viewF;
                    }
                } else if (this.J.y(view) < this.J.y(viewF)) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final View X0(int i) {
        View viewA1 = a1(G() - 1, -1, i);
        if (viewA1 == null) {
            return null;
        }
        return Y0(viewA1, (tp1) this.D.get(((int[]) this.E.a)[g.R(viewA1)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View Y0(View view, tp1 tp1Var) {
        boolean zA = a();
        int iG = (G() - tp1Var.j) - 1;
        for (int iG2 = G() - 2; iG2 > iG; iG2--) {
            View viewF = F(iG2);
            if (viewF != null && viewF.getVisibility() != 8) {
                if (!this.B || zA) {
                    if (this.J.y(view) < this.J.y(viewF)) {
                        view = viewF;
                    }
                } else if (this.J.v(view) > this.J.v(viewF)) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final View Z0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewF = F(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.h - getPaddingRight();
            int paddingBottom = this.o - getPaddingBottom();
            int iL = g.L(viewF) - ((ViewGroup.MarginLayoutParams) ((y44) viewF.getLayoutParams())).leftMargin;
            int iP = g.P(viewF) - ((ViewGroup.MarginLayoutParams) ((y44) viewF.getLayoutParams())).topMargin;
            int iO = g.O(viewF) + ((ViewGroup.MarginLayoutParams) ((y44) viewF.getLayoutParams())).rightMargin;
            int iJ = g.J(viewF) + ((ViewGroup.MarginLayoutParams) ((y44) viewF.getLayoutParams())).bottomMargin;
            boolean z = iL >= paddingRight || iO >= paddingLeft;
            boolean z2 = iP >= paddingBottom || iJ >= paddingTop;
            if (z && z2) {
                return viewF;
            }
            i += i3;
        }
        return null;
    }

    @Override // defpackage.rp1
    public final boolean a() {
        int i = this.f;
        return i == 0 || i == 1;
    }

    public final View a1(int i, int i2, int i3) {
        int iR;
        T0();
        if (this.H == null) {
            zp1 zp1Var = new zp1();
            zp1Var.j = 1;
            this.H = zp1Var;
        }
        int iA = this.J.a();
        int iL = this.J.l();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewF = F(i);
            if (viewF != null && (iR = g.R(viewF)) >= 0 && iR < i3) {
                if (((y44) viewF.getLayoutParams()).j.a()) {
                    if (view2 == null) {
                        view2 = viewF;
                    }
                } else {
                    if (this.J.v(viewF) >= iA && this.J.y(viewF) <= iL) {
                        return viewF;
                    }
                    if (view == null) {
                        view = viewF;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean b() {
        if (this.k == 0) {
            return !a();
        }
        if (!a()) {
            int i = this.o;
            View view = this.S;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.g
    public final void b0() {
        v0();
    }

    public final int b1(int i, e54 e54Var, j54 j54Var, boolean z) {
        int iD1;
        int iL;
        if (a() || !this.B) {
            int iL2 = this.J.l() - i;
            if (iL2 <= 0) {
                return 0;
            }
            iD1 = -d1(-iL2, e54Var, j54Var);
        } else {
            int iA = i - this.J.a();
            if (iA <= 0) {
                return 0;
            }
            iD1 = d1(iA, e54Var, j54Var);
        }
        int i2 = i + iD1;
        if (!z || (iL = this.J.l() - i2) <= 0) {
            return iD1;
        }
        this.J.i(iL);
        return iL + iD1;
    }

    @Override // androidx.recyclerview.widget.g
    public final void c0(RecyclerView recyclerView) {
        this.S = (View) recyclerView.getParent();
    }

    public final int c1(int i, e54 e54Var, j54 j54Var, boolean z) {
        int iD1;
        int iA;
        if (a() || !this.B) {
            int iA2 = i - this.J.a();
            if (iA2 <= 0) {
                return 0;
            }
            iD1 = -d1(iA2, e54Var, j54Var);
        } else {
            int iL = this.J.l() - i;
            if (iL <= 0) {
                return 0;
            }
            iD1 = d1(-iL, e54Var, j54Var);
        }
        int i2 = i + iD1;
        if (!z || (iA = i2 - this.J.a()) <= 0) {
            return iD1;
        }
        this.J.i(-iA);
        return iD1 - iA;
    }

    @Override // androidx.recyclerview.widget.g
    public final int d(j54 j54Var) {
        return R0(j54Var);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    public final int d1(int i, e54 e54Var, j54 j54Var) {
        int i2;
        if (G() != 0 && i != 0) {
            T0();
            this.H.t = true;
            boolean z = !a() && this.B;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.H.j = i3;
            boolean zA = a();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, this.u);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.z);
            boolean z2 = !zA && this.B;
            rv rvVar = this.E;
            if (i3 == 1) {
                View viewF = F(G() - 1);
                if (viewF != null) {
                    this.H.v = this.J.y(viewF);
                    int iR = g.R(viewF);
                    View viewY0 = Y0(viewF, (tp1) this.D.get(((int[]) rvVar.a)[iR]));
                    zp1 zp1Var = this.H;
                    zp1Var.getClass();
                    int i4 = iR + 1;
                    zp1Var.n = i4;
                    int[] iArr = (int[]) rvVar.a;
                    if (iArr.length <= i4) {
                        zp1Var.r = -1;
                    } else {
                        zp1Var.r = iArr[i4];
                    }
                    vm3 vm3Var = this.J;
                    if (z2) {
                        zp1Var.v = vm3Var.v(viewY0);
                        this.H.x = this.J.a() + (-this.J.v(viewY0));
                        zp1 zp1Var2 = this.H;
                        zp1Var2.x = Math.max(zp1Var2.x, 0);
                    } else {
                        zp1Var.v = vm3Var.y(viewY0);
                        this.H.x = this.J.y(viewY0) - this.J.l();
                    }
                    int i5 = this.H.r;
                    if ((i5 == -1 || i5 > this.D.size() - 1) && this.H.n <= this.G.y()) {
                        zp1 zp1Var3 = this.H;
                        int i6 = iAbs - zp1Var3.x;
                        up1 up1Var = this.U;
                        up1Var.g = null;
                        up1Var.y = 0;
                        if (i6 > 0) {
                            rv rvVar2 = this.E;
                            if (zA) {
                                rvVar2.x(up1Var, iMakeMeasureSpec, iMakeMeasureSpec2, i6, zp1Var3.n, -1, this.D);
                            } else {
                                rvVar2.x(up1Var, iMakeMeasureSpec2, iMakeMeasureSpec, i6, zp1Var3.n, -1, this.D);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            rvVar.q(iMakeMeasureSpec, iMakeMeasureSpec2, this.H.n);
                            rvVar.A(this.H.n);
                        }
                    }
                    zp1 zp1Var4 = this.H;
                    zp1Var4.g = iAbs - zp1Var4.x;
                }
            } else {
                View viewF2 = F(0);
                if (viewF2 != null) {
                    this.H.v = this.J.v(viewF2);
                    int iR2 = g.R(viewF2);
                    View viewW0 = W0(viewF2, (tp1) this.D.get(((int[]) rvVar.a)[iR2]));
                    zp1 zp1Var5 = this.H;
                    zp1Var5.getClass();
                    int i7 = ((int[]) rvVar.a)[iR2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        tp1 tp1Var = (tp1) this.D.get(i7 - 1);
                        zp1Var5 = this.H;
                        zp1Var5.n = iR2 - tp1Var.j;
                    } else {
                        zp1Var5.n = -1;
                    }
                    zp1Var5.r = i7 > 0 ? i7 - 1 : 0;
                    vm3 vm3Var2 = this.J;
                    if (z2) {
                        zp1Var5.v = vm3Var2.y(viewW0);
                        this.H.x = this.J.y(viewW0) - this.J.l();
                        zp1 zp1Var6 = this.H;
                        zp1Var6.x = Math.max(zp1Var6.x, 0);
                    } else {
                        zp1Var5.v = vm3Var2.v(viewW0);
                        this.H.x = this.J.a() + (-this.J.v(viewW0));
                    }
                    zp1 zp1Var7 = this.H;
                    zp1Var7.g = iAbs - zp1Var7.x;
                }
            }
            zp1 zp1Var8 = this.H;
            int iU0 = U0(e54Var, j54Var, zp1Var8) + zp1Var8.x;
            if (iU0 >= 0) {
                if (z) {
                    if (iAbs > iU0) {
                        i2 = (-i3) * iU0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iU0) {
                    i2 = i3 * iU0;
                } else {
                    i2 = i;
                }
                this.J.i(-i2);
                this.H.l = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(j54 j54Var) {
        return S0(j54Var);
    }

    public final int e1(int i) {
        if (G() == 0 || i == 0) {
            return 0;
        }
        T0();
        boolean zA = a();
        View view = this.S;
        int width = zA ? view.getWidth() : view.getHeight();
        int i2 = zA ? this.h : this.o;
        int layoutDirection = this.t.getLayoutDirection();
        xp1 xp1Var = this.I;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + xp1Var.n) - width, iAbs);
            }
            int i3 = xp1Var.n;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - xp1Var.n) - width, i);
            }
            int i4 = xp1Var.n;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final int f(j54 j54Var) {
        return S0(j54Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108 A[EDGE_INSN: B:86:0x0108->B:93:? BREAK  A[LOOP:2: B:52:0x00b7->B:71:0x0104], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0104 A[SYNTHETIC] */
    public final void f1(e54 e54Var, zp1 zp1Var) {
        int iG;
        int i;
        int iG2;
        int i2;
        View viewF;
        int i3;
        if (zp1Var.t) {
            int i4 = zp1Var.j;
            int i5 = zp1Var.x;
            rv rvVar = this.E;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (iG2 = G()) == 0 || (viewF = F((i2 = iG2 - 1))) == null || (i3 = ((int[]) rvVar.a)[g.R(viewF)]) == -1) {
                    return;
                }
                tp1 tp1Var = (tp1) this.D.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewF2 = F(i7);
                    if (viewF2 != null) {
                        int i8 = zp1Var.x;
                        if (!a() && this.B) {
                            if (this.J.y(viewF2) > i8) {
                                break;
                            }
                            if (tp1Var.i != g.R(viewF2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iG2 = i7;
                                break;
                            } else {
                                i3 += zp1Var.j;
                                tp1Var = (tp1) this.D.get(i3);
                                iG2 = i7;
                            }
                        } else {
                            if (this.J.v(viewF2) < this.J.x() - i8) {
                                break;
                            }
                            if (tp1Var.i != g.R(viewF2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iG2 = i7;
                                break;
                            } else {
                                i3 += zp1Var.j;
                                tp1Var = (tp1) this.D.get(i3);
                                iG2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= iG2) {
                    z0(i2, e54Var);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (iG = G()) != 0) {
                int i9 = 0;
                View viewF3 = F(0);
                if (viewF3 == null || (i = ((int[]) rvVar.a)[g.R(viewF3)]) == -1) {
                    return;
                }
                tp1 tp1Var2 = (tp1) this.D.get(i);
                while (true) {
                    if (i9 < iG) {
                        View viewF4 = F(i9);
                        if (viewF4 != null) {
                            int i10 = zp1Var.x;
                            if (a() || !this.B) {
                                if (this.J.y(viewF4) <= i10) {
                                    if (tp1Var2.b != g.R(viewF4)) {
                                        continue;
                                    } else {
                                        if (i >= this.D.size() - 1) {
                                            break;
                                        }
                                        i += zp1Var.j;
                                        tp1Var2 = (tp1) this.D.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.J.x() - this.J.v(viewF4) <= i10) {
                                if (tp1Var2.b != g.R(viewF4)) {
                                    continue;
                                } else if (i >= this.D.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += zp1Var.j;
                                    tp1Var2 = (tp1) this.D.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    z0(i9, e54Var);
                    i9--;
                }
            }
        }
    }

    @Override // defpackage.rp1
    public final void g(View view, int i, int i2, tp1 tp1Var) {
        c(V, view);
        if (a()) {
            int i3 = ((y44) view.getLayoutParams()).t.left + ((y44) view.getLayoutParams()).t.right;
            tp1Var.v += i3;
            tp1Var.x += i3;
        } else {
            int i4 = ((y44) view.getLayoutParams()).t.top + ((y44) view.getLayoutParams()).t.bottom;
            tp1Var.v += i4;
            tp1Var.x += i4;
        }
    }

    public final void g1(int i) {
        int i2 = this.e;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                v0();
                this.D.clear();
                xp1 xp1Var = this.I;
                xp1Var.y();
                xp1Var.n = 0;
            }
            this.e = i;
            B0();
        }
    }

    @Override // defpackage.rp1
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.rp1
    public final int getAlignItems() {
        return this.e;
    }

    @Override // defpackage.rp1
    public final int getFlexDirection() {
        return this.f;
    }

    @Override // defpackage.rp1
    public final int getFlexItemCount() {
        return this.G.y();
    }

    @Override // defpackage.rp1
    public final List getFlexLinesInternal() {
        return this.D;
    }

    @Override // defpackage.rp1
    public final int getFlexWrap() {
        return this.k;
    }

    @Override // defpackage.rp1
    public final int getLargestMainSize() {
        if (this.D.size() == 0) {
            return 0;
        }
        int size = this.D.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((tp1) this.D.get(i)).v);
        }
        return iMax;
    }

    @Override // defpackage.rp1
    public final int getMaxLine() {
        return this.A;
    }

    @Override // defpackage.rp1
    public final int getSumOfCrossSize() {
        int size = this.D.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((tp1) this.D.get(i2)).l;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final int h(j54 j54Var) {
        return Q0(j54Var);
    }

    public final void h1(int i) {
        if (this.f != i) {
            v0();
            this.f = i;
            this.J = null;
            this.K = null;
            this.D.clear();
            xp1 xp1Var = this.I;
            xp1Var.y();
            xp1Var.n = 0;
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean i() {
        if (this.k == 0) {
            return a();
        }
        if (!a()) {
            return true;
        }
        int i = this.h;
        View view = this.S;
        return i > (view != null ? view.getWidth() : 0);
    }

    public final void i1(int i) {
        if (i == 2) {
            uo1.u("wrap_reverse is not supported in FlexboxLayoutManager");
            return;
        }
        int i2 = this.k;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                v0();
                this.D.clear();
                xp1 xp1Var = this.I;
                xp1Var.y();
                xp1Var.n = 0;
            }
            this.k = i;
            this.J = null;
            this.K = null;
            B0();
        }
    }

    @Override // defpackage.rp1
    public final void j(View view, int i) {
        this.Q.put(i, view);
    }

    @Override // androidx.recyclerview.widget.g
    public final void j0(int i, int i2) {
        k1(i);
    }

    public final boolean j1(View view, int i, int i2, yp1 yp1Var) {
        return (!view.isLayoutRequested() && this.i && X(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) yp1Var).width) && X(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) yp1Var).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.g
    public final int k(j54 j54Var) {
        return Q0(j54Var);
    }

    public final void k1(int i) {
        View viewZ0 = Z0(G() - 1, -1);
        if (i >= (viewZ0 != null ? g.R(viewZ0) : -1)) {
            return;
        }
        int iG = G();
        rv rvVar = this.E;
        rvVar.c(iG);
        rvVar.i(iG);
        rvVar.w(iG);
        if (i >= ((int[]) rvVar.a).length) {
            return;
        }
        this.T = i;
        View viewF = F(0);
        if (viewF == null) {
            return;
        }
        this.M = g.R(viewF);
        if (a() || !this.B) {
            this.N = this.J.v(viewF) - this.J.a();
        } else {
            this.N = this.J.j() + this.J.y(viewF);
        }
    }

    @Override // defpackage.rp1
    public final View l(int i) {
        return y(i);
    }

    @Override // androidx.recyclerview.widget.g
    public final void l0(int i, int i2) {
        k1(Math.min(i, i2));
    }

    public final void l1(xp1 xp1Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = a() ? this.z : this.u;
            this.H.y = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.H.y = false;
        }
        if (a() || !this.B) {
            this.H.g = this.J.l() - xp1Var.r;
        } else {
            this.H.g = xp1Var.r - getPaddingRight();
        }
        zp1 zp1Var = this.H;
        zp1Var.n = xp1Var.g;
        zp1Var.j = 1;
        zp1Var.v = xp1Var.r;
        zp1Var.x = Integer.MIN_VALUE;
        zp1Var.r = xp1Var.y;
        if (!z || this.D.size() <= 1 || (i = xp1Var.y) < 0 || i >= this.D.size() - 1) {
            return;
        }
        tp1 tp1Var = (tp1) this.D.get(xp1Var.y);
        zp1 zp1Var2 = this.H;
        zp1Var2.r++;
        zp1Var2.n += tp1Var.j;
    }

    @Override // defpackage.rp1
    public final int m(View view) {
        int i;
        int i2;
        if (a()) {
            i = ((y44) view.getLayoutParams()).t.top;
            i2 = ((y44) view.getLayoutParams()).t.bottom;
        } else {
            i = ((y44) view.getLayoutParams()).t.left;
            i2 = ((y44) view.getLayoutParams()).t.right;
        }
        return i + i2;
    }

    @Override // androidx.recyclerview.widget.g
    public final void m0(int i, int i2) {
        k1(i);
    }

    public final void m1(xp1 xp1Var, boolean z, boolean z2) {
        if (z2) {
            int i = a() ? this.z : this.u;
            this.H.y = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.H.y = false;
        }
        if (a() || !this.B) {
            this.H.g = xp1Var.r - this.J.a();
        } else {
            this.H.g = (this.S.getWidth() - xp1Var.r) - this.J.a();
        }
        zp1 zp1Var = this.H;
        zp1Var.n = xp1Var.g;
        zp1Var.j = -1;
        zp1Var.v = xp1Var.r;
        zp1Var.x = Integer.MIN_VALUE;
        int i2 = xp1Var.y;
        zp1Var.r = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.D.size();
        int i3 = xp1Var.y;
        if (size > i3) {
            tp1 tp1Var = (tp1) this.D.get(i3);
            zp1 zp1Var2 = this.H;
            zp1Var2.r--;
            zp1Var2.n -= tp1Var.j;
        }
    }

    @Override // defpackage.rp1
    public final int n(int i, int i2, int i3) {
        return g.H(b(), this.o, this.z, i2, i3);
    }

    @Override // androidx.recyclerview.widget.g
    public final void n0(int i) {
        k1(i);
    }

    @Override // androidx.recyclerview.widget.g
    public final int o(j54 j54Var) {
        return R0(j54Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void o0(RecyclerView recyclerView, int i, int i2) {
        k1(i);
        k1(i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x01af  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:139:0x021b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0228  */
    /* JADX WARN: Code duplicated, block: B:143:0x0235  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0149  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    @Override // androidx.recyclerview.widget.g
    public final void p0(e54 e54Var, j54 j54Var) {
        View viewV0;
        FlexboxLayoutManager flexboxLayoutManager;
        vm3 vm3Var;
        int iR;
        int i;
        int size;
        int i2;
        int i3;
        View viewB;
        View viewF;
        boolean z;
        int iV;
        vm3 vm3Var2;
        boolean z2;
        vm3 vm3Var3;
        int iV2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.F = e54Var;
        this.G = j54Var;
        int iY = j54Var.y();
        if (iY == 0 && j54Var.l) {
            return;
        }
        int layoutDirection = this.t.getLayoutDirection();
        int i8 = this.f;
        if (i8 == 0) {
            this.B = layoutDirection == 1;
            this.C = this.k == 2;
        } else if (i8 == 1) {
            this.B = layoutDirection != 1;
            this.C = this.k == 2;
        } else if (i8 == 2) {
            boolean z5 = layoutDirection == 1;
            this.B = z5;
            if (this.k == 2) {
                this.B = !z5;
            }
            this.C = false;
        } else if (i8 != 3) {
            this.B = false;
            this.C = false;
        } else {
            boolean z6 = layoutDirection == 1;
            this.B = z6;
            if (this.k == 2) {
                this.B = !z6;
            }
            this.C = true;
        }
        T0();
        if (this.H == null) {
            zp1 zp1Var = new zp1();
            zp1Var.j = 1;
            this.H = zp1Var;
        }
        rv rvVar = this.E;
        rvVar.c(iY);
        rvVar.i(iY);
        rvVar.w(iY);
        this.H.t = false;
        aq1 aq1Var = this.L;
        if (aq1Var != null && (i7 = aq1Var.j) >= 0 && i7 < iY) {
            this.M = i7;
        }
        xp1 xp1Var = this.I;
        if (!xp1Var.x || this.M != -1 || aq1Var != null) {
            xp1Var.y();
            aq1 aq1Var2 = this.L;
            if (j54Var.l || (i3 = this.M) == -1) {
                if (G() != 0) {
                    if (xp1Var.v) {
                        viewV0 = X0(j54Var.y());
                    } else {
                        viewV0 = V0(j54Var.y());
                    }
                    if (viewV0 != null) {
                        flexboxLayoutManager = xp1Var.j;
                        if (flexboxLayoutManager.k == 0) {
                            vm3Var = flexboxLayoutManager.K;
                        } else {
                            vm3Var = flexboxLayoutManager.J;
                        }
                        if (flexboxLayoutManager.a() && flexboxLayoutManager.B) {
                            if (xp1Var.v) {
                                xp1Var.r = vm3Var.q() + vm3Var.v(viewV0);
                            } else {
                                xp1Var.r = vm3Var.y(viewV0);
                            }
                        } else if (xp1Var.v) {
                            xp1Var.r = vm3Var.q() + vm3Var.y(viewV0);
                        } else {
                            xp1Var.r = vm3Var.v(viewV0);
                        }
                        iR = g.R(viewV0);
                        xp1Var.g = iR;
                        xp1Var.l = false;
                        int[] iArr = (int[]) flexboxLayoutManager.E.a;
                        if (iR == -1) {
                            iR = 0;
                        }
                        i = iArr[iR];
                        if (i == -1) {
                            i = 0;
                        }
                        xp1Var.y = i;
                        size = flexboxLayoutManager.D.size();
                        i2 = xp1Var.y;
                        if (size > i2) {
                            xp1Var.g = ((tp1) flexboxLayoutManager.D.get(i2)).i;
                        }
                    } else {
                        xp1Var.g();
                        xp1Var.g = 0;
                        xp1Var.y = 0;
                    }
                } else {
                    xp1Var.g();
                    xp1Var.g = 0;
                    xp1Var.y = 0;
                }
            } else if (i3 < 0 || i3 >= j54Var.y()) {
                this.M = -1;
                this.N = Integer.MIN_VALUE;
                if (G() != 0) {
                    if (xp1Var.v) {
                        viewV0 = X0(j54Var.y());
                    } else {
                        viewV0 = V0(j54Var.y());
                    }
                    if (viewV0 != null) {
                        flexboxLayoutManager = xp1Var.j;
                        if (flexboxLayoutManager.k == 0) {
                            vm3Var = flexboxLayoutManager.K;
                        } else {
                            vm3Var = flexboxLayoutManager.J;
                        }
                        if (flexboxLayoutManager.a()) {
                            if (xp1Var.v) {
                                xp1Var.r = vm3Var.q() + vm3Var.y(viewV0);
                            } else {
                                xp1Var.r = vm3Var.v(viewV0);
                            }
                        } else if (xp1Var.v) {
                            xp1Var.r = vm3Var.q() + vm3Var.y(viewV0);
                        } else {
                            xp1Var.r = vm3Var.v(viewV0);
                        }
                        iR = g.R(viewV0);
                        xp1Var.g = iR;
                        xp1Var.l = false;
                        int[] iArr2 = (int[]) flexboxLayoutManager.E.a;
                        if (iR == -1) {
                            iR = 0;
                        }
                        i = iArr2[iR];
                        if (i == -1) {
                            i = 0;
                        }
                        xp1Var.y = i;
                        size = flexboxLayoutManager.D.size();
                        i2 = xp1Var.y;
                        if (size > i2) {
                            xp1Var.g = ((tp1) flexboxLayoutManager.D.get(i2)).i;
                        }
                    } else {
                        xp1Var.g();
                        xp1Var.g = 0;
                        xp1Var.y = 0;
                    }
                } else {
                    xp1Var.g();
                    xp1Var.g = 0;
                    xp1Var.y = 0;
                }
            } else {
                int i9 = this.M;
                xp1Var.g = i9;
                xp1Var.y = ((int[]) rvVar.a)[i9];
                aq1 aq1Var3 = this.L;
                if (aq1Var3 != null) {
                    int iY2 = j54Var.y();
                    int i10 = aq1Var3.j;
                    if (i10 >= 0 && i10 < iY2) {
                        xp1Var.r = this.J.a() + aq1Var2.t;
                        xp1Var.l = true;
                        xp1Var.y = -1;
                    } else if (this.N == Integer.MIN_VALUE) {
                        viewB = B(this.M);
                        if (viewB != null) {
                            if (G() > 0 && (viewF = F(0)) != null) {
                                if (this.M < g.R(viewF)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                xp1Var.v = z;
                            }
                            xp1Var.g();
                        } else if (this.J.r(viewB) > this.J.m()) {
                            xp1Var.g();
                        } else {
                            iV = this.J.v(viewB) - this.J.a();
                            vm3Var2 = this.J;
                            if (iV < 0) {
                                xp1Var.r = vm3Var2.a();
                                xp1Var.v = false;
                            } else if (vm3Var2.l() - this.J.y(viewB) < 0) {
                                xp1Var.r = this.J.l();
                                xp1Var.v = true;
                            } else {
                                z2 = xp1Var.v;
                                vm3Var3 = this.J;
                                if (z2) {
                                    iV2 = this.J.q() + vm3Var3.y(viewB);
                                } else {
                                    iV2 = vm3Var3.v(viewB);
                                }
                                xp1Var.r = iV2;
                            }
                        }
                    } else if (a() && this.B) {
                        xp1Var.r = this.N - this.J.j();
                    } else {
                        xp1Var.r = this.J.a() + this.N;
                    }
                } else if (this.N == Integer.MIN_VALUE) {
                    viewB = B(this.M);
                    if (viewB != null) {
                        if (G() > 0) {
                            if (this.M < g.R(viewF)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            xp1Var.v = z;
                        }
                        xp1Var.g();
                    } else if (this.J.r(viewB) > this.J.m()) {
                        xp1Var.g();
                    } else {
                        iV = this.J.v(viewB) - this.J.a();
                        vm3Var2 = this.J;
                        if (iV < 0) {
                            xp1Var.r = vm3Var2.a();
                            xp1Var.v = false;
                        } else if (vm3Var2.l() - this.J.y(viewB) < 0) {
                            xp1Var.r = this.J.l();
                            xp1Var.v = true;
                        } else {
                            z2 = xp1Var.v;
                            vm3Var3 = this.J;
                            if (z2) {
                                iV2 = this.J.q() + vm3Var3.y(viewB);
                            } else {
                                iV2 = vm3Var3.v(viewB);
                            }
                            xp1Var.r = iV2;
                        }
                    }
                } else if (a()) {
                    xp1Var.r = this.J.a() + this.N;
                } else {
                    xp1Var.r = this.J.a() + this.N;
                }
            }
            xp1Var.x = true;
        }
        A(e54Var);
        if (xp1Var.v) {
            m1(xp1Var, false, true);
        } else {
            l1(xp1Var, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, this.u);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.z);
        int i11 = this.h;
        int i12 = this.o;
        boolean zA = a();
        Context context = this.R;
        if (zA) {
            int i13 = this.O;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            zp1 zp1Var2 = this.H;
            i4 = zp1Var2.y ? context.getResources().getDisplayMetrics().heightPixels : zp1Var2.g;
        } else {
            int i14 = this.P;
            z3 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
            zp1 zp1Var3 = this.H;
            i4 = zp1Var3.y ? context.getResources().getDisplayMetrics().widthPixels : zp1Var3.g;
        }
        int i15 = i4;
        this.O = i11;
        this.P = i12;
        int i16 = this.T;
        up1 up1Var = this.U;
        if (i16 != -1 || (this.M == -1 && !z3)) {
            int iMin = xp1Var.g;
            if (i16 != -1) {
                iMin = Math.min(i16, iMin);
            }
            up1Var.g = null;
            up1Var.y = 0;
            boolean zA2 = a();
            List list = this.D;
            if (zA2) {
                if (list.size() > 0) {
                    rvVar.j(iMin, this.D);
                    this.E.x(this.U, iMakeMeasureSpec, iMakeMeasureSpec2, i15, iMin, xp1Var.g, this.D);
                } else {
                    rvVar.w(iY);
                    this.E.x(this.U, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, -1, this.D);
                }
            } else if (list.size() > 0) {
                rvVar.j(iMin, this.D);
                int i17 = iMin;
                this.E.x(this.U, iMakeMeasureSpec2, iMakeMeasureSpec, i15, i17, xp1Var.g, this.D);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i17;
            } else {
                rvVar.w(iY);
                this.E.x(this.U, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, -1, this.D);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.D = up1Var.g;
            rvVar.q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            rvVar.A(iMin);
        } else if (!xp1Var.v) {
            this.D.clear();
            up1Var.g = null;
            up1Var.y = 0;
            boolean zA3 = a();
            int i18 = xp1Var.g;
            rv rvVar2 = this.E;
            up1 up1Var2 = this.U;
            if (zA3) {
                rvVar2.x(up1Var2, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, i18, this.D);
            } else {
                rvVar2.x(up1Var2, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, i18, this.D);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.D = up1Var.g;
            rvVar.q(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            rvVar.A(0);
            int i19 = ((int[]) rvVar.a)[xp1Var.g];
            xp1Var.y = i19;
            this.H.r = i19;
        }
        U0(e54Var, j54Var, this.H);
        boolean z7 = xp1Var.v;
        zp1 zp1Var4 = this.H;
        if (z7) {
            i6 = zp1Var4.v;
            z4 = true;
            l1(xp1Var, true, false);
            U0(e54Var, j54Var, this.H);
            i5 = this.H.v;
        } else {
            z4 = true;
            i5 = zp1Var4.v;
            m1(xp1Var, true, false);
            U0(e54Var, j54Var, this.H);
            i6 = this.H.v;
        }
        if (G() > 0) {
            if (xp1Var.v) {
                c1(b1(i5, e54Var, j54Var, z4) + i6, e54Var, j54Var, false);
            } else {
                b1(c1(i6, e54Var, j54Var, z4) + i5, e54Var, j54Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void q0(j54 j54Var) {
        this.L = null;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.T = -1;
        this.I.y();
        this.Q.clear();
    }

    @Override // defpackage.rp1
    public final int r(View view, int i, int i2) {
        int i3;
        int i4;
        if (a()) {
            i3 = ((y44) view.getLayoutParams()).t.left;
            i4 = ((y44) view.getLayoutParams()).t.right;
        } else {
            i3 = ((y44) view.getLayoutParams()).t.top;
            i4 = ((y44) view.getLayoutParams()).t.bottom;
        }
        return i3 + i4;
    }

    @Override // androidx.recyclerview.widget.g
    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof aq1) {
            this.L = (aq1) parcelable;
            B0();
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean s(y44 y44Var) {
        return y44Var instanceof yp1;
    }

    @Override // androidx.recyclerview.widget.g
    public final Parcelable s0() {
        aq1 aq1Var = this.L;
        if (aq1Var != null) {
            aq1 aq1Var2 = new aq1();
            aq1Var2.j = aq1Var.j;
            aq1Var2.t = aq1Var.t;
            return aq1Var2;
        }
        aq1 aq1Var3 = new aq1();
        if (G() <= 0) {
            aq1Var3.j = -1;
            return aq1Var3;
        }
        View viewF = F(0);
        aq1Var3.j = g.R(viewF);
        aq1Var3.t = this.J.v(viewF) - this.J.a();
        return aq1Var3;
    }

    @Override // defpackage.rp1
    public final void setFlexLines(List list) {
        this.D = list;
    }

    @Override // defpackage.rp1
    public final int t(int i, int i2, int i3) {
        return g.H(i(), this.h, this.u, i2, i3);
    }

    @Override // defpackage.i54
    public final PointF v(int i) {
        View viewF;
        if (G() == 0 || (viewF = F(0)) == null) {
            return null;
        }
        int i2 = i < g.R(viewF) ? -1 : 1;
        return a() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // defpackage.rp1
    public final View y(int i) {
        View view = (View) this.Q.get(i);
        return view != null ? view : this.F.n(i);
    }

    @Override // androidx.recyclerview.widget.g
    public final void d0(RecyclerView recyclerView) {
    }

    @Override // defpackage.rp1
    public final void x(tp1 tp1Var) {
    }

    public FlexboxLayoutManager(yk5 yk5Var) {
        h1(0);
        i1(1);
        g1(4);
        this.R = yk5Var;
    }
}
