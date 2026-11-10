package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dr1 {
    public int a;
    public int g;
    public int j;
    public as0 l;
    public int m;
    public as0 n;
    public final /* synthetic */ fr1 p;
    public int s;
    public int t;
    public as0 v;
    public as0 x;
    public ts0 y = null;
    public int r = 0;
    public int q = 0;
    public int w = 0;
    public int c = 0;
    public int i = 0;
    public int b = 0;

    public dr1(fr1 fr1Var, int i, as0 as0Var, as0 as0Var2, as0 as0Var3, as0 as0Var4, int i2) {
        this.p = fr1Var;
        this.g = i;
        this.n = as0Var;
        this.v = as0Var2;
        this.x = as0Var3;
        this.l = as0Var4;
        this.j = fr1Var.w0;
        this.t = fr1Var.s0;
        this.a = fr1Var.x0;
        this.m = fr1Var.t0;
        this.s = i2;
    }

    public final void g(ts0 ts0Var) {
        int i = this.g;
        int i2 = this.s;
        fr1 fr1Var = this.p;
        if (i == 0) {
            int iV = fr1Var.V(ts0Var, i2);
            if (ts0Var.p0[0] == 3) {
                this.b++;
                iV = 0;
            }
            this.q = iV + (ts0Var.g0 != 8 ? fr1Var.P0 : 0) + this.q;
            int iU = fr1Var.U(ts0Var, this.s);
            if (this.y == null || this.r < iU) {
                this.y = ts0Var;
                this.r = iU;
                this.w = iU;
            }
        } else {
            int iV2 = fr1Var.V(ts0Var, i2);
            int iU2 = fr1Var.U(ts0Var, this.s);
            if (ts0Var.p0[1] == 3) {
                this.b++;
                iU2 = 0;
            }
            this.w = iU2 + (ts0Var.g0 != 8 ? fr1Var.Q0 : 0) + this.w;
            if (this.y == null || this.r < iV2) {
                this.y = ts0Var;
                this.r = iV2;
                this.q = iV2;
            }
        }
        this.i++;
    }

    public final int n() {
        int i = this.g;
        int i2 = this.q;
        return i == 0 ? i2 - this.p.P0 : i2;
    }

    public final int r() {
        int i = this.g;
        int i2 = this.w;
        return i == 1 ? i2 - this.p.Q0 : i2;
    }

    public final void v(int i) {
        fr1 fr1Var;
        int i2;
        int i3 = this.b;
        if (i3 == 0) {
            return;
        }
        int i4 = this.i;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            fr1Var = this.p;
            if (i6 >= i4 || (i2 = this.c + i6) >= fr1Var.b1) {
                break;
            }
            ts0 ts0Var = fr1Var.a1[i2];
            if (this.g == 0) {
                if (ts0Var != null) {
                    int[] iArr = ts0Var.p0;
                    if (iArr[0] == 3 && ts0Var.p == 0) {
                        fr1Var.T(1, i5, iArr[1], ts0Var.m(), ts0Var);
                    }
                }
            } else if (ts0Var != null) {
                int[] iArr2 = ts0Var.p0;
                if (iArr2[1] == 3 && ts0Var.u == 0) {
                    int i7 = i5;
                    fr1Var.T(iArr2[0], ts0Var.s(), 1, i7, ts0Var);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.q = 0;
        this.w = 0;
        this.y = null;
        this.r = 0;
        int i8 = this.i;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.c + i9;
            if (i10 >= fr1Var.b1) {
                return;
            }
            ts0 ts0Var2 = fr1Var.a1[i10];
            if (this.g == 0) {
                int iS = ts0Var2.s();
                int i11 = fr1Var.P0;
                if (ts0Var2.g0 == 8) {
                    i11 = 0;
                }
                this.q = iS + i11 + this.q;
                int iU = fr1Var.U(ts0Var2, this.s);
                if (this.y == null || this.r < iU) {
                    this.y = ts0Var2;
                    this.r = iU;
                    this.w = iU;
                }
            } else {
                int iV = fr1Var.V(ts0Var2, this.s);
                int iU2 = fr1Var.U(ts0Var2, this.s);
                int i12 = fr1Var.Q0;
                if (ts0Var2.g0 == 8) {
                    i12 = 0;
                }
                this.w = iU2 + i12 + this.w;
                if (this.y == null || this.r < iV) {
                    this.y = ts0Var2;
                    this.r = iV;
                    this.q = iV;
                }
            }
        }
    }

    public final void x(int i, as0 as0Var, as0 as0Var2, as0 as0Var3, as0 as0Var4, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.n = as0Var;
        this.v = as0Var2;
        this.x = as0Var3;
        this.l = as0Var4;
        this.j = i2;
        this.t = i3;
        this.a = i4;
        this.m = i5;
        this.s = i6;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void y(int i, boolean z, boolean z2) {
        fr1 fr1Var;
        int i2;
        int i3;
        ts0 ts0Var;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.i;
        int i7 = 0;
        while (true) {
            fr1Var = this.p;
            if (i7 >= i6 || (i5 = this.c + i7) >= fr1Var.b1) {
                break;
            }
            ts0 ts0Var2 = fr1Var.a1[i5];
            if (ts0Var2 != null) {
                ts0Var2.D();
            }
            i7++;
        }
        if (i6 == 0 || this.y == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.c + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= fr1Var.b1) {
                break;
            }
            ts0 ts0Var3 = fr1Var.a1[i11];
            if (ts0Var3 != null && ts0Var3.g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.g;
        ts0 ts0Var4 = this.y;
        if (i12 == 0) {
            ts0Var4.j0 = fr1Var.E0;
            as0 as0Var = ts0Var4.L;
            as0 as0Var2 = ts0Var4.J;
            int i13 = this.t;
            if (i > 0) {
                i13 += fr1Var.Q0;
            }
            as0Var2.g(this.v, i13);
            if (z2) {
                as0Var.g(this.l, this.m);
            }
            if (i > 0) {
                this.v.n.L.g(as0Var2, 0);
            }
            if (fr1Var.S0 != 3 || ts0Var4.E) {
                ts0Var = ts0Var4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.c + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < fr1Var.b1) {
                        ts0Var = fr1Var.a1[i15];
                        if (ts0Var.E) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                ts0Var = ts0Var4;
                break;
            }
            int i16 = 0;
            ts0 ts0Var5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.c + i17;
                if (i18 >= fr1Var.b1) {
                    return;
                }
                ts0 ts0Var6 = fr1Var.a1[i18];
                if (ts0Var6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    as0 as0Var3 = ts0Var6.J;
                    as0 as0Var4 = ts0Var6.L;
                    as0 as0Var5 = ts0Var6.I;
                    z3 = z4;
                    if (i16 == 0) {
                        ts0Var6.x(as0Var5, this.n, this.j);
                    }
                    if (i17 == 0) {
                        int i19 = fr1Var.D0;
                        float f2 = fr1Var.J0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.c == 0 && (i4 = fr1Var.F0) != -1) {
                            f = fr1Var.L0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = fr1Var.H0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = fr1Var.N0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        ts0Var6.i0 = i4;
                        ts0Var6.d0 = f;
                    }
                    if (i16 == i6 - 1) {
                        ts0Var6.x(ts0Var6.K, this.x, this.a);
                    }
                    if (ts0Var5 != null) {
                        as0 as0Var6 = ts0Var5.K;
                        as0Var5.g(as0Var6, fr1Var.P0);
                        if (i16 == i8) {
                            int i20 = this.j;
                            if (as0Var5.j()) {
                                as0Var5.j = i20;
                            }
                        }
                        as0Var6.g(as0Var5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.a;
                            if (as0Var6.j()) {
                                as0Var6.j = i21;
                            }
                        }
                    }
                    if (ts0Var6 != ts0Var4) {
                        int i22 = fr1Var.S0;
                        c = 3;
                        if (i22 == 3 && ts0Var.E && ts0Var6 != ts0Var && ts0Var6.E) {
                            ts0Var6.M.g(ts0Var.M, 0);
                        } else if (i22 == 0) {
                            as0Var3.g(as0Var2, 0);
                        } else if (i22 == 1) {
                            as0Var4.g(as0Var, 0);
                        } else if (z3) {
                            as0Var3.g(this.v, this.t);
                            as0Var4.g(this.l, this.m);
                        } else {
                            as0Var3.g(as0Var2, 0);
                            as0Var4.g(as0Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    ts0Var5 = ts0Var6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        ts0Var4.i0 = fr1Var.D0;
        as0 as0Var7 = ts0Var4.I;
        as0 as0Var8 = ts0Var4.K;
        int i25 = this.j;
        if (i > 0) {
            i25 += fr1Var.P0;
        }
        if (z) {
            as0Var8.g(this.x, i25);
            if (z2) {
                as0Var7.g(this.n, this.a);
            }
            if (i > 0) {
                this.x.n.I.g(as0Var8, 0);
            }
        } else {
            as0Var7.g(this.n, i25);
            if (z2) {
                as0Var8.g(this.x, this.a);
            }
            if (i > 0) {
                this.n.n.K.g(as0Var7, 0);
            }
        }
        int i26 = 0;
        ts0 ts0Var7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.c + i26) >= fr1Var.b1) {
                return;
            }
            ts0 ts0Var8 = fr1Var.a1[i2];
            if (ts0Var8 == null) {
                i23 = i27;
            } else {
                as0 as0Var9 = ts0Var8.I;
                as0 as0Var10 = ts0Var8.J;
                as0 as0Var11 = ts0Var8.K;
                if (i26 == 0) {
                    ts0Var8.x(as0Var10, this.v, this.t);
                    int i28 = fr1Var.E0;
                    float f3 = fr1Var.K0;
                    if (this.c == 0) {
                        int i29 = fr1Var.G0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = fr1Var.M0;
                        }
                        i28 = i29;
                        ts0Var8.j0 = i28;
                        ts0Var8.e0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = fr1Var.I0) != i3) {
                        f3 = fr1Var.O0;
                        i28 = i29;
                    }
                    ts0Var8.j0 = i28;
                    ts0Var8.e0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    ts0Var8.x(ts0Var8.L, this.l, this.m);
                }
                if (ts0Var7 != null) {
                    as0 as0Var12 = ts0Var7.L;
                    as0Var10.g(as0Var12, fr1Var.Q0);
                    if (i26 == i8) {
                        int i30 = this.t;
                        if (as0Var10.j()) {
                            as0Var10.j = i30;
                        }
                    }
                    as0Var12.g(as0Var10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.m;
                        if (as0Var12.j()) {
                            as0Var12.j = i31;
                        }
                    }
                }
                if (ts0Var8 != ts0Var4) {
                    int i32 = fr1Var.R0;
                    if (z) {
                        if (i32 == 0) {
                            as0Var11.g(as0Var8, 0);
                        } else if (i32 == 1) {
                            as0Var9.g(as0Var7, 0);
                        } else if (i32 == 2) {
                            as0Var9.g(as0Var7, 0);
                            as0Var11.g(as0Var8, 0);
                        }
                    } else if (i32 == 0) {
                        as0Var9.g(as0Var7, 0);
                    } else if (i32 == 1) {
                        as0Var11.g(as0Var8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            as0Var9.g(this.n, this.j);
                            as0Var11.g(this.x, this.a);
                        } else {
                            as0Var9.g(as0Var7, 0);
                            as0Var11.g(as0Var8, 0);
                        }
                    }
                }
                ts0Var7 = ts0Var8;
            }
            i26++;
        }
    }
}
