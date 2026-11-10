package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class o43 implements ActionProvider.VisibilityListener {
    public v92 g;
    public final ActionProvider y;

    public o43(r43 r43Var, ActionProvider actionProvider) {
        this.y = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        v92 v92Var = this.g;
        if (v92Var != null) {
            i43 i43Var = ((n43) v92Var.t).c;
            i43Var.j = true;
            i43Var.s(true);
        }
    }
}
