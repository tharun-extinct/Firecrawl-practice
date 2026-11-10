package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q04 extends np3 {
    public static final Parcelable.Creator<q04> CREATOR = new op3(q04.class);
    public int m = 0;
    public String q = "";
    public String w = "";
    public String c = "";
    public String i = "";
    public byte t = 0;
    public p04 a = null;

    public q04() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        int i = this.m;
        if (i != 0) {
            y22Var.H(1, i);
        }
        if (!this.q.equals("")) {
            y22Var.M(this.q, 2);
        }
        if (!this.w.equals("")) {
            y22Var.M(this.w, 3);
        }
        if (!this.c.equals("")) {
            y22Var.M(this.c, 4);
        }
        if (!this.i.equals("")) {
            y22Var.M(this.i, 5);
        }
        if (this.t == 6) {
            y22Var.I(6, this.a);
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
                this.m = ni0Var.m();
            } else if (iP == 18) {
                this.q = ni0Var.s();
            } else if (iP == 26) {
                this.w = ni0Var.s();
            } else if (iP == 34) {
                this.c = ni0Var.s();
            } else if (iP == 42) {
                this.i = ni0Var.s();
            } else if (iP == 50) {
                if (this.t != 6) {
                    this.a = new p04();
                }
                ni0Var.q(this.a);
                this.t = (byte) 6;
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int i = this.m;
        int iJ = i != 0 ? y22.j(1, i) : 0;
        if (!this.q.equals("")) {
            iJ += y22.m(this.q, 2);
        }
        if (!this.w.equals("")) {
            iJ += y22.m(this.w, 3);
        }
        if (!this.c.equals("")) {
            iJ += y22.m(this.c, 4);
        }
        if (!this.i.equals("")) {
            iJ += y22.m(this.i, 5);
        }
        return this.t == 6 ? y22.t(6, this.a) + iJ : iJ;
    }

    public final p04 z() {
        if (this.t == 6) {
            return this.a;
        }
        return null;
    }
}
