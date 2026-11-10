package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cm5 extends eb6 {
    public final /* synthetic */ dm5 n;
    public boolean y = false;
    public int r = 0;

    public cm5(dm5 dm5Var) {
        this.n = dm5Var;
    }

    @Override // defpackage.em5
    public final void g() {
        int i = this.r + 1;
        this.r = i;
        dm5 dm5Var = this.n;
        if (i == dm5Var.g.size()) {
            em5 em5Var = dm5Var.n;
            if (em5Var != null) {
                em5Var.g();
            }
            this.r = 0;
            this.y = false;
            dm5Var.v = false;
        }
    }

    @Override // defpackage.eb6, defpackage.em5
    public final void r() {
        if (this.y) {
            return;
        }
        this.y = true;
        em5 em5Var = this.n.n;
        if (em5Var != null) {
            em5Var.r();
        }
    }
}
