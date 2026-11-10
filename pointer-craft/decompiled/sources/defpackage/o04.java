package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o04 extends np3 {
    public static final Parcelable.Creator<o04> CREATOR = new op3(o04.class);
    public int a;
    public int c;
    public String m;
    public int q;
    public n04[] t;
    public int w;

    public o04() {
        if (n04.w == null) {
            synchronized (lf2.y) {
                try {
                    if (n04.w == null) {
                        n04.w = new n04[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.t = n04.w;
        this.a = 0;
        this.m = "";
        this.q = 0;
        this.w = 0;
        this.c = 0;
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        n04[] n04VarArr = this.t;
        if (n04VarArr != null && n04VarArr.length > 0) {
            int i = 0;
            while (true) {
                n04[] n04VarArr2 = this.t;
                if (i >= n04VarArr2.length) {
                    break;
                }
                n04 n04Var = n04VarArr2[i];
                if (n04Var != null) {
                    y22Var.I(1, n04Var);
                }
                i++;
            }
        }
        int i2 = this.a;
        if (i2 != 0) {
            y22Var.H(2, i2);
        }
        if (!this.m.equals("")) {
            y22Var.M(this.m, 3);
        }
        int i3 = this.q;
        if (i3 != 0) {
            y22Var.H(4, i3);
        }
        int i4 = this.w;
        if (i4 != 0) {
            y22Var.H(5, i4);
        }
        int i5 = this.c;
        if (i5 != 0) {
            y22Var.H(6, i5);
        }
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 10) {
                int iK = k33.K(ni0Var, 10);
                n04[] n04VarArr = this.t;
                int length = n04VarArr == null ? 0 : n04VarArr.length;
                int i = iK + length;
                n04[] n04VarArr2 = new n04[i];
                if (length != 0) {
                    System.arraycopy(n04VarArr, 0, n04VarArr2, 0, length);
                }
                while (length < i - 1) {
                    n04 n04Var = new n04();
                    n04VarArr2[length] = n04Var;
                    ni0Var.q(n04Var);
                    ni0Var.p();
                    length++;
                }
                n04 n04Var2 = new n04();
                n04VarArr2[length] = n04Var2;
                ni0Var.q(n04Var2);
                this.t = n04VarArr2;
            } else if (iP == 16) {
                int iM = ni0Var.m();
                if (iM == 0 || iM == 1) {
                    this.a = iM;
                }
            } else if (iP == 26) {
                this.m = ni0Var.s();
            } else if (iP == 32) {
                this.q = ni0Var.m();
            } else if (iP == 40) {
                this.w = ni0Var.m();
            } else if (iP == 48) {
                int iM2 = ni0Var.m();
                if (iM2 == 0 || iM2 == 1 || iM2 == 2 || iM2 == 3) {
                    this.c = iM2;
                }
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        n04[] n04VarArr = this.t;
        int iJ = 0;
        if (n04VarArr != null && n04VarArr.length > 0) {
            int iT = 0;
            while (true) {
                n04[] n04VarArr2 = this.t;
                if (iJ >= n04VarArr2.length) {
                    break;
                }
                n04 n04Var = n04VarArr2[iJ];
                if (n04Var != null) {
                    iT = y22.t(1, n04Var) + iT;
                }
                iJ++;
            }
            iJ = iT;
        }
        int i = this.a;
        if (i != 0) {
            iJ += y22.j(2, i);
        }
        if (!this.m.equals("")) {
            iJ += y22.m(this.m, 3);
        }
        int i2 = this.q;
        if (i2 != 0) {
            iJ += y22.j(4, i2);
        }
        int i3 = this.w;
        if (i3 != 0) {
            iJ += y22.j(5, i3);
        }
        int i4 = this.c;
        return i4 != 0 ? y22.j(6, i4) + iJ : iJ;
    }
}
