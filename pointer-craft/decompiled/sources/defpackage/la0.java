package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class la0 implements bz1 {
    public final /* synthetic */ ro a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ fo3 t;

    public /* synthetic */ la0(fo3 fo3Var, ro roVar, byte b) {
        this.j = b;
        this.t = fo3Var;
        this.a = roVar;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        ro roVar = this.a;
        fo3 fo3Var = this.t;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                fo3Var.y(roVar, iIntValue, iIntValue2);
                break;
            default:
                fo3Var.y(roVar, iIntValue, iIntValue2);
                break;
        }
        return og5Var;
    }
}
