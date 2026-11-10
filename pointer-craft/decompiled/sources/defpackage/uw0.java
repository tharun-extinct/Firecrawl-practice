package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class uw0 implements PointerInputEventHandler {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ uw0(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        byte b = this.g;
        px0 px0Var = px0.j;
        Object obj = this.r;
        Object obj2 = this.y;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                Object objB = k33.B(new dp((Object) vu3Var, obj2, obj, (mu0) null, (byte) 1), mu0Var);
                return objB == px0Var ? objB : og5Var;
            default:
                Object objN = r25.n(vu3Var, new hb5((my1) obj2, (xy1) obj, vu3Var, null), null, mu0Var, 11);
                if (objN != px0Var) {
                    objN = og5Var;
                }
                return objN == px0Var ? objN : og5Var;
        }
    }
}
