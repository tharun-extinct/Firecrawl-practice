package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class p55 implements PointerInputEventHandler {
    public final /* synthetic */ ox0 g;
    public final /* synthetic */ ob3 n;
    public final /* synthetic */ ja3 r;
    public final /* synthetic */ ob3 y;

    public p55(ox0 ox0Var, ob3 ob3Var, ja3 ja3Var, ob3 ob3Var2) {
        this.g = ox0Var;
        this.y = ob3Var;
        this.r = ja3Var;
        this.n = ob3Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vu3 vu3Var, mu0 mu0Var) {
        o55 o55Var = new o55(this.g, this.y, this.r, null);
        ff ffVar = new ff(this.n, (byte) 21);
        md1 md1Var = r25.g;
        Object objB = k33.B(new tc(vu3Var, o55Var, ffVar, new kx3(vu3Var), null, (byte) 5), mu0Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objB != px0Var) {
            objB = og5Var;
        }
        return objB == px0Var ? objB : og5Var;
    }
}
