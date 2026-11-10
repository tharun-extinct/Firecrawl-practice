package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr2 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ as2 t;

    public /* synthetic */ zr2(as2 as2Var, byte b) {
        this.j = b;
        this.t = as2Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        as2 as2Var = this.t;
        switch (b) {
            case 0:
                return Float.valueOf(as2Var.f.y());
            case 1:
                return Float.valueOf(as2Var.f.v());
            default:
                return Float.valueOf(as2Var.f.g() - as2Var.f.n());
        }
    }
}
