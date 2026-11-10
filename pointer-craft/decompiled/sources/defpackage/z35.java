package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z35 implements w35 {
    public final long j;
    public final /* synthetic */ a45 t;

    public z35(a45 a45Var, long j) {
        this.t = a45Var;
        this.j = j;
    }

    @Override // defpackage.w35
    public final k44 c(bl2 bl2Var) {
        return kq2.r(j(bl2Var), 0L);
    }

    @Override // defpackage.w35
    public final long j(bl2 bl2Var) {
        bl2 bl2Var2 = (bl2) this.t.d.getValue();
        if (bl2Var2 != null) {
            if (bl2Var2.W()) {
                return bl2Var.h(bl2Var2.g(this.j));
            }
            return 0L;
        }
        pc2.n("Tried to open context menu before the anchor was placed.");
        up.q();
        return 0L;
    }

    @Override // defpackage.w35
    public final v35 z0() {
        return jh6.y(this.t);
    }
}
