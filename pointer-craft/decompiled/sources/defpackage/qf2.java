package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qf2 extends uf2 {
    public boolean f;
    public tf2 o;

    @Override // defpackage.uf2, defpackage.lm2
    public final int D(zy2 zy2Var, p33 p33Var, int i) {
        return this.o == tf2.j ? p33Var.Z(i) : p33Var.x(i);
    }

    @Override // defpackage.uf2
    public final long Q0(p33 p33Var, long j) {
        int iZ = this.o == tf2.j ? p33Var.Z(ws0.t(j)) : p33Var.x(ws0.t(j));
        if (iZ < 0) {
            iZ = 0;
        }
        if (iZ < 0) {
            oc2.g("height must be >= 0");
        }
        return zs0.j(0, Integer.MAX_VALUE, iZ, iZ);
    }

    @Override // defpackage.uf2
    public final boolean R0() {
        return this.f;
    }

    @Override // defpackage.uf2, defpackage.lm2
    public final int i(zy2 zy2Var, p33 p33Var, int i) {
        return this.o == tf2.j ? p33Var.Z(i) : p33Var.x(i);
    }
}
