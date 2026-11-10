package defpackage;

import android.content.Context;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends z43 {
    public final /* synthetic */ z3 c;
    public final /* synthetic */ byte w = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z3 z3Var, Context context, ly4 ly4Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, ly4Var, context, view, false);
        this.c = z3Var;
        if ((ly4Var.A.k & 32) != 32) {
            View view2 = z3Var.c;
            this.x = view2 == null ? (View) z3Var.w : view2;
        }
        fa4 fa4Var = z3Var.B;
        this.t = fa4Var;
        x43 x43Var = this.a;
        if (x43Var != null) {
            x43Var.v(fa4Var);
        }
    }

    @Override // defpackage.z43
    public final void r() {
        byte b = this.w;
        z3 z3Var = this.c;
        switch (b) {
            case 0:
                z3Var.d = null;
                super.r();
                break;
            default:
                i43 i43Var = z3Var.a;
                if (i43Var != null) {
                    i43Var.n(true);
                }
                z3Var.k = null;
                super.r();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z3 z3Var, Context context, i43 i43Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, i43Var, context, view, true);
        this.c = z3Var;
        this.l = 8388613;
        fa4 fa4Var = z3Var.B;
        this.t = fa4Var;
        x43 x43Var = this.a;
        if (x43Var != null) {
            x43Var.v(fa4Var);
        }
    }
}
