package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xm2 {
    public static final m51 g = y94.j();

    public static final pn3 g(um2 um2Var) {
        pn3 pn3Var = um2Var.h;
        if (pn3Var != null) {
            return pn3Var;
        }
        mc2.r("LayoutNode should be attached to an owner");
        l0.x();
        return null;
    }
}
