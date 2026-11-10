package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eo3 implements s60 {
    public final fl2 n;
    public final s60 r;
    public final u21 y;

    public eo3(u21 u21Var, s60 s60Var, fl2 fl2Var) {
        this.y = u21Var;
        this.r = s60Var;
        this.n = fl2Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // defpackage.s60
    public final float g(float f, float f2, float f3) {
        int i;
        int i2;
        int i3;
        u21 u21Var = this.y;
        tp3 tp3Var = u21Var.D;
        float fG = this.r.g(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = ym5.g;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fG);
        fl2 fl2Var = fl2.t;
        um3 um3Var = um3.t;
        fl2 fl2Var2 = this.n;
        if (fAbs != 0.0f && z) {
            if (fl2Var2 == fl2Var && u21Var.q().v == um3Var) {
                i3 = u21Var.i() + (-u21Var.x);
            } else {
                i3 = u21Var.x;
            }
            float fI = i3 * (-1.0f);
            while (fG > 0.0f && fI < fG) {
                fI += u21Var.i();
            }
            while (fG < 0.0f && fI > fG) {
                fI -= u21Var.i();
            }
            return fI;
        }
        if (Math.abs(u21Var.x) < 1.0E-6d) {
            return 0.0f;
        }
        if (fl2Var2 == fl2Var && u21Var.q().v == um3Var) {
            i = u21Var.i() + (-u21Var.x);
        } else {
            i = u21Var.x;
        }
        float f5 = i * (-1.0f);
        if (fl2Var2 == fl2Var && u21Var.q().v == um3Var) {
            if (!((Boolean) tp3Var.getValue()).booleanValue()) {
                i2 = u21Var.i();
                f5 += i2;
            }
        } else if (((Boolean) tp3Var.getValue()).booleanValue()) {
            i2 = u21Var.i();
            f5 += i2;
        }
        return xs2.q(f5, -f3, f3);
    }
}
