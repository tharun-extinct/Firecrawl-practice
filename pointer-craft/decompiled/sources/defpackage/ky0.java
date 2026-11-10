package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class ky0 extends x62 {
    public q04 E0;
    public iv4 F0;

    @Override // defpackage.gy
    public final boolean Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        iv4 iv4Var = this.F0;
        mu0 mu0Var = null;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.F0 = m50.T(mq2.a(b()), null, new q(this, viewGroup, mu0Var, (byte) 25), 3);
        return false;
    }

    public final void f0(ViewGroup viewGroup, q04 q04Var) {
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(N());
        layoutInflaterFrom.getClass();
        p04 p04VarZ = q04Var.z();
        p04VarZ.getClass();
        String str = q04Var.c;
        str.getClass();
        c0(viewGroup, layoutInflaterFrom, p04VarZ, null, str, qi1.j);
    }
}
