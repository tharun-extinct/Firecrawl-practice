package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bz1;
import defpackage.d;
import defpackage.f;
import defpackage.h02;
import defpackage.kq2;
import defpackage.tp3;
import defpackage.u34;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends d {
    public static final /* synthetic */ int u = 0;
    public boolean p;
    public final tp3 s;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.s = kq2.M(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.d
    public final void g(int i, h02 h02Var) {
        h02Var.Z(420213850);
        int i2 = (h02Var.j(this) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            bz1 bz1Var = (bz1) this.s.getValue();
            if (bz1Var == null) {
                h02Var.X(-1238823553);
            } else {
                h02Var.X(98585282);
                bz1Var.l(h02Var, 0);
            }
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new f(this, i, (byte) 10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.d
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }

    public final void setContent(bz1 bz1Var) {
        this.p = true;
        this.s.setValue(bz1Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            n();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }
}
