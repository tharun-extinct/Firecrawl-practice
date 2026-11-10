package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z64 implements du2 {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ bz1 c;
    public final /* synthetic */ vt2 j;
    public final /* synthetic */ vt2 m;
    public final /* synthetic */ ib0 q;
    public final /* synthetic */ u54 t;
    public final /* synthetic */ ec3 w;

    public z64(vt2 vt2Var, u54 u54Var, ox0 ox0Var, vt2 vt2Var2, ib0 ib0Var, ec3 ec3Var, bz1 bz1Var) {
        this.j = vt2Var;
        this.t = u54Var;
        this.a = ox0Var;
        this.m = vt2Var2;
        this.q = ib0Var;
        this.w = ec3Var;
        this.c = bz1Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        vt2 vt2Var2 = this.j;
        u54 u54Var = this.t;
        if (vt2Var == vt2Var2) {
            u54Var.j = m50.T(this.a, null, new fg0(this.w, this.c, null, (byte) 5), 3);
            return;
        }
        if (vt2Var == this.m) {
            dh2 dh2Var = (dh2) u54Var.j;
            if (dh2Var != null) {
                dh2Var.x(null);
            }
            u54Var.j = null;
        }
        if (vt2Var == vt2.ON_DESTROY) {
            this.q.j(og5.g);
        }
    }
}
