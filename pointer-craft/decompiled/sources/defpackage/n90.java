package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n90 implements bz1 {
    public final /* synthetic */ cz1 a;
    public final /* synthetic */ long j;
    public final /* synthetic */ zn3 t;

    public n90(long j, zn3 zn3Var, cz1 cz1Var) {
        this.j = j;
        this.t = zn3Var;
        this.a = cz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 0;
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            jr2.r(this.j, ((mf5) h02Var.a(of5.g)).w, ue5.m0(417635459, new m90(this.t, this.a, b), h02Var), h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
