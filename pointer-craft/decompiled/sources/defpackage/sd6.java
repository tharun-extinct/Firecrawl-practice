package defpackage;

import android.view.MotionEvent;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sd6 {
    public static final byte[] g = {48, 49, 53, 0};
    public static final byte[] y = {48, 49, 48, 0};
    public static final byte[] r = {48, 48, 57, 0};
    public static final byte[] n = {48, 48, 53, 0};
    public static final byte[] v = {48, 48, 49, 0};
    public static final byte[] x = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 50, 0};

    public static final void g(long j, xu3 xu3Var) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        xu3Var.a(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void n(ju3 ju3Var, long j, xy1 xy1Var, boolean z) {
        MotionEvent motionEventG = ju3Var.g();
        if (motionEventG == null) {
            l0.u("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventG.getAction();
        if (z) {
            motionEventG.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventG.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        xy1Var.a(motionEventG);
        motionEventG.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventG.setAction(action);
    }

    public static final void r(ju3 ju3Var, long j, kn2 kn2Var) {
        n(ju3Var, j, kn2Var, false);
    }

    public static final void v(j83 j83Var, boolean z, Set set) {
        j83Var.g.setVisibility((!z || set.isEmpty()) ? 8 : 0);
        j83Var.y.setVisibility(set.contains("left") ? 0 : 8);
        j83Var.r.setVisibility(set.contains("middle") ? 0 : 8);
        j83Var.n.setVisibility(set.contains("right") ? 0 : 8);
    }

    public static final void y(ju3 ju3Var, long j, xu3 xu3Var) {
        n(ju3Var, j, xu3Var, true);
    }
}
