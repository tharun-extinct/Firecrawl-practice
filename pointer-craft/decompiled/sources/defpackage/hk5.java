package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hk5 extends eo5 {
    public final u51 m;
    public qy q;

    public hk5(ts0 ts0Var) {
        super(ts0Var);
        u51 u51Var = new u51(this);
        this.m = u51Var;
        this.q = null;
        this.j.v = 6;
        this.t.v = 7;
        u51Var.v = 8;
        this.x = 1;
    }

    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (du4.D(this.a) == 3) {
            ts0 ts0Var = this.y;
            q(ts0Var.J, ts0Var.L, 1);
            return;
        }
        y91 y91Var = this.v;
        if (y91Var.r && !y91Var.a && this.n == 3) {
            ts0 ts0Var2 = this.y;
            int i2 = ts0Var2.u;
            if (i2 == 2) {
                us0 us0Var = ts0Var2.T;
                if (us0Var != null) {
                    y91 y91Var2 = us0Var.v.v;
                    if (y91Var2.a) {
                        y91Var.n((int) ((y91Var2.l * ts0Var2.e) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                y91 y91Var3 = ts0Var2.n.v;
                if (y91Var3.a) {
                    int i3 = ts0Var2.X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = y91Var3.l * ts0Var2.W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = y91Var3.l;
                            f2 = ts0Var2.W;
                        }
                        y91Var.n(i);
                    } else {
                        f = y91Var3.l;
                        f2 = ts0Var2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    y91Var.n(i);
                }
            }
        }
        u51 u51Var = this.j;
        boolean z = u51Var.r;
        ArrayList arrayList = u51Var.q;
        if (z) {
            u51 u51Var2 = this.t;
            boolean z2 = u51Var2.r;
            ArrayList arrayList2 = u51Var2.q;
            if (z2) {
                if (u51Var.a && u51Var2.a && y91Var.a) {
                    return;
                }
                if (!y91Var.a && this.n == 3) {
                    ts0 ts0Var3 = this.y;
                    if (ts0Var3.p == 0 && !ts0Var3.d()) {
                        u51 u51Var3 = (u51) arrayList.get(0);
                        u51 u51Var4 = (u51) arrayList2.get(0);
                        int i4 = u51Var3.l + u51Var.x;
                        int i5 = u51Var4.l + u51Var2.x;
                        u51Var.n(i4);
                        u51Var2.n(i5);
                        y91Var.n(i5 - i4);
                        return;
                    }
                }
                if (!y91Var.a && this.n == 3 && this.g == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    u51 u51Var5 = (u51) arrayList.get(0);
                    int i6 = (((u51) arrayList2.get(0)).l + u51Var2.x) - (u51Var5.l + u51Var.x);
                    int i7 = y91Var.w;
                    if (i6 < i7) {
                        y91Var.n(i6);
                    } else {
                        y91Var.n(i7);
                    }
                }
                if (y91Var.a && arrayList.size() > 0 && arrayList2.size() > 0) {
                    u51 u51Var6 = (u51) arrayList.get(0);
                    u51 u51Var7 = (u51) arrayList2.get(0);
                    int i8 = u51Var6.l;
                    int i9 = u51Var.x + i8;
                    int i10 = u51Var7.l;
                    int i11 = u51Var2.x + i10;
                    float f4 = this.y.e0;
                    if (u51Var6 == u51Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    u51Var.n((int) ((((i10 - i8) - y91Var.l) * f4) + i8 + 0.5f));
                    u51Var2.n(u51Var.l + y91Var.l);
                }
            }
        }
    }

    @Override // defpackage.eo5
    public final boolean m() {
        return this.n != 3 || this.y.u == 0;
    }

    @Override // defpackage.eo5
    public final void n() {
        ts0 ts0Var;
        us0 us0Var;
        us0 us0Var2;
        us0 us0Var3;
        ts0 ts0Var2 = this.y;
        boolean z = ts0Var2.g;
        y91 y91Var = this.v;
        if (z) {
            y91Var.n(ts0Var2.m());
        }
        boolean z2 = y91Var.a;
        ArrayList arrayList = y91Var.m;
        ArrayList arrayList2 = y91Var.q;
        u51 u51Var = this.t;
        u51 u51Var2 = this.j;
        if (!z2) {
            ts0 ts0Var3 = this.y;
            this.n = ts0Var3.p0[1];
            if (ts0Var3.E) {
                this.q = new qy(this);
            }
            int i = this.n;
            if (i != 3) {
                if (i == 4 && (us0Var3 = this.y.T) != null && us0Var3.p0[1] == 1) {
                    int iM = (us0Var3.m() - this.y.J.v()) - this.y.L.v();
                    eo5.y(u51Var2, us0Var3.v.j, this.y.J.v());
                    eo5.y(u51Var, us0Var3.v.t, -this.y.L.v());
                    y91Var.n(iM);
                    return;
                }
                if (i == 1) {
                    y91Var.n(this.y.m());
                }
            }
        } else if (this.n == 4 && (us0Var = (ts0Var = this.y).T) != null && us0Var.p0[1] == 1) {
            eo5.y(u51Var2, us0Var.v.j, ts0Var.J.v());
            eo5.y(u51Var, us0Var.v.t, -this.y.L.v());
            return;
        }
        boolean z3 = y91Var.a;
        u51 u51Var3 = this.m;
        if (z3) {
            ts0 ts0Var4 = this.y;
            if (ts0Var4.g) {
                as0[] as0VarArr = ts0Var4.Q;
                as0 as0Var = as0VarArr[2];
                as0 as0Var2 = as0Var.x;
                if (as0Var2 != null && as0VarArr[3].x != null) {
                    boolean zD = ts0Var4.d();
                    ts0 ts0Var5 = this.y;
                    if (zD) {
                        u51Var2.x = ts0Var5.Q[2].v();
                        u51Var.x = -this.y.Q[3].v();
                    } else {
                        u51 u51VarJ = eo5.j(ts0Var5.Q[2]);
                        if (u51VarJ != null) {
                            eo5.y(u51Var2, u51VarJ, this.y.Q[2].v());
                        }
                        u51 u51VarJ2 = eo5.j(this.y.Q[3]);
                        if (u51VarJ2 != null) {
                            eo5.y(u51Var, u51VarJ2, -this.y.Q[3].v());
                        }
                        u51Var2.y = true;
                        u51Var.y = true;
                    }
                    ts0 ts0Var6 = this.y;
                    if (ts0Var6.E) {
                        eo5.y(u51Var3, u51Var2, ts0Var6.a0);
                        return;
                    }
                    return;
                }
                if (as0Var2 != null) {
                    u51 u51VarJ3 = eo5.j(as0Var);
                    if (u51VarJ3 != null) {
                        eo5.y(u51Var2, u51VarJ3, this.y.Q[2].v());
                        eo5.y(u51Var, u51Var2, y91Var.l);
                        ts0 ts0Var7 = this.y;
                        if (ts0Var7.E) {
                            eo5.y(u51Var3, u51Var2, ts0Var7.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                as0 as0Var3 = as0VarArr[3];
                if (as0Var3.x != null) {
                    u51 u51VarJ4 = eo5.j(as0Var3);
                    if (u51VarJ4 != null) {
                        eo5.y(u51Var, u51VarJ4, -this.y.Q[3].v());
                        eo5.y(u51Var2, u51Var, -y91Var.l);
                    }
                    ts0 ts0Var8 = this.y;
                    if (ts0Var8.E) {
                        eo5.y(u51Var3, u51Var2, ts0Var8.a0);
                        return;
                    }
                    return;
                }
                as0 as0Var4 = as0VarArr[4];
                if (as0Var4.x != null) {
                    u51 u51VarJ5 = eo5.j(as0Var4);
                    if (u51VarJ5 != null) {
                        eo5.y(u51Var3, u51VarJ5, 0);
                        eo5.y(u51Var2, u51Var3, -this.y.a0);
                        eo5.y(u51Var, u51Var2, y91Var.l);
                        return;
                    }
                    return;
                }
                if ((ts0Var4 instanceof n52) || ts0Var4.T == null || ts0Var4.t(7).x != null) {
                    return;
                }
                ts0 ts0Var9 = this.y;
                eo5.y(u51Var2, ts0Var9.T.v.j, ts0Var9.u());
                eo5.y(u51Var, u51Var2, y91Var.l);
                ts0 ts0Var10 = this.y;
                if (ts0Var10.E) {
                    eo5.y(u51Var3, u51Var2, ts0Var10.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.n != 3) {
            y91Var.y(this);
        } else {
            ts0 ts0Var11 = this.y;
            int i2 = ts0Var11.u;
            if (i2 == 2) {
                us0 us0Var4 = ts0Var11.T;
                if (us0Var4 != null) {
                    y91 y91Var2 = us0Var4.v.v;
                    arrayList2.add(y91Var2);
                    y91Var2.m.add(y91Var);
                    y91Var.y = true;
                    arrayList.add(u51Var2);
                    arrayList.add(u51Var);
                }
            } else if (i2 == 3 && !ts0Var11.d()) {
                ts0 ts0Var12 = this.y;
                if (ts0Var12.p != 3) {
                    y91 y91Var3 = ts0Var12.n.v;
                    arrayList2.add(y91Var3);
                    y91Var3.m.add(y91Var);
                    y91Var.y = true;
                    arrayList.add(u51Var2);
                    arrayList.add(u51Var);
                }
            }
        }
        ts0 ts0Var13 = this.y;
        as0[] as0VarArr2 = ts0Var13.Q;
        as0 as0Var5 = as0VarArr2[2];
        as0 as0Var6 = as0Var5.x;
        if (as0Var6 != null && as0VarArr2[3].x != null) {
            boolean zD2 = ts0Var13.d();
            ts0 ts0Var14 = this.y;
            if (zD2) {
                u51Var2.x = ts0Var14.Q[2].v();
                u51Var.x = -this.y.Q[3].v();
            } else {
                u51 u51VarJ6 = eo5.j(ts0Var14.Q[2]);
                u51 u51VarJ7 = eo5.j(this.y.Q[3]);
                if (u51VarJ6 != null) {
                    u51VarJ6.y(this);
                }
                if (u51VarJ7 != null) {
                    u51VarJ7.y(this);
                }
                this.a = 4;
            }
            if (this.y.E) {
                r(u51Var3, u51Var2, 1, this.q);
            }
        } else if (as0Var6 != null) {
            u51 u51VarJ8 = eo5.j(as0Var5);
            if (u51VarJ8 != null) {
                eo5.y(u51Var2, u51VarJ8, this.y.Q[2].v());
                r(u51Var, u51Var2, 1, y91Var);
                if (this.y.E) {
                    r(u51Var3, u51Var2, 1, this.q);
                }
                if (this.n == 3) {
                    ts0 ts0Var15 = this.y;
                    if (ts0Var15.W > 0.0f) {
                        l72 l72Var = ts0Var15.n;
                        if (l72Var.n == 3) {
                            l72Var.v.m.add(y91Var);
                            arrayList2.add(this.y.n.v);
                            y91Var.g = this;
                        }
                    }
                }
            }
        } else {
            as0 as0Var7 = as0VarArr2[3];
            if (as0Var7.x != null) {
                u51 u51VarJ9 = eo5.j(as0Var7);
                if (u51VarJ9 != null) {
                    eo5.y(u51Var, u51VarJ9, -this.y.Q[3].v());
                    r(u51Var2, u51Var, -1, y91Var);
                    if (this.y.E) {
                        r(u51Var3, u51Var2, 1, this.q);
                    }
                }
            } else {
                as0 as0Var8 = as0VarArr2[4];
                if (as0Var8.x != null) {
                    u51 u51VarJ10 = eo5.j(as0Var8);
                    if (u51VarJ10 != null) {
                        eo5.y(u51Var3, u51VarJ10, 0);
                        r(u51Var2, u51Var3, -1, this.q);
                        r(u51Var, u51Var2, 1, y91Var);
                    }
                } else if (!(ts0Var13 instanceof n52) && (us0Var2 = ts0Var13.T) != null) {
                    eo5.y(u51Var2, us0Var2.v.j, ts0Var13.u());
                    r(u51Var, u51Var2, 1, y91Var);
                    if (this.y.E) {
                        r(u51Var3, u51Var2, 1, this.q);
                    }
                    if (this.n == 3) {
                        ts0 ts0Var16 = this.y;
                        if (ts0Var16.W > 0.0f) {
                            l72 l72Var2 = ts0Var16.n;
                            if (l72Var2.n == 3) {
                                l72Var2.v.m.add(y91Var);
                                arrayList2.add(this.y.n.v);
                                y91Var.g = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            y91Var.r = true;
        }
    }

    public final String toString() {
        return "VerticalRun " + this.y.h0;
    }

    @Override // defpackage.eo5
    public final void v() {
        u51 u51Var = this.j;
        if (u51Var.a) {
            this.y.Z = u51Var.l;
        }
    }

    public final void w() {
        this.l = false;
        u51 u51Var = this.j;
        u51Var.r();
        u51Var.a = false;
        u51 u51Var2 = this.t;
        u51Var2.r();
        u51Var2.a = false;
        u51 u51Var3 = this.m;
        u51Var3.r();
        u51Var3.a = false;
        this.v.a = false;
    }

    @Override // defpackage.eo5
    public final void x() {
        this.r = null;
        this.j.r();
        this.t.r();
        this.m.r();
        this.v.r();
        this.l = false;
    }
}
