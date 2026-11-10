package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i52 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ j52 t;

    public /* synthetic */ i52(j52 j52Var, byte b) {
        this.j = b;
        this.t = j52Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        j52 j52Var = this.t;
        switch (b) {
            case 0:
                kf5 kf5Var = j52Var.C;
                if (kf5Var != null) {
                    kf5Var.getValue();
                    return og5Var;
                }
                pc2.y("Font resolution state is not set.");
                up.q();
                return null;
            default:
                kf5 kf5Var2 = j52Var.C;
                if (kf5Var2 != null) {
                    kf5Var2.getValue();
                    return og5Var;
                }
                pc2.y("Font resolution state is not set.");
                up.q();
                return null;
        }
    }
}
