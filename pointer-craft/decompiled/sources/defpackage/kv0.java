package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kv0 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bv0 t;

    public /* synthetic */ kv0(bv0 bv0Var, byte b) {
        this.j = b;
        this.t = bv0Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        bv0 bv0Var = this.t;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                bv0Var.r.setVisibility(zBooleanValue ? 0 : 8);
                break;
            default:
                bv0Var.r.setVisibility(zBooleanValue ? 0 : 8);
                break;
        }
        return og5Var;
    }
}
