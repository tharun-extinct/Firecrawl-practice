package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx4 implements s60 {
    public final boolean n;
    public final fl2 r;
    public final s60 v;
    public final my1 y;

    public hx4(my1 my1Var, fl2 fl2Var, boolean z, s60 s60Var) {
        this.y = my1Var;
        this.r = fl2Var;
        this.n = z;
        this.v = s60Var;
    }

    @Override // defpackage.s60
    public final float g(float f, float f2, float f3) {
        float fIntValue = ((Number) this.y.g()).intValue();
        boolean z = this.r == fl2.t;
        if (this.n || !z) {
            f -= fIntValue;
        }
        return this.v.g(f, f2, f3 - fIntValue);
    }
}
