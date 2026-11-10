package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class uu0 extends g90 {
    public final /* synthetic */ av0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(av0 av0Var) {
        super((byte) 0);
        this.y = av0Var;
    }

    @Override // defpackage.g90
    public final void b(int i) {
        aq2 vp5Var;
        InputMethodManager inputMethodManager;
        Integer numValueOf = Integer.valueOf(R.string.message_premium_required);
        av0 av0Var = this.y;
        if (i == 0) {
            if (!av0Var.X()) {
                av0Var.S().l(numValueOf, "speech_input");
                return;
            }
            try {
                av0Var.x0.g("free_form");
                return;
            } catch (ActivityNotFoundException unused) {
                Context contextM = av0Var.m();
                if (contextM != null) {
                    bi6.f(contextM, R.string.speech_input_not_supported, false);
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            if (i == 4 && (inputMethodManager = (InputMethodManager) av0Var.N().getSystemService(InputMethodManager.class)) != null) {
                inputMethodManager.toggleSoftInput(1, 0);
                return;
            }
            return;
        }
        if (!av0Var.X()) {
            av0Var.S().l(numValueOf, "fullscreen");
            return;
        }
        yk ykVarM = av0Var.M();
        if (!kq2.L(ykVarM)) {
            kq2.U(ykVarM);
            return;
        }
        Window window = ykVarM.getWindow();
        jy3 jy3Var = new jy3(ykVarM.getWindow().getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            vp5Var = new xp5(window, jy3Var);
        } else if (i2 >= 30) {
            vp5Var = new wp5(window, jy3Var);
        } else {
            vp5Var = i2 >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        }
        vp5Var.G(1);
        vp5Var.H(519);
    }

    @Override // defpackage.g90
    public final void c(String str) {
        qr0.b(this.y.T(), str);
    }

    @Override // defpackage.g90
    public final void m(int i, boolean z) {
        this.y.T().q(0, i, z);
    }

    @Override // defpackage.g90
    public final void q(int i, boolean z) {
        this.y.T().w(0, i, z);
    }

    @Override // defpackage.g90
    public final void w(int i, boolean z) {
        this.y.T().c(i, z);
    }
}
