package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zj1 extends kk2 implements xy1 {
    public final /* synthetic */ us3 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj1(us3 us3Var, byte b) {
        super(1);
        this.t = b;
        this.a = us3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        og5 og5Var = og5.g;
        us3 us3Var = this.a;
        switch (b) {
            case 0:
                ((ts3) obj).j(us3Var, 0, 0, 0.0f);
                break;
            default:
                ((ts3) obj).j(us3Var, 0, 0, 0.0f);
                break;
        }
        return og5Var;
    }
}
