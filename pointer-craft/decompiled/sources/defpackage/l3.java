package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public final class l3 implements View.OnClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ l3(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        byte b = this.j;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((d4) obj).g();
                break;
            case 1:
                b6 b6Var = (b6) obj;
                if (view == b6Var.l && (message = b6Var.t) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                b6Var.d.obtainMessage(1, b6Var.y).sendToTarget();
                break;
            case 2:
                u23 u23Var = (u23) obj;
                int i = u23Var.n0;
                if (i == 2) {
                    u23Var.U(1);
                } else if (i == 1) {
                    u23Var.U(2);
                }
                u23Var.V(u23Var.O);
                break;
            default:
                ia5 ia5Var = ((Toolbar) obj).S;
                n43 n43Var = ia5Var != null ? ia5Var.t : null;
                if (n43Var != null) {
                    n43Var.collapseActionView();
                }
                break;
        }
    }
}
