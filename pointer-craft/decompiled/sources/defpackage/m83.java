package defpackage;

import android.view.MotionEvent;
import android.view.View;
import io.appground.blek.utils.PointerPathView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m83 implements View.OnCapturedPointerListener {
    public final /* synthetic */ o83 g;

    public /* synthetic */ m83(o83 o83Var) {
        this.g = o83Var;
    }

    @Override // android.view.View.OnCapturedPointerListener
    public final boolean onCapturedPointer(View view, MotionEvent motionEvent) {
        Byte bG;
        o83 o83Var = this.g;
        view.getClass();
        motionEvent.getClass();
        j jVar = o83Var.B;
        j jVar2 = o83Var.C;
        n83 n83Var = o83Var.j;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            jVar.r(x);
            jVar2.r(y);
            ((PointerPathView) view).v(x, y, true);
            return true;
        }
        if (action == 2) {
            if (eb6.n(motionEvent.getSource(), 131076)) {
                n83Var.p((int) motionEvent.getAxisValue(0), (int) motionEvent.getAxisValue(1));
            } else {
                n83Var.p(jVar2.y(y, o83Var.w), -jVar.y(x, o83Var.w));
            }
            ((PointerPathView) view).v(x, y, false);
            return true;
        }
        if (action == 8) {
            n83Var.c((int) motionEvent.getAxisValue(9), -((int) motionEvent.getAxisValue(10)));
            return true;
        }
        if (action == 11) {
            Byte bG2 = o83.g(motionEvent);
            if (bG2 != null) {
                n83Var.k(bG2.byteValue(), true);
            }
        } else if (action == 12 && (bG = o83.g(motionEvent)) != null) {
            byte bByteValue = bG.byteValue();
            if (bByteValue == 8 || bByteValue == 2) {
                n83Var.r();
            }
            n83Var.k(bByteValue, false);
            return true;
        }
        return true;
    }
}
