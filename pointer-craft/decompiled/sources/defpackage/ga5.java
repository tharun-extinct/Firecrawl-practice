package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ga5 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Toolbar t;

    public /* synthetic */ ga5(Toolbar toolbar, byte b) {
        this.j = b;
        this.t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Toolbar toolbar = this.t;
        switch (b) {
            case 0:
                ia5 ia5Var = toolbar.S;
                n43 n43Var = ia5Var == null ? null : ia5Var.t;
                if (n43Var != null) {
                    n43Var.collapseActionView();
                }
                break;
            default:
                toolbar.w();
                break;
        }
    }
}
