package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eo4 implements d12 {
    private static final jk4 descriptor;
    public static final eo4 g;

    static {
        eo4 eo4Var = new eo4();
        g = eo4Var;
        hu3 hu3Var = new hu3("io.appground.blek.data.SharedLayout", eo4Var, 2);
        hu3Var.l("data", false);
        hu3Var.l("name", false);
        descriptor = hu3Var;
    }

    @Override // defpackage.d12
    public final di2[] g() {
        return new di2[]{w90.y, rx4.g};
    }

    @Override // defpackage.di2
    public final jk4 r() {
        return descriptor;
    }

    @Override // defpackage.di2
    public final Object y(d04 d04Var) {
        jk4 jk4Var = descriptor;
        d04 d04VarG = d04Var.g(jk4Var);
        byte[] bArr = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        while (z) {
            int iY = d04VarG.y(jk4Var);
            if (iY == -1) {
                z = false;
            } else if (iY == 0) {
                w90 w90Var = w90.y;
                w90Var.getClass();
                d04VarG.g.add(d04VarG.l(jk4Var.n(0)));
                Object objN = d04VarG.n(w90Var);
                if (!d04VarG.y) {
                    d04VarG.j();
                }
                d04VarG.y = false;
                bArr = (byte[]) objN;
                i |= 1;
            } else {
                if (iY != 1) {
                    throw new e63(iY);
                }
                strV = d04VarG.v(d04VarG.l(jk4Var.n(1)));
                i |= 2;
            }
        }
        return new go4(i, strV, bArr);
    }
}
