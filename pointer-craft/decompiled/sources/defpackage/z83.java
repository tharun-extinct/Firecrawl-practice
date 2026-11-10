package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z83 implements lb4 {
    @Override // defpackage.lb4
    public final j73 g(j73 j73Var, float f, boolean z) {
        if (f <= 0.0d) {
            kc2.g("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return j73Var.n(new tp2(f, true));
    }
}
