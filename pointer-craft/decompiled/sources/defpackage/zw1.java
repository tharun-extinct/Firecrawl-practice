package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class zw1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object t;

    public zw1(ax1 ax1Var, tx1 tx1Var) {
        this.a = ax1Var;
        this.t = tx1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.j;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                tx1 tx1Var = (tx1) obj2;
                pw1 pw1Var = tx1Var.r;
                tx1Var.m();
                r31.t((ViewGroup) pw1Var.O.getParent(), ((ax1) obj).j).j();
                break;
            default:
                ((ViewGroup) obj2).addView((s05) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.j) {
            case 0:
                break;
            default:
                ((ViewGroup) this.t).addView((s05) this.a, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public zw1(ViewGroup viewGroup, s05 s05Var) {
        this.t = viewGroup;
        this.a = s05Var;
    }

    private final void g(View view) {
    }
}
