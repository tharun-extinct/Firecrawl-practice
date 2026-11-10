package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object n;
    public final /* synthetic */ gu2 r;
    public final /* synthetic */ Object y;

    public /* synthetic */ t2(Object obj, gu2 gu2Var, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = gu2Var;
        this.n = obj2;
    }

    @Override // defpackage.va1
    public final void g() {
        byte b = this.g;
        Object obj = this.n;
        gu2 gu2Var = this.r;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ((my1) obj2).g();
                gu2Var.a().x((s2) obj);
                break;
            default:
                mc3 mc3Var = (mc3) gu2Var;
                ((n91) obj2).y().r(mc3Var);
                ((st4) obj).remove(mc3Var);
                break;
        }
    }
}
