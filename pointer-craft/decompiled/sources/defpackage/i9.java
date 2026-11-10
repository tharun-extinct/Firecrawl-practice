package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i9 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ i9(ss2 ss2Var, int i) {
        this.j = (byte) 2;
        this.t = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        boolean zY0;
        byte b = this.j;
        int i = this.t;
        switch (b) {
            case 0:
                zY0 = ((cu1) obj).Y0(i);
                break;
            case 1:
                zY0 = ((cu1) obj).Y0(i);
                break;
            default:
                nr2 nr2Var = (nr2) obj;
                at4 at4VarM = js2.m();
                js2.z(at4VarM, js2.b(at4VarM), at4VarM != null ? at4VarM.v() : null);
                int iG = nr2Var.g() == -1 ? 2 : nr2Var.g();
                for (int i2 = 0; i2 < iG; i2++) {
                    nr2Var.y(i + i2);
                }
                return og5.g;
        }
        return Boolean.valueOf(zY0);
    }

    public /* synthetic */ i9(int i, byte b) {
        this.j = b;
        this.t = i;
    }
}
