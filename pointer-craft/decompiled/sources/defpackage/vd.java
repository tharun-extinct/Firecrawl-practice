package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vd implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ sv3 t;

    public /* synthetic */ vd(sv3 sv3Var, byte b) {
        this.j = b;
        this.t = sv3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        sv3 sv3Var = this.t;
        switch (b) {
            case 0:
                sv3Var.m20setPopupContentSizefhxjrPA((qe2) obj);
                sv3Var.p();
                break;
            case 1:
                bl2 bl2VarM = ((bl2) obj).m();
                bl2VarM.getClass();
                sv3Var.s(bl2VarM);
                break;
            default:
                my1 my1Var = (my1) obj;
                Handler handler = sv3Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = sv3Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new xe(my1Var, (byte) 2));
                    }
                } else {
                    my1Var.g();
                }
                break;
        }
        return og5Var;
    }
}
