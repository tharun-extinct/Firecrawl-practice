package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nv0 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ byte t;

    public /* synthetic */ nv0(sv0 sv0Var, byte b) {
        this.j = (byte) 0;
        this.a = sv0Var;
        this.t = b;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = this.t;
        Object obj3 = this.a;
        byte b3 = 1;
        switch (b) {
            case 0:
                sv0 sv0Var = (sv0) obj3;
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                view.getClass();
                motionEvent.getClass();
                int action = motionEvent.getAction();
                mu0 mu0Var = null;
                if (action == 0) {
                    m50.T(sv0Var.g, null, new rv0(sv0Var, b2, mu0Var, (byte) 0), 3);
                    ql4 ql4Var = sv0Var.n;
                    if (ql4Var != null && ql4Var.d) {
                        view.performHapticFeedback(1, 2);
                    }
                } else if (action == 1 || action == 3) {
                    m50.T(sv0Var.g, null, new rv0(sv0Var, b2, mu0Var, b3), 3);
                }
                return Boolean.FALSE;
            case 1:
                ((Integer) obj2).getClass();
                gp4.m((String) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            case 2:
                ((Integer) obj2).getClass();
                yf6.y((gm3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            case 3:
                ((Integer) obj2).getClass();
                yf6.t((km3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            case 4:
                ((Integer) obj2).getClass();
                yf6.a((lm3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            case 5:
                ((Integer) obj2).getClass();
                yf6.l((nm3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            case 6:
                ((Integer) obj2).getClass();
                yf6.r((hm3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
            default:
                ((Integer) obj2).getClass();
                yf6.j((jm3) obj3, (h02) obj, aq2.J(b2 | 1));
                return og5Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nv0(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }
}
