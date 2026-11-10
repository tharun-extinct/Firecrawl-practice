package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class e91 extends ue5 {
    public final /* synthetic */ lw1 f;
    public final /* synthetic */ f91 k;

    public e91(f91 f91Var, lw1 lw1Var) {
        this.k = f91Var;
        this.f = lw1Var;
    }

    @Override // defpackage.ue5
    public final View a0(int i) {
        lw1 lw1Var = this.f;
        if (lw1Var.b0()) {
            return lw1Var.a0(i);
        }
        Dialog dialog = this.k.s0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ue5
    public final boolean b0() {
        return this.f.b0() || this.k.w0;
    }
}
