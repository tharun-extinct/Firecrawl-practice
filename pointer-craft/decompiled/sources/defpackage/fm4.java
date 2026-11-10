package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fm4 implements bz1 {
    public final /* synthetic */ hm3 a;
    public final /* synthetic */ String[] j;
    public final /* synthetic */ st4 m;
    public final /* synthetic */ String q;
    public final /* synthetic */ int t;

    public fm4(String[] strArr, int i, hm3 hm3Var, st4 st4Var, String str) {
        this.j = strArr;
        this.t = i;
        this.a = hm3Var;
        this.m = st4Var;
        this.q = str;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = this.j[this.t];
            if (this.a.l && !this.m.contains(this.q)) {
                z = true;
            }
            yf6.x(str, z, null, h02Var, 0, 4);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
