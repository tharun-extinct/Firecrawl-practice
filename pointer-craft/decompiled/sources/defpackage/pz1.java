package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pz1 implements en1 {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ pz1(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    public static pz1 g(Object obj) {
        if (obj != null) {
            return new pz1(obj, (byte) 2);
        }
        l0.q("instance cannot be null");
        return null;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                lp1 lp1Var = (lp1) ((pz1) obj).y;
                lp1Var.getClass();
                return lp1Var.j;
            case 1:
                return new qz1((rz1) ((pz1) obj).y);
            default:
                return obj;
        }
    }
}
