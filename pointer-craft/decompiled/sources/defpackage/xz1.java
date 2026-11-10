package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xz1 implements my1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ gx3 j;
    public final /* synthetic */ ft0 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ boolean t;

    public xz1(gx3 gx3Var, boolean z, bz1 bz1Var, ft0 ft0Var, ob3 ob3Var) {
        this.j = gx3Var;
        this.t = z;
        this.a = bz1Var;
        this.m = ft0Var;
        this.q = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        Integer numValueOf = Integer.valueOf(R.string.premium_feature_fullscreen_mode);
        if ((2 & 2) != 0) {
            numValueOf = null;
        }
        boolean z = (2 & 4) != 0 ? true : this.t;
        gx3 gx3Var = this.j;
        gx3Var.getClass();
        if (!z || gx3Var.g) {
            ft0 ft0Var = this.m;
            this.a.l(ft0Var.t, Integer.valueOf(ft0Var.j));
            this.q.setValue(ft0Var);
        } else {
            gx3Var.n.l("function_click", numValueOf);
        }
        return og5.g;
    }
}
