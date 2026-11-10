package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru0 implements bz1 {
    public final /* synthetic */ av0 j;
    public final /* synthetic */ byte t;

    public /* synthetic */ ru0(av0 av0Var, byte b) {
        this.j = av0Var;
        this.t = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        View view = (View) obj;
        MotionEvent motionEvent = (MotionEvent) obj2;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        boolean z = false;
        Object[] objArr = 0;
        av0 av0Var = this.j;
        byte b = this.t;
        mu0 mu0Var = null;
        byte b2 = 1;
        if (action != 0) {
            if (action == 1 || action == 3) {
                m50.T(mq2.a(av0Var), null, new vu0(av0Var, b, mu0Var, b2), 3);
            }
            return Boolean.valueOf(z);
        }
        m50.T(mq2.a(av0Var), null, new vu0(av0Var, b, mu0Var, objArr == true ? 1 : 0), 3);
        av0Var.Z(view);
        z = true;
        return Boolean.valueOf(z);
    }
}
