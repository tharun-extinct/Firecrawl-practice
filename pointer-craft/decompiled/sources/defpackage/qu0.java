package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu0 implements View.OnTouchListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 t;

    public /* synthetic */ qu0(bz1 bz1Var, byte b) {
        this.j = b;
        this.t = bz1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.j;
        bz1 bz1Var = this.t;
        switch (b) {
            case 0:
                return ((Boolean) ((f) bz1Var).l(view, motionEvent)).booleanValue();
            default:
                return ((Boolean) bz1Var.l(view, motionEvent)).booleanValue();
        }
    }
}
