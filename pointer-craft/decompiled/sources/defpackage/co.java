package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co implements my1 {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ we1 t;

    public /* synthetic */ co(ox0 ox0Var, we1 we1Var) {
        this.a = ox0Var;
        this.t = we1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        ox0 ox0Var = this.a;
        we1 we1Var = this.t;
        switch (b) {
            case 0:
                m50.T(ox0Var, null, new lo(we1Var, null, (byte) 0), 3);
                return og5.g;
            default:
                if (((Boolean) we1Var.g.a(xe1.j)).booleanValue()) {
                    m50.T(ox0Var, null, new lo(we1Var, null, (byte) 3), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ co(we1 we1Var, ox0 ox0Var) {
        this.t = we1Var;
        this.a = ox0Var;
    }
}
