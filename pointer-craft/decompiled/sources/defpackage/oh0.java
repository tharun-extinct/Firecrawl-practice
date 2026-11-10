package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oh0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte g;
    public final /* synthetic */ kj1 y;

    public /* synthetic */ oh0(kj1 kj1Var, byte b) {
        this.g = b;
        this.y = kj1Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.g;
        kj1 kj1Var = this.y;
        switch (b) {
            case 0:
                rh0 rh0Var = (rh0) kj1Var;
                rh0Var.z(rh0Var.h());
                break;
            default:
                jf1 jf1Var = (jf1) kj1Var;
                jf1Var.q = z;
                jf1Var.s();
                if (!z) {
                    jf1Var.z(false);
                    jf1Var.w = false;
                }
                break;
        }
    }
}
