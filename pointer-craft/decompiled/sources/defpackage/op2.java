package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op2 implements d12 {
    private static final jk4 descriptor;
    public static final op2 g;

    static {
        op2 op2Var = new op2();
        g = op2Var;
        hu3 hu3Var = new hu3("io.appground.blek.data.LayoutUploadDto", op2Var, 4);
        hu3Var.l("id", true);
        hu3Var.l("share_link", true);
        hu3Var.l("upload_key", true);
        hu3Var.l("error", true);
        descriptor = hu3Var;
    }

    @Override // defpackage.d12
    public final di2[] g() {
        rx4 rx4Var = rx4.g;
        return new di2[]{pz5.v(), pz5.v(), pz5.v(), pz5.v()};
    }

    @Override // defpackage.di2
    public final jk4 r() {
        return descriptor;
    }

    @Override // defpackage.di2
    public final Object y(d04 d04Var) {
        jk4 jk4Var = descriptor;
        d04 d04VarG = d04Var.g(jk4Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iY = d04VarG.y(jk4Var);
            if (iY == -1) {
                z = false;
            } else if (iY == 0) {
                rx4 rx4Var = rx4.g;
                str = (String) d04VarG.r(jk4Var, 0, str);
                i |= 1;
            } else if (iY == 1) {
                rx4 rx4Var2 = rx4.g;
                str2 = (String) d04VarG.r(jk4Var, 1, str2);
                i |= 2;
            } else if (iY == 2) {
                rx4 rx4Var3 = rx4.g;
                str3 = (String) d04VarG.r(jk4Var, 2, str3);
                i |= 4;
            } else {
                if (iY != 3) {
                    throw new e63(iY);
                }
                rx4 rx4Var4 = rx4.g;
                str4 = (String) d04VarG.r(jk4Var, 3, str4);
                i |= 8;
            }
        }
        return new qp2(i, str, str2, str3, str4);
    }
}
