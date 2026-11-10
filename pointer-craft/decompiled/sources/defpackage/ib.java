package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ib implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ p91 t;

    public /* synthetic */ ib(p91 p91Var, byte b) {
        this.j = b;
        this.t = p91Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        p91 p91Var = this.t;
        switch (b) {
            case 0:
                p91Var.show();
                return new kb(p91Var, (byte) 0);
            default:
                if (p91Var.w.g) {
                    p91Var.q.g();
                }
                return og5.g;
        }
    }
}
