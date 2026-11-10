package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iv0 implements View.OnClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bv0 t;

    public /* synthetic */ iv0(bv0 bv0Var, byte b) {
        this.j = b;
        this.t = bv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.j;
        bv0 bv0Var = this.t;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    bv0Var.j.releasePointerCapture();
                }
                break;
            default:
                bv0Var.j.releasePointerCapture();
                break;
        }
    }
}
