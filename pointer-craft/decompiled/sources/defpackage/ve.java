package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ve implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ cf t;

    public /* synthetic */ ve(cf cfVar, byte b) {
        this.j = b;
        this.t = cfVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        cf cfVar = this.t;
        switch (b) {
            case 0:
                my1 my1Var = (my1) obj;
                View view = cfVar.g;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    my1Var.g();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new xe(my1Var, (byte) 0));
                    }
                }
                return og5Var;
            case 1:
                ActionMode actionMode = cfVar.j;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return og5Var;
            case 2:
                ActionMode actionMode2 = cfVar.j;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return og5Var;
            default:
                cfVar.v.v();
                return new kb(cfVar, (byte) 2);
        }
    }
}
