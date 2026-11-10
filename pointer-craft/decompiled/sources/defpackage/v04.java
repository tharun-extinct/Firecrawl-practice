package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v04 extends np3 {
    public static final Parcelable.Creator<v04> CREATOR = new op3(v04.class);
    public boolean t = false;
    public boolean a = false;
    public boolean m = false;
    public boolean q = false;
    public boolean w = false;
    public boolean c = false;
    public boolean i = false;
    public boolean b = false;
    public boolean s = false;

    public v04() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        boolean z = this.t;
        if (z) {
            y22Var.E(1, z);
        }
        boolean z2 = this.a;
        if (z2) {
            y22Var.E(2, z2);
        }
        boolean z3 = this.m;
        if (z3) {
            y22Var.E(3, z3);
        }
        boolean z4 = this.q;
        if (z4) {
            y22Var.E(4, z4);
        }
        boolean z5 = this.w;
        if (z5) {
            y22Var.E(5, z5);
        }
        boolean z6 = this.c;
        if (z6) {
            y22Var.E(6, z6);
        }
        boolean z7 = this.i;
        if (z7) {
            y22Var.E(7, z7);
        }
        boolean z8 = this.b;
        if (z8) {
            y22Var.E(8, z8);
        }
        boolean z9 = this.s;
        if (z9) {
            y22Var.E(9, z9);
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
                this.t = ni0Var.l();
            } else if (iP == 16) {
                this.a = ni0Var.l();
            } else if (iP == 24) {
                this.m = ni0Var.l();
            } else if (iP == 32) {
                this.q = ni0Var.l();
            } else if (iP == 40) {
                this.w = ni0Var.l();
            } else if (iP == 48) {
                this.c = ni0Var.l();
            } else if (iP == 56) {
                this.i = ni0Var.l();
            } else if (iP == 64) {
                this.b = ni0Var.l();
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
        int iL = this.t ? y22.l(1) : 0;
        if (this.a) {
            iL += y22.l(2);
        }
        if (this.m) {
            iL += y22.l(3);
        }
        if (this.q) {
            iL += y22.l(4);
        }
        if (this.w) {
            iL += y22.l(5);
        }
        if (this.c) {
            iL += y22.l(6);
        }
        if (this.i) {
            iL += y22.l(7);
        }
        if (this.b) {
            iL += y22.l(8);
        }
        return this.s ? y22.l(9) + iL : iL;
    }
}
