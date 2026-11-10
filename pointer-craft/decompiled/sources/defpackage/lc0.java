package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lc0 extends eo5 {
    public final ArrayList m;
    public int q;

    public lc0(ts0 ts0Var, int i) {
        ts0 ts0Var2;
        super(ts0Var);
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        this.x = i;
        ts0 ts0Var3 = this.y;
        ts0 ts0VarW = ts0Var3.w(i);
        while (true) {
            ts0Var2 = ts0Var3;
            ts0Var3 = ts0VarW;
            if (ts0Var3 == null) {
                break;
            } else {
                ts0VarW = ts0Var3.w(this.x);
            }
        }
        this.y = ts0Var2;
        int i2 = this.x;
        arrayList.add(i2 == 0 ? ts0Var2.n : i2 == 1 ? ts0Var2.v : null);
        ts0 ts0VarQ = ts0Var2.q(this.x);
        while (ts0VarQ != null) {
            int i3 = this.x;
            arrayList.add(i3 == 0 ? ts0VarQ.n : i3 == 1 ? ts0VarQ.v : null);
            ts0VarQ = ts0VarQ.q(this.x);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            eo5 eo5Var = (eo5) obj;
            int i5 = this.x;
            if (i5 == 0) {
                eo5Var.y.y = this;
            } else if (i5 == 1) {
                eo5Var.y.r = this;
            }
        }
        if (this.x == 0 && this.y.T.v0 && arrayList.size() > 1) {
            this.y = ((eo5) arrayList.get(arrayList.size() - 1)).y;
        }
        int i6 = this.x;
        ts0 ts0Var4 = this.y;
        this.q = i6 == 0 ? ts0Var4.i0 : ts0Var4.j0;
    }

    @Override // defpackage.eo5
    public final long a() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            eo5 eo5Var = (eo5) arrayList.get(i);
            jA = ((long) eo5Var.t.x) + eo5Var.a() + jA + ((long) eo5Var.j.x);
        }
        return jA;
    }

    public final ts0 c() {
        ArrayList arrayList = this.m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ts0 ts0Var = ((eo5) arrayList.get(size)).y;
            if (ts0Var.g0 != 8) {
                return ts0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[ADDED_TO_REGION] */
    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        u51 u51Var = this.j;
        if (u51Var.a) {
            u51 u51Var2 = this.t;
            if (u51Var2.a) {
                us0 us0Var = this.y.T;
                boolean z2 = us0Var != null ? us0Var.v0 : false;
                int i13 = u51Var2.l - u51Var.l;
                ArrayList arrayList = this.m;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((eo5) arrayList.get(i14)).y.g0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((eo5) arrayList.get(i16)).y.g0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        eo5 eo5Var = (eo5) arrayList.get(i18);
                        ts0 ts0Var = eo5Var.y;
                        boolean z3 = z2;
                        if (ts0Var.g0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += eo5Var.j.x;
                            }
                            y91 y91Var = eo5Var.v;
                            int i21 = y91Var.l;
                            i11 = i17;
                            boolean z4 = eo5Var.n != 3;
                            if (z4) {
                                int i22 = this.x;
                                if (i22 == 0 && !ts0Var.n.v.a) {
                                    return;
                                }
                                if (i22 == 1 && !ts0Var.v.v.a) {
                                    return;
                                }
                            } else {
                                if (eo5Var.g == 1 && i11 == 0) {
                                    i12 = y91Var.w;
                                    i19++;
                                } else {
                                    if (y91Var.a) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = ts0Var.k0[this.x];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -eo5Var.t.x;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = ts0Var.k0[this.x];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = ts0Var.k0[this.x];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = u51Var.l;
                if (z) {
                    i24 = u51Var2.l;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        eo5 eo5Var2 = (eo5) arrayList.get(i26);
                        int i28 = i24;
                        ts0 ts0Var2 = eo5Var2.y;
                        int i29 = i3;
                        y91 y91Var2 = eo5Var2.v;
                        float f7 = f5;
                        int i30 = i25;
                        if (ts0Var2.g0 != 8 && eo5Var2.n == 3 && !y91Var2.a) {
                            int i31 = f > 0.0f ? (int) (((ts0Var2.k0[this.x] * f7) / f) + f6) : i30;
                            if (this.x == 0) {
                                i9 = ts0Var2.o;
                                i10 = ts0Var2.h;
                            } else {
                                i9 = ts0Var2.d;
                                i10 = ts0Var2.k;
                            }
                            int iMax = Math.max(i10, eo5Var2.g == 1 ? Math.min(i31, y91Var2.w) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            y91Var2.n(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            eo5 eo5Var3 = (eo5) arrayList.get(i33);
                            if (eo5Var3.y.g0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += eo5Var3.j.x;
                                }
                                i5 += eo5Var3.v.l;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -eo5Var3.t.x;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.q == 2 && i27 == 0) {
                        i7 = 0;
                        this.q = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.q = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.q = i8;
                }
                int i34 = this.q;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        eo5 eo5Var4 = (eo5) arrayList.get(z ? size - (i37 + 1) : i37);
                        ts0 ts0Var3 = eo5Var4.y;
                        u51 u51Var3 = eo5Var4.t;
                        u51 u51Var4 = eo5Var4.j;
                        if (ts0Var3.g0 == 8) {
                            u51Var4.n(i36);
                            u51Var3.n(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - u51Var4.x : i36 + u51Var4.x;
                            }
                            if (z) {
                                u51Var3.n(i36);
                            } else {
                                u51Var4.n(i36);
                            }
                            y91 y91Var3 = eo5Var4.v;
                            int i38 = y91Var3.l;
                            if (eo5Var4.n == 3 && eo5Var4.g == 1) {
                                i38 = y91Var3.w;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                u51Var4.n(i36);
                            } else {
                                u51Var3.n(i36);
                            }
                            eo5Var4.l = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-u51Var3.x) : i36 + (-u51Var3.x);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        eo5 eo5Var5 = (eo5) arrayList.get(z ? size - (i41 + 1) : i41);
                        ts0 ts0Var4 = eo5Var5.y;
                        u51 u51Var5 = eo5Var5.t;
                        u51 u51Var6 = eo5Var5.j;
                        if (ts0Var4.g0 == 8) {
                            u51Var6.n(i40);
                            u51Var5.n(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - u51Var6.x : i42 + u51Var6.x;
                            }
                            if (z) {
                                u51Var5.n(i42);
                            } else {
                                u51Var6.n(i42);
                            }
                            y91 y91Var4 = eo5Var5.v;
                            int iMin = y91Var4.l;
                            if (eo5Var5.n == 3 && eo5Var5.g == 1) {
                                iMin = Math.min(iMin, y91Var4.w);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                u51Var6.n(i40);
                            } else {
                                u51Var5.n(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-u51Var5.x) : i40 + (-u51Var5.x);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.x;
                    ts0 ts0Var5 = this.y;
                    float f8 = i43 == 0 ? ts0Var5.d0 : ts0Var5.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        eo5 eo5Var6 = (eo5) arrayList.get(z ? size - (i46 + 1) : i46);
                        ts0 ts0Var6 = eo5Var6.y;
                        u51 u51Var7 = eo5Var6.t;
                        u51 u51Var8 = eo5Var6.j;
                        if (ts0Var6.g0 == 8) {
                            u51Var8.n(i45);
                            u51Var7.n(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - u51Var8.x : i45 + u51Var8.x;
                            }
                            if (z) {
                                u51Var7.n(i45);
                            } else {
                                u51Var8.n(i45);
                            }
                            y91 y91Var5 = eo5Var6.v;
                            int i47 = y91Var5.l;
                            if (eo5Var6.n == 3 && eo5Var6.g == 1) {
                                i47 = y91Var5.w;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                u51Var8.n(i45);
                            } else {
                                u51Var7.n(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-u51Var7.x) : i45 + (-u51Var7.x);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.eo5
    public final boolean m() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((eo5) arrayList.get(i)).m()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eo5
    public final void n() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((eo5) obj).n();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ts0 ts0Var = ((eo5) arrayList.get(0)).y;
        ts0 ts0Var2 = ((eo5) arrayList.get(size2 - 1)).y;
        int i2 = this.x;
        u51 u51Var = this.t;
        u51 u51Var2 = this.j;
        if (i2 == 0) {
            as0 as0Var = ts0Var.I;
            as0 as0Var2 = ts0Var2.K;
            u51 u51VarT = eo5.t(as0Var, 0);
            int iV = as0Var.v();
            ts0 ts0VarW = w();
            if (ts0VarW != null) {
                iV = ts0VarW.I.v();
            }
            if (u51VarT != null) {
                eo5.y(u51Var2, u51VarT, iV);
            }
            u51 u51VarT2 = eo5.t(as0Var2, 0);
            int iV2 = as0Var2.v();
            ts0 ts0VarC = c();
            if (ts0VarC != null) {
                iV2 = ts0VarC.K.v();
            }
            if (u51VarT2 != null) {
                eo5.y(u51Var, u51VarT2, -iV2);
            }
        } else {
            as0 as0Var3 = ts0Var.J;
            as0 as0Var4 = ts0Var2.L;
            u51 u51VarT3 = eo5.t(as0Var3, 1);
            int iV3 = as0Var3.v();
            ts0 ts0VarW2 = w();
            if (ts0VarW2 != null) {
                iV3 = ts0VarW2.J.v();
            }
            if (u51VarT3 != null) {
                eo5.y(u51Var2, u51VarT3, iV3);
            }
            u51 u51VarT4 = eo5.t(as0Var4, 1);
            int iV4 = as0Var4.v();
            ts0 ts0VarC2 = c();
            if (ts0VarC2 != null) {
                iV4 = ts0VarC2.L.v();
            }
            if (u51VarT4 != null) {
                eo5.y(u51Var, u51VarT4, -iV4);
            }
        }
        u51Var2.g = this;
        u51Var.g = this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.x == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((eo5) obj);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // defpackage.eo5
    public final void v() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            ((eo5) arrayList.get(i)).v();
            i++;
        }
    }

    public final ts0 w() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return null;
            }
            ts0 ts0Var = ((eo5) arrayList.get(i)).y;
            if (ts0Var.g0 != 8) {
                return ts0Var;
            }
            i++;
        }
    }

    @Override // defpackage.eo5
    public final void x() {
        this.r = null;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((eo5) obj).x();
        }
    }
}
