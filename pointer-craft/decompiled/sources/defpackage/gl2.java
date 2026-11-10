package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gl2 implements d12 {
    private static final jk4 descriptor;
    public static final gl2 g;

    static {
        gl2 gl2Var = new gl2();
        g = gl2Var;
        hu3 hu3Var = new hu3("io.appground.blek.data.LayoutDto", gl2Var, 5);
        hu3Var.l("id", false);
        hu3Var.l("name", false);
        hu3Var.l("author", false);
        hu3Var.l("platform", false);
        hu3Var.l("language", false);
        descriptor = hu3Var;
    }

    @Override // defpackage.d12
    public final di2[] g() {
        rx4 rx4Var = rx4.g;
        return new di2[]{rx4Var, rx4Var, rx4Var, rx4Var, rx4Var};
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
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        boolean z = true;
        while (z) {
            int iY = d04VarG.y(jk4Var);
            if (iY == -1) {
                z = false;
            } else if (iY == 0) {
                strV = d04VarG.v(d04VarG.l(jk4Var.n(0)));
                i |= 1;
            } else if (iY == 1) {
                strV2 = d04VarG.v(d04VarG.l(jk4Var.n(1)));
                i |= 2;
            } else if (iY == 2) {
                strV3 = d04VarG.v(d04VarG.l(jk4Var.n(2)));
                i |= 4;
            } else if (iY == 3) {
                strV4 = d04VarG.v(d04VarG.l(jk4Var.n(3)));
                i |= 8;
            } else {
                if (iY != 4) {
                    throw new e63(iY);
                }
                strV5 = d04VarG.v(d04VarG.l(jk4Var.n(4)));
                i |= 16;
            }
        }
        return new il2(i, strV, strV2, strV3, strV4, strV5);
    }
}
