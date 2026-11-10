package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue1 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ ue1(xy1 xy1Var, byte b) {
        this.j = b;
        this.t = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                return new we1((xe1) obj, xy1Var);
            case 1:
                at4 at4Var = (at4) xy1Var.a((gt4) obj);
                synchronized (it4.r) {
                    it4.n = it4.n.x(at4Var.l());
                }
                return at4Var;
            case 2:
                Long l = (Long) obj;
                l.getClass();
                return xy1Var.a(l);
            default:
                ((r4) obj).getClass();
                xy1Var.a(Boolean.TRUE);
                return og5.g;
        }
    }
}
