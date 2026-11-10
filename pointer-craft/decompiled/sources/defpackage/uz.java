package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class uz implements PointerInputEventHandler {
    public final /* synthetic */ byte g;
    public final /* synthetic */ ya5 y;

    public /* synthetic */ uz(ya5 ya5Var, byte b) {
        this.g = b;
        this.y = ya5Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        byte b = this.g;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        ya5 ya5Var = this.y;
        switch (b) {
            case 0:
                Object objB = k33.B(new tz(vu3Var, ya5Var, null, (byte) 0), mu0Var);
                return objB == px0Var ? objB : og5Var;
            default:
                Object objB2 = k33.B(new tz(vu3Var, ya5Var, null, (byte) 1), mu0Var);
                return objB2 == px0Var ? objB2 : og5Var;
        }
    }
}
