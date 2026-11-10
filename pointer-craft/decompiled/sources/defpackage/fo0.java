package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fo0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ fo0(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((iv4) obj).x(null);
                break;
            default:
                b65 b65Var = (b65) obj;
                if (b65Var != null) {
                    mt2 mt2Var = b65Var.n;
                    if (mt2Var != null) {
                        mt2Var.v(u75.y);
                    }
                    mt2 mt2Var2 = b65Var.n;
                    if (mt2Var2 != null) {
                        mt2Var2.x(u75.y);
                    }
                }
                break;
        }
    }
}
