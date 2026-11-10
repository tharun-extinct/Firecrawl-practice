package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class na5 extends eb6 {
    public final /* synthetic */ oa5 n;
    public final /* synthetic */ byte r;
    public boolean y = false;

    /* JADX WARN: Multi-variable type inference failed */
    public na5(oa5 oa5Var, int i) {
        this.n = oa5Var;
        this.r = i;
    }

    @Override // defpackage.em5
    public final void g() {
        if (this.y) {
            return;
        }
        this.n.g.setVisibility(this.r);
    }

    @Override // defpackage.eb6, defpackage.em5
    public final void r() {
        this.n.g.setVisibility(0);
    }

    @Override // defpackage.eb6, defpackage.em5
    public final void y() {
        this.y = true;
    }
}
