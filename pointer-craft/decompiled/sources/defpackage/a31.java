package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a31 implements pf4 {
    public final /* synthetic */ b31 g;

    public a31(b31 b31Var) {
        this.g = b31Var;
    }

    @Override // defpackage.pf4
    public final float g(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        b31 b31Var = this.g;
        float fFloatValue = ((Number) b31Var.g.a(Float.valueOf(f))).floatValue();
        b31Var.v.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        b31Var.x.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
