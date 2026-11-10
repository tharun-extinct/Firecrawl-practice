package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa4 extends og0 {
    @Override // defpackage.og0
    public final void d(qn4 qn4Var, float f, float f2) {
        float f3 = f2 * f;
        qn4Var.n(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        mn4 mn4Var = new mn4(0.0f, 0.0f, f4, f4);
        mn4Var.x = 180.0f;
        mn4Var.l = 90.0f;
        qn4Var.x.add(mn4Var);
        kn4 kn4Var = new kn4(mn4Var);
        qn4Var.g(180.0f);
        qn4Var.l.add(kn4Var);
        qn4Var.n = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        qn4Var.y = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        qn4Var.r = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
