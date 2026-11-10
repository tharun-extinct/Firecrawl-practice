package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ud0 implements my1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ ud0(xy1 xy1Var, boolean z, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = z;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        boolean z = this.a;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                xy1Var.a(Boolean.valueOf(!z));
                break;
            default:
                xy1Var.a(Boolean.valueOf(!z));
                break;
        }
        return og5Var;
    }
}
