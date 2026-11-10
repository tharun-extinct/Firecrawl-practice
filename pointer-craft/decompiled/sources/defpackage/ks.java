package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ks implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ rt t;

    public /* synthetic */ ks(rt rtVar, byte b) {
        this.j = b;
        this.t = rtVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        rt rtVar = this.t;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                rtVar.t.setValue(str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                rtVar.g(str2);
                break;
            default:
                qr0 qr0Var = rtVar.g;
                qr0Var.getClass();
                m50.T(v70.d(qr0Var), null, new fr0(qr0Var, null, (byte) 2), 3);
                break;
        }
        return og5Var;
    }
}
