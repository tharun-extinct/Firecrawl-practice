package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lw1 extends ue5 {
    public final /* synthetic */ pw1 f;

    public lw1(pw1 pw1Var) {
        this.f = pw1Var;
    }

    @Override // defpackage.ue5
    public final View a0(int i) {
        pw1 pw1Var = this.f;
        View view = pw1Var.O;
        if (view != null) {
            return view.findViewById(i);
        }
        l0.z(du4.c("Fragment ", pw1Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.ue5
    public final boolean b0() {
        return this.f.O != null;
    }
}
