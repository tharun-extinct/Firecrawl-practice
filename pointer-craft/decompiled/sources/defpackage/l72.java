package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l72 extends eo5 {
    public static final int[] m = new int[2];

    public l72(ts0 ts0Var) {
        super(ts0Var);
        this.j.v = 4;
        this.t.v = 5;
        this.x = 0;
    }

    public static void w(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final void c() {
        this.l = false;
        u51 u51Var = this.j;
        u51Var.r();
        u51Var.a = false;
        u51 u51Var2 = this.t;
        u51Var2.r();
        u51Var2.a = false;
        this.v.a = false;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        float f;
        int iL;
        int i;
        int iL2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (du4.D(this.a) == 3) {
            ts0 ts0Var = this.y;
            q(ts0Var.I, ts0Var.K, 0);
            return;
        }
        y91 y91Var = this.v;
        boolean z = y91Var.a;
        u51 u51Var = this.j;
        u51 u51Var2 = this.t;
        if (z || this.n != 3) {
            f = 0.5f;
        } else {
            ts0 ts0Var2 = this.y;
            int i3 = ts0Var2.p;
            if (i3 == 2) {
                f = 0.5f;
                us0 us0Var = ts0Var2.T;
                if (us0Var != null) {
                    y91 y91Var2 = us0Var.n.v;
                    if (y91Var2.a) {
                        y91Var.n((int) ((y91Var2.l * ts0Var2.f) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = ts0Var2.u;
                if (i4 == 0 || i4 == 3) {
                    hk5 hk5Var = ts0Var2.v;
                    u51 u51Var3 = hk5Var.j;
                    u51 u51Var4 = hk5Var.t;
                    boolean z2 = ts0Var2.I.x != null;
                    boolean z3 = ts0Var2.J.x != null;
                    boolean z4 = ts0Var2.K.x != null;
                    boolean z5 = ts0Var2.L.x != null;
                    f = 0.5f;
                    int i5 = ts0Var2.X;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = ts0Var2.W;
                        boolean z6 = u51Var3.a;
                        ArrayList arrayList = u51Var3.q;
                        int[] iArr = m;
                        if (z6 && u51Var4.a) {
                            if (u51Var.r && u51Var2.r) {
                                w(iArr, ((u51) u51Var.q.get(0)).l + u51Var.x, ((u51) u51Var2.q.get(0)).l - u51Var2.x, u51Var3.l + u51Var3.x, u51Var4.l - u51Var4.x, f5, i5);
                                y91Var.n(iArr[0]);
                                this.y.v.v.n(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (u51Var.a && u51Var2.a) {
                            if (!u51Var3.r || !u51Var4.r) {
                                return;
                            }
                            w(iArr, u51Var.l + u51Var.x, u51Var2.l - u51Var2.x, ((u51) arrayList.get(0)).l + u51Var3.x, ((u51) u51Var4.q.get(0)).l - u51Var4.x, f5, i5);
                            y91Var.n(iArr[0]);
                            this.y.v.v.n(iArr[1]);
                        }
                        if (!u51Var.r || !u51Var2.r || !u51Var3.r || !u51Var4.r) {
                            return;
                        }
                        w(iArr, ((u51) u51Var.q.get(0)).l + u51Var.x, ((u51) u51Var2.q.get(0)).l - u51Var2.x, ((u51) arrayList.get(0)).l + u51Var3.x, ((u51) u51Var4.q.get(0)).l - u51Var4.x, f5, i5);
                        y91Var.n(iArr[0]);
                        this.y.v.v.n(iArr[1]);
                    } else if (z2 && z4) {
                        if (!u51Var.r || !u51Var2.r) {
                            return;
                        }
                        float f6 = ts0Var2.W;
                        int i6 = ((u51) u51Var.q.get(0)).l + u51Var.x;
                        int i7 = ((u51) u51Var2.q.get(0)).l - u51Var2.x;
                        if (i5 == -1 || i5 == 0) {
                            int iL3 = l(i7 - i6, 0);
                            int i8 = (int) ((iL3 * f6) + 0.5f);
                            int iL4 = l(i8, 1);
                            if (i8 != iL4) {
                                iL3 = (int) ((iL4 / f6) + 0.5f);
                            }
                            y91Var.n(iL3);
                            this.y.v.v.n(iL4);
                        } else if (i5 == 1) {
                            int iL5 = l(i7 - i6, 0);
                            int i9 = (int) ((iL5 / f6) + 0.5f);
                            int iL6 = l(i9, 1);
                            if (i9 != iL6) {
                                iL5 = (int) ((iL6 * f6) + 0.5f);
                            }
                            y91Var.n(iL5);
                            this.y.v.v.n(iL6);
                        }
                    } else if (z3 && z5) {
                        if (!u51Var3.r || !u51Var4.r) {
                            return;
                        }
                        float f7 = ts0Var2.W;
                        int i10 = ((u51) u51Var3.q.get(0)).l + u51Var3.x;
                        int i11 = ((u51) u51Var4.q.get(0)).l - u51Var4.x;
                        if (i5 == -1) {
                            iL = l(i11 - i10, 1);
                            i = (int) ((iL / f7) + 0.5f);
                            iL2 = l(i, 0);
                            if (i != iL2) {
                                iL = (int) ((iL2 * f7) + 0.5f);
                            }
                            y91Var.n(iL2);
                            this.y.v.v.n(iL);
                        } else if (i5 == 0) {
                            int iL7 = l(i11 - i10, 1);
                            int i12 = (int) ((iL7 * f7) + 0.5f);
                            int iL8 = l(i12, 0);
                            if (i12 != iL8) {
                                iL7 = (int) ((iL8 / f7) + 0.5f);
                            }
                            y91Var.n(iL8);
                            this.y.v.v.n(iL7);
                        } else if (i5 == 1) {
                            iL = l(i11 - i10, 1);
                            i = (int) ((iL / f7) + 0.5f);
                            iL2 = l(i, 0);
                            if (i != iL2) {
                                iL = (int) ((iL2 * f7) + 0.5f);
                            }
                            y91Var.n(iL2);
                            this.y.v.v.n(iL);
                        }
                    }
                } else {
                    int i13 = ts0Var2.X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = ts0Var2.v.v.l / ts0Var2.W;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = ts0Var2.v.v.l;
                            f3 = ts0Var2.W;
                        }
                        y91Var.n(i2);
                        f = 0.5f;
                    } else {
                        f2 = ts0Var2.v.v.l;
                        f3 = ts0Var2.W;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    y91Var.n(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = u51Var.r;
        ArrayList arrayList2 = u51Var.q;
        if (z7) {
            boolean z8 = u51Var2.r;
            ArrayList arrayList3 = u51Var2.q;
            if (z8) {
                if (u51Var.a && u51Var2.a && y91Var.a) {
                    return;
                }
                if (!y91Var.a && this.n == 3) {
                    ts0 ts0Var3 = this.y;
                    if (ts0Var3.p == 0 && !ts0Var3.k()) {
                        u51 u51Var5 = (u51) arrayList2.get(0);
                        u51 u51Var6 = (u51) arrayList3.get(0);
                        int i14 = u51Var5.l + u51Var.x;
                        int i15 = u51Var6.l + u51Var2.x;
                        u51Var.n(i14);
                        u51Var2.n(i15);
                        y91Var.n(i15 - i14);
                        return;
                    }
                }
                if (!y91Var.a && this.n == 3 && this.g == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((u51) arrayList3.get(0)).l + u51Var2.x) - (((u51) arrayList2.get(0)).l + u51Var.x), y91Var.w);
                    ts0 ts0Var4 = this.y;
                    int i16 = ts0Var4.o;
                    int iMax = Math.max(ts0Var4.h, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    y91Var.n(iMax);
                }
                if (y91Var.a) {
                    u51 u51Var7 = (u51) arrayList2.get(0);
                    u51 u51Var8 = (u51) arrayList3.get(0);
                    int i17 = u51Var7.l;
                    int i18 = u51Var.x + i17;
                    int i19 = u51Var8.l;
                    int i20 = u51Var2.x + i19;
                    float f8 = this.y.d0;
                    if (u51Var7 == u51Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    u51Var.n((int) ((((i19 - i17) - y91Var.l) * f8) + i17 + f));
                    u51Var2.n(u51Var.l + y91Var.l);
                }
            }
        }
    }

    @Override // defpackage.eo5
    public final boolean m() {
        return this.n != 3 || this.y.p == 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.y.h0;
    }

    @Override // defpackage.eo5
    public final void v() {
        u51 u51Var = this.j;
        if (u51Var.a) {
            this.y.Y = u51Var.l;
        }
    }

    @Override // defpackage.eo5
    public final void x() {
        this.r = null;
        this.j.r();
        this.t.r();
        this.v.r();
        this.l = false;
    }
}
