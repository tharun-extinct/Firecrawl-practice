package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class sb implements PointerInputEventHandler {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ sb(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        byte b = this.g;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        mu0 mu0Var2 = null;
        Object obj = this.y;
        switch (b) {
            case 0:
                Object objR = bg6.r(vu3Var, new rb((tb) obj, mu0Var2, (byte) 0), mu0Var);
                return objR == px0Var ? objR : og5Var;
            default:
                Object objB = k33.B(new s12(vu3Var, (u21) obj, mu0Var2, (byte) 5), mu0Var);
                return objB == px0Var ? objB : og5Var;
        }
    }
}
