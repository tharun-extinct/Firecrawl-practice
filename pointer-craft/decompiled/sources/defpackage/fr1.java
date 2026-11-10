package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fr1 extends tm5 {
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public ts0[] X0;
    public ts0[] Y0;
    public int[] Z0;
    public ts0[] a1;
    public int b1;

    public final int U(ts0 ts0Var, int i) {
        ts0 ts0Var2;
        if (ts0Var != null) {
            int[] iArr = ts0Var.p0;
            if (iArr[1] == 3) {
                int i2 = ts0Var.u;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (ts0Var.e * i);
                        if (i3 != ts0Var.m()) {
                            ts0Var.l = true;
                            T(iArr[0], ts0Var.s(), 1, i3, ts0Var);
                        }
                        return i3;
                    }
                    ts0Var2 = ts0Var;
                    if (i2 == 1) {
                        return ts0Var2.m();
                    }
                    if (i2 == 3) {
                        return (int) ((ts0Var2.s() * ts0Var2.W) + 0.5f);
                    }
                }
            } else {
                ts0Var2 = ts0Var;
            }
            return ts0Var2.m();
        }
        return 0;
    }

    public final int V(ts0 ts0Var, int i) {
        ts0 ts0Var2;
        if (ts0Var != null) {
            int[] iArr = ts0Var.p0;
            if (iArr[0] == 3) {
                int i2 = ts0Var.p;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (ts0Var.f * i);
                        if (i3 != ts0Var.s()) {
                            ts0Var.l = true;
                            T(1, i3, iArr[1], ts0Var.m(), ts0Var);
                        }
                        return i3;
                    }
                    ts0Var2 = ts0Var;
                    if (i2 == 1) {
                        return ts0Var2.s();
                    }
                    if (i2 == 3) {
                        return (int) ((ts0Var2.m() * ts0Var2.W) + 0.5f);
                    }
                }
            } else {
                ts0Var2 = ts0Var;
            }
            return ts0Var2.s();
        }
        return 0;
    }

    @Override // defpackage.ts0
    public final void y(kv2 kv2Var, boolean z) {
        ts0 ts0Var;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.y(kv2Var, z);
        us0 us0Var = this.T;
        boolean z2 = us0Var != null && us0Var.v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((dr1) arrayList.get(i3)).y(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((dr1) arrayList.get(i4)).y(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                ts0 ts0Var2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ts0 ts0Var3 = this.Y0[i];
                    if (ts0Var3 != null) {
                        as0 as0Var = ts0Var3.I;
                        if (ts0Var3.g0 != 8) {
                            if (i8 == 0) {
                                ts0Var3.x(as0Var, this.I, this.w0);
                                ts0Var3.i0 = this.D0;
                                ts0Var3.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                ts0Var3.x(ts0Var3.K, this.K, this.x0);
                            }
                            if (i8 > 0 && ts0Var2 != null) {
                                as0 as0Var2 = ts0Var2.K;
                                ts0Var3.x(as0Var, as0Var2, this.P0);
                                ts0Var2.x(as0Var2, as0Var, 0);
                            }
                            ts0Var2 = ts0Var3;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ts0 ts0Var4 = this.X0[i9];
                    if (ts0Var4 != null) {
                        as0 as0Var3 = ts0Var4.J;
                        if (ts0Var4.g0 != 8) {
                            if (i9 == 0) {
                                ts0Var4.x(as0Var3, this.J, this.s0);
                                ts0Var4.j0 = this.E0;
                                ts0Var4.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                ts0Var4.x(ts0Var4.L, this.L, this.t0);
                            }
                            if (i9 > 0 && ts0Var2 != null) {
                                as0 as0Var4 = ts0Var2.L;
                                ts0Var4.x(as0Var3, as0Var4, this.Q0);
                                ts0Var2.x(as0Var4, as0Var3, 0);
                            }
                            ts0Var2 = ts0Var4;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ts0[] ts0VarArr = this.a1;
                        if (i12 < ts0VarArr.length && (ts0Var = ts0VarArr[i12]) != null && ts0Var.g0 != 8) {
                            ts0 ts0Var5 = this.Y0[i10];
                            ts0 ts0Var6 = this.X0[i11];
                            if (ts0Var != ts0Var5) {
                                ts0Var.x(ts0Var.I, ts0Var5.I, 0);
                                ts0Var.x(ts0Var.K, ts0Var5.K, 0);
                            }
                            if (ts0Var != ts0Var6) {
                                ts0Var.x(ts0Var.J, ts0Var6.J, 0);
                                ts0Var.x(ts0Var.L, ts0Var6.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((dr1) arrayList.get(0)).y(0, z2, true);
        }
        this.y0 = false;
    }
}
