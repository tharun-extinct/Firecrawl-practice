package defpackage;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class u9 extends i73 implements h60, ej4, oi2, lm2, hd5 {
    public final /* synthetic */ ba f;
    public final z6 o = new z6(this, 1);

    public u9(ba baVar) {
        this.f = baVar;
    }

    @Override // defpackage.oi2
    public final boolean Z(KeyEvent keyEvent) {
        bt1 bt1Var;
        int[] iArr = it1.g;
        long jR = mx5.r(keyEvent);
        int i = fi2.Q;
        byte b = 4;
        if (fi2.g(jR, dt5.q())) {
            bt1Var = new bt1(2);
        } else if (fi2.g(jR, dt5.m())) {
            bt1Var = new bt1(1);
        } else if (fi2.g(jR, dt5.s())) {
            bt1Var = new bt1(mx5.x(keyEvent) ? 2 : 1);
        } else if (fi2.g(jR, dt5.l())) {
            bt1Var = new bt1(4);
        } else if (fi2.g(jR, dt5.x())) {
            bt1Var = new bt1(3);
        } else if (fi2.g(jR, dt5.j()) || fi2.g(jR, dt5.i())) {
            bt1Var = new bt1(5);
        } else if (fi2.g(jR, dt5.v()) || fi2.g(jR, dt5.c())) {
            bt1Var = new bt1(6);
        } else if (fi2.g(jR, dt5.n()) || fi2.g(jR, dt5.t()) || fi2.g(jR, dt5.w())) {
            bt1Var = new bt1(7);
        } else {
            bt1Var = (fi2.g(jR, dt5.r()) || fi2.g(jR, dt5.a())) ? new bt1(8) : null;
        }
        if (bt1Var != null) {
            int i2 = bt1Var.g;
            if (lx5.y(mx5.n(keyEvent), 2)) {
                ba baVar = this.f;
                cu1 cu1VarX = ((nt1) baVar.getFocusOwner()).x();
                if (cu1VarX != null && cu1VarX.o && baVar.A(i2)) {
                    baVar.getPlayNavigationSoundEffect$ui().l(bt1Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolV = ((nt1) baVar.getFocusOwner()).v(i2, baVar.getEmbeddedViewFocusRect(), new h(bt1Var, b));
                if (boolV == null) {
                    return true;
                }
                if (boolV.booleanValue()) {
                    baVar.getPlayNavigationSoundEffect$ui().l(bt1Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (yf6.w(i2)) {
                    Integer numR = it1.r(i2);
                    int iIntValue = numR != null ? numR.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = baVar.getRootView();
                    rootView.getClass();
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, baVar.getView(), iIntValue);
                    if (viewFindNextFocus == null || viewFindNextFocus.equals(baVar)) {
                        return ((nt1) baVar.getFocusOwner()).j(i2);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.oi2
    public final boolean q(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.hd5
    public final Object s() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(j);
        return v33Var.U(us3VarV.j, us3VarV.t, qi1.j, this.o, new t9(us3VarV, (byte) 0));
    }

    @Override // defpackage.h60
    public final Object w0(gh3 gh3Var, p2 p2Var, ou0 ou0Var) {
        long jN = gh3Var.N(0L);
        k44 k44Var = (k44) p2Var.g();
        k44 k44VarT = k44Var != null ? k44Var.t(jN) : null;
        if (k44VarT != null) {
            this.f.requestRectangleOnScreen(oe6.r(k44VarT), false);
        }
        return og5.g;
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
    }
}
