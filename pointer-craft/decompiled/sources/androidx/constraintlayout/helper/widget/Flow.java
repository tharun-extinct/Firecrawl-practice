package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.as0;
import defpackage.dr1;
import defpackage.fr1;
import defpackage.gs0;
import defpackage.j24;
import defpackage.m42;
import defpackage.sm5;
import defpackage.tm5;
import defpackage.ts0;
import defpackage.us0;
import defpackage.vy;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Flow extends sm5 {
    public fr1 s;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.sm5, defpackage.ds0
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        fr1 fr1Var = new fr1();
        fr1Var.s0 = 0;
        fr1Var.t0 = 0;
        fr1Var.u0 = 0;
        fr1Var.v0 = 0;
        fr1Var.w0 = 0;
        fr1Var.x0 = 0;
        fr1Var.y0 = false;
        fr1Var.z0 = 0;
        fr1Var.A0 = 0;
        fr1Var.B0 = new vy();
        fr1Var.C0 = null;
        fr1Var.D0 = -1;
        fr1Var.E0 = -1;
        fr1Var.F0 = -1;
        fr1Var.G0 = -1;
        fr1Var.H0 = -1;
        fr1Var.I0 = -1;
        fr1Var.J0 = 0.5f;
        fr1Var.K0 = 0.5f;
        fr1Var.L0 = 0.5f;
        fr1Var.M0 = 0.5f;
        fr1Var.N0 = 0.5f;
        fr1Var.O0 = 0.5f;
        fr1Var.P0 = 0;
        fr1Var.Q0 = 0;
        fr1Var.R0 = 2;
        fr1Var.S0 = 2;
        fr1Var.T0 = 0;
        fr1Var.U0 = -1;
        fr1Var.V0 = 0;
        fr1Var.W0 = new ArrayList();
        fr1Var.X0 = null;
        fr1Var.Y0 = null;
        fr1Var.Z0 = null;
        fr1Var.b1 = 0;
        this.s = fr1Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j24.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.s.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    fr1 fr1Var2 = this.s;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fr1Var2.s0 = dimensionPixelSize;
                    fr1Var2.t0 = dimensionPixelSize;
                    fr1Var2.u0 = dimensionPixelSize;
                    fr1Var2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    fr1 fr1Var3 = this.s;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fr1Var3.u0 = dimensionPixelSize2;
                    fr1Var3.w0 = dimensionPixelSize2;
                    fr1Var3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.s.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.s.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.s.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.s.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.s.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.s.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.s.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.s.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.s.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.s.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.s.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.s.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.s.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.s.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.s.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.s.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.s.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.s.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.s.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.s.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.s.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.s.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.s.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.m = this.s;
        m();
    }

    @Override // defpackage.ds0, android.view.View
    public final void onMeasure(int i, int i2) {
        q(this.s, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sm5
    public final void q(tm5 tm5Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ts0[] ts0VarArr;
        int i6;
        int[] iArr;
        int i7;
        dr1 dr1Var;
        char c;
        char c2;
        int iMin;
        int i8;
        int i9;
        ts0 ts0Var;
        int i10;
        int i11;
        ts0 ts0Var2;
        int i12;
        int iCeil;
        Object obj;
        ts0 ts0Var3;
        int i13;
        ts0 ts0Var4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        as0 as0Var;
        as0 as0Var2;
        as0 as0Var3;
        ArrayList arrayList;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (tm5Var == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        fr1 fr1Var = (fr1) tm5Var;
        int[] iArr2 = fr1Var.p0;
        as0 as0Var4 = fr1Var.J;
        as0 as0Var5 = fr1Var.I;
        as0 as0Var6 = fr1Var.K;
        as0 as0Var7 = fr1Var.L;
        ArrayList arrayList2 = fr1Var.W0;
        if (fr1Var.r0 > 0) {
            vy vyVar = fr1Var.B0;
            us0 us0Var = fr1Var.T;
            gs0 gs0Var = us0Var != null ? us0Var.u0 : null;
            if (gs0Var == null) {
                fr1Var.z0 = 0;
                fr1Var.A0 = 0;
                fr1Var.y0 = false;
            } else {
                int i19 = 0;
                while (i19 < fr1Var.r0) {
                    ts0 ts0Var5 = fr1Var.q0[i19];
                    if (ts0Var5 == null) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        if (!(ts0Var5 instanceof m42)) {
                            as0Var = as0Var5;
                            int iA = ts0Var5.a(0);
                            as0Var2 = as0Var6;
                            int iA2 = ts0Var5.a(1);
                            as0Var3 = as0Var7;
                            if (iA == 3) {
                                arrayList = arrayList2;
                                if (ts0Var5.p == 1 || iA2 != 3 || ts0Var5.u == 1) {
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            if (iA == 3) {
                                iA = 2;
                            }
                            if (iA2 == 3) {
                                iA2 = 2;
                            }
                            vyVar.g = iA;
                            vyVar.y = iA2;
                            vyVar.r = ts0Var5.s();
                            vyVar.n = ts0Var5.m();
                            gs0Var.y(ts0Var5, vyVar);
                            ts0Var5.O(vyVar.v);
                            ts0Var5.L(vyVar.x);
                            ts0Var5.I(vyVar.l);
                        }
                        i19 = i18 + 1;
                        as0Var5 = as0Var;
                        as0Var6 = as0Var2;
                        as0Var7 = as0Var3;
                        arrayList2 = arrayList;
                    }
                    as0Var = as0Var5;
                    as0Var2 = as0Var6;
                    as0Var3 = as0Var7;
                    arrayList = arrayList2;
                    i19 = i18 + 1;
                    as0Var5 = as0Var;
                    as0Var6 = as0Var2;
                    as0Var7 = as0Var3;
                    arrayList2 = arrayList;
                }
            }
            setMeasuredDimension(tm5Var.z0, tm5Var.A0);
        }
        as0 as0Var8 = as0Var5;
        as0 as0Var9 = as0Var6;
        as0 as0Var10 = as0Var7;
        ArrayList arrayList3 = arrayList2;
        int i20 = fr1Var.w0;
        int i21 = fr1Var.x0;
        int i22 = fr1Var.s0;
        int i23 = fr1Var.t0;
        int[] iArr3 = new int[2];
        int i24 = (size - i20) - i21;
        int i25 = fr1Var.V0;
        if (i25 == 1) {
            i24 = (size2 - i22) - i23;
        }
        int i26 = i24;
        int i27 = fr1Var.D0;
        if (i25 == 0) {
            if (i27 == -1) {
                fr1Var.D0 = 0;
            }
            if (fr1Var.E0 == -1) {
                fr1Var.E0 = 0;
            }
        } else {
            if (i27 == -1) {
                fr1Var.D0 = 0;
            }
            if (fr1Var.E0 == -1) {
                fr1Var.E0 = 0;
            }
        }
        ts0[] ts0VarArr2 = fr1Var.q0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i3 = fr1Var.r0;
            i4 = i21;
            if (i28 >= i3) {
                break;
            }
            if (fr1Var.q0[i28].g0 == 8) {
                i29++;
            }
            i28++;
            i21 = i4;
        }
        if (i29 > 0) {
            ts0VarArr = new ts0[i3 - i29];
            int i30 = 0;
            int i31 = 0;
            while (i30 < fr1Var.r0) {
                ts0 ts0Var6 = fr1Var.q0[i30];
                ts0[] ts0VarArr3 = ts0VarArr;
                if (ts0Var6.g0 != 8) {
                    ts0VarArr3[i31] = ts0Var6;
                    i31++;
                }
                i30++;
                ts0VarArr = ts0VarArr3;
            }
            i5 = i31;
        } else {
            i5 = i3;
            ts0VarArr = ts0VarArr2;
        }
        fr1Var.a1 = ts0VarArr;
        fr1Var.b1 = i5;
        int i32 = fr1Var.T0;
        if (i32 != 0) {
            if (i32 == 1) {
                size2 = size2;
                int i33 = i5;
                i6 = i22;
                i23 = i23;
                iArr = iArr3;
                i7 = i4;
                int i34 = fr1Var.V0;
                if (i33 != 0) {
                    arrayList3.clear();
                    dr1 dr1Var2 = new dr1(fr1Var, i34, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                    arrayList3.add(dr1Var2);
                    if (i34 == 0) {
                        int i35 = 0;
                        i8 = 0;
                        int i36 = 0;
                        while (i35 < i33) {
                            ts0 ts0Var7 = ts0VarArr[i35];
                            int iV = fr1Var.V(ts0Var7, i26);
                            if (ts0Var7.p0[0] == 3) {
                                i8++;
                            }
                            boolean z = (i36 == i26 || (fr1Var.P0 + i36) + iV > i26) && dr1Var2.y != null;
                            if (!z && i35 > 0 && (i12 = fr1Var.U0) > 0 && i35 % i12 == 0) {
                                z = true;
                            }
                            if (z) {
                                i11 = i8;
                                ts0Var2 = ts0Var7;
                                dr1Var2 = new dr1(fr1Var, i34, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                                dr1Var2.c = i35;
                                arrayList3.add(dr1Var2);
                            } else {
                                i11 = i8;
                                ts0Var2 = ts0Var7;
                                if (i35 > 0) {
                                    i36 = fr1Var.P0 + iV + i36;
                                }
                                dr1Var2.g(ts0Var2);
                                i35++;
                                i8 = i11;
                            }
                            i36 = iV;
                            dr1Var2.g(ts0Var2);
                            i35++;
                            i8 = i11;
                        }
                    } else {
                        int i37 = 0;
                        i8 = 0;
                        int i38 = 0;
                        while (i37 < i33) {
                            ts0 ts0Var8 = ts0VarArr[i37];
                            int iU = fr1Var.U(ts0Var8, i26);
                            if (ts0Var8.p0[1] == 3) {
                                i8++;
                            }
                            boolean z2 = (i38 == i26 || (fr1Var.Q0 + i38) + iU > i26) && dr1Var2.y != null;
                            if (!z2 && i37 > 0 && (i10 = fr1Var.U0) > 0 && i37 % i10 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                i9 = i8;
                                ts0Var = ts0Var8;
                                dr1Var2 = new dr1(fr1Var, i34, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                                dr1Var2.c = i37;
                                arrayList3.add(dr1Var2);
                            } else {
                                i9 = i8;
                                ts0Var = ts0Var8;
                                if (i37 > 0) {
                                    i38 = fr1Var.Q0 + iU + i38;
                                }
                                dr1Var2.g(ts0Var);
                                i37++;
                                i8 = i9;
                            }
                            i38 = iU;
                            dr1Var2.g(ts0Var);
                            i37++;
                            i8 = i9;
                        }
                    }
                    int size3 = arrayList3.size();
                    int i39 = fr1Var.w0;
                    int i40 = fr1Var.s0;
                    int i41 = fr1Var.x0;
                    int i42 = fr1Var.t0;
                    boolean z3 = iArr2[0] == 2 || iArr2[1] == 2;
                    if (i8 > 0 && z3) {
                        for (int i43 = 0; i43 < size3; i43++) {
                            dr1 dr1Var3 = (dr1) arrayList3.get(i43);
                            if (i34 == 0) {
                                dr1Var3.v(i26 - dr1Var3.n());
                            } else {
                                dr1Var3.v(i26 - dr1Var3.r());
                            }
                        }
                    }
                    int i44 = i39;
                    int i45 = i40;
                    int i46 = i41;
                    int i47 = i42;
                    as0 as0Var11 = as0Var4;
                    as0 as0Var12 = as0Var8;
                    as0 as0Var13 = as0Var9;
                    as0 as0Var14 = as0Var10;
                    int iMax = 0;
                    int i48 = 0;
                    for (int i49 = 0; i49 < size3; i49++) {
                        dr1 dr1Var4 = (dr1) arrayList3.get(i49);
                        if (i34 == 0) {
                            if (i49 < size3 - 1) {
                                as0Var14 = ((dr1) arrayList3.get(i49 + 1)).y.J;
                                i47 = 0;
                            } else {
                                i47 = fr1Var.t0;
                                as0Var14 = as0Var10;
                            }
                            as0 as0Var15 = dr1Var4.y.L;
                            dr1Var4.x(i34, as0Var12, as0Var11, as0Var13, as0Var14, i44, i45, i46, i47, i26);
                            iMax = Math.max(iMax, dr1Var4.n());
                            int iR = dr1Var4.r() + i48;
                            if (i49 > 0) {
                                iR += fr1Var.Q0;
                            }
                            i48 = iR;
                            as0Var11 = as0Var15;
                            i45 = 0;
                        } else {
                            if (i49 < size3 - 1) {
                                as0Var13 = ((dr1) arrayList3.get(i49 + 1)).y.I;
                                i46 = 0;
                            } else {
                                i46 = fr1Var.x0;
                                as0Var13 = as0Var9;
                            }
                            as0 as0Var16 = dr1Var4.y.K;
                            dr1Var4.x(i34, as0Var12, as0Var11, as0Var13, as0Var14, i44, i45, i46, i47, i26);
                            int iN = dr1Var4.n() + iMax;
                            int iMax2 = Math.max(i48, dr1Var4.r());
                            if (i49 > 0) {
                                iN += fr1Var.P0;
                            }
                            i48 = iMax2;
                            iMax = iN;
                            as0Var12 = as0Var16;
                            i44 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i48;
                }
            } else if (i32 != 2) {
                if (i32 != 3) {
                    i6 = i22;
                } else {
                    int i50 = fr1Var.V0;
                    if (i5 == 0) {
                        i6 = i22;
                    } else {
                        arrayList3.clear();
                        int i51 = i5;
                        i23 = i23;
                        i7 = i4;
                        i6 = i22;
                        iArr = iArr3;
                        dr1 dr1Var5 = new dr1(fr1Var, i50, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                        arrayList3.add(dr1Var5);
                        if (i50 == 0) {
                            int i52 = 0;
                            int i53 = 0;
                            i13 = 0;
                            int i54 = 0;
                            while (i52 < i51) {
                                i53++;
                                ts0 ts0Var9 = ts0VarArr[i52];
                                int iV2 = fr1Var.V(ts0Var9, i26);
                                int i55 = i50;
                                int i56 = i52;
                                if (ts0Var9.p0[0] == 3) {
                                    i13++;
                                }
                                int i57 = i13;
                                boolean z4 = (i54 == i26 || (fr1Var.P0 + i54) + iV2 > i26) && dr1Var5.y != null;
                                if (!z4 && i56 > 0 && (i17 = fr1Var.U0) > 0 && i53 > i17) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i15 = size2;
                                    i16 = i56;
                                    i50 = i55;
                                    dr1Var5 = new dr1(fr1Var, i50, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                                    dr1Var5.c = i16;
                                    arrayList3.add(dr1Var5);
                                    i54 = iV2;
                                    i53 = 1;
                                } else {
                                    i15 = size2;
                                    i16 = i56;
                                    i50 = i55;
                                    i54 = i16 > 0 ? fr1Var.P0 + iV2 + i54 : iV2;
                                }
                                dr1Var5.g(ts0Var9);
                                i52 = i16 + 1;
                                i13 = i57;
                                size2 = i15;
                            }
                            size2 = size2;
                        } else {
                            size2 = size2;
                            int i58 = 0;
                            int i59 = 0;
                            int i60 = 0;
                            int i61 = 0;
                            while (i58 < i51) {
                                i59++;
                                ts0 ts0Var10 = ts0VarArr[i58];
                                int iU2 = fr1Var.U(ts0Var10, i26);
                                int i62 = i50;
                                if (ts0Var10.p0[1] == 3) {
                                    i60++;
                                }
                                int i63 = i60;
                                boolean z5 = (i61 == i26 || (fr1Var.Q0 + i61) + iU2 > i26) && dr1Var5.y != null;
                                if (!z5 && i58 > 0 && (i14 = fr1Var.U0) > 0 && i59 > i14) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i50 = i62;
                                    dr1Var5 = new dr1(fr1Var, i50, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                                    dr1Var5.c = i58;
                                    arrayList3.add(dr1Var5);
                                    ts0Var4 = ts0Var10;
                                    i61 = iU2;
                                    i59 = 1;
                                } else {
                                    ts0Var4 = ts0Var10;
                                    i50 = i62;
                                    i61 = i58 > 0 ? fr1Var.Q0 + iU2 + i61 : iU2;
                                }
                                dr1Var5.g(ts0Var4);
                                i58++;
                                i60 = i63;
                            }
                            i13 = i60;
                        }
                        int size4 = arrayList3.size();
                        int i64 = fr1Var.w0;
                        int i65 = fr1Var.s0;
                        int i66 = fr1Var.x0;
                        int i67 = fr1Var.t0;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i13 > 0 && z6) {
                            for (int i68 = 0; i68 < size4; i68++) {
                                dr1 dr1Var6 = (dr1) arrayList3.get(i68);
                                if (i50 == 0) {
                                    dr1Var6.v(i26 - dr1Var6.n());
                                } else {
                                    dr1Var6.v(i26 - dr1Var6.r());
                                }
                            }
                        }
                        int i69 = i64;
                        int i70 = i65;
                        int i71 = i66;
                        int i72 = i67;
                        as0 as0Var17 = as0Var4;
                        as0 as0Var18 = as0Var8;
                        as0 as0Var19 = as0Var9;
                        as0 as0Var20 = as0Var10;
                        int iMax3 = 0;
                        int i73 = 0;
                        for (int i74 = 0; i74 < size4; i74++) {
                            dr1 dr1Var7 = (dr1) arrayList3.get(i74);
                            if (i50 == 0) {
                                if (i74 < size4 - 1) {
                                    as0Var20 = ((dr1) arrayList3.get(i74 + 1)).y.J;
                                    i72 = 0;
                                } else {
                                    i72 = fr1Var.t0;
                                    as0Var20 = as0Var10;
                                }
                                as0 as0Var21 = dr1Var7.y.L;
                                dr1Var7.x(i50, as0Var18, as0Var17, as0Var19, as0Var20, i69, i70, i71, i72, i26);
                                iMax3 = Math.max(iMax3, dr1Var7.n());
                                int iR2 = dr1Var7.r() + i73;
                                if (i74 > 0) {
                                    iR2 += fr1Var.Q0;
                                }
                                i73 = iR2;
                                as0Var17 = as0Var21;
                                i70 = 0;
                            } else {
                                if (i74 < size4 - 1) {
                                    as0Var19 = ((dr1) arrayList3.get(i74 + 1)).y.I;
                                    i71 = 0;
                                } else {
                                    i71 = fr1Var.x0;
                                    as0Var19 = as0Var9;
                                }
                                as0 as0Var22 = dr1Var7.y.K;
                                dr1Var7.x(i50, as0Var18, as0Var17, as0Var19, as0Var20, i69, i70, i71, i72, i26);
                                int iN2 = dr1Var7.n() + iMax3;
                                int iMax4 = Math.max(i73, dr1Var7.r());
                                if (i74 > 0) {
                                    iN2 += fr1Var.P0;
                                }
                                i73 = iMax4;
                                iMax3 = iN2;
                                as0Var18 = as0Var22;
                                i69 = 0;
                            }
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i73;
                    }
                }
                iArr = iArr3;
                i7 = i4;
            } else {
                size2 = size2;
                int i75 = i5;
                i6 = i22;
                i23 = i23;
                iArr = iArr3;
                i7 = i4;
                int i76 = fr1Var.V0;
                int iCeil2 = fr1Var.U0;
                if (i76 == 0) {
                    if (iCeil2 <= 0) {
                        int i77 = 0;
                        iCeil = 0;
                        for (int i78 = 0; i78 < i75; i78++) {
                            if (i78 > 0) {
                                i77 += fr1Var.P0;
                            }
                            ts0 ts0Var11 = ts0VarArr[i78];
                            if (ts0Var11 != null) {
                                int iV3 = fr1Var.V(ts0Var11, i26) + i77;
                                if (iV3 > i26) {
                                    break;
                                }
                                iCeil++;
                                i77 = iV3;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i79 = 0;
                        int i80 = 0;
                        for (int i81 = 0; i81 < i75; i81++) {
                            if (i81 > 0) {
                                i79 += fr1Var.Q0;
                            }
                            ts0 ts0Var12 = ts0VarArr[i81];
                            if (ts0Var12 != null) {
                                int iU3 = fr1Var.U(ts0Var12, i26) + i79;
                                if (iU3 > i26) {
                                    break;
                                }
                                i80++;
                                i79 = iU3;
                            }
                        }
                        iCeil2 = i80;
                    }
                    iCeil = 0;
                }
                if (fr1Var.Z0 == null) {
                    fr1Var.Z0 = new int[2];
                }
                boolean z7 = (iCeil2 == 0 && i76 == 1) || (iCeil == 0 && i76 == 0);
                while (!z7) {
                    if (i76 == 0) {
                        iCeil2 = (int) Math.ceil(i75 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i75 / iCeil2);
                    }
                    ts0[] ts0VarArr4 = fr1Var.Y0;
                    if (ts0VarArr4 == null || ts0VarArr4.length < iCeil) {
                        obj = null;
                        fr1Var.Y0 = new ts0[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(ts0VarArr4, (Object) null);
                    }
                    ts0[] ts0VarArr5 = fr1Var.X0;
                    if (ts0VarArr5 == null || ts0VarArr5.length < iCeil2) {
                        fr1Var.X0 = new ts0[iCeil2];
                    } else {
                        Arrays.fill(ts0VarArr5, obj);
                    }
                    for (int i82 = 0; i82 < iCeil; i82++) {
                        for (int i83 = 0; i83 < iCeil2; i83++) {
                            int i84 = (i83 * iCeil) + i82;
                            if (i76 == 1) {
                                i84 = (i82 * iCeil2) + i83;
                            }
                            if (i84 < ts0VarArr.length && (ts0Var3 = ts0VarArr[i84]) != null) {
                                int iV4 = fr1Var.V(ts0Var3, i26);
                                ts0 ts0Var13 = fr1Var.Y0[i82];
                                if (ts0Var13 == null || ts0Var13.s() < iV4) {
                                    fr1Var.Y0[i82] = ts0Var3;
                                }
                                int iU4 = fr1Var.U(ts0Var3, i26);
                                ts0 ts0Var14 = fr1Var.X0[i83];
                                if (ts0Var14 == null || ts0Var14.m() < iU4) {
                                    fr1Var.X0[i83] = ts0Var3;
                                }
                            }
                        }
                    }
                    int iV5 = 0;
                    for (int i85 = 0; i85 < iCeil; i85++) {
                        ts0 ts0Var15 = fr1Var.Y0[i85];
                        if (ts0Var15 != null) {
                            if (i85 > 0) {
                                iV5 += fr1Var.P0;
                            }
                            iV5 = fr1Var.V(ts0Var15, i26) + iV5;
                        }
                    }
                    int iU5 = 0;
                    for (int i86 = 0; i86 < iCeil2; i86++) {
                        ts0 ts0Var16 = fr1Var.X0[i86];
                        if (ts0Var16 != null) {
                            if (i86 > 0) {
                                iU5 += fr1Var.Q0;
                            }
                            iU5 = fr1Var.U(ts0Var16, i26) + iU5;
                        }
                    }
                    iArr[0] = iV5;
                    iArr[1] = iU5;
                    if (i76 == 0) {
                        if (iV5 <= i26 || iCeil <= 1) {
                            z7 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iU5 <= i26 || iCeil2 <= 1) {
                        z7 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr4 = fr1Var.Z0;
                iArr4[0] = iCeil;
                iArr4[1] = iCeil2;
                c2 = 1;
                c = 0;
            }
            c = 0;
            c2 = 1;
        } else {
            size2 = size2;
            int i87 = i5;
            i6 = i22;
            i23 = i23;
            iArr = iArr3;
            i7 = i4;
            int i88 = fr1Var.V0;
            if (i87 == 0) {
                c = 0;
                c2 = 1;
            } else {
                if (arrayList3.size() == 0) {
                    dr1Var = new dr1(fr1Var, i88, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, i26);
                    arrayList3.add(dr1Var);
                } else {
                    dr1 dr1Var8 = (dr1) arrayList3.get(0);
                    dr1Var8.r = 0;
                    dr1Var8.y = null;
                    dr1Var8.q = 0;
                    dr1Var8.w = 0;
                    dr1Var8.c = 0;
                    dr1Var8.i = 0;
                    dr1Var8.b = 0;
                    dr1Var8.x(i88, fr1Var.I, fr1Var.J, fr1Var.K, fr1Var.L, fr1Var.w0, fr1Var.s0, fr1Var.x0, fr1Var.t0, i26);
                    dr1Var = dr1Var8;
                }
                for (int i89 = 0; i89 < i87; i89++) {
                    dr1Var.g(ts0VarArr[i89]);
                }
                c = 0;
                iArr[0] = dr1Var.n();
                c2 = 1;
                iArr[1] = dr1Var.r();
            }
        }
        int i90 = iArr[c] + i20 + i7;
        int i91 = iArr[c2] + i6 + i23;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i90, size) : mode == 0 ? i90 : 0;
        }
        if (mode2 == 1073741824) {
            iMin = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(i91, size2);
        } else {
            iMin = mode2 == 0 ? i91 : 0;
        }
        fr1Var.z0 = size;
        fr1Var.A0 = iMin;
        fr1Var.O(size);
        fr1Var.L(iMin);
        fr1Var.y0 = fr1Var.r0 > 0 ? c2 : 0;
        setMeasuredDimension(tm5Var.z0, tm5Var.A0);
    }

    public void setFirstHorizontalBias(float f) {
        this.s.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.s.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.s.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.s.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.s.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.s.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.s.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.s.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.s.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.s.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.s.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.s.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.s.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.s.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        fr1 fr1Var = this.s;
        fr1Var.s0 = i;
        fr1Var.t0 = i;
        fr1Var.u0 = i;
        fr1Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.s.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.s.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.s.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.s.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.s.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.s.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.s.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.s.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.s.T0 = i;
        requestLayout();
    }

    @Override // defpackage.ds0
    public final void t(ts0 ts0Var, boolean z) {
        fr1 fr1Var = this.s;
        int i = fr1Var.u0;
        if (i > 0 || fr1Var.v0 > 0) {
            if (z) {
                fr1Var.w0 = fr1Var.v0;
                fr1Var.x0 = i;
            } else {
                fr1Var.w0 = i;
                fr1Var.x0 = fr1Var.v0;
            }
        }
    }
}
