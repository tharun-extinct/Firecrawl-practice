package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s63 implements my1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ ox0 m;
    public final /* synthetic */ xo4 t;

    public /* synthetic */ s63(xo4 xo4Var, ox0 ox0Var, my1 my1Var) {
        this.t = xo4Var;
        this.m = ox0Var;
        this.a = my1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        ox0 ox0Var = this.m;
        my1 my1Var = this.a;
        xo4 xo4Var = this.t;
        switch (b) {
            case 0:
                if (((Boolean) ((xy1) xo4Var.n.n).a(yo4.j)).booleanValue()) {
                    m50.T(ox0Var, null, new v63(xo4Var, null, (byte) 3), 3).A(new u63(xo4Var, my1Var, (byte) 0));
                }
                break;
            default:
                int iOrdinal = ((yo4) ((tp3) xo4Var.n.l).getValue()).ordinal();
                if (iOrdinal == 1) {
                    my1Var.g();
                } else if (iOrdinal == 2) {
                    m50.T(ox0Var, null, new v63(xo4Var, null, (byte) 4), 3);
                } else {
                    m50.T(ox0Var, null, new v63(xo4Var, null, (byte) 5), 3);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ s63(xo4 xo4Var, my1 my1Var, ox0 ox0Var) {
        this.t = xo4Var;
        this.a = my1Var;
        this.m = ox0Var;
    }
}
