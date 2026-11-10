package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class wz implements xy1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ya5 j;
    public final /* synthetic */ ob3 t;

    public wz(ya5 ya5Var, ob3 ob3Var, boolean z) {
        this.j = ya5Var;
        this.t = ob3Var;
        this.a = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        KeyEvent keyEvent = ((ki2) obj).g;
        ya5 ya5Var = this.j;
        boolean zIsVisible = ya5Var.isVisible();
        ob3 ob3Var = this.t;
        if (!zIsVisible) {
            ob3Var.setValue(Boolean.FALSE);
        }
        if (!this.a || mx5.n(keyEvent) != 2 || !fi2.g(vx5.n(keyEvent.getKeyCode()), fi2.p) || !ya5Var.isVisible()) {
            return Boolean.FALSE;
        }
        Boolean bool = Boolean.TRUE;
        ob3Var.setValue(bool);
        return bool;
    }
}
