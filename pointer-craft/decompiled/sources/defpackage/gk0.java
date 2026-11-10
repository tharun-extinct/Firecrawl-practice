package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gk0 {
    public static final gk0 g = new gk0();

    public static j73 g(j73 j73Var, float f) {
        if (f <= 0.0d) {
            kc2.g("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return j73Var.n(new tp2(f, true));
    }
}
