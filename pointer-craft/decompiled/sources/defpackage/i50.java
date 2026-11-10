package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i50 implements bz1 {
    public final /* synthetic */ float j;
    public final /* synthetic */ float t;

    public i50(float f, float f2) {
        this.j = f;
        this.t = f2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            z50.g(mq4.t(g73.g, this.j, this.t), h02Var, 0);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
