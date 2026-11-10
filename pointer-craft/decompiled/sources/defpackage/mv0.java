package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mv0 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ sv0 t;

    public /* synthetic */ mv0(sv0 sv0Var, byte b) {
        this.j = b;
        this.t = sv0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                sv0 sv0Var = this.t;
                ox0 ox0Var = sv0Var.g;
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                view.getClass();
                motionEvent.getClass();
                Object tag = view.getTag();
                tag.getClass();
                r04 r04Var = (r04) tag;
                int action = motionEvent.getAction();
                mu0 mu0Var = null;
                boolean z = true;
                if (action == 0) {
                    m50.T(ox0Var, null, new yx((Object) sv0Var, (Object) r04Var, z, mu0Var, (byte) 2), 3);
                    ql4 ql4Var = sv0Var.n;
                    if (ql4Var != null && ql4Var.d) {
                        view.performHapticFeedback(1, 2);
                    }
                } else if (action == 1 || action == 3) {
                    m50.T(ox0Var, null, new yx((Object) sv0Var, (Object) r04Var, false, mu0Var, (byte) 2), 3);
                }
                return Boolean.FALSE;
            default:
                View view2 = (View) obj;
                MotionEvent motionEvent2 = (MotionEvent) obj2;
                view2.getClass();
                motionEvent2.getClass();
                int action2 = motionEvent2.getAction();
                sv0 sv0Var2 = this.t;
                boolean z2 = true;
                if (action2 == 0) {
                    view2.setActivated(!view2.isActivated());
                    sv0Var2.r.a(Boolean.valueOf(view2.isActivated()));
                } else if (action2 != 1 && action2 != 3) {
                    z2 = false;
                } else if (motionEvent2.getEventTime() - motionEvent2.getDownTime() > 200) {
                    sv0Var2.r.a(Boolean.FALSE);
                    view2.setActivated(false);
                }
                return Boolean.valueOf(z2);
        }
    }
}
