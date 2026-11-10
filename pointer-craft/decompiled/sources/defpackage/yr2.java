package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ as2 t;

    public /* synthetic */ yr2(as2 as2Var, byte b) {
        this.j = b;
        this.t = as2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        as2 as2Var = this.t;
        switch (b) {
            case 0:
                yq2 yq2Var = (yq2) as2Var.o.g();
                int iG = yq2Var.g();
                int i = 0;
                while (i < iG) {
                    if (yq2Var.y(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                yq2 yq2Var2 = (yq2) as2Var.o.g();
                if (iIntValue < 0 || iIntValue >= yq2Var2.g()) {
                    pc2.g("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + yq2Var2.g() + ")");
                }
                m50.T(as2Var.E0(), null, new d40(as2Var, iIntValue, (mu0) null, (byte) 4), 3);
                return Boolean.TRUE;
        }
    }
}
