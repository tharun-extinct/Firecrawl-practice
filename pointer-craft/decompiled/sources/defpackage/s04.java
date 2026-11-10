package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s04 extends np3 {
    public static final Parcelable.Creator<s04> CREATOR = new op3(s04.class);
    public boolean t = false;
    public float a = 0.0f;
    public int m = 0;
    public int q = 0;
    public int w = 0;
    public float c = 0.0f;

    public s04() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        boolean z = this.t;
        if (z) {
            y22Var.E(1, z);
        }
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            y22Var.G(2, this.a);
        }
        int i = this.m;
        if (i != 0) {
            y22Var.H(3, i);
        }
        int i2 = this.q;
        if (i2 != 0) {
            y22Var.H(4, i2);
        }
        int i3 = this.w;
        if (i3 != 0) {
            y22Var.H(5, i3);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            y22Var.G(6, this.c);
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
            } else if (iP == 21) {
                this.a = ni0Var.a();
            } else if (iP == 24) {
                int iM = ni0Var.m();
                if (iM == -1 || iM == 0 || iM == 1 || iM == 2 || iM == 3 || iM == 4) {
                    this.m = iM;
                }
            } else if (iP == 32) {
                this.q = ni0Var.m();
            } else if (iP == 40) {
                this.w = ni0Var.m();
            } else if (iP == 53) {
                this.c = ni0Var.a();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int iL = this.t ? y22.l(1) : 0;
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            iL += y22.q(2) + 4;
        }
        int i = this.m;
        if (i != 0) {
            iL += y22.j(3, i);
        }
        int i2 = this.q;
        if (i2 != 0) {
            iL += y22.j(4, i2);
        }
        int i3 = this.w;
        if (i3 != 0) {
            iL += y22.j(5, i3);
        }
        return Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f) ? y22.q(6) + 4 + iL : iL;
    }
}
