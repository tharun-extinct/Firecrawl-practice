package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iu2 {
    public wt2 g;
    public du2 y;

    public final void g(gu2 gu2Var, vt2 vt2Var) {
        wt2 wt2VarG = vt2Var.g();
        wt2 wt2Var = this.g;
        if (wt2VarG.compareTo(wt2Var) < 0) {
            wt2Var = wt2VarG;
        }
        this.g = wt2Var;
        this.y.b(gu2Var, vt2Var);
        this.g = wt2VarG;
    }
}
