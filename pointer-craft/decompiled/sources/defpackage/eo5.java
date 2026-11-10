package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class eo5 implements q51 {
    public int g;
    public int n;
    public qb4 r;
    public ts0 y;
    public final y91 v = new y91(this);
    public int x = 0;
    public boolean l = false;
    public final u51 j = new u51(this);
    public final u51 t = new u51(this);
    public int a = 1;

    public eo5(ts0 ts0Var) {
        this.y = ts0Var;
    }

    public static u51 j(as0 as0Var) {
        as0 as0Var2 = as0Var.x;
        if (as0Var2 == null) {
            return null;
        }
        ts0 ts0Var = as0Var2.n;
        int iD = du4.D(as0Var2.v);
        if (iD == 1) {
            return ts0Var.n.j;
        }
        if (iD == 2) {
            return ts0Var.v.j;
        }
        if (iD == 3) {
            return ts0Var.n.t;
        }
        if (iD == 4) {
            return ts0Var.v.t;
        }
        if (iD != 5) {
            return null;
        }
        return ts0Var.v.m;
    }

    public static u51 t(as0 as0Var, int i) {
        as0 as0Var2 = as0Var.x;
        if (as0Var2 == null) {
            return null;
        }
        ts0 ts0Var = as0Var2.n;
        eo5 eo5Var = i == 0 ? ts0Var.n : ts0Var.v;
        int iD = du4.D(as0Var2.v);
        if (iD == 1 || iD == 2) {
            return eo5Var.j;
        }
        if (iD == 3 || iD == 4) {
            return eo5Var.t;
        }
        return null;
    }

    public static void y(u51 u51Var, u51 u51Var2, int i) {
        u51Var.q.add(u51Var2);
        u51Var.x = i;
        u51Var2.m.add(u51Var);
    }

    public long a() {
        y91 y91Var = this.v;
        if (y91Var.a) {
            return y91Var.l;
        }
        return 0L;
    }

    public final int l(int i, int i2) {
        ts0 ts0Var = this.y;
        if (i2 == 0) {
            int i3 = ts0Var.o;
            int iMax = Math.max(ts0Var.h, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = ts0Var.d;
            int iMax2 = Math.max(ts0Var.k, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public boolean m() {
        return false;
    }

    public void n() {
        ts0 ts0Var;
        us0 us0Var;
        int i;
        us0 us0Var2;
        us0 us0Var3;
        int i2;
        ts0 ts0Var2 = this.y;
        boolean z = ts0Var2.g;
        y91 y91Var = this.v;
        if (z) {
            y91Var.n(ts0Var2.s());
        }
        boolean z2 = y91Var.a;
        ArrayList arrayList = y91Var.m;
        ArrayList arrayList2 = y91Var.q;
        u51 u51Var = this.t;
        u51 u51Var2 = this.j;
        if (!z2) {
            ts0 ts0Var3 = this.y;
            int i3 = ts0Var3.p0[0];
            this.n = i3;
            if (i3 != 3) {
                if (i3 == 4 && (us0Var3 = ts0Var3.T) != null && ((i2 = us0Var3.p0[0]) == 1 || i2 == 4)) {
                    int iS = (us0Var3.s() - this.y.I.v()) - this.y.K.v();
                    y(u51Var2, us0Var3.n.j, this.y.I.v());
                    y(u51Var, us0Var3.n.t, -this.y.K.v());
                    y91Var.n(iS);
                    return;
                }
                if (i3 == 1) {
                    y91Var.n(ts0Var3.s());
                }
            }
        } else if (this.n == 4 && (us0Var = (ts0Var = this.y).T) != null && ((i = us0Var.p0[0]) == 1 || i == 4)) {
            y(u51Var2, us0Var.n.j, ts0Var.I.v());
            y(u51Var, us0Var.n.t, -this.y.K.v());
            return;
        }
        if (y91Var.a) {
            ts0 ts0Var4 = this.y;
            if (ts0Var4.g) {
                as0[] as0VarArr = ts0Var4.Q;
                as0 as0Var = as0VarArr[0];
                as0 as0Var2 = as0Var.x;
                if (as0Var2 != null && as0VarArr[1].x != null) {
                    boolean zK = ts0Var4.k();
                    ts0 ts0Var5 = this.y;
                    if (zK) {
                        u51Var2.x = ts0Var5.Q[0].v();
                        u51Var.x = -this.y.Q[1].v();
                        return;
                    }
                    u51 u51VarJ = j(ts0Var5.Q[0]);
                    if (u51VarJ != null) {
                        y(u51Var2, u51VarJ, this.y.Q[0].v());
                    }
                    u51 u51VarJ2 = j(this.y.Q[1]);
                    if (u51VarJ2 != null) {
                        y(u51Var, u51VarJ2, -this.y.Q[1].v());
                    }
                    u51Var2.y = true;
                    u51Var.y = true;
                    return;
                }
                if (as0Var2 != null) {
                    u51 u51VarJ3 = j(as0Var);
                    if (u51VarJ3 != null) {
                        y(u51Var2, u51VarJ3, this.y.Q[0].v());
                        y(u51Var, u51Var2, y91Var.l);
                        return;
                    }
                    return;
                }
                as0 as0Var3 = as0VarArr[1];
                if (as0Var3.x != null) {
                    u51 u51VarJ4 = j(as0Var3);
                    if (u51VarJ4 != null) {
                        y(u51Var, u51VarJ4, -this.y.Q[1].v());
                        y(u51Var2, u51Var, -y91Var.l);
                        return;
                    }
                    return;
                }
                if ((ts0Var4 instanceof n52) || ts0Var4.T == null || ts0Var4.t(7).x != null) {
                    return;
                }
                ts0 ts0Var6 = this.y;
                y(u51Var2, ts0Var6.T.n.j, ts0Var6.p());
                y(u51Var, u51Var2, y91Var.l);
                return;
            }
        }
        if (this.n == 3) {
            ts0 ts0Var7 = this.y;
            int i4 = ts0Var7.p;
            if (i4 == 2) {
                us0 us0Var4 = ts0Var7.T;
                if (us0Var4 != null) {
                    y91 y91Var2 = us0Var4.v.v;
                    arrayList2.add(y91Var2);
                    y91Var2.m.add(y91Var);
                    y91Var.y = true;
                    arrayList.add(u51Var2);
                    arrayList.add(u51Var);
                }
            } else if (i4 == 3) {
                if (ts0Var7.u == 3) {
                    u51Var2.g = this;
                    u51Var.g = this;
                    hk5 hk5Var = ts0Var7.v;
                    hk5Var.j.g = this;
                    hk5Var.t.g = this;
                    y91Var.g = this;
                    if (ts0Var7.d()) {
                        arrayList2.add(this.y.v.v);
                        this.y.v.v.m.add(y91Var);
                        hk5 hk5Var2 = this.y.v;
                        hk5Var2.v.g = this;
                        arrayList2.add(hk5Var2.j);
                        arrayList2.add(this.y.v.t);
                        this.y.v.j.m.add(y91Var);
                        this.y.v.t.m.add(y91Var);
                    } else {
                        boolean zK2 = this.y.k();
                        ts0 ts0Var8 = this.y;
                        if (zK2) {
                            ts0Var8.v.v.q.add(y91Var);
                            arrayList.add(this.y.v.v);
                        } else {
                            ts0Var8.v.v.q.add(y91Var);
                        }
                    }
                } else {
                    y91 y91Var3 = ts0Var7.v.v;
                    arrayList2.add(y91Var3);
                    y91Var3.m.add(y91Var);
                    this.y.v.j.m.add(y91Var);
                    this.y.v.t.m.add(y91Var);
                    y91Var.y = true;
                    arrayList.add(u51Var2);
                    arrayList.add(u51Var);
                    u51Var2.q.add(y91Var);
                    u51Var.q.add(y91Var);
                }
            }
        }
        ts0 ts0Var9 = this.y;
        as0[] as0VarArr2 = ts0Var9.Q;
        as0 as0Var4 = as0VarArr2[0];
        as0 as0Var5 = as0Var4.x;
        if (as0Var5 != null && as0VarArr2[1].x != null) {
            boolean zK3 = ts0Var9.k();
            ts0 ts0Var10 = this.y;
            if (zK3) {
                u51Var2.x = ts0Var10.Q[0].v();
                u51Var.x = -this.y.Q[1].v();
                return;
            }
            u51 u51VarJ5 = j(ts0Var10.Q[0]);
            u51 u51VarJ6 = j(this.y.Q[1]);
            if (u51VarJ5 != null) {
                u51VarJ5.y(this);
            }
            if (u51VarJ6 != null) {
                u51VarJ6.y(this);
            }
            this.a = 4;
            return;
        }
        if (as0Var5 != null) {
            u51 u51VarJ7 = j(as0Var4);
            if (u51VarJ7 != null) {
                y(u51Var2, u51VarJ7, this.y.Q[0].v());
                r(u51Var, u51Var2, 1, y91Var);
                return;
            }
            return;
        }
        as0 as0Var6 = as0VarArr2[1];
        if (as0Var6.x != null) {
            u51 u51VarJ8 = j(as0Var6);
            if (u51VarJ8 != null) {
                y(u51Var, u51VarJ8, -this.y.Q[1].v());
                r(u51Var2, u51Var, -1, y91Var);
                return;
            }
            return;
        }
        if ((ts0Var9 instanceof n52) || (us0Var2 = ts0Var9.T) == null) {
            return;
        }
        y(u51Var2, us0Var2.n.j, ts0Var9.p());
        r(u51Var, u51Var2, 1, y91Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void q(as0 as0Var, as0 as0Var2, int i) {
        y91 y91Var;
        float f;
        int i2;
        int i3;
        u51 u51VarJ = j(as0Var);
        u51 u51VarJ2 = j(as0Var2);
        if (u51VarJ.a && u51VarJ2.a) {
            int iV = as0Var.v() + u51VarJ.l;
            int iV2 = u51VarJ2.l - as0Var2.v();
            int i4 = iV2 - iV;
            y91 y91Var2 = this.v;
            if (!y91Var2.a && this.n == 3) {
                int i5 = this.g;
                if (i5 == 0) {
                    y91Var2.n(l(i4, i));
                } else if (i5 == 1) {
                    y91Var2.n(Math.min(l(y91Var2.w, i), i4));
                } else if (i5 == 2) {
                    ts0 ts0Var = this.y;
                    us0 us0Var = ts0Var.T;
                    if (us0Var != null) {
                        y91 y91Var3 = (i == 0 ? us0Var.n : us0Var.v).v;
                        if (y91Var3.a) {
                            y91Var2.n(l((int) ((y91Var3.l * (i == 0 ? ts0Var.f : ts0Var.e)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    ts0 ts0Var2 = this.y;
                    eo5 eo5Var = ts0Var2.n;
                    if (eo5Var.n == 3 && eo5Var.g == 3) {
                        hk5 hk5Var = ts0Var2.v;
                        if (hk5Var.n != 3 || hk5Var.g != 3) {
                            if (i == 0) {
                                eo5Var = ts0Var2.v;
                            }
                            y91Var = eo5Var.v;
                            if (y91Var.a) {
                                f = ts0Var2.W;
                                i2 = y91Var.l;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                y91Var2.n(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            eo5Var = ts0Var2.v;
                        }
                        y91Var = eo5Var.v;
                        if (y91Var.a) {
                            f = ts0Var2.W;
                            i2 = y91Var.l;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            y91Var2.n(i3);
                        }
                    }
                }
            }
            if (y91Var2.a) {
                int i6 = y91Var2.l;
                u51 u51Var = this.t;
                u51 u51Var2 = this.j;
                if (i6 == i4) {
                    u51Var2.n(iV);
                    u51Var.n(iV2);
                    return;
                }
                ts0 ts0Var3 = this.y;
                float f2 = i == 0 ? ts0Var3.d0 : ts0Var3.e0;
                if (u51VarJ == u51VarJ2) {
                    iV = u51VarJ.l;
                    iV2 = u51VarJ2.l;
                    f2 = 0.5f;
                }
                u51Var2.n((int) ((((iV2 - iV) - i6) * f2) + iV + 0.5f));
                u51Var.n(u51Var2.l + y91Var2.l);
            }
        }
    }

    public final void r(u51 u51Var, u51 u51Var2, int i, y91 y91Var) {
        u51Var.q.add(u51Var2);
        u51Var.q.add(this.v);
        u51Var.j = i;
        u51Var.t = y91Var;
        u51Var2.m.add(u51Var);
        y91Var.m.add(u51Var);
    }

    public void v() {
        ts0 ts0Var = this.y;
        int i = ((m42) ts0Var).u0;
        u51 u51Var = this.j;
        if (i == 1) {
            ts0Var.Y = u51Var.l;
        } else {
            ts0Var.Z = u51Var.l;
        }
    }

    public void x() {
        this.j.r();
    }
}
