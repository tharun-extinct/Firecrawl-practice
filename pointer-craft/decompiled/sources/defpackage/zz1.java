package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zz1 implements bz1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ft0 t;

    public zz1(boolean z, ft0 ft0Var, ob3 ob3Var) {
        this.j = z;
        this.t = ft0Var;
        this.a = ob3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            zb6.g(this.j, ((ft0) this.a.getValue()) == this.t, mq4.j(g73.g, 48.0f), h02Var, 384);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
