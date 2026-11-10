package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ns implements my1 {
    public final /* synthetic */ da3 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ ox0 t;

    public /* synthetic */ ns(ox0 ox0Var, da3 da3Var, byte b) {
        this.j = b;
        this.t = ox0Var;
        this.a = da3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        da3 da3Var = this.a;
        ox0 ox0Var = this.t;
        switch (b) {
            case 0:
                m50.T(ox0Var, null, new nt(da3Var, null, (byte) 0), 3);
                break;
            case 1:
                m50.T(ox0Var, null, new nt(da3Var, null, (byte) 1), 3);
                break;
            default:
                m50.T(ox0Var, null, new nt(da3Var, null, (byte) 2), 3);
                break;
        }
        return og5Var;
    }
}
