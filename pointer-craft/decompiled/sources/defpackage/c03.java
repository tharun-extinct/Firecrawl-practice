package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c03 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ d03 t;

    public /* synthetic */ c03(d03 d03Var, byte b) {
        this.j = b;
        this.t = d03Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        d03 d03Var = this.t;
        switch (b) {
            case 0:
                d03Var.S0();
                return og5.g;
            case 1:
                return new wi3(d03Var.J);
            default:
                bl2 bl2Var = (bl2) d03Var.H.getValue();
                return new wi3(bl2Var != null ? bl2Var.N(0L) : 9205357640488583168L);
        }
    }
}
