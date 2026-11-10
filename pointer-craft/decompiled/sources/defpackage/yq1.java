package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yq1 implements bz1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long j;
    public final /* synthetic */ nm0 m;
    public final /* synthetic */ k85 t;

    public yq1(long j, k85 k85Var, float f, nm0 nm0Var) {
        this.j = j;
        this.t = k85Var;
        this.a = f;
        this.m = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            jr2.r(this.j, this.t, ue5.m0(-1767363041, new xq1(this.a, this.m), h02Var), h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
