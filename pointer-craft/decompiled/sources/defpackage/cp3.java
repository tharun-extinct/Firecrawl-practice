package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cp3 {
    public cd g;
    public m30 y;
    public float r = 1.0f;
    public fl2 n = fl2.j;

    public abstract void g(float f);

    public abstract long n();

    public final void r(wm2 wm2Var, long j, float f, m30 m30Var) {
        pb0 pb0Var = wm2Var.j;
        if (this.r != f) {
            g(f);
            this.r = f;
        }
        if (!yf2.p(this.y, m30Var)) {
            y(m30Var);
            this.y = m30Var;
        }
        fl2 layoutDirection = wm2Var.getLayoutDirection();
        if (this.n != layoutDirection) {
            this.n = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pb0Var.n() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pb0Var.n() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((y22) pb0Var.t.t).z(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    v(wm2Var);
                }
            } finally {
                ((y22) pb0Var.t.t).z(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract void v(wm2 wm2Var);

    public abstract void y(m30 m30Var);
}
