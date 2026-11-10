package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xu3 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ yu3 t;

    public /* synthetic */ xu3(yu3 yu3Var, byte b) {
        this.j = b;
        this.t = yu3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        yu3 yu3Var = this.t;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (b) {
            case 0:
                wf wfVar = yu3Var.g;
                if (wfVar != null) {
                    wfVar.a(motionEvent);
                    return og5Var;
                }
                yf2.Y("onTouchEvent");
                throw null;
            default:
                wf wfVar2 = yu3Var.g;
                if (wfVar2 != null) {
                    wfVar2.a(motionEvent);
                    return og5Var;
                }
                yf2.Y("onTouchEvent");
                throw null;
        }
    }
}
