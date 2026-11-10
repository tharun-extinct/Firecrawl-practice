package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t80 implements my1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 m;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ t80(xy1 xy1Var, int i, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = i;
        this.m = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.m;
        int i = this.a;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                xy1Var.a(Integer.valueOf(i));
                ob3Var.setValue(Boolean.FALSE);
                break;
            default:
                ob3Var.setValue(Boolean.FALSE);
                xy1Var.a(Integer.valueOf(i));
                break;
        }
        return og5Var;
    }
}
