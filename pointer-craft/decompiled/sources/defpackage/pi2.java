package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class pi2 extends i73 implements oi2 {
    public xy1 f;
    public xy1 o;

    @Override // defpackage.oi2
    public final boolean Z(KeyEvent keyEvent) {
        xy1 xy1Var = this.o;
        if (xy1Var != null) {
            return ((Boolean) xy1Var.a(new ki2(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.oi2
    public final boolean q(KeyEvent keyEvent) {
        xy1 xy1Var = this.f;
        if (xy1Var != null) {
            return ((Boolean) xy1Var.a(new ki2(keyEvent))).booleanValue();
        }
        return false;
    }
}
