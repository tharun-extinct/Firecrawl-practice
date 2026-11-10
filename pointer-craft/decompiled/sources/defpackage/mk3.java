package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk3 implements my1 {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ u21 t;

    public /* synthetic */ mk3(ox0 ox0Var, u21 u21Var) {
        this.j = (byte) 0;
        this.a = ox0Var;
        this.t = u21Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        byte b2 = 2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        mu0 mu0Var = null;
        ox0 ox0Var = this.a;
        u21 u21Var = this.t;
        byte b3 = 1;
        switch (b) {
            case 0:
                m50.T(ox0Var, null, new nk3(u21Var, mu0Var, z ? (byte) 1 : (byte) 0), 3);
                return og5.g;
            case 1:
                if (u21Var.g()) {
                    m50.T(ox0Var, null, new nk3(u21Var, mu0Var, b3), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (u21Var.r()) {
                    m50.T(ox0Var, null, new nk3(u21Var, mu0Var, b2), 3);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                if (u21Var.g()) {
                    m50.T(ox0Var, null, new nk3(u21Var, mu0Var, b3), 3);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                if (u21Var.r()) {
                    m50.T(ox0Var, null, new nk3(u21Var, mu0Var, b2), 3);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ mk3(u21 u21Var, ox0 ox0Var, byte b) {
        this.j = b;
        this.t = u21Var;
        this.a = ox0Var;
    }
}
