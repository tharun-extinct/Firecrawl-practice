package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gm4 implements my1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ gm4(xy1 xy1Var, String str, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = str;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        String str = this.a;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                xy1Var.a(str);
                break;
            default:
                xy1Var.a(str);
                break;
        }
        return og5Var;
    }
}
