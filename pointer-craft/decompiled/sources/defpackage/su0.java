package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su0 implements View.OnClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ su0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((bv0) obj).j.releasePointerCapture();
                break;
            default:
                gp gpVarS = ((av0) obj).S();
                int i = gp.l;
                gpVarS.l(null, "unlock_button");
                break;
        }
    }
}
