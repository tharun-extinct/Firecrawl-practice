package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m04 extends np3 {
    public static final Parcelable.Creator<m04> CREATOR = new op3(m04.class);
    public String t = "";

    public m04() {
        this.j = -1;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        if (this.t.equals("")) {
            return;
        }
        y22Var.M(this.t, 1);
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 10) {
                this.t = ni0Var.s();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        if (this.t.equals("")) {
            return 0;
        }
        return y22.m(this.t, 1);
    }
}
