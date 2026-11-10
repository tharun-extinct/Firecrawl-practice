package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes2.dex */
public final class ba5 extends vh0 {
    public boolean T;
    public xy1 U;
    public final m63 V;

    public ba5(boolean z, ja3 ja3Var, hb2 hb2Var, boolean z2, o94 o94Var, xy1 xy1Var) {
        super(ja3Var, hb2Var, false, z2, null, o94Var, new ud0(xy1Var, z, (byte) 1));
        this.T = z;
        this.U = xy1Var;
        this.V = new m63(this, (byte) 9);
    }

    @Override // defpackage.z
    public final void T0(nj4 nj4Var) {
        lj4.m(nj4Var, this.T ? ca5.j : ca5.t);
        lj4.r(nj4Var, cm1.m);
        wb wbVar = Build.VERSION.SDK_INT >= 26 ? new wb(AutofillValue.forToggle(this.T)) : null;
        if (wbVar != null) {
            lj4.x(nj4Var, wbVar);
        }
        lj4.y(nj4Var, new aa5(nj4Var, (byte) 0));
    }
}
