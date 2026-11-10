package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pi4 {
    public static final up g = bi6.b;

    public static final boolean g(ju3 ju3Var) {
        MotionEvent motionEventG;
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((qu3) list.get(i)).t != 2) {
                MotionEvent motionEventG2 = ju3Var.g();
                if ((motionEventG2 == null || !motionEventG2.isFromSource(8194)) && ((motionEventG = ju3Var.g()) == null || !motionEventG.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
