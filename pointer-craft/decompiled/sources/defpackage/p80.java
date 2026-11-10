package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p80 implements my1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object w;

    public /* synthetic */ p80(gx3 gx3Var, boolean z, my1 my1Var, ox0 ox0Var, l60 l60Var) {
        this.m = gx3Var;
        this.t = z;
        this.a = my1Var;
        this.q = ox0Var;
        this.w = l60Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        Object obj = this.w;
        Object obj2 = this.q;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                gx3 gx3Var = (gx3) obj3;
                ox0 ox0Var = (ox0) obj2;
                l60 l60Var = (l60) obj;
                Integer numValueOf = Integer.valueOf(R.string.premium_feature_fullscreen_mode);
                if ((2 & 2) != 0) {
                    numValueOf = null;
                }
                if (!((2 & 4) != 0 ? true : this.t) || gx3Var.g) {
                    this.a.g();
                    m50.T(ox0Var, null, new a90(l60Var, null, (byte) 0), 3);
                } else {
                    gx3Var.n.l("step_click", numValueOf);
                }
                return og5.g;
            default:
                return new xo4(this.t, this.a, (my1) obj3, (yo4) obj2, (xy1) obj);
        }
    }

    public /* synthetic */ p80(boolean z, my1 my1Var, my1 my1Var2, yo4 yo4Var, xy1 xy1Var) {
        this.t = z;
        this.a = my1Var;
        this.m = my1Var2;
        this.q = yo4Var;
        this.w = xy1Var;
    }
}
