package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class h74 extends np3 {
    public static final Parcelable.Creator<h74> CREATOR = new op3(h74.class);
    public static volatile h74[] w;
    public long t = 0;
    public String a = "";
    public int m = 0;
    public String q = "";

    public h74() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        long j = this.t;
        if (j != 0) {
            y22Var.N(1, 0);
            y22Var.L(j);
        }
        if (!this.a.equals("")) {
            y22Var.M(this.a, 2);
        }
        int i = this.m;
        if (i != 0) {
            y22Var.H(3, i);
        }
        if (this.q.equals("")) {
            return;
        }
        y22Var.M(this.q, 4);
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 8) {
                int i = 0;
                long j = 0;
                while (true) {
                    if (i >= 64) {
                        throw new jg2("CodedInputStream encountered a malformed varint.");
                    }
                    byte bW = ni0Var.w();
                    j |= ((long) (bW & 127)) << i;
                    if ((bW & 128) == 0) {
                        this.t = j;
                        break;
                    }
                    i += 7;
                }
            } else if (iP == 18) {
                this.a = ni0Var.s();
            } else if (iP == 24) {
                int iB = ni0Var.b();
                if (iB == 0 || iB == 1) {
                    this.m = iB;
                }
            } else if (iP == 34) {
                this.q = ni0Var.s();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int iJ;
        long j = this.t;
        if (j != 0) {
            int i = 1;
            int iQ = y22.q(1);
            if (((-128) & j) != 0) {
                if (((-16384) & j) == 0) {
                    i = 2;
                } else if (((-2097152) & j) == 0) {
                    i = 3;
                } else if (((-268435456) & j) == 0) {
                    i = 4;
                } else if (((-34359738368L) & j) == 0) {
                    i = 5;
                } else if (((-4398046511104L) & j) == 0) {
                    i = 6;
                } else if (((-562949953421312L) & j) == 0) {
                    i = 7;
                } else if (((-72057594037927936L) & j) == 0) {
                    i = 8;
                } else {
                    i = (j & Long.MIN_VALUE) == 0 ? 9 : 10;
                }
            }
            iJ = iQ + i;
        } else {
            iJ = 0;
        }
        if (!this.a.equals("")) {
            iJ += y22.m(this.a, 2);
        }
        int i2 = this.m;
        if (i2 != 0) {
            iJ += y22.j(3, i2);
        }
        return !this.q.equals("") ? y22.m(this.q, 4) + iJ : iJ;
    }
}
