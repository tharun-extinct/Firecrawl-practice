package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da5 implements jw {
    public final /* synthetic */ a41 g;
    public final /* synthetic */ ea5 y;

    public da5(ea5 ea5Var, a41 a41Var, d52 d52Var) {
        this.y = ea5Var;
        this.g = a41Var;
    }

    @Override // defpackage.jw
    public final void g(boolean z) {
        this.y.r = z;
        if (z) {
            this.g.g();
        } else if (this.y.g()) {
            this.g.y(this.y.v - System.currentTimeMillis());
        }
    }
}
