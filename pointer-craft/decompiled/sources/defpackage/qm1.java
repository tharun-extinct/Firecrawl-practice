package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class qm1 implements PointerInputEventHandler {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ qm1(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        byte b = this.g;
        byte b2 = 1;
        byte b3 = 2;
        mu0 mu0Var2 = null;
        Object obj = this.y;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                Object objR = bg6.r(vu3Var, new rb((nm1) obj, mu0Var2, b2), mu0Var);
                return objR == px0Var ? objR : og5Var;
            case 1:
                Object objQ0 = ((g05) vu3Var).Q0(new qz((kw0) obj, mu0Var2, b2), mu0Var);
                return objQ0 == px0Var ? objQ0 : og5Var;
            case 2:
                kr4 kr4Var = (kr4) obj;
                Object objN = r25.n(vu3Var, new ir4(kr4Var, null), new er4(kr4Var, b3), mu0Var, 3);
                return objN == px0Var ? objN : og5Var;
            case 3:
                Object objR2 = bg6.r(vu3Var, new hr2((fy4) obj, mu0Var2, b3), mu0Var);
                return objR2 == px0Var ? objR2 : og5Var;
            case 4:
                Object objR3 = bg6.r(vu3Var, new rb(new fd(1, (a45) obj, a45.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 3), mu0Var2, b3), mu0Var);
                if (objR3 != px0Var) {
                    objR3 = og5Var;
                }
                return objR3 == px0Var ? objR3 : og5Var;
            case 5:
                b65 b65Var = (b65) obj;
                mf2 mf2Var = b65Var.e;
                z55 z55Var = b65Var.d;
                g05 g05Var = (g05) vu3Var;
                g05Var.getClass();
                Object objR4 = bg6.r(vu3Var, new hr2(new ld1(k33.V(g05Var).H), mf2Var, z55Var, null), mu0Var);
                if (objR4 != px0Var) {
                    objR4 = og5Var;
                }
                return objR4 == px0Var ? objR4 : og5Var;
            default:
                Object objB = k33.B(new mo(vu3Var, (r45) obj, mu0Var2, (byte) 6), mu0Var);
                if (objB != px0Var) {
                    objB = og5Var;
                }
                return objB == px0Var ? objB : og5Var;
        }
    }
}
