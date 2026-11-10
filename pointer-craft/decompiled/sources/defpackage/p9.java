package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ba t;

    public /* synthetic */ p9(ba baVar, byte b) {
        this.j = b;
        this.t = baVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        ba baVar = this.t;
        switch (b) {
            case 0:
                my1 my1Var = (my1) obj;
                Handler handler = baVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    my1Var.g();
                } else {
                    Handler handler2 = baVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n9(my1Var, (byte) 0));
                    }
                }
                return og5Var;
            case 1:
                ((nt1) baVar.getFocusOwner()).l(((bt1) obj).g, false);
                return og5Var;
            case 2:
                return baVar.getSavedStateRegistry();
            case 3:
                return Boolean.valueOf(baVar.getScrollCaptureInProgress());
            case 4:
                return baVar.getInputModeManager();
            case 5:
                return baVar.getTextInputService();
            case 6:
                return baVar.getSoftwareKeyboardController();
            case 7:
                return baVar.getTextToolbar();
            default:
                return baVar.getPointerIconService();
        }
    }
}
