package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class u3 extends dw1 {
    public final /* synthetic */ View p;
    public final /* synthetic */ byte s = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.dw1
    public boolean n() {
        switch (this.s) {
            case 1:
                z3 z3Var = ((y3) this.p).m;
                if (z3Var.e != null) {
                    return false;
                }
                z3Var.r();
                return true;
            default:
                return super.n();
        }
    }

    @Override // defpackage.dw1
    public final boolean r() {
        mp4 mp4VarY;
        byte b = this.s;
        View view = this.p;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                h43 h43Var = actionMenuItemView.u;
                return h43Var != null && h43Var.g(actionMenuItemView.b) && (mp4VarY = y()) != null && mp4VarY.g();
            default:
                ((y3) view).m.q();
                return true;
        }
    }

    @Override // defpackage.dw1
    public final mp4 y() {
        w3 w3Var;
        byte b = this.s;
        View view = this.p;
        switch (b) {
            case 0:
                v3 v3Var = ((ActionMenuItemView) view).h;
                if (v3Var == null || (w3Var = ((x3) v3Var).g.d) == null) {
                    return null;
                }
                return w3Var.g();
            default:
                w3 w3Var2 = ((y3) view).m.k;
                if (w3Var2 == null) {
                    return null;
                }
                return w3Var2.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(y3 y3Var, y3 y3Var2) {
        super(y3Var2);
        this.p = y3Var;
    }
}
