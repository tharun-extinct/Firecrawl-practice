package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv {
    public final kb5 g;
    public final tj3 y;

    public wv(kb5 kb5Var, tj3 tj3Var) {
        this.g = kb5Var;
        this.y = tj3Var;
        if ((kb5Var == null ? tj3Var : kb5Var) != null) {
            return;
        }
        l0.u("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void g(vv vvVar) {
        kb5 kb5Var = this.g;
        if (kb5Var != null) {
            kb5.t(kb5Var, (tv) vvVar.y);
            return;
        }
        tj3 tj3Var = this.y;
        if (tj3Var == null) {
            l0.z("Unreachable");
            return;
        }
        uv uvVar = (uv) vvVar.g;
        uvVar.getClass();
        nj3 nj3Var = new nj3(uvVar, new pj3(null, uvVar));
        uvVar.g.add(nj3Var);
        kb5.t(tj3Var.y().r, nj3Var);
    }

    public final void y(vv vvVar) throws Exception {
        if (this.g != null) {
            ((tv) vvVar.y).v();
        } else if (this.y != null) {
            ((uv) vvVar.g).v();
        } else {
            l0.z("Unreachable");
        }
    }
}
