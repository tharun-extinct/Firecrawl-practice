package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zr4 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ wr4 t;

    public /* synthetic */ zr4(wr4 wr4Var, byte b) {
        this.j = b;
        this.t = wr4Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        wr4 wr4Var = this.t;
        switch (b) {
            case 0:
                ((bs4) wr4Var).g();
                return Boolean.TRUE;
            default:
                ib0 ib0Var = ((bs4) wr4Var).y;
                if (ib0Var.h() instanceof th3) {
                    ib0Var.j(ns4.t);
                }
                return og5.g;
        }
    }
}
