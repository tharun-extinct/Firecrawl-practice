package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u04 extends np3 {
    public static final Parcelable.Creator<u04> CREATOR = new op3(u04.class);
    public byte t = 0;
    public Object a = null;

    public u04() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        if (this.t == 1) {
            y22Var.H(1, ((Integer) this.a).intValue());
        }
        if (this.t == 2) {
            y22Var.M((String) this.a, 2);
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
                this.a = Integer.valueOf(ni0Var.m());
                this.t = (byte) 1;
            } else if (iP == 18) {
                this.a = ni0Var.s();
                this.t = (byte) 2;
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int iJ = this.t == 1 ? y22.j(1, ((Integer) this.a).intValue()) : 0;
        return this.t == 2 ? y22.m((String) this.a, 2) + iJ : iJ;
    }
}
