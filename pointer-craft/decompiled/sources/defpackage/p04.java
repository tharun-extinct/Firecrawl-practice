package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p04 extends np3 {
    public static final Parcelable.Creator<p04> CREATOR = new op3(p04.class);
    public r04[] a;
    public u04 b;
    public int c;
    public int i;
    public int m;
    public int q;
    public boolean s;
    public int t = 0;
    public int w;

    public p04() {
        if (r04.i == null) {
            synchronized (lf2.y) {
                try {
                    if (r04.i == null) {
                        r04.i = new r04[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = r04.i;
        this.m = 0;
        this.q = 0;
        this.w = 0;
        this.c = 0;
        this.i = 0;
        this.b = null;
        this.s = false;
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        int i = this.t;
        if (i != 0) {
            y22Var.H(1, i);
        }
        r04[] r04VarArr = this.a;
        if (r04VarArr != null && r04VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                r04[] r04VarArr2 = this.a;
                if (i2 >= r04VarArr2.length) {
                    break;
                }
                r04 r04Var = r04VarArr2[i2];
                if (r04Var != null) {
                    y22Var.I(2, r04Var);
                }
                i2++;
            }
        }
        int i3 = this.m;
        if (i3 != 0) {
            y22Var.H(3, i3);
        }
        int i4 = this.q;
        if (i4 != 0) {
            y22Var.H(4, i4);
        }
        int i5 = this.w;
        if (i5 != 0) {
            y22Var.H(5, i5);
        }
        int i6 = this.c;
        if (i6 != 0) {
            y22Var.H(6, i6);
        }
        int i7 = this.i;
        if (i7 != 0) {
            y22Var.H(7, i7);
        }
        u04 u04Var = this.b;
        if (u04Var != null) {
            y22Var.I(8, u04Var);
        }
        boolean z = this.s;
        if (z) {
            y22Var.E(9, z);
        }
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 8) {
                this.t = ni0Var.m();
            } else if (iP == 18) {
                int iK = k33.K(ni0Var, 18);
                r04[] r04VarArr = this.a;
                int length = r04VarArr == null ? 0 : r04VarArr.length;
                int i = iK + length;
                r04[] r04VarArr2 = new r04[i];
                if (length != 0) {
                    System.arraycopy(r04VarArr, 0, r04VarArr2, 0, length);
                }
                while (length < i - 1) {
                    np3 r04Var = new r04();
                    r04VarArr2[length] = r04Var;
                    ni0Var.q(r04Var);
                    ni0Var.p();
                    length++;
                }
                np3 r04Var2 = new r04();
                r04VarArr2[length] = r04Var2;
                ni0Var.q(r04Var2);
                this.a = r04VarArr2;
            } else if (iP == 24) {
                int iM = ni0Var.m();
                if (iM == 0 || iM == 1 || iM == 2 || iM == 3) {
                    this.m = iM;
                }
            } else if (iP == 32) {
                int iM2 = ni0Var.m();
                if (iM2 == 0 || iM2 == 1 || iM2 == 2 || iM2 == 3 || iM2 == 4 || iM2 == 5) {
                    this.q = iM2;
                }
            } else if (iP == 40) {
                int iM3 = ni0Var.m();
                if (iM3 == 0 || iM3 == 1 || iM3 == 2 || iM3 == 3 || iM3 == 4) {
                    this.w = iM3;
                }
            } else if (iP == 48) {
                int iM4 = ni0Var.m();
                if (iM4 == 0 || iM4 == 1 || iM4 == 2 || iM4 == 3 || iM4 == 4 || iM4 == 5) {
                    this.c = iM4;
                }
            } else if (iP == 56) {
                int iM5 = ni0Var.m();
                if (iM5 == 0 || iM5 == 1 || iM5 == 2) {
                    this.i = iM5;
                }
            } else if (iP == 66) {
                u04 u04Var = this.b;
                if (u04Var == null) {
                    u04Var = new u04();
                    this.b = u04Var;
                }
                ni0Var.q(u04Var);
            } else if (iP == 72) {
                this.s = ni0Var.l();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int i = this.t;
        int i2 = 0;
        int iJ = i != 0 ? y22.j(1, i) : 0;
        r04[] r04VarArr = this.a;
        if (r04VarArr != null && r04VarArr.length > 0) {
            while (true) {
                r04[] r04VarArr2 = this.a;
                if (i2 >= r04VarArr2.length) {
                    break;
                }
                r04 r04Var = r04VarArr2[i2];
                if (r04Var != null) {
                    iJ = y22.t(2, r04Var) + iJ;
                }
                i2++;
            }
        }
        int i3 = this.m;
        if (i3 != 0) {
            iJ += y22.j(3, i3);
        }
        int i4 = this.q;
        if (i4 != 0) {
            iJ += y22.j(4, i4);
        }
        int i5 = this.w;
        if (i5 != 0) {
            iJ += y22.j(5, i5);
        }
        int i6 = this.c;
        if (i6 != 0) {
            iJ += y22.j(6, i6);
        }
        int i7 = this.i;
        if (i7 != 0) {
            iJ += y22.j(7, i7);
        }
        u04 u04Var = this.b;
        if (u04Var != null) {
            iJ += y22.t(8, u04Var);
        }
        return this.s ? y22.l(9) + iJ : iJ;
    }
}
