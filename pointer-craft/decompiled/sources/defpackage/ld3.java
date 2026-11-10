package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld3 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ ld3(byte b, Object obj, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        boolean z = this.t;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                kd3 kd3Var = (kd3) obj2;
                kd3Var.x(z);
                return new md3((ou2) obj, kd3Var, (byte) 0);
            default:
                ao0 ao0Var = (ao0) obj2;
                ao0Var.w(z);
                return new md3((ou2) obj, ao0Var, (byte) 1);
        }
    }
}
