package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m8 {
    public Object g;
    public final /* synthetic */ q8 n;
    public float r = Float.NaN;
    public Object y;

    public m8(q8 q8Var) {
        this.n = q8Var;
    }

    public final void g(float f, float f2) {
        q8 q8Var = this.n;
        tp3 tp3Var = q8Var.l;
        pp3 pp3Var = q8Var.a;
        float fD = pp3Var.d();
        pp3Var.e(f);
        q8Var.m.e(f2);
        if (Float.isNaN(fD)) {
            return;
        }
        boolean z = f >= fD;
        if (pp3Var.d() == q8Var.y().r(tp3Var.getValue())) {
            Object objY = q8Var.y().y(pp3Var.d() + (z ? 1.0f : -1.0f), z);
            if (objY == null) {
                objY = tp3Var.getValue();
            }
            if (z) {
                this.g = tp3Var.getValue();
                this.y = objY;
            } else {
                this.g = objY;
                this.y = tp3Var.getValue();
            }
        } else {
            Object objY2 = q8Var.y().y(pp3Var.d(), false);
            if (objY2 == null) {
                objY2 = tp3Var.getValue();
            }
            Object objY3 = q8Var.y().y(pp3Var.d(), true);
            if (objY3 == null) {
                objY3 = tp3Var.getValue();
            }
            this.g = objY2;
            this.y = objY3;
        }
        l11 l11VarY = q8Var.y();
        Object obj = this.g;
        obj.getClass();
        float fR = l11VarY.r(obj);
        l11 l11VarY2 = q8Var.y();
        Object obj2 = this.y;
        obj2.getClass();
        this.r = Math.abs(fR - l11VarY2.r(obj2));
        if (Math.abs(pp3Var.d() - q8Var.y().r(tp3Var.getValue())) >= this.r / 2.0f) {
            Object value = z ? this.y : this.g;
            if (value == null) {
                value = tp3Var.getValue();
            }
            if (((Boolean) q8Var.g.a(value)).booleanValue()) {
                tp3Var.setValue(value);
            }
        }
    }
}
