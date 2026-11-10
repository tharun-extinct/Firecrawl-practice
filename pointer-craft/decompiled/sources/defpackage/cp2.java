package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class cp2 implements nk4 {
    public static final cp2 j = new cp2();
    public static final vo2 t;

    static {
        vo2 vo2VarI = vo2.i();
        vo2VarI.getClass();
        t = vo2VarI;
    }

    @Override // defpackage.nk4
    public final Object i(FileInputStream fileInputStream) throws tx0 {
        try {
            return vo2.p(fileInputStream);
        } catch (hg2 e) {
            throw new tx0("Cannot read proto.", e);
        }
    }

    @Override // defpackage.nk4
    public final Object n() {
        return t;
    }

    @Override // defpackage.nk4
    public final void t(Object obj, eg5 eg5Var) throws IOException {
        vo2 vo2Var = (vo2) obj;
        vo2Var.getClass();
        int iG = vo2Var.g(null);
        Logger logger = yi0.y;
        if (iG > 4096) {
            iG = 4096;
        }
        wi0 wi0Var = new wi0(eg5Var, iG);
        vo2Var.q(wi0Var);
        if (wi0Var.x > 0) {
            wi0Var.a0();
        }
    }
}
