package defpackage;

import android.view.InputDevice;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bh6 {
    public static ha2 g;
    public static ha2 y;

    public static final ha2 g() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.HelpOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(11.0f, 18.0f);
        kq3Var.v(2.0f);
        kq3Var.w(-2.0f);
        kq3Var.v(-2.0f);
        kq3Var.w(2.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 2.0f);
        kq3Var.y(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        kq3Var.m(4.48f, 10.0f, 10.0f, 10.0f);
        kq3Var.m(10.0f, -4.48f, 10.0f, -10.0f);
        kq3Var.a(17.52f, 2.0f, 12.0f, 2.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 20.0f);
        kq3Var.r(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        kq3Var.m(3.59f, -8.0f, 8.0f, -8.0f);
        kq3Var.m(8.0f, 3.59f, 8.0f, 8.0f);
        kq3Var.m(-3.59f, 8.0f, -8.0f, 8.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 6.0f);
        kq3Var.r(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        kq3Var.v(2.0f);
        kq3Var.r(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        kq3Var.m(2.0f, 0.9f, 2.0f, 2.0f);
        kq3Var.r(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        kq3Var.v(2.0f);
        kq3Var.r(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        kq3Var.r(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final int r(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            l0.u("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                        if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static final MotionEvent y(ld1 ld1Var) {
        return (MotionEvent) ld1Var.n;
    }
}
