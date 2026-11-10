package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends kk2 implements xy1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj1(xy1 xy1Var, byte b) {
        super(1);
        this.t = b;
        this.a = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        xy1 xy1Var = this.a;
        switch (b) {
            case 0:
                return new je2(((long) ((Number) xy1Var.a(Integer.valueOf((int) (((qe2) obj).g >> 32)))).intValue()) << 32);
            case 1:
                return new je2(((long) ((Number) xy1Var.a(Integer.valueOf((int) (((qe2) obj).g & 4294967295L)))).intValue()) & 4294967295L);
            case 2:
                return new je2(((long) ((Number) xy1Var.a(Integer.valueOf((int) (((qe2) obj).g >> 32)))).intValue()) << 32);
            default:
                return new je2(((long) ((Number) xy1Var.a(Integer.valueOf((int) (((qe2) obj).g & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}
