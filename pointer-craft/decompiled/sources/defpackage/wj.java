package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wj implements OnBackInvokedCallback {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ wj(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    public final void onBackInvoked() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                my1 my1Var = (my1) obj;
                if (my1Var != null) {
                    my1Var.g();
                }
                break;
            case 1:
                ((tl) obj).B();
                break;
            default:
                ((ga5) obj).run();
                break;
        }
    }
}
