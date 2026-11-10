package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w04 extends np3 {
    public static final Parcelable.Creator<w04> CREATOR = new op3(w04.class);
    public int t;

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        int i = this.t;
        if (i != 0) {
            y22Var.H(1, i);
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
                this.t = ni0Var.b();
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        int i = this.t;
        if (i != 0) {
            return y22.j(1, i);
        }
        return 0;
    }
}
