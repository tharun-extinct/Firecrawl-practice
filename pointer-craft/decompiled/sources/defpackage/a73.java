package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class a73 implements PointerInputEventHandler {
    public final /* synthetic */ byte g;
    public final /* synthetic */ my1 y;

    public /* synthetic */ a73(my1 my1Var, byte b) {
        this.g = b;
        this.y = my1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        byte b = this.g;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        my1 my1Var = this.y;
        switch (b) {
            case 0:
                Object objN = r25.n(vu3Var, null, new tz2(my1Var, (byte) 2), mu0Var, 7);
                return objN == px0Var ? objN : og5Var;
            default:
                Object objN2 = r25.n(vu3Var, null, new tz2(my1Var, (byte) 3), mu0Var, 7);
                return objN2 == px0Var ? objN2 : og5Var;
        }
    }
}
