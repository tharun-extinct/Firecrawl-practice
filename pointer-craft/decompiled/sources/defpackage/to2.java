package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class to2 extends np3 {
    public static final Parcelable.Creator<to2> CREATOR = new op3(to2.class);
    public String a;
    public String b;
    public String c;
    public String i;
    public int m;
    public int q;
    public int t;
    public String w;

    public static to2 z(byte[] bArr) {
        to2 to2Var = new to2();
        to2Var.t = 0;
        to2Var.a = "";
        to2Var.m = 0;
        to2Var.q = 0;
        to2Var.w = "";
        to2Var.c = "";
        to2Var.i = "";
        to2Var.b = "";
        to2Var.j = -1;
        np3.l(to2Var, bArr);
        return to2Var;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        int i = this.t;
        if (i != 0) {
            y22Var.H(1, i);
        }
        if (!this.a.equals("")) {
            y22Var.M(this.a, 2);
        }
        int i2 = this.m;
        if (i2 != 0) {
            y22Var.H(3, i2);
        }
        int i3 = this.q;
        if (i3 != 0) {
            y22Var.H(4, i3);
        }
        if (!this.w.equals("")) {
            y22Var.M(this.w, 5);
        }
        if (!this.c.equals("")) {
            y22Var.M(this.c, 6);
        }
        if (!this.i.equals("")) {
            y22Var.M(this.i, 7);
        }
        if (this.b.equals("")) {
            return;
        }
        y22Var.M(this.b, 8);
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 8) {
                this.t = ni0Var.b();
            } else if (iP == 18) {
                this.a = ni0Var.s();
            } else if (iP == 24) {
                int iB = ni0Var.b();
                if (iB == 0 || iB == 1 || iB == 2) {
                    this.m = iB;
                }
            } else if (iP == 32) {
                int iB2 = ni0Var.b();
                if (iB2 == 0 || iB2 == 1 || iB2 == 2 || iB2 == 3) {
                    this.q = iB2;
                }
            } else if (iP == 42) {
                this.w = ni0Var.s();
            } else if (iP == 50) {
                this.c = ni0Var.s();
            } else if (iP == 58) {
                this.i = ni0Var.s();
            } else if (iP == 66) {
                this.b = ni0Var.s();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int i = this.t;
        int iJ = i != 0 ? y22.j(1, i) : 0;
        if (!this.a.equals("")) {
            iJ += y22.m(this.a, 2);
        }
        int i2 = this.m;
        if (i2 != 0) {
            iJ += y22.j(3, i2);
        }
        int i3 = this.q;
        if (i3 != 0) {
            iJ += y22.j(4, i3);
        }
        if (!this.w.equals("")) {
            iJ += y22.m(this.w, 5);
        }
        if (!this.c.equals("")) {
            iJ += y22.m(this.c, 6);
        }
        if (!this.i.equals("")) {
            iJ += y22.m(this.i, 7);
        }
        return !this.b.equals("") ? y22.m(this.b, 8) + iJ : iJ;
    }
}
